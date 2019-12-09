package com.capgemini.forestrymanagement.main;

import java.util.Scanner;

import com.capgemini.forestrymanagement.CustomerApp;
import com.capgemini.forestrymanagement.ProductApp;
import com.capgemini.forestrymanagement.ContractApp;

public class HomeApp {


	public static void homePage() {
		while(true) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Press 1 for Contract Details");
			System.out.println("Press 2 for Customer Details");
			System.out.println("Press 3 for Product Details");

			System.out.println();
			int a=sc.nextInt();

			switch(a) {
			case 1:
				System.out.println("------------------Contract Page----------------");
				ContractApp.contractMain();
				break;

			case 2:
				System.out.println("--------------------Customer Page-------------------");
				CustomerApp.customerMain();
				break;
			case 3:
				System.out.println("----------Product Page-------------------");
				ProductApp.productMain();
				break;	

			default:
				System.out.println("Invalid");
				break;
			}


		}

	}
}
