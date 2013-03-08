/**
 * AccountSvcLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.account;

import java.net.URL;
import java.net.MalformedURLException;

public class AccountSvcLocator extends org.apache.axis.client.Service implements com.avalara.avatax.services.account.AccountSvc {

    public AccountSvcLocator() {
    }


    public AccountSvcLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AccountSvcLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AccountSvcSoap12
    private java.lang.String AccountSvcSoap12_address = "http://development.avalara.net/account/accountsvc.asmx";

    public java.lang.String getAccountSvcSoap12Address() {
        return AccountSvcSoap12_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AccountSvcSoap12WSDDServiceName = "AccountSvcSoap12";

    public java.lang.String getAccountSvcSoap12WSDDServiceName() {
        return AccountSvcSoap12WSDDServiceName;
    }

    public void setAccountSvcSoap12WSDDServiceName(java.lang.String name) {
        AccountSvcSoap12WSDDServiceName = name;
    }

    public com.avalara.avatax.services.account.AccountSvcSoap getAccountSvcSoap12() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AccountSvcSoap12_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAccountSvcSoap12(endpoint);
    }

    public com.avalara.avatax.services.account.AccountSvcSoap getAccountSvcSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.avalara.avatax.services.account.AccountSvcSoap12Stub _stub = new com.avalara.avatax.services.account.AccountSvcSoap12Stub(portAddress, this);
            _stub.setPortName(getAccountSvcSoap12WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAccountSvcSoap12EndpointAddress(java.lang.String address) {
        AccountSvcSoap12_address = address;
    }


    // Use to get a proxy class for AccountSvcSoap
    private java.lang.String AccountSvcSoap_address = "http://development.avalara.net/account/accountsvc.asmx";

    public java.lang.String getAccountSvcSoapAddress() {
        return AccountSvcSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AccountSvcSoapWSDDServiceName = "AccountSvcSoap";

    public java.lang.String getAccountSvcSoapWSDDServiceName() {
        return AccountSvcSoapWSDDServiceName;
    }

    public void setAccountSvcSoapWSDDServiceName(java.lang.String name) {
        AccountSvcSoapWSDDServiceName = name;
    }

    public com.avalara.avatax.services.account.AccountSvcSoap getAccountSvcSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AccountSvcSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAccountSvcSoap(endpoint);
    }

    public com.avalara.avatax.services.account.AccountSvcSoap getAccountSvcSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            // BEGIN CUSTOM
            String path = portAddress.toString();
            if (!path.endsWith(".asmx"))
            {
                if (!path.endsWith("/"))
                {
                    path += "/";
                }
                path += "account/accountsvc.asmx";
                portAddress = new URL(path);
            }
            // END CUSTOM
            com.avalara.avatax.services.account.AccountSvcSoapStub _stub = new com.avalara.avatax.services.account.AccountSvcSoapStub(portAddress, this);
            _stub.setPortName(getAccountSvcSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
        // BEGIN CUSTOM
        catch (MalformedURLException e)
        {
            return null;
        }
        // END CUSTOM
    }

    public void setAccountSvcSoapEndpointAddress(java.lang.String address) {
        AccountSvcSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     * This service has multiple ports for a given interface;
     * the proxy implementation returned may be indeterminate.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.avalara.avatax.services.account.AccountSvcSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.avalara.avatax.services.account.AccountSvcSoap12Stub _stub = new com.avalara.avatax.services.account.AccountSvcSoap12Stub(new java.net.URL(AccountSvcSoap12_address), this);
                _stub.setPortName(getAccountSvcSoap12WSDDServiceName());
                return _stub;
            }
            if (com.avalara.avatax.services.account.AccountSvcSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.avalara.avatax.services.account.AccountSvcSoapStub _stub = new com.avalara.avatax.services.account.AccountSvcSoapStub(new java.net.URL(AccountSvcSoap_address), this);
                _stub.setPortName(getAccountSvcSoapWSDDServiceName());
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
        if ("AccountSvcSoap12".equals(inputPortName)) {
            return getAccountSvcSoap12();
        }
        else if ("AccountSvcSoap".equals(inputPortName)) {
            return getAccountSvcSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://avatax.avalara.com/services", "AccountSvc");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "AccountSvcSoap12"));
            ports.add(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "AccountSvcSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AccountSvcSoap12".equals(portName)) {
            setAccountSvcSoap12EndpointAddress(address);
        }
        else 
if ("AccountSvcSoap".equals(portName)) {
            setAccountSvcSoapEndpointAddress(address);
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
