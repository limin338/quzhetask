package com.limin.www.service;

import com.limin.www.dao.StudentInfoDao;
import com.limin.www.dao.StudentInfoDaoImpl;
import com.limin.www.po.StudentInfo;
import com.limin.www.util.JdbcUtils;
import sun.security.util.Password;

import java.sql.Connection;
import java.sql.SQLException;


/**
 * @author amin
 * @create 2021-04-03 18:56
 */
public class StudentInfoServiceImpl implements StudentInfoService{

    private StudentInfoDao studentInfoDao = new StudentInfoDaoImpl();
    Connection conn;

    {
        try {
            conn = JdbcUtils.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void regist(StudentInfo studentInfo) {
        studentInfoDao.saveStudent(conn,studentInfo);

    }

    @Override
    public StudentInfo login(StudentInfo studentInfo) {
        return studentInfoDao.getStudent(conn,studentInfo);
    }

    @Override
    public boolean existsStudentNumber(String studentnumber) {
        if(studentInfoDao.getStudent(conn,new StudentInfo(studentnumber)) == null){
            return false;
        }
        return true;
    }
}
