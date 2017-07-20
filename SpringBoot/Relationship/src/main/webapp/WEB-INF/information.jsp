<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Driver's License</title>
	</head>
	<body style="text-align:center">
		<a href="/">Go Home</a>
		<c:forEach items="${licenses}" var="license">
			<h1 style="border:2px solid black">${license.person.firstName} ${ license.person.lastName }</h1>
			<p>License Number: ${ license.number}</p>
			<p>State: ${license.state}</p>
			<p>Expitation Date: <fmt:formatDate pattern = "MM/dd/yyyy" value = "${license.expiration_date}" /></p>
		</c:forEach>
	</body>
</html>