<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>jdbc</title>
</head>
<body>
<form action="send" method="post">

		<label >Id</label><br>
        <input type="number" id="id" name="id"><br><br>
		
		<label >Company Name</label><br>
        <input type="text" id="name" name="name"><br><br>

        <label >Email</label><br>
        <input type="email" id="email" name="email"><br><br>

        <label>Password</label><br>
        <input type="password" id="password" name="password"><br><br>

        <label>Address</label><br>
        <input type="text" id="address" name="address"><br><br>

        <label>Phone Number</label><br>
        <input type=number id="phone_number" name="phone_number"><br><br>

        <label>Industry Type</label><br>
        <input type="text" id="industry_type" name="industry_type"><br><br>

        <input type="submit" value="Register">
     </form>
     
     
     
<span style="color:green">${success}</span>
<span style="color:red">${failure}</span>

     
  </body>
</html>