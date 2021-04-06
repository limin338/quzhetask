package com.limin.www.controller;

import com.limin.www.po.StudentInfo;
import com.limin.www.service.StudentInfoService;
import com.limin.www.service.StudentInfoServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author amin
 * @create 2021-04-06 15:31
 */
public class LoginServlet extends HttpServlet{

    private StudentInfoService studentInfoService = new StudentInfoServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取请求的参数
        String studentnumber = req.getParameter("studentnumber");
        String password = req.getParameter("password");
        //调用studentInfoService.login()登陆处理业务
        StudentInfo login = studentInfoService.login(new StudentInfo(studentnumber, password));

        if(login == null){
            //登陆失败，跳回登陆页面
            req.getRequestDispatcher("/login.jsp").forward(req,resp);
        }else{
            //登陆成功
            req.getRequestDispatcher("/login_success.jsp").forward(req,resp);
        }
    }
}
