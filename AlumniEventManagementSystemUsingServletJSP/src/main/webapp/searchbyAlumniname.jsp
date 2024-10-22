<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Alumni</title>
<style>
    .theading {
        background-color: blue;
        color: white;
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
            stmt = conn.prepareStatement("SELECT a.alumni_id, a.name, a.year_of_graduation, a.contact, a.email, b.br_name FROM alumni a INNER JOIN branch b ON a.br_id = b.br_id WHERE a.name LIKE ?");
            stmt.setString(1, "%" + name + "%");
            rs = stmt.executeQuery();
            out.println("<table class='table1'>");
            out.println("<thead><tr><th class='theading'>Sr.No</th><th class='theading'>Name</th><th class='theading'>Year of Graduation</th><th class='theading'>Contact</th><th class='theading'>Email</th><th class='theading'>Branch Name</th></tr></thead>");
            out.println("<tbody>");
            int count = 0;
            while (rs.next()) {
                out.println("<tr>");
                out.println("<td>" + (++count) + "</td>");
                out.println("<td>" + rs.getString("name") + "</td>");
                out.println("<td>" + rs.getInt("year_of_graduation") + "</td>");
                out.println("<td>" + rs.getString("contact") + "</td>");
                out.println("<td>" + rs.getString("email") + "</td>");
                out.println("<td>" + rs.getString("br_name") + "</td>");
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
