package com.capgemini.jpawithhibernate.manytomany;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.onetoone.Employee;

public class TestManyToMany {
public static void main(String[] args) {
	
	Employee e1=new Employee();
	e1.setEid(777777);
	e1.setEmail("jyo@gmail.com");
	e1.setEname("jyo");
	e1.setPassword("jyo1");
	
	Employee e2=new Employee();
	e2.setEid(55555);
	e2.setEmail("nani@gmail.com");
	e2.setEname("nani");
	e2.setPassword("nani1");
	
	ArrayList<Employee> a1=new ArrayList<Employee>();
	a1.add(e1);
	a1.add(e2);
	
	
	
	TrainingInfo t1=new TrainingInfo();
	t1.setElist(a1);
	t1.setName("hema");
	t1.setTid(11111111);
	
	
	
	 EntityManager entityManager=null;
		EntityTransaction transaction=null;
		try {
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test1");
			  entityManager = entityManagerFactory.createEntityManager();
			  transaction = entityManager.getTransaction();
			  transaction.begin();
			  entityManager.persist(t1);
			  System.out.println("Record Saved-----------");
			  transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		  entityManager.close();
	
}
}
