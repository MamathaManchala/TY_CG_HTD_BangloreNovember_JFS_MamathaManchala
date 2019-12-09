package com.caps.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertUser {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Connection conn=null;
		PreparedStatement pstmt=null;

		try {
			//load the driver
			Driver driver =new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);
			System.out.println("driver loded-------------------------------------");

			//get db connection
			String dbUrl="jdbc:mysql://127.0.0.1:3306/ty_cg_nov6";
			System.out.println("enter dbusername and dbpassword");
			String dbname=sc.nextLine();
			String dbpass=sc.nextLine();
			conn=DriverManager.getConnection(dbUrl, dbname, dbpass);
			System.out.println("connection establishes............................");



			//issue sql queries
			String query="insert into users_info values(?,?,?,?,?) ";
			pstmt=conn.prepareStatement(query);

			System.out.println("enter userid");
			pstmt.setInt(1, Integer.parseInt(sc.nextLine()));//1 is parameter index
			System.out.println("enter username");
			pstmt.setString(2, sc.nextLine());
			System.out.println("enter email");
			pstmt.setString(3, sc.nextLine());
			System.out.println("enter password");
			pstmt.setString(4, sc.nextLine());
			System.out.println("enter address");
			pstmt.setString(5, sc.nextLine());

			int count=pstmt.executeUpdate();
			System.out.println("Query issued.......................................");

			//process the results

			if(count>0) {
				System.out.println("user inserted.........");}
			else {
				System.err.println("Something went wrong");
			}



		} catch (SQLException e) {

			e.printStackTrace();
		}




		//close all jdbc objects

		finally {
			try {
				if(conn!=null) {
					conn.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
			try {
				if(pstmt!=null) {
					pstmt.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
