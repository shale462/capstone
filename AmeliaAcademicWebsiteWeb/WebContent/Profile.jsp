<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="StyleSheets/StyleSheet.css" rel="stylesheet" type="text/css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Amelia's Academic Website</title>
</head>
<body>
<!-- Everything inside the website is within the container div -->
<div id="ContainerDiv">
	<div id="HeaderDiv">
	<!-- Place a photo/logo here -->
		
	<!-- Link for Register & Login Page -->
		<a href="Login.jsp" style= "float:right; padding: 15px;">Register/Login</a>
	</div>
	<!-- Navigation Bar -->
	<div id="NavDiv">
			<ul class="nav nav-pills nav-justified">
				<li><a href="index.jsp">Home</a></li>
				<li><a href="Blog.jsp">Blog</a></li>
				<li><a href="Research.jsp">Research</a></li>
				<li><a href="Links.jsp">Links</a></li>
				<li><a href="Surveys.jsp">Surveys</a></li>
			</ul>
		</div>
	<!-- Everything for the side navigation within is within this div. This will change based on which heading tab is clicked-->
	<div id="SideBarDiv">
		<ul class="side-nav list-unstyled">
			<li><a href="">Profile</a></li>
			<li><a href="">Preferences</a></li>
			<li><a href="">Delete Account</a></li>
		</ul>
	</div>
	<!-- This is the div where the main content will go. This will changed based on what is clicked (heading and side bar tabs)-->
	<div id="MainBodyDiv">
		<h3>Profile</h3>
		<br />
		<form action="">
		  <label for="firstName">First Name:</label>
		  <input type="text" name="firstName" id="firstName" value="firstName"><br>
		  <label for="lastName">Last Name:</label>
		  <input type="text" name="lastName" id="lastName" value="lastName"><br>
		  <label for="sex">Sex:</label>
		  <select>
			  <option value="female">Female</option>
			  <option value="male">Male</option>
			  <option value="transgender">Transgender</option>
			  <option value="notSay">Prefer Not To Say</option>
			</select>
			<br />
		  <input type="submit" value="Save Changes">
		</form>
	</div>
	<div id="FooterDiv">
	<!-- Place Copyright stuff here -->
	
	</div>
</div>
</body>
</html>