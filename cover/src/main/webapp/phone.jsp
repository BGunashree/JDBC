<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>email and password</title>
</head>
<body>
<form action="phone" method="post">
<label>Phone Number</label>
<br>
<input type="number" name="contactNumber">
<br>
<br>
<input type="submit" value="SEARCH" style="color:blue">
</form>

<span style="color:blue">${success}</span>
<span style="color:red">${failure}</span>
</body>
</html>