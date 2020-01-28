package com.capgemini.forestrymanagementcollections.controller;

import java.util.List;
import java.util.Scanner;

import com.capgemini.forestrymanagementcollections.bean.ContractBean;
import com.capgemini.forestrymanagementcollections.dao.ContractDao;
import com.capgemini.forestrymanagementcollections.exceptions.NotFoundException;
import com.capgemini.forestrymanagementcollections.factory.ForestryFactory;
import com.capgemini.forestrymanagementcollections.services.ContractServices;
import com.capgemini.forestrymanagementcollections.validations.ForestryValidations;

public class ContractMain {

	static ContractServices contractservices=ForestryFactory.instanceOfContractServices();

	public static void contractMain()  {

		Scanner sc=new Scanner(System.in);


		while(true) {

			System.out.println("press 1 : Add Contract");
			System.out.println("press 2 : Delete Contract");
			System.out.println("press 3 : Search Contract ");
			System.out.println("press 4 : GetAll Contracts ");
			System.out.println("Press 0 : Go Back ");
			
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
				ContractBean bean1=new ContractBean();

				System.out.println("Enter ContractNo");
				String ch9=null;
				boolean loop9=true;
				while(loop9) {
					ch9=sc.next();
					if(ForestryValidations.isNumber(ch9)) {
						loop9=false;

					}else {
						System.err.println("Enter only numbers");
					}
				}
				int no=Integer.parseInt(ch9);
				bean1.setContractNo(no);

				System.out.println("Enter CustomerId ");
				String ch1=null;
				boolean loop1=true;
				while(loop1) {
					ch1=sc.next();
					if(ForestryValidations.isNumber(ch1)) {
						loop1=false;

					}else {
						System.err.println("Enter only numbers");
					}
				}
				int contid=Integer.parseInt(ch);
				bean1.setCustomerId(contid);
				System.out.println("Enter productId");
				String ch2=null;
				boolean loop2=true;
				while(loop2) {
					ch2=sc.next();
					if(ForestryValidations.isNumber(ch2)) {
						loop2=false;

					}else {
						System.err.println("Enter only numbers");
					}
				}
				int pid=Integer.parseInt(ch2);
				bean1.setProductId(pid);
				System.out.println("Enter HaulierId");
				String ch3=null;
				boolean loop3=true;
				while(loop3) {
					ch3=sc.next();
					if(ForestryValidations.isNumber(ch3)) {
						loop3=false;

					}else {
						System.err.println("Enter only numbers");
					}
				}
				int hid=Integer.parseInt(ch2);
				bean1.setHaulierId(hid);
				
				System.out.println("Enter Contract Delivery Date");
				String dDate=sc.next();
				bean1.setDeliveryDate(dDate);
				
				System.out.println("Enter Contract Quantity");
				String ch4=null;
				boolean loop4=true;
				while(loop4) {
					ch4=sc.next();
					if(ForestryValidations.isNumber(ch4)) {
						loop4=false;

					}else {
						System.err.println("Enter only numbers");
					}
				}
				int quant=Integer.parseInt(ch4);
				bean1.setQuantity(quant);				
				try {
					boolean check=contractservices.addContract(bean1);
					if(check) {
						System.out.println("Contract Added Successfully!!!");
					}
				}
				catch(NotFoundException e) {
					System.err.println(e.getMessage());
				}


				break;

			case 2:

				ContractBean bean2=new ContractBean();
				System.out.println("Enter ContractNo to Delete Contract Details");
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
				int contNo=Integer.parseInt(ch7);
				bean2.setContractNo(contNo);
				try {
					if(contractservices.deleteContract(contNo)) {
						System.out.println("Contract is Deleted Successfully!!!");
					}
				}
				catch(NotFoundException e) {
					System.err.println(e.getMessage());
				}
				break;

			case 3:

				ContractBean bean3=new ContractBean();

				System.out.println("Enter ContractNo to Get Contract Details");
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
				int cNo=Integer.parseInt(ch8);
				bean3.setContractNo(cNo);

				try {
					ContractBean cb = contractservices.getContract(cNo);
					if(cb!=null) {

						System.out.println ("ContractBean [contractNo=" + cb.getContractNo() + ", customerId=" + cb.getCustomerId() + ", productId=" + cb.getProductId()
						+ ", haulierId=" + cb.getHaulierId() + ", deliveryDate=" + cb.getDeliveryDate() 
						+ ", quantity=" + cb.getQuantity() +"]" );
					}
				}
				catch(NotFoundException e) {
					System.err.println(e.getMessage());
				}


				break;

			case 4:
				List<ContractBean> getAllContract= contractservices.getAllContract();
				for(ContractBean contractB:getAllContract) {
					System.out.println(contractB);
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