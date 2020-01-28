package com.capgemini.forestryspringboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.forestryspringboot.dao.ContractDao;
import com.capgemini.forestryspringboot.dao.ProductDao;
import com.capgemini.forestryspringboot.dao.SchedulerDao;
import com.capgemini.forestryspringboot.dto.SchedulerBean;
import com.capgemini.forestryspringboot.exception.NotFoundException;
@Service
public class SchedulerServiceImpl implements SchedulerService {
	
	@Autowired
	private SchedulerDao schedulerDao;
	@Autowired
	private ProductDao daoProduct;
	@Autowired
	private ContractDao contractDao;

	@Override
	public boolean addSchedule(SchedulerBean bean) {
		
		if(contractDao.getContract(bean.getContractId())==null) {
			 
			 throw new NotFoundException("CustomerId does'not exists!!!");
		 }
		 if((daoProduct.getProduct(bean.getProductId())==null)) {
			 throw new NotFoundException("ProductId does'not exists!!!");
		 }
		 
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
