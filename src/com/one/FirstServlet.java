package com.one;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {
	// doget

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Student student = new Student();

		student.setName("Whatever");

		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");

		String fullname = fname + lname;

		String arr[] = { "India", "America", "Canada", "Uk" };

		java.util.List<Student> list = new ArrayList<>();

		list.add(student);

		Student student2 = new Student();
		student2.setName("James");

		list.add(student2);
		// System.out.println("full name is \t" + fullname);

//		PrintWriter pWriter = resp.getWriter();
//		
//		pWriter.println("<html><body style='background-color:cyan'><h1 align='center'>Hello \t"+fullname+" </h1></body></html>");

		// now to redirect
		// resp.sendRedirect("https://www.google.com/");

		// now to local html page

		// resp.sendRedirect("test.html");

		// now to jsp
		req.setAttribute("exp", fullname);

		req.setAttribute("studobj", student);

		req.setAttribute("ar", arr);

		req.setAttribute("stlist", list);

		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/output.jsp");

		requestDispatcher.forward(req, resp);

	}

	// dopost

	// life cycle explore

	// current class obj first=1
	public FirstServlet() {
		super();
		// TODO Auto-generated constructor stub

		System.out.println("Current class obj-1");
	}

	// init method-2
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();

		System.out.println("I am init()-2");
	}

	// service method
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(req, res);

		System.out.println("In service method() -3");
	}

	// now service method will send to do get,do post based on request.

	// destroy method-4
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();

		System.out.println("I am destroyed when the object in the service method is destroyed");
	}

}
