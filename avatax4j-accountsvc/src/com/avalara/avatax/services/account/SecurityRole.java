/**
 * SecurityRole.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.account;

public class SecurityRole  implements java.io.Serializable {
    private com.avalara.avatax.services.account.SecurityRoleId securityRoleId;
    private java.lang.String description;
    private com.avalara.avatax.services.account.SecurityRoleId inheritsRoleId;
    private com.avalara.avatax.services.account.AccessLevel accessLevelId;

    public SecurityRole() {
    }

    public SecurityRole(
           com.avalara.avatax.services.account.SecurityRoleId securityRoleId,
           java.lang.String description,
           com.avalara.avatax.services.account.SecurityRoleId inheritsRoleId,
           com.avalara.avatax.services.account.AccessLevel accessLevelId) {
           this.securityRoleId = securityRoleId;
           this.description = description;
           this.inheritsRoleId = inheritsRoleId;
           this.accessLevelId = accessLevelId;
    }


    /**
     * Gets the securityRoleId value for this SecurityRole.
     * 
     * @return securityRoleId
     */
    public com.avalara.avatax.services.account.SecurityRoleId getSecurityRoleId() {
        return securityRoleId;
    }


    /**
     * Sets the securityRoleId value for this SecurityRole.
     * 
     * @param securityRoleId
     */
    public void setSecurityRoleId(com.avalara.avatax.services.account.SecurityRoleId securityRoleId) {
        this.securityRoleId = securityRoleId;
    }


    /**
     * Gets the description value for this SecurityRole.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this SecurityRole.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the inheritsRoleId value for this SecurityRole.
     * 
     * @return inheritsRoleId
     */
    public com.avalara.avatax.services.account.SecurityRoleId getInheritsRoleId() {
        return inheritsRoleId;
    }


    /**
     * Sets the inheritsRoleId value for this SecurityRole.
     * 
     * @param inheritsRoleId
     */
    public void setInheritsRoleId(com.avalara.avatax.services.account.SecurityRoleId inheritsRoleId) {
        this.inheritsRoleId = inheritsRoleId;
    }


    /**
     * Gets the accessLevelId value for this SecurityRole.
     * 
     * @return accessLevelId
     */
    public com.avalara.avatax.services.account.AccessLevel getAccessLevelId() {
        return accessLevelId;
    }


    /**
     * Sets the accessLevelId value for this SecurityRole.
     * 
     * @param accessLevelId
     */
    public void setAccessLevelId(com.avalara.avatax.services.account.AccessLevel accessLevelId) {
        this.accessLevelId = accessLevelId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SecurityRole)) return false;
        SecurityRole other = (SecurityRole) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.securityRoleId==null && other.getSecurityRoleId()==null) || 
             (this.securityRoleId!=null &&
              this.securityRoleId.equals(other.getSecurityRoleId()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.inheritsRoleId==null && other.getInheritsRoleId()==null) || 
             (this.inheritsRoleId!=null &&
              this.inheritsRoleId.equals(other.getInheritsRoleId()))) &&
            ((this.accessLevelId==null && other.getAccessLevelId()==null) || 
             (this.accessLevelId!=null &&
              this.accessLevelId.equals(other.getAccessLevelId())));
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
        if (getSecurityRoleId() != null) {
            _hashCode += getSecurityRoleId().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getInheritsRoleId() != null) {
            _hashCode += getInheritsRoleId().hashCode();
        }
        if (getAccessLevelId() != null) {
            _hashCode += getAccessLevelId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SecurityRole.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "SecurityRole"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("securityRoleId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "SecurityRoleId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "SecurityRoleId"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inheritsRoleId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "InheritsRoleId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "SecurityRoleId"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessLevelId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "AccessLevelId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "AccessLevel"));
        elemField.setNillable(false);
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
