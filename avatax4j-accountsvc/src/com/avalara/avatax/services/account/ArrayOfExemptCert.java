/**
 * ArrayOfExemptCert.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.account;

public class ArrayOfExemptCert  implements java.io.Serializable {
    private com.avalara.avatax.services.account.ExemptCert[] exemptCert;

    public ArrayOfExemptCert() {
    }

    public ArrayOfExemptCert(
           com.avalara.avatax.services.account.ExemptCert[] exemptCert) {
           this.exemptCert = exemptCert;
    }


    /**
     * Gets the exemptCert value for this ArrayOfExemptCert.
     * 
     * @return exemptCert
     */
    public com.avalara.avatax.services.account.ExemptCert[] getExemptCert() {
        return exemptCert;
    }


    /**
     * Sets the exemptCert value for this ArrayOfExemptCert.
     * 
     * @param exemptCert
     */
    public void setExemptCert(com.avalara.avatax.services.account.ExemptCert[] exemptCert) {
        this.exemptCert = exemptCert;
    }

    public com.avalara.avatax.services.account.ExemptCert getExemptCert(int i) {
        return this.exemptCert[i];
    }

    public void setExemptCert(int i, com.avalara.avatax.services.account.ExemptCert _value) {
        this.exemptCert[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfExemptCert)) return false;
        ArrayOfExemptCert other = (ArrayOfExemptCert) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.exemptCert==null && other.getExemptCert()==null) || 
             (this.exemptCert!=null &&
              java.util.Arrays.equals(this.exemptCert, other.getExemptCert())));
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
        if (getExemptCert() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExemptCert());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExemptCert(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfExemptCert.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ArrayOfExemptCert"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exemptCert");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ExemptCert"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ExemptCert"));
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
