<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Queries</title>
	</head>
	<body>
		<a href="/">Go Home</a><br>
		<h1>1. All Dojos</h1>
		<table>
			<tr>
				<th>Location</th>
			</tr>
			<c:forEach items="${allDojos}" var="dojo">
				<tr>
					<td>${dojo.name}</td>
				</tr>
			</c:forEach>
		</table>
		
		<h1>2. Dojo By Id</h1>
		<table>
			<tr>
				<th>Location</th>
			</tr>
			<c:forEach items="${byId}" var="id">
				<tr>
					<td>${id.name}</td>
				</tr>
			</c:forEach>
		</table>
		
		<h1>3. Dojo By Id Using native Queries</h1>
		<table>
			<tr>
				<th>Location</th>
				<th>FirstName
			</tr>
			
			<c:forEach var="dojo" items="${dojos}">                          
                <tr>
                        <td>${dojo[0].name}</td>
                        <td>${dojo[1].firstName} ${row[1].lastName}</td>
                </tr>
                </c:forEach>
			
		</table>
	</body>
</html>