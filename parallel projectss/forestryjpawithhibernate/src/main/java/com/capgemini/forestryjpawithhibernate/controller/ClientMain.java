package com.capgemini.forestryjpawithhibernate.controller;

import java.util.Scanner;

import com.capgemini.forestryjpawithhibernate.dto.UsersBean;
import com.capgemini.forestryjpawithhibernate.exceptions.NotFoundException;
import com.capgemini.forestryjpawithhibernate.factory.ForestryFactory;
import com.capgemini.forestryjpawithhibernate.services.UserServices;
import com.capgemini.forestryjpawithhibernate.validations.ForestryValidations;


public class ClientMain extends AdminMain {
	
	
	static UserServices userservices = ForestryFactory.instanceOfUserServices();
	public static void user2()  {

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
			
			if((uBean1.getUserType().equalsIgnoreCase("client"))) {
				
				System.out.println("***************Welcome to Client**************");
				ClientMain.clientMain();
			}
		}
		
		catch(NotFoundException e) {
			System.out.println(e.getMessage());
		}

	}
		
	}

	

	public static void clientMain()  {

		Scanner sc=new Scanner(System.in);

		while(true) {
			
			
			System.out.println("Press 1 : Contract Operations");
			System.out.println("press 2 : Customer Operations");
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
				ContractMain.contractMain();
				
				break;
				
			case 2:
				
				CustomerMain.customerMain();
				break;
				

			case 0:
				String[] args = null;
				ForestryApp.main(args);
				break;

			default :
				System.err.println("Invalid Input Entered!Please Enter Valid Input!!");
				break;



			}
		}
	}

}
