package com.capgemini.forestryjpawithhibernate.services;

import java.util.List;

import com.capgemini.forestryjpawithhibernate.dto.ProductBean;

public interface ProductServices {
	public boolean addProduct(ProductBean bean);
	public boolean modifyProduct(ProductBean bean);
	public boolean deleteProduct (int productId);
	public ProductBean getProduct(int productId);
	public List<ProductBean> getAllProducts();
}
