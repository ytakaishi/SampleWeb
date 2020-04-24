<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head><title>２乗の表</title></head>
<body>

<table border="1" >
<tr>
<% int inpt = Integer.parseInt(request.getParameter("inpt"));
	 	for(int i=1; i<=inpt;i++){ %>
	<th align="center"><b><%=i %></b></td>
		<% }%>
</tr>
<tr>
	<% for(int i=1; i<=inpt;i++){%>
	<td align="center"><%=i*i %></td>
			<% }%>
</tr>
</table>
</body></html>

