package org.AlumniManagement.Organizer.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.AlumniManagement.admin.service.OrganizerServiceImpl;
import org.AlumniManagement.model.OrganizerModel;
import org.AlumniManagement.admin.service.OrganizerService;



@WebServlet("/orgcon")
public class OrganizerController extends HttpServlet {
	OrganizerService orgService=new OrganizerServiceImpl();
	//private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		//out.println("<h1>I am machine controller</h1>");
		String orgname=request.getParameter("name");
		String orgemail=request.getParameter("email");
		String orgcontact=request.getParameter("contact");
		OrganizerModel model=new OrganizerModel();
		model.setOrg_name(orgname);
		model.setOrg_email(orgemail);
		model.setOrg_contact(orgcontact);
		System.out.println(orgname+" "+orgemail+" "+orgcontact);
		boolean b=orgService.isAddOrganizer(model);
		if(b)
		{
			out.println("<h1>organizer added successfully......... </h1>");
		}
		else
		{
		out.println("<h1> organizer not added successfully....... </h1>");
		}
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
