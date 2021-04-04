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
    public void test() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            //获取连接
            conn = JdbcUtils.getConnection();
            //模糊查询
            String sql = "select * from t_stuinfo where stu_id like ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, "_0%");
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("stu_id"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //释放资源
            JdbcUtils.close(conn, ps, rs);
        }
    }

    @Test
    public void test2(){
        try {
            System.out.println(JdbcUtils.getConnection());//com.mysql.cj.jdbc.ConnectionImpl@6b57696f
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}