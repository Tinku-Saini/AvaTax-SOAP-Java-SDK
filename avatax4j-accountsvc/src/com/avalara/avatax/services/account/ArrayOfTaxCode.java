/**
 * ArrayOfTaxCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.account;

public class ArrayOfTaxCode  implements java.io.Serializable {
    private com.avalara.avatax.services.account.TaxCode[] taxCode;

    public ArrayOfTaxCode() {
    }

    public ArrayOfTaxCode(
           com.avalara.avatax.services.account.TaxCode[] taxCode) {
           this.taxCode = taxCode;
    }


    /**
     * Gets the taxCode value for this ArrayOfTaxCode.
     * 
     * @return taxCode
     */
    public com.avalara.avatax.services.account.TaxCode[] getTaxCode() {
        return taxCode;
    }


    /**
     * Sets the taxCode value for this ArrayOfTaxCode.
     * 
     * @param taxCode
     */
    public void setTaxCode(com.avalara.avatax.services.account.TaxCode[] taxCode) {
        this.taxCode = taxCode;
    }

    public com.avalara.avatax.services.account.TaxCode getTaxCode(int i) {
        return this.taxCode[i];
    }

    public void setTaxCode(int i, com.avalara.avatax.services.account.TaxCode _value) {
        this.taxCode[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfTaxCode)) return false;
        ArrayOfTaxCode other = (ArrayOfTaxCode) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.taxCode==null && other.getTaxCode()==null) || 
             (this.taxCode!=null &&
              java.util.Arrays.equals(this.taxCode, other.getTaxCode())));
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
        if (getTaxCode() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTaxCode());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTaxCode(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArrayOfTaxCode.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ArrayOfTaxCode"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "TaxCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "TaxCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
