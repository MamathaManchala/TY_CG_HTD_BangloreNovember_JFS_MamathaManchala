package com.capgemini.jpawithhibernate.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestOneToOne {
public static void main(String[] args) {
	
	Employee emp=new Employee();
	emp.setEid(16);
	emp.setEname("mammu");
	emp.setEmail("m@gmail.com");
	emp.setPassword("mammu1");
	
	
	EmployeeOther other=new EmployeeOther();
	
	other.setId(15);
	other.setPancard("234sdf");
	other.setFather("jaya");
	other.setEmp(emp);
	
	 EntityManager entityManager=null;
		EntityTransaction transaction=null;
		try {
	
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test1");
			  entityManager = entityManagerFactory.createEntityManager();
			  transaction = entityManager.getTransaction();
			  transaction.begin();
			  
			  //bidirectional
			  
			  Employee e1=entityManager.find(Employee.class,10);
			  System.out.println(e1.getOther().getFather());
			  
			  //b
			  entityManager.persist(other);
			  System.out.println("Record Saved-----------");
			  transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		  entityManager.close();
		  
	
	
	
}
}
