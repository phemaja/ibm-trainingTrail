package com.ibm.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlets extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userid = request.getParameter("userid");
		String passwrd = request.getParameter("passwrd");
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		if(userid.equals("duke") && passwrd.equals("sussex"))
		{
			//Login Success
			//response.sendRedirect("hello.jsp");
			out.println("<h2>Login Succes</h2>");
		}
		else
		{
			//Login Failed
			//response.sendRedirect("Login.jsp");
			out.println("<h2> Login Failed</h2>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		doGet(request, response);
	}

}