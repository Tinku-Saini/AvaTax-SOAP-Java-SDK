/**
 * BusinessType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.account;

public class BusinessType  implements java.io.Serializable {
    private int businessTypeId;
    private java.lang.String businessTypeDescription;

    public BusinessType() {
    }

    public BusinessType(
           int businessTypeId,
           java.lang.String businessTypeDescription) {
           this.businessTypeId = businessTypeId;
           this.businessTypeDescription = businessTypeDescription;
    }


    /**
     * Gets the businessTypeId value for this BusinessType.
     * 
     * @return businessTypeId
     */
    public int getBusinessTypeId() {
        return businessTypeId;
    }


    /**
     * Sets the businessTypeId value for this BusinessType.
     * 
     * @param businessTypeId
     */
    public void setBusinessTypeId(int businessTypeId) {
        this.businessTypeId = businessTypeId;
    }


    /**
     * Gets the businessTypeDescription value for this BusinessType.
     * 
     * @return businessTypeDescription
     */
    public java.lang.String getBusinessTypeDescription() {
        return businessTypeDescription;
    }


    /**
     * Sets the businessTypeDescription value for this BusinessType.
     * 
     * @param businessTypeDescription
     */
    public void setBusinessTypeDescription(java.lang.String businessTypeDescription) {
        this.businessTypeDescription = businessTypeDescription;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BusinessType)) return false;
        BusinessType other = (BusinessType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.businessTypeId == other.getBusinessTypeId() &&
            ((this.businessTypeDescription==null && other.getBusinessTypeDescription()==null) || 
             (this.businessTypeDescription!=null &&
              this.businessTypeDescription.equals(other.getBusinessTypeDescription())));
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
        _hashCode += getBusinessTypeId();
        if (getBusinessTypeDescription() != null) {
            _hashCode += getBusinessTypeDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BusinessType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "BusinessType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "BusinessTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessTypeDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "BusinessTypeDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
