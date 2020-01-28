package com.capgemini.forestryspringrest.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.forestryspringrest.dto.LandBean;
import com.capgemini.forestryspringrest.dto.LandResponse;
import com.capgemini.forestryspringrest.service.LandService;

@RestController
@CrossOrigin(origins="*",allowedHeaders="*",allowCredentials="true")
public class LandController {
	@Autowired
	LandService service;
	
	@PostMapping(path="/add-land",produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public LandResponse addLandDetails(@RequestBody LandBean bean) {
		LandResponse response = new LandResponse();
		if(service.addLandDetails(bean)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Land added");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Land not added!!!");
		}
		return response;
	}
	
	@GetMapping(path="/get-land",produces = MediaType.APPLICATION_JSON_VALUE)
	public LandResponse getLandDetails(@RequestParam("landId") int landId) {
		LandResponse response = new LandResponse();
		LandBean bean=service.getLandDetails(landId);
		if(bean!=null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Land found");
			response.setLand(Arrays.asList(bean));
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Land id does not exist");
		}
		return response;
	}
	
	@GetMapping(path="/get-lands",produces = MediaType.APPLICATION_JSON_VALUE)
	public LandResponse getAllLandDetails() {
		LandResponse response = new LandResponse();
		List<LandBean> list=service.getAllLandDetails();
		if(list.size()!=0) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Land found");
			response.setLand(list);
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("No data");
		}
		return response;
		
	}
	
	@DeleteMapping(path = "/delete-land/{landId}",produces = MediaType.APPLICATION_JSON_VALUE)
	public LandResponse deleteLandDetails(@PathVariable("landId") int landId) {
		LandResponse response = new LandResponse();
		if(service.deleteLandDetails(landId)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Land deleted");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Land not found");
		}
		return response;
	}

}
