<html>
	<head>
		<title>Sample</title >
	</head >
	<body>
		<h2>JSP Sample</h2>
			1+1 = <%= 1 + 1 %>

			<jsp:forward page="hoge.jsp">
				<jsp:param value="20" name="age"/>
			</jsp:forward>
	</body>
</html >
