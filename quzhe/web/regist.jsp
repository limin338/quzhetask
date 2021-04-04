<%--
  Created by IntelliJ IDEA.
  User: 86157
  Date: 2021/4/4
  Time: 15:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生注册</title>
    <script type="text/css">

    </script>
</head>
<body>
<form name="input" action="http://localhost:8080" method="post">
    <input type="hidden" name="action" value="login">
    <h1 align="center">注册账号</h1>
    <table  align="center" border="1" width="300" cellspacing="0">
        <tr>
            <th>
                <span>
                        年级：<select>
                        <option selected="selected">--请选择年级--</option>
                        <option>2021级</option>
                        <option>2020级</option>
                        <option>2019级</option>
                        <option>2018级</option>
                    </select><br><br>
                </span>
                <span>
                        学院班级<input type="text" name="class" value="如：计算机学院1班"><br><br>
                </span>
                    <span>姓名：<input type="text" name="username" value=""><br><br></span>
                    <span>学号：<input type="text" name="studentid" value=""><br><br></span>
                    <span>手机号码:<input type="text" name="phonenumber" value=""><br><br></span>
                    <span>密码:<input type="password" name="password" value=""><br><br></span>
                    <span>确认密码:<input type="password" name="password" value=""><br><br></span>
                    <span><input type="submit" value="注册账号"></span>

            </th>
        </tr>
    </table>
</form>
</body>
</html>
