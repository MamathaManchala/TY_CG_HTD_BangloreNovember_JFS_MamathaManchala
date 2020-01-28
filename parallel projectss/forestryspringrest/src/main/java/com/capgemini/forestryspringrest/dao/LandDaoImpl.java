package com.capgemini.forestryspringrest.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.capgemini.forestryspringrest.dto.LandBean;

@Repository
public class LandDaoImpl implements LandDao {
	
	@PersistenceUnit
	EntityManagerFactory factory;
	
	@Override
	public boolean addLandDetails(LandBean bean) {
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
	public LandBean getLandDetails(int landId) {
		EntityManager manager = factory.createEntityManager();
		LandBean bean=manager.find(LandBean.class, landId);
		return bean;
	}

	@Override
	public List<LandBean> getAllLandDetails() {
		EntityManager manager = factory.createEntityManager();
		String getall="from LandBean";
		TypedQuery<LandBean> query=manager.createQuery(getall,LandBean.class);
		return query.getResultList();
	}

	@Override
	public boolean deleteLandDetails(int landId) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		LandBean bean = manager.find(LandBean.class, landId);
		if(bean!=null) {
			transaction.begin();
			manager.remove(bean);
			transaction.commit();
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean modifyLandDetails(LandBean landBean) {
		// TODO Auto-generated method stub
		return false;
	}

}
