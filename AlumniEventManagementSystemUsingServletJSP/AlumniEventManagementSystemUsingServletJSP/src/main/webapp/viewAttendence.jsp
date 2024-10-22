<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page import="org.AlumniManagement.admin.service.*,java.util.*,org.AlumniManagement.model.*" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.the{
background-color:blue;
text-align:center;

}
th,td{
padding:5px;
text-align:center;
}
.row2{
text-align:center;
}
.inline-form
{

 display: inline;

}
.s1, .s2 {
background-color: blue;
    color: white; /* Assuming white text on green background */
    border: none;
   /*  padding: 10px 20px;*/
    font-size: 16px;
    border-radius: 5px; /* Same border radius as in the image */
    cursor: pointer;
    margin-top:10px;
    height:40px;
    width:300px;
    margin:20px;
    }
.s1:hover, .s2:hover {
    background-color: #167b4d; /* Slightly darker green for hover effect */
    
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
	<table class="table3" style="background:rgba(0,0,0,0.7) ;color:white; font-weight:bold; width:80%;margin-left:7%;" >
  <thead>
    <tr>
      <th scope="col" class="the">Sr.No</th>
      <th scope="col" class="the">Alumni_name</th>
      <th scope="col" class="the">Branch_name</th>
      <th scope="col" class="the">Event_Name</th>
      <th scope="col" class="the">Status</th>
       <th scope="col" class="the">Date</th>
      
    </tr>
  </thead>
  <tbody>
  <%
  List<Object[]> list=attService.getAllAttendence();
  int count=0;
  for(Object obj[]:list)
  {
	 //if we want to generete dynamic html using jsp we have two ways out.println,tag breaking technique=%><% 
	 %>
	  <tr>
      <th scope="row" class="row2"><%=++count %></th>
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
<div class="side" style="margin-left:300px;margin-top:40px;">
        <form action="PresentAttendenceview.jsp" name="frm" method="post" class="inline-form">
            <input type="submit" value="Present alumni" class="s1">
        </form>
        <form action="AbsentAttendenceview.jsp" name="frm" method="post" class="inline-form">
            <input type="submit" value="Absent alumni" class="s2">
        </form>
    </div>
	
		
	</div>

	</div>
	
	</div>
	
	




</body>
</html>