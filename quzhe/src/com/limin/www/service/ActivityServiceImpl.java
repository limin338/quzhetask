package com.limin.www.service;

import com.limin.www.dao.ActivityInfoDao;
import com.limin.www.dao.ActivityInfoDaoImpl;
import com.limin.www.po.ActivityInfo;
import com.limin.www.po.Page;
import com.limin.www.util.JdbcUtils;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * @author amin
 * @create 2021-04-08 22:55
 */
public class ActivityServiceImpl implements ActivityService{
    private ActivityInfoDao activityInfoDao = new ActivityInfoDaoImpl();
    @Override
    public void addActivity(ActivityInfo activityInfo) {
        activityInfoDao.addActivity(activityInfo);
    }

    @Override
    public void updateActivity(int id,String act_status) {

        activityInfoDao.updateActivity(new ActivityInfo(id,act_status));
    }

    @Override
    public ActivityInfo queryActivityById(int id) {
        return activityInfoDao.queryActivityById(new ActivityInfo(id));
    }

    @Override
    public List<ActivityInfo> queryActivity() {
        return activityInfoDao.queryActivity();
    }

    @Override
    public Page<ActivityInfo> page(int pageNo, int pageSize) {
        Page<ActivityInfo> page = new Page<ActivityInfo>();
        //设置当前页码
        page.setPageNo(pageNo);
        //设置每页显示的数量
        page.setPageSize(pageSize);
        //其总记录数
        Integer pageTotalCount = activityInfoDao.queryForPageTotalCount();
        //设置总记录数
        page.setPageTotalCount(pageTotalCount);
        //求总页码
        Integer pageTotal = pageTotalCount / pageSize;

        if(pageTotalCount % pageSize > 0){
            pageTotal += 1;
        }
        //设置总页码
        page.setPageTotal(pageTotal);

        //求当前页数据的开始索引
        int begin = (page.getPageNo() - 1) * pageSize;
        //求当前页数据
        List<ActivityInfo> items = activityInfoDao.queryForPageItems(begin,pageSize);
        //设置当前页数据
        page.setItems(items);

        return page;
    }

    @Override
    public Page<ActivityInfo> pageByStatus(int pageNo,int pageSize){
        Page<ActivityInfo> page = new Page<ActivityInfo>();
        //设置当前页码
        page.setPageNo(pageNo);
        //设置每页显示的数量
        page.setPageSize(pageSize);
        //其总记录数
        Integer pageTotalCount = activityInfoDao.queryForPageTotalCountByStatus();
        //设置总记录数
        page.setPageTotalCount(pageTotalCount);
        //求总页码
        Integer pageTotal = pageTotalCount / pageSize;
        if(pageTotalCount % pageSize > 0){
            pageTotal += 1;
        }
        //设置总页码
        page.setPageTotal(pageTotal);

        //求当前页数据的开始索引
        int begin = (page.getPageNo() - 1) * pageSize;
        //求当前页数据
        List<ActivityInfo> items = activityInfoDao.queryForPageItemsByStatus(begin,pageSize);
        //设置当前页数据
        page.setItems(items);

        return page;
    }

}
