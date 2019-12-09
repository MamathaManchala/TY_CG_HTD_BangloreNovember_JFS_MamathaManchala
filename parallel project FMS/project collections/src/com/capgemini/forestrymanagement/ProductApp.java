package com.capgemini.forestrymanagement;
import java.util.List;
import java.util.Scanner;

import com.capgemini.forestrymanagement.bean.CustomerBean;
import com.capgemini.forestrymanagement.bean.ProductBean;
import com.capgemini.forestrymanagement.dao.ProductDAO;
import com.capgemini.forestrymanagement.factory.ProductDAOManager;
import com.capgemini.forestrymanagement.main.HomeApp;

public class ProductApp {

	public static void productMain() {
		Scanner sc=new Scanner(System.in);
		ProductDAO dao=ProductDAOManager.getProductDAO();
		while(true) {

			System.out.println("press 1 to Add Product ");
			System.out.println("press 2 to Modify Product ");
			System.out.println("press 3 to Delete Product");
			System.out.println("press 4 to Get Product Data");
			System.out.println("press 5 to Get All Products");
			System.out.println("Press 6 to Go Back to HomePage");

			int choice=sc.nextInt();
			switch(choice) {
			case 1 :

				System.out.println("Enter ProductId ");
				int pid=sc.nextInt();
				System.out.println("Enter Product Name");
				String pname=sc.next();

				ProductBean bean=new ProductBean();
				bean.setProductId(pid);
				bean.setProductName(pname);

				boolean check=dao.addProduct(bean);
				if(check) {
					System.out.println("Product Added to the List---------------------------");
				}else {
					System.out.println("Product is not Added to the List--------------------------");
				}

				break;
				
				
			case 2 :

				System.out.println("Enter Id to Modify Product");
				int proId=sc.nextInt();
				bean=dao.getProduct(proId);
				if(bean!=null) {
					System.out.println("Enter Product Id");
					bean.setProductId(sc.nextInt());
					System.out.println("Enter product Name");
					bean.setProductName(sc.next());
					dao.modifyProduct(bean);
				}
				else {
					System.out.println("Product is not updated");
				}
				

				break;

			case 3 :
				System.out.println("Enter Id to Delete Product");
				int prodId=sc.nextInt();
				dao.deleteProduct(prodId);
				boolean check1=dao.deleteProduct(prodId);
				if(check1) {
					System.out.println("Product is Deleted from the List------------------------------");
				}else {
					System.out.println("Product is Not  Deleted from the List---------------------------");
				}
				break;

			case 4 :
				System.out.println("Enter Id to Get Product");
				int productId=sc.nextInt();
				dao.getProduct(productId);
				ProductBean pb =dao.getProduct(productId);
				if(pb!=null) {
					System.out.println(pb.getProductId());
					System.out.println(pb.getProductName());

				}

				break;

				
			case 5 :

				System.out.println("Enter Id to get all Product");
				List<ProductBean> getAllP= dao.getAllProducts();
				for(ProductBean ProductB:getAllP) {
					System.out.println(ProductB);
				}

				break;

			case 6:
				System.out.println("***Home Page***");
				HomeApp.homePage();
				break;

			}
		}
	}
}





