package com.capgemini.forestryjpawithhibernate.controller;

import java.util.List;
import java.util.Scanner;

import com.capgemini.forestryjpawithhibernate.dto.ContractBean;
import com.capgemini.forestryjpawithhibernate.factory.ForestryFactory;
import com.capgemini.forestryjpawithhibernate.services.ContractServices;

public class ContractMain1 {
	
	static ContractServices contractServices=ForestryFactory.instanceOfContractServices();

	public static void contMain1()  {

		Scanner sc=new Scanner(System.in);

				System.out.println("All Contracts----------------");
				List<ContractBean> getAllCont= contractServices.getAllContract();
				for(ContractBean contB:getAllCont) {
					System.out.println(contB);		

		}
	}

}
