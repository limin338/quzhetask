package com.limin.www.controller;

import com.limin.www.dao.BaseDao;
import com.limin.www.po.ActivityInfo;
import com.limin.www.po.StuAct;
import com.limin.www.po.StuActItem;
import com.limin.www.service.ActivityService;
import com.limin.www.service.ActivityServiceImpl;
import com.limin.www.util.WebUtils;
import sun.security.util.Password;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author amin
 * @create 2021-04-14 13:40
 */
public class StuActServlet extends BaseServlet{

    private ActivityService activityService = new ActivityServiceImpl();
    /**
     * 加入到个人活动
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = WebUtils.parseInt(req.getParameter("id"),1);
        ActivityInfo activity = activityService.queryActivityById(id);
        StuActItem stuActItem = new StuActItem(activity.getId(),activity.getAct_club(),activity.getAct_name(),activity.getAct_type(),activity.getAct_site(),activity.getAct_time(),activity.getAct_hour(),activity.getAct_content());
        StuAct stuAct = (StuAct) req.getSession().getAttribute("stuAct");
        if(stuAct == null){
            stuAct = new StuAct();
            req.getSession().setAttribute("stuAct",stuAct);
        }
        stuAct.addItem(stuActItem);
        resp.sendRedirect(req.getContextPath() + "/pages/client/index.jsp");
    }
}
