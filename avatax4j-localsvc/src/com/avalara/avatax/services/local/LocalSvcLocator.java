/**
 * LocalSvcLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.local;

import java.net.URL;
import java.net.MalformedURLException;

public class LocalSvcLocator extends org.apache.axis.client.Service implements com.avalara.avatax.services.local.LocalSvc {

    public LocalSvcLocator() {
    }


    public LocalSvcLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public LocalSvcLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for LocalSvcSoap
    private java.lang.String LocalSvcSoap_address = "http://localhost:8080/AvaTaxLocal/Local/LocalSvc";

    public java.lang.String getLocalSvcSoapAddress() {
        return LocalSvcSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String LocalSvcSoapWSDDServiceName = "LocalSvcSoap";

    public java.lang.String getLocalSvcSoapWSDDServiceName() {
        return LocalSvcSoapWSDDServiceName;
    }

    public void setLocalSvcSoapWSDDServiceName(java.lang.String name) {
        LocalSvcSoapWSDDServiceName = name;
    }

    public com.avalara.avatax.services.local.LocalSvcSoap getLocalSvcSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(LocalSvcSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getLocalSvcSoap(endpoint);
    }

    public com.avalara.avatax.services.local.LocalSvcSoap getLocalSvcSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
             // BEGIN CUSTOM
            String path = portAddress.toString();
            path += "/local/localsvc";
            portAddress = new URL(path);
            // END CUSTOM
            com.avalara.avatax.services.local.LocalSvcSoapStub _stub = new com.avalara.avatax.services.local.LocalSvcSoapStub(portAddress, this);
            _stub.setPortName(getLocalSvcSoapWSDDServiceName());
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

    public void setLocalSvcSoapEndpointAddress(java.lang.String address) {
        LocalSvcSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.avalara.avatax.services.local.LocalSvcSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.avalara.avatax.services.local.LocalSvcSoapStub _stub = new com.avalara.avatax.services.local.LocalSvcSoapStub(new java.net.URL(LocalSvcSoap_address), this);
                _stub.setPortName(getLocalSvcSoapWSDDServiceName());
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
        if ("LocalSvcSoap".equals(inputPortName)) {
            return getLocalSvcSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://avatax.avalara.com/services", "LocalSvc");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "LocalSvcSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("LocalSvcSoap".equals(portName)) {
            setLocalSvcSoapEndpointAddress(address);
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
