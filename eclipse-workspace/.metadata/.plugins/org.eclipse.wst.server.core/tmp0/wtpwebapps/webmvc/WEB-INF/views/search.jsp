<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>looking for user</title>
</head>
<body>
	<form:form method="post" modelAttribute="user">

		<table>
			<tr>
				<td>Enter your name:</td>
				<td><form:input path="name" /></td>
				<td><form:errors path="name" cssStyle="color: #ff0000;" /></td>
			</tr>
			<tr>
				<td>Enter your phone</td>
				<td><form:input path="phone" /></td>
				<td><form:errors path="phone" cssStyle="color: #ff0000;" /></td>
			</tr>
			<tr>
				<td><input type="submit" name="submit" value="Search User"></td>
			</tr>
			<tr>
		</table>
	</form:form>

	<div class="panel-title">User List</div>
	
	<%-- <tr>
				<th>Id</th>
				<th>Name</th>
				<th>Phone</th>
			</tr>
	
	<c:forEach items="${ users}" var="user">
		<c:out value="${user.id }"></c:out>
		<c:out value="${user.name }"></c:out>
		<c:out value="${user.phone }"></c:out>
		<br>
	</c:forEach> --%>
	 </div>
	<div class="panel-body">
		<table class="table table-striped table-bordered">
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Phone</th>
			</tr>

			<!-- loop over and print our customers -->
			<c:forEach var="tempUser" items="${users}">

				<tr>
					<td>${tempUser.id}</td>
					<td>${tempUser.name}</td>
					<td>${tempUser.phone}</td>
				</tr>

			</c:forEach>

		</table>

	</div>
	</div> 
	</div>
</body>
</html>