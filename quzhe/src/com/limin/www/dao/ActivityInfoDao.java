package com.limin.www.dao;

import com.limin.www.po.ActivityInfo;
import com.limin.www.po.StudentInfo;

import java.sql.Connection;

/**
 * @author amin
 * @create 2021-04-06 19:16
 */
public interface ActivityInfoDao {

    /**
     * 录入活动
     * @param conn
     * @param activityInfo
     */

    void saveActivity(Connection conn,ActivityInfo activityInfo);
    /**
     * 根据活动名称获取活动信息
     * @param conn
     * @param activityInfo
     * @return activityInfo有记录 null无记录
     */
    ActivityInfo getActivity(Connection conn,ActivityInfo activityInfo);

    /**
     * 更改活动状态
     * @param conn
     * @param activityInfo
     */
    void update(Connection conn,ActivityInfo activityInfo);

}
