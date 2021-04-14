<%--
  Created by IntelliJ IDEA.
  User: 86157
  Date: 2021/4/6
  Time: 15:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8"%>
<html>
<head>
    <title>主办方人员注册页面</title>
    <script type="text/css"></script>
</head>
<body>
<form name="input" action="../../initiatorServlet" method="post">
    <input type="hidden" name="action" value="regist">
    <h1 align="center">注册账号</h1>
    <table  align="center" border="1" width="300" cellspacing="0">
        <tr>
            <th>
                <span>姓名：<input type="text" name="initiatorname" value=""><br/><br/></span>
                <span>手机号码:<input type="text" name="phonenumber" value=""><br/><br/></span>
                <span>密码:<input type="password" name="password" value=""><br/><br/></span>
                <span>确认密码:<input type="password" name="password" value=""><br/><br/></span>
                <span>所属社团:<input type="text" name="club" value=""></span><br/><br/>
                <span>社团介绍：<textarea rows="10" cols="20" name="introduction"></textarea></span><br/><br/>
                <span><input type="submit" value="注册账号"></span>

            </th>
        </tr>
    </table>
</form>
</body>
</html>
