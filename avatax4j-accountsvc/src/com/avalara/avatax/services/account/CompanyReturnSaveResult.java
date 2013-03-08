/**
 * CompanyReturnSaveResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.account;

public class CompanyReturnSaveResult  extends com.avalara.avatax.services.account.BaseResult  implements java.io.Serializable {
    private long companyReturnId;
    private long filingCalendarId;

    public CompanyReturnSaveResult() {
    }

    public CompanyReturnSaveResult(
           long companyReturnId,
           long filingCalendarId) {
           this.companyReturnId = companyReturnId;
           this.filingCalendarId = filingCalendarId;
    }


    /**
     * Gets the companyReturnId value for this CompanyReturnSaveResult.
     * 
     * @return companyReturnId
     */
    public long getCompanyReturnId() {
        return companyReturnId;
    }


    /**
     * Sets the companyReturnId value for this CompanyReturnSaveResult.
     * 
     * @param companyReturnId
     */
    public void setCompanyReturnId(long companyReturnId) {
        this.companyReturnId = companyReturnId;
    }


    /**
     * Gets the filingCalendarId value for this CompanyReturnSaveResult.
     * 
     * @return filingCalendarId
     */
    public long getFilingCalendarId() {
        return filingCalendarId;
    }


    /**
     * Sets the filingCalendarId value for this CompanyReturnSaveResult.
     * 
     * @param filingCalendarId
     */
    public void setFilingCalendarId(long filingCalendarId) {
        this.filingCalendarId = filingCalendarId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CompanyReturnSaveResult)) return false;
        CompanyReturnSaveResult other = (CompanyReturnSaveResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.companyReturnId == other.getCompanyReturnId() &&
            this.filingCalendarId == other.getFilingCalendarId();
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
        _hashCode += new Long(getCompanyReturnId()).hashCode();
        _hashCode += new Long(getFilingCalendarId()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CompanyReturnSaveResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CompanyReturnSaveResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyReturnId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CompanyReturnId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filingCalendarId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "FilingCalendarId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
