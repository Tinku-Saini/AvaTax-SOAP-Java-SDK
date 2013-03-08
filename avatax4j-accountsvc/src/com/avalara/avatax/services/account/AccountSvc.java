/**
 * AccountSvc.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.account;

public interface AccountSvc extends javax.xml.rpc.Service {
    public java.lang.String getAccountSvcSoap12Address();

    public com.avalara.avatax.services.account.AccountSvcSoap getAccountSvcSoap12() throws javax.xml.rpc.ServiceException;

    public com.avalara.avatax.services.account.AccountSvcSoap getAccountSvcSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
    public java.lang.String getAccountSvcSoapAddress();

    public com.avalara.avatax.services.account.AccountSvcSoap getAccountSvcSoap() throws javax.xml.rpc.ServiceException;

    public com.avalara.avatax.services.account.AccountSvcSoap getAccountSvcSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
