<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>予定一覧</title>
</head>
<body>
<%
String[] array = (String[])request.getParameterValues("array");
%>
<h2>登録した予定一覧</h2>
<p>予定１：</p>
<%= array %>
<p>予定２：</p>
<%= session.getAttribute("array[]") %>
<p>予定３：</p>
<%= session.getAttribute("array") %>
<p>予定４：</p>
<%= session.getAttribute("array") %>
<p>予定５：</p>
<%= session.getAttribute("array") %>
<a href="./inputToDo">さらに登録</a><br>
<a href="./ResetToDoServlet">リセット</a>
</body>
</html>