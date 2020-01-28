package com.capgemini.forestrymanagementcollections.controller;

import java.util.Scanner;

import com.capgemini.forestrymanagementcollections.validations.ForestryValidations;


public class ClientMain extends AdminMain {

	public static void clientMain()  {

		Scanner sc=new Scanner(System.in);

		while(true) {
			System.out.println("Press 1 : Contract Operations");
			System.out.println("press 2 : customer Operations");
			System.out.println("Press 0 : Logout");
			
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
				ContractMain.contractMain();
				
				break;
				
			case 2:
				
				CustomerMain.customerMain();
				break;

			case 0:
				String[] args = null;
				ForestryManagementApp.main(args);
				break;

			default :
				System.err.println("Invalid Input Entered!Please Enter Valid Input!!");
				break;



			}
		}
	}

}
