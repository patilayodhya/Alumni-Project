package org.AlumniManagement.Organizer.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.AlumniManagement.admin.service.AttendenceServiceImpl;
import org.AlumniManagement.model.AttendenceModel;

@WebServlet("/attendenceController")
public class AttendenceController extends HttpServlet {
	
       AttendenceServiceImpl attService=new AttendenceServiceImpl();
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int alumni_id=Integer.parseInt(request.getParameter("id"));
		int br_id=Integer.parseInt(request.getParameter("br_id"));
		int event_id=Integer.parseInt(request.getParameter("event"));
		String status=request.getParameter("status");
		
		AttendenceModel Atmodel=new AttendenceModel();
		Atmodel.setAlumni_id(alumni_id);
		Atmodel.setBr_id(br_id);
		Atmodel.setEvent_id(event_id);
		Atmodel.setStatus(status);
		boolean b= attService.isAddAttendence(Atmodel);
		if(b)
		{
			out.println("<h1>Attendence Marked successfully......... </h1>");
		}
		else
		{
		out.println("<h1> Attendence Not Marked ....... </h1>");
		}
	    
		
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
