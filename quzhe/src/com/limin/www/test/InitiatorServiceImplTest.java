package com.limin.www.test;

import com.limin.www.po.ActivityInfo;
import com.limin.www.po.InitiatorInfo;
import com.limin.www.service.InitiatorService;
import com.limin.www.service.InitiatorServiceImpl;
import org.junit.Test;

/**
 * @author amin
 * @create 2021-04-10 17:58
 */
public class InitiatorServiceImplTest {
    InitiatorService initiatorService = new InitiatorServiceImpl();
    @Test
    public void loginTest(){
        System.out.println(initiatorService.login(new InitiatorInfo("zxx","123123","审核通过")));
    }

    @Test
    public void registInitiator(){

    }

    @Test
    public void queryInitiatorByClub(){
        System.out.println(initiatorService.queryInitiatorByClub(new InitiatorInfo("校节协")));
    }
}
