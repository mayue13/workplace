
package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection
{
	
	public static String DBNAME="ngodb";
	public static String DBUSER="root";
	public static String DBPASSWORD="admin";
	
	public static Connection connection;
	
	public static Connection getConnection() 
	{
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+DBNAME,DBUSER,DBPASSWORD);
			System.out.println("Connection Done");
			
		}
		catch (Exception e)
		{
			
			e.printStackTrace();
		}
		
		return connection;
	}


}
