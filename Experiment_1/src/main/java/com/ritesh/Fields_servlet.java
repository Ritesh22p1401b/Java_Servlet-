package com.ritesh;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/Fields_servlet")
public class Fields_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Fields_servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String field1 = request.getParameter("field1");
		String field2 = request.getParameter("field2");
		String field3 = field1+" "+field2;
		
		response.setContentType("text/Newfile.html");
		
	    PrintWriter out = response.getWriter();  
	  
	    out.println("Welcome "+field3);
	    out.print("By get method");
	    out.close();
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String field1 = request.getParameter("field1");
		String field2 = request.getParameter("field2");
		String field3 = field1+" "+field2;
		
		response.setContentType("text/Newfile.html");
		
	    PrintWriter out = response.getWriter();  
	  
	    out.println("Welcome "+field3);
	    out.print("By post method");
	    out.close();
	}
}
