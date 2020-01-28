package com.capgemini.forestryspringboot.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.capgemini.forestryspringboot.dto.CustomerBean;
import com.capgemini.forestryspringboot.dto.ProductBean;

@Repository
public class CustomerDaoImpl implements CustomerDao {
	
	@PersistenceUnit
	EntityManagerFactory factory;
	
	@Override
	public boolean addCustomer(CustomerBean bean) {
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
	public CustomerBean getCustomer(int customerId) {
		EntityManager manager = factory.createEntityManager();
		CustomerBean bean=manager.find(CustomerBean.class, customerId);
		return bean;
	}

	@Override
	public List<CustomerBean> getAllCustomer() {
		EntityManager manager = factory.createEntityManager();
		String getall="from CustomerBean";
		TypedQuery<CustomerBean> query=manager.createQuery(getall,CustomerBean.class);
		return query.getResultList();
	}

	@Override
	public boolean deleteCustomer(int customerId) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		CustomerBean bean = manager.find(CustomerBean.class, customerId);
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
	public boolean modifyCustomer(CustomerBean bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		CustomerBean cbean = manager.find(CustomerBean.class, bean.getCustomerId());
		if(cbean!=null) {
			transaction.begin();
			cbean.setCustomerId(bean.getCustomerId());
			cbean.setCustomerName(bean.getCustomerName());
			cbean.setStreetAddress1(bean.getStreetAddress1());
			cbean.setStreetAddress2(bean.getStreetAddress2());
			cbean.setTown(bean.getTown());
			cbean.setPostalCode(bean.getPostalCode());
			cbean.setEmail(bean.getEmail());
			cbean.setTelephoneNo(bean.getTelephoneNo());
			transaction.commit();
			return true;
		}
		manager.close();
		return false;
	}

	
}



