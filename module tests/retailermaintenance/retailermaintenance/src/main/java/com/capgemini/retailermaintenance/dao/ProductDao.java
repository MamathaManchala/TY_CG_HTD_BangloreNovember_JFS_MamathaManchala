package com.capgemini.retailermaintenance.dao;

import java.util.List;

import com.capgemini.retailermaintenance.dto.ProductBean;

public interface ProductDao {
	
	
	public boolean addProduct(ProductBean product);

	public ProductBean getProduct(int productId);

	public List<ProductBean> getAllProducts();


}
