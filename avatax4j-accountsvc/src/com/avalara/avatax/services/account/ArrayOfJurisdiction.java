/**
 * ArrayOfJurisdiction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.account;

public class ArrayOfJurisdiction  implements java.io.Serializable {
    private com.avalara.avatax.services.account.Jurisdiction[] jurisdiction;

    public ArrayOfJurisdiction() {
    }

    public ArrayOfJurisdiction(
           com.avalara.avatax.services.account.Jurisdiction[] jurisdiction) {
           this.jurisdiction = jurisdiction;
    }


    /**
     * Gets the jurisdiction value for this ArrayOfJurisdiction.
     * 
     * @return jurisdiction
     */
    public com.avalara.avatax.services.account.Jurisdiction[] getJurisdiction() {
        return jurisdiction;
    }


    /**
     * Sets the jurisdiction value for this ArrayOfJurisdiction.
     * 
     * @param jurisdiction
     */
    public void setJurisdiction(com.avalara.avatax.services.account.Jurisdiction[] jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    public com.avalara.avatax.services.account.Jurisdiction getJurisdiction(int i) {
        return this.jurisdiction[i];
    }

    public void setJurisdiction(int i, com.avalara.avatax.services.account.Jurisdiction _value) {
        this.jurisdiction[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfJurisdiction)) return false;
        ArrayOfJurisdiction other = (ArrayOfJurisdiction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.jurisdiction==null && other.getJurisdiction()==null) || 
             (this.jurisdiction!=null &&
              java.util.Arrays.equals(this.jurisdiction, other.getJurisdiction())));
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
        if (getJurisdiction() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getJurisdiction());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getJurisdiction(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfJurisdiction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ArrayOfJurisdiction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jurisdiction");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Jurisdiction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Jurisdiction"));
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
