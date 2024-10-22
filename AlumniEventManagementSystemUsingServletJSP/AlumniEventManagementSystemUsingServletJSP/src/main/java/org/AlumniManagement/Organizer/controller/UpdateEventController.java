package org.AlumniManagement.Organizer.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.AlumniManagement.admin.Repository.EventRepository;
import org.AlumniManagement.admin.Repository.EventRepositoryImpl;
import org.AlumniManagement.model.EventModel;


@WebServlet("/updEvent")
public class UpdateEventController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		//out.println("<h1>Update Machine Controller</h1>");
		String event_id=request.getParameter("Event_id");
		//System.out.println("c"+event_id);
		
		String event_name=request.getParameter("name");
		String event_date=request.getParameter("date");
		
		String event_location=request.getParameter("location");
		String event_description=request.getParameter("description");
		//int org_id=Integer.parseInt(request.getParameter("org_id"));
		//int br_id=Integer.parseInt(request.getParameter("br_id"));
		
		//System.out.println("email is"+Email);
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
		out.println("<form  name='frm' action='finalEvent' method='POST' class='formarea'>");
		out.println("<input type='hidden' name='event_id' value='"+event_id+"'class='control'/><br></br>");
		
		out.println("<input type='text' name='name' value='"+event_name+"'class='control'/><br></br>");
		out.println("<input type='date' name='date' value='"+event_date+"'class='control'/><br></br>");
		out.println("<input type='text' name='location' value='"+event_location+"'class='control'/><br></br>");
		out.println("<input type='text' name='description' value='"+event_description+"'class='control'/><br></br>");
		//out.println("<select name='oname'>");
		//EventRepository eventRepo=new EventRepositoryImpl();
//		List<EventModel> list=eventRepo.getAllEvent();
//		for(EventModel m:list)
//		{
//			out.println("<option value='"+m.getOrg_id()+"'>"+m.getOname()+"</option>");
//		}
//		out.println("</select></br></br>");
//		/*
//		  out.println("<input type='text' name='org_id' value='"+org_id+
//		 * "'class='control'/><br></br>");
//		 */
		
		
	//	out.println("<input type='text' name='org_id' value='"+org_id+"'class='control'/><br></br>");
	//	out.println("<input type='text' name='br_id' value='"+br_id+"'class='control'/><br></br>");
//		
		
		//out.println("<select name='br_name'>");
//	 List<EventModel>li=eventRepo.getAllEvent();
//	 for(EventModel m1:li)
//	 {
//		 out.println("<option value='"+m1.getBr_id()+"'>"+m1.getBr_name()+"</option>");
//	 }
//	 out.println("</select></br></br>");
//	 
//		
		
		out.println("<input type='submit' name='s' value='Update Event details' class='butt'/>");
//		out.println("</center>");
//		out.println("</div></div></div>"); 
//	
//		
//				
//		
//		
//		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
