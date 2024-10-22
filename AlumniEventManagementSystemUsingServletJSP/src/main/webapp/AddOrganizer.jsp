<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>

.s1{
background-color:green;
margin-top:10px;
}

</style>
<link rel="stylesheet" href="CSS/style.css" />

</head>
<body>
<%@include file="Admindashboard.jsp"%>


<div class="container p-5">
	<div class="row">
	<div class="col-md-4 offset-md-4">
	<div class="card paint-card">
	<div class="card-body">
	<p class="fs-4 text-center text-danger">Add Organizer Details</p>
	
	
	<form  name='frm' action="orgcon" method="post">
	<div class="mb-3">
	<label class="form-label">org_name</label>
	<input required name="name" type="text" class="form-control" placeholder="Enter org_name">
	</div>
	
	<div class="mb-3">
	<label class="form-label">org_contact</label>
	<input required name="contact" type="text" class="form-control" placeholder="Enter org_contact">
	</div>
	
	<div class="mb-3">
	<label class="form-label">org_email</label>
	<input required name="email" type="text" class="form-control" placeholder="Enter org_email">
	</div>
	
	<button type="submit" class="btn bg-success text-white col-md-12">Add New Organizer</button>
	
	</form>
	<!-- <div class="side">
	<form action="viewOrganizer.jsp" name="frm" method="post">
	<input type="submit" value="view Organizer" class="s1">
	
	</form>
	
	
	</div>
 -->	

	</div>
	</div>
	</div>
	



</body>
</html>