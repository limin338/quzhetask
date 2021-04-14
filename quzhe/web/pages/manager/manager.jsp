<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 86157
  Date: 2021/4/10
  Time: 13:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>后台管理</title>
    <link type="text/css" rel="stylesheet">
    <style type="text/css">
        h1{
            text-align: center;
            margin-top: 200px;
        }
    </style>
</head>
<body>
    <span>后台管理系统</span>
    <div>

        <a href="../../activityServlet?action=page">活动管理 </a>
        <a href="../../initiatorServlet?action=list">主办方管理</a>
        <a href="../homepage/index.jsp">返回主页</a>
    </div>

    <div>
        <h1>进入后台管理系统</h1>
    </div>


</body>
</html>
