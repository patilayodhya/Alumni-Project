<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@include file="Admindashboard.jsp"%>

<div class="container p-5">
	<div class="row">
	<div class="col-md-4 offset-md-4">
	<div class="card paint-card">
	<div class="card-body">
	<p class="fs-4 text-center text-danger">Mark Your Attendence</p>
	
	<!-- go to alumnicontroller -->
	<form  name='frm' action="attendenceController" method="post">
	<div class="mb-3">
	<label class="form-label">Alumni Id</label>
	<input required name="id" type="text" class="form-control" placeholder="Enter alumni id">
	</div>
	<div class="mb-3">
	<label class="form-label">Branch Id</label>
	<input required name="br_id" type="text" class="form-control" placeholder="Enter branch id">
	</div>
	
	<div class="mb-3">
	<label class="form-label">Event id</label>
	<input required name="event" type="text" class="form-control" placeholder="Enter contact">
	</div>
	
	<div class="mb-3">
	<label class="form-label">Status</label><br>
	<select class="form-label" style="width:420px; height:40px;" name="status">
	<option>Present</option>
	<option>Absent</option>	
	</select>
	</div>
	
	<button type="submit" class="btn bg-success text-white col-md-12">Submit</button>
	
	</form>
	

	</div>
	</div>
	</div>


</body>
</html>