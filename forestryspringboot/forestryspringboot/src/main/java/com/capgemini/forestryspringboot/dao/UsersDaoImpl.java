package com.capgemini.forestryspringboot.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Repository;

import com.capgemini.forestryspringboot.dto.UsersBean;

@Repository
public class UsersDaoImpl implements UsersDao {
	
		@PersistenceUnit
		EntityManagerFactory factory;
		
		@Override
		public boolean register(UsersBean user) {
			EntityManager manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			try {
				transaction.begin();
				manager.persist(user);
				transaction.commit();
				return true;
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}
		}


		@Override
		public UsersBean login(String username, String password) {
			EntityManager manager = factory.createEntityManager();
			UsersBean user=manager.find(UsersBean.class, username);
			return user;
		}

	}
