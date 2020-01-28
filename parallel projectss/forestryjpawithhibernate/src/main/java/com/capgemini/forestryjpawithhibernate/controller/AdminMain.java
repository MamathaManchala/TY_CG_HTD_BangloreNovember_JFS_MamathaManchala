package com.capgemini.forestryjpawithhibernate.controller;

import java.util.Scanner;

import com.capgemini.forestryjpawithhibernate.dto.UsersBean;
import com.capgemini.forestryjpawithhibernate.exceptions.NotFoundException;
import com.capgemini.forestryjpawithhibernate.factory.ForestryFactory;
import com.capgemini.forestryjpawithhibernate.services.UserServices;
import com.capgemini.forestryjpawithhibernate.validations.ForestryValidations;

public class AdminMain {
	static UserServices userservices = ForestryFactory.instanceOfUserServices();
	public static void user1()  {

		Scanner sc=new Scanner(System.in);
		UsersBean uBean=new UsersBean();
		while(true) {
		System.out.println("Enter Username ");
		uBean.setUsername(sc.next());

		System.out.println("Enter Password ");
		uBean.setPassword(sc.next());
		
		uBean.setUserType(null);
		try {
		UsersBean uBean1 = userservices.login(uBean);
			
			if((uBean1.getUserType().equalsIgnoreCase("admin"))) {
				
				System.out.println("***************Welcome to Admin**************");
				AdminMain.adminMain();
			}
		}
		
		catch(NotFoundException e) {
			System.out.println(e.getMessage());
		}

	}
		
	}
	
	
	
	
	
	public static void adminMain()  {


		Scanner sc=new Scanner(System.in);

		while(true) {


			System.out.println("Press 1 : Client Operations");
			System.out.println("Press 2 : Scheduler Operations");
			System.out.println("Press 3 : Products operations");
			System.out.println("Press 4 : View All Customers");
			System.out.println("Press 5 : View All Contracts");
			System.out.println("Press 6 : Land Operations");
			System.out.println("Press 0 : Logout");
			System.out.println("");
			System.out.println("--Please Enter the Choice--");
			String ch=null;
			boolean loop=true;
			while(loop) {
				ch=sc.next();
				if(ForestryValidations.isNumber(ch)) {
					loop=false;

				}else {
					System.err.println("Enter only numbers");
				}
			}
			int choice=Integer.parseInt(ch);

			switch(choice) {

			case 1:

				AdminClient.adminClient();

				break;

			case 2:

				AdminScheduler.adminScheduler();

				break;

			case 3:
				ProductMain.productMain();
				break;
				
			case 4:
				CustomerMain1.custMain1();

				break;
				
			case 5:
				ContractMain1.contMain1();

				break;

			case 6:
				LandMain.landMain();

				break;

			case 0:
				String[] args = null;
				ForestryApp.main(args);
				break;

			default :

				System.err.println("Invalid Input Entered! Please Enter Valid Input!!");

				break;

			}
		}
	}
}
