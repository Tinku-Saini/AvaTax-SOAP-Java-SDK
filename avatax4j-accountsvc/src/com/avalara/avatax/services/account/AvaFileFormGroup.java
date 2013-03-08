/**
 * AvaFileFormGroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.account;

public class AvaFileFormGroup  implements java.io.Serializable {
    private int avaFileFormGroupId;
    private java.lang.String returnName;
    private java.lang.String supportingFormName;

    public AvaFileFormGroup() {
    }

    public AvaFileFormGroup(
           int avaFileFormGroupId,
           java.lang.String returnName,
           java.lang.String supportingFormName) {
           this.avaFileFormGroupId = avaFileFormGroupId;
           this.returnName = returnName;
           this.supportingFormName = supportingFormName;
    }


    /**
     * Gets the avaFileFormGroupId value for this AvaFileFormGroup.
     * 
     * @return avaFileFormGroupId
     */
    public int getAvaFileFormGroupId() {
        return avaFileFormGroupId;
    }


    /**
     * Sets the avaFileFormGroupId value for this AvaFileFormGroup.
     * 
     * @param avaFileFormGroupId
     */
    public void setAvaFileFormGroupId(int avaFileFormGroupId) {
        this.avaFileFormGroupId = avaFileFormGroupId;
    }


    /**
     * Gets the returnName value for this AvaFileFormGroup.
     * 
     * @return returnName
     */
    public java.lang.String getReturnName() {
        return returnName;
    }


    /**
     * Sets the returnName value for this AvaFileFormGroup.
     * 
     * @param returnName
     */
    public void setReturnName(java.lang.String returnName) {
        this.returnName = returnName;
    }


    /**
     * Gets the supportingFormName value for this AvaFileFormGroup.
     * 
     * @return supportingFormName
     */
    public java.lang.String getSupportingFormName() {
        return supportingFormName;
    }


    /**
     * Sets the supportingFormName value for this AvaFileFormGroup.
     * 
     * @param supportingFormName
     */
    public void setSupportingFormName(java.lang.String supportingFormName) {
        this.supportingFormName = supportingFormName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AvaFileFormGroup)) return false;
        AvaFileFormGroup other = (AvaFileFormGroup) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.avaFileFormGroupId == other.getAvaFileFormGroupId() &&
            ((this.returnName==null && other.getReturnName()==null) || 
             (this.returnName!=null &&
              this.returnName.equals(other.getReturnName()))) &&
            ((this.supportingFormName==null && other.getSupportingFormName()==null) || 
             (this.supportingFormName!=null &&
              this.supportingFormName.equals(other.getSupportingFormName())));
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
        _hashCode += getAvaFileFormGroupId();
        if (getReturnName() != null) {
            _hashCode += getReturnName().hashCode();
        }
        if (getSupportingFormName() != null) {
            _hashCode += getSupportingFormName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AvaFileFormGroup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "AvaFileFormGroup"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("avaFileFormGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "AvaFileFormGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ReturnName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supportingFormName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "SupportingFormName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
