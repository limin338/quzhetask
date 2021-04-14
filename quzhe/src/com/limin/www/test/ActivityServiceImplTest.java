package com.limin.www.test;

import com.limin.www.po.ActivityInfo;
import com.limin.www.po.Page;
import com.limin.www.service.ActivityService;
import com.limin.www.service.ActivityServiceImpl;
import org.junit.Test;


import java.time.LocalDate;

/**
 * @author amin
 * @create 2021-04-08 23:12
 */
public class ActivityServiceImplTest {

    private ActivityService activityService = new ActivityServiceImpl();
//
    @Test
    public void queryActivityTest(){
       for(ActivityInfo queryActivity : activityService.queryActivity()){
           System.out.println(queryActivity);
       }
    }

    @Test
    public void queryActivityById(){
        System.out.println(activityService.queryActivityById(1));
    }

    @Test
    public void addActivity(){
        activityService.addActivity(new ActivityInfo(null,"校安协","安全知识竞赛","文体类",
                "大教室", "2021-04-10",2,"活动中",200,"竞赛","null"));
    }

    @Test
    public void page(){
        System.out.println(activityService.page(1, Page.PAGE_SIZE));
    }
//    @Test
//    public void saveActivity(){
//        activityService.saveActivity(new ActivityInfo(null,"校团委","青年大学习","理想信念",
//                "网课", LocalDate.of(2021,4,22),2,"待审核",20,"学习","null"));
//    }
//
    @Test
    public void update(){
//        activityService.updateActivity(new ActivityInfo(3,"活动结束"));
    }
//
//    @Test
//    public void getActivityByType(){
//        System.out.println(activityService.getActivityByClub(new ActivityInfo("校团委")));
//    }
}
