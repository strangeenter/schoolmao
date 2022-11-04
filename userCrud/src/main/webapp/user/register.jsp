<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>注册页面</title>
</head>
<body>
<form action="/RegisterUserServlet" method="post">
    用户名：<input type="text" name="name"><br>
    密 码：<input type="password" name="password"><br/>
    邮 箱：<input type="text" name="email"><br>
    生 日：<input type="text" name="birthday"><br>
    <input type="submit" value="注册">
</form>
</body>
</html>
