<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>data</title>
</head>
<body>
<form action="search" method="post">
Id<input type="search" name="id">

<input type="submit"  value="SEARCH" style="color:blue">

<span style="color:green">${id}</span>
</form>
</body>
</html>