package org.campus.repository;

import org.campus.model.RetrievemmRecord;
import org.springframework.stereotype.Repository;

@Repository
public interface RetrievemmRecordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_sys_retrievemmrecord
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    int deleteByPrimaryKey(String uid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_sys_retrievemmrecord
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    int insert(RetrievemmRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_sys_retrievemmrecord
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    int insertSelective(RetrievemmRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_sys_retrievemmrecord
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    RetrievemmRecord selectByPrimaryKey(String uid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_sys_retrievemmrecord
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    int updateByPrimaryKeySelective(RetrievemmRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_sys_retrievemmrecord
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    int updateByPrimaryKey(RetrievemmRecord record);
}