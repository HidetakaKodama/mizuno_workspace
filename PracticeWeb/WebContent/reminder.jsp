<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>結果～</title>
</head>
<body>
<%
String int1 = (String) request.getAttribute("int1");
%>
<%
String int2 = (String) request.getAttribute("int2");
%>
<%
String result = (String) request.getAttribute("result");
%>
<%=int1 %>
%
<%=int2 %>
=
<%=result %>
</body>
</html>