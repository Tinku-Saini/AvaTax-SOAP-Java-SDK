/**
 * CompanySupportingReturnSaveResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.account;

public class CompanySupportingReturnSaveResult  extends com.avalara.avatax.services.account.BaseResult  implements java.io.Serializable {
    private int companySupportingReturnId;

    public CompanySupportingReturnSaveResult() {
    }

    public CompanySupportingReturnSaveResult(
           int companySupportingReturnId) {
           this.companySupportingReturnId = companySupportingReturnId;
    }


    /**
     * Gets the companySupportingReturnId value for this CompanySupportingReturnSaveResult.
     * 
     * @return companySupportingReturnId
     */
    public int getCompanySupportingReturnId() {
        return companySupportingReturnId;
    }


    /**
     * Sets the companySupportingReturnId value for this CompanySupportingReturnSaveResult.
     * 
     * @param companySupportingReturnId
     */
    public void setCompanySupportingReturnId(int companySupportingReturnId) {
        this.companySupportingReturnId = companySupportingReturnId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CompanySupportingReturnSaveResult)) return false;
        CompanySupportingReturnSaveResult other = (CompanySupportingReturnSaveResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.companySupportingReturnId == other.getCompanySupportingReturnId();
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
        _hashCode += getCompanySupportingReturnId();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CompanySupportingReturnSaveResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CompanySupportingReturnSaveResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companySupportingReturnId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CompanySupportingReturnId"));
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
