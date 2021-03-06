<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%-- <!DOCTYPE html>
<html>
   <head>
      <style>
         table, th, td {
            border: 1px solid black;
         }
      </style>
   </head>
<meta charset="ISO-8859-1">
<title>List Of User</title>
</head>
<body>
      <h1>Programming Languages</h1>
      <c:forEach items="${ users}" var="user">
      <table>
         <tr>
            <th>ID</th>
            <th>NAME</th>
            <th>PHONE</th>
            <th>DATE</th>
         </tr>
         <tr>
            <td><c:out value="${user.id }"></c:out></td>
            <td><c:out value="${user.name }"></c:out></td>
            <td><c:out value="${user.phone }"></c:out></td>
            <td><c:out value="${user.date }"></c:out></td>
         </tr>
         <br>
         
      </table>
      
      </c:forEach>
   </body>
</html> --%>


<!-- ------------------------------------------------------------------------------------------ -->





<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>javaguides.net</title>
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
 rel="stylesheet">
<script src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
</head>
<body>
 <div class="container">
  <div class="col-md-offset-1 col-md-10">
   <h2>CRM - User Relationship Manager</h2>
   <hr />

   <input type="button" value="Add User"
    onclick="window.location.href='showForm'; return false;"
    class="btn btn-primary" />
    <br/><br/>
   <div class="panel panel-info">
    <div class="panel-heading">
     <div class="panel-title">User List</div>
    </div>
    <div class="panel-body">
     <table class="table table-striped table-bordered">
      <tr>
       <th>Name</th>
       <th>Phone</th>
       <th>Action</th>
      </tr>

      <!-- loop over and print our customers -->
      <c:forEach var="tempUser" items="${users}">

       <!-- construct an "update" link with customer id -->
       <c:url var="updateLink" value="/user/update">
        <c:param name="userId" value="${tempUser.id}" />
       </c:url>

       <!-- construct an "delete" link with customer id -->
       <c:url var="deleteLink" value="/user/delete">
        <c:param name="userId" value="${tempUser.id}" />
       </c:url>

       <tr>
        <td>${tempUser.name}</td>
        <td>${tempUser.phone}</td>

        <td>
         <!-- display the update link --> <a href="${updateLink}">Update</a>
         | <a href="${deleteLink}"
         onclick="if (!(confirm('Are you sure you want to delete this user?'))) return false">Delete</a>
        </td>

       </tr>

      </c:forEach>

     </table>

    </div>
   </div>
  </div>

 </div>
</body>
</html>
