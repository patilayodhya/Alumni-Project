package org.AlumniManagement.Organizer.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.AlumniManagement.admin.service.AdminRegService;
import org.AlumniManagement.admin.service.AdminRegServiceImpl;

@WebServlet("/navmain")
public class MainLoginController extends HttpServlet {
	AdminRegService AdService=new AdminRegServiceImpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String email = request.getParameter("email");
		String password = request.getParameter("password");
	

		if (email.equals(email) && password.equals(password))
		{
			//it is used for forward the page from servlet and include another page content in servlet
			RequestDispatcher r = request.getRequestDispatcher("AlumniDashboard.jsp");
			r.forward(request, response); //forward the page from servlet
		} else {

			RequestDispatcher r = request.getRequestDispatcher("navmain");
			r.include(request, response); //add another page content in servlet or show on same page 
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
