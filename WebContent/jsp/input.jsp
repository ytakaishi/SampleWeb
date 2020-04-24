<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
<head>
<title>情報追加</title>
</head>
<meta http-equiv="Content-Type" content="text/html; charset= UTF-8">
<body>
<%if (request.getAttribute("top1") == null && request.getAttribute("top2") == null) { %>
<form method="POST" action=" /SampleWeb/dbInput">
情報を追加します 情報を入力して下さい
<table>
  <tr>
    <td>ＩＤ：</td>
    <td><input type="text" name="id"></td>
  </tr>
  <tr>
    <td>名前：</td>
    <td><input type="text" name="name"></td>
  </tr>
  <tr>
    <td>年齢：</td>
    <td><input type="text" name="age"></td>
  </tr>
</table>
<input type="submit" name="submit" value="確認"></form>
<% } %>
<% if(request.getAttribute("top1") != null){ %>
<form method="POST" action=" /SampleWeb/dbInput">
この情報を登録します。よろしいですか？
<table>
  <tr>
    <td>ＩＤ：</td>
    <td><%= session.getAttribute("id") %></td>
  </tr>
  <tr>
    <td>名前：</td>
    <td><%= session.getAttribute("name") %></td>
  </tr>
  <tr>
    <td>年齢：</td>
    <td><%= session.getAttribute("age") %></td>
  </tr>
</table>
<table>
  <tr>
    <td><input type="submit" name="submit" value="登録"></td>
    </form>
    <form method="POST" action="./jsp/input.jsp">
    <td><input type="submit" name="submit2" value="戻る"></td>
    </form>
  <tr>
</table>
<% } %>
<% if (request.getAttribute("top2") != null) { %>
<form method="POST" action="./jsp/input.jsp">情報を登録しました
<table>
  <tr>
    <td>ＩＤ：</td>
    <td><%= session.getAttribute("id") %></td>
  </tr>
  <tr>
    <td>名前：</td>
    <td><%= session.getAttribute("name") %></td>
  </tr>
  <tr>
    <td>年齢：</td>
    <td><%= session.getAttribute("age") %></td>
  </tr>
</table>
<input type="submit" name="submit2" value="登録画面へ"></form>
<% } %>

</body>
</html>
