<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core_1_1" %>
<%--
  Created by IntelliJ IDEA.
  User: 86157
  Date: 2021/4/11
  Time: 10:21
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8"%>
<html>
<head>
    <title>主办方申请管理</title>
    <!--对主办方进行审核-->
    <link type="text/css" rel="stylesheet">
</head>
<body>
<div>
    <span>主办方申请系统</span>
    <div>
        <a href="../../activityServlet?action=list1">活动管理</a>
        <a href="../../initiatorServlet?action=list">主办方申请管理</a>
        <a href="pages/manager/manager.jsp">返回页面</a>
    </div>
    <div>
        <form action="../../initiatorServlet" method="post">
        <table>
            <tr>
                <td>姓名</td>
                <td>电话号码</td>
                <td>所属社团</td>
                <td>社团介绍</td>
                <td>审核状态</td>
                <td colspan="2">操作</td>
            </tr>

        <c:forEach items="${requestScope.initiator}" var="initiator">
            <tr>
                <td>${initiator.id}</td>
                <td>${initiator.init_name}</td>
                <td>${initiator.init_phonenumber}</td>
                <td>${initiator.init_club}</td>
                <td>${initiator.club_introduction}</td>
                <td>${initiator.init_status}</td>
                <td><input type="button" value="通过" onclick="window.location.href='../../initiatorServlet?action=update&action=list&id=${initiator.id}&init_status=${initiator.init_status}&oper=yes'"/>
                <td><input type="button" value="不通过" onclick="window.location.href='../../initiatorServlet?action=update&action=list&id=${initiator.id}&init_status=${initiator.init_status}&oper=no'"/>
                </td>
            </tr>>
        </c:forEach>
        </table>
        </form>
</div>
</div>
</body>
</html>
