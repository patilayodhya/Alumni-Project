package org.AlumniManagement.Organizer.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.AlumniManagement.admin.service.OrganizerService;
import org.AlumniManagement.admin.service.OrganizerServiceImpl;
import org.AlumniManagement.model.OrganizerModel;

@WebServlet("/organizer_login")
public class mainOrgLoginController extends HttpServlet {

   
	private static final long serialVersionUID = 1L;
	private OrganizerService organizerService = new OrganizerServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("contact");

        // Retrieve all organizers from the database
        List<OrganizerModel> organizers = organizerService.getAllOrganizer(email,password);

        // Check if any organizer matches the provided email and password
        boolean isAuthenticated = false;
        for (OrganizerModel organizer : organizers) {
            if (organizer.getOrg_email().equals(email) && organizer.getOrg_contact().equals(password)) {
                isAuthenticated = true;
                break;
            }
        }
System.out.println("login is "+isAuthenticated);
        if (isAuthenticated) {
            // Redirect to the dashboard page if login is successful
        	
            response.sendRedirect("Admindashboard.jsp");
        } else {
            // Redirect back to the login page with an error message if login fails
            response.sendRedirect("Organizer_Login.jsp?error=1");
        }
    }
}
