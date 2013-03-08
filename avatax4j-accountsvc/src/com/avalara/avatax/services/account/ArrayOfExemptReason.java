/**
 * ArrayOfExemptReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.account;

public class ArrayOfExemptReason  implements java.io.Serializable {
    private com.avalara.avatax.services.account.ExemptReason[] exemptReason;

    public ArrayOfExemptReason() {
    }

    public ArrayOfExemptReason(
           com.avalara.avatax.services.account.ExemptReason[] exemptReason) {
           this.exemptReason = exemptReason;
    }


    /**
     * Gets the exemptReason value for this ArrayOfExemptReason.
     * 
     * @return exemptReason
     */
    public com.avalara.avatax.services.account.ExemptReason[] getExemptReason() {
        return exemptReason;
    }


    /**
     * Sets the exemptReason value for this ArrayOfExemptReason.
     * 
     * @param exemptReason
     */
    public void setExemptReason(com.avalara.avatax.services.account.ExemptReason[] exemptReason) {
        this.exemptReason = exemptReason;
    }

    public com.avalara.avatax.services.account.ExemptReason getExemptReason(int i) {
        return this.exemptReason[i];
    }

    public void setExemptReason(int i, com.avalara.avatax.services.account.ExemptReason _value) {
        this.exemptReason[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfExemptReason)) return false;
        ArrayOfExemptReason other = (ArrayOfExemptReason) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.exemptReason==null && other.getExemptReason()==null) || 
             (this.exemptReason!=null &&
              java.util.Arrays.equals(this.exemptReason, other.getExemptReason())));
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
        if (getExemptReason() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExemptReason());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExemptReason(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfExemptReason.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ArrayOfExemptReason"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exemptReason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ExemptReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ExemptReason"));
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
