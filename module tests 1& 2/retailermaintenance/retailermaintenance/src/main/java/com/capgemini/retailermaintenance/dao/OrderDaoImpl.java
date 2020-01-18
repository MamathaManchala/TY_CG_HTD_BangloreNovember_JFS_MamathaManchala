package com.capgemini.retailermaintenance.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.capgemini.retailermaintenance.dto.OrderBean;

@Repository
public class OrderDaoImpl implements OrderDao {


	@PersistenceUnit
	EntityManagerFactory factory;



	@Override
	public boolean addOrder(OrderBean order) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(order);
			transaction.commit();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public List<OrderBean> getAllOrders() {
		EntityManager manager = factory.createEntityManager();
		String getall="from OrderBean";
		TypedQuery<OrderBean> query=manager.createQuery(getall,OrderBean.class);
		return query.getResultList();
	}

}
