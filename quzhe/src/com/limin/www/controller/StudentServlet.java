package com.limin.www.controller;

import com.limin.www.po.StudentInfo;
import com.limin.www.service.StudentInfoService;
import com.limin.www.service.StudentInfoServiceImpl;
import com.limin.www.util.WebUtils;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author amin
 * @create 2021-04-06 21:38
 */
public class StudentServlet extends BaseServlet{

    private StudentInfoService studentInfoService = new StudentInfoServiceImpl();

    /**
     * 处理登陆的功能
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void login(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取请求的参数
        String studentnumber = req.getParameter("studentnumber");
        String password = req.getParameter("password");
        //调用studentInfoService.login()登陆处理业务
        StudentInfo login = studentInfoService.login(new StudentInfo(studentnumber, password));

        if(login != null){
            //登陆成功
            //保存用户登陆的信息到Session域中
            req.getSession().setAttribute("stu",login);
            req.getRequestDispatcher("/pages/function/login_success.jsp").forward(req,resp);
        }else{
            //登陆失败，跳回登陆页面

            req.getRequestDispatcher("/pages/function/login.jsp").forward(req,resp);
        }
    }

    /**
     * 处理注册的功能
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void regist(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        //获取请求的参数
        String studentname = req.getParameter("studentname");
        String studentnumber = req.getParameter("studentnumber");
        String password = req.getParameter("password");
        String grade = req.getParameter("grade");
        String phonenumber = req.getParameter("phonenumber");

        StudentInfo studentInfo = WebUtils.copyParamToBean(req.getParameterMap(),new StudentInfo());

        if(studentInfoService.existsStuNumber(studentnumber)){
            System.out.println("学号已存在");
            req.getRequestDispatcher("/pages/function/regist.jsp").forward(req,resp);
        }else{
            //保存到数据库
            //保存用户登陆的信息到Session域中
            req.getSession().setAttribute("stu",studentInfo);
            studentInfoService.registStudent(new StudentInfo(null,studentnumber,
                    studentname,password,grade,phonenumber,0));
            req.getRequestDispatcher("/pages/function/regist_success.jsp").forward(req,resp);
        }
    }

    /**
     * 注销
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void logout(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //销毁session中用户登陆的信息
        req.getSession().invalidate();
        //重定向到首页
        resp.sendRedirect(req.getContextPath() + "/pages/homepage/index.jsp");
    }



}
