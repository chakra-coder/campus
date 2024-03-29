package org.campus.fastdfs.command;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.util.Arrays;

import org.campus.fastdfs.data.Result;

public class QueryDownloadCmd extends AbstractCmd<String> {

    @Override
    public Result<String> exec(Socket socket) throws IOException {
        request(socket.getOutputStream());
        Response response = response(socket.getInputStream());
        if(response.isSuccess()){
            byte[] data = response.getData();
            String ip = new String(data,FDFS_GROUP_NAME_MAX_LEN,FDFS_IPADDR_SIZE - 1).trim();
            int port = (int) buff2long(data, FDFS_GROUP_NAME_MAX_LEN + FDFS_IPADDR_SIZE - 1);
            Result<String> result = new Result<String>(response.getCode());
            result.setData(ip + ":" + String.valueOf(port));
            return result;
        }else{
            Result<String> result = new Result<String>(response.getCode());
            //TODO:根据不同的code给不同的Error Message
            result.setMessage("");
            return result;
        }
    }

    public QueryDownloadCmd(String group,String fileName) throws UnsupportedEncodingException {
        super();
        byte[] groupByte = group.getBytes(charset);
        int group_len = groupByte.length;
        if (group_len > FDFS_GROUP_NAME_MAX_LEN) {
            group_len = FDFS_GROUP_NAME_MAX_LEN;
        }
        byte[] fileNameByte = fileName.getBytes(charset);
        body1 = new byte[FDFS_GROUP_NAME_MAX_LEN + fileNameByte.length];
        Arrays.fill(body1, (byte) 0);
        System.arraycopy(groupByte, 0, body1, 0, group_len);
        System.arraycopy(fileNameByte, 0, body1, FDFS_GROUP_NAME_MAX_LEN, fileNameByte.length);
        this.requestCmd = TRACKER_PROTO_CMD_SERVICE_QUERY_FETCH_ONE;
        this.responseCmd = TRACKER_PROTO_CMD_RESP;
        this.responseSize = TRACKER_QUERY_STORAGE_FETCH_BODY_LEN;
    }
    
    

}
