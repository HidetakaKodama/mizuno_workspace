<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>結果～</title>
</head>
<body>
<%=request.getAttribute("int1")
%>
%
<%=request.getAttribute("int2")
%>
=
<%=request.getAttribute("resultNum")
%>

</body>
</html>