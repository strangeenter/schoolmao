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
  <title> 用户</title>
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
      <button href="/user/useredit.jsp" onclick="edituser()">编辑</button>
      <button onclick="deleteuser()">删除</button>
    </td>
  </tr>
</table>
</body>
<script type="text/javascript">
  function edituser() {

  }
  function deleteuser() {
    if (!confirm("确认删除？")){
      return;
    }
    $.ajax({
      url : '/deleteuser?method=deleteUser&id='+id,
      type: 'post',
      dataType: 'json',
      success : function (data){

      }
    });
  }
</script>
</html>
