<%--
  Created by IntelliJ IDEA.
  User: 86157
  Date: 2021/4/12
  Time: 23:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>主办方信息修改</title>
    <style type="text/css">
        h1{
            text-align: center;
            margin-top: 200px;
        }

        h1 a{
            color: red;
        }

        input{
            text-align: center;
        }
    </style>
</head>
<body>
        <div>
            <span><h1>编辑信息</h1></span>
        </div>

        <div>
            <form action="../../initiatorServlet" method="post">
                <input type="hidden" name="action" value="updateInfo">
                <table align="center">
                    <tr>
                        <td>姓名</td>
                        <td>手机号码</td>
                        <td>所属社团</td>
                        <td>社团介绍</td>
                        <td>密码</td>
                        <td colspan="2">操作</td>
                    </tr>
                    <tr>
                        <td><input name="init_name" type="text" value="${requestScope.init.init_name}"></td>
                        <td><input name="init_phonenumber" type="text" value="${requestScope.init.init_phonenumber}"></td>
                        <td><input name="init_password" type="text" value="${requestScope.init.init_club}"></td>
                        <td><input name="init_password" type="text" value="${requestScope.init.club_introduction}"></td>
                        <td><input name="init_password" type="text" value="${requestScope.init.init_password}"></td>
                        <td><input type="submit" value="提交"></td>
                    </tr>
                </table>
            </form>
        </div>
</body>
</html>
