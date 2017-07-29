<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration Page</title>
</head>
<body>
    <h1>Register Here!</h1>
	<c:if test="${userExists != null}">
			<c:out value="${userExists}"></c:out>
	</c:if>
    <form:form method="POST" action="/registration" modelAttribute="user">
        <p>
            <form:label path="firstName">First Name:</form:label>
            <form:input path="firstName"/><form:errors path="firstName"/>
        </p>
        <p>
            <form:label path="lastName">Last Name:</form:label>
            <form:input path="lastName"/><form:errors path="lastName"/>
        </p>
        <p>
            <form:label path="username">Username:</form:label>
            <form:input path="username"/><form:errors path="username"/>
        </p>
        <p>
            <form:label path="email">Email address:</form:label>
            <form:input path="email"/><form:errors path="email"/>
        </p>
        <p>
            <form:label path="password">Password:</form:label>
            <form:password path="password"/><form:errors path="password"/>
        </p>
        <p>
            <form:label path="passwordConfirmation">Password Confirmation:</form:label>
            <form:password path="passwordConfirmation"/><form:errors path="passwordConfirmation"/>
        </p>
        <input type="submit" value="Register!"/>
    </form:form>
    ------------------------------------------------------------------------------------------------
    <h1>Login</h1>
    <c:if test="${logoutMessage != null}">
        <c:out value="${logoutMessage}"></c:out>
    </c:if>
    <form method="POST" action="/login">
        <p>
            <label for="username">Email Address</label>
            <input type="text" id="username" name="username"/>
        </p>
        <p>
            <label for="password">Password</label>
            <input type="password" id="password" name="password"/>
        </p>
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        <input type="submit" value="Login!"/>
    </form>
    <c:if test="${errorMessage != null}">
    	<c:out value="${errorMessage}"></c:out>
	</c:if>
</body>
</html>