<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Products</title>
	</head>
	<body>

		<a href="/">Go Home</a><br>
		<h1>${product.name}</h1>
		<Strong>Categories:</Strong>
		<c:forEach items="${product.categories}" var="pc">
			<p>${pc.name}</p>
		</c:forEach>
		<h2>Add Category:</h2>
		<form:form method="POST" action="/addCategory/${product.id}" modelAttribute="category">
	   <form:label path="name">
			<form:select path="name">
				<c:forEach items="${categories}" var="category">
					<form:option value="${category.id}">${category.name} </form:option>
				</c:forEach>
			</form:select>
		</form:label>	    
	   	<input type="submit" value="Add Category"/>
		</form:form>	
	</body>
</html>