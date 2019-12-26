
package com.cg.phonesimulation.controller;

import java.util.Scanner;

public class HomeApp {

	public static void m1() {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Press 1 to Show all Contacts");
			System.out.println("Press 2 to Search for Contact");
			System.out.println("Press 3 to Operate on Contact");
			System.out.println("Press 4 to go back to Home");

			int choice = sc.nextInt();

			switch (choice) {
			case 1:

				ListApp.l1();

				break;
			case 2:

				SearchApp.s1();

				break;
			case 3:

				OperationApp.o1();

				break;
			case 4:
				HomeApp.m1();
				break;

			}
		}

	}
}
