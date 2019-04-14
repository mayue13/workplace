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
import javax.servlet.http.HttpSession;

import com.algo.HashGeneratorUtils;
import com.connection.DBConnection;


@WebServlet("/UserStatusController")
public class UserStatusController extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
    
    public UserStatusController()
    {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		HttpSession session=request.getSession(true);
		PrintWriter pw=response.getWriter();
		String id=request.getParameter("candidateid");
		Connection con;
		String donate=request.getParameter("donate");
		String email=(String)session.getAttribute("email");
		String name=null,Date = null,Email_ID=null,Mobile=null;
		try
		{
			con = DBConnection.getConnection();
			Statement stRegister=con.createStatement();
			ResultSet rsLogin;
			rsLogin=stRegister.executeQuery("select * from tblngoprofile where Register_ID='" +id+ "'");
		
			if(rsLogin.next())
			{
				
				name=rsLogin.getString("Organization_Name");
				Date=rsLogin.getString("Current_data");
				Email_ID=rsLogin.getString("Email_ID");
				Mobile=rsLogin.getString("Can"
						+ "didate_Mobile"); 
				
				
			}
			String UserName=null,Mobile_No=null;
			Statement stRegister1=con.createStatement();
			ResultSet rsLogin1;
			rsLogin1=stRegister1.executeQuery("select * from register where Email_ID='" +email+ "'");
		
			if(rsLogin1.next())
			{
				
					 
				UserName=rsLogin1.getString("UserName");
				Mobile_No=rsLogin1.getString("Mobile_No");
				
			}
				
			String sha=name+Date+Email_ID+Mobile+UserName+Mobile_No+email+donate;
			String blockdata=HashGeneratorUtils.generateSHA256(sha);
			System.out.println("Block Data=>"+blockdata);
			String sql="insert into tbltransaction(Transaction_ID,Email_ID,BlockData) values(?,?,?)";
			PreparedStatement p=(PreparedStatement) con.prepareStatement(sql);
			
			
			p.setString(1,id );
			p.setString(2, email);
			p.setString(3, blockdata);
			
			int i=p.executeUpdate();
			RequestDispatcher rd = request.getRequestDispatcher("/TransactionPage.jsp");
			
			rd.include(request, response); 
		}
		catch(Exception e)
		{
			
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		doGet(request, response);
	}

}
