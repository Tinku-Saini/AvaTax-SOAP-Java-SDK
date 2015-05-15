/**
 * ServiceConfigFetchResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.account;

public class ServiceConfigFetchResult  extends com.avalara.avatax.services.account.BaseResult  implements java.io.Serializable {
    private com.avalara.avatax.services.account.ServiceConfig serviceConfig;

    public ServiceConfigFetchResult() {
    }

    public ServiceConfigFetchResult(
           com.avalara.avatax.services.account.ServiceConfig serviceConfig) {
           this.serviceConfig = serviceConfig;
    }


    /**
     * Gets the serviceConfig value for this ServiceConfigFetchResult.
     * 
     * @return serviceConfig
     */
    public com.avalara.avatax.services.account.ServiceConfig getServiceConfig() {
        return serviceConfig;
    }


    /**
     * Sets the serviceConfig value for this ServiceConfigFetchResult.
     * 
     * @param serviceConfig
     */
    public void setServiceConfig(com.avalara.avatax.services.account.ServiceConfig serviceConfig) {
        this.serviceConfig = serviceConfig;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServiceConfigFetchResult)) return false;
        ServiceConfigFetchResult other = (ServiceConfigFetchResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.serviceConfig==null && other.getServiceConfig()==null) || 
             (this.serviceConfig!=null &&
              this.serviceConfig.equals(other.getServiceConfig())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getServiceConfig() != null) {
            _hashCode += getServiceConfig().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServiceConfigFetchResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ServiceConfigFetchResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ServiceConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ServiceConfig"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  com.avalara.avatax.services.base.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
