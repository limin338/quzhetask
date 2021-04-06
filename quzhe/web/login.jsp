<%--
  Created by IntelliJ IDEA.
  User: 86157
  Date: 2021/4/4
  Time: 15:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>趣柘登陆(学生)</title>
    <script type="text/javascript" src="js/jquery-1.7.2.js"></script>
    <script type="text/javascript">
        //页面加载完成之后
        $(function () {

            //给注册按钮添加事件
            $("#sub_btn").click(function () {

                //获取密码
                var passwordValue = $("#password").val();
                //验证密码是否合法,规则如下：必须由字母，数字，下划线组成，并且长度为5到15位。
                var passwordReg = /^\w{5,15}$/;
                // 验证用户信息
                if (!passwordReg.test(passwordValue)) {
                    // 提示用户
                    $("span.errorMsg").text("密码不合法！");
                    return false;
                }
                // 阻止表单提交
                return true;
            })
        })
    </script>
    <link type = "text/css" rel="stylesheet">



</head>
<body>
<br/><br/><br/><br/>

<table align="center"  width="300" cellspacing="0">
    <tr>
        <th>
            <form action="studentServlet" method="post">
                <input type="hidden" name="action" value="login">
                <div><font face="宋体" color="#1e90ff" size="50px">欢迎来到趣柘校园</font>
                    <h1 align="center"><font color="black" size="40px">登陆</font></h1><br/><br/>
                    <span><font color="black">学号:<input type="itxt" name="studentnumber" placeholder="请输入学号"/><br/><br/></font></span>
                    <span><font color="black">密码:<input type="itxt" name="password" placeholder="请输入密码" id="password"/><br/></font></span><br/>
                    <span><input type="submit" value="登陆" id="sub_btn"/></span>
                    <a href="regist.jsp">学生注册</a>
                    <a href="regist2.jsp">主办方注册</a>
                    </div>
                <br>
            </form>
        </th>
    </tr>

</table>


</body>
</html>
