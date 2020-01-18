package com.cg.phonesimulation.dao;
import java.io.FileReader;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.cg.phonesimulation.bean.PhoneBean;

public class ListDAOImpl implements ListDAO {


	
		

		FileReader reader;
		Properties prop;
		PhoneBean bean;

		public ListDAOImpl() {
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
		public List<PhoneBean> getAllContacts() {
			
				
				List<PhoneBean> list=new ArrayList<PhoneBean>();
				
				try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),
						prop.getProperty("dbUser"),
						prop.getProperty("dbPassword"));
						Statement stmt=conn.createStatement();
						ResultSet rs=stmt.executeQuery(prop.getProperty("getAllC"))){

					while(rs.next()) {

						bean =new PhoneBean();
						
						bean.setName(rs.getString(1));
						bean.setNumber(rs.getInt(2));
						bean.setGroup(rs.getString(3));
						
						list.add(bean);
					}

					return list;

				}catch(Exception e) {
					e.printStackTrace();
				}
				return null;
			}
			
		
		

	}

	


