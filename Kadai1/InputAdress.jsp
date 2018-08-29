<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>住所入力</title>
</head>
<body>
	※住所送信フォーム
	<br>
	<form  action="../AdressServlet1" method="post">
		郵便番号<br> <input type="text" name="post"><br>
		住所1<br> <input type="text" name="text1"><br>
		住所2（番地）<br>
		<input type="text" name="text2"><br>
		<input type="submit" name="submit" value="送信1"/>
		<input type="submit" name="submit2" value="送信2" formaction="../Adress2Servlet"/>
		</form>
</body>
</html>