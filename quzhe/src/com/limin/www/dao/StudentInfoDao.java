package com.limin.www.dao;

import com.limin.www.po.StudentInfo;

import java.sql.Connection;


/**
 * @author amin
 * @create 2021-04-02 22:19
 */
public interface StudentInfoDao {

    //注册操作时

    /**
     * 根据学生学号查询学生信息
     * @param stuNumber 学生学号
     * @return 如果返回null，说明没有该学生。反之说明该学生已注册
     */
    StudentInfo queryStudentByNumber(String stuNumber);

    /**
     * 将学生信息保存到数据库中
     * @param studentInfo
     * @return
     */
    int saveStudent(StudentInfo studentInfo);

    //登陆时
    /**
     * 根据学生输入的学号和密码查询学生信息
     * @param stunumber
     * @param password
     * @return 如果返回null，说明学号或密码错误。
     */
    StudentInfo queryStudentByNumberAndPassword(String stunumber,String password);



}
