<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.inline-form
{

 display: inline;

}
.s1, .s2 {
background-color: #198754;
    color: white; /* Assuming white text on green background */
    border: none;
   /*  padding: 10px 20px;*/
    font-size: 16px;
    border-radius: 5px; /* Same border radius as in the image */
    cursor: pointer;
    margin-top:10px;
    }
.s1:hover, .s2:hover {
    background-color: #167b4d; /* Slightly darker green for hover effect */
}
</style>
</head>
<body>

<%@include file="Admindashboard.jsp"%>

<div class="container p-5 position-static">
	<div class="row">
	<div class="col-md-4 offset-md-4">
	<div class="card paint-card">
	<div class="card-body">
	<p class="fs-4 text-center text-danger">Add Alumni Details</p>
	
	<!-- go to alumnicontroller -->
	<form  name='frm' action="alumniController" method="post">
	<div class="mb-3">
	<label class="form-label">Alumni_Name</label>
	<input required name="name" type="text" class="form-control" placeholder="Enter alumni name">
	</div>
	
	<div class="mb-3">
	<label class="form-label">Year_of_Graduation</label>
	<input required name="year" type="text" class="form-control" placeholder="Enter year of graduation">
	</div>
	
	<div class="mb-3">
	<label class="form-label">Contact</label>
	<input required name="contact" type="text" class="form-control" placeholder="Enter contact">
	</div>
	
	<div class="mb-3">
	<label class="form-label">Email</label>
	<input required name="email" type="text" class="form-control" placeholder="Enter email">
	</div>
	
	 <div class="mb-3"">
	<label class="form-label"style="width:70px;">Br_Name</label><br>
	 <!--  <input required name="br_id" type="text" class="form-control" placeholder="Enter Br_id"> -->
	<select name="br_id" style="width:420px; height:40px;">
	
	<option value=""></option>
	<option>CSE</option>
	<option>ENTC</option>
	<option>MECH</option>
	</select>
	
	</div> 
	
	<button type="submit" class="btn bg-success text-white col-md-12">Add New Alumni</button>
	
	</form>
	
	 <div class="side">
        <form action="viewAlumni.jsp" name="frm" method="post" class="inline-form">
            <input type="submit" value="view alumni" class="s1">
        </form>
        <form action="viewSeniorAlumni.jsp" name="frm" method="post" class="inline-form">
            <input type="submit" value="Senior alumni" class="s2">
        </form>
    </div>
	
	
	</div>
	

	</div>
	</div>
	</div>
	
	














	



</body>
</html>