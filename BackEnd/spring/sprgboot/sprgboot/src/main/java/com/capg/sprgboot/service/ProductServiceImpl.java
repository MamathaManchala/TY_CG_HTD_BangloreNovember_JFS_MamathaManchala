package com.capg.sprgboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capg.sprgboot.dao.ProductDao;
import com.capg.sprgboot.dto.Product;
@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductDao dao;

	@Override
	public boolean addProduct(Product product) {

		return dao.addProduct(product);
	}

	@Override
	public Product getProduct(int id) {
		
		return dao.getProduct(id);
	}

	@Override
	public List<Product> getAllProducts() {
		
		return dao.getAllProducts();
	}

	@Override
	public boolean deleteProduct(int id) {
		
		return dao.deleteProduct(id);
	}
}
