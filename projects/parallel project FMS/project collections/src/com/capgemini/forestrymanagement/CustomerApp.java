
package com.capgemini.forestrymanagement;

import java.util.List;
import java.util.Scanner;

import com.capgemini.forestrymanagement.bean.CustomerBean;
import com.capgemini.forestrymanagement.dao.CustomerDAO;
import com.capgemini.forestrymanagement.factory.CustomerDAOManager;
import com.capgemini.forestrymanagement.main.HomeApp;

public class CustomerApp {

	public static void customerMain() {

		Scanner sc=new Scanner(System.in);
		CustomerDAO dao=CustomerDAOManager.getCustomerDAO();
		while(true) {



			System.out.println("press 1 to Add Customer Data");
			System.out.println("press 2 to Modify Customer Data");
			System.out.println("press 3 to Delete Customer Data");
			System.out.println("press 4 to Get Customer Data");
			System.out.println("press 5 to Get All Customer Data");
			System.out.println("Press 6 to Go Back to HomePage");


			int choice=sc.nextInt();
			switch(choice) {
			case 1 :
				System.out.println("Enter CustomerId");
				int id=sc.nextInt();
				System.out.println("Enter Customer Name");
				String name=sc.next();
				System.out.println("Enter Customer StreetAddress1");
				String add1=sc.next();
				System.out.println("Enter Customer StreetAddress2");
				String add2=sc.next();
				System.out.println("Enter Customer Town");
				String town=sc.next();
				System.out.println("Enter Customer PostalCode");
				int pcode=sc.nextInt();
				System.out.println("Enter Customer EmailId");
				String email=sc.next();

				CustomerBean bean=new CustomerBean();
				bean.setCustomerId(id);
				bean.setCustomerName(name);
				bean.setStreetAddress1(add1);
				bean.setStreetAddress2(add2);
				bean.setTown(town);
				bean.setPostalCode(pcode);
				bean.setEmail(email);

				boolean check=dao.addCustomer(bean);
				if(check) {
					System.out.println("Customer Added to the List---------------------------");
				}else {
					System.out.println("Customer is Not Added to the List---------------------------");
				}

				break;

			case 2 :
				
				System.out.println("Enter Customer Id to modify the Details--------------");
				int custId=sc.nextInt();
				bean=dao.getCustomer(custId);
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
					dao.modifyCustomer(bean);
				}
				else {
					System.out.println("Details are Not Updated---------------------");
				}
				
				break;

			case 3 :

				System.out.println("Enter Id to Delete Customer");
				int custid=sc.nextInt();
				dao.deleteCustomer(custid);
				boolean check1=dao.deleteCustomer(custid);
				if(check1) {
					System.out.println("Customer Deleted from the List---------------------------");
				}else {
					System.out.println("Customer is Not deleted---------------------------");
				}

				break;

			case 4 :
				System.out.println("Enter Id to Get Customer");
				int cid=sc.nextInt();
				dao.getCustomer(cid);
				CustomerBean customerBean =dao.getCustomer(cid);
				if(customerBean!=null) {
					System.out.println(customerBean.getCustomerId());
					System.out.println(customerBean.getCustomerName());
					System.out.println(customerBean.getStreetAddress1());
					System.out.println(customerBean.getStreetAddress2());
					System.out.println(customerBean.getTown());
					System.out.println(customerBean.getPostalCode());
					System.out.println(customerBean.getEmail());
				}

				break;
			case 5:
				
				System.out.println("All the customers are-------------------");
				List<CustomerBean> getAllC= dao.getAllCustomer();
				for(CustomerBean customerB:getAllC) {
					System.out.println(customerB);
				}
				
				break;

			case 6:
				System.out.println(" ***HomePage***");
				HomeApp.homePage();
				break;
			}
		}
	}
}
