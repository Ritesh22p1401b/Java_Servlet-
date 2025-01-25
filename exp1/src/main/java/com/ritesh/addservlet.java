package com.ritesh;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class addservlet extends HttpServlet {
	
	public void service(HttpServletRequest req , HttpServletResponse res) throws IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		PrintWriter out = res.getWriter();
		out.println(username);
	}

}




