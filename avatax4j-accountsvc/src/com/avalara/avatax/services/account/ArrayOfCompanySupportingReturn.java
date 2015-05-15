/**
 * ArrayOfCompanySupportingReturn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.account;

public class ArrayOfCompanySupportingReturn  implements java.io.Serializable {
    private com.avalara.avatax.services.account.CompanySupportingReturn[] companySupportingReturn;

    public ArrayOfCompanySupportingReturn() {
    }

    public ArrayOfCompanySupportingReturn(
           com.avalara.avatax.services.account.CompanySupportingReturn[] companySupportingReturn) {
           this.companySupportingReturn = companySupportingReturn;
    }


    /**
     * Gets the companySupportingReturn value for this ArrayOfCompanySupportingReturn.
     * 
     * @return companySupportingReturn
     */
    public com.avalara.avatax.services.account.CompanySupportingReturn[] getCompanySupportingReturn() {
        return companySupportingReturn;
    }


    /**
     * Sets the companySupportingReturn value for this ArrayOfCompanySupportingReturn.
     * 
     * @param companySupportingReturn
     */
    public void setCompanySupportingReturn(com.avalara.avatax.services.account.CompanySupportingReturn[] companySupportingReturn) {
        this.companySupportingReturn = companySupportingReturn;
    }

    public com.avalara.avatax.services.account.CompanySupportingReturn getCompanySupportingReturn(int i) {
        return this.companySupportingReturn[i];
    }

    public void setCompanySupportingReturn(int i, com.avalara.avatax.services.account.CompanySupportingReturn _value) {
        this.companySupportingReturn[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfCompanySupportingReturn)) return false;
        ArrayOfCompanySupportingReturn other = (ArrayOfCompanySupportingReturn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.companySupportingReturn==null && other.getCompanySupportingReturn()==null) || 
             (this.companySupportingReturn!=null &&
              java.util.Arrays.equals(this.companySupportingReturn, other.getCompanySupportingReturn())));
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
        if (getCompanySupportingReturn() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCompanySupportingReturn());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCompanySupportingReturn(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfCompanySupportingReturn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ArrayOfCompanySupportingReturn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companySupportingReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CompanySupportingReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CompanySupportingReturn"));
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
