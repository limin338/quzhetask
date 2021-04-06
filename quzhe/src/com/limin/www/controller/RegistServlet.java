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
 * @create 2021-04-04 20:50
 */
public class RegistServlet extends HttpServlet{

    private StudentInfoService studentInfoService = new StudentInfoServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String studentname = req.getParameter("studentname");
        String studentnumber = req.getParameter("studentnumber");
        String password = req.getParameter("password");
        String grade = req.getParameter("grade");
        String phonenumber = req.getParameter("phonenumber");


        if(studentInfoService.existsStudentNumber(studentnumber)){
//            req.setAttribute("msg","该用户已注册");
            req.getRequestDispatcher("/regist.jsp").forward(req,resp);
        }else{
            //保存到数据库
            studentInfoService.regist(new StudentInfo(null,studentnumber,
                    studentname,password,grade,phonenumber,0));
            req.getRequestDispatcher("/regist_success.jsp").forward(req,resp);
        }
    }
}
