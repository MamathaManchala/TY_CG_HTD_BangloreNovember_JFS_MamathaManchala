package com.capgemini.jdbc.controller;

import java.util.Scanner;

import com.capgemini.jdbc.bean.UserBean;
import com.capgemini.jdbc.factory.UserFactory;
import com.capgemini.jdbc.services.UserServices;

public class UserLogin {
	public static void main(String[] args) {
		UserServices services=UserFactory.instanceOfUserServices();
		
		//UserBean user=new UserBean();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter username");
		//user.setUsername(sc.nextLine());	
		String username=sc.nextLine();
		
		System.out.println("enter password");
		//user.setPassword(sc.nextLine());
		String password=sc.nextLine();
		
		
		//UserBean user=services.userLogin(user.getUsername(), user.getPassword());
		UserBean userB=services.userLogin(username, password);
		if(userB!=null) {
		
//			System.out.println("userid"+user.getUserid());
//			System.out.println("username"+user.getUsername());
//			System.out.println("email"+user.getEmail());
//			
			System.out.println("user details fetched-------------");
			System.out.println(userB);
			
		}else {
			System.err.println("something went wrong");
		}
		sc.close();
	
	}

}
