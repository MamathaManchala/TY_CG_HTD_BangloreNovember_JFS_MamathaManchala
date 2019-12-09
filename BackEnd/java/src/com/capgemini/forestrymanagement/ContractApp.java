package com.capgemini.forestrymanagement;


import java.util.List;
import java.util.Scanner;

import com.capgemini.forestrymanagement.bean.ContractBean;
import com.capgemini.forestrymanagement.dao.ContractDAO;
import com.capgemini.forestrymanagement.factory.ContractDAOManager;
import com.capgemini.forestrymanagement.main.HomeApp;



public class ContractApp {

	public static void contractMain() {
		Scanner sc=new Scanner(System.in);
		ContractDAO dao=ContractDAOManager.getContractDAO();//
		while(true) {

			System.out.println("press 1 to Add Contract Data");
			System.out.println("press 2 to Delete Contract Data");
			System.out.println("press 3 to Get Contract Data");
			System.out.println("press 4 to GetAll Contract Data");
			System.out.println("Press 5 to Go Back to HomePage");

			int choice=sc.nextInt();
			switch(choice) {
			case 1 :
				System.out.println("Enter ContractNo");
				int no=sc.nextInt();
				System.out.println("Enter ContractId ");
				int id=sc.nextInt();
				System.out.println("Enter Contract productId");
				int pid=sc.nextInt();
				System.out.println("Enter Contract HaulierId");
				int hid=sc.nextInt();
				System.out.println("Enter Contract Delivery Date");
				String dDate=sc.next();
				System.out.println("Enter Contract Delivery Day");
				String dDay=sc.next();
				System.out.println("Enter Contract Quantity");
				int quan=sc.nextInt();

				ContractBean bean=new ContractBean();
				bean.setContractNo(no);
				bean.setContractId(id);
				bean.setProductId(pid);
				bean.setHaulierId(hid);
				bean.setDeliveryDate(dDate);
				bean.setDeliveryDay(dDay);
				bean.setQuantity(quan);

				boolean check=dao.addContract(bean);
				if(check) {
					System.out.println("Contract Added to the List---------------------------");
				}else {
					System.out.println("Contract is not added to the List---------------------");
				}

				break;

			case 2 :
				System.out.println("Enter Contract No to Delete Contract");
				int contNo=sc.nextInt();
				dao.deleteContract(contNo);
				boolean check1=dao.deleteContract(contNo);
				if(check1) {
				System.out.println("Contract is Deleted-------------------------------------");
				}else {
					System.out.println("not deleted");
				}
				break;

			case 3 :
				System.out.println("Enter Contract No to Get Contract");
				int cNo=sc.nextInt();
				dao.getContract(cNo);
				ContractBean cb =dao.getContract(cNo);
				if(cb!=null) {
					System.out.println(cb.getContractNo());
					System.out.println(cb.getContractId());
					System.out.println(cb.getProductId());
					System.out.println(cb.getHaulierId());
					System.out.println(cb.getDeliveryDate());
					System.out.println(cb.getDeliveryDay());
					System.out.println(cb.getQuantity());
				}
				else {
					System.out.println("Contract Details Not Found");
				}

				break;

			case 4 :
				System.out.println("All the contracts are-------------------");
				List<ContractBean> getAllContract= dao.getAllContract();
				for(ContractBean contractB:getAllContract) {
					System.out.println(contractB);
				}

				break;

			case 5:
				System.out.println("***Home Page***");
				HomeApp.homePage();
				break;

			}
		}
	}
}
