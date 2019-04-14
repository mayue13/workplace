package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.connection.DBConnection;

@WebServlet("/UserRegisterController")
public class UserRegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public UserRegisterController() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		//HttpSession session=request.getSession(true);
		PrintWriter pw=response.getWriter();
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String mobileno=request.getParameter("mobileno");
		String address=request.getParameter("address");
		String gender=request.getParameter("gender");
		//String otpcode="null";
//		String status="null";
		try
		  {
			Connection con;
			con = DBConnection.getConnection();
			Statement stRegister=con.createStatement();
			ResultSet rsLogin;
			rsLogin=stRegister.executeQuery("select * from register where Email_ID='" +email+ "'");
			
			if(rsLogin.next())
			{
				
				pw.println("<script> alert(' AllReady Email-ID Existing');</script>");
				RequestDispatcher rd = request.getRequestDispatcher("UserLogin.jsp");
				
				
				rd.include(request, response); 
				
				
			}
			else
			{
				
			String sql="insert into register(UserName,Address,Email_ID,Gender,Pwd,Mobile_No) values(?,?,?,?,?,?)";
			PreparedStatement p=(PreparedStatement) con.prepareStatement(sql);
			String amount="100000";
			
			p.setString(1,name );
			p.setString(2,address);
			p.setString(3, email);
			p.setString(4, gender);
			p.setString(5,password);
			p.setString(6, mobileno);
			int i=p.executeUpdate();
			
			String sql1="insert into tblmaster(Email_ID,Amount_Donate) values(?,?)";
			PreparedStatement p1=(PreparedStatement) con.prepareStatement(sql1);
			
			
			p1.setString(1,email );
			p1.setString(2,amount);
			
		p1.executeUpdate();
			
			if(i!=0)
			{
				System.out.println("OK ");
				pw.println("<script> alert('Registered Successfuly we will connect you shortly');</script>");
				RequestDispatcher rd = request.getRequestDispatcher("/UserLogin.jsp");
				rd.include(request, response); 
			}
			else
			{
				
				RequestDispatcher rd = request.getRequestDispatcher("/Register.jsp");
						rd.include(request, response);
				
			}
			}
		}
		catch(Exception exc)
		{
			System.err.println(exc);
		}
		}
		
		
	


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
