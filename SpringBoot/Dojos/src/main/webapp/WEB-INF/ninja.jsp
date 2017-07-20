<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Ninjas</title>
	</head>
	<body style="text-align:center">
		<a href="/">Go Home</a><br>
		
		<h1>New Ninja</h1>
		<form:form method="POST" action="/ninja/new" modelAttribute="ninja">
		<form:label path="dojo">Dojo
			<form:select path="dojo">
				<c:forEach items="${dojos}" var="dojo">
					<form:option value="${dojo.id}">${dojo.name}</form:option>
				</c:forEach>
			</form:select>
		</form:label><br>
		
	    <form:label path="firstName">First Name
	    <form:input path="firstName"/>
	    <form:errors path="firstName"/>
	    </form:label><br> 
	 	
	 	<form:label path="lastName">Last Name
	    <form:input path="lastName"/>
	    <form:errors path="lastName"/>
	    </form:label><br> 
	    
	    <form:label path="age">Age
	    <form:input path="age"/>
	    <form:errors path="age"/>
	    </form:label><br> 
	    <input type="submit" value="Create"/>
		</form:form>
		
	</body>
</html>