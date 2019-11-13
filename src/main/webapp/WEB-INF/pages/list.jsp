<%--
  Created by IntelliJ IDEA.
  User: zhoumin
  Date: 2019/11/12
  Time: 6:18 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>查询所有的用户</h2>
    <c:forEach items="${list}" var="user">
    ${user.name}
    </c:forEach>
</body>
</html>
