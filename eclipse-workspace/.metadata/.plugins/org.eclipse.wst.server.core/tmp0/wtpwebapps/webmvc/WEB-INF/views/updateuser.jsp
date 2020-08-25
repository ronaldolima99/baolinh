<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
 rel="stylesheet">
<script src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>

</head>
<body>
 <div class="container">
  <div class="col-md-offset-2 col-md-7">
   <div class="panel panel-info">
    <div class="panel-heading">
     <div class="panel-title">Update User</div>
    </div>
    <div class="panel-body">
    
    <%-- <c:url var="saveUser" value="/user/update"/> --%>
    <%--  action="${saveUser}" --%> 
    
     <form:form cssClass="form-horizontal"
      method="post" modelAttribute="user"  >
      

      <!-- need to associate this data with customer id -->
      <form:hidden path="id" value="${user.id }" />

      <div class="form-group">
       <label for="name" class="col-md-3 control-label">Name
        </label>
       <div class="col-md-9">
        <form:input path="name" cssClass="form-control"  value="${user.name }"/>
       </div>
      </div>
      <div class="form-group">
       <label for="phone" class="col-md-3 control-label">Phone Number
        </label>	
       <div class="col-md-9">
        <form:input path="phone" cssClass="form-control" value="${user.phone }" />
       </div>
      </div>
      
     
      
      <div class="form-group">
       <!-- Button -->
       <div class="col-md-offset-3 col-md-9">
        <form:button cssClass="btn btn-primary">Submit</form:button>
       </div>
      </div>

     </form:form>
    </div>
   </div>
  </div>
 </div>
</body>
</html>