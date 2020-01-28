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

public class ProductDaoImpl implements ProductDao {
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test1");
	EntityManager entityManager=null;
	EntityTransaction transaction=null;
	
	ProductBean pbean=new ProductBean();

	public boolean addProduct(ProductBean bean) {

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

	public boolean modifyProduct(ProductBean bean) {
		try {

			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			ProductBean record=entityManager.find(ProductBean.class, bean.getProductId());
			transaction.begin();
			record.setProductName(bean.getProductName());
			record.setProdDescription(bean.getProdDescription());
			record.setProductCost(bean.getProductCost());
			transaction.commit();
			return true;
			
		}catch(Exception e) {
				throw new NotFoundException("Details Not Found");
			}finally {
				entityManager.close();
			}
			
			
		}
	

	public boolean deleteProduct(int productId) {
		
		try {
			entityManager = entityManagerFactory.createEntityManager();
			transaction=entityManager.getTransaction();
			transaction.begin();
			ProductBean record=entityManager.find(ProductBean.class, productId);
			entityManager.remove(record);
			transaction.commit();
			return true;
		} catch (Exception e) {
			transaction.rollback();
		}

		entityManager.close();
		throw new NotFoundException("Details Not Found");
	}

	public ProductBean getProduct(int productId) {
		 entityManager=entityManagerFactory.createEntityManager();
		  transaction=entityManager.getTransaction();
		  transaction.begin();
		ProductBean record=entityManager.find(ProductBean.class, productId);
				
		entityManager.close();
		if(record!=null) {
			return record;
		}
			
		else {
			throw new NotFoundException("Details not Found");
		}
		
	}

	public List<ProductBean> getAllProducts() {
		entityManager=entityManagerFactory.createEntityManager();
		  transaction=entityManager.getTransaction();
		  transaction.begin();
		  String jpql="from ProductBean";
		  Query query=entityManager.createQuery(jpql);
		  List<ProductBean> record=(List<ProductBean>) query.getResultList();
		  entityManager.close();
		  return record;
	}

}
