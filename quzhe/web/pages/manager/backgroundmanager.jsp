<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core_1_1" %>
<%--
  Created by IntelliJ IDEA.
  User: 86157
  Date: 2021/4/10
  Time: 21:50
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>活动管理</title>

    <link type="text/css" rel="stylesheet">
    <style type="text/css">
        #pn_input {
            width: 30px;
            text-align: center;
        }
    </style>

</head>
<body>

<div>
    <span><h1 align="center"><font face="宋体" size="60px">后台活动管理</font></h1></span>
    <!--对活动进行审核-->
    <div>
        <a href="../../activityServlet?action=page"><p align="right"><font size="5px">后台活动管理</font></a>
        <a href="../../initiatorServlet?action=list"><font size="5px">主办方申请管理</font></a>
        <a href="pages/manager/manager.jsp"><font size="5px">返回页面</font></a></p>
    </div>
</div>

<div>
    <form action="../../activityServlet" method="post">
    <table width="1260" height="300">
        <tr>
            <td>id</td>
            <td>名称</td>
            <td>类型</td>
            <td>所属社团</td>
            <td>时间</td>
            <td>地点</td>
            <td>时长</td>
            <td>最大人数</td>
            <td>活动介绍</td>
            <td>状态</td>
            <td colspan="2">操作</td>
        </tr>

        <c:forEach items="${requestScope.page.items}" var="activity">
            <tr>
                <td>${activity.id}</td>
                <td>${activity.act_name}</td>
                <td>${activity.act_type}</td>
                <td>${activity.act_club}</td>
                <td>${activity.act_time}</td>
                <td>${activity.act_site}</td>
                <td>${activity.act_hour}</td>
                <td>${activity.act_maxpeople}</td>
                <td>${activity.act_content}</td>
                <td>${activity.act_status}</td>
                <td><input type="button" value="通过" onclick="window.location.href='../../activityServlet?action=update&action=page&id=${activity.id}&act_status=${activity.act_status}&oper=yes'"/>
                <td><input type="button" value="不通过" onclick="window.location.href='../../activityServlet?action=update&action=page&id=${activity.id}&act_status=${activity.act_status}&oper=no'"/>
                    </td>
            </tr>
        </c:forEach>
    </table>

        <div><p align="center">
            <c:if test="${requestScope.page.pageNo > 1}">
                <a href="../../activityServlet?action=page&pageNo=1">首页</a>
                <a href="../../activityServlet?action=page&pageNo=${requestScope.page.pageNo-1}">上一页</a>
            </c:if>
            <%--页码输出的开始--%>
            <c:choose>
                <c:when test="${requestScope.page.pageTotal <= 5}">
                    <c:forEach begin="1" end="${requestScope.page.pageTotal}" var="i">
                        <c:if test="${i == requestScope.page.pageNo}">
                            【${i}】
                        </c:if>
                        <c:if test="${i != requestScope.page.pageNo}">
                            <a href="../../activityServlet?action=page&pageNo=i"> ${i}</a>
                        </c:if>
                    </c:forEach>
                </c:when>
            </c:choose>
            <%--页码输出的结束--%>

            <c:if test="${requestScope.page.pageNo < requestScope.page.pageTotal}">
                <a href="../../activityServlet?action=page&pageNo=${requestScope.page.pageNo+1}">下一页</a>
                <a href="../../activityServlet?action=page&pageNo=${requestScope.page.pageTotal}">末页</a>
            </c:if>
            共${requestScope.page.pageTotal}页，${requestScope.page.pageTotalCount}条记录
            到第<input value="${param.pageNo}" name="pn" id="pn_input"/>页
            <input id="searchPageBtn" type="button" value="确认">

                <script type="text/javascript">
                    $(function(){
                        //跳到指定页码
                        $("#searchPageBtn").click(function () {
                            var pageNo = $("#pn_input").val();
                            //javascript语言中提供了一个localtion地址栏对象
                            //它有一个属性叫href，可以获取浏览器地址栏中的地址
                            //href属性可读，可写
                            location.href = "http://localhost:8080/activityServlet?action=page&pageNo=" + pageNo;
                        })
                    })
                </script>
        </p>
        </div>
    </form>
</div>
</body>
</html>
