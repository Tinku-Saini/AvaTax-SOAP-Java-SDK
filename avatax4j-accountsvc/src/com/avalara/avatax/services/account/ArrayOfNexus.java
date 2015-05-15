/**
 * ArrayOfNexus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.account;

public class ArrayOfNexus  implements java.io.Serializable {
    private com.avalara.avatax.services.account.Nexus[] nexus;

    public ArrayOfNexus() {
    }

    public ArrayOfNexus(
           com.avalara.avatax.services.account.Nexus[] nexus) {
           this.nexus = nexus;
    }


    /**
     * Gets the nexus value for this ArrayOfNexus.
     * 
     * @return nexus
     */
    public com.avalara.avatax.services.account.Nexus[] getNexus() {
        return nexus;
    }


    /**
     * Sets the nexus value for this ArrayOfNexus.
     * 
     * @param nexus
     */
    public void setNexus(com.avalara.avatax.services.account.Nexus[] nexus) {
        this.nexus = nexus;
    }

    public com.avalara.avatax.services.account.Nexus getNexus(int i) {
        return this.nexus[i];
    }

    public void setNexus(int i, com.avalara.avatax.services.account.Nexus _value) {
        this.nexus[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfNexus)) return false;
        ArrayOfNexus other = (ArrayOfNexus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nexus==null && other.getNexus()==null) || 
             (this.nexus!=null &&
              java.util.Arrays.equals(this.nexus, other.getNexus())));
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
        if (getNexus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNexus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNexus(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfNexus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ArrayOfNexus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nexus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Nexus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Nexus"));
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
