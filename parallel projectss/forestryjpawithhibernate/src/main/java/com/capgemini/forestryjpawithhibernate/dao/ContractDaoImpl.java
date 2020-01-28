package com.capgemini.forestryjpawithhibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgemini.forestryjpawithhibernate.dto.ContractBean;
import com.capgemini.forestryjpawithhibernate.dto.CustomerBean;
import com.capgemini.forestryjpawithhibernate.exceptions.NotFoundException;

public class ContractDaoImpl implements ContractDao{

	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test1");
	EntityManager entityManager=null;
	EntityTransaction transaction=null;
	ContractBean cb1=new ContractBean();

	public boolean addContract(ContractBean bean) {



		try {

			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(bean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			transaction.rollback();
		}
		entityManager.close();


		throw new NotFoundException("Already Exist");
	}

	public boolean deleteContract(int contractNo) {
		try {
			entityManager = entityManagerFactory.createEntityManager();
			transaction=entityManager.getTransaction();
			transaction.begin();
			ContractBean record=entityManager.find(ContractBean.class, contractNo);
			entityManager.remove(record);
			transaction.commit();
			return true;
		} catch (Exception e) {
			transaction.rollback();
		}

		entityManager.close();
		throw new NotFoundException("Details not Found");
	}

	public ContractBean getContract(int contractNo) {
		 entityManager=entityManagerFactory.createEntityManager();
		  transaction=entityManager.getTransaction();
		  transaction.begin();
		ContractBean record=entityManager.find(ContractBean.class, contractNo);
				
		entityManager.close();
		if(record!=null) {
			return record;
		}
			
		else {
			throw new NotFoundException("Details not Found");
		}
	}

	public List<ContractBean> getAllContract() {
		entityManager=entityManagerFactory.createEntityManager();
		  transaction=entityManager.getTransaction();
		  transaction.begin();
		  String jpql="from ContractBean";
		  Query query=entityManager.createQuery(jpql);
		  List<ContractBean> record=(List<ContractBean>) query.getResultList();
		  entityManager.close();
		  return record;
	}

}
