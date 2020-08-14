package com;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import com.aasoapexample.Product;
import com.aasoapexample.ProductCatelogCont;
import com.aasoapexample.ProductCatelogContImplService;
import com.aasoapexample.ProductCatelogContImplServiceLocator;

public class Main {

	public static void main(String[] args) {
		try {

			ProductCatelogContImplService proCatImplServ = new ProductCatelogContImplServiceLocator();
			ProductCatelogCont proCatCon = proCatImplServ.getProductCatelogContImplPort();

			try {

				System.out.println("------------------List All Values --------------------------");

				Product[] pro = proCatCon.getAllProductCont();

				for (Product product : pro) {
					System.out.println("product values " + product.getProductName() + " " + product.getProductId());
				}
				System.out.println("------------------Add Values --------------------------");
				proCatCon.addProductCont("KeyBoard", 45826f);
				System.out.println("------------------After Adding Values --------------------------");
				Product[] prod = proCatCon.getAllProductCont();

				for (Product product : prod) {
					System.out.println("product values " + product.getProductName() + " " + product.getProductId());
				}

				System.out.println("------------------Update Values --------------------------");
				proCatCon.updateProductCont(37, "Harddisk", 5613.89f);

				System.out.println("------------------After Update --------------------------");
				Product[] proc = proCatCon.getAllProductCont();

				for (Product product : proc) {
					System.out.println("product values " + product.getProductName());
				}

				System.out.println("------------------Delete --------------------------");
				proCatCon.deleteProductCont(38);
				System.out.println("------------------After Delete --------------------------");
				
				Product[] procd = proCatCon.getAllProductCont();

				for (Product product : procd) {
					System.out.println("product values " + product.getProductName());
				}

			} catch (RemoteException e) {
				
				
				e.printStackTrace();
			}

		

		} catch (ServiceException e) {
			
			e.printStackTrace();
		}

	}

}
