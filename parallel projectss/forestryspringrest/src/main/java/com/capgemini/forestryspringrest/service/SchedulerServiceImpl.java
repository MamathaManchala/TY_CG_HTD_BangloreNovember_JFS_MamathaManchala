package com.capgemini.forestryspringrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.forestryspringrest.dao.SchedulerDao;
import com.capgemini.forestryspringrest.dto.SchedulerBean;
@Service
public class SchedulerServiceImpl implements SchedulerService {
	
	@Autowired
	private SchedulerDao schedulerDao;

	@Override
	public boolean addSchedule(SchedulerBean bean) {
		return schedulerDao.addSchedule(bean);
	}

	@Override
	public boolean modifySchedule(SchedulerBean sbean) {
		return schedulerDao.modifySchedule(sbean);
	}

	@Override
	public boolean deleteSchedule(int scheduleId) {
		return schedulerDao.deleteSchedule(scheduleId);
	}

	@Override
	public SchedulerBean getSchedule(int scheduleId) {
		return schedulerDao.getSchedule(scheduleId);
	}

	@Override
	public List<SchedulerBean> getAllSchedules() {
		return schedulerDao.getAllSchedules();
	}

}
