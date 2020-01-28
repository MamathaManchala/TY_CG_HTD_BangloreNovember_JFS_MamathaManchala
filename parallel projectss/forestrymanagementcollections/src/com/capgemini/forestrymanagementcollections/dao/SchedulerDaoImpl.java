package com.capgemini.forestrymanagementcollections.dao;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

import com.capgemini.forestrymanagementcollections.bean.SchedulerBean;
import com.capgemini.forestrymanagementcollections.exceptions.NotFoundException;

public class SchedulerDaoImpl implements SchedulerDao{

	private List<SchedulerBean> schedule=new ArrayList<SchedulerBean>();



	@Override
	public boolean addSchedule(SchedulerBean bean) {
		for (SchedulerBean cb1: schedule) 
		{
			if( cb1.getScheduleId() == bean.getScheduleId()) {
				throw new NotFoundException("Schedule Id Already Exist");
			}
		}
		schedule.add(bean);
		return true;
	}

	@Override
	public boolean modifySchedule(SchedulerBean sbean) {
		SchedulerBean bean1=getSchedule(sbean.getScheduleId());
		if(bean1!=null) {
			deleteSchedule(sbean.getScheduleId());
			bean1.setContractId(sbean.getContractId());
			bean1.setProductId(sbean.getProductId());
			bean1.setQuantity(sbean.getQuantity());
			bean1.setDeliveryDate(sbean.getDeliveryDate());
			schedule.add(bean1);

			return true;
		}
	
		throw new NotFoundException("Schedule Details Not Found");		
	}

	@Override
	public boolean deleteSchedule(int scheduleId) {
		SchedulerBean bean=null;
		for ( SchedulerBean sb1: schedule) {
			if(sb1.getScheduleId()==scheduleId) {
				bean=sb1;
			}
		}
		if(bean!=null) {
			schedule.remove(bean);
			return true;
		}
		throw new NotFoundException("Schedule Details Not Found");
	}

	@Override
	public SchedulerBean getSchedule(int scheduleId) {
		for (SchedulerBean sb: schedule) {
			if(sb.getScheduleId()==scheduleId) {

				return sb;
			}
		}
		throw new NotFoundException("Schedule Details Not Found");
	}

	@Override
	public List<SchedulerBean> getAllSchedules() {
		return schedule;
	}


}
