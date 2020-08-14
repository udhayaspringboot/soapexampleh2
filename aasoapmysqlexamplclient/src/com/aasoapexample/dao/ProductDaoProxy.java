package com.aasoapexample.dao;

public class ProductDaoProxy implements com.aasoapexample.dao.ProductDao {
  private String _endpoint = null;
  private com.aasoapexample.dao.ProductDao productDao = null;
  
  public ProductDaoProxy() {
    _initProductDaoProxy();
  }
  
  public ProductDaoProxy(String endpoint) {
    _endpoint = endpoint;
    _initProductDaoProxy();
  }
  
  private void _initProductDaoProxy() {
    try {
      productDao = (new com.aasoapexample.dao.ProductDaoImplServiceLocator()).getProductDaoImplPort();
      if (productDao != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)productDao)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)productDao)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (productDao != null)
      ((javax.xml.rpc.Stub)productDao)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.aasoapexample.dao.ProductDao getProductDao() {
    if (productDao == null)
      _initProductDaoProxy();
    return productDao;
  }
  
  public java.lang.String deleteProduct(int arg0) throws java.rmi.RemoteException{
    if (productDao == null)
      _initProductDaoProxy();
    return productDao.deleteProduct(arg0);
  }
  
  public com.aasoapexample.dao.Product[] getAllProduct() throws java.rmi.RemoteException{
    if (productDao == null)
      _initProductDaoProxy();
    return productDao.getAllProduct();
  }
  
  public java.lang.String addProduct(com.aasoapexample.dao.Product arg0) throws java.rmi.RemoteException{
    if (productDao == null)
      _initProductDaoProxy();
    return productDao.addProduct(arg0);
  }
  
  public java.lang.String updateProduct(com.aasoapexample.dao.Product arg0) throws java.rmi.RemoteException{
    if (productDao == null)
      _initProductDaoProxy();
    return productDao.updateProduct(arg0);
  }
  
  public com.aasoapexample.dao.Product getProduct(int arg0) throws java.rmi.RemoteException{
    if (productDao == null)
      _initProductDaoProxy();
    return productDao.getProduct(arg0);
  }
  
  
}