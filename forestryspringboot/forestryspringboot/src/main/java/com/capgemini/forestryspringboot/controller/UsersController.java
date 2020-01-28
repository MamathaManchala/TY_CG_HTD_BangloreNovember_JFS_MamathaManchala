package com.capgemini.forestryspringboot.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.forestryspringboot.dto.UserResponse;
import com.capgemini.forestryspringboot.dto.UsersBean;
import com.capgemini.forestryspringboot.service.UserService;

@RestController
@CrossOrigin(origins="*",allowedHeaders="*",allowCredentials="true")
public class UsersController {

	
		@Autowired
		UserService service;
		private UserResponse response;
		
		@PostMapping(path="/add-user",produces = MediaType.APPLICATION_JSON_VALUE,
				consumes = MediaType.APPLICATION_JSON_VALUE)
		public UserResponse register(@RequestBody UsersBean user) {
			UserResponse response=new UserResponse();
			if(service.register(user)) {
				response.setStatusCode(200);
				response.setMessage("Success");
				response.setDescription("Registered Successful...");
			} else {
				response.setStatusCode(401);
				response.setMessage("Failure");
				response.setDescription("User already Exists!!!");
			}
			return response;
		}
		@GetMapping(path="/user-login",produces = MediaType.APPLICATION_JSON_VALUE)
		public UserResponse login(@RequestParam("username") String username, @RequestParam("password") String password) {
			UserResponse response=new UserResponse();
			UsersBean user=service.login(username,password);

				if(user.getUsername().equalsIgnoreCase(username)&&user.getPassword().equalsIgnoreCase(password)) {
				response.setStatusCode(201);
				response.setMessage("Success");
				response.setDescription("Login Successful...");
				response.setUser(Arrays.asList(user));
			} else {
				response.setStatusCode(401);
				response.setMessage("Failure");
				response.setDescription("Incorrect credentials!!!");
			}
			return response;
		}
	}

