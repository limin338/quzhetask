package com.limin.www.controller;

import com.limin.www.po.ActivityInfo;
import com.limin.www.po.Page;
import com.limin.www.service.ActivityService;
import com.limin.www.service.ActivityServiceImpl;
import com.limin.www.util.WebUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author amin
 * @create 2021-04-13 19:10
 */
public class ClientActivityServlet extends BaseServlet{

    ActivityService activityService = new ActivityServiceImpl();

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
        int pageSize = WebUtils.parseInt(req.getParameter("pageSize"), Page.PAGE_SIZE);
        //调用ActivityService.page(pageNo,pageSize):Page对象
        Page<ActivityInfo> page = activityService.pageByStatus(pageNo,pageSize);
        //保存Page对象到Request域中
        req.setAttribute("page",page);
        //请求转发到jsp页面
        req.getRequestDispatcher("/pages/client/index.jsp").forward(req,resp);

    }
}
