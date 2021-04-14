package com.limin.www.service;

import com.limin.www.po.ActivityInfo;
import com.limin.www.po.Page;

import java.util.List;

/**
 * @author amin
 * @create 2021-04-08 22:55
 */
public interface ActivityService {

    void addActivity(ActivityInfo activityInfo);

    void updateActivity(int id,String act_status);

    ActivityInfo queryActivityById(int id);

    List<ActivityInfo> queryActivity();

    Page<ActivityInfo> page(int pageNo, int pageSize);

    Page<ActivityInfo> pageByStatus(int pageNo,int pageSize);

}
