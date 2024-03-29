package org.campus.repository;

import org.campus.model.BaseData;
import org.springframework.stereotype.Repository;

@Repository
public interface BaseDataMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table basedata
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table basedata
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    int insert(BaseData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table basedata
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    int insertSelective(BaseData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table basedata
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    BaseData selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table basedata
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    int updateByPrimaryKeySelective(BaseData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table basedata
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    int updateByPrimaryKey(BaseData record);
}