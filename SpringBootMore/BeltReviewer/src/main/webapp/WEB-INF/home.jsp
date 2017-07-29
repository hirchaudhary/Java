<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE HTML>
<html>
<head>
	<title>RINGS OF POWER</title>
	<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
	<div class="container">
		<form method="POST" action="/logout">
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
			<br>
			<input id="logout" type="submit" value="Logout" />
		</form>

		<h1>Welcome, <c:out value="${currentUser.firstName}"/> <c:out value="${currentUser.lastName}" /> </h1>
		<p>
			Welcome to your awesome magical ring finder. Put the ring on and only good things will happen.
			Maybe it'll make you live forever, go invisible, turn your inherent hunger for riches or power into an insatiable
			curse that eventually dooms your entire species.
		</p>

		<form action="/user/ring/${currentUser.id}" method="post">
			<label for="ring">Rings Of Power
				<select id="ring" name="ring">
					<c:forEach items="${rings}" var="ring">
						<option value="${ring[0]}"> <c:out value="${ring[1]}" /> </option>
					</c:forEach>
				</select>
			</label>
			<input type="submit" value="BIND YOURSELF IN DARKNESS"></input>
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
		</form>
		<c:if test="${restrict != null}">
        <c:out value="${restrict}"></c:out>
    </c:if>
		<h3><a href="/ring/add/${currentUser.id}">Ring Creator</a></h3>
		<h3><a href="/guild/add/${currentUser.id}">Person/Team Creator</a></h3>		

		<table>
			<tr>
				<th>Rings you have found</th>
				<th>Action</th>
			</tr>
			
			<c:forEach items="${currentUser.rings}" var="ring">
				<tr>
					<td><c:out value="${ring.name}"/></td>
					<td><a href="/user/ring/delete/${ring.id}">Lose The Ring (Delete)</a></td>
				</tr>
			</c:forEach>
		</table>	
	</div>
</body>
</html>
