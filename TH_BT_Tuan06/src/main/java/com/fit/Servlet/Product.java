package com.fit.Servlet;

import java.math.BigDecimal;

public class Product {
	int id;
	String productName;
	BigDecimal pride;

	public Product(int id, String productName, BigDecimal pride) {
		super();
		this.id = id;
		this.productName = productName;
		this.pride = pride;
	}

	public Product() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public BigDecimal getPride() {
		return pride;
	}

	public void setPride(BigDecimal pride) {
		this.pride = pride;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", pride=" + pride + "]";
	}

}
