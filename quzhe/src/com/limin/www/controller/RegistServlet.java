package com.limin.www.controller;

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

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String studentname = req.getParameter("studentname");
        String studentnumber = req.getParameter("studentnumber");
        String password = req.getParameter("password");
        String phonenumber = req.getParameter("phonenumber");
    }
}
