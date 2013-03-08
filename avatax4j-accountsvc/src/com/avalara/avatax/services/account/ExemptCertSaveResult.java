/**
 * ExemptCertSaveResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.account;

public class ExemptCertSaveResult  extends com.avalara.avatax.services.account.BaseResult  implements java.io.Serializable {
    private int exemptCertId;
    private com.avalara.avatax.services.account.ExemptCertStatus resultExemptCertStatus;

    public ExemptCertSaveResult() {
    }

    public ExemptCertSaveResult(
           int exemptCertId,
           com.avalara.avatax.services.account.ExemptCertStatus resultExemptCertStatus) {
           this.exemptCertId = exemptCertId;
           this.resultExemptCertStatus = resultExemptCertStatus;
    }


    /**
     * Gets the exemptCertId value for this ExemptCertSaveResult.
     * 
     * @return exemptCertId
     */
    public int getExemptCertId() {
        return exemptCertId;
    }


    /**
     * Sets the exemptCertId value for this ExemptCertSaveResult.
     * 
     * @param exemptCertId
     */
    public void setExemptCertId(int exemptCertId) {
        this.exemptCertId = exemptCertId;
    }


    /**
     * Gets the resultExemptCertStatus value for this ExemptCertSaveResult.
     * 
     * @return resultExemptCertStatus
     */
    public com.avalara.avatax.services.account.ExemptCertStatus getResultExemptCertStatus() {
        return resultExemptCertStatus;
    }


    /**
     * Sets the resultExemptCertStatus value for this ExemptCertSaveResult.
     * 
     * @param resultExemptCertStatus
     */
    public void setResultExemptCertStatus(com.avalara.avatax.services.account.ExemptCertStatus resultExemptCertStatus) {
        this.resultExemptCertStatus = resultExemptCertStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExemptCertSaveResult)) return false;
        ExemptCertSaveResult other = (ExemptCertSaveResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.exemptCertId == other.getExemptCertId() &&
            ((this.resultExemptCertStatus==null && other.getResultExemptCertStatus()==null) || 
             (this.resultExemptCertStatus!=null &&
              this.resultExemptCertStatus.equals(other.getResultExemptCertStatus())));
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
        _hashCode += getExemptCertId();
        if (getResultExemptCertStatus() != null) {
            _hashCode += getResultExemptCertStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExemptCertSaveResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ExemptCertSaveResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exemptCertId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ExemptCertId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultExemptCertStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ResultExemptCertStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ExemptCertStatus"));
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
