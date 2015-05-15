/**
 * BusinessAndExemptCertReasons.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.account;

public class BusinessAndExemptCertReasons  implements java.io.Serializable {
    private int businessAndExemptReasonId;
    private int businessTypeId;
    private java.lang.String exemptReasonId;
    private java.lang.String exemptReasonDescription;
    private boolean isEntity;

    public BusinessAndExemptCertReasons() {
    }

    public BusinessAndExemptCertReasons(
           int businessAndExemptReasonId,
           int businessTypeId,
           java.lang.String exemptReasonId,
           java.lang.String exemptReasonDescription,
           boolean isEntity) {
           this.businessAndExemptReasonId = businessAndExemptReasonId;
           this.businessTypeId = businessTypeId;
           this.exemptReasonId = exemptReasonId;
           this.exemptReasonDescription = exemptReasonDescription;
           this.isEntity = isEntity;
    }


    /**
     * Gets the businessAndExemptReasonId value for this BusinessAndExemptCertReasons.
     * 
     * @return businessAndExemptReasonId
     */
    public int getBusinessAndExemptReasonId() {
        return businessAndExemptReasonId;
    }


    /**
     * Sets the businessAndExemptReasonId value for this BusinessAndExemptCertReasons.
     * 
     * @param businessAndExemptReasonId
     */
    public void setBusinessAndExemptReasonId(int businessAndExemptReasonId) {
        this.businessAndExemptReasonId = businessAndExemptReasonId;
    }


    /**
     * Gets the businessTypeId value for this BusinessAndExemptCertReasons.
     * 
     * @return businessTypeId
     */
    public int getBusinessTypeId() {
        return businessTypeId;
    }


    /**
     * Sets the businessTypeId value for this BusinessAndExemptCertReasons.
     * 
     * @param businessTypeId
     */
    public void setBusinessTypeId(int businessTypeId) {
        this.businessTypeId = businessTypeId;
    }


    /**
     * Gets the exemptReasonId value for this BusinessAndExemptCertReasons.
     * 
     * @return exemptReasonId
     */
    public java.lang.String getExemptReasonId() {
        return exemptReasonId;
    }


    /**
     * Sets the exemptReasonId value for this BusinessAndExemptCertReasons.
     * 
     * @param exemptReasonId
     */
    public void setExemptReasonId(java.lang.String exemptReasonId) {
        this.exemptReasonId = exemptReasonId;
    }


    /**
     * Gets the exemptReasonDescription value for this BusinessAndExemptCertReasons.
     * 
     * @return exemptReasonDescription
     */
    public java.lang.String getExemptReasonDescription() {
        return exemptReasonDescription;
    }


    /**
     * Sets the exemptReasonDescription value for this BusinessAndExemptCertReasons.
     * 
     * @param exemptReasonDescription
     */
    public void setExemptReasonDescription(java.lang.String exemptReasonDescription) {
        this.exemptReasonDescription = exemptReasonDescription;
    }


    /**
     * Gets the isEntity value for this BusinessAndExemptCertReasons.
     * 
     * @return isEntity
     */
    public boolean isIsEntity() {
        return isEntity;
    }


    /**
     * Sets the isEntity value for this BusinessAndExemptCertReasons.
     * 
     * @param isEntity
     */
    public void setIsEntity(boolean isEntity) {
        this.isEntity = isEntity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BusinessAndExemptCertReasons)) return false;
        BusinessAndExemptCertReasons other = (BusinessAndExemptCertReasons) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.businessAndExemptReasonId == other.getBusinessAndExemptReasonId() &&
            this.businessTypeId == other.getBusinessTypeId() &&
            ((this.exemptReasonId==null && other.getExemptReasonId()==null) || 
             (this.exemptReasonId!=null &&
              this.exemptReasonId.equals(other.getExemptReasonId()))) &&
            ((this.exemptReasonDescription==null && other.getExemptReasonDescription()==null) || 
             (this.exemptReasonDescription!=null &&
              this.exemptReasonDescription.equals(other.getExemptReasonDescription()))) &&
            this.isEntity == other.isIsEntity();
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
        _hashCode += getBusinessAndExemptReasonId();
        _hashCode += getBusinessTypeId();
        if (getExemptReasonId() != null) {
            _hashCode += getExemptReasonId().hashCode();
        }
        if (getExemptReasonDescription() != null) {
            _hashCode += getExemptReasonDescription().hashCode();
        }
        _hashCode += (isIsEntity() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BusinessAndExemptCertReasons.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "BusinessAndExemptCertReasons"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessAndExemptReasonId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "BusinessAndExemptReasonId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "BusinessTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exemptReasonId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ExemptReasonId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exemptReasonDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ExemptReasonDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isEntity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "IsEntity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
