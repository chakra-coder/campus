package org.campus.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.campus.config.SystemConfig;
import org.campus.constant.Constant;
import org.campus.core.exception.CampusException;
import org.campus.model.AttentionUser;
import org.campus.model.Comment;
import org.campus.model.FreshNews;
import org.campus.model.NotSupport;
import org.campus.model.Share;
import org.campus.model.Support;
import org.campus.model.User;
import org.campus.model.enums.ActiveType;
import org.campus.model.enums.AnonymousType;
import org.campus.model.enums.DisplayModel;
import org.campus.model.enums.InteractType;
import org.campus.model.enums.TypeCode;
import org.campus.repository.AttentionUserMapper;
import org.campus.repository.CommentMapper;
import org.campus.repository.FreshNewsMapper;
import org.campus.repository.NotSupportMapper;
import org.campus.repository.ShareMapper;
import org.campus.repository.SupportMapper;
import org.campus.repository.UserMapper;
import org.campus.service.UserService;
import org.campus.util.ToolUtil;
import org.campus.vo.CommentAddVO;
import org.campus.vo.CommentMyCommentVO;
import org.campus.vo.CommentPostsMsgVO;
import org.campus.vo.SupportCommentMsgVO;
import org.campus.vo.SupportMsgVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private AttentionUserMapper attentionUserMapper;

    @Autowired
    private FreshNewsMapper freshNewsMapper;

    @Autowired
    private CommentMapper commentMapper;

    @Autowired
    private SupportMapper supportMapper;

    @Autowired
    private NotSupportMapper notSupportMapper;

    @Autowired
    private ShareMapper shareMapper;

    @Override
    public User findByUserId(String userId) {
        User user = userMapper.selectByPrimaryKey(userId);
        return user;
    }

    @Override
    public int countAttention(String userId) {
        return attentionUserMapper.countAttention(userId);
    }

    @Override
    public int countFans(String userId) {
        return attentionUserMapper.countFans(userId);
    }

    @Override
    public int countPost(String userId) {
        return freshNewsMapper.countPost(userId);
    }

    @Override
    public Page<FreshNews> findUserPhotos(String userId, Pageable pageable) {
        return freshNewsMapper.findByUserId(userId, pageable);
    }

    @Override
    public Page<Comment> findComments(String sourceId, Pageable pageable) {
        return commentMapper.findBySourceId(sourceId, pageable);
    }

    @Override
    public int getUserCommentSupport(String sourceId, String userId) {
        return supportMapper.getSupportNum(sourceId, userId);
    }

    @Override
    public void photoSupport(String sourceId, String userId, String userName, InteractType type) {
        FreshNews freshNews = freshNewsMapper.selectByPrimaryKey(sourceId);
        if (freshNews == null) {
            throw new CampusException(1100002, "查询不到数据");
        }
        int hot = freshNews.getSupportnum();
        if (InteractType.SUPPORT.equals(type)) {
            hot = hot + 1;
            freshNewsMapper.updateSupport(sourceId);
            support(sourceId, userId, userName);
        } else {
            hot = hot - 1;
            freshNewsMapper.updateNotSupport(sourceId);
            notSupport(sourceId, userId, userName);
        }
        if (hot >= SystemConfig.getInt("HOT_POST_NUM")) {
            freshNews.setIshot("1");
            freshNewsMapper.updateByPrimaryKeySelective(freshNews);
        }
    }

    @Override
    public void commentSupport(String sourceId, String userId, String userName, InteractType type) {
        Comment comment = commentMapper.selectByPrimaryKey(sourceId);
        if (comment == null) {
            throw new CampusException(1100002, "查询不到数据");
        }
        if (InteractType.SUPPORT.equals(type)) {
            support(sourceId, userId, userName);
        } else {
            notSupport(sourceId, userId, userName);
        }
    }

    @Override
    public void comment(String sourceId, String userId, String userName, String ipaddress, DisplayModel model,
            CommentAddVO commentAddVO) {
        FreshNews freshNews = freshNewsMapper.selectByPrimaryKey(sourceId);
        if (freshNews == null) {
            throw new CampusException(1100002, "查询不到数据");
        }
        Comment comment = new Comment();
        comment.setUid(ToolUtil.getUUid());
        comment.setSourceuid(sourceId);
        comment.setComuseruid(userId);
        comment.setUsernickname(userName);
        comment.setCommentcontent(commentAddVO.getContent());
        comment.setIsactive(ActiveType.ACTIVE);
        comment.setCreateby(Constant.CREATE_BY);
        comment.setCreatedate(new Date());
        comment.setLastupdateby(Constant.CREATE_BY);
        comment.setLastupdatedate(new Date());
        comment.setIpaddress(ipaddress);
        commentMapper.insert(comment);

        freshNews.setCommentnum(freshNews.getCommentnum() == null ? 1 : freshNews.getCommentnum() + 1);
        freshNewsMapper.updateByPrimaryKey(freshNews);

        if (commentAddVO.isTrans()) {
            freshNews.setUid(ToolUtil.getUUid());
            freshNews.setAdduseruid(userId);
            freshNews.setAddnickname(userName);
            if (DisplayModel.MOON.equals(model)) {
                freshNews.setIsanonymous(AnonymousType.ANONYMOUS);
            } else {
                freshNews.setIsanonymous(AnonymousType.NOT_ANONYMOUS);
            }
            freshNewsMapper.insert(freshNews);

            Share share = new Share();
            share.setUid(ToolUtil.getUUid());
            share.setActivityuid(sourceId);
            share.setShareuseruid(userId);
            share.setSharetime(new Date());
            share.setFreshnewsuid(freshNews.getUid());
            share.setIsactive(ActiveType.ACTIVE);
            share.setCreateby(Constant.CREATE_BY);
            share.setCreatedate(new Date());
            share.setLastupdateby(Constant.CREATE_BY);
            share.setLastupdatedate(new Date());
            shareMapper.insert(share);
        }
    }

    @Override
    public void attention(String comUserId, String objUserId) {
        User user = userMapper.selectByPrimaryKey(objUserId);
        if (user == null) {
            throw new CampusException(1100002, "查询不到数据");
        }

        AttentionUser attentionUser = new AttentionUser();
        attentionUser.setUid(ToolUtil.getUUid());
        attentionUser.setMyuseruid(comUserId);
        attentionUser.setAttenionuseruid(objUserId);
        attentionUser.setAttentiontime(new Date());
        attentionUser.setCreateby(Constant.CREATE_BY);
        attentionUser.setCreatedate(new Date());
        attentionUserMapper.insert(attentionUser);
    }

    @Override
    public void removeAttention(String comUserId, String objUserId) {
        attentionUserMapper.removeAttention(comUserId, objUserId);
    }

    @Override
    public boolean isAttention(String comUserId, String objUserId) {
        AttentionUser attention = attentionUserMapper.findAttention(comUserId, objUserId);
        if (attention != null) {
            return true;
        }
        return false;
    }

    @Override
    public List<User> findMyFriends(String myUserId, String friendNickName) {
        return userMapper.findMyFriends(myUserId, friendNickName);
    }

    @Override
    public List<User> findMyFans(String myUserId, String friendNickName) {
        return userMapper.findMyFans(myUserId, friendNickName);
    }

    @Override
    public Page<FreshNews> findMyCommentPosts(String userId, Pageable pageable) {
        return freshNewsMapper.findMyCommentPosts(userId, pageable);
    }

    @Override
    public List<Comment> findMyComments(String sourceId, String userId) {
        return commentMapper.findMyComments(sourceId, userId);
    }

    @Override
    public int countMyCommentSupport(String sourceId) {
        return supportMapper.countMyCommentSupport(sourceId);
    }

    @Override
    public Page<FreshNews> findMySupportPosts(String userId, Pageable pageable) {
        return freshNewsMapper.findMySupportPosts(userId, pageable);
    }

    @Override
    public void uploadHeadPic(String headPic, String userId) {
        User record = new User();
        record.setUseruid(userId);
        record.setHeadpic(headPic);
        userMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public void beginAudit(String userId) {
        User user = userMapper.selectByPrimaryKey(userId);
        user.setAuditFlag("1");
        userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public void cancelSupport(String sourceId, InteractType type, String mod, String userId) {
        if ("1".equals(mod)) {
            FreshNews fresh = freshNewsMapper.selectByPrimaryKey(sourceId);
            if (InteractType.SUPPORT.equals(type)) {
                fresh.setSupportnum(fresh.getSupportnum() - 1);
                freshNewsMapper.updateByPrimaryKeySelective(fresh);
                supportMapper.delete(sourceId, userId);
            } else {
                fresh.setSupportnum(fresh.getNotsupportnum() - 1);
                freshNewsMapper.updateByPrimaryKeySelective(fresh);
                notSupportMapper.delete(sourceId, userId);
            }
        } else if ("2".equals(mod)) {
            if (InteractType.SUPPORT.equals(type)) {
                supportMapper.delete(sourceId, userId);
            } else {
                notSupportMapper.delete(sourceId, userId);
            }
        }
    }

    private void notSupport(String sourceId, String userId, String userName) {
        NotSupport notSupport = new NotSupport();
        notSupport.setUid(ToolUtil.getUUid());
        notSupport.setSourceuid(sourceId);
        notSupport.setUseruid(userId);
        notSupport.setUsernickname(userName);
        notSupport.setTypecode(TypeCode.FRESH_NEWS);
        notSupport.setIsactive(ActiveType.ACTIVE);
        notSupport.setCreateby(Constant.CREATE_BY);
        notSupport.setCreatedate(new Date());
        notSupport.setLastupdateby(Constant.CREATE_BY);
        notSupport.setLastupdatedate(new Date());
        notSupportMapper.insert(notSupport);
    }

    private void support(String sourceId, String userId, String userName) {
        Support support = new Support();
        support.setUid(ToolUtil.getUUid());
        support.setSourceuid(sourceId);
        support.setSupportuseruid(userId);
        support.setUsernickname(userName);
        support.setTypecode(TypeCode.FRESH_NEWS);
        support.setIsactive(ActiveType.ACTIVE);
        support.setCreateby(Constant.CREATE_BY);
        support.setCreatedate(new Date());
        support.setLastupdateby(Constant.CREATE_BY);
        support.setLastupdatedate(new Date());
        supportMapper.insert(support);
    }

    @Override
    public Page<User> findByNickName(String nickName, Pageable pageable) {
        return userMapper.findByNickName(nickName, pageable);
    }

    @Override
    public void reply(String sourceId, String userId, String userName, String ipaddress, CommentAddVO commentAddVO) {
        Comment commentData = commentMapper.selectByPrimaryKey(sourceId);
        FreshNews freshNews = freshNewsMapper.selectByPrimaryKey(commentData.getSourceuid());
        if (freshNews == null) {
            throw new CampusException(1100002, "查询不到数据");
        }
        Comment comment = new Comment();
        comment.setUid(ToolUtil.getUUid());
        comment.setSourceuid(sourceId);
        comment.setComuseruid(userId);
        comment.setUsernickname(userName);
        comment.setCommentcontent(commentAddVO.getContent());
        comment.setIsactive(ActiveType.ACTIVE);
        comment.setCreateby(Constant.CREATE_BY);
        comment.setCreatedate(new Date());
        comment.setLastupdateby(Constant.CREATE_BY);
        comment.setLastupdatedate(new Date());
        comment.setIpaddress(ipaddress);
        commentMapper.insert(comment);

        freshNews.setCommentnum(freshNews.getCommentnum() == null ? 1 : freshNews.getCommentnum() + 1);
        freshNewsMapper.updateByPrimaryKey(freshNews);
    }

    @Override
    public boolean isSupport(String commentId, String userId) {
        int supported = supportMapper.isSupported(commentId, userId);
        if (supported > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Page<SupportMsgVO> findSupportPostMsgVO(String userId, Pageable pageable) {
        Page<SupportMsgVO> page = null;
        Page<Support> supportPage = supportMapper.findSupportPostsMsg(userId, pageable);
        List<SupportMsgVO> commentVOs = new ArrayList<SupportMsgVO>();
        if (supportPage != null && !CollectionUtils.isEmpty(supportPage.getContent())) {
            FreshNews fresh = null;
            SupportMsgVO msgVO = null;
            for (Support support : supportPage.getContent()) {
                msgVO = new SupportMsgVO();
                fresh = freshNewsMapper.selectByPrimaryKey(support.getSourceuid());
                msgVO.setSupportUserId(support.getSupportuseruid());
                msgVO.setSupportNickName(support.getUsernickname());
                msgVO.setPostsId(fresh.getUid());
                msgVO.setBrief(fresh.getNewsbrief());
                msgVO.setContent(fresh.getNewscontent());
                msgVO.setPicUrls(dealPics(fresh));
                commentVOs.add(msgVO);
            }
            page = new PageImpl<SupportMsgVO>(commentVOs, pageable, commentVOs.size());
        } else {
            page = new PageImpl<SupportMsgVO>(commentVOs, pageable, commentVOs.size());
        }
        return page;
    }

    @Override
    public Page<SupportCommentMsgVO> findSupportCommentMsgVO(String userId, Pageable pageable) {
        Page<SupportCommentMsgVO> page = null;
        Page<Support> supportPage = supportMapper.findSupportCommentMsgVO(userId, pageable);
        List<SupportCommentMsgVO> commentMsgVOs = new ArrayList<SupportCommentMsgVO>();
        if (supportPage != null && !CollectionUtils.isEmpty(supportPage.getContent())) {
            Comment comment = null;
            SupportCommentMsgVO msgVO = null;
            for (Support support : supportPage.getContent()) {
                msgVO = new SupportCommentMsgVO();
                comment = commentMapper.selectByPrimaryKey(support.getSourceuid());
                msgVO.setSupportUserId(support.getSupportuseruid());
                msgVO.setSupportNickName(support.getUsernickname());
                msgVO.setCommentId(comment.getUid());
                msgVO.setContent(comment.getCommentcontent());
                commentMsgVOs.add(msgVO);
            }
            page = new PageImpl<SupportCommentMsgVO>(commentMsgVOs, pageable, commentMsgVOs.size());
        } else {
            page = new PageImpl<SupportCommentMsgVO>(commentMsgVOs, pageable, commentMsgVOs.size());
        }
        return page;
    }

    @Override
    public Page<CommentPostsMsgVO> findCommentPostsMsgVO(String userId, Pageable pageable) {
        Page<CommentPostsMsgVO> page = null;
        Page<Comment> supportPage = commentMapper.findCommentPostsMsgVO(userId, pageable);
        List<CommentPostsMsgVO> commentMsgVOs = new ArrayList<CommentPostsMsgVO>();
        if (supportPage != null && !CollectionUtils.isEmpty(supportPage.getContent())) {
            FreshNews fresh = null;
            CommentPostsMsgVO msgVO = null;
            for (Comment comment : supportPage.getContent()) {
                msgVO = new CommentPostsMsgVO();
                fresh = freshNewsMapper.selectByPrimaryKey(comment.getSourceuid());
                msgVO.setCommentId(comment.getUid());
                msgVO.setCommentUserId(comment.getComuseruid());
                msgVO.setCommentNickName(comment.getUsernickname());
                msgVO.setCommentContent(comment.getCommentcontent());
                msgVO.setBrief(fresh.getNewsbrief());
                msgVO.setContent(fresh.getNewscontent());
                msgVO.setPicUrls(dealPics(fresh));
                commentMsgVOs.add(msgVO);
            }
            page = new PageImpl<CommentPostsMsgVO>(commentMsgVOs, pageable, commentMsgVOs.size());
        } else {
            page = new PageImpl<CommentPostsMsgVO>(commentMsgVOs, pageable, commentMsgVOs.size());
        }
        return page;
    }

    @Override
    public Page<CommentMyCommentVO> findCommentMyCommentMsgVO(String userId, Pageable pageable) {
        Page<CommentMyCommentVO> page = null;
        Page<Comment> supportPage = commentMapper.findCommentMyCommentMsgVO(userId, pageable);
        List<CommentMyCommentVO> commentMsgVOs = new ArrayList<CommentMyCommentVO>();
        if (supportPage != null && !CollectionUtils.isEmpty(supportPage.getContent())) {
            Comment myComment = null;
            CommentMyCommentVO msgVO = null;
            for (Comment comment : supportPage.getContent()) {
                msgVO = new CommentMyCommentVO();
                myComment = commentMapper.selectByPrimaryKey(comment.getSourceuid());
                msgVO.setCommentId(comment.getUid());
                msgVO.setCommentUserId(comment.getComuseruid());
                msgVO.setCommentNickName(comment.getUsernickname());
                msgVO.setCommentContent(comment.getCommentcontent());
                msgVO.setMyCommentId(myComment.getUid());
                msgVO.setContent(myComment.getCommentcontent());
                commentMsgVOs.add(msgVO);
            }
            page = new PageImpl<CommentMyCommentVO>(commentMsgVOs, pageable, commentMsgVOs.size());
        } else {
            page = new PageImpl<CommentMyCommentVO>(commentMsgVOs, pageable, commentMsgVOs.size());
        }
        return page;
    }

    private List<String> dealPics(FreshNews freshNews) {
        String pictures = freshNews.getPictures();
        List<String> picList = null;
        if (StringUtils.isNotBlank(pictures)) {
            picList = new ArrayList<String>();
            String[] picArr = pictures.split(",");
            for (int i = 0; i < picArr.length; i++) {
                picList.add(picArr[i]);
            }
        }
        return picList;
    }

}
