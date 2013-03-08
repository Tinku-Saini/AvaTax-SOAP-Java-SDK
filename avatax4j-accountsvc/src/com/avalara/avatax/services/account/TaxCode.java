/**
 * TaxCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.account;

public class TaxCode  implements java.io.Serializable {
    private int taxCodeId;
    private java.lang.String taxCodeValue;
    private java.lang.String taxCodeTypeId;
    private int companyId;
    private java.lang.String description;
    private boolean isPhysical;
    private java.util.Calendar createdDate;
    private int createdUserId;
    private java.util.Calendar modifiedDate;
    private int modifiedUserId;
    private java.lang.String parentTaxCode;
    private boolean isActive;

    public TaxCode() {
    }

    public TaxCode(
           int taxCodeId,
           java.lang.String taxCodeValue,
           java.lang.String taxCodeTypeId,
           int companyId,
           java.lang.String description,
           boolean isPhysical,
           java.util.Calendar createdDate,
           int createdUserId,
           java.util.Calendar modifiedDate,
           int modifiedUserId,
           java.lang.String parentTaxCode,
           boolean isActive) {
           this.taxCodeId = taxCodeId;
           this.taxCodeValue = taxCodeValue;
           this.taxCodeTypeId = taxCodeTypeId;
           this.companyId = companyId;
           this.description = description;
           this.isPhysical = isPhysical;
           this.createdDate = createdDate;
           this.createdUserId = createdUserId;
           this.modifiedDate = modifiedDate;
           this.modifiedUserId = modifiedUserId;
           this.parentTaxCode = parentTaxCode;
           this.isActive = isActive;
    }


    /**
     * Gets the taxCodeId value for this TaxCode.
     * 
     * @return taxCodeId
     */
    public int getTaxCodeId() {
        return taxCodeId;
    }


    /**
     * Sets the taxCodeId value for this TaxCode.
     * 
     * @param taxCodeId
     */
    public void setTaxCodeId(int taxCodeId) {
        this.taxCodeId = taxCodeId;
    }


    /**
     * Gets the taxCodeValue value for this TaxCode.
     * 
     * @return taxCodeValue
     */
    public java.lang.String getTaxCodeValue() {
        return taxCodeValue;
    }


    /**
     * Sets the taxCodeValue value for this TaxCode.
     * 
     * @param taxCodeValue
     */
    public void setTaxCodeValue(java.lang.String taxCodeValue) {
        this.taxCodeValue = taxCodeValue;
    }


    /**
     * Gets the taxCodeTypeId value for this TaxCode.
     * 
     * @return taxCodeTypeId
     */
    public java.lang.String getTaxCodeTypeId() {
        return taxCodeTypeId;
    }


    /**
     * Sets the taxCodeTypeId value for this TaxCode.
     * 
     * @param taxCodeTypeId
     */
    public void setTaxCodeTypeId(java.lang.String taxCodeTypeId) {
        this.taxCodeTypeId = taxCodeTypeId;
    }


    /**
     * Gets the companyId value for this TaxCode.
     * 
     * @return companyId
     */
    public int getCompanyId() {
        return companyId;
    }


    /**
     * Sets the companyId value for this TaxCode.
     * 
     * @param companyId
     */
    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }


    /**
     * Gets the description value for this TaxCode.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this TaxCode.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the isPhysical value for this TaxCode.
     * 
     * @return isPhysical
     */
    public boolean isIsPhysical() {
        return isPhysical;
    }


    /**
     * Sets the isPhysical value for this TaxCode.
     * 
     * @param isPhysical
     */
    public void setIsPhysical(boolean isPhysical) {
        this.isPhysical = isPhysical;
    }


    /**
     * Gets the createdDate value for this TaxCode.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this TaxCode.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the createdUserId value for this TaxCode.
     * 
     * @return createdUserId
     */
    public int getCreatedUserId() {
        return createdUserId;
    }


    /**
     * Sets the createdUserId value for this TaxCode.
     * 
     * @param createdUserId
     */
    public void setCreatedUserId(int createdUserId) {
        this.createdUserId = createdUserId;
    }


    /**
     * Gets the modifiedDate value for this TaxCode.
     * 
     * @return modifiedDate
     */
    public java.util.Calendar getModifiedDate() {
        return modifiedDate;
    }


    /**
     * Sets the modifiedDate value for this TaxCode.
     * 
     * @param modifiedDate
     */
    public void setModifiedDate(java.util.Calendar modifiedDate) {
        this.modifiedDate = modifiedDate;
    }


    /**
     * Gets the modifiedUserId value for this TaxCode.
     * 
     * @return modifiedUserId
     */
    public int getModifiedUserId() {
        return modifiedUserId;
    }


    /**
     * Sets the modifiedUserId value for this TaxCode.
     * 
     * @param modifiedUserId
     */
    public void setModifiedUserId(int modifiedUserId) {
        this.modifiedUserId = modifiedUserId;
    }


    /**
     * Gets the parentTaxCode value for this TaxCode.
     * 
     * @return parentTaxCode
     */
    public java.lang.String getParentTaxCode() {
        return parentTaxCode;
    }


    /**
     * Sets the parentTaxCode value for this TaxCode.
     * 
     * @param parentTaxCode
     */
    public void setParentTaxCode(java.lang.String parentTaxCode) {
        this.parentTaxCode = parentTaxCode;
    }


    /**
     * Gets the isActive value for this TaxCode.
     * 
     * @return isActive
     */
    public boolean isIsActive() {
        return isActive;
    }


    /**
     * Sets the isActive value for this TaxCode.
     * 
     * @param isActive
     */
    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TaxCode)) return false;
        TaxCode other = (TaxCode) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.taxCodeId == other.getTaxCodeId() &&
            ((this.taxCodeValue==null && other.getTaxCodeValue()==null) || 
             (this.taxCodeValue!=null &&
              this.taxCodeValue.equals(other.getTaxCodeValue()))) &&
            ((this.taxCodeTypeId==null && other.getTaxCodeTypeId()==null) || 
             (this.taxCodeTypeId!=null &&
              this.taxCodeTypeId.equals(other.getTaxCodeTypeId()))) &&
            this.companyId == other.getCompanyId() &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            this.isPhysical == other.isIsPhysical() &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            this.createdUserId == other.getCreatedUserId() &&
            ((this.modifiedDate==null && other.getModifiedDate()==null) || 
             (this.modifiedDate!=null &&
              this.modifiedDate.equals(other.getModifiedDate()))) &&
            this.modifiedUserId == other.getModifiedUserId() &&
            ((this.parentTaxCode==null && other.getParentTaxCode()==null) || 
             (this.parentTaxCode!=null &&
              this.parentTaxCode.equals(other.getParentTaxCode()))) &&
            this.isActive == other.isIsActive();
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
        _hashCode += getTaxCodeId();
        if (getTaxCodeValue() != null) {
            _hashCode += getTaxCodeValue().hashCode();
        }
        if (getTaxCodeTypeId() != null) {
            _hashCode += getTaxCodeTypeId().hashCode();
        }
        _hashCode += getCompanyId();
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        _hashCode += (isIsPhysical() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        _hashCode += getCreatedUserId();
        if (getModifiedDate() != null) {
            _hashCode += getModifiedDate().hashCode();
        }
        _hashCode += getModifiedUserId();
        if (getParentTaxCode() != null) {
            _hashCode += getParentTaxCode().hashCode();
        }
        _hashCode += (isIsActive() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TaxCode.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "TaxCode"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxCodeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "TaxCodeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxCodeValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "TaxCodeValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxCodeTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "TaxCodeTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CompanyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("isPhysical");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "IsPhysical"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CreatedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CreatedUserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifiedUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ModifiedUserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentTaxCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ParentTaxCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isActive");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "IsActive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
