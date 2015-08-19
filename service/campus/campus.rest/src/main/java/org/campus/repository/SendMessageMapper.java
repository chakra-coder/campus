package org.campus.repository;

import java.util.List;

import org.campus.model.SendMessage;
import org.springframework.stereotype.Repository;

@Repository
public interface SendMessageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_app_sendmessage
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    int deleteByPrimaryKey(String uid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_app_sendmessage
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    int insert(SendMessage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_app_sendmessage
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    SendMessage selectByPrimaryKey(String uid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_app_sendmessage
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    int updateByPrimaryKeySelective(SendMessage record);
    
    /**
     * 
     * 查询群消息
     *
     * @param groupUid
     * @return
     *
     */
    List<SendMessage> selectByGroupUID(String groupUid);
}