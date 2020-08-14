/**
 * ProductDao.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.aasoapexample.dao;

public interface ProductDao extends java.rmi.Remote {
    public java.lang.String deleteProduct(int arg0) throws java.rmi.RemoteException;
    public com.aasoapexample.dao.Product[] getAllProduct() throws java.rmi.RemoteException;
    public java.lang.String addProduct(com.aasoapexample.dao.Product arg0) throws java.rmi.RemoteException;
    public java.lang.String updateProduct(com.aasoapexample.dao.Product arg0) throws java.rmi.RemoteException;
    public com.aasoapexample.dao.Product getProduct(int arg0) throws java.rmi.RemoteException;
}
