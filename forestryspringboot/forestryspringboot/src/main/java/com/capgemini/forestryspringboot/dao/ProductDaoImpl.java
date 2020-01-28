package com.capgemini.forestryspringboot.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.capgemini.forestryspringboot.dto.ProductBean;


@Repository
public class ProductDaoImpl implements ProductDao{
	@PersistenceUnit
	EntityManagerFactory factory;
	
	@Override
	public boolean addProduct(ProductBean bean) {
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
	public ProductBean getProduct(int productId) {
		EntityManager manager = factory.createEntityManager();
		ProductBean bean=manager.find(ProductBean.class, productId);
		return bean;
	}

	@Override
	public List<ProductBean> getAllProducts() {
		EntityManager manager = factory.createEntityManager();
		String getall="from ProductBean";
		TypedQuery<ProductBean> query=manager.createQuery(getall,ProductBean.class);
		return query.getResultList();
	}

	@Override
	public boolean deleteProduct(int productId) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		ProductBean bean = manager.find(ProductBean.class, productId);
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
	public boolean modifyProduct(ProductBean bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		ProductBean beans = manager.find(ProductBean.class, bean.getProductId());
		if(beans!=null) {
			transaction.begin();
			beans.setProductId(bean.getProductId());
			beans.setProductName(bean.getProductName());
			beans.setProductCost(bean.getProductCost());
			beans.setProdDescription(bean.getProdDescription());
			transaction.commit();
			return true;
		}
		manager.close();
		return false;
	}

	
}


