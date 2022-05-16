<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>セッション破棄</title>
</head>
<body>
<h2>セッション破棄後のページ</h2>
住まい：
<%= session.getAttribute("home") %><br>
趣味：
<%= request.getAttribute("hobby") %><br>
</body>
</html>