package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AdminLoginController")
public class AdminLoginController extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
    
    public AdminLoginController() 
    {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter pw=response.getWriter();
		String username=request.getParameter("email");
		String Password=request.getParameter("password");
		System.out.println("Email-ID=>"+request.getParameter("email"));
		System.out.println("Password=>"+request.getParameter("password"));

		if(username.toLowerCase().equals("admin@gmail.com")&&Password.toLowerCase().equals("admin"))
		{
			pw.println("<script> alert('Login Successfuly');</script>");
			RequestDispatcher rd = request.getRequestDispatcher("AdminHome.jsp");
			rd.include(request, response); 
		}
		
		else
		{
			pw.println("<script> alert(' Wrong Email-ID and Password');</script>");
			RequestDispatcher rd = request.getRequestDispatcher("AdminLogin.jsp");
			rd.include(request, response); 
			
		}
		
	}

}
