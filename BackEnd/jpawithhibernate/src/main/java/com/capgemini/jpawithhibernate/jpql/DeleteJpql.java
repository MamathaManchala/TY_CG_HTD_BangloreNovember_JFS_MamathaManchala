package com.capgemini.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DeleteJpql {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test1");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		
		String jpql="delete from Movie where mid=1000";
		Query query=entityManager.createQuery(jpql);
		transaction.begin();
		query.executeUpdate();
		transaction.commit();
		entityManager.close();
	}

}
