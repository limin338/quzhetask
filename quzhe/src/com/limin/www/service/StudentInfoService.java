package com.limin.www.service;

import com.limin.www.po.ActivityInfo;
import com.limin.www.po.StudentInfo;

/**
 * @author amin
 * @create 2021-04-03 18:53
 */
public interface StudentInfoService {
    /**
     * 注册学生用户
     * @param studentInfo
     */
    void registStudent(StudentInfo studentInfo);

    /**
     * 登陆
     * @param studentInfo
     * @return
     */
    StudentInfo login(StudentInfo studentInfo);

    /**
     * 检查该学号是否可用
     * @param stunumber
     * @return 返回true表示学号已存在，返回false表示可注册
     */
    boolean existsStuNumber(String stunumber);

}
