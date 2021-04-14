<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core_1_1" %>
<%--
  Created by IntelliJ IDEA.
  User: 86157
  Date: 2021/4/11
  Time: 14:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8"%>
<html>
<head>
    <title>主办方活动管理页面</title>
    <style type="text/css" rel="stylesheet"></style>
</head>
<body>
    <div id="header">
      <span><h1 align="center">活动管理</h1></span>
        <div>
            <a href="/pages/homepage/index2.jsp">返回</a>
        </div>
    </div>

    <div>
        <table>
            <tr>
                <td>名称</td>
                <td>类型</td>
                <td>所属社团</td>
                <td>时间</td>
                <td>地点</td>
                <td>时长</td>
                <td>最大人数</td>
                <td>活动介绍</td>
                <td>状态</td>
            </tr>

            <c:forEach items="${requestScope.activity}" var="activity">

                <tr>
                    <td>${activity.act_name}</td>
                    <td>${activity.act_type}</td>
                    <td>${activity.act_club}</td>
                    <td>${activity.act_time}</td>
                    <td>${activity.act_site}</td>
                    <td>${activity.act_hour}</td>
                    <td>${activity.act_maxpeople}</td>
                    <td>${activity.act_content}</td>
                    <td>${activity.act_status}</td>
                </tr>

            </c:forEach>
        </table>
        <p align="right"><a href="/pages/edit/activity_add.jsp">发布活动</a></p>
    </div>
</body>
</html>
