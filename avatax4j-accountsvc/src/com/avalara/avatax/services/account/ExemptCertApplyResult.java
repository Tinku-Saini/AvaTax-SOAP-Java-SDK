/**
 * ExemptCertApplyResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.account;

public class ExemptCertApplyResult  extends com.avalara.avatax.services.account.FilterResult  implements java.io.Serializable {
    private int documentCount;
    private int lineCount;

    public ExemptCertApplyResult() {
    }

    public ExemptCertApplyResult(
           int documentCount,
           int lineCount) {
           this.documentCount = documentCount;
           this.lineCount = lineCount;
    }


    /**
     * Gets the documentCount value for this ExemptCertApplyResult.
     * 
     * @return documentCount
     */
    public int getDocumentCount() {
        return documentCount;
    }


    /**
     * Sets the documentCount value for this ExemptCertApplyResult.
     * 
     * @param documentCount
     */
    public void setDocumentCount(int documentCount) {
        this.documentCount = documentCount;
    }


    /**
     * Gets the lineCount value for this ExemptCertApplyResult.
     * 
     * @return lineCount
     */
    public int getLineCount() {
        return lineCount;
    }


    /**
     * Sets the lineCount value for this ExemptCertApplyResult.
     * 
     * @param lineCount
     */
    public void setLineCount(int lineCount) {
        this.lineCount = lineCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExemptCertApplyResult)) return false;
        ExemptCertApplyResult other = (ExemptCertApplyResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.documentCount == other.getDocumentCount() &&
            this.lineCount == other.getLineCount();
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
        _hashCode += getDocumentCount();
        _hashCode += getLineCount();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExemptCertApplyResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ExemptCertApplyResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "DocumentCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "LineCount"));
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
