package com.capgemini.forestrymanagement.bean;

public class ProductBean {
	private int productId;
	private String productName;

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	@Override
	public String toString() {
		return "ProductBean [productId=" + productId + ", productName=" + productName + "]";
	}



}
