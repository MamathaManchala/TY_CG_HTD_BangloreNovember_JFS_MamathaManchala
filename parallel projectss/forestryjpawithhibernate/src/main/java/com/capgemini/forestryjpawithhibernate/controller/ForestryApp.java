
package com.capgemini.forestryjpawithhibernate.controller;

import java.util.Scanner;

import com.capgemini.forestryjpawithhibernate.validations.ForestryValidations;

public class ForestryApp {

	public static void main(String args[]) {

		while(true) {
			Scanner sc=new Scanner(System.in);

			System.out.println("");
			System.out.println("--------Welcome to Forestry Management System----------");
			System.out.println("");
			System.out.println("Press 1 : Admin");
			System.out.println("Press 2 : Client");
			System.out.println("Press 3 : Scheduler");


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
				AdminMain.user1();
				break;
			case 2:
				ClientMain.user2();

				break;
			case 3:
				SchedulerMain.user3();
				break;

			default:
				System.err.println("Please Enter Valid Input!!");
				break;

			}


		}


	}
}
