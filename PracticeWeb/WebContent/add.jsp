<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>結果画面～</title>
</head>
<body>
<%
request.setCharacterEncoding("UTF-8");
String num1int = request.getParameter("num1");
String num2int = request.getParameter("num2");
int i1 = Integer.parseInt(num1int);
int i2 = Integer.parseInt(num2int);
int result = i1 + i2;
%>
計算の結果
<%= num1int %>+<%= num2int %>＝<%= result %>
</body>
</html>