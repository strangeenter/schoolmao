<%--
  Created by IntelliJ IDEA.
  User: 15071
  Date: 2022/10/20
  Time: 21:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册页面</title>
</head>
<body>
<div style="float:right">
    <input type="button" value="返回" onclick="back()">
</div>
<script type="text/javascript" src="js/sysjs.js"></script>
<br>
<form action="/register" method="post">
    用户名：<input type="text" name="name"><br>
    密  码：<input type="password" name="pwd"><br/>
    邮  箱：<input type="text" name="email"><br>
    生  日：<input type="text" name="birthday"><br>
    <input type="submit" value="注册">
    <input type="reset" value="清空">
</form>
</body>
</html>

