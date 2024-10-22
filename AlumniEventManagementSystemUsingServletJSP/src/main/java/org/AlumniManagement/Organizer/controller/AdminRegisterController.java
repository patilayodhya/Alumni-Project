package org.AlumniManagement.Organizer.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.AlumniManagement.admin.service.AdminRegService;
import org.AlumniManagement.admin.service.AdminRegServiceImpl;
import org.AlumniManagement.model.AdminRegModel;
import org.AlumniManagement.admin.Repository.AdminRegRepository;
import org.AlumniManagement.admin.Repository.AdminRegRepositoryImpl;
@WebServlet("/AdRegi")
public class AdminRegisterController extends HttpServlet {
	AdminRegService ArService=new AdminRegServiceImpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
	    String name=request.getParameter("name");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		AdminRegModel Armodel=new AdminRegModel(name,email,password);
		
		        Armodel.setName(name);
				Armodel.setEmail(email);
				Armodel.setPassword(password);
				HttpSession session=request.getSession();
				boolean b=ArService.isAddAdmin(Armodel);
				 if(b)
					{
					 session.setAttribute("sucMsg", "Register successfully....");
					 response.sendRedirect("signup.jsp");
						//out.println("<h1>Register successfully......... </h1>");
					}
					else
					{
						 session.setAttribute("errorMsg", "something wrong on server....");
						 response.sendRedirect("signup.jsp");
			
					//out.println("<h1> not register successfully please register again....... </h1>");
					}
	}

	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
