<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Page</title>
</head>
<body>
	<a href="/"><button>Go Home</button></a>
	<h2>Forge Ring of Power</h2>
    <form:form method="POST" action="/ring/add/${user.id}" modelAttribute="ring">
	    <form:input path="name"/>
	    <form:errors path="name"/>
	   	<br>
        <input type="submit" value="Create Ring"/>
	</form:form>
</body>
</html>