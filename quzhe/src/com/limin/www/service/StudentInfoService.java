package com.limin.www.service;

import com.limin.www.po.StudentInfo;

/**
 * @author amin
 * @create 2021-04-03 18:53
 */
public interface StudentInfoService {

    /**
     * 注册
     * @param studentInfo
     */
    void regist(StudentInfo studentInfo);

    /**
     * 登陆
     * @param studentInfo
     * @return 返回null登陆失败
     */
    StudentInfo login(StudentInfo studentInfo);

    /**
     * 检查学生学号是否已经存在
     * @param studentnumber
     * @return true 该学号已存在，false 该学号可进行注册
     */
    boolean existsStudentNumber(String studentnumber);
}
