<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Admin Page</title>
</head>
<body>
    <h1>Welcome <c:out value="${currentUser.firstName}"></c:out></h1>
    <form id="logoutForm" method="POST" action="/logout">
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        <input type="submit" value="Logout!" />
    </form>
    <table>
    	<tr>
    		<th>Name</th>
    		<th>Email</th>
    		<th>Action</th>
    	</tr>
    	<c:forEach items="${allUsers}" var="user">
			<tr>
				<td><c:out value="${user.firstName}" /> <c:out value="${user.lastName}" /></td>
				<td><c:out value="${user.username}" /></td>
				<c:choose>
					<c:when test="${user.isAdmin()}">
						<td>Admin</td>					
					</c:when>	
					<c:otherwise>
						<td><a href="/user/delete/${user.id}">Delete</a> <a href="/user/makeAdmin/${user.id}">Make-Admin</a></td>
					</c:otherwise>
				</c:choose>						
			</tr>
		</c:forEach>
	</table>
</body>
</html>
