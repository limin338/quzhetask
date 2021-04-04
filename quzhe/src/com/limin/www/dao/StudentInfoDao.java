package com.limin.www.dao;

import com.limin.www.po.StudentInfo;

import java.sql.Connection;


/**
 * @author amin
 * @create 2021-04-02 22:19
 */
public interface StudentInfoDao {

    /**
     * 根据StudentInfo对象中的学号和密码获取学生信息
     * @param conn
     * @param studentInfo
     * @return StudentInfo数据库中有记录 null无记录
     */
    StudentInfo getStudent(Connection conn,StudentInfo studentInfo);

//    /**
//     * 根据StudentInfo对象中的学号从数据库中获取一条记录
//     * @param conn
//     * @param studentInfo
//     * @return true数据库中有记录 false数据库中无此记录
//     */
//    boolean checkStudentNumber(Connection conn,StudentInfo studentInfo);

    /**
     * 插入StudentInfo对象
     * @param conn
     * @param studentInfo
     */
    void saveStudent(Connection conn,StudentInfo studentInfo);

    /**
     * 更新
     * @param conn
     * @param studentInfo
     */
    void update(Connection conn,StudentInfo studentInfo);


}
