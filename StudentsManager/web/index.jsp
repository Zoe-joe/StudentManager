<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>学生成绩管理系统</title>

    <%@include file="/pages/common/head.jsp"%>

  </head>
  <body>

  <div id="login_header">
    <img class="logo_img" alt="" src="static/img/logo.gif" >
  </div>

  <div id="index_1">
    <div id="l_content">
      <span class="login_word">欢迎来到学生管理系统</span>
      <div class="index_2">
        <a href="pages/user/login.jsp">立即登录</a>
      </div>
      <div class="index_2">
        <a href="pages/user/regist.jsp">注册账户</a>
      </div>
    </div>


  </div>

  <%@ include file="/pages/common/foot.jsp" %>

  </body>
</html>
