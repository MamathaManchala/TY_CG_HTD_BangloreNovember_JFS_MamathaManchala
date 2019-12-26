package com.cg.phonesimulation.factory;

import com.cg.phonesimulation.dao.OperationDAO;



import com.cg.phonesimulation.dao.OperationDAOImpl;
import com.cg.phonesimulation.services.OperationServices;
import com.cg.phonesimulation.services.OperationServicesImpl;
public class OperationFactory {




		
		public static OperationDAO instanceOfOperationDAOImpl() {
			OperationDAO dao=new OperationDAOImpl();
			return dao;
		}
		
		public static OperationServices instanceOfOperationServices() {
			OperationServices services= new OperationServicesImpl();
			return services;
		}

	}

