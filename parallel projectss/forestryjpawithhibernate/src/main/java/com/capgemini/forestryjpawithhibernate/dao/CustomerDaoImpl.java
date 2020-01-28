package com.capgemini.forestryjpawithhibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgemini.forestryjpawithhibernate.dto.CustomerBean;
import com.capgemini.forestryjpawithhibernate.dto.ProductBean;
import com.capgemini.forestryjpawithhibernate.dto.SchedulerBean;
import com.capgemini.forestryjpawithhibernate.exceptions.NotFoundException;

public class CustomerDaoImpl implements CustomerDao {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test1");
	EntityManager entityManager=null;
	EntityTransaction transaction=null;
	
	CustomerBean cb1=new CustomerBean();

	public boolean addCustomer(CustomerBean bean) {
		 
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

	public boolean modifyCustomer(CustomerBean bean) {
		
		try {

			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			CustomerBean record=entityManager.find(CustomerBean.class, bean.getCustomerId());
			transaction.begin();
			
			record.setCustomerName(bean.getCustomerName());
			record.setStreetAddress1(bean.getStreetAddress1());
			record.setStreetAddress2(bean.getStreetAddress2());
			record.setTown(bean.getTown());
			record.setPostalCode(bean.getPostalCode());
			record.setEmail(bean.getEmail());
			record.setTelephoneNo(bean.getTelephoneNo());
			
			transaction.commit();
			return true;
			
		}catch(Exception e) {
				throw new NotFoundException("Details not Found");
			}finally {
				entityManager.close();
			}
			
			
		}
	
	

	public boolean deleteCustomer(int customerId) {
		try {
			entityManager = entityManagerFactory.createEntityManager();
		    transaction=entityManager.getTransaction();
			transaction.begin();
			CustomerBean record=entityManager.find(CustomerBean.class, customerId);
			entityManager.remove(record);
			transaction.commit();
			return true;
			
		} catch (Exception e) {
			transaction.rollback();
		}
		
		entityManager.close();
		throw new NotFoundException("Details not Found");
	}

	public CustomerBean getCustomer(int customerId) {
		 entityManager=entityManagerFactory.createEntityManager();
		  transaction=entityManager.getTransaction();
		  transaction.begin();
		CustomerBean record=entityManager.find(CustomerBean.class, customerId);
				
		entityManager.close();
		if(record!=null) {
			return record;
		}
			
		else {
			throw new NotFoundException("Details not Found");
		}
	}

	public List<CustomerBean> getAllCustomer() {
		entityManager=entityManagerFactory.createEntityManager();
		  transaction=entityManager.getTransaction();
		  transaction.begin();
		  String jpql="from CustomerBean";
		  Query query=entityManager.createQuery(jpql);
		  List<CustomerBean> record=(List<CustomerBean>) query.getResultList();
		  entityManager.close();
		  return record;
	}

}
