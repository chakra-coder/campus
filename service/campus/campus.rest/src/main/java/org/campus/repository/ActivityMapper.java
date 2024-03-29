package org.campus.repository;

import org.campus.model.Activity;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_app_activity
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    int deleteByPrimaryKey(String uid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_app_activity
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    int insert(Activity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_app_activity
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    int insertSelective(Activity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_app_activity
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    Activity selectByPrimaryKey(String uid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_app_activity
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    int updateByPrimaryKeySelective(Activity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_app_activity
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    int updateByPrimaryKeyWithBLOBs(Activity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_app_activity
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    int updateByPrimaryKey(Activity record);
}