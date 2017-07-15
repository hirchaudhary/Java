<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>Code</title>
	</head>
	<body style="text-align:center">
		<div>
		<br>
		<h2>What is the code?</h2>
		<br>
        <form action="/checkCode" method="post">
             <label for="name">Name:</label>
             <input type="text" name="code">
             <input type="submit" value="Try Code">
        </form>

        <p style="color:red"><c:out value="${error}"/></p>
        </div>
	</body>
</html>