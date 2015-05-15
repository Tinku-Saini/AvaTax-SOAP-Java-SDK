/**
 * LocalSvc.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.local;

public interface LocalSvc extends javax.xml.rpc.Service {
    public java.lang.String getLocalSvcSoapAddress();

    public com.avalara.avatax.services.local.LocalSvcSoap getLocalSvcSoap() throws javax.xml.rpc.ServiceException;

    public com.avalara.avatax.services.local.LocalSvcSoap getLocalSvcSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
