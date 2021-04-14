<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core_1_1" %>
<%--
  Created by IntelliJ IDEA.
  User: 86157
  Date: 2021/4/9
  Time: 22:57
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8"%>
<html>
<head>
    <title>主办方活动管理</title>
    <style type="text/css" rel="stylesheet">

    </style>
</head>
<body>
    <div id="header">
        <span><h1 align="center">主办方主页</h1></span>

        <span><p align="left"><font size="5px">个人信息:</font></p></span>
        <div>
            <table>
                <tr>
                    <td>姓名:${sessionScope.init.init_name}</td>
                </tr>
                <tr>
                    <td>手机号码:${sessionScope.init.init_phonenumber}</td>
                </tr>
                <tr>
                    <td>所属社团:${sessionScope.init.init_club}</td>
                </tr>
                <tr>
                    <td>社团介绍:${sessionScope.init.club_introduction}</td>
                </tr>
                <tr>
                    <td><a href="../../initiatorServlet?action=getInitiator&init_club=${init.init_club}">修改</a></td>
                </tr>
            </table>

            <a href="../../activityServlet?action=list">活动管理</a>
            <a href="../../initiatorServlet?action=logout">注销</a>


            <%--<div>--%>
                <%--<a href="/pages/infomation/initiatorinfo.jsp">个人信息</a>--%>
                <%--<a href="../../activityServlet?action=list2">活动管理</a>--%>
                 <%--<a href="">学生报名审核</a>--%>
                 <%--<a href="../function/login2.jsp">返回</a>--%>
            <%--</div>--%>


</body>
</html>
