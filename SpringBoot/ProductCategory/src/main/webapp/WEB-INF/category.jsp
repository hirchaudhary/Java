<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Products</title>
	</head>
	<body style="text-align:center">

		<a href="/">Go Home</a><br>
		<h1>New Category</h1>
		<form:form method="POST" action="/category/new" modelAttribute="category">
	    <form:label path="name">Name
	    <form:input path="name"/>
	    <form:errors path="name"/>
	    </form:label><br>
	    
	   	<input type="submit" value="Add Category"/>
		</form:form>		
	</body>
</html>