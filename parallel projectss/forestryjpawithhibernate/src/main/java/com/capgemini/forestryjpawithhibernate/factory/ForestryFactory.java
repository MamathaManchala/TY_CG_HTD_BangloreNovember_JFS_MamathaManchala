package com.capgemini.forestryjpawithhibernate.factory;

import com.capgemini.forestryjpawithhibernate.dao.ContractDao;
import com.capgemini.forestryjpawithhibernate.dao.ContractDaoImpl;
import com.capgemini.forestryjpawithhibernate.dao.CustomerDao;
import com.capgemini.forestryjpawithhibernate.dao.CustomerDaoImpl;
import com.capgemini.forestryjpawithhibernate.dao.LandDao;
import com.capgemini.forestryjpawithhibernate.dao.LandDaoImpl;
import com.capgemini.forestryjpawithhibernate.dao.ProductDao;
import com.capgemini.forestryjpawithhibernate.dao.ProductDaoImpl;
import com.capgemini.forestryjpawithhibernate.dao.ScheduleDaoImpl;
import com.capgemini.forestryjpawithhibernate.dao.SchedulerDao;
import com.capgemini.forestryjpawithhibernate.dao.UsersDao;
import com.capgemini.forestryjpawithhibernate.dao.UsersDaoImpl;
import com.capgemini.forestryjpawithhibernate.services.ContractServices;
import com.capgemini.forestryjpawithhibernate.services.ContractServicesImpl;
import com.capgemini.forestryjpawithhibernate.services.CustomerServices;
import com.capgemini.forestryjpawithhibernate.services.CustomerServicesImpl;
import com.capgemini.forestryjpawithhibernate.services.LandServices;
import com.capgemini.forestryjpawithhibernate.services.LandServicesImpl;
import com.capgemini.forestryjpawithhibernate.services.ProductServices;
import com.capgemini.forestryjpawithhibernate.services.ProductServicesImpl;
import com.capgemini.forestryjpawithhibernate.services.SchedulerServices;
import com.capgemini.forestryjpawithhibernate.services.SchedulerServicesImpl;
import com.capgemini.forestryjpawithhibernate.services.UserServices;
import com.capgemini.forestryjpawithhibernate.services.UserServicesImpl;

public class ForestryFactory {

	private ForestryFactory() {

	}

	public	static CustomerDao instanceOfCustomerDaoImpl(){
		CustomerDao customerDao=new CustomerDaoImpl();
		return customerDao;
	}

	public static CustomerServices instanceOfCustomerServices() {
		CustomerServices customerservices=new CustomerServicesImpl();
		return customerservices;
	}
	

	public	static ContractDao instanceOfContractDaoImpl(){
		ContractDao contractDao=new ContractDaoImpl();
		return contractDao;
	}

	public static ContractServices instanceOfContractServices() {
		ContractServices contractservices=new ContractServicesImpl();
		return contractservices;
	}
	

	public	static LandDao instanceOfLandDaoImpl(){
		LandDao landDao=new LandDaoImpl();
		return landDao;
	}

	public static LandServices instanceOfLandServices() {
		LandServices landservices=new LandServicesImpl();
		return landservices;
	}
	

	public	static ProductDao instanceOfProductDaoImpl(){
		ProductDao productDao=new ProductDaoImpl();
		return productDao;
	}

	public static ProductServices instanceOfProductServices() {
		ProductServices productservices=new ProductServicesImpl();
		return productservices;
	}
	

	public	static SchedulerDao instanceOfSchedulerDaoImpl(){
		SchedulerDao schedulerDao=new ScheduleDaoImpl();
		return schedulerDao;
	}

	public static SchedulerServices instanceOfSchedulerServices() {
		SchedulerServices schedulerservices=new SchedulerServicesImpl();
		return schedulerservices;
	}
	public static UsersDao instanceOfUsersDaoImpl(){
		UsersDao userDao=new UsersDaoImpl();
		return userDao;
	}

	public static UserServices instanceOfUserServices() {
		UserServices userservices=new UserServicesImpl();
		return userservices;
	}
	

	
}
