package com.limin.www.dao;

import com.limin.www.po.InitiatorInfo;

import java.sql.Connection;

/**
 * @author amin
 * @create 2021-04-06 17:26
 */
public class InitiatorInfoDAOImpl extends BaseDao implements InitiatorInfoDAO{


    @Override
    public InitiatorInfo getInitiator(Connection conn, InitiatorInfo initiatorInfo) {
        String sql = "select * from t_initiaior where init_name = ? and password = ?";
        initiatorInfo = getInstance(InitiatorInfo.class,sql,initiatorInfo.getInit_name(),initiatorInfo.getPassword());
        return initiatorInfo;
    }

    @Override
    public void saveInitiator(Connection conn, InitiatorInfo initiatorInfo) {
        String sql = "insert into t_initiator(init_name,init_phonenumber,init_club,password,club_introduction)values(?,?,?,?,?)";
        update(conn,sql,initiatorInfo.getInit_name(),initiatorInfo.getInit_phonenumber(),
                initiatorInfo.getInit_club(),initiatorInfo.getPassword(),initiatorInfo.getClub_introdution());
    }

    @Override
    public void update(Connection conn, InitiatorInfo initiatorInfo) {
        String sql = "update t_initiator set init_name = ? and init_phonenumber = ? where init_club = ?";
        update(conn,sql,initiatorInfo.getInit_name(),initiatorInfo.getInit_phonenumber(),initiatorInfo.getInit_club());
    }
}
