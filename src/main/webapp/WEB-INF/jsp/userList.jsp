<%--
  Created by IntelliJ IDEA.
  User: xuchenyi
  Date: 5/4/2019
  Time: 11:24 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" pageEncoding="utf-8" %>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<h2>This is SpringMVC demo page</h2>
<c:forEach items="${users}" var = "user">

    <c:out value="${user.userName}"/><br/>
    <c:out value="${user.age} dd"/><br/>
</c:forEach>