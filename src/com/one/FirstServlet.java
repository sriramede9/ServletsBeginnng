package com.one;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {
	// doget

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");

		String fullname = fname + lname;

		// System.out.println("full name is \t" + fullname);

//		PrintWriter pWriter = resp.getWriter();
//		
//		pWriter.println("<html><body style='background-color:cyan'><h1 align='center'>Hello \t"+fullname+" </h1></body></html>");
		
		//now to redirect
		//resp.sendRedirect("https://www.google.com/");
		
		//now to local html page
		
		//resp.sendRedirect("test.html");
		
		//now to jsp
		req.setAttribute("exp", fullname);
		
	RequestDispatcher requestDispatcher=	req.getRequestDispatcher("/output.jsp");
	
	requestDispatcher.forward(req, resp);
		
	}

	// dopost

}
