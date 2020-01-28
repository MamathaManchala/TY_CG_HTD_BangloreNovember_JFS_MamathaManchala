package com.capgemini.forestrymanagementcollections.controller;

import java.util.List;
import java.util.Scanner;

import com.capgemini.forestrymanagementcollections.bean.LandBean;
import com.capgemini.forestrymanagementcollections.dao.LandDao;
import com.capgemini.forestrymanagementcollections.exceptions.NotFoundException;
import com.capgemini.forestrymanagementcollections.factory.ForestryFactory;
import com.capgemini.forestrymanagementcollections.services.LandServices;
import com.capgemini.forestrymanagementcollections.validations.ForestryValidations;

public class LandMain {

	static LandServices landservices=ForestryFactory.instanceOfLandServices();

	public static void landMain()  {

		Scanner sc=new Scanner(System.in);


		while(true) {
			System.out.println("Press 1 : Add Land Details");
			System.out.println("press 2 : Delete Land Details");
			System.out.println("Press 3 : modify Land Details");
			System.out.println("press 4 : Get Land Details");
			System.out.println("press 5 : GetAll Land Details");
			System.out.println("Press 0 : Go Back");
			
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
				LandBean bean1=new LandBean();
				System.out.println("Enter LandId ");
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
				int landid=Integer.parseInt(ch2);
				bean1.setLandId(landid);

				System.out.println("Enter Land Value");
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
				long value=Integer.parseInt(ch1);
				bean1.setLandValue(value);

				System.out.println("Enter Land Location");
				String loc=null;
				boolean loop3 = true;
				while(loop3) {
					loc=sc.next();
					if(ForestryValidations.isStringOnlyAlphabet(loc)) {
						loop3=false;
					} else {
						System.err.println("Enter only alphabets");
					}
				}
				bean1.setLandLocation(loc);

				try {
					boolean check=landservices.addLandDetails(bean1);
					if(check) {
						System.out.println("Land Details Added Successfully!!!");
					}
				}
				catch(NotFoundException e) {
					System.err.println(e.getMessage());
				}

				break;

			case 2:
				LandBean bean2 = new LandBean();
				System.out.println("Enter Land Id to Delete Land Details");
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
				int landid1=Integer.parseInt(ch4);
				bean2.setLandId(landid1);
				try {
					if(landservices.deleteLandDetails(landid1)) {
						System.out.println("Land Details are Deleted Successfully!!");
					}
				}
				catch(NotFoundException e) {
					System.err.println(e.getMessage());
				}

				break;

			case 3:

				LandBean bean3 = new LandBean();
				System.out.println("Enter Land Id to Modify Land Details");
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
				int landid3=Integer.parseInt(ch5);
				bean3.setLandId(landid3);

				try {
					bean1=landservices.getLandDetails(landid3);
					if(bean1!=null) {
						System.out.println("Enter New Land value");
						bean1.setLandValue(sc.nextLong());
						System.out.println("Enter New Land Location");
						bean1.setLandLocation(sc.next());
						landservices.modifyLandDetails(bean1);
						System.out.println("Land Details Updated Successfully!! Check the Land Details");
					}
				}
				catch(NotFoundException e) {
					System.err.println(e.getMessage());
				}

				break;

			case 4:
				LandBean bean4 = new LandBean();
				System.out.println("Enter Land Id to Get Land Details");
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
				int landid5=Integer.parseInt(ch6);
				bean4.setLandId(landid5);

				try {
					LandBean land = landservices.getLandDetails(landid5);
					if(land!=null) {



						System.out.println( "LandBean [LandId=" + land.getLandId() + ", LandValue=" + land.getLandValue() +", LandLocation="
								+ land.getLandLocation() + "]");

					}
				}
				catch(NotFoundException e) {
					System.err.println(e.getMessage());
				}


				break;

			case 5:
				System.out.println(" all Land Details-----------------------");
				List<LandBean> getAllL=landservices.getAllLandDetails();
				for(LandBean landB:getAllL) {
					System.out.println(landB);
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



