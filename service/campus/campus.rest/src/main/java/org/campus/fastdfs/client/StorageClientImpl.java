package org.campus.fastdfs.client;

import java.io.File;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Map;

import org.campus.fastdfs.FastdfsClientConfig;
import org.campus.fastdfs.command.ActiveTestCmd;
import org.campus.fastdfs.command.CloseCmd;
import org.campus.fastdfs.command.Command;
import org.campus.fastdfs.command.DeleteCmd;
import org.campus.fastdfs.command.DownLoadCmd;
import org.campus.fastdfs.command.GetMetaDataCmd;
import org.campus.fastdfs.command.SetMetaDataCmd;
import org.campus.fastdfs.command.UploadCmd;
import org.campus.fastdfs.command.UploadSlaveCmd;
import org.campus.fastdfs.data.Result;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StorageClientImpl extends AbstractClient implements StorageClient {

	private static Logger logger = LoggerFactory.getLogger(StorageClientImpl.class);
    private Socket socket;
    private String host;
    private Integer port;
    private Integer connectTimeout = FastdfsClientConfig.DEFAULT_CONNECT_TIMEOUT * 1000;
    private Integer networkTimeout = FastdfsClientConfig.DEFAULT_NETWORK_TIMEOUT * 1000;

    private Socket getSocket() throws IOException {
        if (socket == null) {
            socket = new Socket();
            socket.setSoTimeout(networkTimeout);
            socket.connect(new InetSocketAddress(host, port), connectTimeout);
        }
        return socket;
    }

    public StorageClientImpl(String address) {
        super();
        String[] hostport = address.split(":");
        this.host = hostport[0];
        this.port = Integer.valueOf(hostport[1]);
    }

    public StorageClientImpl(String address, Integer connectTimeout, Integer networkTimeout) {
        this(address);
        this.connectTimeout = connectTimeout;
        this.networkTimeout = networkTimeout;
    }

    public void close() throws IOException {
        Socket socket = getSocket();
        Command<Boolean> command = new CloseCmd();
        command.exec(socket);
        socket.close();
        socket = null;
    }

    @Override
    public Result<String> uploadSlave(File file, String fileid, String slavePrefix, String ext, Map<String, String> meta) throws IOException {
        Socket socket = getSocket();
        UploadSlaveCmd uploadSlaveCmd = new UploadSlaveCmd(file,fileid,slavePrefix,ext);
        Result<String> result = uploadSlaveCmd.exec(socket);

        if (meta != null) {
            String[] tupple = super.splitFileId(fileid);
            if (tupple != null) {
                String group = tupple[0];
                String fileName = tupple[1];
                this.setMeta(group, fileName, meta);
            }
        }
        return result;
    }

    public Result<String> upload(File file, String fileName, byte storePathIndex) throws IOException {
        Socket socket = getSocket();
        UploadCmd uploadCmd = new UploadCmd(file, fileName, storePathIndex);
        return uploadCmd.exec(socket);
    }

    public Result<Boolean> delete(String group, String fileName) throws IOException {
        Socket socket = getSocket();
        DeleteCmd deleteCmd = new DeleteCmd(group, fileName);
        return deleteCmd.exec(socket);
    }

    @Override
    public Result<Boolean> setMeta(String group, String fileName,
                                   Map<String, String> meta) throws IOException {
        Socket socket = getSocket();
        SetMetaDataCmd setMetaDataCmd = new SetMetaDataCmd(group, fileName, meta);
        return setMetaDataCmd.exec(socket);
    }

    @Override
    public Result<Map<String, String>> getMeta(String group, String fileName)
            throws IOException {
        Socket socket = getSocket();
        GetMetaDataCmd getMetaDataCmd = new GetMetaDataCmd(group, fileName);
        return getMetaDataCmd.exec(socket);
    }


    @Override
	public Result<byte[]> donwLoad(String group, String fileName) throws IOException {
        Socket socket = getSocket();
        DownLoadCmd downloadCmd = new DownLoadCmd(group,fileName);
        return downloadCmd.exec(socket);
	}

	/**
     * check storage client socket is closed
     *
     * @return boolean
     */
    @Override
    public boolean isClosed() {

        if (this.socket == null) {
            return true;
        }

        if (this.socket.isClosed()){
            return true;
        }else {
            //根据fastdfs的Active_Test_Cmd测试连通性
            ActiveTestCmd atcmd = new ActiveTestCmd();
            try {
                Result<Boolean> result = atcmd.exec(getSocket());
                //True,表示连接正常
                if(result.getData()){
                    return false;
                }else {
                    return true;
                }
            } catch (IOException e) {
            	logger.error(e.getMessage(), e);
            }
            //有异常，直接丢掉这个连接，让连接池回收
            return true;
        }
    }

}
