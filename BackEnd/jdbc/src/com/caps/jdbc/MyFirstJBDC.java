package com.caps.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MyFirstJBDC {

	public static void main(String[] args) {

		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;




		try {
			//load driver
			Driver driver= new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);
			System.out.println("driver loded.....");


			//get DB connection via driver
			String dbUrl="jdbc:mysql://localhost:3306/ty_cg_nov6"+"?user=root&password=root";
			conn=DriverManager.getConnection(dbUrl);
			System.out.println("connection established....");

			//issue SQL queries via connection
			String query="SELECT * FROM users_info";
			stmt=conn.createStatement();
			rs=stmt.executeQuery(query);
			System.out.println("Query issued....");
			System.out.println("...........................................");

			//process the Results returned
			while(rs.next()) {
				System.out.println("userid: "+rs.getInt("userid"));
				System.out.println("username: "+rs.getString("username"));
				System.out.println("email :" +rs.getString("email"));
				System.out.println("*********************************************************************");

			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		finally {

			try {
				if(conn!=null) {
					conn.close();
				} }
			catch (SQLException e) {

				e.printStackTrace();
			}
			try {
				if(stmt!=null) {
					stmt.close();
				}
			}
			catch(SQLException e) {
				e.printStackTrace();
			}try {
				if(rs!=null) {
					rs.close();
				}
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
		}

	}

}


