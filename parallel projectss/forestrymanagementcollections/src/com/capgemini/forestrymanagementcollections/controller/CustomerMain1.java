package com.capgemini.forestrymanagementcollections.controller;

import java.util.List;
import java.util.Scanner;

import com.capgemini.forestrymanagementcollections.bean.CustomerBean;
import com.capgemini.forestrymanagementcollections.exceptions.NotFoundException;
import com.capgemini.forestrymanagementcollections.factory.ForestryFactory;
import com.capgemini.forestrymanagementcollections.services.CustomerServices;
import com.capgemini.forestrymanagementcollections.validations.ForestryValidations;
public class CustomerMain1 {
	



		static CustomerServices customerservices=ForestryFactory.instanceOfCustomerServices();
		public static void customerMain1()  {

			Scanner sc=new Scanner(System.in);



			while(true) {
				System.out.println("Press 1 : Add customer");
				System.out.println("press 2 : Delete customer");
				System.out.println("press 3 : Get customer Details");
				System.out.println("press 4 : GetAll customers");
				System.out.println("Press 0 : Go Back");
				
				System.out.println("---Please Enter your Choice---");
				String ch11=null;
				boolean loop11=true;
				while(loop11) {
					ch11=sc.next();
					if(ForestryValidations.isNumber(ch11)) {
						loop11=false;

					}else {
						System.err.println("Enter valid Input");
					}
				}

				int choice=Integer.parseInt(ch11);
				switch(choice) {

				case 1:

					CustomerBean bean=new CustomerBean();
					System.out.println("Enter CustomerId");
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
					int id=Integer.parseInt(ch);
					bean.setCustomerId(id);

					System.out.println("Enter Customer Name");
					String name=null;
					boolean loop1 = true;
					while(loop1) {
						name=sc.next();
						if(ForestryValidations.isStringOnlyAlphabet(name)) {
							loop1=false;
						} else {
							System.err.println("Enter only alphabets");
						}
					}
					bean.setCustomerName(name);

					System.out.println("Enter Customer StreetAddress1");
					String add1=sc.next();
					bean.setStreetAddress1(add1);
					System.out.println("Enter Customer StreetAddress2");
					String add2=sc.next();
					bean.setStreetAddress2(add2);
					System.out.println("Enter Customer Town");
					String town=null;
					boolean loop2 = true;
					while(loop2) {
						town=sc.next();
						if(ForestryValidations.isStringOnlyAlphabet(town)) {
							loop2=false;
						} else {
							System.err.println("Enter only alphabets");
						}
					}
					bean.setTown(town);

					System.out.println("Enter Customer PostalCode");
					String ch2=null;
					boolean loop3=true;
					while(loop3) {
						ch2=sc.next();
						if(ForestryValidations.isNumber(ch2)) {
							loop3=false;

						}else {
							System.err.println("Enter only numbers");
						}
					}
					int pcode=Integer.parseInt(ch2);
					bean.setPostalCode(pcode);

					System.out.println("Enter Customer EmailId");
					String email=null;
					boolean loop4=true;
					while(loop4) {
						email=sc.next();
						if(ForestryValidations.isEmail(email)) {
							loop4=false;

						}else {
							System.err.println("Enter Valid Email");
						}
					}
					bean.setEmail(email);

					System.out.print("Enter Customer Telephone Number");
					String tphNo=null;
					boolean loop5=true;
					while(loop5) {
						tphNo=sc.next();
						if(ForestryValidations.validPhone(tphNo)) {
							loop5=false;

						}else {
							System.err.println("Enter only numbers");
						}
					}
					int ph=Integer.parseInt(tphNo);
					bean.setTelephoneNo(ph);
					
					
					try {
						boolean check1=customerservices.addCustomer(bean);
						if(check1) {
							System.out.println("Customer Added Successfully!!!");
						}
					}
					catch(NotFoundException e) {
						System.err.println(e.getMessage());
					}
					break;

				case 2:
					CustomerBean bean1=new CustomerBean();
					System.out.println("Enter Customer Id to Delete Customer");
					String ch6=null;
					boolean loop6=true;
					while(loop6) {
						ch6=sc.next();
						if(ForestryValidations.isNumber(ch6)) {
							loop6=false;

						}else {
							System.err.println("Enter only numbers");
						}
					}
					int custid=Integer.parseInt(ch6);
					bean1.setCustomerId(custid);
					try {
						if(customerservices.deleteCustomer(custid)) {
							System.out.println("Customer Deleted Successfully!!!");
						}
					}
					catch(NotFoundException e) {
						System.err.println(e.getMessage());
					}


					break;

				
				case 3:
					CustomerBean bean3=new CustomerBean();
					System.out.println("Enter CustomerId to Get the Customer Details");
					String ch8=null;
					boolean loop8=true;
					while(loop8) {
						ch8=sc.next();
						if(ForestryValidations.isNumber(ch8)) {
							loop8=false;

						}else {
							System.err.println("Enter only numbers");
						}
					}
					int cid=Integer.parseInt(ch8);
					bean3.setCustomerId(cid);
					try {
						CustomerBean custBean =customerservices.getCustomer(cid);
						if(custBean!=null) {

							System.out.println("CustomerBean [customerId=" + custBean.getCustomerId() + ", customerName=" + custBean.getCustomerName() + ", streetAddress1="
									+ custBean.getStreetAddress1() + ", streetAddress2=" + custBean.getStreetAddress2() + ", town=" + custBean.getTown() + ", postalCode="
									+ custBean.getPostalCode() + ", email=" + custBean.getEmail() + ", telephoneNo=" + custBean.getTelephoneNo() +"]");
						}
					}
					catch(NotFoundException e) {
						System.err.println(e.getMessage());
					}


					break;

				case 4:
					System.out.println("All the customers are----------------------------");
					List<CustomerBean> getAllC= customerservices.getAllCustomer();
					for(CustomerBean customerB:getAllC) {
						System.out.println(customerB);
					}


					break;

				case 0:
					AdminMain.adminMain();

					break;

				default :
					System.err.println("Invalid Input Entered! Please Enter Valid Input!!");
					break;

				}
			}
		}
	
}
