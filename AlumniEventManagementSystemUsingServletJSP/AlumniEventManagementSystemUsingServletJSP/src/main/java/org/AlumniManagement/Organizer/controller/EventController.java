package org.AlumniManagement.Organizer.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.AlumniManagement.model.EventModel;
import org.AlumniManagement.admin.service.EventserviceImpl;
import org.AlumniManagement.admin.service.EventService;

@WebServlet("/eventController")
public class EventController extends HttpServlet {
	EventService eventService=new EventserviceImpl();
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
	   //out.println("<h1>I am Alumni controller</h1>");
		String event_name=request.getParameter("name");
		//String event_date=request.getParameter("date");
		 //String Edate=request.getParameter("date");
		 String Edate=request.getParameter("date");
		String event_location=request.getParameter("location");
		String event_description=request.getParameter("event_description");
		int org_id=Integer.parseInt(request.getParameter("org_id"));
		int br_id=Integer.parseInt(request.getParameter("br_id"));
		int alumni_id=Integer.parseInt(request.getParameter("alumni_id"));
		EventModel Emodel=new EventModel();
		Emodel.setEvent_name(event_name);
		Emodel.setEvent_date(Edate);
		Emodel.setEvent_location(event_location);
		Emodel.setEvent_description(event_description);
		Emodel.setOrg_id(org_id);
		Emodel.setBr_id(br_id);
		Emodel.setAlumni_id(alumni_id);
		System.out.println("branch id is"+br_id);
		Boolean b=eventService.isAddEvent(Emodel);
		System.out.println();
		if(b)
		{
			out.println("<h1>Event added successfully......... </h1>");
		}
		else
		{
			out.println("<h1>Event not added successfully......... </h1>");
		}
		
		
		
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
