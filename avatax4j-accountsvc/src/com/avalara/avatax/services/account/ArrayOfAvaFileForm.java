/**
 * ArrayOfAvaFileForm.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.account;

public class ArrayOfAvaFileForm  implements java.io.Serializable {
    private com.avalara.avatax.services.account.AvaFileForm[] avaFileForm;

    public ArrayOfAvaFileForm() {
    }

    public ArrayOfAvaFileForm(
           com.avalara.avatax.services.account.AvaFileForm[] avaFileForm) {
           this.avaFileForm = avaFileForm;
    }


    /**
     * Gets the avaFileForm value for this ArrayOfAvaFileForm.
     * 
     * @return avaFileForm
     */
    public com.avalara.avatax.services.account.AvaFileForm[] getAvaFileForm() {
        return avaFileForm;
    }


    /**
     * Sets the avaFileForm value for this ArrayOfAvaFileForm.
     * 
     * @param avaFileForm
     */
    public void setAvaFileForm(com.avalara.avatax.services.account.AvaFileForm[] avaFileForm) {
        this.avaFileForm = avaFileForm;
    }

    public com.avalara.avatax.services.account.AvaFileForm getAvaFileForm(int i) {
        return this.avaFileForm[i];
    }

    public void setAvaFileForm(int i, com.avalara.avatax.services.account.AvaFileForm _value) {
        this.avaFileForm[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfAvaFileForm)) return false;
        ArrayOfAvaFileForm other = (ArrayOfAvaFileForm) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.avaFileForm==null && other.getAvaFileForm()==null) || 
             (this.avaFileForm!=null &&
              java.util.Arrays.equals(this.avaFileForm, other.getAvaFileForm())));
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
        if (getAvaFileForm() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAvaFileForm());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAvaFileForm(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfAvaFileForm.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ArrayOfAvaFileForm"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("avaFileForm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "AvaFileForm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "AvaFileForm"));
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
