package com.capgemini.forestryspringboot.controller;

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

import com.capgemini.forestryspringboot.dto.ContractBean;
import com.capgemini.forestryspringboot.dto.ContractResponse;
import com.capgemini.forestryspringboot.service.ContractService;

@RestController
@CrossOrigin(origins="*",allowedHeaders="*",allowCredentials="true")
public class ContractController {
	@Autowired
	ContractService service;
	
	@PostMapping(path="/add-Contract",produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public ContractResponse addContract(@RequestBody ContractBean bean) {
		ContractResponse response = new ContractResponse();
		if(service.addContract(bean)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Contract added");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Contract not added!!!");
		}
		return response;
	}
	
	@GetMapping(path="/get-Contract",produces = MediaType.APPLICATION_JSON_VALUE)
	public ContractResponse getContract(@RequestParam("contractNo") int contractNo) {
		ContractResponse response = new ContractResponse();
		ContractBean bean=service.getContract(contractNo);
		if(bean!=null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Product found");
			response.setContract(Arrays.asList(bean));
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Product id does not exist");
		}
		return response;
	}
	
	@GetMapping(path="/get-allContract",produces = MediaType.APPLICATION_JSON_VALUE)
	public ContractResponse getAllContract() {
		ContractResponse response = new ContractResponse();
		List<ContractBean> list=service.getAllContract();
		if(list.size()!=0) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Contract found");
			response.setContract(list);
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("No data");
		}
		return response;
		
	}
	
	@DeleteMapping(path = "/delete-Contract/{contractNo}",produces = MediaType.APPLICATION_JSON_VALUE)
	public ContractResponse deleteContract(@PathVariable("contractNo") int contractNo) {
		ContractResponse response = new ContractResponse();
		if(service.deleteContract(contractNo)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Contract deleted");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Contract not found");
		}
		return response;
	}

}
