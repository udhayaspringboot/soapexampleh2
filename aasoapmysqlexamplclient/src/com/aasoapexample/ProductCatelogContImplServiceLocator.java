/**
 * ProductCatelogContImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.aasoapexample;

public class ProductCatelogContImplServiceLocator extends org.apache.axis.client.Service implements com.aasoapexample.ProductCatelogContImplService {

    public ProductCatelogContImplServiceLocator() {
    }


    public ProductCatelogContImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ProductCatelogContImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ProductCatelogContImplPort
    private java.lang.String ProductCatelogContImplPort_address = "http://localhost:8080/aasoapmysqlexampl/ProductCatelogContImplService";

    public java.lang.String getProductCatelogContImplPortAddress() {
        return ProductCatelogContImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ProductCatelogContImplPortWSDDServiceName = "ProductCatelogContImplPort";

    public java.lang.String getProductCatelogContImplPortWSDDServiceName() {
        return ProductCatelogContImplPortWSDDServiceName;
    }

    public void setProductCatelogContImplPortWSDDServiceName(java.lang.String name) {
        ProductCatelogContImplPortWSDDServiceName = name;
    }

    public com.aasoapexample.ProductCatelogCont getProductCatelogContImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ProductCatelogContImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getProductCatelogContImplPort(endpoint);
    }

    public com.aasoapexample.ProductCatelogCont getProductCatelogContImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.aasoapexample.ProductCatelogContImplPortBindingStub _stub = new com.aasoapexample.ProductCatelogContImplPortBindingStub(portAddress, this);
            _stub.setPortName(getProductCatelogContImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setProductCatelogContImplPortEndpointAddress(java.lang.String address) {
        ProductCatelogContImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.aasoapexample.ProductCatelogCont.class.isAssignableFrom(serviceEndpointInterface)) {
                com.aasoapexample.ProductCatelogContImplPortBindingStub _stub = new com.aasoapexample.ProductCatelogContImplPortBindingStub(new java.net.URL(ProductCatelogContImplPort_address), this);
                _stub.setPortName(getProductCatelogContImplPortWSDDServiceName());
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
        if ("ProductCatelogContImplPort".equals(inputPortName)) {
            return getProductCatelogContImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://aasoapexample.com/", "ProductCatelogContImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://aasoapexample.com/", "ProductCatelogContImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ProductCatelogContImplPort".equals(portName)) {
            setProductCatelogContImplPortEndpointAddress(address);
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
