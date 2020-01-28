package com.capgemini.forestrymanagementcollections.controller;

import java.util.Scanner;

import com.capgemini.forestrymanagementcollections.validations.ForestryValidations;


public class AdminMain {

	public static void adminMain()  {
		Scanner sc=new Scanner(System.in);

		while(true) {

			System.out.println("Press 1 : Customer operations");
			System.out.println("Press 2 : Products operations");
			System.out.println("Press 3 : Land Operations");
			System.out.println("Press 0 : Logout");
			System.out.println("");

			System.out.println("---Please Enter your Choice---");
			String ch=null;
			boolean loop=true;
			while(loop) {
				ch=sc.next();
				if(ForestryValidations.isNumber(ch)) {
					loop=false;

				}else {
					System.err.println("Enter valid Input");
				}
			}

			int choice=Integer.parseInt(ch);
			switch(choice) {


			case 1:

				CustomerMain1.customerMain1();

				break;

			case 2:

				ProductMain.productMain();

				break;

			case 3:
				LandMain.landMain();

				break;

			case 0:
				String[] args = null;
				ForestryManagementApp.main(args);
				break;

			default :

				System.err.println("Invalid Input Entered! Please Enter Valid Input!!");

				break;

			}
		}
	}
}
