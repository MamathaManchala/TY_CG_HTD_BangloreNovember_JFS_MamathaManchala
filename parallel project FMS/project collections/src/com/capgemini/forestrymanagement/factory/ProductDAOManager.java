package com.capgemini.forestrymanagement.factory;

import com.capgemini.forestrymanagement.dao.ProductDAO;
import com.capgemini.forestrymanagement.dao.ProductDAOImpl;

public class ProductDAOManager {
	public static ProductDAO getProductDAO() {
		return new ProductDAOImpl();
	}
}
