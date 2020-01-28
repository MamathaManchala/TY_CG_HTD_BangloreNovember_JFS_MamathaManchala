package com.capgemini.forestryjpawithhibernate.controller;

import java.util.List;
import java.util.Scanner;

import com.capgemini.forestryjpawithhibernate.dto.UsersBean;
import com.capgemini.forestryjpawithhibernate.exceptions.NotFoundException;
import com.capgemini.forestryjpawithhibernate.factory.ForestryFactory;
import com.capgemini.forestryjpawithhibernate.services.UserServices;
import com.capgemini.forestryjpawithhibernate.validations.ForestryValidations;

public class AdminScheduler {
	
	static UserServices userservices=ForestryFactory.instanceOfUserServices();
	public static void adminScheduler() {

		Scanner sc=new Scanner(System.in);
		UsersBean ubean=new UsersBean();

		while(true) {
			System.out.println("press 1 : Add Scheduler");
			System.out.println("press 2 : delete Scheduler ");
			System.out.println("press 3 : Get All Scheduler ");
			System.out.println("Press 0 : Go Back");
			System.out.println("");
			System.out.println("--Please Enter the Choice--");
			String cho=null;
			boolean loopp=true;
			while(loopp) {
				cho=sc.next();
				if(ForestryValidations.isNumber(cho)) {
					loopp=false;
					
				}else {
					System.err.println("Enter only numbers");
				}
			}
			int choice=Integer.parseInt(cho);

			switch(choice) {

			case 1:

				System.out.println("Enter Username ");
				ubean.setUsername(sc.next());

				System.out.println("Enter Password ");
				ubean.setPassword(sc.next());
				
				System.out.println("Enter UserType ");
				ubean.setUserType(sc.next());

				
				try {

				if(userservices.addClient(ubean)) {
					System.out.println("Scheduler Added Successfully!!!");
				}
				} catch (NotFoundException e) {

					System.out.println(e.getMessage());
				}
				break;
			
			case 2:
				System.out.println("Enter username to Delete Client");
				String username=sc.next();
				ubean.setUsername(username);

				try {
				if(userservices.deleteClient(username)) {
					System.out.println("Scheduler is Deleted Successfully!!!!");
				}
				}catch (NotFoundException e) {

					System.err.println(e.getMessage());
				}
				break;
			
			case 3:
				
				System.out.println("All Schedulers-----------------------");
				List<UsersBean> getAllC= userservices.getAllClients();
				for(UsersBean scheB:getAllC) {
					if(scheB.getUserType().equalsIgnoreCase("scheduler")) {
						System.out.println(scheB);
					}
				}


				break;
			case 0 :
				AdminMain.adminMain();
				break;
			default :
				System.err.println("Invalid Input Entered! Please Enter Valid Input!!");
				break;
			}
		}
	}


}
