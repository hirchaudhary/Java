<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<h1>Top 10 Songs</h1>
<a href="/dashboard">Dashboard</a>
<table>
	<tr>
		<th>Name</th>
		<th>Rating</th>
		<th>Action</th>
	</tr>
	<c:forEach items="${songs}" varStatus="loop" var="song">
    <tr>      
    	<td><c:out value="${song.rating}"/></td>  
        <td><c:out value="${song.name}"/></td>
        <td><c:out value="${song.artist}"/></td>
    </tr>
	</c:forEach>
</table>