/**
 * ArrayOfDocumentLine.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.account;

public class ArrayOfDocumentLine  implements java.io.Serializable {
    private com.avalara.avatax.services.account.DocumentLine[] documentLine;

    public ArrayOfDocumentLine() {
    }

    public ArrayOfDocumentLine(
           com.avalara.avatax.services.account.DocumentLine[] documentLine) {
           this.documentLine = documentLine;
    }


    /**
     * Gets the documentLine value for this ArrayOfDocumentLine.
     * 
     * @return documentLine
     */
    public com.avalara.avatax.services.account.DocumentLine[] getDocumentLine() {
        return documentLine;
    }


    /**
     * Sets the documentLine value for this ArrayOfDocumentLine.
     * 
     * @param documentLine
     */
    public void setDocumentLine(com.avalara.avatax.services.account.DocumentLine[] documentLine) {
        this.documentLine = documentLine;
    }

    public com.avalara.avatax.services.account.DocumentLine getDocumentLine(int i) {
        return this.documentLine[i];
    }

    public void setDocumentLine(int i, com.avalara.avatax.services.account.DocumentLine _value) {
        this.documentLine[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfDocumentLine)) return false;
        ArrayOfDocumentLine other = (ArrayOfDocumentLine) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.documentLine==null && other.getDocumentLine()==null) || 
             (this.documentLine!=null &&
              java.util.Arrays.equals(this.documentLine, other.getDocumentLine())));
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
        if (getDocumentLine() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDocumentLine());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDocumentLine(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfDocumentLine.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ArrayOfDocumentLine"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentLine");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "DocumentLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "DocumentLine"));
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
