


package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.dto.Movie;

public class InsertDemo {
	public static void main(String[] args) {
	  Movie mv=new Movie();
	  mv.setMid(1008);
	  mv.setmName("Kushi");
	  mv.setRating("GOOD");
	  
    EntityManager entityManager=null;
	EntityTransaction transaction=null;
	try {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test1");
		  entityManager = entityManagerFactory.createEntityManager();
		  transaction = entityManager.getTransaction();
		  transaction.begin();
		  entityManager.persist(mv);//insert
		  System.out.println("Record Saved-----------");
		  transaction.commit();
	} catch (Exception e) {
		e.printStackTrace();
		transaction.rollback();
	}
	  entityManager.close();
	  
	  
	}

}
