/**
 * ArrayOfBusinessAndExemptCertReasons.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.account;

public class ArrayOfBusinessAndExemptCertReasons  implements java.io.Serializable {
    private com.avalara.avatax.services.account.BusinessAndExemptCertReasons[] businessAndExemptCertReasons;

    public ArrayOfBusinessAndExemptCertReasons() {
    }

    public ArrayOfBusinessAndExemptCertReasons(
           com.avalara.avatax.services.account.BusinessAndExemptCertReasons[] businessAndExemptCertReasons) {
           this.businessAndExemptCertReasons = businessAndExemptCertReasons;
    }


    /**
     * Gets the businessAndExemptCertReasons value for this ArrayOfBusinessAndExemptCertReasons.
     * 
     * @return businessAndExemptCertReasons
     */
    public com.avalara.avatax.services.account.BusinessAndExemptCertReasons[] getBusinessAndExemptCertReasons() {
        return businessAndExemptCertReasons;
    }


    /**
     * Sets the businessAndExemptCertReasons value for this ArrayOfBusinessAndExemptCertReasons.
     * 
     * @param businessAndExemptCertReasons
     */
    public void setBusinessAndExemptCertReasons(com.avalara.avatax.services.account.BusinessAndExemptCertReasons[] businessAndExemptCertReasons) {
        this.businessAndExemptCertReasons = businessAndExemptCertReasons;
    }

    public com.avalara.avatax.services.account.BusinessAndExemptCertReasons getBusinessAndExemptCertReasons(int i) {
        return this.businessAndExemptCertReasons[i];
    }

    public void setBusinessAndExemptCertReasons(int i, com.avalara.avatax.services.account.BusinessAndExemptCertReasons _value) {
        this.businessAndExemptCertReasons[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfBusinessAndExemptCertReasons)) return false;
        ArrayOfBusinessAndExemptCertReasons other = (ArrayOfBusinessAndExemptCertReasons) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.businessAndExemptCertReasons==null && other.getBusinessAndExemptCertReasons()==null) || 
             (this.businessAndExemptCertReasons!=null &&
              java.util.Arrays.equals(this.businessAndExemptCertReasons, other.getBusinessAndExemptCertReasons())));
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
        if (getBusinessAndExemptCertReasons() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBusinessAndExemptCertReasons());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBusinessAndExemptCertReasons(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfBusinessAndExemptCertReasons.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ArrayOfBusinessAndExemptCertReasons"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessAndExemptCertReasons");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "BusinessAndExemptCertReasons"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "BusinessAndExemptCertReasons"));
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
