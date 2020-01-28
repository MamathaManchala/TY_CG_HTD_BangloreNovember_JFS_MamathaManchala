package com.capgemini.forestryjpawithhibernate.controller;

import java.util.List;
import java.util.Scanner;

import com.capgemini.forestryjpawithhibernate.dto.CustomerBean;
import com.capgemini.forestryjpawithhibernate.exceptions.NotFoundException;
import com.capgemini.forestryjpawithhibernate.factory.ForestryFactory;
import com.capgemini.forestryjpawithhibernate.services.CustomerServices;
import com.capgemini.forestryjpawithhibernate.validations.ForestryValidations;

public class CustomerMain {

	static CustomerServices customerservices=ForestryFactory.instanceOfCustomerServices();

	public static void customerMain()  {


		Scanner sc=new Scanner(System.in);
		CustomerBean bean=new CustomerBean();

		while(true) {

			System.out.println("Press 1 : Add customer");
			System.out.println("press 2 : Delete customer");
			System.out.println("Press 3 : modify Customer");
			System.out.println("press 4 : Get customer Details");
			System.out.println("press 5 : Get All customers");
			System.out.println("Press 0 : Go Back");
			System.out.println("--Please Enter the Choice--");
			String cho=null;
			boolean loopp=true;
			while(loopp) {
				cho=sc.next();
				if(ForestryValidations.isNumber(cho)) {
					loopp=false;

				}else {
					System.err.println("Enter only numbers");
				}
			}
			int choice=Integer.parseInt(cho);

			switch(choice) {

			case 1:


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
						System.err.println("Enter correct Email");
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
				long ph=Long.parseLong(tphNo);

				bean.setTelephoneNo(ph);


				try {
					if(customerservices.addCustomer(bean)) {
						System.out.println("Customer Added Successfully!!!");
					} 
				}catch (NotFoundException e) {

					System.err.println(e.getMessage());
				}

				break;

			case 2:

				System.out.println("Enter CustomerId to Delete Customer");
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
				bean.setCustomerId(custid);

				try {
					if(customerservices.deleteCustomer(custid)) {
						System.out.println("Customer Deleted Successfully!!!");
					}
				} catch (NotFoundException e) {

					System.err.println(e.getMessage());
				}


				break;

			case 3:
				System.out.println("Enter Customer Id to modify the Details");
				String ch7=null;
				boolean loop7=true;
				while(loop7) {
					ch7=sc.next();
					if(ForestryValidations.isNumber(ch7)) {
						loop7=false;

					}else {
						System.err.println("Enter only numbers");
					}
				}
				int cuid=Integer.parseInt(ch7);
				bean.setCustomerId(cuid);

				try {
					bean=customerservices.getCustomer(cuid);
					if(bean!=null) {
						System.out.println("Enter Customer Name");
						bean.setCustomerName(sc.next());
						System.out.println("Enter Customer StreeAddress 1");
						bean.setStreetAddress1(sc.next());
						System.out.println("Enter Customer StreetAddress 2");
						bean.setStreetAddress2(sc.next());
						System.out.println("Enter Customer Town");
						bean.setTown(sc.next());
						System.out.println("Enter Customer Postal Code");
						bean.setPostalCode(sc.nextInt());
						System.out.println("Enter Customer Email");
						bean.setEmail(sc.next());
						System.out.println("Enter Telephone No");
						bean.setTelephoneNo(sc.nextLong());
						customerservices.modifyCustomer(bean);
						System.out.println("Details Updated Successfully");
					}
				} catch (NotFoundException e) {

					System.err.println(e.getMessage());
				}


				break;

			case 4:
				System.out.println("Enter Id to Get the Customer Details");
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
				bean.setCustomerId(cid);

				try {


					CustomerBean custBean =customerservices.getCustomer(cid);
					if(custBean!=null) {

						System.out.println("CustomerBean [customerId=" + custBean.getCustomerId() + ", customerName=" + custBean.getCustomerName() + ", streetAddress1="
								+ custBean.getStreetAddress1() + ", streetAddress2=" + custBean.getStreetAddress2() + ", town=" + custBean.getTown() + ", postalCode="
								+ custBean.getPostalCode() + ", email=" + custBean.getEmail() + ", telephoneNo=" + custBean.getTelephoneNo() +"]");
					}
				}catch (NotFoundException e) {

					System.err.println(e.getMessage());
				}


				break;

			case 5:
				System.out.println("All the customers are----------------------------");
				List<CustomerBean> getAllC= customerservices.getAllCustomer();
				for(CustomerBean customerB:getAllC) {
					System.out.println(customerB);
				}


				break;

			case 0:
				ClientMain.clientMain();
				break;

			default :
				System.err.println("Invalid Input Entered! Please Enter Valid Input!!");
				break;

			}
		}
	}
}
