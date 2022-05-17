<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>検索画面</title>
</head>
<body>
<h2>国データベース検索システム</h2>
<form action = "./PopulationSearchServlet" method="post">
<p>◆人口で検索</p>
<input type="text" name="population">
<p>以上で</p>
<input type="submit" value="検索">
</form>

<form action = "./AreaSearchServlet" method="post">
<p>◆面積で検索</p>
<input type="text" name="menseki">
<p>平方km以上で</p>
<input type="submit" value="検索">
</form>
</body>
</html>