package org.campus.repository;

import org.campus.model.BaseDataVersionNum;
import org.springframework.stereotype.Repository;

@Repository
public interface BaseDataVersionNumMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_sys_basedataversionnum
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    int deleteByPrimaryKey(String uid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_sys_basedataversionnum
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    int insert(BaseDataVersionNum record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_sys_basedataversionnum
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    int insertSelective(BaseDataVersionNum record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_sys_basedataversionnum
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    BaseDataVersionNum selectByPrimaryKey(String uid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_sys_basedataversionnum
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    int updateByPrimaryKeySelective(BaseDataVersionNum record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_sys_basedataversionnum
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    int updateByPrimaryKey(BaseDataVersionNum record);
}