<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="../StyleSheets/StyleSheet.css" rel="stylesheet" type="text/css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Amelia's Blog</title>
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
				<li><a href="../index.jsp">Home</a></li>
				<li><a href="../Blog.jsp">Blog</a></li>
				<li class="active"><a href="../Research.jsp">Research</a></li>
				<li><a href="../Links.jsp">Links</a></li>
				<li><a href="../Surveys.jsp">Surveys</a></li>
			</ul>
		</div>
	<!-- Everything for the side navigation within is within this div. This will change based on which heading tab is clicked-->
	<div id="SideBarDiv">
		<ul class="side-nav list-unstyled">
			<li><a href="../Research/Research1.jsp">Research Paper 1</a></li>
			<li class="active"><a href="../Research/Research2.jsp">Research Paper 2</a></li>
		</ul>
	</div>
	<!-- This is the div where the main content will go. This will changed based on what is clicked (heading and side bar tabs)-->
	<div id="MainBodyDiv">
		<h4>Research Paper 2 Title</h4>
		<p>
		<p>Brief outline of the research paper and what it will discuss... </p>
		<p>
		
	</div>
	<div id="FooterDiv">
	<!-- Place Copyright stuff here -->
	
	</div>
</div>
</body>
</html>