<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<body style="text-align:center">
<!-- ... -->
<br>
<a href="/dashboard">Dashboard</a>
<form:form method="POST" action="/addSong" modelAttribute="song">
    <form:label path="name">Title
    <form:input path="name"/>
    <form:errors path="name"/>
    </form:label><br>
    
    <form:label path="artist">Artist
    <form:input path="artist"/>
    <form:errors path="artist"/>
    </form:label><br>
    
    <form:select path="rating">
       	<c:forEach var = "i" begin = "1" end = "10">
        <form:option value="${i}"></form:option>
    	</c:forEach>
	</form:select>
    <input type="submit" value="Submit"/>
</form:form>
</body>
<!-- ... -->