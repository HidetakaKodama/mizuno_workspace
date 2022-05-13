<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>結果画面</title>
</head>
<body>
<%
request.setCharacterEncoding("UTF-8");
String str = request.getParameter("comment");
%>
あなたが入力した文章は以下です。<br>
「<%= str %>」<br>
文字数は<%= str.length() %>です。
</body>
</html>