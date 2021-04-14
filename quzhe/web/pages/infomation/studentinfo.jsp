<%--
  Created by IntelliJ IDEA.
  User: 86157
  Date: 2021/4/11
  Time: 22:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>个人信息</title>
    <link type="text/css" rel="stylesheet">
</head>
<body>
    <span><h1 align="center" >个人信息</h1></span>
    <h3 align="right">
        <a href="/pages/homepage/index.jsp">返回</a></h3>
    <div>
        <table align="left">
            <tr>
                <td><h4>学号:${sessionScope.stu.stu_number}</h4></td>
            </tr>
            <tr>
                <td><h4>姓名:${sessionScope.stu.stu_name}</h4></td>
            </tr>
            <tr>
                <td><h4>学院班级:${sessionScope.stu.grade}</h4></td>
            </tr>
            <tr>
                <td><h4>手机号码:${sessionScope.stu.phonenumber}</h4></td>
            </tr>
            <tr>
                <td><h4>时长:${sessionScope.stu.hour}</h4></td>
            </tr>
        </table>


    </div>
</body>
</html>
