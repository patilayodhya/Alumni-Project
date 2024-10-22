<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="org.AlumniManagement.admin.service.*,java.util.*,org.AlumniManagement.model.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.they{
background-color:blue;
text-align:center;

}
th,td{
padding:5px;
text-align:center;
}
.row3{
text-align:center;
}
</style>


</head>
<body>

<%!
AttendenceService attService=new AttendenceServiceImpl();
%>
<%@include file="Admindashboard.jsp"%>
	<div class="col py-3">
	</br></br></br></br></br>
	<h1 style="margin-left:7%;">Attendence Details</h1>
	<table class="table4" style="background:rgba(0,0,0,0.7) ;color:white; font-weight:bold; width:80%;margin-left:7%;" >
  <thead>
    <tr>
      <th scope="col" class="they">Sr.No</th>
      <th scope="col" class="they">Alumni_name</th>
      <th scope="col" class="they">Branch_name</th>
      
      <th scope="col" class="they">Event_Name</th>
      <th scope="col" class="they">Status</th>
       <th scope="col" class="they">Date</th>
      
    </tr>
  </thead>
  <tbody>
  <%
  List<Object[]> list=attService.getAllPresentAlumni();
  int count=0;
  for(Object obj[]:list)
  {
	 //if we want to generete dynamic html using jsp we have two ways out.println,tag breaking technique=%><% 
	 %>
	  <tr>
      <th scope="row" class="row3"><%=++count %></th>
      <td><%=obj[0]   %></td>
      <td><%=obj[1]   %></td>
      <td><%=obj[2]   %></td>
        <td><%=obj[3]   %></td>
         <td><%=obj[4]   %></td>
      
     
 
      
    </tr>
	 <% 
  }
  %>    
 
    
  </tbody>
</table>
	
		
	</div>
	</div>
	</div>



</body>
</html>