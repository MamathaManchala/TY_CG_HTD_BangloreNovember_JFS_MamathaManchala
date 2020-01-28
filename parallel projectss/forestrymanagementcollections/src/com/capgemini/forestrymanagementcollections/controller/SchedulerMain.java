package com.capgemini.forestrymanagementcollections.controller;

import java.util.List;
import java.util.Scanner;

import com.capgemini.forestrymanagementcollections.bean.SchedulerBean;
import com.capgemini.forestrymanagementcollections.exceptions.NotFoundException;
import com.capgemini.forestrymanagementcollections.factory.ForestryFactory;
import com.capgemini.forestrymanagementcollections.services.SchedulerServices;
import com.capgemini.forestrymanagementcollections.validations.ForestryValidations;


public class SchedulerMain {

	static SchedulerServices schedulerservices=ForestryFactory.instanceOfSchedulerServices();

	public static void schedulerMain() {

		Scanner sc=new Scanner(System.in);


		while(true) {

			System.out.println("press 1 : Add schedule");
			System.out.println("press 2 : Modify schedule");
			System.out.println("press 3 : delete schedule ");
			System.out.println("press 4 : Search schedule ");
			System.out.println("press 5 : Get All schedule ");
			System.out.println("Press 0 : Logout");
			
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

				SchedulerBean sbean=new SchedulerBean();
				System.out.println("Enter SchedulerId ");
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
				int sid=Integer.parseInt(ch9);
				sbean.setScheduleId(sid);

				System.out.println("Enter ContractId");
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
				int cid=Integer.parseInt(ch1);
				sbean.setContractId(cid);

				System.out.println("Enter ProductId");
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
				sbean.setProductId(pid);

				System.out.println("Enter Quantity");
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
				int quant=Integer.parseInt(ch3);
				sbean.setQuantity(quant);

				System.out.println("Enter Deleivery Date");
				String dd=sc.next();
				sbean.setDeliveryDate(dd);

				try {

					if(schedulerservices.addSchedule(sbean)) {
						System.out.println("Schedule Added Successfully!!!!");
					}
				}
				catch(NotFoundException e) {
					System.err.println(e.getMessage());
				}
				break;

			case 2:

				SchedulerBean sbean1=new SchedulerBean();
				System.out.println("Enter Id to Modify Schedule");
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
				int sid1=Integer.parseInt(ch4);
				sbean1.setScheduleId(sid1);
				try {
					sbean1=schedulerservices.getSchedule(sid1);
					if(sbean1!=null) {
						System.out.println("Enter New ContractId");
						sbean1.setContractId(sc.nextInt());
						System.out.println("Enter New productId");
						sbean1.setProductId(sc.nextInt());
						System.out.println("Enter New Quantity");
						sbean1.setQuantity(sc.nextInt());
						System.out.println("Enter New Delivery Date");
						sbean1.setDeliveryDate(sc.next());

						schedulerservices.modifySchedule(sbean1);
						System.out.println("Schedule Updated Successfully!!!");
					}
				}
				catch(NotFoundException e) {
					System.err.println(e.getMessage());
				}
				break;
			case 3:
				SchedulerBean sbean2=new SchedulerBean();
				System.out.println("Enter Id to Delete Schedule");
				String ch5=null;
				boolean loop5=true;
				while(loop5) {
					ch5=sc.next();
					if(ForestryValidations.isNumber(ch5)) {
						loop5=false;

					}else {
						System.err.println("Enter only numbers");
					}
				}
				int sid2=Integer.parseInt(ch5);
				sbean2.setScheduleId(sid2);
				try {
					if(schedulerservices.deleteSchedule(sid2)) {
						System.out.println("Schedule is Deleted Successfully!!!");
					}
				}
				catch(NotFoundException e) {
					System.err.println(e.getMessage());
				}

				break;
			case 4:

				SchedulerBean sbean3=new SchedulerBean();
				System.out.println("Enter Id to Get the Schedule Details");
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
				int sid3=Integer.parseInt(ch6);
				sbean3.setScheduleId(sid3);

				try {
					SchedulerBean sb = schedulerservices.getSchedule(sid3);
					if(sb!=null) {

						System.out.println( "SchedulerBean [scheduleId=" + sb.getScheduleId() + ", ContractId =" + sb.getContractId() +", ProductId="
								+ sb.getProductId() + ",Quantity = "+ sb.getQuantity() + ", Delivery Date = " + sb.getDeliveryDate() + "]");

					}
				}
				catch(NotFoundException e) {
					System.err.println(e.getMessage());
				}

				break;
			case 5:

				List<SchedulerBean> getAllS= schedulerservices.getAllSchedules();
				for(SchedulerBean scheB:getAllS) {
					System.out.println(scheB);
					
				}


				break;
			case 0 :
				String[] args = null;
				ForestryManagementApp.main(args);
				break;
			default :
				System.err.println("Invalid Input Entered! Please Enter Valid Input!!");
				break;
			}
		}
	}
}




