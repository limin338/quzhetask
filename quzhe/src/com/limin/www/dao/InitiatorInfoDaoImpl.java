package com.limin.www.dao;

import com.limin.www.po.ActivityInfo;
import com.limin.www.po.InitiatorInfo;
import com.limin.www.po.StudentInfo;

import java.sql.Connection;
import java.util.List;

/**
 * @author amin
 * @create 2021-04-06 17:26
 */
public class InitiatorInfoDaoImpl extends BaseDao implements InitiatorInfoDao {


    @Override
    public int saveInitiator(InitiatorInfo initiatorInfo) {
        String sql = "insert into t_initiator(init_name,init_phonenumber,init_club,password,club_introduction,init_status)values(?,?,?,?,?,?)";
        return update(sql,initiatorInfo.getInit_name(),initiatorInfo.getInit_phonenumber(),
                initiatorInfo.getInit_club(),initiatorInfo.getPassword(),initiatorInfo.getClub_introdution(),initiatorInfo.getInit_status());
    }

    @Override
    public InitiatorInfo queryInitiatorByNameAndPassword(String initname, String password,String initstatus) {
        String sql = "select * from t_initiator where init_name = ? and password = ? and init_status = ?";
        return queryForOne(InitiatorInfo.class,sql,initname,password,initstatus);
    }

    @Override
    public InitiatorInfo queryInitiatorByClub(String club) {
        String sql = "select * from t_initiator where init_club = ?";
        return queryForOne(InitiatorInfo.class,sql,club);
    }

    @Override
    public void updateByClub(InitiatorInfo initiatorInfo) {
        String sql = "update t_initiator set init_name = ?,init_phonenumber = ?,password = ? where init_club = ?";
        update(sql,initiatorInfo.getInit_name(),initiatorInfo.getInit_phonenumber(),initiatorInfo.getPassword(),initiatorInfo.getInit_club());
    }

    @Override
    public void updateStatus(InitiatorInfo initiatorInfo) {
        String sql = "update t_initiator set init_status = ? where id = ?";
        update(sql,initiatorInfo.getInit_status(),initiatorInfo.getId());
    }

    @Override
    public List<InitiatorInfo> queryInitiator() {
        String sql= "select * from t_initiator";
        return queryForList(InitiatorInfo.class,sql);
    }


}
