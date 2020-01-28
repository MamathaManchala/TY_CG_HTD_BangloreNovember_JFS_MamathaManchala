package com.capgemini.forestrymanagementcollections.dao;

import java.util.List;

import com.capgemini.forestrymanagementcollections.bean.ProductBean;

public interface ProductDao {
	
	
	public boolean addProduct(ProductBean bean);
	public boolean modifyProduct(ProductBean bean);
	public boolean deleteProduct (int productId);
	public ProductBean getProduct(int productId);
	public List<ProductBean> getAllProducts();
}


