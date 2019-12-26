package com.cg.phonesimulation.factory;

import com.cg.phonesimulation.dao.ListDAO;
import com.cg.phonesimulation.dao.ListDAOImpl;
import com.cg.phonesimulation.services.ListServices;
import com.cg.phonesimulation.services.ListServicesImpl;

public class ListFactory {

	public static ListDAO instanceOfListDAOIImpl() {
		ListDAO dao = new ListDAOImpl();

		return dao;
	}

	public static ListServices instanceOfListServices() {
		ListServices services = new ListServicesImpl();
		return services;
	}
}
