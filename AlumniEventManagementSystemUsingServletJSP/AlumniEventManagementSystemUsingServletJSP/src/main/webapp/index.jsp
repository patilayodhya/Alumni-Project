<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index page</title>
<!--  include derective tag-->
<%@include file="Component/allcss.jsp" %>

</head>
<body>
<%@include file="Component/navbar.jsp" %>

<div id="carouselExampleControls" class="carousel slide" data-bs-ride="carousel">
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img src="img/img2.jpg" class="d-block w-100" alt="..." height="670px">
    </div>
    <div class="carousel-item">
      <img src="img/img3.jpg" class="d-block w-100" alt="..." height="670px">
    </div>
    <div class="carousel-item">
      <img src="img/img1.jpg" class="d-block w-100" alt="..." height="670px">
    </div>
  </div>
  <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Previous</span>
  </button>
  <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Next</span>
  </button>
</div>


<div class="container p-3" style="margin-right:550px; width:1300px;margin-top:20px;">
		<p class="text-center fs-2">Key Features of our Alumni</p>
		
		<div class="row">
		<div class="col-md-8 p-5">
		<div class="row">
		
		<div class="col-md-6">
		<div class="card point-card"style="background-color: #f8f9fa; padding: 5px; border-radius: 5px;border:5px solid white;box-shadow:4px 4px 5px 4px black;">
		<div class="card-body">
		<p class="fs-5">Event Discovery and Management</p>
		<p>Allow alumni to discover upcoming events, including reunions, social gatherings, career workshops, and networking sessions.</p>
		</div>
		</div>
		</div>
		
		<div class="col-md-6">
		<div class="card point-card" style="background-color: #f8f9fa; padding: 5px; border-radius: 5px;border:5px solid white;box-shadow:4px 4px 5px 4px black;">
		<div class="card-body">
		<p class="fs-5">Registration and RSVP</p>
		<p>Enable alumni to register for events and RSVP, with options for guest registration and meal preferences.</p>
		</div>
		</div>
		</div>
		
		<div class="col-md-6"style="margin-top:10px;">
		<div class="card point-card" style="background-color: #f8f9fa; padding: 5px; border-radius: 5px;border:5px solid white;box-shadow:4px 4px 5px 4px black;">
		<div class="card-body">
		<p class="fs-5">Networking Opportunities</p>
		<p>Facilitate networking among alumni, mentors, and industry professionals through networking features such as alumni directories, discussion forums.</p>
		</div>
		</div>
		</div>
		
		<div class="col-md-6"style="margin-top:10px;">
		<div class="card point-card" style="background-color: #f8f9fa; padding: 5px; border-radius: 5px;border:5px solid white;box-shadow:4px 4px 5px 4px black;">
		<div class="card-body">
		<p class="fs-5">Personalization</p>
		<p>Offer personalized user experiences by allowing alumni to customize their profiles, manage event preferences, and receive tailored event recommendations.</p>
		</div>
		</div>
		</div>
		</div>
		</div>
		
		<div class="col-md-4" style="margin-top:46px;">
		<img src="img/girl.webp">
		</div>
		
		</div>
		</div>
		
		
<hr>
	<div class="container p-2">
	<p class="text-center fs-2">Our Team</p>
	<div class="row">
	<div class="col-md-3">
	<div class="card paint-card">
	<div  class="card-body text-center">
	<img src="img/team1.jpg" width="250px" height="300px">
	<p class="fw-bold fs-5">Shubham Shinde</p>
	<p class=""fs-7">Teachnical Team Lead</p>
	</div>
	</div>
	</div>
	
	<div class="col-md-3">
	<div class="card paint-card">
	<div  class="card-body text-center">
	<img src="img/team2.jpg"width="250px" height="300px">
	<p class="fw-bold fs-5">Akash Pandit</p>
	<p class=""fs-7">President</p>
	</div>
	</div>
	</div>
	
	<div class="col-md-3">
	<div class="card paint-card">
	<div  class="card-body text-center">
	<img src="img/team3.jpg"width="250px" height="300px">
	<p class="fw-bold fs-5">Prabat Patil</p>
	<p class=""fs-7">Team Lead</p>
	</div>
	</div>
	</div>
	
	<div class="col-md-3">
	<div class="card paint-card">
	<div  class="card-body text-center">
	<img src="img/team4.jpg"width="250px" height="300px">
	<p class="fw-bold fs-5">Prathvi Kadam</p>
	<p class=""fs-7">Consulting Advisor</p>
	</div>
	</div>
	</div>
	
	</div>
	</div>
</hr>

<%@include file="Component/Footer.jsp" %>
















</body>
</html>