package com.ritesh;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/session_servlet")
public class session_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public session_servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
	            
	        response.setContentType("text/html");
	        PrintWriter out = response.getWriter();

	        // Get the session object; create a new one if it doesn't exist
	        HttpSession session = request.getSession(true);

	        // Get the session creation time
	        long creationTime = session.getCreationTime();

	        // Get the last-accessed time
	        long lastAccessedTime = session.getLastAccessedTime();

	        // Format the times for readability
	        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	        String creationTimeFormatted = formatter.format(new Date(creationTime));
	        String lastAccessedTimeFormatted = formatter.format(new Date(lastAccessedTime));

	        // Output session details
	        out.println("<html><body>");
	        out.println("<h1>Session Information</h1>");
	        out.println("<p>Session ID: " + session.getId() + "</p>");
	        out.println("<p>Session Creation Time: " + creationTimeFormatted + "</p>");
	        out.println("<p>Last Accessed Time: " + lastAccessedTimeFormatted + "</p>");
	        out.println("<p>New session created: " + (session.isNew() ? "Yes" : "No") + "</p>");
	        out.println("</body></html>");

	        out.close();
	    }


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
