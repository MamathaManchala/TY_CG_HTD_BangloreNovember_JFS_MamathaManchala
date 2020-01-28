package com.capgemini.forestrymanagementcollections.controller;

import java.util.List;
import java.util.Scanner;

import com.capgemini.forestrymanagementcollections.bean.ProductBean;
import com.capgemini.forestrymanagementcollections.dao.ProductDao;
import com.capgemini.forestrymanagementcollections.exceptions.NotFoundException;
import com.capgemini.forestrymanagementcollections.factory.ForestryFactory;
import com.capgemini.forestrymanagementcollections.services.ProductServices;
import com.capgemini.forestrymanagementcollections.validations.ForestryValidations;

public class ProductMain {

	static ProductServices productservices=ForestryFactory.instanceOfProductServices();

	public static void productMain()  {

		Scanner sc=new Scanner(System.in);


		while(true) {
			System.out.println("Press 1 : Add product");
			System.out.println("press 2 : Delete product");
			System.out.println("Press 3 : modify Product");
			System.out.println("press 4 : Get product Details");
			System.out.println("press 5 : GetAll product Details");
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

				ProductBean pbean=new ProductBean();
				System.out.println("Enter ProductId ");
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
				pbean.setProductId(pid);

				System.out.println("Enter Product Name");
				String pname=null;
				boolean loop1 = true;
				while(loop1) {
					pname=sc.next();
					if(ForestryValidations.isStringOnlyAlphabet(pname)) {
						loop1=false;
					} else {
						System.err.println("Enter only alphabets");
					}
				}
				pbean.setProductName(pname);

				System.out.println("Enter Product Description");
				String name1=null;
				boolean loop3 = true;
				while(loop3) {
					name1=sc.next();
					if(ForestryValidations.isStringOnlyAlphabet(name1)) {
						loop3=false;
					} else {
						System.err.println("Enter only alphabets");
					}
				}
				pbean.setProdDescription(name1);

				System.out.println("Enter Product Cost ");
				String ch22=null;
				boolean loop22=true;
				while(loop22) {
					ch22=sc.next();
					if(ForestryValidations.isNumber(ch22)) {
						loop22=false;

					}else {
						System.err.println("Enter only numbers");
					}
				}
				int pcost=Integer.parseInt(ch22);
				pbean.setProductId(pcost);

				try {
					boolean check=productservices.addProduct(pbean);
					if(check) {
						System.out.println("Product Added Successfully!!!");
					}
				}
				catch(NotFoundException e) {
					System.err.println(e.getMessage());
				}

				break;

			case 2:

				ProductBean pbean1=new ProductBean();

				System.out.println("Enter product Id to Delete Product");
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
				int prodId=Integer.parseInt(ch4);
				pbean1.setProductId(prodId);
				try {
					if(productservices.deleteProduct(prodId)) {
						System.out.println("Product is Deleted Successfully!!!");
					}
				}
				catch(NotFoundException e) {
					System.err.println(e.getMessage());
				}

				break;

			case 3:

				ProductBean pbean2=new ProductBean();
				System.out.println("Enter product Id to Modify Product");
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
				int proId=Integer.parseInt(ch5);
				pbean2.setProductId(proId);

				try {
					pbean=productservices.getProduct(proId);
					if(pbean!=null) {
						System.out.println("Enter New product Name");
						pbean.setProductName(sc.next());
						System.out.println("Enter New product Description");
						pbean.setProdDescription(sc.next());
						productservices.modifyProduct(pbean);
						System.out.println("Product Updated!! Check the Product Details!");
					}
				}
				catch(NotFoundException e) {
					System.err.println(e.getMessage());
				}

				break;

			case 4:
				ProductBean pbean3=new ProductBean();
				System.out.println("Enter Product Id to Get the Product Details");
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
				int prodId1=Integer.parseInt(ch6);
				pbean3.setProductId(prodId1);

				try {
					ProductBean pb = productservices.getProduct(prodId1);
					if(pb!=null) {

						System.out.println( "ProductBean [productId=" + pb.getProductId() + ", productName=" + pb.getProductName() +", prodDescription="
								+ pb.getProdDescription() + "]");
					}
				}
				catch(NotFoundException e) {
					System.err.println(e.getMessage());
				}

				break;

			case 5:
				System.out.println("all Products-----------------------");
				List<ProductBean> getAllP= productservices.getAllProducts();
				for(ProductBean ProductB:getAllP) {
					System.out.println(ProductB);
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
