/**
 * ProductCatelogSer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.aasoapexample.service;

public interface ProductCatelogSer extends java.rmi.Remote {
    public com.aasoapexample.service.Product getProductServ(int arg0) throws java.rmi.RemoteException;
    public boolean addProductServ(com.aasoapexample.service.Product arg0) throws java.rmi.RemoteException;
    public boolean updateProductServ(com.aasoapexample.service.Product arg0) throws java.rmi.RemoteException;
    public boolean deleteProductServ(int arg0) throws java.rmi.RemoteException;
    public com.aasoapexample.service.Product[] getAllProductServ() throws java.rmi.RemoteException;
}
