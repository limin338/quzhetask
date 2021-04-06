package com.limin.www.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

/**父类
 * @author amin
 * @create 2021-04-06 22:36
 */
public abstract class BaseServlet extends HttpServlet{

    protected void doPost(HttpServletRequest req, HttpServletResponse resp){

        String action = req.getParameter("action");

        try {
            //获取action业务鉴别字符串，获取相应的业务方法反射对象
            Method method = this.getClass().getDeclaredMethod(action,HttpServletRequest.class,HttpServletResponse.class);
            //调用目标业务方法
            method.invoke(this,req,resp);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
