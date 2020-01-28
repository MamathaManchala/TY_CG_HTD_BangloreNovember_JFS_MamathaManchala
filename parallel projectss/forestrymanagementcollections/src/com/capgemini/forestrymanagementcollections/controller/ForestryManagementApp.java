package com.capgemini.forestrymanagementcollections.controller;

import java.util.Scanner;

import com.capgemini.forestrymanagementcollections.validations.ForestryValidations;

public class ForestryManagementApp {

	public static void main(String[] args) {
		System.out.println("");
		System.out.println("--------------Welcome to HomePage of Forestry Management System-----------------");
		while(true) {
			Scanner sc=new Scanner(System.in);
			System.out.println("");
			System.out.println("Press 1 : Admin");
			System.out.println("Press 2 : Client");
			System.out.println("Press 3 : Scheduler");
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
				System.out.println("Enter Username");
				String user1=sc.next();
				System.out.println("Enter Password");
				String password1=sc.next();
				if(user1.equals("admin") && password1.equals("admin"))
				{
					System.out.println("*******Welcome to Admin******");
					System.out.println("");
					AdminMain.adminMain();
				}
				else
				{
					System.err.println("Authentication Failed! Please Enter valid Credentials");
				}


				break;

			case 2:
				System.out.println("Enter Username");
				String user2=sc.next();
				System.out.println("Enter Password");
				String password2=sc.next();
				if(user2.equals("client") && password2.equals("client"))
				{
					System.out.println("*****Welcome to Client*****");
					System.out.println("");
					ClientMain.clientMain();
				}
				else
				{
					System.err.println("Authentication Failed! Please Enter valid Credentials");
				}

				break;
			case 3:
				System.out.println("Enter Username");
				String user3=sc.next();
				System.out.println("Enter Password");
				String password3=sc.next();
				if(user3.equals("scheduler") && password3.equals("scheduler"))
				{
					System.out.println("*******Welcome to Scheduler******");
					System.out.println("");
					SchedulerMain.schedulerMain();
				}
				
				else
				{
					System.err.println("Authentication Failed! Please Enter valid Credentials");
				}

				break;	

				default:
					System.err.println("Invalid Input Entered!");
					break;
			}


		}

		
}
}
