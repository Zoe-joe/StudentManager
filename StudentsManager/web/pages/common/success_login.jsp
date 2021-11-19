<%--
  Created by IntelliJ IDEA.
  User: Joe
  Date: 2021/11/10
  Time: 21:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:choose>
    <c:when test="${sessionScope.type=='student'}">
        <div>
            <span>欢迎来到<span class="um_span">学生管理系统</span>这里选择转到</span>
            <a href="s_infoServlet?">个人信息</a>
            <a href="scoreListServlet?action=queryScoreList">我的成绩</a>
            <a href="#">课程选择</a>
<%--            <a href="#">考勤查询</a>--%>
            <a href="index.jsp">注销</a>
            <a href="index.jsp">返回</a>
        </div>
    </c:when>
    <c:when test="${sessionScope.type=='teacher'}">
        <div>
            <span>欢迎来到<span class="um_span">老师管理系统</span>这里选择转到</span>
            <a href="teacherServlet?">个人信息</a>
            <a href="#">学生管理</a>
            <a href="#">课程查询</a>
<%--            <a href="#">考勤管理</a>--%>
            <a href="index.jsp">注销</a>
            <a href="index.jsp">返回</a>
        </div>
    </c:when>
    <c:otherwise>
        <div>
            <span>欢迎来到<span class="um_span">管理系统</span>这里选择转到</span>
            <a href="rootServlet?">个人信息</a>
            <a href="scoreManagerServlet?action=load">成绩管理</a>
            <a href="#">用户管理</a>
            <a href="#">课程管理</a>
<%--            <a href="#">考勤管理</a>--%>
            <a href="index.jsp">注销</a>
            <a href="index.jsp">返回</a>
        </div>
    </c:otherwise>
</c:choose>
