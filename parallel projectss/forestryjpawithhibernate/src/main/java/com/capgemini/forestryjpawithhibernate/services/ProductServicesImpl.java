package com.capgemini.forestryjpawithhibernate.services;

import java.util.List;

import com.capgemini.forestryjpawithhibernate.dao.ProductDao;
import com.capgemini.forestryjpawithhibernate.dto.ProductBean;
import com.capgemini.forestryjpawithhibernate.factory.ForestryFactory;

public class ProductServicesImpl implements ProductServices {
	
	ProductDao productDao =ForestryFactory.instanceOfProductDaoImpl();

	public boolean addProduct(ProductBean bean) {
		return productDao.addProduct(bean);
	}

	public boolean modifyProduct(ProductBean bean) {
		return productDao.modifyProduct(bean);
	}

	public boolean deleteProduct(int productId) {
		return productDao.deleteProduct(productId);
	}

	public ProductBean getProduct(int productId) {
		return productDao.getProduct(productId);
	}

	public List<ProductBean> getAllProducts() {
		return productDao.getAllProducts();
	}

	

}
