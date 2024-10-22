<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="org.AlumniManagement.admin.service.*, java.util.*, org.AlumniManagement.model.*" %>
<%@ page import="java.sql.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Alumni Management</title>

<script type="text/javascript">
    function searchByName(str) {
        let xhttp = new XMLHttpRequest();
        xhttp.onreadystatechange = function() {
            if (this.readyState == 4 && this.status == 200) {
                document.getElementById("d").innerHTML = this.responseText;
            }
        };
        xhttp.open("GET", "searchbyAlumniname.jsp?n=" + str, true);
        xhttp.send();
    }
</script>

<style>
    .theading {
        background-color: blue;
        color: white;
    }
    h1 {
        margin-left: 15vh;
    }
    .icon1 {
        width: 40px;
        height: 40px;
    }
    .search-input {
        width: 60%;
        height: 40px;
        margin-right: 45vh;
    }
    .table1 {
        background: rgba(0, 0, 0, 0.7);
        color: white;
        font-weight: bold;
        width: 80%;
        margin-left: 7%;
    }
</style>
</head>
<body>
<%!
    AlumniService AluService = new AlumniServiceImpl();
%>

<%@ include file="Admindashboard.jsp" %>

<div class="col py-3">
    <br><br><br><br><br>
    <h1 style="margin-left: 60vh;">Alumni Details</h1>
    <center>
        <input type="text" name="name" class="search-input" onkeyup="searchByName(this.value)" placeholder="Search by name">
    </center><br>
    <div id="d">
        <table class="table1">
            <thead>
                <tr>
                    <th scope="col" class="theading">Sr.No</th>
                    <th scope="col" class="theading">Name</th>
                    <th scope="col" class="theading">Year of Graduation</th>
                    <th scope="col" class="theading">Contact</th>
                    <th scope="col" class="theading">Email</th>
                    <th scope="col" class="theading">Branch Name</th>
                    <th scope="col" class="theading">Delete</th>
                    <th scope="col" class="theading">Update</th>
                </tr>
            </thead>
            <tbody>
                <%
                    List<Object[]> list = AluService.getAllAlumni();
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
                    <td><a href='Del?Alumni_id=<%= (int) obj[0] %>'><ion-icon name="close-circle-outline" class="icon1"></ion-icon></a></td>
                    <td><a href='UpdAl?Alumni_id=<%= (int) obj[0] %>&name=<%= obj[1].toString() %>&Year_of_Graduation=<%= (int) obj[2] %>&contact=<%= obj[3].toString() %>&Email=<%= obj[4].toString() %>'><ion-icon name="sync-outline" class="icon1"></ion-icon></a></td>
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
