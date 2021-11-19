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
        <form action="scoreManagerServlet" method="post">
            <table id="t_info">
                <tr>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td><h1>学生成绩管理</h1></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                </tr>
                <tr>
                    <td>学号</td>
                    <td>姓名</td>
                    <td>班级</td>
                    <td>专业</td>
                    <td>老师</td>
                    <td>科目</td>
                    <td>成绩</td>
                    <td colspan="2">操作</td>
                </tr>
                <tr>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td>查询</td>
                </tr>
                <c:forEach items="${requestScope.page.items}" var="score">
                    <tr>
                        <td>${score.studentID}</td>
                        <td>${score.username}</td>
                        <td>${score.grade}</td>
                        <td>${score.major}</td>
                        <td>${score.teacher}</td>
                        <td>${score.subject}</td>
                        <td>${score.score}</td>
                        <td><a href="scoreManagerServlet?action=queryScore&studentID=${score.studentID}&subject=${score.subject}">修改</a></td>
                        <td><a href="scoreManagerServlet?action=delete&id=${score.id}">删除</a></td>
                    </tr>
                </c:forEach>
                <tr>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td><a href="pages/manager/score_edit.jsp">添加成绩</a></td>
                </tr>
            </table>

            <div id="page_nav">

                <c:if test="${requestScope.page.pageNo > 1}">
                <a href="scoreManagerServlet?action=load&pageNo=1">首页</a>
                <a href="scoreManagerServlet?action=load&pageNo=${requestScope.page.pageNo-1}">上一页</a>
                </c:if>

                <a href="#">3</a>
                【${ requestScope.page.pageNo }】
                <a href="#">5</a>

                <c:if test="${requestScope.page.pageNo < requestScope.page.pageTotal}">
                <a href="scoreManagerServlet?action=load&pageNo=${requestScope.page.pageNo+1}">下一页</a>
                <a href="scoreManagerServlet?action=load&pageNo=${requestScope.page.pageTotal}">末页</a>
                </c:if>

                共${ requestScope.page.pageTotal }页，${ requestScope.page.pageTotalCount }条记录
                到第<input value="4" name="pn" id="pn_input"/>页
                <input type="button" value="确定">
            </div>

        </form>
    </div>
</div>

<h1>欢迎回来 <a href="index.jsp">转到主页</a></h1>

<%@include file="/pages/common/foot.jsp"%>

</body>
</html>
