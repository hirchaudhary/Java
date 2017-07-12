<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Counter</title>
	</head>
	<body>
	<form action='/Counter/Counter' method='get'>
        <input type='submit' value='Submit'>
    </form>
    <h1>You clicked this button for <%=session.getAttribute("count") %></h1>
	</body>
</html>