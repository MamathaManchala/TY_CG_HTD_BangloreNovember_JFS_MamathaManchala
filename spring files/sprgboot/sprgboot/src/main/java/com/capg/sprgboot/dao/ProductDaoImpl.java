package com.capg.sprgboot.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.capg.sprgboot.dto.Product;

@Repository
public class ProductDaoImpl implements ProductDao{
	@PersistenceUnit
	EntityManagerFactory factory;
	
	@Override
	public boolean addProduct(Product product) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(product);
			transaction.commit();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Product getProduct(int id) {
		EntityManager manager = factory.createEntityManager();
		Product product=manager.find(Product.class, id);
		return product;
	}

	@Override
	public List<Product> getAllProducts() {
		EntityManager manager = factory.createEntityManager();
		String getall="from Product";
		TypedQuery<Product> query=manager.createQuery(getall,Product.class);
		return query.getResultList();
	}

	@Override
	public boolean deleteProduct(int id) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		Product product = manager.find(Product.class, id);
		if(product!=null) {
			transaction.begin();
			manager.remove(product);
			transaction.commit();
			return true;
		} else {
			return false;
		}
	}

}
