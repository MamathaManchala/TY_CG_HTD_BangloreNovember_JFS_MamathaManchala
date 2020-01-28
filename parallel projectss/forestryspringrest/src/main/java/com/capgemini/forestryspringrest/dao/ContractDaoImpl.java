package com.capgemini.forestryspringrest.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.capgemini.forestryspringrest.dto.ContractBean;

@Repository
public class ContractDaoImpl implements ContractDao {
	
	@PersistenceUnit
	EntityManagerFactory factory;
	
	@Override
	public boolean addContract(ContractBean bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(bean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public ContractBean getContract(int contractNo) {
		EntityManager manager = factory.createEntityManager();
		ContractBean bean=manager.find(ContractBean.class, contractNo);
		return bean;
	}

	@Override
	public List<ContractBean> getAllContract() {
		EntityManager manager = factory.createEntityManager();
		String getall="from ContractBean";
		TypedQuery<ContractBean> query=manager.createQuery(getall,ContractBean.class);
		return query.getResultList();
	}

	@Override
	public boolean deleteContract(int contractNo) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		ContractBean bean = manager.find(ContractBean.class, contractNo);
		if(bean!=null) {
			transaction.begin();
			manager.remove(bean);
			transaction.commit();
			return true;
		} else {
			return false;
		}
	}

	

}
