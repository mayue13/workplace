package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.connection.DBConnection;
import com.mail.SendKeyMail;


@WebServlet("/UserLoginController")

public class UserLoginController extends HttpServlet
{

	private static final long serialVersionUID = 1L;
 
    public UserLoginController() 
    {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
			
	}

	public String keyData() 
	{
	
		StringBuilder ss = new StringBuilder();
		Random r = new Random();
		char ch;

		for (int i = 0; i < 5; i++) 
		{
			ch = (char) (Math.floor(26 * r.nextDouble() + 65));
			ss.append(ch);
		}

		return ss.toString();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		HttpSession session=request.getSession(true);
		PrintWriter pw=response.getWriter();
		System.out.println("Login controller");
		String username=request.getParameter("email");
		String Password=request.getParameter("password");
		System.out.println("Email-ID=>"+request.getParameter("email"));
		System.out.println("Password=>"+request.getParameter("password"));
		
		{
			Connection con;
			try
			{
				con = DBConnection.getConnection();
				Statement stRegister=con.createStatement();
				ResultSet rsLogin;
				rsLogin=stRegister.executeQuery("select * from register where Email_ID='" +username+ "' and Pwd='"+Password+"'");
			
				if(rsLogin.next())
				{
					
						System.out.println("OK ");
						String otpcode=keyData();
					
						session.setAttribute("unam", rsLogin.getString(1));
						session.setAttribute("email", username);
						
						
						RequestDispatcher rd = request.getRequestDispatcher("/UserView.jsp");
						
						rd.include(request, response); 
					
					
				}
					
				
				else
				{
					pw.println("<script> alert(' Wrong Email-ID or Password');</script>");
					RequestDispatcher rd = request.getRequestDispatcher("/UserLogin.jsp");
							rd.include(request, response);
					
					
				}
			}
			catch(Exception e)
			{
				
			}
		
		}
	}

}
