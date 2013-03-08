/**
 * ArrayOfSecurityRole.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.account;

public class ArrayOfSecurityRole  implements java.io.Serializable {
    private com.avalara.avatax.services.account.SecurityRole[] securityRole;

    public ArrayOfSecurityRole() {
    }

    public ArrayOfSecurityRole(
           com.avalara.avatax.services.account.SecurityRole[] securityRole) {
           this.securityRole = securityRole;
    }


    /**
     * Gets the securityRole value for this ArrayOfSecurityRole.
     * 
     * @return securityRole
     */
    public com.avalara.avatax.services.account.SecurityRole[] getSecurityRole() {
        return securityRole;
    }


    /**
     * Sets the securityRole value for this ArrayOfSecurityRole.
     * 
     * @param securityRole
     */
    public void setSecurityRole(com.avalara.avatax.services.account.SecurityRole[] securityRole) {
        this.securityRole = securityRole;
    }

    public com.avalara.avatax.services.account.SecurityRole getSecurityRole(int i) {
        return this.securityRole[i];
    }

    public void setSecurityRole(int i, com.avalara.avatax.services.account.SecurityRole _value) {
        this.securityRole[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfSecurityRole)) return false;
        ArrayOfSecurityRole other = (ArrayOfSecurityRole) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.securityRole==null && other.getSecurityRole()==null) || 
             (this.securityRole!=null &&
              java.util.Arrays.equals(this.securityRole, other.getSecurityRole())));
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
        if (getSecurityRole() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSecurityRole());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSecurityRole(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfSecurityRole.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ArrayOfSecurityRole"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("securityRole");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "SecurityRole"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "SecurityRole"));
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
