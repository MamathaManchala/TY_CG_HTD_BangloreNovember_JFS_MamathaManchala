package com.capgemini.retailermaintenance.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.retailermaintenance.dto.UserBean;
import com.capgemini.retailermaintenance.dto.UserResponse;
import com.capgemini.retailermaintenance.service.UserServices;

@RestController
public class UserController {
	
	
	@Autowired
	private UserServices service;
	
	@PostMapping(path="/login", 
			produces = MediaType.APPLICATION_JSON_VALUE ,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse login(@RequestBody UserBean user) {
		UserBean userBean= service.login(user.getEmail(),user.getPassword());
		UserResponse responce=new UserResponse();
		if(userBean!=null) {
			responce.setStatusCode(201);
			responce.setMessage("success");
			responce.setDiscription("User Found");
			responce.setUbean(Arrays.asList(userBean));
		}else {
			responce.setStatusCode(401);
			responce.setMessage("Failure");
			responce.setDiscription("Credentials Invalid");
		}
		return responce;
	}
	
	
	@PostMapping(path="/register",
			produces = MediaType.APPLICATION_JSON_VALUE ,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse createProfile(@RequestBody UserBean bean) {
		UserResponse responce=new UserResponse();
		if(service.createProfile(bean)) {
			responce.setStatusCode(201);
			responce.setMessage("success");
			responce.setDiscription("/user Registered");
			
		}else {
			responce.setStatusCode(401);
			responce.setMessage("Failure");
			responce.setDiscription("Email already Exist");
		}
		return responce;
	}
	
	
	
	
	
	
//	@PutMapping(path="/changepassword", produces = MediaType.APPLICATION_JSON_VALUE ,
//			consumes = MediaType.APPLICATION_JSON_VALUE)
//	public UserResponse changePassword(@RequestBody UserBean bean) {
//		UserResponse responce=new UserResponse();
//		if(service.changePassword(bean.getId(), bean.getPassword())) {
//			
//			responce.setStatusCode(201);
//			responce.setMessage("success");
//			responce.setDiscription("password changed");
//		}else {
//			responce.setStatusCode(401);
//			responce.setMessage("Failure");
//			responce.setDiscription("password not changed");
//			
//		}
//		return responce;
//	}

}
