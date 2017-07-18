<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<a href="/language/delete/${id}">Delete</a>
<a href="/">Dashboard</a>
<!-- ... -->
<form:form method="POST" action="/language/edit/${id}" modelAttribute="language">
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