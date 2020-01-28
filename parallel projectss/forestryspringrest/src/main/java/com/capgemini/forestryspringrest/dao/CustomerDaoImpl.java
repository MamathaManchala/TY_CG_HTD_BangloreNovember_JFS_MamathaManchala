package com.capgemini.forestryspringrest.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.capgemini.forestryspringrest.dto.CustomerBean;

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
		// TODO Auto-generated method stub
		return false;
	}


}
