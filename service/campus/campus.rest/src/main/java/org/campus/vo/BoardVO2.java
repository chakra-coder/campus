package org.campus.vo;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

@ApiModel(value = "BoardVO2", description = "板块内容信息")
public class BoardVO2 {

    private String postsId;

    private String userId;

    private String nickName;

    private String headPic;

    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss")
    private Date publishDate;

    private List<String> picUrls;

    private String brief;

    private String content;

    private boolean isSupported;

    private int transNum;

    private int commentNum;

    private int supportNum;

    private int notSupportNum;

    private int complainNum;

    private String sourceUserId;

    private String sourceNickName;

    private boolean isDeleted;

    private boolean isTransfer;

    private String transferComment;

    private String transferNickName;

    private String sourcePostId;

    @ApiModelProperty(value = "发帖ID", required = true)
    public String getPostsId() {
        return postsId;
    }

    @ApiModelProperty(value = "发帖ID", required = true)
    public void setPostsId(String postsId) {
        this.postsId = postsId;
    }

    @ApiModelProperty(value = "发帖用户ID", required = true)
    public String getUserId() {
        return userId;
    }

    @ApiModelProperty(value = "发帖用户ID", required = true)
    public void setUserId(String userId) {
        this.userId = userId;
    }

    @ApiModelProperty(value = "发帖用户昵称", required = true)
    public String getNickName() {
        return nickName;
    }

    @ApiModelProperty(value = "发帖用户昵称", required = true)
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @ApiModelProperty(value = "头像", required = false)
    public String getHeadPic() {
        return headPic;
    }

    @ApiModelProperty(value = "头像", required = false)
    public void setHeadPic(String headPic) {
        this.headPic = headPic;
    }

    @ApiModelProperty(value = "发帖时间", required = true)
    public Date getPublishDate() {
        return publishDate;
    }

    @ApiModelProperty(value = "发帖时间", required = true)
    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    @ApiModelProperty(value = "发帖图片URL", required = false)
    public List<String> getPicUrls() {
        return picUrls;
    }

    @ApiModelProperty(value = "发帖图片URL", required = false)
    public void setPicUrls(List<String> picUrls) {
        this.picUrls = picUrls;
    }

    @ApiModelProperty(value = "发帖简介", required = false)
    public String getBrief() {
        return brief;
    }

    @ApiModelProperty(value = "发帖简介", required = false)
    public void setBrief(String brief) {
        this.brief = brief;
    }

    @ApiModelProperty(value = "发帖内容", required = false)
    public String getContent() {
        return content;
    }

    @ApiModelProperty(value = "发帖内容", required = false)
    public void setContent(String content) {
        this.content = content;
    }

    @ApiModelProperty(value = "是否被赞过/踩过", required = false)
    public boolean isSupported() {
        return isSupported;
    }

    @ApiModelProperty(value = "是否被赞过/踩过", required = false)
    public void setSupported(boolean isSupported) {
        this.isSupported = isSupported;
    }

    @ApiModelProperty(value = "转发数", required = true)
    public int getTransNum() {
        return transNum;
    }

    @ApiModelProperty(value = "转发数", required = true)
    public void setTransNum(int transNum) {
        this.transNum = transNum;
    }

    @ApiModelProperty(value = "评论数", required = true)
    public int getCommentNum() {
        return commentNum;
    }

    @ApiModelProperty(value = "评论数", required = true)
    public void setCommentNum(int commentNum) {
        this.commentNum = commentNum;
    }

    @ApiModelProperty(value = "点赞数", required = true)
    public int getSupportNum() {
        return supportNum;
    }

    @ApiModelProperty(value = "点赞数", required = true)
    public void setSupportNum(int supportNum) {
        this.supportNum = supportNum;
    }

    @ApiModelProperty(value = "踩数", required = true)
    public int getNotSupportNum() {
        return notSupportNum;
    }

    @ApiModelProperty(value = "踩数", required = true)
    public void setNotSupportNum(int notSupportNum) {
        this.notSupportNum = notSupportNum;
    }

    @ApiModelProperty(value = "投诉数", required = true)
    public int getComplainNum() {
        return complainNum;
    }

    @ApiModelProperty(value = "投诉数", required = true)
    public void setComplainNum(int complainNum) {
        this.complainNum = complainNum;
    }

    @ApiModelProperty(value = "原发帖人", required = true)
    public String getSourceUserId() {
        return sourceUserId;
    }

    @ApiModelProperty(value = "原发帖人", required = true)
    public void setSourceUserId(String sourceUserId) {
        this.sourceUserId = sourceUserId;
    }

    @ApiModelProperty(value = "原发帖人昵称", required = false)
    public String getSourceNickName() {
        return sourceNickName;
    }

    @ApiModelProperty(value = "原发帖人昵称", required = false)
    public void setSourceNickName(String sourceNickName) {
        this.sourceNickName = sourceNickName;
    }

    @ApiModelProperty(value = "原帖是否删除,true 已删", required = true)
    public boolean isDeleted() {
        return isDeleted;
    }

    @ApiModelProperty(value = "原帖是否删除,true 已删", required = true)
    public void setDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    @ApiModelProperty(value = "转发评论", required = true)
    public String getTransferComment() {
        return transferComment;
    }

    @ApiModelProperty(value = "转发评论", required = true)
    public void setTransferComment(String transferComment) {
        this.transferComment = transferComment;
    }

    @ApiModelProperty(value = "转发昵称", required = false)
    public String getTransferNickName() {
        return transferNickName;
    }

    @ApiModelProperty(value = "转发昵称", required = false)
    public void setTransferNickName(String transferNickName) {
        this.transferNickName = transferNickName;
    }

    @ApiModelProperty(value = "是否转发", required = true)
    public boolean isTransfer() {
        return isTransfer;
    }

    @ApiModelProperty(value = "是否转发", required = true)
    public void setTransfer(boolean isTransfer) {
        this.isTransfer = isTransfer;
    }

    @ApiModelProperty(value = "原帖Id", required = false)
    public String getSourcePostId() {
        return sourcePostId;
    }

    @ApiModelProperty(value = "原帖Id", required = false)
    public void setSourcePostId(String sourcePostId) {
        this.sourcePostId = sourcePostId;
    }

}
