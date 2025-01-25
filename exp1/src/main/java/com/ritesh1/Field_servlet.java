package com.ritesh1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/Field_servlet")
public class Field_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Field_servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String a=request.getParameter("first_name");
		String b=request.getParameter("last_name");
		String c = a+" "+b;
		
		response.setContentType("text/Newfile.html");
		
	    PrintWriter out = response.getWriter();  
	  
	    out.println("Welcome "+c);
	    out.print("By get method");
	    out.close();  
	    
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String a=request.getParameter("first_name");
		String b=request.getParameter("last_name");
		String c = a+" "+b;
		
		response.setContentType("text/Newfile.html");
		
	    PrintWriter out = response.getWriter();  
	  
	    out.println("Welcome "+c);
	    out.print("By post method");
	    out.close();
		
	}

}
