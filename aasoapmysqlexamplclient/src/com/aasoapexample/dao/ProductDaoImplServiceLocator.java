/**
 * ProductDaoImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.aasoapexample.dao;

public class ProductDaoImplServiceLocator extends org.apache.axis.client.Service implements com.aasoapexample.dao.ProductDaoImplService {

    public ProductDaoImplServiceLocator() {
    }


    public ProductDaoImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ProductDaoImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ProductDaoImplPort
    private java.lang.String ProductDaoImplPort_address = "http://localhost:8080/aasoapmysqlexampl/ProductDaoImplService";

    public java.lang.String getProductDaoImplPortAddress() {
        return ProductDaoImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ProductDaoImplPortWSDDServiceName = "ProductDaoImplPort";

    public java.lang.String getProductDaoImplPortWSDDServiceName() {
        return ProductDaoImplPortWSDDServiceName;
    }

    public void setProductDaoImplPortWSDDServiceName(java.lang.String name) {
        ProductDaoImplPortWSDDServiceName = name;
    }

    public com.aasoapexample.dao.ProductDao getProductDaoImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ProductDaoImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getProductDaoImplPort(endpoint);
    }

    public com.aasoapexample.dao.ProductDao getProductDaoImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.aasoapexample.dao.ProductDaoImplPortBindingStub _stub = new com.aasoapexample.dao.ProductDaoImplPortBindingStub(portAddress, this);
            _stub.setPortName(getProductDaoImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setProductDaoImplPortEndpointAddress(java.lang.String address) {
        ProductDaoImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.aasoapexample.dao.ProductDao.class.isAssignableFrom(serviceEndpointInterface)) {
                com.aasoapexample.dao.ProductDaoImplPortBindingStub _stub = new com.aasoapexample.dao.ProductDaoImplPortBindingStub(new java.net.URL(ProductDaoImplPort_address), this);
                _stub.setPortName(getProductDaoImplPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ProductDaoImplPort".equals(inputPortName)) {
            return getProductDaoImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://dao.aasoapexample.com/", "ProductDaoImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://dao.aasoapexample.com/", "ProductDaoImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ProductDaoImplPort".equals(portName)) {
            setProductDaoImplPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
