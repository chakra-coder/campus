package org.campus.repository;

import org.campus.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_app_user
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    int deleteByPrimaryKey(String useruid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_app_user
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_app_user
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    int insertSelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_app_user
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    User selectByPrimaryKey(String useruid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_app_user
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_app_user
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    int updateByPrimaryKey(User record);
    
    /**
     * 根据昵称查找用户
     * @param nickName
     * @return
     */
    User selectByNickName(String nickName);
}