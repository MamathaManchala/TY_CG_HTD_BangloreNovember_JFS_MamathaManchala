package com.capgemini.forestrymanagementcollections.services;

import java.util.List;

import com.capgemini.forestrymanagementcollections.bean.SchedulerBean;
import com.capgemini.forestrymanagementcollections.dao.SchedulerDao;
import com.capgemini.forestrymanagementcollections.factory.ForestryFactory;


public class SchedulerServicesImpl implements SchedulerServices {
	
	SchedulerDao schedulerDao =ForestryFactory.instanceOfSchedulerDaoImpl();

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
