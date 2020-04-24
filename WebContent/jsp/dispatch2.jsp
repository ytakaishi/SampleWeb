<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	//パラメータの取得
	String data = (String)request.getAttribute("data");
%>

<html>
	<head>
		<title>サーブレットから値</title>
	</head>

	<body>
		<p>
			サーブレットから値の受け渡し<br><br>
			<%= data %>
		</p>
	</body>
</html>