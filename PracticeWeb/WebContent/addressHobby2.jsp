<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ページ②</title>
</head>
<body>
<h2>ページ②</h2>
住まい：
<%= session.getAttribute("home") %><br>
趣味：
<%= request.getAttribute("hobby") %><br>
<a href="./InvalidateServlet">次の画面へ</a>
</body>
</html>