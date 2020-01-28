package com.capgemini.forestrymanagementcollections.dao;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.forestrymanagementcollections.bean.ProductBean;
import com.capgemini.forestrymanagementcollections.exceptions.NotFoundException;

public class ProductDaoImpl  implements ProductDao {


	private List<ProductBean> product =new ArrayList<ProductBean>();

	@Override
	public boolean addProduct(ProductBean bean) {
		for ( ProductBean pb: product) 
		{
			if( pb.getProductId() == bean.getProductId()) {
			
				throw new NotFoundException("Product Id Already Exist");
			}
				
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
		
		
		throw new NotFoundException("Product Details Not Found");	
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
		throw new NotFoundException("Product Details Not Found");	
	}

	

	@Override
	public ProductBean getProduct(int productId) {
		for (ProductBean pb: product) {
			if(pb.getProductId()==productId) {

				return pb;
		}
		}
		throw new NotFoundException("Product Details Not Found");	
	}

	
	@Override
	public List<ProductBean> getAllProducts() {
		return product;
	}
}
