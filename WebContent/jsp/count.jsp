<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head><title>カウンター</title></head>
<body>

<% int cnt = Integer.parseInt(request.getParameter("cnt"));

  for (int i=0; i<=cnt; i++){ %>

  Hello JSP count = <%= i %> <br>

<% } %>
