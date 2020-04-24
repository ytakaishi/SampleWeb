<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
<head><title>ログイン</title>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
</head>
<body>
  <font size="4">
    <strong>ログイン画面</strong>
  </font><br>
  <form method="post" action="/SampleWeb/loginUserConf">
    <table>
    <tr>
    <td>ＩＤ：</td><td><input type="text" size="20" name="id"></td>
    </tr><tr>
    <td>ＰＡＳＳ：</td><td><input type="password" size="20" name="pass"></td>
    </tr></table><br>
    <input type="submit" name="submit" value="ログイン">
    <input type="reset" name="reset" value="リセット">
  </form>
</body>
</html>
