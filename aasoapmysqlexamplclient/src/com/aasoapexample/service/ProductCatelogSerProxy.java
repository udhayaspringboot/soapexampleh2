package com.aasoapexample.service;

public class ProductCatelogSerProxy implements com.aasoapexample.service.ProductCatelogSer {
  private String _endpoint = null;
  private com.aasoapexample.service.ProductCatelogSer productCatelogSer = null;
  
  public ProductCatelogSerProxy() {
    _initProductCatelogSerProxy();
  }
  
  public ProductCatelogSerProxy(String endpoint) {
    _endpoint = endpoint;
    _initProductCatelogSerProxy();
  }
  
  private void _initProductCatelogSerProxy() {
    try {
      productCatelogSer = (new com.aasoapexample.service.ProductCatelogServiceServiceLocator()).getProductCatelogServicePort();
      if (productCatelogSer != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)productCatelogSer)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)productCatelogSer)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (productCatelogSer != null)
      ((javax.xml.rpc.Stub)productCatelogSer)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.aasoapexample.service.ProductCatelogSer getProductCatelogSer() {
    if (productCatelogSer == null)
      _initProductCatelogSerProxy();
    return productCatelogSer;
  }
  
  public com.aasoapexample.service.Product getProductServ(int arg0) throws java.rmi.RemoteException{
    if (productCatelogSer == null)
      _initProductCatelogSerProxy();
    return productCatelogSer.getProductServ(arg0);
  }
  
  public boolean addProductServ(com.aasoapexample.service.Product arg0) throws java.rmi.RemoteException{
    if (productCatelogSer == null)
      _initProductCatelogSerProxy();
    return productCatelogSer.addProductServ(arg0);
  }
  
  public boolean updateProductServ(com.aasoapexample.service.Product arg0) throws java.rmi.RemoteException{
    if (productCatelogSer == null)
      _initProductCatelogSerProxy();
    return productCatelogSer.updateProductServ(arg0);
  }
  
  public boolean deleteProductServ(int arg0) throws java.rmi.RemoteException{
    if (productCatelogSer == null)
      _initProductCatelogSerProxy();
    return productCatelogSer.deleteProductServ(arg0);
  }
  
  public com.aasoapexample.service.Product[] getAllProductServ() throws java.rmi.RemoteException{
    if (productCatelogSer == null)
      _initProductCatelogSerProxy();
    return productCatelogSer.getAllProductServ();
  }
  
  
}