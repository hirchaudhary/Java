<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
		<link rel="stylesheet" href="${pageContext.request.contextPath}/static/style.css" type="text/css">
	</head>
<body>
	<div class="wrapper">
		<h1>Checkerboard: <%=request.getParameter("width") %> w * <%=request.getParameter("height") %> h</h1>
		
		<% 	int h;
			int w;
			if(request.getParameter("height") == null || request.getParameter("width") == null){
				h = 0;
				w = 0;
			} else {
				h = Integer.parseInt(request.getParameter("height"));
				w = Integer.parseInt(request.getParameter("width"));
			}
		%>
		
		<% for(int y=0 ; y<h; y++){ %>
			<% if(y%2==0) {%>
				<% for(int x=0 ; x<w; x++) { %>
					<% if(x%2==0) {%>
						<div class="red"></div>
					<% } else {%>
						<div class="black"></div>
					<% } %>
				<% } %>
			<% } else {%>
			<% for(int x=0 ; x<w; x++) { %>
					<% if(x%2==0) {%>
						<div class="black"></div>
					<% } else {%>
						<div class="red"></div>	
					<% } %>
				<% } %>
			<% } %>
			<br>
		<% } %>
	</div>
</body>
</html>