<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Categories</title>
	</head>
	<body>

		<a href="/">Go Home</a><br>
		<h1>${category.name}</h1>
		<Strong>Products:</Strong>
		<c:forEach items="${category.products}" var="pc">
			<p>${pc.name}</p>
		</c:forEach>
		<h2>Add Product:</h2>
		<form:form method="POST" action="/addProduct/${category.id}" modelAttribute="product">
	   <form:label path="name">
			<form:select path="name">
				<c:forEach items="${products}" var="product">
					<form:option value="${product.id}">${product.name} </form:option>
				</c:forEach>
			</form:select>
		</form:label>	    
	   	<input type="submit" value="Add Product"/>
		</form:form>	
	</body>
</html>