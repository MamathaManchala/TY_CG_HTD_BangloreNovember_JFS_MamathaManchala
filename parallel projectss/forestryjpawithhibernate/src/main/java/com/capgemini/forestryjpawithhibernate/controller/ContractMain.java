package com.capgemini.forestryjpawithhibernate.controller;

import java.util.List;
import java.util.Scanner;

import com.capgemini.forestryjpawithhibernate.dto.ContractBean;
import com.capgemini.forestryjpawithhibernate.exceptions.NotFoundException;
import com.capgemini.forestryjpawithhibernate.factory.ForestryFactory;
import com.capgemini.forestryjpawithhibernate.services.ContractServices;
import com.capgemini.forestryjpawithhibernate.validations.ForestryValidations;

public class ContractMain {

	static ContractServices contractservices=ForestryFactory.instanceOfContractServices();
	public static void contractMain()  {

		Scanner sc=new Scanner(System.in);
		ContractBean bean1=new ContractBean();

		while(true) {


			System.out.println("press 1 : Add Contract");
			System.out.println("press 2 : Delete Contract");
			System.out.println("press 3 : Get Contract ");
			System.out.println("press 4 : GetAll Contracts ");
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

				System.out.println("Enter ContractNo");
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
				int cno=Integer.parseInt(ch);
				bean1.setContractNo(cno);

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
				int contid=Integer.parseInt(ch1);
				bean1.setCustomerId(contid);

				System.out.println("Enter  productId");
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
				int hid=Integer.parseInt(ch3);
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
					if(contractservices.addContract(bean1)) {
						System.out.println("Contract Added Successfully!!!");
					}
				}catch (NotFoundException e) {

					System.err.println(e.getMessage());
				}


				break;

			case 2:
				System.out.println("Enter ContractNo to Delete Contract");
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
				int contNo1=Integer.parseInt(ch7);
				bean1.setContractNo(contNo1);
				try {
					if(contractservices.deleteContract(contNo1)) {
						System.out.println("Contract is Deleted Successfully!!");
					} 
				}catch (NotFoundException e) {

					System.err.println(e.getMessage());
				}

				break;

			case 3:

				System.out.println("Enter Contract No to Get Contract");
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
				bean1.setContractNo(cNo);

				try {
					ContractBean cb = contractservices.getContract(cNo);
					if(cb!=null) {

						System.out.println ("ContractBean [contractNo=" + cb.getContractNo() + ", customerId=" + cb.getCustomerId() + ", productId=" + cb.getProductId()
						+ ", haulierId=" + cb.getHaulierId() + ", deliveryDate=" + cb.getDeliveryDate() +  ", quantity=" + cb.getQuantity() + "]" );


					}
				} catch (NotFoundException e) {

					System.err.println(e.getMessage());
				}

				break;

			case 4:
				System.out.println("All contracts-------------------");
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