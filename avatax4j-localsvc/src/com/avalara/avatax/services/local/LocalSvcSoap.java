/**
 * LocalSvcSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.local;

public interface LocalSvcSoap extends java.rmi.Remote {
    public com.avalara.avatax.services.local.PingResult ping(java.lang.String message) throws java.rmi.RemoteException;
    public com.avalara.avatax.services.local.IsAuthorizedResult isAuthorized(java.lang.String operations) throws java.rmi.RemoteException;
    public com.avalara.avatax.services.local.GetUpdatesResult getUpdates(com.avalara.avatax.services.local.GetUpdatesRequest getUpdatesRequest) throws java.rmi.RemoteException;
    public com.avalara.avatax.services.local.PostTransactionResult postTransactions() throws java.rmi.RemoteException;
    public com.avalara.avatax.services.local.ConfigSettingFetchResult configSettingFetch(java.lang.String settings) throws java.rmi.RemoteException;
    public com.avalara.avatax.services.local.ConfigSettingSaveResult configSettingSave(com.avalara.avatax.services.local.ArrayOfConfigSetting configSettings) throws java.rmi.RemoteException;
    public com.avalara.avatax.services.local.GetInfoResult getInfo() throws java.rmi.RemoteException;
}
