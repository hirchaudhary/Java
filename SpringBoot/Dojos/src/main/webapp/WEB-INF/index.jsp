<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Dojos</title>
	</head>
	<body style="text-align:center">
		<h1 style="border: 2px solid darkblue; background-color:silver">New Dojo</h1>
		<form:form method="POST" action="/dojo/new" modelAttribute="dojo">
	    <form:label path="name">Name
	    <form:input path="name"/>
	    <form:errors path="name"/>
	    </form:label><br> 
	 
	    <input type="submit" value="Create"/>
		</form:form>
		<a href="/ninja/new">Create Ninja</a><br>
		<h1 style="border: 2px solid darkblue; background-color:silver" >All Dojos</h1>
		<c:forEach items="${dojos}" var="dojo">
			<a href="/dojo/${dojo.id}">${dojo.name}</a><br>
		</c:forEach>
	</body>
</html>