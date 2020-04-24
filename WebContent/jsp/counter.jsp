<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
	<head><title>カウンター</title></head>
	<body>
		<% for (int i = 0; i<3; i++){ %>
		  Hello JSP count = <%= i %> <br>
		<% } %>
	</body>
</html>
