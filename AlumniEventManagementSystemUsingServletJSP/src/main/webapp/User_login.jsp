<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User login page</title>
<%@include file="Component/allcss.jsp" %>
<style type="text/css">
.paint-card{
margin-top:100px;
	box-shadow:0 0 10px 0 rgba(0,0,0,0.3);
}

</style>
</head>
<body>
<!--include another page content in jsp =include directive tag  -->
<%@include file="Component/navbar.jsp" %>  

<div class="container p-5">
	<div class="row">
	<div class="col-md-4 offset-md-4">
	<div class="card paint-card">
	<div class="card-body">
	<p class="fs-4 text-center text-danger">Login</p>
	
	<!-- go to mainlogincontroller  from action -->
	<form  name='frm' action="navmain" method="post">
	<div class="mb-3">
	<label class="form-label">Email address</label>
	<input required name="email" type="email" class="form-control">
	</div>
	
	<div class="mb-3">
	<label class="form-label">Password</label>
	<input required name="password" type="password" class="form-control">
	</div>
	
	<button type="submit" class="btn bg-success text-white col-md-12">Login</button>
	
	</form>
	<br>Don't have an account?<a href="signup.jsp" class="text-decoration-none"> Register</a>

	</div>
	</div>
	</div>


</div>


</body>
</html>