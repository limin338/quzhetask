<%--
  Created by IntelliJ IDEA.
  User: 86157
  Date: 2021/4/4
  Time: 15:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"  language="java" pageEncoding="utf-8"%>
<html>
<head>
    <title>学生注册页面</title>
    <!--写base标签，永远固定相对路径跳转的结果-->
    <!--<base href="http://localhost:8080/">-->
    <script type="text/css">

    </script>
</head>
<body>
<form name="input" action="../../studentServlet" method="post">
    <!--隐藏域-->
    <input type="hidden" name="action" value="regist">
    <h1 align="center">注册账号</h1>
    <table  align="center" border="1" width="300" cellspacing="0">
        <tr>
            <th>
                <span>学院班级<input type="text" name="grade" value="如：20级计算机学院1班"><br><br></span>
                <span>姓名：<input type="text" name="studentname" value=""><br><br></span>
                <span>学号：<input type="text" name="studentnumber" value=""><br><br></span>
                <span>手机号码:<input type="text" name="phonenumber" value=""><br><br></span>
                <span>密码:<input type="password" name="password" value=""><br><br></span>
                <span>确认密码:<input type="password" name="password" value=""><br><br></span>
                <span><input type="submit" value="注册账号"></span>
                <a href="/pages/function/regist2.jsp">主办方注册</a>

            </th>
        </tr>
    </table>
</form>
</body>
</html>
