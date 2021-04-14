package com.limin.www.service;

import com.limin.www.po.ActivityInfo;
import com.limin.www.po.InitiatorInfo;
import com.limin.www.po.StudentInfo;

import java.util.List;

/**
 * @author amin
 * @create 2021-04-09 19:05
 */
public interface InitiatorService {
    /**
     * 注册主办方用户
     * @param initiatorInfo
     */
    void registInitiator(InitiatorInfo initiatorInfo);

    /**
     * 登陆
     * @param initiatorInfo
     * @return
     */
    InitiatorInfo login(InitiatorInfo initiatorInfo);

    /**
     *
     * @param initclub
     * @return 返回true表示该社团主办方已存在，返回false表示可注册
     */
    boolean existsInitiator(String initclub);

    /**
     * 修改个人信息
     * @param initiatorInfo
     */
    void updateByClub(InitiatorInfo initiatorInfo);

    /**
     * 列表
     * @return
     */
    List<InitiatorInfo> queryInitiator();

    InitiatorInfo queryInitiatorByClub(InitiatorInfo initiatorInfo);

    void updateStatus(int id, String init_status);

}
