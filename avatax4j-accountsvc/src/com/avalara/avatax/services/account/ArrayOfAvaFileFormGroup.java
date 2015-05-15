/**
 * ArrayOfAvaFileFormGroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.account;

public class ArrayOfAvaFileFormGroup  implements java.io.Serializable {
    private com.avalara.avatax.services.account.AvaFileFormGroup[] avaFileFormGroup;

    public ArrayOfAvaFileFormGroup() {
    }

    public ArrayOfAvaFileFormGroup(
           com.avalara.avatax.services.account.AvaFileFormGroup[] avaFileFormGroup) {
           this.avaFileFormGroup = avaFileFormGroup;
    }


    /**
     * Gets the avaFileFormGroup value for this ArrayOfAvaFileFormGroup.
     * 
     * @return avaFileFormGroup
     */
    public com.avalara.avatax.services.account.AvaFileFormGroup[] getAvaFileFormGroup() {
        return avaFileFormGroup;
    }


    /**
     * Sets the avaFileFormGroup value for this ArrayOfAvaFileFormGroup.
     * 
     * @param avaFileFormGroup
     */
    public void setAvaFileFormGroup(com.avalara.avatax.services.account.AvaFileFormGroup[] avaFileFormGroup) {
        this.avaFileFormGroup = avaFileFormGroup;
    }

    public com.avalara.avatax.services.account.AvaFileFormGroup getAvaFileFormGroup(int i) {
        return this.avaFileFormGroup[i];
    }

    public void setAvaFileFormGroup(int i, com.avalara.avatax.services.account.AvaFileFormGroup _value) {
        this.avaFileFormGroup[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfAvaFileFormGroup)) return false;
        ArrayOfAvaFileFormGroup other = (ArrayOfAvaFileFormGroup) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.avaFileFormGroup==null && other.getAvaFileFormGroup()==null) || 
             (this.avaFileFormGroup!=null &&
              java.util.Arrays.equals(this.avaFileFormGroup, other.getAvaFileFormGroup())));
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
        if (getAvaFileFormGroup() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAvaFileFormGroup());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAvaFileFormGroup(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfAvaFileFormGroup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ArrayOfAvaFileFormGroup"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("avaFileFormGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "AvaFileFormGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "AvaFileFormGroup"));
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
