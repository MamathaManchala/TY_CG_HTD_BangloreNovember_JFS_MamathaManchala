package com.capgemini.forestryjpawithhibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgemini.forestryjpawithhibernate.dto.LandBean;
import com.capgemini.forestryjpawithhibernate.dto.ProductBean;
import com.capgemini.forestryjpawithhibernate.exceptions.NotFoundException;

public class LandDaoImpl implements LandDao {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test1");
	 EntityManager entityManager=null;
		EntityTransaction transaction=null;
	LandBean land=new LandBean();

	public boolean addLandDetails(LandBean bean) {
		
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

	public boolean modifyLandDetails(LandBean landBean) {
		try {

			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			LandBean record=entityManager.find(LandBean.class, landBean.getLandId());
			transaction.begin();
			
			record.setLandValue(landBean.getLandValue());
			record.setLandLocation(landBean.getLandLocation());
			
			transaction.commit();
			return true;
			
		}catch(Exception e) {
				throw new NotFoundException("Details not Found");
			}finally {
				entityManager.close();
			}
			
			
		}
	

	public boolean deleteLandDetails(int landId) {
		try {
			entityManager = entityManagerFactory.createEntityManager();
		    transaction=entityManager.getTransaction();
			transaction.begin();
			LandBean record=entityManager.find(LandBean.class, landId);
			entityManager.remove(record);
			transaction.commit();
			return true;
		} catch (Exception e) {
			transaction.rollback();
		}
		
		entityManager.close();
		throw new NotFoundException("Details not Found");
	}

	public LandBean getLandDetails(int landId) {
		 entityManager=entityManagerFactory.createEntityManager();
		  transaction=entityManager.getTransaction();
		  transaction.begin();
		LandBean record=entityManager.find(LandBean.class, landId);
				
		entityManager.close();
		if(record!=null) {
			return record;
		}
			
		else {
			throw new NotFoundException("Details not Found");
		}
	}

	public List<LandBean> getAllLandDetails() {
		 entityManager=entityManagerFactory.createEntityManager();
		  transaction=entityManager.getTransaction();
		  transaction.begin();
		  String jpql="from LandBean";
		  Query query=entityManager.createQuery(jpql);
		  List<LandBean> record=(List<LandBean>) query.getResultList();
		  entityManager.close();
		  return record;
		  
			
	}

}
