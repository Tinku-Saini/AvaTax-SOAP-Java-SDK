/**
 * ArrayOfAddressType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.account;

public class ArrayOfAddressType  implements java.io.Serializable {
    private com.avalara.avatax.services.account.AddressType[] addressType;

    public ArrayOfAddressType() {
    }

    public ArrayOfAddressType(
           com.avalara.avatax.services.account.AddressType[] addressType) {
           this.addressType = addressType;
    }


    /**
     * Gets the addressType value for this ArrayOfAddressType.
     * 
     * @return addressType
     */
    public com.avalara.avatax.services.account.AddressType[] getAddressType() {
        return addressType;
    }


    /**
     * Sets the addressType value for this ArrayOfAddressType.
     * 
     * @param addressType
     */
    public void setAddressType(com.avalara.avatax.services.account.AddressType[] addressType) {
        this.addressType = addressType;
    }

    public com.avalara.avatax.services.account.AddressType getAddressType(int i) {
        return this.addressType[i];
    }

    public void setAddressType(int i, com.avalara.avatax.services.account.AddressType _value) {
        this.addressType[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfAddressType)) return false;
        ArrayOfAddressType other = (ArrayOfAddressType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.addressType==null && other.getAddressType()==null) || 
             (this.addressType!=null &&
              java.util.Arrays.equals(this.addressType, other.getAddressType())));
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
        if (getAddressType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddressType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddressType(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfAddressType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ArrayOfAddressType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "AddressType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "AddressType"));
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
