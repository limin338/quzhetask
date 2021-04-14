package com.limin.www.dao;

import com.limin.www.po.ActivityInfo;
import com.limin.www.po.InitiatorInfo;
import com.limin.www.po.StudentInfo;

import java.sql.Connection;
import java.util.List;

/**
 * @author amin
 * @create 2021-04-06 17:05
 */
public interface InitiatorInfoDao {


    /**
     * 将主办方信息保存到数据库中
     * @param initiatorInfo
     * @return
     */
    int saveInitiator(InitiatorInfo initiatorInfo);

    /**
     * 根据主办方输入的姓名和密码查询信息
     * @param initname
     * @param password
     * @return 如果返回null，说明学号或密码错误。
     */
    InitiatorInfo queryInitiatorByNameAndPassword(String initname,String password,String initstatus);


    InitiatorInfo queryInitiatorByClub(String club);

    /**
     * 修改主办方信息
     * @param initiatorInfo
     */
    void updateByClub(InitiatorInfo initiatorInfo);

    void updateStatus(InitiatorInfo initiatorInfo);

    /**
     * 查询所有注册的主办方
     * @return
     */
    List<InitiatorInfo> queryInitiator() ;


}
