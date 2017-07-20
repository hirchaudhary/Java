<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Driver's License</title>
	</head>
	<body style="text-align:center">
		<h1>Welcome!</h1>
		<a href="/license/new">Create License</a><br>
		<a href="/person/license">License information</a>
		<h1>Add Person</h1>
		<form:form method="POST" action="/person/new" modelAttribute="person">
	    <form:label path="firstName">First Name
	    <form:input path="firstName"/>
	    <form:errors path="firstName"/>
	    </form:label><br>
	    
	    <form:label path="lastName">Last Name
	    <form:input path="lastName"/>
	    <form:errors path="lastName"/>
	    </form:label><br>
	 
	    <input type="submit" value="Submit"/>
		</form:form>
		
	</body>
</html>