<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ページ①</title>
</head>
<body>
<h2>ページ①</h2>
住まい：
<%= session.getAttribute("home") %><br>
趣味：
<%= request.getAttribute("hobby") %><br>
<a href="./addressHobby2.jsp">次の画面へ</a>
</body>
</html>