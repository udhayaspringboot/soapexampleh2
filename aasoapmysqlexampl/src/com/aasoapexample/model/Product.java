package com.aasoapexample.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Product")
//@XmlType(propOrder={"productId,productName,price"})
public class Product {
	
	private int productId;
	private String productName;
	private float price;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	//@XmlElement(name="prodName")
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Product() {
		super();
	}
	public Product(int productId, String productName, float price) {
		
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}
	

}
