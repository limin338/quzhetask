package com.limin.www.dao;

import com.limin.www.po.StudentInfo;

import java.sql.Connection;

/**
 * @author amin
 * @create 2021-04-02 22:30
 */
public class StudentInfoDaoImpl extends BaseDao implements StudentInfoDao {


//    @Override
//    public boolean checkStudentNumber(Connection conn, StudentInfo studentInfo) {
//        return false;
//    }


    @Override
    public StudentInfo getStudent(Connection conn, StudentInfo studentInfo) {
        String sql = "select * from t_stuinfo where stu_number = ? and password = ?";
        StudentInfo studentInfo1 = getInstance(StudentInfo.class,sql,studentInfo.getStu_number(),studentInfo.getPassword());
        return studentInfo1;
    }

    @Override
    public void saveStudent(Connection conn, StudentInfo studentInfo) {
        String sql = "insert into t_stuinfo(stu_number,stu_name,password,grade,phonenumber,hour)values(?,?,?,?,?,?)";
        update(conn,sql,studentInfo.getStu_number(),studentInfo.getStu_name(),studentInfo.getPassword()
        ,studentInfo.getGrade(),studentInfo.getPhonenumber(),studentInfo.getHour());
    }

    @Override
    public void update(Connection conn, StudentInfo studentInfo) {
        String sql = "update t_stuinfo set hour = ? where stu_number = ?";
        update(conn,sql,studentInfo.getHour(),studentInfo.getStu_number());
    }
}
