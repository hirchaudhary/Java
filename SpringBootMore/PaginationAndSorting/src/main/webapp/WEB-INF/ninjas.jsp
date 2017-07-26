<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<div id="ninjas">
	<a href="/">Go Home</a><br>
	<h1>Ninjas</h1>
	Page Number : 
	<c:forEach begin="1" end="${totalPages}" var="index">
	    <a href="/pages/${index}">${index}</a>
	</c:forEach>
	<br><br>
	<table>
	        <tr>
	                <th>First Name</th>
	                <th>Last Name</th>
	        </tr>
	        <tbody>
	                <c:forEach var="ninja" items="${ninjas.content}">                               
	                <tr>
	                        <td><c:out value="${ninja.firstName}"></c:out></td>
	                        <td><c:out value="${ninja.lastName}"></c:out></td>
	                </tr>
	                </c:forEach>
	        </tbody>
	</table>
</div>
