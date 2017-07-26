<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<div id="ninjas">
	<a href="/">Go Home</a><br>
	<h1>Ninjas</h1>
	Page Number : 
	<c:forEach begin="1" end="${totalPage}" var="index">
	    <a href="/page/${index}">${index}</a>
	</c:forEach>
	<br><br>
	<table>
	        <tr>
	                <th>First Name</th>
	                <th>Last Name</th>
	        </tr>
	        <tbody>
	                <c:forEach var="dojo" items="${dojos.content}">                               
	                <tr>
	                        <td><c:out value="${dojo.firstName}"></c:out></td>
	                        <td><c:out value="${dojo.lastName}"></c:out></td>
	                </tr>
	                </c:forEach>
	        </tbody>
	</table>
</div>
