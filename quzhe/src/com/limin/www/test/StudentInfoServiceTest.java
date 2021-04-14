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
//
    @Test
    public void regist(){
        StudentInfo studentInfo = new StudentInfo(null,"1005","王五",
                "123456","20级计算机学院5班","18975433454",0);

        studentInfoService.registStudent(studentInfo);
    }
//
    @Test
    public void login(){
        System.out.println(studentInfoService.login(new StudentInfo("1001","123456")));

    }


}
