<%@page import="com.hiral.belt.services.UserService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page import="java.util.Date,java.text.SimpleDateFormat,java.text.ParseException"%> 

<!DOCTYPE HTML>
<html>
<head>
	<title>Fool Creator!</title>
	<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
	<div class="container">
	<h1>Welcome Iluvator</h1>
		<form method="POST" action="/logout">
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
			<br>
			<input id="logout" type="submit" value="Logout" />
		</form>
		<table>
			<tr>
				<th>Rings you have found</th>
				<th>Guilds</th>
				<th>Age</th>
				<th>Action</th>
			</tr>
			
			<c:forEach items="${allUsers}" var="user" varStatus="status">
				
				<tr>
					<td><c:out value="${user.firstName}"/></td>
					<td><c:forEach items="${user.guilds}" var="guild">
						<c:out value="${guild.name}"/>
					</c:forEach></td>
					<td>
					<c:out value="${dates[status.index]}"/>
					</td>
					<td><a href="/user/delete/${user.id}/${currentUser.id}">Destroy</a> / <a href="/user/makeAdmin/${user.id}/${currentUser.id}">Make Admin</a></td>
				</tr>
			</c:forEach>
			
		</table>
		<h3>Create new Guild</h3>
		<form:form method="POST" action="/guild/add/${currentUser.id}" modelAttribute="guild">
			<p>
	            <form:label path="name">Guild Name:</form:label>
	            <form:input path="name"/><form:errors path="name"/>
	        </p>
	        <p>
	            <form:label path="size">Guild Size:</form:label>
	            <form:input path="size"/><form:errors path="size"/>
	        </p>
	        <input type="submit" value="Create Guild"/>
		</form:form>
		
		<br>
		<form action="/user/guild/add" method="post">
			<label for="user">Name
				<select id="user" name="user">
					<c:forEach items="${allUsers}" var="user">
						<option value="${user.id}"> <c:out value="${user.firstName}" /> </option>
					</c:forEach>
				</select>
			</label>
			<label for="guild">Guild
				<select id="guild" name="guild">
					<c:forEach items="${guilds}" var="guild">
						<option value="${guild.id}"> <c:out value="${guild.name}" /> </option>
					</c:forEach>
				</select>
			</label>
			<input type="submit" value="BIND YOURSELF IN DARKNESS"></input>
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
		</form>
	</div>
</body>
</html>
