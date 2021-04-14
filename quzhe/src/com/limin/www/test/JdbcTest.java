package com.limin.www.test;

import com.limin.www.util.JdbcUtils;
import org.junit.Test;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 * @author amin
 * @create 2021-04-01 18:46
 */

public class JdbcTest {
    @Test
    public void testJdbcUtils(){
        System.out.println(JdbcUtils.getConnection());//com.mysql.cj.jdbc.ConnectionImpl@2096442d
    }


}