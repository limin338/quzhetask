package com.limin.www.controller;

import com.limin.www.po.ActivityInfo;
import com.limin.www.po.InitiatorInfo;

import com.limin.www.service.InitiatorService;
import com.limin.www.service.InitiatorServiceImpl;
import com.limin.www.util.WebUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author amin
 * @create 2021-04-09 19:03
 */
public class InitiatorServlet extends BaseServlet{
    private InitiatorService initiatorService = new InitiatorServiceImpl();
    /**
     * 处理登陆的功能
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void login(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取请求的参数
        String initiatorname = req.getParameter("initiatorname");
        String password = req.getParameter("password");
        //调用InitiatorService.login()登陆处理业务
        InitiatorInfo login = initiatorService.login(new InitiatorInfo(initiatorname,password,"审核通过"));

        if(login == null){
            //登陆失败，跳回登陆页面
            req.getRequestDispatcher("/pages/function/login2.jsp").forward(req,resp);
        }else{
            //登陆成功
            //保存用户登陆的信息到Session域中
            req.getSession().setAttribute("init",login);
            req.getRequestDispatcher("/pages/homepage/index2.jsp").forward(req,resp);
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
        String initiatorname = req.getParameter("initiatorname");
        String club = req.getParameter("club");
        String password = req.getParameter("password");
        String introduction = req.getParameter("introduction");
        String phonenumber = req.getParameter("phonenumber");

        InitiatorInfo initiatorInfo = WebUtils.copyParamToBean(req.getParameterMap(),new InitiatorInfo());

        if(initiatorService.existsInitiator(club)){
            System.out.println("该主办方已注册");
            req.getRequestDispatcher("/pages/function/regist2.jsp").forward(req,resp);
        }else{
            //保存到数据库
            //保存用户注册的信息到Session域中
            req.getSession().setAttribute("init",initiatorInfo);
            initiatorService.registInitiator(new InitiatorInfo(null,initiatorname,phonenumber,club,introduction,password,""));
            req.getRequestDispatcher("/pages/function/tip.jsp").forward(req,resp);
        }
    }

    protected void list(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //通过InitiatorService查询所有注册的主办方
        List<InitiatorInfo> initiator = initiatorService.queryInitiator();
        //把主办方信息保存在Request域中
        req.setAttribute("initiator",initiator);
        //请求转发到后台主办方管理页面
        req.getRequestDispatcher("/pages/manager/initiatormanager.jsp").forward(req,resp);
    }

    /**
     * 审核主办方
     * @param req
     * @param resp
     * @throws IOException
     * @throws ServletException
     */
    protected void update(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        int id = Integer.parseInt(req.getParameter("id"));
        String init_status = req.getParameter("init_status");
        String oper = req.getParameter("oper");

        if(oper!=null&&oper.equals("yes")){
            initiatorService.updateStatus(id,"审核通过");
            req.setAttribute("init_status",init_status);
        }
        if(oper!=null&&oper.equals("no")){
            initiatorService.updateStatus(id,"审核不通过");
            req.setAttribute("init_status",init_status);
        }
        resp.sendRedirect(req.getContextPath() + "/initiatorServlet?action=list");
    }

    /**
     * 修改主办方信息时回显
     * @param req
     * @param resp
     * @throws IOException
     * @throws ServletException
     */
    protected void getInitiator(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        String init_club = req.getParameter("init_club");
        InitiatorInfo initiator = initiatorService.queryInitiatorByClub(new InitiatorInfo(init_club));
        req.getSession().setAttribute("init",initiator);
//        req.setAttribute("init",initiator);
        req.getRequestDispatcher("/pages/edit/initiator_edit.jsp").forward(req,resp);

    }

    protected void add(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        InitiatorInfo initiatorInfo = WebUtils.copyParamToBean(req.getParameterMap(),new InitiatorInfo());
        initiatorInfo.addInitiator(initiatorInfo);
        resp.sendRedirect(req.getContextPath() + "/initiatorServlet?action=login");

    }

    protected void updateInfo(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        InitiatorInfo initiatorInfo = WebUtils.copyParamToBean(req.getParameterMap(),new InitiatorInfo());
        initiatorService.updateByClub(initiatorInfo);
        req.getSession().setAttribute("init",initiatorInfo);
        resp.sendRedirect(req.getContextPath() + "/initiatorServlet?action=login");

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
