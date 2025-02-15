package com.ritesh1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/session_timeout")
public class session_timeout extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public session_timeout() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 HttpSession session = request.getSession(false);
		 session.setMaxInactiveInterval(300);  // Session expires after 300 seconds (5 minutes)

		 response.setContentType("text/html");
	     PrintWriter out = response.getWriter();

	     if (session == null) {
	    	    response.sendRedirect("login.html"); // Redirect to login page
	    	
        } else {
            // Session is active
            out.println("<h3>Welcome back! Your session is still active.</h3>");
        }
	}

}
