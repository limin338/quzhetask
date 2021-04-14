package com.limin.www.dao;

import com.limin.www.po.ActivityInfo;
import com.limin.www.util.JdbcUtils;

import java.sql.Connection;
import java.util.List;

/**
 * @author amin
 * @create 2021-04-06 19:33
 */
public class ActivityInfoDaoImpl extends BaseDao implements ActivityInfoDao {

    /**
     * 将活动信息增加到数据库中
     * @param activityInfo
     * @return
     */
    @Override
    public int addActivity(ActivityInfo activityInfo) {
        String sql = "insert into t_activity(act_name,act_club,act_type,act_site, " +
                "act_time,act_hour,act_status,act_maxpeople,act_content,img_path) values(?,?,?,?,?,?,?,?,?,?)";
        return update(sql,activityInfo.getAct_name(),activityInfo.getAct_club(),activityInfo.getAct_type(),
                activityInfo.getAct_site(),activityInfo.getAct_time(),activityInfo.getAct_hour(),activityInfo.getAct_status(),
                activityInfo.getAct_maxpeople(),activityInfo.getAct_content(),activityInfo.getImg_path());
    }

    /**
     * 修改活动状态
     * @param activityInfo
     * @return
     */
    @Override
    public int updateActivity(ActivityInfo activityInfo) {
        String sql = "update t_activity set act_status = ? where id = ?";
        return update(sql,activityInfo.getAct_status(),activityInfo.getId());
    }

    /**
     * 通过社团名称查询该社团发布的活动
     * @param activityInfo
     * @return
     */
    @Override
    public ActivityInfo queryActivityById(ActivityInfo activityInfo) {
        String sql = "select * from t_activity where id = ?";
        return queryForOne(ActivityInfo.class,sql,activityInfo.getId());
    }

    /**
     * 查询所有发布过的活动
     * @return
     */
    @Override
    public List<ActivityInfo> queryActivity() {
        String sql= "select * from t_activity";
        return queryForList(ActivityInfo.class,sql);
    }

    /**
     * 活动总数
     * @return
     */
    @Override
    public Integer queryForPageTotalCount() {
        String sql = "select count(*) from t_activity";
        Number count = (Number) queryForSingleValue(sql);
        return count.intValue();
    }

    /**
     * 审核活动总数
     * @return
     */
    @Override
    public Integer queryForPageTotalCountByStatus(){
        String sql = "select count(*) from t_activity where act_status = '审核通过'";
        Number count = (Number) queryForSingleValue(sql);
        return count.intValue();
    }

    @Override
    public List<ActivityInfo> queryForPageItems(int begin, int pageSize) {
        String sql = "select * from t_activity limit ?,?";
        return queryForList(ActivityInfo.class,sql,begin,pageSize);
    }

    @Override
    public List<ActivityInfo> queryForPageItemsByStatus(int begin, int pageSize) {
        String sql = "select * from t_activity where act_status = '审核通过' limit ?,?";
        return queryForList(ActivityInfo.class,sql,begin,pageSize);
    }

}
