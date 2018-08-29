<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>入力された住所の表示</title>
</head>
<body>
	<%
		String msg = (String) request.getAttribute("ads");
	%>
	<h2>住所1の画面</h2>
	<%=msg%><br>
	<input type="button" name="次の画面" value="次の画面へ" onclick="location.href='Kadai1/Next.jsp'">

</body>
</html>