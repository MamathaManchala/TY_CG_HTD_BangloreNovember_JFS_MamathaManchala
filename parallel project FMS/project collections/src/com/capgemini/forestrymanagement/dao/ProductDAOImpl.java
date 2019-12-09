package com.capgemini.forestrymanagement.dao;

import java.util.ArrayList;
import java.util.List;


import com.capgemini.forestrymanagement.bean.ProductBean;

public class ProductDAOImpl implements ProductDAO {
	private List<ProductBean> product =new ArrayList<ProductBean>();

	@Override
	public boolean addProduct(ProductBean bean) {
		for ( ProductBean pb: product) 
		{
			if( pb.getProductId() ==bean.getProductId()) 
				return false;
		}
		product.add(bean);
		return true;
	}
	
	@Override
	public boolean modifyProduct(ProductBean bean) {
		ProductBean pbean=getProduct(bean.getProductId());
		if(pbean!=null) {
			deleteProduct(bean.getProductId());
			pbean.setProductId(bean.getProductId());
			pbean.setProductName(bean.getProductName());
			product.add(pbean);
			return true;
		}
		
		
		
		return false;
	}


	@Override
	public boolean deleteProduct(int productId) {
		ProductBean bean=null;
		for ( ProductBean pb: product) {
			if(pb.getProductId()==productId) {
				bean=pb;
			}
		}
		if(bean!=null) {
			product.remove(bean);
			return true;
		}
		return false;
	}

	

	@Override
	public ProductBean getProduct(int productId) {
		ProductBean bean=null;
		for (ProductBean pb: product) {
			if(pb.getProductId()==productId) 

				return pb;
		}
		return null;
	}

	
	@Override
	public List<ProductBean> getAllProducts() {
		return product;
	}

}
