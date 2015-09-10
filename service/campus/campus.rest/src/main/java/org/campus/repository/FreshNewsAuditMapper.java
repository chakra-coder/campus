package org.campus.repository;

import java.util.Date;

import org.apache.ibatis.annotations.Param;
import org.campus.model.FreshNewsAudit;
import org.springframework.stereotype.Repository;

@Repository
public interface FreshNewsAuditMapper {
    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * ts_app_freshnews_audit
     *
     * @mbggenerated Tue Aug 25 22:13:56 CST 2015
     */
    int deleteByPrimaryKey(String uid);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * ts_app_freshnews_audit
     *
     * @mbggenerated Tue Aug 25 22:13:56 CST 2015
     */
    int insert(FreshNewsAudit record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * ts_app_freshnews_audit
     *
     * @mbggenerated Tue Aug 25 22:13:56 CST 2015
     */
    int insertSelective(FreshNewsAudit record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * ts_app_freshnews_audit
     *
     * @mbggenerated Tue Aug 25 22:13:56 CST 2015
     */
    FreshNewsAudit selectByPrimaryKey(String uid);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * ts_app_freshnews_audit
     *
     * @mbggenerated Tue Aug 25 22:13:56 CST 2015
     */
    int updateByPrimaryKeySelective(FreshNewsAudit record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * ts_app_freshnews_audit
     *
     * @mbggenerated Tue Aug 25 22:13:56 CST 2015
     */
    int updateByPrimaryKey(FreshNewsAudit record);

    int findIntradayCountByUserId(@Param("userId") String userId, @Param("date") Date date);
}