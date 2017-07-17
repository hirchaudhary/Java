<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- ... -->
<a href="/">Dashboard</a>
<h1>Selected Language</h1>
<table>
    <tr>      
        <td><c:out value="${language.name}"/></td>
        <td><c:out value="${language.creator}"/></td>
        <td><c:out value="${language.currentVersion}"/></td>
        <td><a href="/language/delete/${id}">Delete</a></td>
        <td><a href="/language/edit/${id}">Edit</a></td>
    </tr>
</table>
<!-- ... -->