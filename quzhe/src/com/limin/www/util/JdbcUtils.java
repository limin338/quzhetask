package com.limin.www.util;

import java.sql.*;

/**
 * @author amin
 * @create 2021-04-01 18:38
 */
public class JdbcUtils {
    /**
     * 工具类一般情况下构造方法建议私有化，因为工具类根本不用new对象，
     * 因为工具类的方法都是静态的，直接采用类名调用
     */
    private JdbcUtils(){}

    /**
     * 只要调了getConnection方法，就要用类JdbcUtils去调，只要调了类JdbcUtils，就会执行一次
     * 静态代码块在类加载时执行，并且只执行一次
     */
    static{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取数据库连接池中的连接
     * @return 连接对象
     * @throws SQLException
     */
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/quzhe?useSSL=false&serverTimezone=Asia/Shanghai","root","0111");
    }


    /**
     * 关闭连接
     * @param conn 连接对象
     * @param ps 数据库操作对象
     * @param rs 结果集
     */
    public static void close(Connection conn, Statement ps, ResultSet rs){
        if(rs != null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if(ps != null){
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if(conn != null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
