<%@page import="adress.UserAdressBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean id="user_name" scope="session" class="adress.UserAdressBean" />
//jsp:use

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>入力された住所の表示</title>
</head>
<body>
	<%
	    UserAdressBean name =(UserAdressBean)session.getAttribute("user_name");
		String ne = name.getUserName();
		String msg = (String) request.getAttribute("ads");
	%>
	<h2>住所2の画面</h2>

	DBを郵便番号で検索して名前を取得
	<p>isp:Beansのidで取得した名前:<%=user_name.getUserName() %></p>
	<p>importで取得した名前:<%=ne%>
	<p>リクエストスコープから取得した住所:<%=msg%></p>
	<input type="button" name="戻る" value="戻る"
		onclick="location.href='Kadai1/InputAdress.jsp'">
	<input type="button" name="戻る" value="戻る" onclick="history.back()">
</body>
</html>