<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Events</title>
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
    Connection conn;
    PreparedStatement stmt;
    ResultSet rs;
%>
<%
    String name = request.getParameter("n");
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/alumniproject", "root", "5414");
        if (conn != null) {
            stmt = conn.prepareStatement("SELECT  e.Event_Id, e.Event_Name,e.Event_Date,e.Event_Location,e.Event_Description,o.org_name,b.br_name, a.Name AS Alumni_Name FROM organizer AS o INNER JOIN alumni_event AS e ON o.org_id = e.org_id INNER JOIN branch AS b ON e.br_id = b.br_id LEFT JOIN alumni AS a ON e.alumni_id = a.Alumni_Id WHERE e.event_name LIKE ?");
            stmt.setString(1, "%" + name + "%");
            rs = stmt.executeQuery(); 
            out.println("<table class='table8'>");
            out.println("<thead><tr><th class='eventtable'>Sr.No</th><th class='eventtable'>Event_Name</th><th class='eventtable'>Event_Date</th><th class='eventtable'>Event_Location</th><th class='eventtable'>Event_Description</th><th class='eventtable'>Org_name</th><th class='eventtable'>Br_name</th><th class='eventtable'>Alumni_name</th></tr></thead>");
            out.println("<tbody>");
            int count = 0;
            while (rs.next()) {
                out.println("<tr>");
                out.println("<td>" + (++count) + "</td>");
                out.println("<td>" + rs.getString("event_name") + "</td>");
                out.println("<td>" + rs.getDate("event_date") + "</td>");
                out.println("<td>" + rs.getString("event_location") + "</td>");
                out.println("<td>" + rs.getString("event_description") + "</td>");
                out.println("<td>" + rs.getString("org_name") + "</td>");
                out.println("<td>" + rs.getString("br_name") + "</td>");
                out.println("<td>" + rs.getString("alumni_name") + "</td>");
                out.println("</tr>");
            }
            out.println("</tbody>");
            out.println("</table>");
        } else {
            out.println("Database is not connected");
        }
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        try {
            if (rs != null) rs.close();
            if (stmt != null) stmt.close();
            if (conn != null) conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
%>
</body>
</html>
