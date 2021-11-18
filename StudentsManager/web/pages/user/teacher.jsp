<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>老师登录成功</title>

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

    <script type="text/javascript">
        $(function (){
            $("#confirm1").click(function (){
                return confirm("你确定要提交吗？");
            });
        });
    </script>

</head>
<body>
<div id="header">
    <img class="logo_img" alt="" src="static/img/logo.gif" >

    <%@ include file="/pages/common/success_login.jsp" %>

</div>

<div id="main">
    <div id="inner1">
        <form action="teacherServlet" method="post">
            <input type="hidden" name="action" value="update">
            <table id="t_info">
                <tr>
                    <td></td>
                    <td><h1>老师基本信息查询</h1></td>
                    <td></td>
                </tr>
                <tr>
                    <td colspan="3" rowspan="2"><img name="img" src="${teacher.img}" alt="" width="200px" height="300px" /></td>
                </tr>
                <tr></tr>
                <tr>
                    <td><b>姓名：</b></td>
                    <td><input type="text" name="username" readonly="readonly" value="${teacher.username}"></td>
                    <td>联系管理员修改</td>
                </tr>
                <tr>
                    <td><b>学号：</b></td>
                    <td><input type="text" name="teacherID" readonly="readonly" value="${teacher.teacherID}"></td>
                    <td>联系管理员修改</td>
                </tr>
                <tr>
                    <td><b>专业：</b></td>
                    <td><input type="text" name="major" value="${teacher.major}"></td>
                    <td>可修改</td>
                </tr>
                <tr>
                    <td><b>教学内容：</b></td>
                    <td><input type="text" name="teach" value="${teacher.teach}"></td>
                    <td>可修改</td>
                </tr>
                <tr>
                    <td><b>性别：</b></td>
                    <td><input type="text" name="sex" value="${teacher.sex}"></td>
                    <td>可修改</td>
                </tr>
                <tr>
                    <td><b>年级：</b></td>
                    <td><input type="text" name="grade" value="${teacher.grade}"></td>
                    <td>可修改</td>
                </tr>
                <tr>
                    <td><b>联系电话：</b></td>
                    <td ><input type="text" name="number" value="${teacher.number}"></td>
                    <td>可修改</td>
                </tr>
                <tr>
                    <td><b>邮箱：</b></td>
                    <td><input type="text" name="email" value="${teacher.email}"></td>
                    <td>可修改</td>
                </tr>
                <tr>
                    <td><b>家庭住址：</b></td>
                    <td><input type="text" name="address" value="${teacher.address}"></td>
                    <td>可修改</td>
                </tr>
                <tr>
                    <td id="T_last1" colspan="3"><input type="submit" id="confirm1" class="sub_btn1"  value="确认提交"></td>
                </tr>


            </table>
        </form>

    </div>

</div>

<h1>欢迎回来 <a href="index.jsp">转到主页</a></h1>

<%@include file="/pages/common/foot.jsp"%>

</body>
</html>