/**
 * ArrayOfJurisdictionOverride.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.account;

public class ArrayOfJurisdictionOverride  implements java.io.Serializable {
    private com.avalara.avatax.services.account.JurisdictionOverride[] jurisdictionOverride;

    public ArrayOfJurisdictionOverride() {
    }

    public ArrayOfJurisdictionOverride(
           com.avalara.avatax.services.account.JurisdictionOverride[] jurisdictionOverride) {
           this.jurisdictionOverride = jurisdictionOverride;
    }


    /**
     * Gets the jurisdictionOverride value for this ArrayOfJurisdictionOverride.
     * 
     * @return jurisdictionOverride
     */
    public com.avalara.avatax.services.account.JurisdictionOverride[] getJurisdictionOverride() {
        return jurisdictionOverride;
    }


    /**
     * Sets the jurisdictionOverride value for this ArrayOfJurisdictionOverride.
     * 
     * @param jurisdictionOverride
     */
    public void setJurisdictionOverride(com.avalara.avatax.services.account.JurisdictionOverride[] jurisdictionOverride) {
        this.jurisdictionOverride = jurisdictionOverride;
    }

    public com.avalara.avatax.services.account.JurisdictionOverride getJurisdictionOverride(int i) {
        return this.jurisdictionOverride[i];
    }

    public void setJurisdictionOverride(int i, com.avalara.avatax.services.account.JurisdictionOverride _value) {
        this.jurisdictionOverride[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfJurisdictionOverride)) return false;
        ArrayOfJurisdictionOverride other = (ArrayOfJurisdictionOverride) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.jurisdictionOverride==null && other.getJurisdictionOverride()==null) || 
             (this.jurisdictionOverride!=null &&
              java.util.Arrays.equals(this.jurisdictionOverride, other.getJurisdictionOverride())));
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
        if (getJurisdictionOverride() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getJurisdictionOverride());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getJurisdictionOverride(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfJurisdictionOverride.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ArrayOfJurisdictionOverride"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jurisdictionOverride");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "JurisdictionOverride"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "JurisdictionOverride"));
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
