package com.aasoapexample.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.aasoapexample.model.Product;

@WebService

public interface ProductCatelogSer {
	
	

	@WebMethod
	List<Product> getAllProductServ();
	//@WebMethod(action="fetch_categories",operationName="fetch categories")
	@WebMethod
	Product getProductServ(int id);
	@WebMethod
	boolean addProductServ(Product product);
	@WebMethod
	@WebResult(name="Product")
	boolean updateProductServ(Product product);
	@WebMethod
	boolean deleteProductServ(int id);

}
