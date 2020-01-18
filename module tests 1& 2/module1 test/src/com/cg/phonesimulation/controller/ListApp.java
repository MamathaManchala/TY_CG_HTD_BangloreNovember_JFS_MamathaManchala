package com.cg.phonesimulation.controller;

import java.util.List;
import java.util.Scanner;

import com.cg.phonesimulation.bean.PhoneBean;
import com.cg.phonesimulation.factory.ListFactory;
import com.cg.phonesimulation.factory.PhoneFactory;
import com.cg.phonesimulation.services.ListServices;
import com.cg.phonesimulation.services.PhoneServices;

public class ListApp {

	public static void l1() {

		Scanner sc = new Scanner(System.in);

		ListServices services = ListFactory.instanceOfListServices();

		while (true) {

			System.out.println("Press 1 to get All Contacts");
			System.out.println("Press 2 to go back");

			int choice = sc.nextInt();

			switch (choice) {

			case 1:

				System.out.println("All the contracts are-------------------");

				List<PhoneBean> getAllContact = services.getAllContacts();
				if (getAllContact != null) {
					for (PhoneBean contactB : getAllContact) {
						System.out.println(contactB);

						break;
					}
				}

			case 2:
				HomeApp.m1();

				break;

			}

		}

	}
}
