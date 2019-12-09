package com.caps.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;



public class UserEmailUpdate {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Connection conn=null;
		PreparedStatement pstmt=null;


		try {
			//			load the driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver loded---------------------------");

			//		   get db connection

			String dbUrl="jdbc:mysql://localhost:3306/ty_cg_nov6";
			System.out.println("enter username and password");
			String user=sc.nextLine();
			String pass=sc.nextLine();
			conn=DriverManager.getConnection(dbUrl,user,pass);
			System.out.println("connection established---------------------------");


			//		issue sql queries

			String query=" update users_info set email=? " + " where userid=? and password=? ";
			pstmt=conn.prepareStatement(query);
			System.out.println("enter userid");
			pstmt.setInt(2, Integer.parseInt(sc.nextLine()));
			System.out.println("enter new email");
			pstmt.setString(1, sc.nextLine());
			System.out.println("enter password to update");
			pstmt.setString(3, sc.nextLine());
			int count=pstmt.executeUpdate();
			System.out.println("query is issued-------------");


			//		process the results

			if(count>0) {
				System.out.println("email updated------------");
			}
			else {
				System.err.println("Something went wrong");
			}

			sc.close();



		}
		catch (Exception e) {

			e.printStackTrace();
		}

		//		close all jdbc objects


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
