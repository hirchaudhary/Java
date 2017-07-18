<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<table>
	<tr>
		<th>Name</th>
		<th>Rating</th>
		<th>Action</th>
	</tr>
	<c:forEach items="${byArtist}" var="song">
    <tr>      
        <td><a href="/song/about/${song.id}"><c:out value="${song.name}"/></a></td>
        <td><c:out value="${song.rating}"/></td>
        <td><a href="/song/delete/${song.id}">Delete</a></td>
    </tr>
	</c:forEach>
</table>

