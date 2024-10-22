<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="org.AlumniManagement.admin.service.*,java.util.*,org.AlumniManagement.model.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.thee{
background-color:blue;
text-align:center;

}
th,td{
padding:5px;
text-align:center;
}
.row5{
text-align:center;
}
</style>
</head>
<body>

<%!
FeedbackService fService=new FeedbackServiceImpl();
%>
<%@include file="AlumniDashboard.jsp"%>
	<div class="col py-3">
	</br></br></br></br></br>
	<h1 style="margin-left:7%;">Feedback Details</h1>
	<table class="table6" style="background:rgba(0,0,0,0.7) ;color:white; font-weight:bold; width:80%;margin-left:7%;" >
  <thead>
    <tr>
      <th scope="col" class="thee">Sr.No</th>
      <th scope="col" class="thee">Alumni_name</th>
      <th scope="col" class="thee">Org_name</th>
      <th scope="col" class="thee">Event_Name</th>
      <th scope="col" class="thee">fmsg</th>
      
      
    </tr>
  </thead>
  <tbody>
  <%
  List<Object[]> list=fService.getAllFeedback();
  int count=0;
  for(Object obj[]:list)
  {
	 //if we want to generete dynamic html using jsp we have two ways out.println,tag breaking technique=%><% 
	 %>
	  <tr>
      <th scope="row" class="row5"><%=++count %></th>
      <td><%=obj[0]   %></td>
      <td><%=obj[1]   %></td>
      <td><%=obj[2]   %></td>
      <td><%=obj[3]   %></td>
         
        
      
     
 
      
    </tr>
	 <% 
  }
  %>    

</body>
</html>