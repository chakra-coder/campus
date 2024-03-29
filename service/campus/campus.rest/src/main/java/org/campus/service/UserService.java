package org.campus.service;

import java.util.List;

import org.campus.model.Comment;
import org.campus.model.FreshNews;
import org.campus.model.User;
import org.campus.model.enums.DisplayModel;
import org.campus.model.enums.InteractType;
import org.campus.vo.CommentAddVO;
import org.campus.vo.CommentMyCommentVO;
import org.campus.vo.CommentPostsMsgVO;
import org.campus.vo.SupportCommentMsgVO;
import org.campus.vo.SupportMsgVO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {

    /**
     * 
     * 功能描述: <br>
     * 查询用户信息
     *
     * @param userId
     * @return
     *
     */
    User findByUserId(String userId);

    /**
     * 
     * 功能描述: <br>
     * 查询关注用户数
     *
     * @param userId
     * @return
     *
     */
    int countAttention(String userId);

    /**
     * 
     * 功能描述: <br>
     * 查询fans数
     *
     * @param userId
     * @return
     *
     */
    int countFans(String userId);

    /**
     * 
     * 功能描述: <br>
     * 统计发帖数
     *
     * @param userId
     * @return
     *
     */
    int countPost(String userId);

    /**
     * 
     * 功能描述：<br>
     * 查询用户相册，即发表的新鲜事
     *
     * @param userId
     * @return
     *
     */
    Page<FreshNews> findUserPhotos(String userId, Pageable pageable);

    /**
     * 
     * 功能描述: <br>
     * 查询相册评论
     *
     * @param sourceId
     * @param pageable
     * @return
     *
     */
    Page<Comment> findComments(String sourceId, Pageable pageable);

    /**
     * 功能描述: <br>
     * 获取用户评论的点赞数
     *
     * @param sourceId
     * @param userId
     * @return
     *
     */
    int getUserCommentSupport(String sourceId);

    /**
     * 
     * 功能描述: <br>
     * 相册互动
     *
     * @param sourceId
     * @param userId
     * @param userName
     * @param type
     *
     */
    void photoSupport(String sourceId, String userId, String userName, InteractType type);

    /**
     * 
     * 功能描述: <br>
     * 评论互动
     *
     * @param sourceId
     * @param userId
     * @param userName
     * @param type
     *
     */
    void commentSupport(String sourceId, String postId, String userId, String userName, InteractType type);

    /**
     * 
     * 功能描述: <br>
     * 评论
     *
     * @param sourceId
     * @param userId
     * @param userName
     * @param comment
     *
     */
    void comment(String sourceId, String userId, String userName, String ipaddress, DisplayModel model,
            CommentAddVO commentAddVO);

    /**
     * 
     * 功能描述: <br>
     * 关注
     *
     * @param comUserId
     * @param objUserId
     *
     */
    void attention(String comUserId, String objUserId);

    /**
     * 
     * 功能描述: <br>
     * 移除关注
     *
     * @param comUserId
     * @param objUserId
     *
     */
    void removeAttention(String comUserId, String objUserId);

    /**
     * 
     * 功能描述: <br>
     * 是否关注
     *
     * @param comUserId
     * @param objUserId
     * @return
     *
     */
    boolean isAttention(String comUserId, String objUserId);

    /**
     * 
     * 功能描述: <br>
     * 查询好友
     *
     * @param myUserId
     * @param friendNickName
     * @param pageable
     * @return
     *
     */
    List<User> findMyFriends(String myUserId, String friendNickName);

    /**
     * 
     * 功能描述: <br>
     * 查询粉丝类表
     *
     * @param myUserId
     * @param friendNickName
     * @return
     *
     */
    List<User> findMyFans(String myUserId, String friendNickName);

    /**
     * 
     * 功能描述: <br>
     * 查询我评论过的帖子
     *
     * @param userId
     * @param pageable
     * @return
     *
     */
    Page<FreshNews> findMyCommentPosts(String userId, Pageable pageable);

    /**
     * 
     * 功能描述: <br>
     * 查询我的评论
     *
     * @param sourceId
     * @param userId
     * @return
     *
     */
    List<Comment> findMyComments(String sourceId, String userId);

    /**
     * 
     * 功能描述: <br>
     * 统计我的评论获得的赞
     *
     * @param sourceId
     * @return
     *
     */
    int countMyCommentSupport(String sourceId);

    /**
     * 
     * 功能描述: <br>
     * 查询我赞过的帖子
     *
     * @param userId
     * @param pageable
     * @return
     *
     */
    Page<FreshNews> findMySupportPosts(String userId, Pageable pageable);

    /**
     * 
     * 功能描述: <br>
     * 添加用户头像
     *
     * @param headPic
     * @param userId
     *
     */
    void uploadHeadPic(String headPic, String userId);

    /**
     * 
     * 功能描述: <br>
     * 开始审帖增加标识
     *
     * @param userId
     *
     */
    void beginAudit(String userId);

    Page<User> findByNickName(String nickName, Pageable pageable);

    void cancelSupport(String sourceId, String postId, InteractType type, String mod, String userId);

    void reply(String sourceId, String postId, String userId, String userName, String ipaddress, DisplayModel model,
            CommentAddVO commentAddVO);

    boolean isSupport(String commentId, String userId);

    Page<SupportMsgVO> findSupportPostMsgVO(String userId, Pageable pageable);

    Page<SupportCommentMsgVO> findSupportCommentMsgVO(String userId, Pageable pageable);

    Page<CommentPostsMsgVO> findCommentPostsMsgVO(String userId, Pageable pageable);

    Page<CommentMyCommentVO> findCommentMyCommentMsgVO(String userId, Pageable pageable);

    void delete(String commentId, String userId);

    void setCommentNickName(String userId, String nickName);

    void setFreshNickName(String userId, String nickName);

    int countSupportPostMsgVO(String userId);

    int countSupportCommentMsgVO(String userId);

    int countCommentPostsMsgVO(String userId);

    int countCommentMyCommentMsgVO(String userId);

    void updateSupportPostMsg(List<String> sourceIds);

    void updateCommentPostsMsg(List<String> sourceIds);

    void updateSupportPostMsg(String userId);

    void updateCommentPostsMsg(String userId);

    void updateSupportCommentMsg(String userId);

    void updateCommentMyCommentMsg(String userId);

}
