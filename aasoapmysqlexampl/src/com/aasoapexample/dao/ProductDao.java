package com.aasoapexample.dao;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.aasoapexample.model.Product;
@WebService

public interface ProductDao {
	
	@WebMethod
	List<Product> getAllProduct();
	//@WebMethod(action="fetch_categories",operationName="fetch categories")
	@WebMethod
	Product getProduct(int id);
	@WebMethod
	String addProduct(Product product);
	@WebMethod
	@WebResult(name="Product")
	String updateProduct(Product product);
	@WebMethod
	String deleteProduct(int id);

}
