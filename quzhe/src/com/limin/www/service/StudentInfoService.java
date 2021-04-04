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
    public void registStudent(StudentInfo studentInfo);

    /**
     * 登陆
     * @param studentInfo
     * @return
     */
    public StudentInfo login(StudentInfo studentInfo);
}
