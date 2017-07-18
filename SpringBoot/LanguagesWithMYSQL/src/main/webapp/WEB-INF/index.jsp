<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- ... -->
<form:form method="POST" action="/language/add" modelAttribute="language">
    <form:label path="name">Name
    <form:input path="name"/>
    <form:errors path="name"/>
    </form:label><br>
    
    <form:label path="creator">Creator
    <form:input path="creator"/>
    <form:errors path="creator"/>
    </form:label><br>
    
    <form:label path="currentVersion">Current Version
    <form:input path="currentVersion"/>
    <form:errors path="currentVersion"/>
    </form:label><br>
    
    <input type="submit" value="Submit"/>
</form:form>
<!-- ... -->

<h1>All Languages</h1>
<table>
<c:forEach items="${languages}" var="language" varStatus="loop">
    <tr>      
        <td><a href="/language/about/${language.id}"><c:out value="${language.name}"/></a></td>
        <td><c:out value="${language.creator}"/></td>
        <td><c:out value="${language.currentVersion}"/></td>
        <td><a href="/language/delete/${language.id}">Delete</a></td>
        <td><a href="/language/edit/${language.id}">Edit</a></td>
    </tr>
</c:forEach>
</table>
<!-- ... -->
