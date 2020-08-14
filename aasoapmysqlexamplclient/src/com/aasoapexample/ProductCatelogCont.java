/**
 * ProductCatelogCont.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.aasoapexample;

public interface ProductCatelogCont extends java.rmi.Remote {
    public com.aasoapexample.Product getProductCont(int arg0) throws java.rmi.RemoteException;
    public boolean addProductCont(java.lang.String arg0, float arg1) throws java.rmi.RemoteException;
    public boolean deleteProductCont(int arg0) throws java.rmi.RemoteException;
    public com.aasoapexample.Product[] getAllProductCont() throws java.rmi.RemoteException;
    public boolean updateProductCont(int arg0, java.lang.String arg1, float arg2) throws java.rmi.RemoteException;
}
