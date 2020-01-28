package com.capgemini.forestryjpawithhibernate.controller;

import java.util.List;
import java.util.Scanner;

import com.capgemini.forestryjpawithhibernate.dto.SchedulerBean;
import com.capgemini.forestryjpawithhibernate.dto.UsersBean;
import com.capgemini.forestryjpawithhibernate.exceptions.NotFoundException;
import com.capgemini.forestryjpawithhibernate.factory.ForestryFactory;
import com.capgemini.forestryjpawithhibernate.services.SchedulerServices;
import com.capgemini.forestryjpawithhibernate.services.UserServices;
import com.capgemini.forestryjpawithhibernate.validations.ForestryValidations;


public class SchedulerMain {
	
	
	static UserServices userservices = ForestryFactory.instanceOfUserServices();
	public static void user3()  {

		Scanner sc=new Scanner(System.in);
		UsersBean uBean=new UsersBean();
		while(true) {
			System.out.println("Enter Username ");
			uBean.setUsername(sc.next());

			System.out.println("Enter Password ");
			uBean.setPassword(sc.next());
			uBean.setUserType(null);
			try {
			UsersBean uBean1 = userservices.login(uBean);
				
				if((uBean1.getUserType().equalsIgnoreCase("scheduler"))) {
					
					System.out.println("***************Welcome to scheduler**************");
					SchedulerMain.schedulerMain();
				}
			}
			
			catch(NotFoundException e) {
				System.out.println(e.getMessage());
			}

		}
			
		}
	
	
	

	static SchedulerServices schedulerservices=ForestryFactory.instanceOfSchedulerServices();
	public static void schedulerMain() {

		Scanner sc=new Scanner(System.in);
		SchedulerBean sbean=new SchedulerBean();

		while(true) {
			
			System.out.println("press 1 : Add schedule");
			System.out.println("press 2 : Modify schedule");
			System.out.println("press 3 : delete schedule ");
			System.out.println("press 4 : Get schedule ");
			System.out.println("press 5 : Get All schedule ");
			System.out.println("Press 0 : Logout ");
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

				System.out.println("Enter Scheduler Id");
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
				int sid=Integer.parseInt(ch);
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
				int quant=Integer.parseInt(ch2);
				sbean.setQuantity(quant);
				
				System.out.println("Enter Deleivery Date");
				String dd=sc.next();
				sbean.setDeliveryDate(dd);
				
				try {

				if(schedulerservices.addSchedule(sbean)) {
					System.out.println("Scheduler Added Successfully!!!");
				}
				} catch (NotFoundException e) {

					System.err.println(e.getMessage());
				}
				break;
			case 2:
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
				sbean.setScheduleId(sid1);
				
				try {
				if(schedulerservices.getSchedule(sid1)!=null) {
					System.out.println("Enter New ContractId");
					sbean.setContractId(sc.nextInt());
					System.out.println("Enter New productId");
					sbean.setProductId(sc.nextInt());
					System.out.println("Enter New Quantity");
					sbean.setQuantity(sc.nextInt());
					System.out.println("Enter New Delivery Date");
					sbean.setDeliveryDate(sc.next());

					schedulerservices.modifySchedule(sbean);
					System.out.println("Schedule Updated Successfully!!!");
				
			}
		} catch (NotFoundException e) {

			System.err.println(e.getMessage());
		}
				break;
			case 3:
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
				sbean.setScheduleId(sid2);
				try {
				if(schedulerservices.deleteSchedule(sid2)) {
					System.out.println("Schedule is Deleted Successfully!!!");
				}
				}catch (NotFoundException e) {

					System.err.println(e.getMessage());
				}
				break;
			case 4:
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
				sbean.setScheduleId(sid3);
				
				
				try {
				SchedulerBean sb = schedulerservices.getSchedule(sid3);
				if(sb!=null) {

					System.out.println( "SchedulerBean [scheduleId=" + sb.getScheduleId() + ", ContractId =" + sb.getContractId() +", ProductId="
							+ sb.getProductId() + ",Quantity = "+ sb.getQuantity() + ", Delivery Date = " + sb.getDeliveryDate() + "]");

				}
			} catch (NotFoundException e) {

				System.err.println(e.getMessage());
			}

				break;
			case 5:
				
				System.out.println("All Schedules-----------------------");
				List<SchedulerBean> getAllS= schedulerservices.getAllSchedules();
				for(SchedulerBean scheB:getAllS) {
					System.out.println(scheB);
				}


				break;
			case 0 :
				String[] args = null;
				ForestryApp.main(args);
				break;
			default :
				System.err.println("Invalid Input Entered! Please Enter Valid Input!!");
				break;
			}
		}
	}

}
