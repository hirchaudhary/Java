<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- ... -->
<a href="/">Dashboard</a>
<h1>Selected Language</h1>
<p><c:out value="${language.name}"/></p>
<p><c:out value="${language.creator}"/></p>
<p><c:out value="${language.currentVersion}"/></p>
<a href="/language/delete/${language.id}">Delete   </a>
<a href="/language/edit/${language.id}">   Edit</a>
<!-- ... -->