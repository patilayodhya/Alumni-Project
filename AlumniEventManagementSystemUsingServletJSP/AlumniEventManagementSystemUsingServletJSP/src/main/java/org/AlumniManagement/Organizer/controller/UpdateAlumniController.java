package org.AlumniManagement.Organizer.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.AlumniManagement.admin.service.AlumniService;
import org.AlumniManagement.admin.service.AlumniServiceImpl;
import org.AlumniManagement.model.AlumniModel;

//API
@WebServlet("/UpdAl")
public class UpdateAlumniController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		//out.println("<h1>Update Machine Controller</h1>");
		int alumni_id=Integer.parseInt(request.getParameter("Alumni_id"));
		String name=request.getParameter("name");
		
		int Year_of_Graduation=Integer.parseInt(request.getParameter("Year_of_Graduation"));
		String contact=request.getParameter("contact");
		String Email=request.getParameter("Email");
		//int Br_id=Integer.parseInt(request.getParameter("Br_id"));
		
		RequestDispatcher r=request.getRequestDispatcher("Admindashboard.jsp");
		r.include(request,response);
		
		out.println("<style>");
		out.println(".container {");
		out.println("    margin-top: 50px; /* Adjust as needed */");
		out.println("}");
		out.println(".formarea {");
		out.println("    background-color: white;");
		out.println("    padding: 20px;");
		out.println("    border-radius: 5px;");
		out.println("    width: 40%;"); // Set the width to 50%
		out.println("    margin-top: 60px;"); // Center the form horizontally
		out.println("}");
		out.println(".form-group {");
		out.println("    margin-bottom: 20px;");
		out.println("}");
		out.println(".control {");
		out.println("    width: 100%;"); // Set the width of input fields to 100%
		out.println("    padding: 10px;");
		out.println("    border-radius: 5px;");
		out.println("    border: 1px solid #ccc;");
		
		
		out.println("}");
		
		out.println(".butt {");
		out.println("    width: 100%;"); // Set the width of input fields to 100%
		out.println("    padding: 10px;");
		out.println("    border-radius: 5px;");
		out.println("    border: 1px solid #ccc;");
		out.println("    background-color: #198754;");
		out.println("}");
		out.println(".btn-primary {");
		out.println("    background-color: #007bff;");
		out.println("    border-color: #007bff;");
		out.println("    color: #fff;");
		out.println("    padding: 10px 20px;");
		out.println("    border-radius: 5px;");
		out.println("    cursor: pointer;");
		out.println("}");
		out.println(".btn-primary:hover {");
		out.println("    background-color: #0056b3;");
		out.println("    border-color: #0056b3;");
		out.println("}");
		out.println("</style>");
		
	
		
		out.println("<center>");
		out.println("<div class='col py-3 abc'>");
		out.println("<form  name='frm' action='final' method='POST' class='formarea'>");
		out.println("<input type='hidden' name='alumni_id' value='"+alumni_id+"'class='control'/><br></br>");
		
		out.println("<input type='text' name='name' value='"+name+"'class='control'/><br></br>");
		out.println("<input type='text' name='year_of_graduation' value='"+Year_of_Graduation+"'class='control'/><br></br>");
		out.println("<input type='text' name='contact' value='"+contact+"'class='control'/><br></br>");
		out.println("<input type='text' name='email' value='"+Email+"'class='control'/><br></br>");
		//out.println("<input type='text' name='bid' value='"+Br_id+"'class='control'/><br></br>");
		
		out.println("<input type='submit' name='s' value='Update Alumni details' class='butt'/>");
		out.println("</center>");
		out.println("</div></div></div>"); 
			
			
		}
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
