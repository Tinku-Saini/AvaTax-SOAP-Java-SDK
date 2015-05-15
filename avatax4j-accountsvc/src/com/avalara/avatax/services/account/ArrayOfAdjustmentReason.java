/**
 * ArrayOfAdjustmentReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.account;

public class ArrayOfAdjustmentReason  implements java.io.Serializable {
    private com.avalara.avatax.services.account.AdjustmentReason[] adjustmentReason;

    public ArrayOfAdjustmentReason() {
    }

    public ArrayOfAdjustmentReason(
           com.avalara.avatax.services.account.AdjustmentReason[] adjustmentReason) {
           this.adjustmentReason = adjustmentReason;
    }


    /**
     * Gets the adjustmentReason value for this ArrayOfAdjustmentReason.
     * 
     * @return adjustmentReason
     */
    public com.avalara.avatax.services.account.AdjustmentReason[] getAdjustmentReason() {
        return adjustmentReason;
    }


    /**
     * Sets the adjustmentReason value for this ArrayOfAdjustmentReason.
     * 
     * @param adjustmentReason
     */
    public void setAdjustmentReason(com.avalara.avatax.services.account.AdjustmentReason[] adjustmentReason) {
        this.adjustmentReason = adjustmentReason;
    }

    public com.avalara.avatax.services.account.AdjustmentReason getAdjustmentReason(int i) {
        return this.adjustmentReason[i];
    }

    public void setAdjustmentReason(int i, com.avalara.avatax.services.account.AdjustmentReason _value) {
        this.adjustmentReason[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfAdjustmentReason)) return false;
        ArrayOfAdjustmentReason other = (ArrayOfAdjustmentReason) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.adjustmentReason==null && other.getAdjustmentReason()==null) || 
             (this.adjustmentReason!=null &&
              java.util.Arrays.equals(this.adjustmentReason, other.getAdjustmentReason())));
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
        if (getAdjustmentReason() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdjustmentReason());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdjustmentReason(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfAdjustmentReason.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ArrayOfAdjustmentReason"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjustmentReason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "AdjustmentReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "AdjustmentReason"));
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
