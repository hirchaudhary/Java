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

		<a href="/category/new">Add Category</a><br>
		<h1>New Product</h1>
		<form:form method="POST" action="/product/new" modelAttribute="product">
	    <form:label path="name">Name
	    <form:input path="name"/>
	    <form:errors path="name"/>
	    </form:label><br>
	    
	    <form:label path="description">Description
	    <form:textarea path="description"/>
	    <form:errors path="description"/>
	    </form:label><br>
	 	
	 	<form:label path="price">Price
	    <form:input path="price"/>
	    <form:errors path="price"/>
	    </form:label><br>
	    <input type="submit" value="Add Product"/>
		</form:form>	
		<h1>Products</h1>
		<table>
			<tr>
				<th>Name</th>
				<th>Description</th>
				<th>Price</th>
			</tr>
			<c:forEach items="${products}" var="product">
				<tr>
					<td><a href="/product/${product.id}">${product.name}</a></td>
					<td>${product.description}</td>
					<td>${product.price}$</td>
				</tr>
			</c:forEach>
		</table>
		
		<h1>Categories</h1>
		<table>
			<tr>
				<th>Name</th>
			</tr>
			<c:forEach items="${categories}" var="category">
				<tr>
					<td><a href="/category/${category.id}">${category.name}</a></td>
				</tr>
			</c:forEach>		
		</table>
	</body>
</html>






