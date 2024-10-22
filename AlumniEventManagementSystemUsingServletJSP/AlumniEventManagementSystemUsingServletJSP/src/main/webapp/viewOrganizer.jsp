<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%-- <%@page import="org.AlumniManagement.admin.service.*,java.util.*,org.AlumniManagement.model.*" %> --%>
<%@page import="org.AlumniManagement.admin.Repository.*,java.util.*,org.AlumniManagement.model.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.torg{
background-color:blue;
/*  border:4px solid black;*/
text-align:center;

}
th,td{
padding:5px;
text-align:center;
}
.row1{
text-align:center;
}

</style>
</head>
<body>
<%!
OrganizerRepository orgService=new OrganizerRepositoryImpl();
//OrganizerService orgService=new OrganizerServiceImpl();
%>
<%@include file="Admindashboard.jsp"%>
	<div class="col py-3">
	</br></br></br></br></br>
	<h1 style="margin-left:7%;">Organizer Details</h1>
	<table class="table2"style="background:rgba(0,0,0,0.7) ;color:white; font-weight:bold; width:80%;margin-left:7%;border:3px solid black;" >
  <thead>
    <tr>
      <th scope="col" class="torg">Org_Id</th>
      <th scope="col" class="torg">Org_name</th>
      <th scope="col" class="torg">Org_Email</th>
      <th scope="col" class="torg">Org_Contact</th>
     <!--<th scope="col">DELETE</th>
      <th scope="col">Update</th>-->
    </tr>
  </thead>
  <tbody>
  <%
  /* List<OrganizerModel> list=orgService.getAllOrganizer(); */
  List<OrganizerModel>list=orgService.getAllOrganizer();
  int count=0;
  for(OrganizerModel m:list)
  {
	 //tag break
	 %>
	  <tr>
      <th scope="row" class="row1"><%=++count %></th>
      <td><%=m.getOrg_name() %></td>
      <td ><%=m.getOrg_email() %></td>
      <td><%=m.getOrg_contact() %></td>
      <!--  <td><a href=''>Delete</td>
      <td><a href=''>UPDATE</a></td> -->
     
      
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
