package com.limin.www.controller;

import com.alibaba.druid.sql.ast.statement.SQLAlterTableModifyClusteredBy;
import com.limin.www.dao.ActivityInfoDao;
import com.limin.www.po.ActivityInfo;
import com.limin.www.po.Page;
import com.limin.www.service.ActivityService;
import com.limin.www.service.ActivityServiceImpl;
import com.limin.www.util.WebUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author amin
 * @create 2021-04-09 18:37
 */
public class ActivityServlet extends BaseServlet{

    private ActivityService activityService = new ActivityServiceImpl();

    /**
     * 主办方添加活动的时候
     * @param req
     * @param resp
     * @throws IOException
     */
    protected void add(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        //获取请求的参数==封装成为Activity对象
        ActivityInfo activityInfo = WebUtils.copyParamToBean(req.getParameterMap(),new ActivityInfo());
        //调用ActivityService.addActivity()保存活动
        activityService.addActivity(activityInfo);
        //跳到活动列表页面
        resp.sendRedirect(req.getContextPath() + "/activityServlet?action=list");
    }

    /**
     * 管理员审核主办方发布活动
     * @param req
     * @param resp
     * @throws IOException
     * @throws ServletException
     */
    protected void update(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        //获取请求的参数
        int id = Integer.parseInt(req.getParameter("id"));
        String act_status = req.getParameter("act_status");
        String oper = req.getParameter("oper");
//        //调用activityService.updateActivity():更改活动状态
        if(oper!=null&&oper.equals("yes")){
            activityService.updateActivity(id,"审核通过");//只有这条语句时数据库显示审核通过页面不显示
            req.setAttribute("act_status",act_status);
        }
        if(oper!=null&&oper.equals("no")){
            activityService.updateActivity(id,"审核未通过");
            req.setAttribute("act_status",act_status);
        }

        req.getRequestDispatcher("/activityServlet?action=page").forward(req,resp);

    }



    protected void list(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //通过ActivityService查询全部图书
        List<ActivityInfo> activity = activityService.queryActivity();
        //把全部图书保存在Request域中
        req.setAttribute("activity",activity);
        //请求转发到后台活动管理页面
        req.getRequestDispatcher("/pages/edit/activitymanage.jsp").forward(req,resp);
    }


    /**
     * 处理分页功能
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void page(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取请求的参数pageNo和pageSize
        int pageNo = WebUtils.parseInt(req.getParameter("pageNo"),1);
        int pageSize = WebUtils.parseInt(req.getParameter("pageSize"),Page.PAGE_SIZE);
        //调用ActivityService.page(pageNo,pageSize):Page对象
        Page<ActivityInfo> page = activityService.page(pageNo,pageSize);
        //保存Page对象到Request域中
        req.setAttribute("page",page);
        //请求转发到jsp页面
        req.getRequestDispatcher("/pages/manager/backgroundmanager.jsp").forward(req,resp);

    }

}
