package com.limin.www.dao;

import com.limin.www.util.JdbcUtils;


import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * CRUD
 * @author amin
 * @create 2021-04-02 18:48
 */
public abstract class BaseDao {

    /**
     * 增删改
     * @param conn
     * @param sql
     * @param args
     */
    public void update(Connection conn,String sql,Object...args){
        PreparedStatement ps = null;

        try {
            ps = conn.prepareStatement(sql);
            for(int i = 0;i < args.length;i++){
                ps.setObject(i + 1,args[i]);
            }
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            JdbcUtils.close(null,ps,null);
        }
    }

    /**
     * 查询操作，返回表中的一条记录
     * @param clazz 返回的对象类型
     * @param sql 执行的sql语句
     * @param args sql对应的参数值
     * @param <T> 返回的类型的泛型
     * @return
     */
    public <T> T getInstance(Class<T> clazz,String sql,Object...args){
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            //获取数据库连接
            conn = JdbcUtils.getConnection();
            //预编译sql语句，得到PreparedStatement对象
            ps = conn.prepareStatement(sql);
            //填充占位符
            for(int i = 0;i<args.length;i++){
                ps.setObject(i + 1,args[i]);
            }
            //执行executeQuery（），得到结果集
            rs = ps.executeQuery();

            //得到结果集的元数据
            ResultSetMetaData rsmd = rs.getMetaData();

            //通过ResultSetMetaData得到columnCount，columnLabel；通过ResultSet得到列值
            int columnCount = rsmd.getColumnCount();
            if (rs.next()){
                T t = clazz.newInstance();
                for (int i = 0; i < columnCount; i++) {//遍历每一个列
                    //获取列值
                    Object colummVal = rs.getObject(i + 1);
                    //获取列的别名：列的别名，使用类的属性名充当
                    String columnLabel = rsmd.getColumnLabel(i + 1);
                    //使用反射，给对象的相应属性赋值
                    Field field = clazz.getDeclaredField(columnLabel);
                    field.setAccessible(true);
                    field.set(t, colummVal);
                }

                return t;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            JdbcUtils.close(conn,ps,rs);
        }

        return null;
    }

    /**
     * 查询操作，返回表中多条记录构成的集合
     * @param clazz
     * @param sql
     * @param args
     * @param <T>
     * @return
     */
    public  <T> List<T> getForList(Class<T> clazz,String sql,Object...args){
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            //获取数据库连接
            conn = JdbcUtils.getConnection();
            //预编译sql语句，得到PreparedStatement对象
            ps = conn.prepareStatement(sql);
            //填充占位符
            for(int i = 0;i<args.length;i++){
                ps.setObject(i + 1,args[i]);
            }
            //执行executeQuery（），得到结果集
            rs = ps.executeQuery();

            //得到结果集的元数据
            ResultSetMetaData rsmd = rs.getMetaData();

            //通过ResultSetMetaData得到columnCount，columnLabel；通过ResultSet得到列值
            int columnCount = rsmd.getColumnCount();
            while (rs.next()){
                T t = clazz.newInstance();

                //创建集合对象
                ArrayList<T> list = new ArrayList<>();
                for (int i = 0; i < columnCount; i++) {//遍历每一个列,给t对象指定的属性赋值
                    //获取列值
                    Object colummVal = rs.getObject(i + 1);
                    //获取列的别名：列的别名，使用类的属性名充当
                    String columnLabel = rsmd.getColumnLabel(i + 1);
                    //使用反射，给对象的相应属性赋值
                    Field field = clazz.getDeclaredField(columnLabel);
                    field.setAccessible(true);
                    field.set(t, colummVal);
                }

                list.add(t);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            JdbcUtils.close(conn,ps,rs);
        }

        return null;
    }

    /**
     * 用于查询特殊值的通用方法
     * @param conn
     * @param sql
     * @param args
     * @param <E>
     * @return
     */
    public <E> E getValue(Connection conn,String sql,Object...args){
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = conn.prepareStatement(sql);
            for (int i = 0; i < args.length; i++) {
                ps.setObject(i + 1,args[i]);
            }

            rs = ps.executeQuery();
            if(rs.next()){
                return (E)rs.getObject(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            JdbcUtils.close(null,ps,rs);
        }
        return null;
    }

}
