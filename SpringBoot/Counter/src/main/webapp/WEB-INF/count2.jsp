<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Counter</title>
	</head>
	<body style="text-align:center">
		<h3>You visited our website <c:out value="${count2}"/> times.</h3>
		<a href="/">Test Another Visit?</a>
		<a href="/reset">Reset</a>
	</body>
</html>