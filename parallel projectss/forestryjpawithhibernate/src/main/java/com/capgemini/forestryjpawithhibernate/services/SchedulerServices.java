package com.capgemini.forestryjpawithhibernate.services;

import java.util.List;

import com.capgemini.forestryjpawithhibernate.dto.SchedulerBean;

public interface SchedulerServices {
	
	public boolean addSchedule(SchedulerBean bean);
	public boolean modifySchedule(SchedulerBean sbean);
	public boolean deleteSchedule(int scheduleId);
	public SchedulerBean getSchedule(int scheduleId);
	public List<SchedulerBean>getAllSchedules();

}
