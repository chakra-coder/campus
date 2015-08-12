package org.campus.model;

import java.util.Date;

public class FreshNews {
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column ts_app_freshnews.UID
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    private String uid;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column
     * ts_app_freshnews.NewsBrief
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    private String newsbrief;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column
     * ts_app_freshnews.NewsContent
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    private String newscontent;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column
     * ts_app_freshnews.Pictures
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    private String pictures;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column
     * ts_app_freshnews.AddUserUID
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    private String adduseruid;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column
     * ts_app_freshnews.IsAnonymous
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    private Integer isanonymous;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column
     * ts_app_freshnews.CommentNum
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    private Integer commentnum;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column
     * ts_app_freshnews.SupportNum
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    private Integer supportnum;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column
     * ts_app_freshnews.ComplainNum
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    private Integer complainnum;

    private Integer notsupportnum;

    private Integer transnum;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column
     * ts_app_freshnews.IsShield
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    private Integer isshield;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column
     * ts_app_freshnews.IsActive
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    private Integer isactive;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column
     * ts_app_freshnews.CreateBy
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    private String createby;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column
     * ts_app_freshnews.CreateDate
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    private Date createdate;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column
     * ts_app_freshnews.LastUpdateBy
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    private String lastupdateby;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column
     * ts_app_freshnews.LastUpdateDate
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    private Date lastupdatedate;

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column
     * ts_app_freshnews.UID
     *
     * @return the value of ts_app_freshnews.UID
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public String getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column
     * ts_app_freshnews.UID
     *
     * @param uid the value for ts_app_freshnews.UID
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column
     * ts_app_freshnews.NewsBrief
     *
     * @return the value of ts_app_freshnews.NewsBrief
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public String getNewsbrief() {
        return newsbrief;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column
     * ts_app_freshnews.NewsBrief
     *
     * @param newsbrief the value for ts_app_freshnews.NewsBrief
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public void setNewsbrief(String newsbrief) {
        this.newsbrief = newsbrief == null ? null : newsbrief.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column
     * ts_app_freshnews.NewsContent
     *
     * @return the value of ts_app_freshnews.NewsContent
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public String getNewscontent() {
        return newscontent;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column
     * ts_app_freshnews.NewsContent
     *
     * @param newscontent the value for ts_app_freshnews.NewsContent
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public void setNewscontent(String newscontent) {
        this.newscontent = newscontent == null ? null : newscontent.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column
     * ts_app_freshnews.Pictures
     *
     * @return the value of ts_app_freshnews.Pictures
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public String getPictures() {
        return pictures;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column
     * ts_app_freshnews.Pictures
     *
     * @param pictures the value for ts_app_freshnews.Pictures
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public void setPictures(String pictures) {
        this.pictures = pictures == null ? null : pictures.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column
     * ts_app_freshnews.AddUserUID
     *
     * @return the value of ts_app_freshnews.AddUserUID
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public String getAdduseruid() {
        return adduseruid;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column
     * ts_app_freshnews.AddUserUID
     *
     * @param adduseruid the value for ts_app_freshnews.AddUserUID
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public void setAdduseruid(String adduseruid) {
        this.adduseruid = adduseruid == null ? null : adduseruid.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column
     * ts_app_freshnews.IsAnonymous
     *
     * @return the value of ts_app_freshnews.IsAnonymous
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public Integer getIsanonymous() {
        return isanonymous;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column
     * ts_app_freshnews.IsAnonymous
     *
     * @param isanonymous the value for ts_app_freshnews.IsAnonymous
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public void setIsanonymous(Integer isanonymous) {
        this.isanonymous = isanonymous;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column
     * ts_app_freshnews.CommentNum
     *
     * @return the value of ts_app_freshnews.CommentNum
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public Integer getCommentnum() {
        return commentnum;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column
     * ts_app_freshnews.CommentNum
     *
     * @param commentnum the value for ts_app_freshnews.CommentNum
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public void setCommentnum(Integer commentnum) {
        this.commentnum = commentnum;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column
     * ts_app_freshnews.SupportNum
     *
     * @return the value of ts_app_freshnews.SupportNum
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public Integer getSupportnum() {
        return supportnum;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column
     * ts_app_freshnews.SupportNum
     *
     * @param supportnum the value for ts_app_freshnews.SupportNum
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public void setSupportnum(Integer supportnum) {
        this.supportnum = supportnum;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column
     * ts_app_freshnews.ComplainNum
     *
     * @return the value of ts_app_freshnews.ComplainNum
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public Integer getComplainnum() {
        return complainnum;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column
     * ts_app_freshnews.ComplainNum
     *
     * @param complainnum the value for ts_app_freshnews.ComplainNum
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public void setComplainnum(Integer complainnum) {
        this.complainnum = complainnum;
    }

    public Integer getNotsupportnum() {
        return notsupportnum;
    }

    public void setNotsupportnum(Integer notsupportnum) {
        this.notsupportnum = notsupportnum;
    }

    public Integer getTransnum() {
        return transnum;
    }

    public void setTransnum(Integer transnum) {
        this.transnum = transnum;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column
     * ts_app_freshnews.IsShield
     *
     * @return the value of ts_app_freshnews.IsShield
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public Integer getIsshield() {
        return isshield;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column
     * ts_app_freshnews.IsShield
     *
     * @param isshield the value for ts_app_freshnews.IsShield
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public void setIsshield(Integer isshield) {
        this.isshield = isshield;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column
     * ts_app_freshnews.IsActive
     *
     * @return the value of ts_app_freshnews.IsActive
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public Integer getIsactive() {
        return isactive;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column
     * ts_app_freshnews.IsActive
     *
     * @param isactive the value for ts_app_freshnews.IsActive
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public void setIsactive(Integer isactive) {
        this.isactive = isactive;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column
     * ts_app_freshnews.CreateBy
     *
     * @return the value of ts_app_freshnews.CreateBy
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public String getCreateby() {
        return createby;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column
     * ts_app_freshnews.CreateBy
     *
     * @param createby the value for ts_app_freshnews.CreateBy
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public void setCreateby(String createby) {
        this.createby = createby == null ? null : createby.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column
     * ts_app_freshnews.CreateDate
     *
     * @return the value of ts_app_freshnews.CreateDate
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public Date getCreatedate() {
        return createdate;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column
     * ts_app_freshnews.CreateDate
     *
     * @param createdate the value for ts_app_freshnews.CreateDate
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column
     * ts_app_freshnews.LastUpdateBy
     *
     * @return the value of ts_app_freshnews.LastUpdateBy
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public String getLastupdateby() {
        return lastupdateby;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column
     * ts_app_freshnews.LastUpdateBy
     *
     * @param lastupdateby the value for ts_app_freshnews.LastUpdateBy
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public void setLastupdateby(String lastupdateby) {
        this.lastupdateby = lastupdateby == null ? null : lastupdateby.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column
     * ts_app_freshnews.LastUpdateDate
     *
     * @return the value of ts_app_freshnews.LastUpdateDate
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public Date getLastupdatedate() {
        return lastupdatedate;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column
     * ts_app_freshnews.LastUpdateDate
     *
     * @param lastupdatedate the value for ts_app_freshnews.LastUpdateDate
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public void setLastupdatedate(Date lastupdatedate) {
        this.lastupdatedate = lastupdatedate;
    }
}