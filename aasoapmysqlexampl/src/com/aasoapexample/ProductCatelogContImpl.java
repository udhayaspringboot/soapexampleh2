package com.aasoapexample;

import java.util.List;

import javax.jws.WebService;

import com.aasoapexample.model.Product;
import com.aasoapexample.service.ProductCatelogService;

//@WebService(endpointInterface="com.aasoapexample.ProductCatelogCont",portName="ProCatalogPort",serviceName="ProCatelogService")
@WebService(endpointInterface="com.aasoapexample.ProductCatelogCont")

public class ProductCatelogContImpl implements ProductCatelogCont {
	
	ProductCatelogService pc = new ProductCatelogService();

	@Override
	public List<Product> getAllProductCont() {
		
		return pc.getAllProductServ();
	}

	@Override
	public Product getProductCont(int id) {
		
		return pc.getProductServ(id);
	}

	@Override
	public boolean addProductCont(String proName,float price) {
		
		System.out.println("values "+proName + " "+price);
		Product product = new Product();
		product.setProductName(proName);
		product.setPrice(price);
		pc.addProductServ(product);
		return false;
	}

	@Override
	public boolean updateProductCont(int id,String proName,float price) {
		Product pr = new Product(id,proName,price);
		pc.updateProductServ(pr);
		return false;
	}

	@Override
	public boolean deleteProductCont(int id) {
		pc.deleteProductServ(id);
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*//@WebMethod(action="fetch_categories",operationName="fetch categories")
	 (non-Javadoc)
	 * @see com.aasoapexample.ProductCatelog#getAllProduct()
	 
	@Override
	
	public List<String> getAllProduct()
	{
		return pc.getProductCaategories();
	}
	 (non-Javadoc)
	 * @see com.aasoapexample.ProductCatelog#getProduct(java.lang.String)
	 
	@Override
	
	public List<String> getProduct(String category)
	{
		return pc.getProduct(category);
	}
	 (non-Javadoc)
	 * @see com.aasoapexample.ProductCatelog#addProduct(java.lang.String, java.lang.String)
	 
	@Override
	
	public boolean addProduct(String category,String product)
	{
		return pc.addProduct(category,product);
	}
	
	 (non-Javadoc)
	 * @see com.aasoapexample.ProductCatelog#getProductModel(com.aasoapexample.model.Product)
	 
	@Override
	
	public List<Product> getProductModel(Product product)
	{
		return pc.getProductMoserv(product);
	}*/
}
