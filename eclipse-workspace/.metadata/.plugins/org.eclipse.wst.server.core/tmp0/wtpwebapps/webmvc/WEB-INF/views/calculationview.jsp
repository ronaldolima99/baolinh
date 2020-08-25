<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Conculation</title>
</head>
<body>
	<form:form method="post" modelAttribute="calculation" action="tinh-toan">
	
			<label for="fname">a</label>
			<form:input type="text" path="a"/><br>
			
			<label for="fname">b</label>
			<form:input type="text" path="b"/><br>
			
		<button type="submit" >plus</button>
	</form:form>
</body>
</html>