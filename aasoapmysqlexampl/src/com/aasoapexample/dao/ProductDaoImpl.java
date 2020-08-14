package com.aasoapexample.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import com.aasoapexample.model.Product;
@WebService(endpointInterface="com.aasoapexample.dao.ProductDao")

public class ProductDaoImpl implements ProductDao {

	
	static Connection con;
	
	static void getConnectionMySql()
	{
		try {
			Class.forName("org.h2.Driver");
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		}  
		try {
			con=DriverManager.getConnection(  
			"jdbc:h2:~/test;DB_CLOSE_ON_EXIT=FALSE;AUTO_SERVER=TRUE","sa","");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}  
	}
	@Override
	public List<Product> getAllProduct() {
		getConnectionMySql();
		List<Product> lPro =new ArrayList<>();
		String query ="select * from product";
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
				int id =rs.getInt(1);
				String name = rs.getString(2);
				float price =rs.getFloat(3);
				Product pro = new Product(id,name,price);
				lPro.add(pro);
				
			}
			System.out.println("All Data From Department");
			
			
		} catch (SQLException e) {
			System.err.println("Data may not present");		}

		return lPro;}
	
	@Override
	public Product getProduct(int id) {
		getConnectionMySql();
		Product pro = null ;
		String query ="select * from product where pro_id=?";
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
				int proId =rs.getInt(1);
				String name = rs.getString(2);
				float price =rs.getFloat(3);
				 pro = new Product(id,name,price);
				
				
			}
			System.out.println("All Data From Department");
			
			
		} catch (SQLException e) {
			System.err.println("Data may not present");		}

		return pro;
	}

	@Override
	public String addProduct(Product product) {
		System.out.println("product details "+product.getProductId()+" "+product.getProductName()+ " "+product.getPrice());
		
		String query ="insert into product values (default,?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(query);
			//ps.setInt(1, dept.getDeptId());
			ps.setString(1, product.getProductName());
			ps.setFloat(2, product.getPrice());
			ps.executeUpdate();
			System.out.println("Department created");
			
		} catch (SQLException e) {
			System.err.println("Duplicate primary key ! change dept_id ");
		}
		
	
		return "Product added";
	}

	@Override
	public String updateProduct(Product product) {
getConnectionMySql();
		
		
		String query ="update product set pro_name=?,price=? where pro_id=?";
		try {
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setString(1, product.getProductName());
			ps.setFloat(2, product.getPrice());
			ps.setInt(3, product.getProductId());
			ps.executeUpdate();
			System.out.println("Product Updated");
			//con.close();
		} catch (SQLException e) {
		
			System.err.println("data not found");
			
		}
		return "updated successfully";
	}

	@Override
	public String deleteProduct(int id) {
		
		String query ="delete from product where pro_id=?";
		try {
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setInt(1, id);
			ps.executeUpdate();
			
			System.out.println("Data deleted from product");
			
		} catch (SQLException e) {
			
			System.err.println("data may not present");
		}
		
		return "deleted";
	}

}
