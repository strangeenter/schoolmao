<%--
  Created by IntelliJ IDEA.
  User: 15071
  Date: 2022/10/30
  Time: 21:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查询用户</title>
</head>
<body>
<form action="/selectUser" method="get">
    <tr>
        <td>输入id查询用户</td>
    </tr>
    <br>
    <tr>
        <td>
            <input type="text" name="id">
        </td>
        <td>
            <input type="submit" value="查询"><br>
        </td>
    </tr>
</form>
<%--<input type="text" value="查询所有" >--%>
</body>
</html>
