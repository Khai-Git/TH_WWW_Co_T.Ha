package com.fit.Servlet;

public class ListProduct {
	Product product;
	int quantity;

	public ListProduct(Product product, int quantity, double totalPrice) {
		super();
		this.product = product;
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public ListProduct() {
		super();
	}

	@Override
	public String toString() {
		return "ListProduct [product=" + product + ", quantity=" + quantity + ",]";
	}

}
