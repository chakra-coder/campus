package org.campus.repository;

import org.apache.ibatis.annotations.Param;
import org.campus.model.Session;
import org.springframework.stereotype.Repository;

@Repository
public interface SessionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_app_session
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    int deleteByPrimaryKey(String uid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_app_session
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    int insertSelective(Session record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_app_session
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    Session selectByPrimaryKey(String uid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_app_session
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    int updateByPrimaryKeySelective(Session record);
    
    String selectBySessionUserId(@Param("useruid")String useruid,@Param("objUseruid")String objUseruid);
    
    String selectBySessionUserIdOr(@Param("useruid")String useruid,@Param("objUseruid")String objUseruid);
}