package com.limin.www.dao;

import com.limin.www.po.InitiatorInfo;

import java.sql.Connection;

/**
 * @author amin
 * @create 2021-04-06 17:05
 */
public interface InitiatorInfoDAO {
    /**
     * 根据主办方的姓名和密码获取信息
     * @param conn
     * @param initiatorInfo
     * @return initiatorInfo数据库中有记录 null无记录
     */
    InitiatorInfo getInitiator(Connection conn,InitiatorInfo initiatorInfo);

    /**
     * 插入主办方信息
     * @param conn
     * @param initiatorInfo
     */
    void saveInitiator(Connection conn,InitiatorInfo initiatorInfo);

    /**
     * 修改主办方的信息
     * @param conn
     * @param initiatorInfo
     */
    void update(Connection conn,InitiatorInfo initiatorInfo);
}
