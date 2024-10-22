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


@WebServlet("/final")
public class FinalAlumniUpdate extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		
		
		int alumni_id=Integer.parseInt(request.getParameter("alumni_id"));
		String name=request.getParameter("name");
		int Year_of_Graduation=Integer.parseInt(request.getParameter("year_of_graduation"));
		String contact=request.getParameter("contact");
		String Email=request.getParameter("email");
		//int br_id=Integer.parseInt(request.getParameter("bid"));
		
		AlumniModel Amodel=new AlumniModel();
		Amodel.setAlumni_id(alumni_id);
		Amodel.setName(name);
		Amodel.setYear_of_Graduation(Year_of_Graduation);
		Amodel.setContact(contact);
		Amodel.setEmail(Email);
		//Amodel.setBr_id(br_id);
		
		AlumniService AluService=new AlumniServiceImpl();
		boolean b=AluService.isUpdateAlumni(Amodel);
		if(b)
		{
			RequestDispatcher r=request.getRequestDispatcher("viewAlumni.jsp");
		    r.forward(request, response);
			
		}
		else
		{
			out.println("<h1>Alumni Data not updated</h1>");
		}
		
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
