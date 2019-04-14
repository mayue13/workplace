package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.connection.DBConnection;

/**
 * Servlet implementation class ForgotPasswordController
 */

@WebServlet("/ForgotPasswordController")

public class ForgotPasswordController extends HttpServlet
{
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */

	public ForgotPasswordController() 
	{
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
			// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String e=request.getParameter("email");
		
		try 
		{
			Connection con = DBConnection.getConnection();
			Statement st=con.createStatement();
			String q="select password from userreg where email='"+e+"'";
			ResultSet i=st.executeQuery(q);
			
			if(i.next())
			{
				
				HttpSession session=request.getSession(true);
				session.setAttribute("Email", e);
			
				RequestDispatcher rd=request.getRequestDispatcher("SendPassword.jsp?name="+i.getString(1));		
				rd.include(request, response);
				}
				
			else 
			{
				out.println("<script type=\"text/javascript\">");  
				out.println("alert('Email ID doesnot exist. Provide Correct Email iD');");  
				out.println("</script>");    
				request.getRequestDispatcher("/ForgotPassword.jsp").include(request, response);
			}
		} 
		catch (Exception e2)
		{
			e2.printStackTrace();
		}
	}

}
