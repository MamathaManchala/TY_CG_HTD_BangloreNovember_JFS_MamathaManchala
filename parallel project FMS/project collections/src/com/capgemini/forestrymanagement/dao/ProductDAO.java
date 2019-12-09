package com.capgemini.forestrymanagement.dao;

import java.util.List;

import com.capgemini.forestrymanagement.bean.ProductBean;

public interface ProductDAO {
	public boolean addProduct(ProductBean bean);
	public boolean modifyProduct(ProductBean bean);
	public boolean deleteProduct (int productId);
	public ProductBean getProduct(int productId);
	public List<ProductBean> getAllProducts();
}
