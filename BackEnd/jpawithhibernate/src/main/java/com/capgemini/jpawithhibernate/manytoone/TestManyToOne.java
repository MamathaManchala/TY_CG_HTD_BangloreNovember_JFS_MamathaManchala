package com.capgemini.jpawithhibernate.manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.onetoone.Employee;

public class TestManyToOne {
public static void main(String[] args) {
	
	Employee emp1=new Employee();
	emp1.setEid(189);
	emp1.setEmail("kavi@gmail.com");
	emp1.setEname("kavi");
	emp1.setPassword("kavi1");
	
	EmployeeExp exp=new EmployeeExp();
	exp.setCName("del");
	exp.setExpId(12123453);
	exp.setExpYears(4);
	exp.setEmp(emp1);
	
	EmployeeExp exp1=new EmployeeExp();
	exp1.setCName("del");
	exp1.setExpId(125234);
	exp1.setExpYears(4);
	exp1.setEmp(emp1);
	
	
	 EntityManager entityManager=null;
		EntityTransaction transaction=null;
		try {
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test1");
			  entityManager = entityManagerFactory.createEntityManager();
			  transaction = entityManager.getTransaction();
			Employee e1=  entityManager.find(Employee.class, 10);
			EmployeeExp exp2=new EmployeeExp();
			exp2.setExpId(112341);
			exp2.setCName("hp");
			exp2.setExpYears(5);
			exp2.setEmp(emp1);
			
			  transaction.begin();
			  entityManager.persist(exp);
			  entityManager.persist(exp1);//insert
			  System.out.println("Record Saved-----------");
			  transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		  entityManager.close();
		  
}
}
