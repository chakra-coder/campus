package org.campus.model;

import java.util.Date;

import org.campus.model.enums.IsReadType;

public class ReceiveMessage {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ts_app_receivemessage.UID
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    private String uid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ts_app_receivemessage.SendMessageUID
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    private String sendmessageuid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ts_app_receivemessage.ReceiveUserUID
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    private String receiveuseruid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ts_app_receivemessage.SendTime
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    private Date sendtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ts_app_receivemessage.IsRead
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    private IsReadType isread;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ts_app_receivemessage.ReadTime
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    private Date readtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ts_app_receivemessage.CreateBy
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    private String createby;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ts_app_receivemessage.CreateDate
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    private Date createdate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ts_app_receivemessage.UID
     *
     * @return the value of ts_app_receivemessage.UID
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public String getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ts_app_receivemessage.UID
     *
     * @param uid the value for ts_app_receivemessage.UID
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ts_app_receivemessage.SendMessageUID
     *
     * @return the value of ts_app_receivemessage.SendMessageUID
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public String getSendmessageuid() {
        return sendmessageuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ts_app_receivemessage.SendMessageUID
     *
     * @param sendmessageuid the value for ts_app_receivemessage.SendMessageUID
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public void setSendmessageuid(String sendmessageuid) {
        this.sendmessageuid = sendmessageuid == null ? null : sendmessageuid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ts_app_receivemessage.ReceiveUserUID
     *
     * @return the value of ts_app_receivemessage.ReceiveUserUID
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public String getReceiveuseruid() {
        return receiveuseruid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ts_app_receivemessage.ReceiveUserUID
     *
     * @param receiveuseruid the value for ts_app_receivemessage.ReceiveUserUID
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public void setReceiveuseruid(String receiveuseruid) {
        this.receiveuseruid = receiveuseruid == null ? null : receiveuseruid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ts_app_receivemessage.SendTime
     *
     * @return the value of ts_app_receivemessage.SendTime
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public Date getSendtime() {
        return sendtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ts_app_receivemessage.SendTime
     *
     * @param sendtime the value for ts_app_receivemessage.SendTime
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public void setSendtime(Date sendtime) {
        this.sendtime = sendtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ts_app_receivemessage.IsRead
     *
     * @return the value of ts_app_receivemessage.IsRead
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public IsReadType getIsread() {
        return isread;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ts_app_receivemessage.IsRead
     *
     * @param isread the value for ts_app_receivemessage.IsRead
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public void setIsread(IsReadType isread) {
        this.isread = isread;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ts_app_receivemessage.ReadTime
     *
     * @return the value of ts_app_receivemessage.ReadTime
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public Date getReadtime() {
        return readtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ts_app_receivemessage.ReadTime
     *
     * @param readtime the value for ts_app_receivemessage.ReadTime
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public void setReadtime(Date readtime) {
        this.readtime = readtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ts_app_receivemessage.CreateBy
     *
     * @return the value of ts_app_receivemessage.CreateBy
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public String getCreateby() {
        return createby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ts_app_receivemessage.CreateBy
     *
     * @param createby the value for ts_app_receivemessage.CreateBy
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public void setCreateby(String createby) {
        this.createby = createby == null ? null : createby.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ts_app_receivemessage.CreateDate
     *
     * @return the value of ts_app_receivemessage.CreateDate
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public Date getCreatedate() {
        return createdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ts_app_receivemessage.CreateDate
     *
     * @param createdate the value for ts_app_receivemessage.CreateDate
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
}