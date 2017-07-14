<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Ninja Gold</title>
		<link rel="stylesheet" type="text/css" href="css/style.css">
	</head>
	<body style="text-align:center">
		<h1>Your Gold: <c:out value="${gold}"/></h1>
		<br>
		<a href="/reset"><button> Reset</button></a>
		<br>
		<form action="/gold/1" method="POST">
			<h1>Farm</h1>
			<p>(Earns 10-20 golds)</p>
			<input type="submit" value="Farm">
		</form>
		
		<form action="/gold/2" method="POST">
			<h1>Cave</h1>
			<p>(Earns 5-10 golds)</p>
			<input type="submit" value="Cave">
		</form>
		
		<form action=/gold/3 method="POST">
			<h1>House</h1>
			<p>(Earns 2-5 golds)</p>
			<input type="submit" value="House">
		</form>
		
		<form action="/gold/4" method="POST">
			<h1>Casino</h1>
			<p>(Earns/takes 0-50 golds)</p>
			<input type="submit" value="Casino">
		</form>
	
		<br>
		<br>
		<div class="active">
			<c:forEach items="${activities}" var="item">
	    		${item}<br />
			</c:forEach>
		</div>
		
	</body>
</html>