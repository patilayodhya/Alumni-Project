package org.AlumniManagement.Organizer.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.AlumniManagement.admin.service.EventService;
import org.AlumniManagement.admin.service.EventserviceImpl;
import org.AlumniManagement.model.EventModel;



@WebServlet("/finalEvent")
public class FinalEventUpdate extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		//out.println("<h1>Update Machine Controller</h1>");
		int event_id=Integer.parseInt(request.getParameter("event_id"));
		//System.out.println("event id"+event_id);
		String event_name=request.getParameter("name");
		String event_date=request.getParameter("date");
		
		String event_location=request.getParameter("location");
		String event_description=request.getParameter("description");
		//int org_id=Integer.parseInt(request.getParameter("oname"));
		//int br_id=Integer.parseInt(request.getParameter("br_name"));
		
		EventModel Emodel=new EventModel();
		Emodel.setEvent_id(event_id);
		Emodel.setEvent_name(event_name);
		Emodel.setEvent_date(event_date);
		Emodel.setEvent_location(event_location);
		Emodel.setEvent_description(event_description);
		//Emodel.setOrg_id(org_id);
		//Emodel.setBr_id(br_id);
		
		
		EventService eventService=new EventserviceImpl();
		boolean b=eventService.isUpdateEvent(Emodel);
		if(b)
		{
			RequestDispatcher r=request.getRequestDispatcher("viewEventjsp.jsp");
		    r.forward(request, response);
			
		}
		else
		{
			System.out.println("<h1>Event Data not updated</h1>");
		}
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
