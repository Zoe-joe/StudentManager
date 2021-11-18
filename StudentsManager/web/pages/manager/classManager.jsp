<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>root登陆成功</title>
    <%@include file="/pages/common/head.jsp"%>
    <style type="text/css">
        h1 {
            text-align: center;
            margin-top: 20px;
            margin-bottom: 20px;
        }
        h1 a {
            color:red;
        }
    </style>
</head>
<body>
<div id="header">
    <img class="logo_img" alt="" src="static/img/logo.gif" >

    <%@ include file="/pages/common/success_login.jsp" %>

</div>
<div id="main">
    <div id="inner1">

    </div>
</div>

<h1>欢迎回来 <a href="index.jsp">转到主页</a></h1>

<%@include file="/pages/common/foot.jsp"%>

</body>
</html>
