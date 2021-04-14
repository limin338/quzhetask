package com.limin.www.service;

import com.limin.www.dao.InitiatorInfoDao;
import com.limin.www.dao.InitiatorInfoDaoImpl;
import com.limin.www.po.InitiatorInfo;

import com.limin.www.util.JdbcUtils;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * @author amin
 * @create 2021-04-09 19:08
 */
public class InitiatorServiceImpl implements InitiatorService{

    private InitiatorInfoDao initiatorInfoDao = new InitiatorInfoDaoImpl();
    @Override
    public void registInitiator(InitiatorInfo initiatorInfo) {
        initiatorInfoDao.saveInitiator(initiatorInfo);
    }

    @Override
    public InitiatorInfo login(InitiatorInfo initiatorInfo) {
        return initiatorInfoDao.queryInitiatorByNameAndPassword(initiatorInfo.getInit_name(),initiatorInfo.getPassword(),initiatorInfo.getInit_status());
    }

    @Override
    public boolean existsInitiator(String initclub) {
        if(initiatorInfoDao.queryInitiatorByClub(initclub) == null){
            //等于null，表示该主办方还未注册
            return false;
        }
        return true;
    }

    @Override
    public void updateByClub(InitiatorInfo initiatorInfo) {
        initiatorInfoDao.updateByClub(initiatorInfo);
    }

    @Override
    public List<InitiatorInfo> queryInitiator() {
        return initiatorInfoDao.queryInitiator();
    }

    @Override
    public InitiatorInfo queryInitiatorByClub(InitiatorInfo initiatorInfo) {
        return initiatorInfoDao.queryInitiatorByClub(initiatorInfo.getInit_club());
    }

    @Override
    public void updateStatus(int id, String init_status) {
        initiatorInfoDao.updateStatus(new InitiatorInfo(id,init_status));

    }

    }

