<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Of Student</title>
</head>
<body>
	<c:forEach items="${ customers}" var="customer">
		<c:out value="${customer.id }"></c:out>
		<c:out value="${customer.fullName }"></c:out>
		<c:out value="${customer.email }"></c:out>
		<br>
	</c:forEach>
</body>
</html>