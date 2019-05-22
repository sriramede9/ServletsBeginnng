package com.one;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {
	// doget

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");

		String fullname = fname + lname;

		System.out.println("full name is \t" + fullname);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");

		String fullname = fname + lname;

		System.out.println("full name is \t" + fullname);
	}

	// dopost

}
