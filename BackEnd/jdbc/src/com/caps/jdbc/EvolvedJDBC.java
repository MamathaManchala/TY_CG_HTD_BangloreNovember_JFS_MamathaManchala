package com.caps.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class EvolvedJDBC {
	public static void main(String[] args) {

		//get all program
		Scanner sc=new Scanner(System.in);
		String dbUrl="jdbc:mysql://localhost:3306/ty_cg_nov6";
		System.out.println("enter Db user and password");
		String user=sc.nextLine();
		String pass=sc.nextLine();
		String q="select * from users_info ";
		try( Connection conn =DriverManager.getConnection(dbUrl,user,pass);
				Statement stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery(q)){

			while(rs.next()) {
				System.out.println("userid"+rs.getInt(1));
				System.out.println("username: "+rs.getString(2));
				System.out.println("email: "+rs.getString(3));
				System.out.println("****************************");
			}

			sc.close();
		}

		catch(Exception e) {
			e.printStackTrace();
		}

	}


































}

