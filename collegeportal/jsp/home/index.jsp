<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="collegeportal.beans.*, java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="icon" href="/collegeportal/images/favicon.ico" type="image/x-icon"/>
<link rel="shortcut icon" href="/collegeportal/images/favicon.ico" type="image/x-icon"/> 

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
<title>College Portal</title>
</head>
<body>

<%
college c=new college("BBD University", "Lucknow", "Faizabad road", "bbdu@ac.in", "63647567");
application.setAttribute("collegeInfo", c);
%>

	<!-- Header -->
	<div class="container-fluid bg-success">
	<h1 class="h1 text-light text-center shadow" style="font-family: forte">College Portal Welcomes You</h1>
	</div>


	<!-- Navbar -->
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<div class="container-fluid">
			
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarNav"
				aria-controls="navbarNav" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarNav">
				<ul class="navbar-nav">
					<li class="nav-item text-success"><a class="nav-link active"
						aria-current="page" href="#">Home</a></li>
						<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
					role="button" data-bs-toggle="dropdown" aria-expanded="false">
						Login </a>
					<ul class="dropdown-menu" aria-labelledby="navbarDropdown">
						<li><a class="dropdown-item" href="/collegeportal/student/studentlogin.jsp">Student Login</a></li>
						<li><a class="dropdown-item" href="/collegeportal/consultancy/consultancylogin.jsp">Consultancy Login</a></li>
						
					</ul></li>
					<li class="nav-item"><a class="nav-link text-success" href="/collegeportal/consultancy/consultancyregisteration.jsp">Registration</a>
					</li>
					
					<li class="nav-item"><a class="nav-link text-success" href="/collegeportal/jsp/login.jsp">Login</a>
					</li>
					<li class="nav-item"><a class="nav-link text-success" href="/collegeportal/html/faq.html">FAQ</a>
					</li>
					
					<li class="nav-item"><a class="nav-link text-success" href="/collegeportal/jsp/aboutus.jsp">About Us</a>
					</li>
					<li class="nav-item"><a class="nav-link text-success" href="/collegeportal/jsp/contactus.jsp">Contact Us</a>
					</li>
				</ul>
			</div>
		</div>
	</nav>


	<!-- Carousel -->
	
	<div id="carouselExampleControls" class="carousel slide mx-auto w-75"
		data-bs-ride="carousel">
		<div class="carousel-inner">
			<div class="carousel-item active">
				<img src="/collegeportal/images/img18.jpg" class="d-block w-100" alt="...">
			</div>
			<div class="carousel-item">
				<img src="/collegeportal/images/img16.jpg" class="d-block w-100" alt="...">
			</div>
			<div class="carousel-item">
				<img src="/collegeportal/images/img17.jpg" class="d-block w-100" alt="...">
			</div>
		</div>
		<button class="carousel-control-prev" type="button"
			data-bs-target="#carouselExampleControls" data-bs-slide="prev">
			<span class="carousel-control-prev-icon" aria-hidden="true"></span> <span
				class="visually-hidden">Previous</span>
		</button>
		<button class="carousel-control-next" type="button"
			data-bs-target="#carouselExampleControls" data-bs-slide="next">
			<span class="carousel-control-next-icon" aria-hidden="true"></span> <span
				class="visually-hidden">Next</span>
		</button>
	</div>
	
	
	<%
	ResourceBundle rb=ResourceBundle.getBundle("collegeportal/dbtasks/dbinfo");
	String slogan=rb.getString("db.slogan");
	
	%>
	
	<marquee><h1><%=slogan %></h1></marquee>
	
	<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js" integrity="sha384-W8fXfP3gkOKtndU4JGtKDvXbO53Wy8SZCQHczT5FMiiqmQfUpWbYdTil/SxwZgAN" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.min.js" integrity="sha384-skAcpIdS7UcVUC05LJ9Dxay8AXcDYfBJqt1CJ85S/CFujBsIzCIv+l9liuYLaMQ/" crossorigin="anonymous"></script>
</body>
</html>
