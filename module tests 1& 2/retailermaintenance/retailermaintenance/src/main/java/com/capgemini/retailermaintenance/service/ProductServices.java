package com.capgemini.retailermaintenance.service;

import java.util.List;

import com.capgemini.retailermaintenance.dto.ProductBean;

public interface ProductServices {
	
	public boolean addProduct(ProductBean bean);

	public ProductBean getProduct(int productd);

	public List<ProductBean> getAllProducts();

}
