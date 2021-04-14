<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 86157
  Date: 2021/4/14
  Time: 13:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>个人活动</title>
    <link type="text/css">
</head>
<body>
    <span><h1 align="center" >个人活动</h1></span>
    <h3 align="right"><a href="/pages/homepage/index.jsp">返回</a></h3>

    <table>
        <tr>
            <td>id</td>
            <td>名称</td>
            <td>类型</td>
            <td>所属社团</td>
            <td>时间</td>
            <td>地点</td>
            <td>时长</td>
            <td>活动介绍</td>

            <c:forEach items="${sessionScope.stuAct.items}" var="entry">
                <tr>
                    <td>${entry.value.id}</td>
                    <td>${entry.value.act_name}</td>
                    <td>${entry.value.act_type}</td>
                    <td>${entry.value.act_club}</td>
                    <td>${entry.value.act_time}</td>
                    <td>${entry.value.act_site}</td>
                    <td>${entry.value.act_hour}</td>
                    <td>${entry.value.act_content}</td>
                </tr>
            </c:forEach>
        </tr>
    </table>

</body>
</html>
