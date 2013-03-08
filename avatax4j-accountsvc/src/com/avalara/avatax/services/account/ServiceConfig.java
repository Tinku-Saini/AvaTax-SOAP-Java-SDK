/**
 * ServiceConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.account;

public class ServiceConfig  implements java.io.Serializable {
    private int accountId;
    private com.avalara.avatax.services.account.AddressServiceConfig addressServiceConfig;
    private com.avalara.avatax.services.account.FormsServiceConfig formsServiceConfig;
    private com.avalara.avatax.services.account.TaxServiceConfig taxServiceConfig;

    public ServiceConfig() {
    }

    public ServiceConfig(
           int accountId,
           com.avalara.avatax.services.account.AddressServiceConfig addressServiceConfig,
           com.avalara.avatax.services.account.FormsServiceConfig formsServiceConfig,
           com.avalara.avatax.services.account.TaxServiceConfig taxServiceConfig) {
           this.accountId = accountId;
           this.addressServiceConfig = addressServiceConfig;
           this.formsServiceConfig = formsServiceConfig;
           this.taxServiceConfig = taxServiceConfig;
    }


    /**
     * Gets the accountId value for this ServiceConfig.
     * 
     * @return accountId
     */
    public int getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this ServiceConfig.
     * 
     * @param accountId
     */
    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the addressServiceConfig value for this ServiceConfig.
     * 
     * @return addressServiceConfig
     */
    public com.avalara.avatax.services.account.AddressServiceConfig getAddressServiceConfig() {
        return addressServiceConfig;
    }


    /**
     * Sets the addressServiceConfig value for this ServiceConfig.
     * 
     * @param addressServiceConfig
     */
    public void setAddressServiceConfig(com.avalara.avatax.services.account.AddressServiceConfig addressServiceConfig) {
        this.addressServiceConfig = addressServiceConfig;
    }


    /**
     * Gets the formsServiceConfig value for this ServiceConfig.
     * 
     * @return formsServiceConfig
     */
    public com.avalara.avatax.services.account.FormsServiceConfig getFormsServiceConfig() {
        return formsServiceConfig;
    }


    /**
     * Sets the formsServiceConfig value for this ServiceConfig.
     * 
     * @param formsServiceConfig
     */
    public void setFormsServiceConfig(com.avalara.avatax.services.account.FormsServiceConfig formsServiceConfig) {
        this.formsServiceConfig = formsServiceConfig;
    }


    /**
     * Gets the taxServiceConfig value for this ServiceConfig.
     * 
     * @return taxServiceConfig
     */
    public com.avalara.avatax.services.account.TaxServiceConfig getTaxServiceConfig() {
        return taxServiceConfig;
    }


    /**
     * Sets the taxServiceConfig value for this ServiceConfig.
     * 
     * @param taxServiceConfig
     */
    public void setTaxServiceConfig(com.avalara.avatax.services.account.TaxServiceConfig taxServiceConfig) {
        this.taxServiceConfig = taxServiceConfig;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServiceConfig)) return false;
        ServiceConfig other = (ServiceConfig) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.accountId == other.getAccountId() &&
            ((this.addressServiceConfig==null && other.getAddressServiceConfig()==null) || 
             (this.addressServiceConfig!=null &&
              this.addressServiceConfig.equals(other.getAddressServiceConfig()))) &&
            ((this.formsServiceConfig==null && other.getFormsServiceConfig()==null) || 
             (this.formsServiceConfig!=null &&
              this.formsServiceConfig.equals(other.getFormsServiceConfig()))) &&
            ((this.taxServiceConfig==null && other.getTaxServiceConfig()==null) || 
             (this.taxServiceConfig!=null &&
              this.taxServiceConfig.equals(other.getTaxServiceConfig())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getAccountId();
        if (getAddressServiceConfig() != null) {
            _hashCode += getAddressServiceConfig().hashCode();
        }
        if (getFormsServiceConfig() != null) {
            _hashCode += getFormsServiceConfig().hashCode();
        }
        if (getTaxServiceConfig() != null) {
            _hashCode += getTaxServiceConfig().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServiceConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ServiceConfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "AccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressServiceConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "AddressServiceConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "AddressServiceConfig"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formsServiceConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "FormsServiceConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "FormsServiceConfig"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxServiceConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "TaxServiceConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "TaxServiceConfig"));
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
