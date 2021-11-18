<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>root登录成功</title>

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
        <form action="rootServlet" method="post">
            <input type="hidden" name="action" value="update">
            <table id="t_info">
                <tr>
                    <td></td>
                    <td><h1>root基本信息</h1></td>
                    <td></td>
                </tr>
                <tr>
                    <td colspan="3" rowspan="2"><img name="img" src="${root.img}" alt="" width="200px" height="300px" /></td>
                </tr>
                <tr></tr>
                <tr>
                    <td><b>姓名：</b></td>
                    <td><input type="text" name="username" value="${root.username}"></td>
                    <td>可修改</td>
                </tr>
                <tr>
                    <td><b>ID：</b></td>
                    <td><input type="text" name="rootID"  value="${root.rootID}"></td>
                    <td>可修改</td>
                </tr>
                <tr>
                    <td><b>联系电话：</b></td>
                    <td ><input type="text" name="number" value="${root.number}"></td>
                    <td>可修改</td>
                </tr>
                <tr>
                    <td><b>邮箱：</b></td>
                    <td><input type="text" name="email" value="${root.email}"></td>
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