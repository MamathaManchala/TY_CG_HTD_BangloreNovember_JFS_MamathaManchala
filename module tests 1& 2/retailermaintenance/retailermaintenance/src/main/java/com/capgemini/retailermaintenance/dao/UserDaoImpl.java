package com.capgemini.retailermaintenance.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Repository;

import com.capgemini.retailermaintenance.dto.UserBean;

@Repository
public class UserDaoImpl implements UserDao {
	
	
		@PersistenceUnit
		EntityManagerFactory factory;
		
		@Override
		public boolean createProfile(UserBean user) {
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
		public UserBean login(String email, String password) {
			EntityManager manager = factory.createEntityManager();
			UserBean user=manager.find(UserBean.class, email);
			return user;
		}



//		@Override
//		public UserBean changePassword(UserBean bean) {
//			return null;
//		}
		


}
