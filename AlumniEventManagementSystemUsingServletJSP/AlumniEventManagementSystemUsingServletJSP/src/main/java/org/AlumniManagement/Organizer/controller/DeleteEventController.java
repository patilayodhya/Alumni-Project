package org.AlumniManagement.Organizer.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.AlumniManagement.admin.service.EventserviceImpl;
import org.AlumniManagement.admin.service.EventService;



@WebServlet("/deleteEvent")
public class DeleteEventController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int event_id=Integer.parseInt(request.getParameter("Event_id"));
		//out.println("selected Alumni id is "+alumni_id);
		EventService eventService=new EventserviceImpl();
		boolean b=eventService.isDeleteEventById(event_id);
		if(b)
		{
			RequestDispatcher r=request.getRequestDispatcher("viewEventjpg.jsp");
			r.forward(request, response);
		}
		else
		{
			out.println("<h1>some problem is there.....</h1>");
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
