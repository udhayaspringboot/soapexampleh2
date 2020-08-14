package com.aasoapexample;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.aasoapexample.model.Product;
@WebService

public interface ProductCatelogCont {

	@WebMethod
	List<Product> getAllProductCont();
	//@WebMethod(action="fetch_categories",operationName="fetch categories")
	@WebMethod
	Product getProductCont(int id);
	@WebMethod
	boolean addProductCont(String proName,float price);
	@WebMethod
	@WebResult(name="Product")
	boolean updateProductCont(int id,String proName,float price);
	@WebMethod
	boolean deleteProductCont(int id);	
	
	
	
}