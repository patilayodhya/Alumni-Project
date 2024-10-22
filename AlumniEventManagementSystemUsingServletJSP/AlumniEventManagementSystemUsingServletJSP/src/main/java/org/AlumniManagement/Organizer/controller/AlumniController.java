package org.AlumniManagement.Organizer.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.AlumniManagement.admin.service.AlumniService;
import org.AlumniManagement.admin.service.AlumniServiceImpl;
import org.AlumniManagement.model.AlumniModel;

@WebServlet("/alumniController")
public class AlumniController extends HttpServlet {
	
	AlumniService AluService=new AlumniServiceImpl();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
	   // out.println("<h1>I am Alumni controller</h1>");
	    String Alumni_name=request.getParameter("name");
	    int Year_of_Graduation=Integer.parseInt(request.getParameter("year"));
	    String contact=request.getParameter("contact");
	    String email=request.getParameter("email");
	    int br_id=Integer.parseInt(request.getParameter("br_id"));
	    
	    AlumniModel Amodel=new AlumniModel();
	    Amodel.setName(Alumni_name);
	    Amodel.setYear_of_Graduation(Year_of_Graduation);
	    Amodel.setContact(contact);
	    Amodel.setEmail(email);
	    Amodel.setBr_id(br_id);
	    boolean b=AluService.isAddAlumni(Amodel);
	    if(b)
		{
			out.println("<h1>Alumni added successfully......... </h1>");
		}
		else
		{
		out.println("<h1> Alumni not added successfully....... </h1>");
		}
	    
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
