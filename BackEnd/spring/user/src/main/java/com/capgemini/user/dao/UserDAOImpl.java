package com.capgemini.user.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Repository;

import com.capgemini.user.dto.User;
@Repository
public class UserDAOImpl implements UserDAO{
	@PersistenceUnit
	EntityManagerFactory factory;
	
	@Override
	public boolean register(User user) {
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
	public User login(String email, String password) {
		EntityManager manager = factory.createEntityManager();
		User user=manager.find(User.class, email);
		return user;
	}

}
