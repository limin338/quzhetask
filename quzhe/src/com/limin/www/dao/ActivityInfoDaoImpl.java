package com.limin.www.dao;

import com.limin.www.po.ActivityInfo;
import com.limin.www.util.JdbcUtils;

import java.sql.Connection;

/**
 * @author amin
 * @create 2021-04-06 19:33
 */
public class ActivityInfoDaoImpl extends BaseDao implements ActivityInfoDao {

    @Override
    public void saveActivity(Connection conn, ActivityInfo activityInfo) {
        String sql = "insert into t_activity(act_name,act_club,act_type,act_site," +
                "act_time,act_hour,act_status,act_maxpeople,act_content) values(?,?,?,?,?,?,?,?,?)";
        update(conn,sql,activityInfo.getAct_name(),activityInfo.getAct_club(),activityInfo.getAct_type(),activityInfo.getAct_site(),activityInfo.getAct_time()
        ,activityInfo.getAct_hour(),activityInfo.getAct_status(),activityInfo.getAct_maxpeople(),activityInfo.getAct_content());
    }

    @Override
    public ActivityInfo getActivity(Connection conn, ActivityInfo activityInfo) {
        String sql = "select * from t_activity where t_act_name = ?";
        activityInfo = getInstance(ActivityInfo.class,sql,activityInfo.getAct_name());
        return activityInfo;
    }

    @Override
    public void update(Connection conn, ActivityInfo activityInfo) {
        String sql = "update t_activity set act_status = ? where act_name = ?";
        update(conn,sql,activityInfo.getAct_status(),activityInfo.getAct_name());
    }
}
