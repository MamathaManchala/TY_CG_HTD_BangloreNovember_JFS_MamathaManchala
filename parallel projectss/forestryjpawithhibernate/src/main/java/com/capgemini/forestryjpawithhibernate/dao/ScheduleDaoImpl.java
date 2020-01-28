package com.capgemini.forestryjpawithhibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgemini.forestryjpawithhibernate.dto.ProductBean;
import com.capgemini.forestryjpawithhibernate.dto.SchedulerBean;
import com.capgemini.forestryjpawithhibernate.exceptions.NotFoundException;

public class ScheduleDaoImpl implements SchedulerDao {
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test1");
	 EntityManager entityManager=null;
		EntityTransaction transaction=null;
		
	SchedulerBean sbean=new SchedulerBean();

	public boolean addSchedule(SchedulerBean bean) {
		
			try {
			
				  entityManager = entityManagerFactory.createEntityManager();
				  transaction = entityManager.getTransaction();
				  transaction.begin();
				  entityManager.persist(bean);
				  transaction.commit();
				  return true;
				  
			} catch (Exception e) {
				transaction.rollback();
			}
			  entityManager.close();
			  throw new NotFoundException("Already Exist");
			  
	}

	public boolean modifySchedule(SchedulerBean sbean) {
		try {

			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			SchedulerBean record=entityManager.find(SchedulerBean.class, sbean.getScheduleId());
			transaction.begin();
			record.setContractId(sbean.getContractId());
			record.setProductId(sbean.getProductId());
			record.setDeliveryDate(sbean.getDeliveryDate());
			record.setQuantity(sbean.getQuantity());

			transaction.commit();
			return true;
			
		}catch(Exception e) {
				e.printStackTrace();
				throw new NotFoundException("Details not Found");
				
			}finally {
				entityManager.close();
			}
			
			
	}

	public boolean deleteSchedule(int scheduleId) {
		
		try {
			entityManager = entityManagerFactory.createEntityManager();
		    transaction=entityManager.getTransaction();
			transaction.begin();
			SchedulerBean record=entityManager.find(SchedulerBean.class, scheduleId);
			entityManager.remove(record);
			transaction.commit();
			return true;
			
		} catch (Exception e) {
			transaction.rollback();
		}
		
		entityManager.close();
		throw new NotFoundException("Details not Found");
	}

	public SchedulerBean getSchedule(int scheduleId) {
		 entityManager=entityManagerFactory.createEntityManager();
		  transaction=entityManager.getTransaction();
		  transaction.begin();
		SchedulerBean record=entityManager.find(SchedulerBean.class, scheduleId);
				
		entityManager.close();
		
		if(record!=null) {
			return record;
		}
			
		else {
			throw new NotFoundException("Details not Found");
		}
	}
	

	public List<SchedulerBean> getAllSchedules() {
		entityManager=entityManagerFactory.createEntityManager();
		  transaction=entityManager.getTransaction();
		  transaction.begin();
		  String jpql="from SchedulerBean";
		  Query query=entityManager.createQuery(jpql);
		  List<SchedulerBean> record=(List<SchedulerBean>) query.getResultList();
		  entityManager.close();
		  return record;
	}

}
