package com.cg.phonesimulation.controller;


import java.util.List;
import java.util.Scanner;

import com.cg.phonesimulation.bean.PhoneBean;
import com.cg.phonesimulation.factory.OperationFactory;
import com.cg.phonesimulation.factory.PhoneFactory;
import com.cg.phonesimulation.services.OperationServices;
import com.cg.phonesimulation.services.PhoneServices;

public class SearchApp {


	public static void s1() {

		Scanner sc=new Scanner(System.in);

		PhoneServices services=PhoneFactory.instanceOfPhoneServices();

		while(true) {
			System.out.println("Press 1 to get Contact");
			System.out.println("Press 2 to Call");
			System.out.println("Press 3 to message");
			System.out.println("Press 4 to go back to main menu");
			System.out.println("Press 5 for back to Home");

			int choice=sc.nextInt();
			switch( choice ) {

			case 1:

				System.out.println("Enter name to Search");
								String n=sc.next();
								PhoneBean bean =services.searchContact(n);
								if(bean!=null) {
									System.out.println(bean.getName());
									System.out.println(bean.getNumber());
									System.out.println(bean.getGroup());
									
									
									System.out.println(bean);
								}
								else {
									System.out.println(" Details Not Found");
								}

				break;
			case 2:

				System.out.println("Enter name to call");



				break;
			case 3:

				System.out.println("Enter name to Message");



				break;
			case 4:

				System.out.println("Back to Main");
				SearchApp.s1();

				break;
			case 5:
				HomeApp.m1();
				break;


			}
		}

	}
}


