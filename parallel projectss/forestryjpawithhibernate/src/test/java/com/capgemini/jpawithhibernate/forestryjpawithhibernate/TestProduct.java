package com.capgemini.jpawithhibernate.forestryjpawithhibernate;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.capgemini.forestryjpawithhibernate.dao.ProductDao;
import com.capgemini.forestryjpawithhibernate.dao.ProductDaoImpl;
import com.capgemini.forestryjpawithhibernate.dto.ProductBean;

import junit.framework.TestCase;

public class TestProduct {

	 ProductDao productDao=new ProductDaoImpl();

//	@Test
//	public void testAddProduct() {
//      ProductBean bean = new ProductBean();
//	  productDao.addProduct(bean);
//	}
	
	@Test
	public void testGetProduct() {
		ProductBean bean = new ProductBean();
	    productDao.getProduct(5);
		TestCase.assertNotNull(bean);
		
		

	}
}
