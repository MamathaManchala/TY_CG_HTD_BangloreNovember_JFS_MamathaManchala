package com.capgemini.forestryspringboot.dao;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.capgemini.forestryspringboot.dto.CustomerBean;
import com.capgemini.forestryspringboot.dto.LandBean;
import com.capgemini.forestryspringboot.dto.ProductBean;
@SpringBootTest
class ProductDaoImplTest {
	
	@Autowired
	private ProductDao productDao;


	@Test
	void testAddProduct() {
		ProductBean product = new ProductBean();
		product.setProductId(67);
		product.setProductName("timber");
		product.setProdDescription("good");
		product.setProductCost(7890);
		assertTrue(productDao.addProduct(product));
	}

	@Test
	void testGetProduct() {
		ProductBean product = productDao.getProduct(5);
	    assertNotNull(product);
	}

	@Test
	void testGetAllProducts() {
		List<ProductBean> beans = productDao.getAllProducts();
		assertNotNull(beans);
	}

	@Test
	void testDeleteProduct() {
		ProductBean product = new ProductBean();
		product.setProductId(1);
		assertTrue(productDao.deleteProduct(product.getProductId()));
	}

	@Test
	void testModifyProduct() {
		ProductBean product = new ProductBean();
		product.setProductId(67);
		product.setProductName("fiber");
		product.setProdDescription("bad");
		product.setProductCost(7890);
		assertTrue(productDao.modifyProduct(product));
	}

}
