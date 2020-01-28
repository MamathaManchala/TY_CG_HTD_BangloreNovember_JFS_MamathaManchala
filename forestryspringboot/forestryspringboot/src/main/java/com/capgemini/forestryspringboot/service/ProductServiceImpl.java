package com.capgemini.forestryspringboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.forestryspringboot.dao.ProductDao;
import com.capgemini.forestryspringboot.dto.ProductBean;
import com.capgemini.forestryspringboot.exception.NotFoundException;
@Service
public class ProductServiceImpl implements ProductServices{

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
