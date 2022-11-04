<%--
  Created by IntelliJ IDEA.
  User: 14630
  Date: 2022/11/2
  Time: 22:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../sys/common.jsp" %>
<html>
<head>
    <title>所有用户</title>
</head>
<body>
<table border=" 1px">
    <tr align="center" style="font-weight:bold;">
        <td  width="10%">
            id
        </td>
        <td  width="10%">
            用户名
        </td>
        <td  width="10%">
            邮箱
        </td>
        <td  width="10%">
            生日
        </td>
        <td  width="10%">
            操作
        </td>
    </tr>
    <tr>
        <td  width="10%">
            ${data['id']}
        </td>
        <td  width="10%">
            ${data['name']}
        </td>
        <td  width="10%">
            ${data['email']}
        </td>
        <td  width="10%">
            ${data['birthday']}
        </td>
        <td>
            <a href="" >编辑</a>
            <a href="" >删除</a>
        </td>
    </tr>
</table>
</body>
</html>
