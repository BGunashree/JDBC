<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="login" method="post">
    <label for="email">Email:</label>
    <input type="email" id="email" name="email" />
    <br><br>
    <label for="password">Password:</label>
    <input type="password" id="password" name="password" />
    <br><br>
    <input type="submit" value="login">
    <h1><span style="color:green">${message}</h1>
    <h2><span style="color:red">${message1}</h2>
</form>
</body>
</html>