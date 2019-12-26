package com.cg.phonesimulation.controller;

import java.util.Scanner;

import com.cg.phonesimulation.bean.PhoneBean;
import com.cg.phonesimulation.factory.OperationFactory;
import com.cg.phonesimulation.services.OperationServices;
public class OperationApp {

	public static void o1() {
			
			Scanner sc=new Scanner(System.in);
			
			OperationServices services=OperationFactory.instanceOfOperationServices();
			
			
			while(true) {
			System.out.println("Press 1 to add contact");
			System.out.println("Press 2 to delete contact");
			System.out.println("Press 3 to edit Contact");
			System.out.println("Press 4 for Back to Home");
			
			int choice=sc.nextInt();
			switch( choice ) {
			
			case 1:
				
				
				System.out.println("Enter Name");
				String n=sc.next();
				System.out.println("Enter Number ");
				int no=sc.nextInt();
				System.out.println("Enter Group");
				String grp=sc.next();
				
				

				PhoneBean bean=new PhoneBean();
				
				bean.setName(n);
				bean.setNumber(no);
				bean.setGroup(grp);
				

				if(services.addContact(bean)) {
					System.out.println(" New Contact Added ---------------------------");
				}else {
					System.out.println("Contact is not added ---------------------");
				}

				
				break;
			case 2:
				
				System.out.println("Enter name to delete contact");
				String n1=sc.next();

				if(services.deleteContact(n1)) {
					System.out.println("Contact is Deleted-------------------------------------");
				}else {
					System.out.println("Check the Contact No----------------------------");
				}
				
				break;
			case 3:
				
//				System.out.println("Enter name to edit");
//				 String n1=sc.next();
//			    bean=services.editContact(n1));
//				
//				if(pbean!=null) {
//					System.out.println("Enter Product Id");
//					bean.setName(sc.next());
//					System.out.println("Enter product Name");
//					bean.setNumber(sc.nextInt());
//					services.editContact(bean);
//				}
//				else {
//					System.out.println("Product is not updated");
//				}
				
				break;
			case 4:
				
				HomeApp.m1();
				break;
				
			
			}
			}
		}
	}


