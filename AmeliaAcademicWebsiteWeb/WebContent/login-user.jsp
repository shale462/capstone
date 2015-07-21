<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login - User</title>
</head>
<body>
<h1>Login User</h1>
<%
	String error_message = "";
	Object error = request.getAttribute("error");
	if (error != null) error_message = error.toString();
%>

<form action="UserServlet" method="post">
	<label for="Username">Username:</label>
		  <input type="text" name="username" id="username" value="username"><br>
		  <%=error_message %>
		  <label for="Password">Password:</label>
		  <input type="text" name="password" id="password" value="password"><br>
		  <input type="submit" value="Submit">
		  <p><a href="Register.jsp">Not registered? Register here!</a>
</form>
</body>
</html>