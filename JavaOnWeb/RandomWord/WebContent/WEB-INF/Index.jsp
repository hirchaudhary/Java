<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body style="text-align:center">
	<h1>You Generated Random number <%=session.getAttribute("count") %> times</h1>
	<form action='/RandomWord/RandomWord' method='get'>
        <input type='submit' value='Generate'>
    </form>
    <h1><%=session.getAttribute("word") %></h1>
    <h1>The last time you generated a word...</h1>
    <h3><%=session.getAttribute("date") %></h3>
</body>
</html>