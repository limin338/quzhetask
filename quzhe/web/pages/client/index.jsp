<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--
  Created by IntelliJ IDEA.
  User: 86157
  Date: 2021/3/31
  Time: 18:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8"%>
<html>
  <head>
    <title>趣柘首页</title>
      <!--写base标签，永远固定相对路径跳转的结果-->
      <%--<base href="http://index.jsp/">--%>
    <script type="text/javascript">
      // $(function () {
      //     //绑定单击事件
      //     $("button.add").click(function () {
      //         var itemid = $(this).attr(itemid);
      //         location.href="http://localhost:8080/stuActServlet?action=add&id=itemid";
      //     })
      // })

      function tianjia() {
          window.location.href="${pageContext.request.contextPath}/stuActServlet?action=add";
      }
    </script>
    <link type="text/css">
    <style type="text/css">
      div{
        margin: auto;
        margin-bottom: 10px;
        margin-top: 10px;

      }

      .b_list{
        height:300px;
        width:250px;
        margin: 20px;
        float: left;
        margin-top:0px;
        margin-bottom:0px;
        border: 1px #e3e3e3 solid;
      }

      .img_div{
        height: 150px;
        text-align: center;
      }

      .act_img {
        height:150px;
        width:150px;
      }

      .act_info {

        text-align: center;
      }

      .act_info div{
        height: 10px;
        width: 300px;
        text-align: left;
      }

      #page_nav{
        width: 100%;
        height: 10px;
        margin: auto;

        text-align: center;
      }

    </style>

  </head>
  <body>
    <span><h1 align="center"><font face="宋体" color="#1190ff" size="60px">趣柘校园</font></h1></span>

    <c:if test="${empty sessionScope.stu}">
      <a href="/pages/function/login.jsp"><p align="right"><font size="5px">登陆</font></a>
      <a href="/pages/function/regist.jsp"><font size="5px">注册</font></a>
      <a href="/pages/manager/manager.jsp"><font size="5px">后台管理</font></a></p>
    </c:if>

    <c:if test="${not empty sessionScope.stu}">
      <a href=""><p align="right"><font size="5px">我的活动</font></a>
      <a href="/pages/infomation/studentinfo.jsp"><font size="5px">个人信息</font></a>
      <a href="../../studentServlet?action=logout"><font size="5px">注销</font></a></p>
    </c:if>

    <c:forEach items="${requestScope.page.items}" var="activity">
      <div class="b_list">
        <div class="img_div">
          <img class="act_img" alt="" src="/static/img/quzhe.jpg"/>
        </div>
        <div class="act_info">
          <div>
            <span>活动名称:</span>
            <span>${activity.act_name}</span>
          </div>
          <div>
            <span>活动类型:</span>
            <span>${activity.act_type}</span>
          </div>
          <div>
            <span>所属社团:</span>
            <span>${activity.act_club}</span>
          </div>
          <div>
            <span>活动时间:</span>
            <span>${activity.act_time}</span>
          </div>
          <div>
            <span>活动地点:</span>
            <span>${activity.act_site}</span>
          </div>
          <div>
            <span>活动时长:</span>
            <span>${activity.act_hour}</span>
          </div>
          <div>
            <span>活动内容:</span>
            <span>${activity.act_content}</span>
          </div>
          <span><button onclick="tianjia()">报名</button></span>
          <%--<span><button itemid="${activity.id}" class="add">报名</button> </span>--%>
        </div>
      </div>

    </c:forEach>

  </br></br></br></br></br></br></br></br></br></br></br></br></br></br></br></br></br></br>
    <div>
    <div id="page_nav">
      <c:if test="${requestScope.page.pageNo>1}">
        <a href="../../client/activityServlet?action=page&pageNo=1">首页</a>
        <a href="../../client/activityServlet?action=page&pageNo=${requestScope.page.pageNo-1}">上一页</a>
      </c:if>
      <%--页码输出的开始--%>
      <c:choose>
        <c:when test="${requestScope.page.pageTotal<=5}">
          <c:forEach begin="1" end="${requestScope.page.pageTotal}" var="i">
            <c:if test="${i == requestScope.page.pageNo}">
              【${i}】
            </c:if>
            <c:if test="${i != requestScope.page.pageNo}">
              <a href="../../client/activityServlet?action=page&pageNo=i"> ${i}</a>
            </c:if>
          </c:forEach>
        </c:when>
      </c:choose>

      <%--页码输出的结束--%>
      <c:if test="${requestScope.page.pageNo < requestScope.page.pageTotal}">
        <a href="../../client/activityServlet?action=page&pageNo=${requestScope.page.pageNo+1}">下一页</a>
        <a href="../../client/activityServlet?action=page&pageNo=${requestScope.page.pageTotal}">末页</a>
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
                  location.href = "http://localhost:8080/clientActivityServlet?action=page&pageNo=" + pageNo;
              })
          })
      </script>
    </div>
    </div>

  </body>
</html>
