package com.capgemini.forestryspringrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.forestryspringrest.dao.ProductDao;
import com.capgemini.forestryspringrest.dto.ProductBean;
@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductDao productDao;

	@Override
	public boolean addProduct(ProductBean bean) {

		return productDao.addProduct(bean);
	}

	@Override
	public ProductBean getProduct(int productId) {
		
		return productDao.getProduct(productId);
	}

	@Override
	public List<ProductBean> getAllProducts() {
		
		return productDao.getAllProducts();
	}

	@Override
	public boolean deleteProduct(int productId) {
		
		return productDao.deleteProduct(productId);
	}

	@Override
	public boolean modifyProduct(ProductBean bean) {
		return productDao.modifyProduct(bean);
	}
}
