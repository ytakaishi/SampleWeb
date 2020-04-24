<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
<head><title>ログイン</title>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
</head>
<body>
  <form method="post" action="/SampleWeb/loginUser">
  	<%
  			String req_id = (String)request.getAttribute("login_name");
  	%>
	<font size="4">
	<% if (req_id != null) { %>
    	ようこそ <strong><%= req_id%></strong> さん<br>
    <%}else{ %>
    	ユーザーまたはパスワードが違います
    <%} %>
  </font><br>
  <input type="submit" name="submit" value="戻る">
  </form>
</body>
</html>