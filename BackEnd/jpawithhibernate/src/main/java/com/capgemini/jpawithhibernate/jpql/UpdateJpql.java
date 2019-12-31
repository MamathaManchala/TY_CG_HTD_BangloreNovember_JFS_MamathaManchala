package com.capgemini.jpawithhibernate.jpql;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UpdateJpql {
public static void main(String[] args) {
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test1");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction transaction=entityManager.getTransaction();
	
	String jpql="update Movie set mName='Happy' where mid=101";
	Query query=entityManager.createQuery(jpql);
	transaction.begin();
	query.executeUpdate();
	transaction.commit();
	entityManager.close();
}
}
