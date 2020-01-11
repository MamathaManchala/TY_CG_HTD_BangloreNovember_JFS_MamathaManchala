package com.cg.phonesimulation.dao;
import java.io.FileReader;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

import com.cg.phonesimulation.bean.PhoneBean;

public class OperationDAOImpl implements OperationDAO {

	


		
		
		FileReader reader;
		Properties prop;
		PhoneBean bean;

		public OperationDAOImpl() {
			try {
				reader=new FileReader("db.properties");
				prop =new Properties();
				prop.load(reader);
				Class.forName(prop.getProperty("driverClass"));

			} catch (Exception e) {
				e.printStackTrace();
			}
		}



		@Override
		public boolean addContact(PhoneBean bean) {
			try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),
					prop.getProperty("dbUser"),
					prop.getProperty("dbPassword"));
					PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("addC"))){

				pstmt.setString(1,bean.getName());
				pstmt.setInt(2,bean.getNumber());
				pstmt.setString(3,bean.getGroup());
				

				int  count= pstmt.executeUpdate(); 
				if(count>0) {
					return true;
				}

			}catch(Exception e) {
				e.printStackTrace();
			}
			return false;
		}
		

		@Override
		public boolean deleteContact(String name) {
			try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),
					prop.getProperty("dbUser"),
					prop.getProperty("dbPassword"));
					PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("deleteC"))){
				pstmt.setString(1, name);
				int  count= pstmt.executeUpdate(); 
				if(count>0) {
					return true;
				}

			}catch(Exception e) {
				e.printStackTrace();
			}
			return false;
		}
		
		@Override
		public boolean editContact(String name) {
//			try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),
//					prop.getProperty("dbUser"),
//					prop.getProperty("dbPassword"));
//					PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("updateQuery"))){
//
//								pstmt.setString(1,bean.getName());
//								pstmt.setInt(4, bean.getNumber());
//						     	pstmt.setString(3, bean.getGroup());
//
////				pstmt.setString(1,name);
////				pstmt.setInt(2, number);
////				pstmt.setString(3,group);
//				
//
//				int  count= pstmt.executeUpdate();  
//				if(count>0) {
//					return true;
//				}	
//
//			}catch(Exception e) {
//				e.printStackTrace();
//			}
//			return false;
//			}

			

			return false;

		}
	}


