package com.capgemini.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DeleteDynamicQ {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test1");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		String jpql="delete from Movie where mid=:id";
		Query query=entityManager.createQuery(jpql);
	query.setParameter("id", 1002);
		int result =query.executeUpdate();
		System.out.println(result);
		transaction.commit();
		entityManager.close();
	}
}
