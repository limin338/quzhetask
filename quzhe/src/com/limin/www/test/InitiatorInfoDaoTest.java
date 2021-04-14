package com.limin.www.test;

import com.limin.www.dao.InitiatorInfoDao;
import com.limin.www.dao.InitiatorInfoDaoImpl;
import com.limin.www.po.InitiatorInfo;
import com.limin.www.util.JdbcUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author amin
 * @create 2021-04-06 18:16
 */
public class InitiatorInfoDaoTest {


    @Test
    public void saveInitiatorTest() throws SQLException {
        Connection conn = JdbcUtils.getConnection();
        InitiatorInfo initiatorInfo = new InitiatorInfo();
        initiatorInfo.setInit_name("小李");
        initiatorInfo.setInit_phonenumber("15899263510");
        initiatorInfo.setPassword("654321");
        initiatorInfo.setInit_club("校安协");
        initiatorInfo.setClub_introdution("宣传校园安全知识");

        InitiatorInfoDao initiatorInfoDao = new InitiatorInfoDaoImpl();
        initiatorInfoDao.saveInitiator(initiatorInfo);
    }

    @Test
    public void queryInitiatorByNameAndPassword(){
        InitiatorInfoDao initiatorInfoDao = new InitiatorInfoDaoImpl();
        System.out.println(initiatorInfoDao.queryInitiatorByNameAndPassword("zxx","123123","审核通过"));
    }
//
//    @Test
//    public void getInitiatorTest() throws SQLException {
//        Connection conn = JdbcUtils.getConnection();
//        InitiatorInfo initiatorInfo = new InitiatorInfo("小李","000000");
//
//        InitiatorInfoDao initiatorInfoDao = new InitiatorInfoDaoImpl();
//        System.out.println(initiatorInfoDao.getInitiator(conn,initiatorInfo));
//    }
//
//    @Test
//    public void updateInitiatorTest() throws SQLException {
//        Connection conn = JdbcUtils.getConnection();
//        InitiatorInfo initiatorInfo = new InitiatorInfo();
//        initiatorInfo.setInit_name("小王");
//        initiatorInfo.setInit_phonenumber("17832754362");
//        initiatorInfo.setPassword("111111");
//        initiatorInfo.setInit_club("校园安全协会");
//        InitiatorInfoDao initiatorInfoDao = new InitiatorInfoDaoImpl();
//        initiatorInfoDao.update(conn,initiatorInfo);
//    }
}
