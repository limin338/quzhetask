package com.limin.www.test;

import com.limin.www.dao.ActivityInfoDao;
import com.limin.www.dao.ActivityInfoDaoImpl;
import com.limin.www.po.ActivityInfo;
import com.limin.www.po.Page;
import com.limin.www.util.JdbcUtils;
import org.junit.Test;

import java.sql.Connection;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;


/**
 * @author amin
 * @create 2021-04-06 19:48
 */
public class ActivityInfoDaoTest {
    private ActivityInfoDao activityInfoDao = new ActivityInfoDaoImpl();
//    Connection conn;
//
//    {
//        try {
//            conn = JdbcUtils.getConnection();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//
    @Test
    public void saveActivityTest(){
        activityInfoDao.addActivity(new ActivityInfo(null,"英语角","口语比赛","文体类",
                "学术报告厅", "2021-05-07",2,"",30,"比赛活动","null"));
    }

    @Test
    public void queryForPageTotalCount(){
        System.out.println(activityInfoDao.queryForPageTotalCount());
    }

    @Test
    public void queryForPageTotalCountByStatus(){
        System.out.println(activityInfoDao.queryForPageTotalCountByStatus());
    }

    @Test
    public void queryForPageItems(){
        for(ActivityInfo activityInfo : activityInfoDao.queryForPageItems(4, Page.PAGE_SIZE)){
            System.out.println(activityInfo);
        }
    }
//
//    @Test
//    public void update(){
//        activityInfoDao.update(conn,new ActivityInfo("合唱比赛","活动中"));
//    }
//
////    @Test
////    public void getActivityByClub(){
////        System.out.println(activityInfoDao.getActivityByClub(conn,new ActivityInfo("校团委")));
////
////    }
//
//    @Test
//    public void getActivityByClub(){
//        System.out.println(activityInfoDao.getActivityByClub(conn,new ActivityInfo("校团委")));
//    }
}
