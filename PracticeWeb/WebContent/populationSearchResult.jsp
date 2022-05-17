<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "entity.Country" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>検索結果画面</title>
</head>
<body>
<%
int population = (int)request.getAttribute("population");
Country country = (Country)request.getAttribute("country");
%>

<h2>検索結果（人口<%= population %>人以上）</h2>
<%
if(country == null){
%>
該当するデータはありませんでした。
<%
} else {
%>
<table border="5">
<tr>
<th>ID</th>
<th>国名</th>
<th>首都</th>
<th>人口</th>
<th>面積(km2)</th>
<th>人口密度(人/km2)</th>
</tr>
<tr>
<td><%= country.getId() %></td>
<td><%= country.getCountry() %></td>
<td><%= country.getCapital() %></td>
<td><%= country.getPopulation() %></td>
<td><%= country.getArea() %></td>
<td><%= country.getDensity() %></td>
</tr>
</table>
<%
}
%>
</body>
</html>