package com.capgemini.forestrymanagementcollections.factory;

import com.capgemini.forestrymanagementcollections.dao.ContractDao;
import com.capgemini.forestrymanagementcollections.dao.ContractDaoImpl;
import com.capgemini.forestrymanagementcollections.dao.CustomerDao;
import com.capgemini.forestrymanagementcollections.dao.CustomerDaoImpl;
import com.capgemini.forestrymanagementcollections.dao.LandDao;
import com.capgemini.forestrymanagementcollections.dao.LandDaoImpl;
import com.capgemini.forestrymanagementcollections.dao.ProductDao;
import com.capgemini.forestrymanagementcollections.dao.ProductDaoImpl;
import com.capgemini.forestrymanagementcollections.dao.SchedulerDao;
import com.capgemini.forestrymanagementcollections.dao.SchedulerDaoImpl;
import com.capgemini.forestrymanagementcollections.services.ContractServices;
import com.capgemini.forestrymanagementcollections.services.ContractServicesImpl;
import com.capgemini.forestrymanagementcollections.services.CustomerServices;
import com.capgemini.forestrymanagementcollections.services.CustomerServicesImpl;
import com.capgemini.forestrymanagementcollections.services.LandServices;
import com.capgemini.forestrymanagementcollections.services.LandServicesImpl;
import com.capgemini.forestrymanagementcollections.services.ProductServices;
import com.capgemini.forestrymanagementcollections.services.ProductServicesImpl;
import com.capgemini.forestrymanagementcollections.services.SchedulerServices;
import com.capgemini.forestrymanagementcollections.services.SchedulerServicesImpl;

public class ForestryFactory {

	
	private ForestryFactory() {

	}

	public	static CustomerDao instanceOfCustomerDaoImpl(){
		CustomerDao customerDao = new CustomerDaoImpl();
		return customerDao;
	}

	public static CustomerServices instanceOfCustomerServices() {
		CustomerServices customerservices = new CustomerServicesImpl();
		return customerservices;
	}
	

	public	static ContractDao instanceOfContractDaoImpl(){
		ContractDao contractDao = new ContractDaoImpl();
		return contractDao;
	}

	public static ContractServices instanceOfContractServices() {
		ContractServices contractservices = new ContractServicesImpl();
		return contractservices;
	}
	

	public	static LandDao instanceOfLandDaoImpl(){
		LandDao landDao = new LandDaoImpl();
		return landDao;
	}

	public static LandServices instanceOfLandServices() {
		LandServices landservices = new LandServicesImpl();
		return landservices;
	}
	

	public	static ProductDao instanceOfProductDaoImpl(){
		ProductDao productDao = new ProductDaoImpl();
		return productDao;
	}

	public static ProductServices instanceOfProductServices() {
		ProductServices productservices = new ProductServicesImpl();
		return productservices;
	}
	

	public	static SchedulerDao instanceOfSchedulerDaoImpl(){
		SchedulerDao schedulerDao = new SchedulerDaoImpl();
		return schedulerDao;
	}

	public static SchedulerServices instanceOfSchedulerServices() {
		SchedulerServices schedulerservices = new SchedulerServicesImpl();
		return schedulerservices;
	}
	



}
