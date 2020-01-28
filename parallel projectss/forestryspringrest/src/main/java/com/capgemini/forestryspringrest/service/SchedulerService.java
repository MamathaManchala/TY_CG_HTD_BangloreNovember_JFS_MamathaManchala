package com.capgemini.forestryspringrest.service;

import java.util.List;

import com.capgemini.forestryspringrest.dto.SchedulerBean;

public interface SchedulerService {
	
	public boolean addSchedule(SchedulerBean bean);
	public boolean modifySchedule(SchedulerBean sbean);
	public boolean deleteSchedule(int scheduleId);
	public SchedulerBean getSchedule(int scheduleId);
	public List<SchedulerBean>getAllSchedules();


}
