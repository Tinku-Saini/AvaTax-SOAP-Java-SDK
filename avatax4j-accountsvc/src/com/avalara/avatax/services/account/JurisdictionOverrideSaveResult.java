/**
 * JurisdictionOverrideSaveResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.account;

public class JurisdictionOverrideSaveResult  extends com.avalara.avatax.services.account.BaseResult  implements java.io.Serializable {
    private int jurisdictionOverrideId;

    public JurisdictionOverrideSaveResult() {
    }

    public JurisdictionOverrideSaveResult(
           int jurisdictionOverrideId) {
           this.jurisdictionOverrideId = jurisdictionOverrideId;
    }


    /**
     * Gets the jurisdictionOverrideId value for this JurisdictionOverrideSaveResult.
     * 
     * @return jurisdictionOverrideId
     */
    public int getJurisdictionOverrideId() {
        return jurisdictionOverrideId;
    }


    /**
     * Sets the jurisdictionOverrideId value for this JurisdictionOverrideSaveResult.
     * 
     * @param jurisdictionOverrideId
     */
    public void setJurisdictionOverrideId(int jurisdictionOverrideId) {
        this.jurisdictionOverrideId = jurisdictionOverrideId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof JurisdictionOverrideSaveResult)) return false;
        JurisdictionOverrideSaveResult other = (JurisdictionOverrideSaveResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.jurisdictionOverrideId == other.getJurisdictionOverrideId();
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
        _hashCode += getJurisdictionOverrideId();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(JurisdictionOverrideSaveResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "JurisdictionOverrideSaveResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jurisdictionOverrideId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "JurisdictionOverrideId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
