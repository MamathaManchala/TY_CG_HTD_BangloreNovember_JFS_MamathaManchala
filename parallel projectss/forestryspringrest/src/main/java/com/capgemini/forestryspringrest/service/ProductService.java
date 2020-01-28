package com.capgemini.forestryspringrest.service;

import java.util.List;

import com.capgemini.forestryspringrest.dto.ProductBean;

public interface ProductService {
	
	
	public boolean addProduct(ProductBean bean);
	public boolean modifyProduct(ProductBean bean);
	public boolean deleteProduct (int productId);
	public ProductBean getProduct(int productId);
	public List<ProductBean> getAllProducts();
}


