package com.capgemini.forestryspringboot.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.capgemini.forestryspringboot.dto.ProductBean;
import com.capgemini.forestryspringboot.dto.SchedulerBean;
@Repository
public class SchedulerDaoImpl implements SchedulerDao{
	@PersistenceUnit
	EntityManagerFactory factory;
	
	@Override
	public boolean addSchedule(SchedulerBean bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(bean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public SchedulerBean getSchedule(int scheduleId) {
		EntityManager manager = factory.createEntityManager();
		SchedulerBean bean=manager.find(SchedulerBean.class, scheduleId);
		return bean;
	}

	@Override
	public List<SchedulerBean> getAllSchedules() {
		EntityManager manager = factory.createEntityManager();
		String getall="from SchedulerBean";
		TypedQuery<SchedulerBean> query=manager.createQuery(getall,SchedulerBean.class);
		return query.getResultList();
	}

	@Override
	public boolean deleteSchedule(int scheduleId) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		SchedulerBean bean = manager.find(SchedulerBean.class, scheduleId);
		if(bean!=null) {
			transaction.begin();
			manager.remove(bean);
			transaction.commit();
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean modifySchedule(SchedulerBean sbean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		SchedulerBean bean = manager.find(SchedulerBean.class, sbean.getScheduleId());
		if(bean!=null) {
			transaction.begin();
			bean.setScheduleId(sbean.getScheduleId());
			bean.setContractId(sbean.getScheduleId());
			bean.setProductId(sbean.getProductId());
			bean.setDeliveryDate(sbean.getDeliveryDate());
			bean.setQuantity(sbean.getQuantity());
			transaction.commit();
			return true;
		}
		manager.close();
		return false;
	}


}
