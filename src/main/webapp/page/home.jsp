<%--
  Created by IntelliJ IDEA.
  User: zenghang
  Date: 2018/4/4
  Time: 16:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>HOME</h1>
<table>
    <tr>
        <td>ID</td>
        <td>Name</td>
        <td>Password</td>
    </tr>
    <c:forEach var="user" items="${user}">
        <tr>
            <td> ${user.id}</td>
            <td> ${user.name}</td>
            <td> ${user.password}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
