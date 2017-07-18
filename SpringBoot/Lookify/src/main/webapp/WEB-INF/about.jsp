<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<body style="text-align:center">

<a href="/dashboard">Dashboard</a>
<br><br>
Title:    <c:out value="${song.name}"/><br>
Artist:   <c:out value="${song.artist}"/><br>
Rating:   <c:out value="${song.rating}"/><br>
<a href="/song/delete/${song.id}">Delete</a>
</body>
