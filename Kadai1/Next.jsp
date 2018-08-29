<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>セッション情報受け取り</title>
</head>
<body>
<%
String msg = (String)request.getAttribute("ads");

String nxt = (String)session.getAttribute("nads");
%>

<p>リクエスト<%=msg %>
<p>セッション<%=nxt %>

</body>
</html>