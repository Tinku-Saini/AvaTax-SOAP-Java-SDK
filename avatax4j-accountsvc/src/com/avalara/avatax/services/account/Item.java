/**
 * Item.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.account;

public class Item  implements java.io.Serializable {
    private long itemId;
    private java.lang.String itemCode;
    private int companyId;
    private java.util.Calendar createdDate;
    private int createdUserId;
    private int taxCodeId;
    private java.lang.String description;
    private java.util.Calendar modifiedDate;
    private int modifiedUserId;
    private com.avalara.avatax.services.account.Company company;
    private com.avalara.avatax.services.account.TaxCode taxCode;

    public Item() {
    }

    public Item(
           long itemId,
           java.lang.String itemCode,
           int companyId,
           java.util.Calendar createdDate,
           int createdUserId,
           int taxCodeId,
           java.lang.String description,
           java.util.Calendar modifiedDate,
           int modifiedUserId,
           com.avalara.avatax.services.account.Company company,
           com.avalara.avatax.services.account.TaxCode taxCode) {
           this.itemId = itemId;
           this.itemCode = itemCode;
           this.companyId = companyId;
           this.createdDate = createdDate;
           this.createdUserId = createdUserId;
           this.taxCodeId = taxCodeId;
           this.description = description;
           this.modifiedDate = modifiedDate;
           this.modifiedUserId = modifiedUserId;
           this.company = company;
           this.taxCode = taxCode;
    }


    /**
     * Gets the itemId value for this Item.
     * 
     * @return itemId
     */
    public long getItemId() {
        return itemId;
    }


    /**
     * Sets the itemId value for this Item.
     * 
     * @param itemId
     */
    public void setItemId(long itemId) {
        this.itemId = itemId;
    }


    /**
     * Gets the itemCode value for this Item.
     * 
     * @return itemCode
     */
    public java.lang.String getItemCode() {
        return itemCode;
    }


    /**
     * Sets the itemCode value for this Item.
     * 
     * @param itemCode
     */
    public void setItemCode(java.lang.String itemCode) {
        this.itemCode = itemCode;
    }


    /**
     * Gets the companyId value for this Item.
     * 
     * @return companyId
     */
    public int getCompanyId() {
        return companyId;
    }


    /**
     * Sets the companyId value for this Item.
     * 
     * @param companyId
     */
    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }


    /**
     * Gets the createdDate value for this Item.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Item.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the createdUserId value for this Item.
     * 
     * @return createdUserId
     */
    public int getCreatedUserId() {
        return createdUserId;
    }


    /**
     * Sets the createdUserId value for this Item.
     * 
     * @param createdUserId
     */
    public void setCreatedUserId(int createdUserId) {
        this.createdUserId = createdUserId;
    }


    /**
     * Gets the taxCodeId value for this Item.
     * 
     * @return taxCodeId
     */
    public int getTaxCodeId() {
        return taxCodeId;
    }


    /**
     * Sets the taxCodeId value for this Item.
     * 
     * @param taxCodeId
     */
    public void setTaxCodeId(int taxCodeId) {
        this.taxCodeId = taxCodeId;
    }


    /**
     * Gets the description value for this Item.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Item.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the modifiedDate value for this Item.
     * 
     * @return modifiedDate
     */
    public java.util.Calendar getModifiedDate() {
        return modifiedDate;
    }


    /**
     * Sets the modifiedDate value for this Item.
     * 
     * @param modifiedDate
     */
    public void setModifiedDate(java.util.Calendar modifiedDate) {
        this.modifiedDate = modifiedDate;
    }


    /**
     * Gets the modifiedUserId value for this Item.
     * 
     * @return modifiedUserId
     */
    public int getModifiedUserId() {
        return modifiedUserId;
    }


    /**
     * Sets the modifiedUserId value for this Item.
     * 
     * @param modifiedUserId
     */
    public void setModifiedUserId(int modifiedUserId) {
        this.modifiedUserId = modifiedUserId;
    }


    /**
     * Gets the company value for this Item.
     * 
     * @return company
     */
    public com.avalara.avatax.services.account.Company getCompany() {
        return company;
    }


    /**
     * Sets the company value for this Item.
     * 
     * @param company
     */
    public void setCompany(com.avalara.avatax.services.account.Company company) {
        this.company = company;
    }


    /**
     * Gets the taxCode value for this Item.
     * 
     * @return taxCode
     */
    public com.avalara.avatax.services.account.TaxCode getTaxCode() {
        return taxCode;
    }


    /**
     * Sets the taxCode value for this Item.
     * 
     * @param taxCode
     */
    public void setTaxCode(com.avalara.avatax.services.account.TaxCode taxCode) {
        this.taxCode = taxCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Item)) return false;
        Item other = (Item) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.itemId == other.getItemId() &&
            ((this.itemCode==null && other.getItemCode()==null) || 
             (this.itemCode!=null &&
              this.itemCode.equals(other.getItemCode()))) &&
            this.companyId == other.getCompanyId() &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            this.createdUserId == other.getCreatedUserId() &&
            this.taxCodeId == other.getTaxCodeId() &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.modifiedDate==null && other.getModifiedDate()==null) || 
             (this.modifiedDate!=null &&
              this.modifiedDate.equals(other.getModifiedDate()))) &&
            this.modifiedUserId == other.getModifiedUserId() &&
            ((this.company==null && other.getCompany()==null) || 
             (this.company!=null &&
              this.company.equals(other.getCompany()))) &&
            ((this.taxCode==null && other.getTaxCode()==null) || 
             (this.taxCode!=null &&
              this.taxCode.equals(other.getTaxCode())));
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
        _hashCode += new Long(getItemId()).hashCode();
        if (getItemCode() != null) {
            _hashCode += getItemCode().hashCode();
        }
        _hashCode += getCompanyId();
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        _hashCode += getCreatedUserId();
        _hashCode += getTaxCodeId();
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getModifiedDate() != null) {
            _hashCode += getModifiedDate().hashCode();
        }
        _hashCode += getModifiedUserId();
        if (getCompany() != null) {
            _hashCode += getCompany().hashCode();
        }
        if (getTaxCode() != null) {
            _hashCode += getTaxCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Item.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Item"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ItemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ItemCode"));
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
        elemField.setFieldName("taxCodeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "TaxCodeId"));
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
        elemField.setFieldName("company");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Company"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Company"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "TaxCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "TaxCode"));
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
