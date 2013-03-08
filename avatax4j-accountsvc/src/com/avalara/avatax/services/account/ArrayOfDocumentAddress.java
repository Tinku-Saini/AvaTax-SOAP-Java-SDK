/**
 * ArrayOfDocumentAddress.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.account;

public class ArrayOfDocumentAddress  implements java.io.Serializable {
    private com.avalara.avatax.services.account.DocumentAddress[] documentAddress;

    public ArrayOfDocumentAddress() {
    }

    public ArrayOfDocumentAddress(
           com.avalara.avatax.services.account.DocumentAddress[] documentAddress) {
           this.documentAddress = documentAddress;
    }


    /**
     * Gets the documentAddress value for this ArrayOfDocumentAddress.
     * 
     * @return documentAddress
     */
    public com.avalara.avatax.services.account.DocumentAddress[] getDocumentAddress() {
        return documentAddress;
    }


    /**
     * Sets the documentAddress value for this ArrayOfDocumentAddress.
     * 
     * @param documentAddress
     */
    public void setDocumentAddress(com.avalara.avatax.services.account.DocumentAddress[] documentAddress) {
        this.documentAddress = documentAddress;
    }

    public com.avalara.avatax.services.account.DocumentAddress getDocumentAddress(int i) {
        return this.documentAddress[i];
    }

    public void setDocumentAddress(int i, com.avalara.avatax.services.account.DocumentAddress _value) {
        this.documentAddress[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfDocumentAddress)) return false;
        ArrayOfDocumentAddress other = (ArrayOfDocumentAddress) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.documentAddress==null && other.getDocumentAddress()==null) || 
             (this.documentAddress!=null &&
              java.util.Arrays.equals(this.documentAddress, other.getDocumentAddress())));
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
        if (getDocumentAddress() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDocumentAddress());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDocumentAddress(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfDocumentAddress.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ArrayOfDocumentAddress"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "DocumentAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "DocumentAddress"));
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
