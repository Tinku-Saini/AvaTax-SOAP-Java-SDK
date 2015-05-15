/**
 * CompanySupportingReturn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.account;

public class CompanySupportingReturn  implements java.io.Serializable {
    private long companyReturnId;
    private int companySupportingReturnId;
    private java.lang.String returnName;

    public CompanySupportingReturn() {
    }

    public CompanySupportingReturn(
           long companyReturnId,
           int companySupportingReturnId,
           java.lang.String returnName) {
           this.companyReturnId = companyReturnId;
           this.companySupportingReturnId = companySupportingReturnId;
           this.returnName = returnName;
    }


    /**
     * Gets the companyReturnId value for this CompanySupportingReturn.
     * 
     * @return companyReturnId
     */
    public long getCompanyReturnId() {
        return companyReturnId;
    }


    /**
     * Sets the companyReturnId value for this CompanySupportingReturn.
     * 
     * @param companyReturnId
     */
    public void setCompanyReturnId(long companyReturnId) {
        this.companyReturnId = companyReturnId;
    }


    /**
     * Gets the companySupportingReturnId value for this CompanySupportingReturn.
     * 
     * @return companySupportingReturnId
     */
    public int getCompanySupportingReturnId() {
        return companySupportingReturnId;
    }


    /**
     * Sets the companySupportingReturnId value for this CompanySupportingReturn.
     * 
     * @param companySupportingReturnId
     */
    public void setCompanySupportingReturnId(int companySupportingReturnId) {
        this.companySupportingReturnId = companySupportingReturnId;
    }


    /**
     * Gets the returnName value for this CompanySupportingReturn.
     * 
     * @return returnName
     */
    public java.lang.String getReturnName() {
        return returnName;
    }


    /**
     * Sets the returnName value for this CompanySupportingReturn.
     * 
     * @param returnName
     */
    public void setReturnName(java.lang.String returnName) {
        this.returnName = returnName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CompanySupportingReturn)) return false;
        CompanySupportingReturn other = (CompanySupportingReturn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.companyReturnId == other.getCompanyReturnId() &&
            this.companySupportingReturnId == other.getCompanySupportingReturnId() &&
            ((this.returnName==null && other.getReturnName()==null) || 
             (this.returnName!=null &&
              this.returnName.equals(other.getReturnName())));
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
        _hashCode += new Long(getCompanyReturnId()).hashCode();
        _hashCode += getCompanySupportingReturnId();
        if (getReturnName() != null) {
            _hashCode += getReturnName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CompanySupportingReturn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CompanySupportingReturn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyReturnId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CompanyReturnId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companySupportingReturnId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CompanySupportingReturnId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ReturnName"));
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
