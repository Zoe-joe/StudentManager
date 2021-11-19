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
            <form action="scoreManagerServlet" method="get">
                <input type="hidden" name="action" value="${empty param.id? "add":"update"}">
                <input type="hidden" name="id" value="${requestScope.scoreList.id}">

                <table>
                    <tr>
                        <td>学号</td>
                        <td>姓名</td>
                        <td>班级</td>
                        <td>专业</td>
                        <td>老师</td>
                        <td>科目</td>
                        <td>成绩</td>
                    </tr>
                    <tr>
                        <td><input type="text" name="studentID" value="${requestScope.scoreList.studentID}"></td>
                        <td><input type="text" name="username" value="${requestScope.scoreList.username}"></td>
                        <td><input type="text" name="grade" value="${requestScope.scoreList.grade}"></td>
                        <td><input type="text" name="major" value="${requestScope.scoreList.major}"></td>
                        <td><input type="text" name="teacher" value="${requestScope.scoreList.teacher}"></td>
                        <td><input type="text" name="subject" value="${requestScope.scoreList.subject}"></td>
                        <td><input type="text" name="score" value="${requestScope.scoreList.score}"></td>
                        <td><input type="submit" value="提交"/></td>
                    </tr>
                </table>
            </form>
    </div>
</div>

<h1>欢迎回来 <a href="index.jsp">转到主页</a></h1>

<%@include file="/pages/common/foot.jsp"%>

</body>
</html>
