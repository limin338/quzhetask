package com.limin.www.dao;

import com.limin.www.po.StudentInfo;

import java.sql.Connection;

/**
 * @author amin
 * @create 2021-04-02 22:30
 */
public class StudentInfoDaoImpl extends BaseDao implements StudentInfoDao {
    @Override
    public StudentInfo queryStudentByNumber(String stuNumber) {
        String sql = "select * from t_stuinfo where stu_number = ?";
        return queryForOne(StudentInfo.class,sql,stuNumber);
    }

    @Override
    public StudentInfo queryStudentByNumberAndPassword(String stunumber, String password) {
        String sql = "select * from t_stuinfo where stu_number = ? and password = ?";
        return queryForOne(StudentInfo.class,sql,stunumber,password);
    }

    @Override
    public int saveStudent(StudentInfo studentInfo) {
        String sql = "insert into t_stuinfo(stu_number,stu_name,password,grade,phonenumber,hour)values(?,?,?,?,?,?)";
        return update(sql,studentInfo.getStu_number(),studentInfo.getStu_name(),studentInfo.getPassword(),studentInfo.getGrade(),
                studentInfo.getPhonenumber(),studentInfo.getHour());
    }


}
