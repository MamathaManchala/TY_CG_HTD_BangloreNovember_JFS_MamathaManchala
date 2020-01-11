package com.capgemini.retailermaintenance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.retailermaintenance.dao.ProductDao;
import com.capgemini.retailermaintenance.dto.ProductBean;

@Service
public class ProductServiceImpl implements ProductServices {
	
	

		@Autowired
		private ProductDao dao;

		public boolean addProduct(ProductBean bean) {

			return dao.addProduct(bean);
		}

		public ProductBean getProduct(int productId) {
			
			return dao.getProduct(productId);
		}

		public List<ProductBean> getAllProducts() {
			
			return dao.getAllProducts();
		}

		
	

}
