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

import com.capgemini.forestryspringrest.dto.SchedulerBean;
import com.capgemini.forestryspringrest.dto.SchedulerResponse;
import com.capgemini.forestryspringrest.service.SchedulerService;

@RestController
@CrossOrigin(origins="*",allowedHeaders="*",allowCredentials="true")
public class SchedulerController {
	
	@Autowired
	SchedulerService service;
	
	@PostMapping(path="/add-schedule",produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public SchedulerResponse addSchedule(@RequestBody SchedulerBean bean) {
		SchedulerResponse response = new SchedulerResponse();
		if(service.addSchedule(bean)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Schedule added");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Schedule not added!!!");
		}
		return response;
	}
	
	@GetMapping(path="/get-schedule",produces = MediaType.APPLICATION_JSON_VALUE)
	public SchedulerResponse getSchedule(@RequestParam("scheduleId") int scheduleId) {
		SchedulerResponse response = new SchedulerResponse();
		SchedulerBean bean=service.getSchedule(scheduleId);
		if(bean!=null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Schedule found");
			response.setSchedule(Arrays.asList(bean));
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Schedule id does not exist");
		}
		return response;
	}
	
	@GetMapping(path="/get-allschedules",produces = MediaType.APPLICATION_JSON_VALUE)
	public SchedulerResponse getAllSchedules() {
		SchedulerResponse response = new SchedulerResponse();
		List<SchedulerBean> list=service.getAllSchedules();
		if(list.size()!=0) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Schedule found");
			response.setSchedule(list);
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("No data");
		}
		return response;
		
	}
	
	@DeleteMapping(path = "/delete-schedule/{scheduleId}",produces = MediaType.APPLICATION_JSON_VALUE)
	public SchedulerResponse deleteSchedule(@PathVariable("scheduleId") int scheduleId) {
		SchedulerResponse response = new SchedulerResponse();
		if(service.deleteSchedule(scheduleId)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Schedule deleted");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Schedule not found");
		}
		return response;
	}

}
