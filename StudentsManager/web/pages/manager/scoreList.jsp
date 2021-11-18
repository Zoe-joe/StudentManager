<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>我的成绩</title>
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
        <h1>成绩查询</h1>
            <table id="t_info">
                <tr>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                </tr>
                <tr>
                    <td>学号</td>
                    <td>姓名</td>
                    <td>授课老师</td>
                    <td>年级</td>
                    <td>科目</td>
                    <td>分数</td>
                </tr>
                <c:forEach items="${requestScope.scorelist}" var="score">
                    <tr>
                    <td>${score.studentID}</td>
                    <td>${score.username}</td>
                    <td>${score.teacher}</td>
                    <td>${score.grade}</td>
                    <td>${score.subject}</td>
                    <td>${score.score}</td>
                    </tr>
                </c:forEach>
            </table>
    </div>

</div>

<h1>欢迎回来 <a href="index.jsp">转到主页</a></h1>

<%@include file="/pages/common/foot.jsp"%>

</body>
</html>
