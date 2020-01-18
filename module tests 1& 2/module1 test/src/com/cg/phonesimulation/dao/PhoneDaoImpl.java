package com.cg.phonesimulation.dao;
import java.io.FileReader;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.cg.phonesimulation.bean.PhoneBean;



public class PhoneDaoImpl implements PhoneDao{
	

	

		
		
		FileReader reader;
		Properties prop;
		PhoneBean bean;

		public PhoneDaoImpl() {
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
		public PhoneBean searchContact(String name) {
			PhoneBean bean=null;

			try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),
					prop.getProperty("dbUser"),
					prop.getProperty("dbPassword"));
					PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("searchC"))){

				pstmt.setString(1,name);
			


				ResultSet rs=pstmt.executeQuery();

				while(rs.next()) {
					bean =new PhoneBean();
					bean.setName(rs.getString(1));
					bean.setNumber(rs.getInt(2));
					bean.setGroup(rs.getString(3));
				
				}

			}catch(Exception e) {
				e.printStackTrace();
			}
			return bean;
		}
		

		@Override
		public boolean callContact(String name) {
			
			return false;
		}

		@Override
		public boolean messageContact(String name) {
			return false;
		}

	}

