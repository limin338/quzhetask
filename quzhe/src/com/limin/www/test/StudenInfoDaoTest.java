package com.limin.www.test;

import com.limin.www.dao.StudentInfoDao;
import com.limin.www.dao.StudentInfoDaoImpl;
import com.limin.www.po.StudentInfo;
import com.limin.www.util.JdbcUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author amin
 * @create 2021-04-03 8:34
 */
public class StudenInfoDaoTest {
    @Test
    public void saveStudent() throws SQLException {
        Connection conn = JdbcUtils.getConnection();

        StudentInfo studentInfo = new StudentInfo();
      studentInfo.setStu_number("1003");
      studentInfo.setStu_name("wangwu");
      studentInfo.setPassword("13579");
      studentInfo.setGrade("软件工程2班");
      studentInfo.setPhonenumber("16574325435");

      StudentInfoDao studentInfoDao = new StudentInfoDaoImpl();
      studentInfoDao.saveStudent(conn,studentInfo);

    }


    @Test
    public void updateTest() throws SQLException {
       Connection conn = JdbcUtils.getConnection();
       StudentInfo studentInfo = new StudentInfo();
       studentInfo.setStu_number("1001");
       studentInfo.setHour(2);

       StudentInfoDao studentInfoDao = new StudentInfoDaoImpl();
       studentInfoDao.update(conn,studentInfo);
    }


    @Test
    public void getStudent() throws SQLException {
       Connection conn = JdbcUtils.getConnection();
       StudentInfo studentInfo = new StudentInfo();
       studentInfo.setStu_number("1002");
       studentInfo.setPassword("654321");

       StudentInfoDao studentInfoDao = new StudentInfoDaoImpl();
        System.out.println(studentInfoDao.getStudent(conn,studentInfo));

    }



}
