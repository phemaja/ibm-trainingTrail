<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Login Page</title>
	</head>
	<body>
		<h2>Login Screen</h2>
		<form method= "post" action="login.do">
			User Id <input name = "userid"><br>
			Password <input type="password" name = "passwd"><br>
			<input type="submit" value="login">
		</form>
	</body>
</html>