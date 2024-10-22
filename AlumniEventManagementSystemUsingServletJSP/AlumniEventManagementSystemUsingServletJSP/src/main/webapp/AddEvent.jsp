<%@page import="org.AlumniManagement.admin.service.EventserviceImpl"%>
<%@page import="org.AlumniManagement.admin.service.EventService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="org.AlumniManagement.admin.service.EventserviceImpl.*,org.AlumniManagement.admin.service.EventService.*,org.AlumniManagement.admin.Repository.EventRepositoryImpl.*,org.AlumniManagement.model.*,java.util.*" %>
<%@ page import="java.util.List" %>
<%@ page import="org.AlumniManagement.admin.service.AlumniService" %>
<%@ page import="org.AlumniManagement.admin.service.AlumniServiceImpl" %>
<%@ page import="org.AlumniManagement.model.AlumniModel" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@include file="Admindashboard.jsp"%>
<%! 
    AlumniService Aservice = new AlumniServiceImpl();
%>
<% 
    List<Object[]> list1 = Aservice.getAllAlumni();
%>
<div class="container p-5">
    <div class="row">
        <div class="col-md-4 offset-md-4">
            <div class="card paint-card">
                <div class="card-body">
                    <p class="fs-4 text-center text-danger">Add Event Details</p>
                    <form name='frm' action="eventController" method="post">
                        <div class="mb-3">
                            <label class="form-label">Event_Name</label>
                            <input required name="name" type="text" class="form-control" placeholder="Enter event name">
                        </div>
                        <div class="mb-3">
                            <label class="form-label">Event_Date</label>
                            <input required name="date" type="date" class="form-control" placeholder="Enter date of event">
                        </div>
                        <div class="mb-3">
                            <label class="form-label">Event_Location</label>
                            <input required name="location" type="text" class="form-control" placeholder="Enter event location">
                        </div>
                        <div class="mb-3">
                            <label class="form-label">Event_Description</label>
                            <input required name="event_description" type="text" class="form-control" placeholder="Enter event description">
                        </div>
                        <div class="mb-3">
                            <label class="form-label">Org_Id</label>
                            <input required name="org_id" type="text" class="form-control" placeholder="Enter org_id"> 
                        </div>
                        <div class="mb-3">
                            <label class="form-label">Br_Id</label>
                            <input required name="br_id" type="text" class="form-control" placeholder="Enter branch id">
                        </div>
                        
                        <div class="mb-3">
	                   <label class="form-label">Alumni_Id</label>
	                    <input required name="alumni_id" type="text" class="form-control" placeholder="Enter Alumni id">
	                  </div>
                        
<%--                         <div class="dropdown-menu" aria-labelledby="AlumniMultiSelect Dropdown">
                            <div class="multiselect">
                                <% for(Object obj[] : list1) { %>
                                    <label class="option">
                                        <input type="checkbox" style="margin-left:20px;" name="alumniNames" class="alumniCheckbox mr-3" value="<%=obj[1].toString()%>">
                                        <%=obj[1].toString()%>
                                    </label><br>
                                <% } %>
                            </div>
                        </div>
 --%>                        <button type="submit" class="btn bg-success text-white col-md-12">Add New Event</button>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>

</body>
</html>
