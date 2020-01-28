package com.capgemini.forestryspringboot.service;

import java.util.List;

import com.capgemini.forestryspringboot.dto.SchedulerBean;

public interface SchedulerService {
	
	public boolean addSchedule(SchedulerBean bean);
	public boolean modifySchedule(SchedulerBean sbean);
	public boolean deleteSchedule(int scheduleId);
	public SchedulerBean getSchedule(int scheduleId);
	public List<SchedulerBean>getAllSchedules();


}
