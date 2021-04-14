package com.limin.www.service;

import com.limin.www.dao.ActivityInfoDao;
import com.limin.www.dao.StudentInfoDao;
import com.limin.www.dao.StudentInfoDaoImpl;
import com.limin.www.po.ActivityInfo;
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
    //要操作数据库，而数据库由dao来操作
    private StudentInfoDao studentInfoDao = new StudentInfoDaoImpl();

    @Override
    public void registStudent(StudentInfo studentInfo) {
        studentInfoDao.saveStudent(studentInfo);
    }

    @Override
    public StudentInfo login(StudentInfo studentInfo) {
        return studentInfoDao.queryStudentByNumberAndPassword(studentInfo.getStu_number(),studentInfo.getPassword());
    }

    @Override
    public boolean existsStuNumber(String stunumber) {
        if(studentInfoDao.queryStudentByNumber(stunumber) == null){
            //等于null，表示该学号还未注册
            return false;
        }
        return true;
    }


}
