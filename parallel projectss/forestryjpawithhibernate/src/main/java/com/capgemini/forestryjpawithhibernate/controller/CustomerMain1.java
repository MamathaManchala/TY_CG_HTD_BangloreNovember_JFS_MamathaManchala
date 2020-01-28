package com.capgemini.forestryjpawithhibernate.controller;

import java.util.List;
import java.util.Scanner;

import com.capgemini.forestryjpawithhibernate.dto.CustomerBean;
import com.capgemini.forestryjpawithhibernate.factory.ForestryFactory;
import com.capgemini.forestryjpawithhibernate.services.CustomerServices;

public class CustomerMain1 {
	
	static CustomerServices customerServices = ForestryFactory.instanceOfCustomerServices();

	public static void custMain1()  {

		Scanner sc=new Scanner(System.in);

				System.out.println("All Customers----------------");
				List<CustomerBean> getAllC= customerServices.getAllCustomer();
				for(CustomerBean custB:getAllC) {
					System.out.println(custB);
					

	}

}
}
