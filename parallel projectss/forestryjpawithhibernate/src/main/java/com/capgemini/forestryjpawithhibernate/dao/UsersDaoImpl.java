package com.capgemini.forestryjpawithhibernate.dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.capgemini.forestryjpawithhibernate.dto.UsersBean;
import com.capgemini.forestryjpawithhibernate.exceptions.NotFoundException;

public class UsersDaoImpl implements UsersDao {
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test1");
	 EntityManager entityManager=null;
		EntityTransaction transaction=null;
		
	UsersBean bean=new UsersBean();

	public UsersBean login(UsersBean bean) {
		entityManager = entityManagerFactory.createEntityManager();
		  EntityManager entityManager = entityManagerFactory.createEntityManager();
			String loginjpql = "from UsersBean where username=:name and password=: pass";
			TypedQuery<UsersBean> query = entityManager.createQuery(loginjpql, UsersBean.class);
			UsersBean users=new UsersBean();
			query.setParameter("name", bean.getUsername());
			query.setParameter("pass", bean.getPassword());
		
			try {
				users = query.getSingleResult();
				if ((bean.getPassword().equalsIgnoreCase(users.getPassword()))) {
					return users;
				}
			} catch (Exception e) {
					
			}
			throw new NotFoundException("Invalid Credentials");
		}


	public boolean addClient(UsersBean bean) {
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
		  throw new NotFoundException("Client Already Exist");	  
}


	public boolean deleteClient(String username) {
		try {
			entityManager = entityManagerFactory.createEntityManager();
		    transaction=entityManager.getTransaction();
			transaction.begin();
			UsersBean record=entityManager.find(UsersBean.class, username);
			entityManager.remove(record);
			transaction.commit();
			return true;
			
		} catch (Exception e) {
			transaction.rollback();
		}
		
		entityManager.close();
		throw new NotFoundException("Details not Found");
	}


	public List<UsersBean> getAllClients() {
		entityManager=entityManagerFactory.createEntityManager();
		  transaction=entityManager.getTransaction();
		  transaction.begin();
		  String jpql="from UsersBean";
		  Query query=entityManager.createQuery(jpql);
		  List<UsersBean> record=(List<UsersBean>) query.getResultList();
		  entityManager.close();
		  return record;
	}



	public boolean addScheduler(UsersBean bean) {
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

	public boolean deleteScheduler(String username) {
		try {
			entityManager = entityManagerFactory.createEntityManager();
		    transaction=entityManager.getTransaction();
			transaction.begin();
			UsersBean record=entityManager.find(UsersBean.class, username);
			entityManager.remove(record);
			transaction.commit();
			return true;
			
		} catch (Exception e) {
			transaction.rollback();
		}
		
		entityManager.close();
		throw new NotFoundException("Details not Found");
	}



	public List<UsersBean> getAllSchedulers() {
		entityManager=entityManagerFactory.createEntityManager();
		  transaction=entityManager.getTransaction();
		  transaction.begin();
		  String jpql="from UsersBean";
		  Query query=entityManager.createQuery(jpql);
		  List<UsersBean> record=(List<UsersBean>) query.getResultList();
		  entityManager.close();
		  return record;
	}

}