package com.limin.www.dao;

import com.limin.www.po.ActivityInfo;
import com.limin.www.po.InitiatorInfo;
import com.limin.www.po.StudentInfo;

import java.sql.Connection;
import java.util.List;

/**
 * @author amin
 * @create 2021-04-06 19:16
 */
public interface ActivityInfoDao {

    /**
     * 录入活动
     * @param activityInfo
     * @return
     */
    int addActivity(ActivityInfo activityInfo);

    /**
     * 修改活动信息
     * @param activityInfo
     * @return
     */
    int updateActivity(ActivityInfo activityInfo);

    /**
     * 根据社团查询活动
     * @param activityInfo
     * @return
     */
    ActivityInfo queryActivityById(ActivityInfo activityInfo);

    /**
     * 列出所有活动
     * @return
     */
    List<ActivityInfo> queryActivity();

    /**
     * 活动总记录数
     * @return
     */
    Integer queryForPageTotalCount();

    /**
     * 列出审核通过的活动总记录数
     * @return
     */
    Integer queryForPageTotalCountByStatus();

    /**
     * 列出第几页的几条数据
     * @param begin
     * @param pageSize
     * @return
     */
    List<ActivityInfo> queryForPageItems(int begin, int pageSize);

    /**
     * 根据活动的审核状态列出第几页的几条审核通过的活动数据
     * @param begin
     * @param pageSize
     * @return
     */
    List<ActivityInfo> queryForPageItemsByStatus(int begin, int pageSize);

}
