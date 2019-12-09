package com.caps.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteUser {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Connection conn=null;
		PreparedStatement pstmt=null;

		try {
			//load the driver
			//			Driver driver =new com.mysql.jdbc.Driver();
			//			DriverManager.registerDriver(driver);
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver loded-------------------------------------");

			//get db connection
			String dbUrl="jdbc:mysql://127.0.0.1:3306/ty_cg_nov6";
			System.out.println("enter dbusername");
			String dbname=sc.nextLine();
			System.out.println("enter dbpassword");
			String dbpass=sc.nextLine();
			conn=DriverManager.getConnection(dbUrl, dbname, dbpass);
			System.out.println("connection establishes............................");



			//issue sql queries
			String query="delete from users_info where userid= ? and password= ? ";
			pstmt=conn.prepareStatement(query);
			System.out.println("enter userid");
			pstmt.setInt(1, Integer.parseInt(sc.nextLine()));//1 is parameter index
			System.out.println("enter password");
			pstmt.setString(2, sc.nextLine());
			int count=pstmt.executeUpdate();
			System.out.println("Query issued.......................................");

			//process the results

			if(count>0) {
				System.out.println("user deleted..........");}
			else {
				System.err.println("Something went wrong");
			}



		} catch (Exception e) {

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

