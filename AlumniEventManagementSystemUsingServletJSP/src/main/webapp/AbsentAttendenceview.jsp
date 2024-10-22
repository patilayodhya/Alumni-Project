<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="org.AlumniManagement.admin.service.*,java.util.*,org.AlumniManagement.model.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Attendance Details</title>
<style>
    .theb {
        background-color: blue;
        text-align: center;
    }
    th, td {
        padding: 5px;
        text-align: center;
    }
    .row4 {
        text-align: center;
    }
</style>
</head>
<body>
<%!
AttendenceService attService = new AttendenceServiceImpl();
%>
<%@ include file="Admindashboard.jsp" %>
<div class="col py-3">
    <br><br><br><br><br>
    <h1 style="margin-left:7%;">Attendance Details</h1>
    <table class="table45" style="background:rgba(0,0,0,0.7); color:white; font-weight:bold; width:80%; margin-left:7%;">
        <thead>
            <tr>
                <th scope="col" class="theb">Sr.No</th>
                <th scope="col" class="theb">Alumni_name</th>
                <th scope="col" class="theb">Branch_name</th>
                <th scope="col" class="theb">Event_Name</th>
                <th scope="col" class="theb">Status</th>
                <th scope="col" class="theb">Date</th>
            </tr>
        </thead>
        <tbody>
        <%
            try {
                List<Object[]> list = attService.getAllAbsentAlumni();
                int count = 0;
                for (Object[] obj : list) {
        %>
            <tr>
                <th scope="row" class="row4"><%= ++count %></th>
                <td><%= obj[0] %></td>
                <td><%= obj[1] %></td>
                <td><%= obj[2] %></td>
                <td><%= obj[3] %></td>
                <td><%= obj[4] %></td>
            </tr>
        <%
                }
            } catch (Exception e) {
                out.println("<tr><td colspan='6'>Error: " + e.getMessage() + "</td></tr>");
                e.printStackTrace();
            }
        %>
        </tbody>
    </table>
</div>
</body>
</html>
