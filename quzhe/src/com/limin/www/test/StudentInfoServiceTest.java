package com.limin.www.test;

import com.limin.www.po.StudentInfo;
import com.limin.www.service.StudentInfoService;
import com.limin.www.service.StudentInfoServiceImpl;
import org.junit.Test;



/**
 * @author amin
 * @create 2021-04-04 14:40
 */
public class StudentInfoServiceTest {
    StudentInfoService studentInfoService = new StudentInfoServiceImpl();

    @Test
    public void regist(){


        StudentInfo studentInfo = new StudentInfo(null,"1003","wangwu",
                "654321","计算机科学与技术1班","14563455268",0);

        studentInfoService.regist(studentInfo);
    }

    @Test
    public void login(){
        System.out.println(studentInfoService.login(new StudentInfo("1001","13579")));

    }


}
