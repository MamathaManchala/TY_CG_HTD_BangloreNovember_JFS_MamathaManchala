package com.capgemini.forestryspringboot.dao;

import java.util.List;

import com.capgemini.forestryspringboot.dto.ProductBean;

public interface ProductDao {
	
	
	public boolean addProduct(ProductBean bean);
	public boolean modifyProduct(ProductBean bean);
	public boolean deleteProduct (int productId);
	public ProductBean getProduct(int productId);
	public List<ProductBean> getAllProducts();
}


