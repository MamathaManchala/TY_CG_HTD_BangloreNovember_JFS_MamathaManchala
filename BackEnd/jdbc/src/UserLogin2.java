

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class UserLogin2 {




public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Connection conn=null;
	PreparedStatement pstmt=null;
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
	
	
	String query="SELECT * FROM users_info where userid=? and password=? ";
	pstmt=conn.prepareStatement(query);
	
	System.out.println("enter username");
	pstmt.setInt(1, Integer.parseInt(sc.nextLine()));
	System.out.println("enter password");
	pstmt.setString(2, sc.nextLine());
	
	rs=pstmt.executeQuery();
	System.out.println("Query issued....");
	
	
	
	//process the results returned 
	if(rs.next()) {
		    System.out.println("userid: "+rs.getInt(1));
			System.out.println("username: "+rs.getString(2));
			System.out.println("email :" +rs.getString(3));
	}
	else {
		System.err.println("Something went wrong");
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
				if(pstmt!=null) {
					pstmt.close();
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



