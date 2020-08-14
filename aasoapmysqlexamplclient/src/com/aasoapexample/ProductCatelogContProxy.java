package com.aasoapexample;

public class ProductCatelogContProxy implements com.aasoapexample.ProductCatelogCont {
  private String _endpoint = null;
  private com.aasoapexample.ProductCatelogCont productCatelogCont = null;
  
  public ProductCatelogContProxy() {
    _initProductCatelogContProxy();
  }
  
  public ProductCatelogContProxy(String endpoint) {
    _endpoint = endpoint;
    _initProductCatelogContProxy();
  }
  
  private void _initProductCatelogContProxy() {
    try {
      productCatelogCont = (new com.aasoapexample.ProductCatelogContImplServiceLocator()).getProductCatelogContImplPort();
      if (productCatelogCont != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)productCatelogCont)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)productCatelogCont)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (productCatelogCont != null)
      ((javax.xml.rpc.Stub)productCatelogCont)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.aasoapexample.ProductCatelogCont getProductCatelogCont() {
    if (productCatelogCont == null)
      _initProductCatelogContProxy();
    return productCatelogCont;
  }
  
  public com.aasoapexample.Product getProductCont(int arg0) throws java.rmi.RemoteException{
    if (productCatelogCont == null)
      _initProductCatelogContProxy();
    return productCatelogCont.getProductCont(arg0);
  }
  
  public boolean addProductCont(java.lang.String arg0, float arg1) throws java.rmi.RemoteException{
    if (productCatelogCont == null)
      _initProductCatelogContProxy();
    return productCatelogCont.addProductCont(arg0, arg1);
  }
  
  public boolean deleteProductCont(int arg0) throws java.rmi.RemoteException{
    if (productCatelogCont == null)
      _initProductCatelogContProxy();
    return productCatelogCont.deleteProductCont(arg0);
  }
  
  public com.aasoapexample.Product[] getAllProductCont() throws java.rmi.RemoteException{
    if (productCatelogCont == null)
      _initProductCatelogContProxy();
    return productCatelogCont.getAllProductCont();
  }
  
  public boolean updateProductCont(int arg0, java.lang.String arg1, float arg2) throws java.rmi.RemoteException{
    if (productCatelogCont == null)
      _initProductCatelogContProxy();
    return productCatelogCont.updateProductCont(arg0, arg1, arg2);
  }
  
  
}