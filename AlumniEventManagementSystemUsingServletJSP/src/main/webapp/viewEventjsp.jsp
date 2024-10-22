<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="org.AlumniManagement.admin.service.*, java.util.*, org.AlumniManagement.model.*" %>
<%@ page import="java.sql.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Event Management</title>

<script type="text/javascript">
    function searchByName(str) {
        let xhttp = new XMLHttpRequest();
        xhttp.onreadystatechange = function() {
            if (this.readyState == 4 && this.status == 200) {
                document.getElementById("d").innerHTML = this.responseText;
            }
        };
        xhttp.open("GET", "searchbyEventName.jsp?n=" + str, true);
        xhttp.send();
    }
</script>

<style>
    .eventtable {
        background-color: blue;
        color: white;
        text-align: center;
    }
    th, td {
        text-align: center;
        padding: 10px;
    }
    .icon1 {
        width: 30px;
        height: 30px;
    }
    .search-input {
        width: 60%;
        height: 40px;
        margin: 20px 0;
        text-align: center;
    }
    .table8 {
        background: rgba(0, 0, 0, 0.7);
        color: white;
        font-weight: bold;
        width: 80%;
        margin-left: 10%;
    }
</style>
</head>
<body>
<%! 
    EventService eventService = new EventserviceImpl(); 
%>

<%@ include file="Admindashboard.jsp" %>

<div class="col py-3">
    <h1 style="margin-left: 10%;">Event Details</h1>
    <center>
        <input type="text" name="name" class="search-input" onkeyup="searchbyEventName(this.value)" placeholder="Search by event name">
    </center><br>
    <div id="d">
        <table class="table8">
            <thead>
                <tr>
                    <th scope="col" class="eventtable">Sr.No</th>
                    <th scope="col" class="eventtable">Event_Name</th>
                    <th scope="col" class="eventtable">Event_Date</th>
                    <th scope="col" class="eventtable">Event_Location</th>
                    <th scope="col" class="eventtable">Event_Description</th>
                    <th scope="col" class="eventtable">Org_name</th>
                    <th scope="col" class="eventtable">Br_name</th>
                    <th scope="col" class="eventtable">Alumni_name</th>
                    <th scope="col" class="eventtable">DELETE</th>
                    <th scope="col" class="eventtable">Update</th>
                </tr>
            </thead>
            <tbody>
                <%
                    List<Object[]> list = eventService.getAllEvent();
                    int count = 0;
                    for (Object[] obj : list) {
                %>
                <tr>
                    <th scope="row"><%= ++count %></th>
                    <td><%= obj[1] %></td>
                    <td><%= obj[2] %></td>
                    <td><%= obj[3] %></td>
                    <td><%= obj[4] %></td>
                    <td><%= obj[5] %></td>
                    <td><%= obj[6] %></td>
                    <td><%= obj[7] %></td>
                    <td><a href='deleteEvent?Event_id=<%= (int) obj[0] %>'><ion-icon name="close-circle-outline" class="icon1"></ion-icon></a></td>
                    <td><a href='updEvent?Event_id=<%= (int) obj[0] %>&name=<%= obj[1].toString() %>&date=<%= obj[2].toString() %>&location=<%= obj[3].toString() %>&description=<%= obj[4].toString() %>'><ion-icon name="sync-outline" class="icon1"></ion-icon></a></td>
                </tr>
                <%
                    }
                %>
            </tbody>
        </table>
    </div>
</div>

<script type="module" src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.esm.js"></script>
<script nomodule src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.js"></script>

</body>
</html>
