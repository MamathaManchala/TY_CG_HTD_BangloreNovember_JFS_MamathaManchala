package com.capgemini.forestrymanagementcollections.services;

import java.util.List;

import com.capgemini.forestrymanagementcollections.bean.ProductBean;
import com.capgemini.forestrymanagementcollections.dao.ProductDao;
import com.capgemini.forestrymanagementcollections.factory.ForestryFactory;


public class ProductServicesImpl implements ProductServices {
	
	ProductDao productDao =ForestryFactory.instanceOfProductDaoImpl();

	@Override
	public boolean addProduct(ProductBean bean) {
		return productDao.addProduct(bean);
	}

	@Override
	public boolean modifyProduct(ProductBean bean) {
		return productDao.modifyProduct(bean);
	}

	@Override
	public boolean deleteProduct(int productId) {
		return productDao.deleteProduct(productId);
	}

	@Override
	public ProductBean getProduct(int productId) {
		return productDao.getProduct(productId);
	}

	@Override
	public List<ProductBean> getAllProducts() {
		return productDao.getAllProducts();
	}

	

}
