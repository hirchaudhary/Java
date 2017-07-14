<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Counter</title>
		<link rel="stylesheet" type="text/css" href="css/style.css">
	</head>
	<body style="text-align:center">
		<h1>Submitted Info.</h1>
		<h3>Name:				<c:out value="${name}"/></h3>
		<h3>Dojo Location:		<c:out value="${location}"/></h3>
		<h3>Favorite Language:	<c:out value="${language}"/></h3>
		<h3>Description:		<c:out value="${description}"/></h3>
	</body>
</html>