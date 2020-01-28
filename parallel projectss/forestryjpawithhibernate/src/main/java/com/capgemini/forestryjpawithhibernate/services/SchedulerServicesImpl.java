package com.capgemini.forestryjpawithhibernate.services;

import java.util.List;

import com.capgemini.forestryjpawithhibernate.dao.SchedulerDao;
import com.capgemini.forestryjpawithhibernate.dto.SchedulerBean;
import com.capgemini.forestryjpawithhibernate.factory.ForestryFactory;

public class SchedulerServicesImpl implements SchedulerServices {
	
	SchedulerDao schedulerDao =ForestryFactory.instanceOfSchedulerDaoImpl();

	public boolean addSchedule(SchedulerBean bean) {
		return schedulerDao.addSchedule(bean);
	}

	public boolean modifySchedule(SchedulerBean sbean) {
		return schedulerDao.modifySchedule(sbean);
	}

	public boolean deleteSchedule(int scheduleId) {
		return schedulerDao.deleteSchedule(scheduleId);
	}

	public SchedulerBean getSchedule(int scheduleId) {
		return schedulerDao.getSchedule(scheduleId);
	}

	public List<SchedulerBean> getAllSchedules() {
		return schedulerDao.getAllSchedules();
	}

}
