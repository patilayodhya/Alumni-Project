<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@include file="AlumniDashboard.jsp"%>

<div class="container p-5">
	<div class="row">
	<div class="col-md-4 offset-md-4">
	<div class="card paint-card">
	<div class="card-body">
	<p class="fs-4 text-center text-danger">FeedBack Form</p>
	
	<!-- go to alumnicontroller -->
	<form  name='frm' action="feedbackController" method="post">
	<div class="mb-3">
	<label class="form-label">Alumni_id</label>
	<input required name="alumni_id" type="text" class="form-control" placeholder="Enter alumni id">
	</div>
	
	<div class="mb-3">
	<label class="form-label">org_id</label>
	<input required name="org_id" type="text" class="form-control" placeholder="Enter org_id">
	</div>
	
	<div class="mb-3">
	<label class="form-label">Event_id</label>
	<input required name="event_id" type="text" class="form-control" placeholder="Enter event id">
	</div>
	
	<div class="mb-3">
	<label class="form-label">Feedback Msg</label>
	<input required name="msg" type="text" class="form-control" placeholder="Enter msg">
	</div>
	
	
	<button type="submit" class="btn bg-success text-white col-md-12">Add New Alumni</button>
	
	</form>

</body>
</html>