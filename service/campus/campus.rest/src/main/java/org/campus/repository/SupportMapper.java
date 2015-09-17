package org.campus.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.campus.model.Support;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

@Repository
public interface SupportMapper {
    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table ts_app_support
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    int deleteByPrimaryKey(String uid);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table ts_app_support
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    int insert(Support record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table ts_app_support
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    int insertSelective(Support record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table ts_app_support
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    Support selectByPrimaryKey(String uid);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table ts_app_support
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    int updateByPrimaryKeySelective(Support record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table ts_app_support
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    int updateByPrimaryKey(Support record);

    int getSupportNum(@Param("sourceId") String sourceId);

    void deleteAll();

    int countMyCommentSupport(String sourceId);

    int isSupported(@Param("sourceId") String sourceId, @Param("userId") String userId);

    void delete(@Param("sourceId") String sourceId, @Param("userId") String userId);

    Page<Support> findSupportPostsMsg(@Param("userId") String userId, Pageable pageable);

    Page<Support> findSupportCommentMsgVO(@Param("userId") String userId, Pageable pageable);

    int countSupportPostMsgVO(String userId);

    int countSupportCommentMsgVO(String userId);

    List<Support> findSupportPostsMsgList(@Param("userId") String userId);

    List<Support> findSupportCommentMsgVOList(@Param("userId") String userId);

}