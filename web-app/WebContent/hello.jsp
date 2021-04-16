<%@ page import = "java.util.Date" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Servlet Using JSP</title>
</head>
<body>

<h1>Hello world!!!</h1>
<h2>Hello Servlet</h2>
<%int counter = 1015; %>
<h3>the visitor no: <%= ++counter %></h3>
<% Date now = new Date(); %>
<h3> Log: <%=now %></h3>
</body>
</html>