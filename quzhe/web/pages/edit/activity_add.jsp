<%--
  Created by IntelliJ IDEA.
  User: 86157
  Date: 2021/4/11
  Time: 14:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<html>
<head>
    <title>添加活动</title>
    <style type="text/css">

    </style>
</head>
<body>
    <div>
        <span><h1 align="center">添加活动</h1></span>
    </div>

    <div>
        <form action="../../activityServlet" method="get">
            <input type="hidden" name="action" value="add">
            <table style="word-wrap: break-word;word-break: break-all">
                <tr>
                    <br><p>名称<input name="act_name" type="text" ></p></br>
                        <p>类型<input name="act_type" type="text" ></p></br>
                        <p>所属社团<input name="act_club" type="text" ></p></br>
                        <p>时间<input name="act_time" type="text" ></p></br>
                        <p>地点<input name="act_site" type="text" ></p></br>
                        <p>时长<input name="act_hour" type="text" ></p></br>
                        <p>最大人数<input name="act_maxpeople" type="text" ></p></br>
                        <p>活动介绍<input name="act_content" type="text" ></p></br>
                        <p><input type="submit" value="提交"></p></td>
                </tr>

            </table>
        </form>
    </div>
</body>
</html>
