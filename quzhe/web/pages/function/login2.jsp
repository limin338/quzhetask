<%--
  Created by IntelliJ IDEA.
  User: 86157
  Date: 2021/4/6
  Time: 20:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8"%>
<html>
<head>
    <title>趣柘登陆(主办方)</title>
    <link type="text/css">


    </link>
</head>
<body>
<br/><br/><br/><br/>

<table align="center"  width="300" cellspacing="0">
    <tr>
        <th>
            <form action="../../initiatorServlet" method="post">
                <input type="hidden" name="action" value="login">
                <div><font face="宋体" color="#1e90ff" size="60px">欢迎来到趣柘校园</font>
                    <h1 align="center"><font color="black" size="50px">主办方登陆  </font></h1>
                    <span><font color="black">姓名:<input type="text" name="initiatorname" value=""/><br/><br/></font></span>
                    <span><font color="black">密码:<input type="password" name="password" value=""/><br/></font></span><br/>
                    <span><input type="submit" value="登陆"></span>
                    <a href="pages/function/regist2.jsp">主办方注册</a>
                </div>
                <br>
            </form>
        </th>
    </tr>

</table>
</body>
</html>
