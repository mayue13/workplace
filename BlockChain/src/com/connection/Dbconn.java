package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbconn {
 public static int key=0;
 public static String filepath="F:\\BE2018-2019\\PVG Rahul Kale\\E_Voting_System\\WebContent\\ProfileImage";
 public static String filepath1="ProfileImage/";
 
 public static String filepath2="F:\\BE2018-2019\\PVG Rahul Kale\\E_Voting_System\\WebContent\\Voter";
 public static String filepath3="Voter/";
	public Dbconn() throws SQLException {
		// initComponents();
		// Connection con;

	}

	public static Connection conn() throws SQLException, ClassNotFoundException {
		Connection con;
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/ngodb", "root", "admin");

		return (con);

	}
	public static Connection conn1() throws SQLException, ClassNotFoundException {
		Connection con;
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/blockchain1", "root", "admin");

		return (con);

	}
	public static Connection conn2() throws SQLException, ClassNotFoundException {
		Connection con;
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/blockchain2", "root", "admin");

		return (con);

	}
	public static Connection conn3() throws SQLException, ClassNotFoundException {
		Connection con;
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/blockchain3", "root", "admin");

		return (con);

	}
	public static Connection conn4() throws SQLException, ClassNotFoundException {
		Connection con;
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/blockchain4", "root", "admin");

		return (con);

	}


}
