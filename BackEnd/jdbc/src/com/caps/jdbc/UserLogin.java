
package com.caps.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UserLogin {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;

		try {
			//load the Driver
			Driver driver= new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);
			System.out.println("driver loded.....");

			//Get the DB via Driver

			String dbUrl="jdbc:mysql://localhost:3306/ty_cg_nov6";//127.0.0.1:3306
			System.out.println("enter dbusername and password");
			String dbUser=sc.nextLine();
			String dbPass=sc.nextLine();
			conn=DriverManager.getConnection(dbUrl,dbUser,dbPass);
			System.out.println("connection established....");


			//Issue SQL queries via Connection
			String query="SELECT * FROM users_info where userid=2019001 and password='nani1' ";
			stmt=conn.createStatement();
			rs=stmt.executeQuery(query);
			System.out.println("Query issued....");


			//process the results returned 
			if(rs.next()) {
				System.out.println("userid: "+rs.getInt(1));
				System.out.println("username: "+rs.getString(2));
				System.out.println("email :" +rs.getString(3));
			}
			//close all JDBC objects
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(conn!=null) {
					conn.close();
				}
			}
			catch (SQLException e) {

				e.printStackTrace();
			}
			try {
				if(stmt!=null) {
					stmt.close();
				}
			}
			catch (SQLException e) {

				e.printStackTrace();
			}
			try {
				if(rs!=null) {
					rs.close();
				}
			}
			catch (SQLException e) {

				e.printStackTrace();
			}
		}
	}





}
