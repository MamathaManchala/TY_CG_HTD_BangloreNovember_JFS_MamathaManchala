package com.capgemini.forestryspringboot.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.capgemini.forestryspringboot.dto.CustomerBean;
import com.capgemini.forestryspringboot.dto.LandBean;
import com.capgemini.forestryspringboot.dto.ProductBean;

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
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		LandBean lands=manager.find(LandBean.class, landBean.getLandId());
		if(lands!=null) {
			transaction.begin();
			lands.setLandId(landBean.getLandId());
			lands.setLandValue(landBean.getLandValue());
			lands.setLandLocation(landBean.getLandLocation());
			transaction.commit();
			return true;
		}
		manager.close();
		return false;
	}
	
	

}
