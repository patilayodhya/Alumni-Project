package org.AlumniManagement.Organizer.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.AlumniManagement.model.FeedbackModel;
import org.AlumniManagement.admin.service.FeedbackService;
import org.AlumniManagement.admin.service.FeedbackServiceImpl;


@WebServlet("/feedbackController")
public class FeedbackController extends HttpServlet {
	FeedbackService fService=new FeedbackServiceImpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
	   // out.println("<h1>I am Alumni controller</h1>");
	    int Alumni_id=Integer.parseInt(request.getParameter("alumni_id"));
	    int org_id=Integer.parseInt(request.getParameter("org_id"));
	    int Event_id=Integer.parseInt(request.getParameter("event_id"));
		String fmsg=request.getParameter("msg");
		
		FeedbackModel fModel=new FeedbackModel();
		fModel.setAlumni_id(Alumni_id);
		fModel.setOrg_id(org_id);
		fModel.setEvent_id(Event_id);
		fModel.setFmsg(fmsg);
		 boolean b=fService.isAddfeedback(fModel);
		    if(b)
			{
				out.println("<h1>Feedback added successfully......... </h1>");
			}
			else
			{
			out.println("<h1> Feedback  not added successfully....... </h1>");
			}
		    
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
