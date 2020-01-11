package com.cg.phonesimulation.factory;
import com.cg.phonesimulation.dao.PhoneDao;


import com.cg.phonesimulation.dao.PhoneDaoImpl;
import com.cg.phonesimulation.services.PhoneServices;
import com.cg.phonesimulation.services.PhoneServicesImpl;

public class PhoneFactory {
		
		public static PhoneDao instanceOfPhoneDaoImpl() {
		PhoneDao dao=new PhoneDaoImpl();
		
		return dao;
		}
		
		public static PhoneServices instanceOfPhoneServices() {
			PhoneServices services =  new PhoneServicesImpl();
			return services;
		}
		
		


	}


