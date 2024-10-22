<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="org.AlumniManagement.admin.service.*,java.util.*,org.AlumniManagement.model.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.tname1{
background-color:blue;
text-align:center;
}
th,td{
padding:5px;
text-align:center;
}
.rowes{
text-align:center;
}

</style>
</head>
<body>

<%!
AlumniService AluService=new AlumniServiceImpl();
%>
<%@include file="Admindashboard.jsp"%>
	<div class="col py-3">
	</br></br></br></br></br>
	<h1 style="margin-left:7%;">All Alumnia details as per the events</h1>
	<table class="table6" style="background:rgba(0,0,0,0.7) ;color:white; font-weight:bold; width:80%;margin-left:7%;" >
  <thead>
    <tr>
      <th scope="col" class="tname1">Sr.No</th>
      <th scope="col" class="tname1">Name</th>
      <th scope="col" class="tname1">Year_of_Graduation</th>
      <th scope="col" class="tname1">Br_Name</th>
      <th scope="col" class="tname1">Event_Name</th>
       <th scope="col" class="tname1">Event_date</th>
       <th scope="col" class="tname1">Event_Location</th>
       <th scope="col" class="tname1">Attendence</th>
        
         
    
    </tr>
  </thead>
  <tbody>
  <%
  List<Object[]> list=AluService.getAllViewAlumniEvent();
  int count=0;
  for(Object obj[]:list)
  {
	 //if we want to generete dynamic html using jsp we have two ways out.println,tag breaking technique=%><% 
	 %>
	  <tr>
      <th scope="row"class="rowes"><%=++count %></th>
      <td><%=obj[0]   %></td>
      <td><%=obj[1]   %></td>
      <td><%=obj[2]   %></td>
     <td><%=obj[3] %></td>
     <td><%=obj[4] %></td>
     <td><%=obj[5] %></td>
     <td><%=obj[6] %></td>
      
     
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