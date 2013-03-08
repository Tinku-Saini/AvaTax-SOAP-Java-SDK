/**
 * Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.account;

public class Service  implements java.io.Serializable {
   private int serviceId;
    private int accountId;
    private com.avalara.avatax.services.account.ServiceTypeId serviceTypeId;
    private int quantity;
    private int companyId;
    private java.util.Date effDate;
    private java.util.Date endDate;
    private java.util.Calendar createdDate;
    private int createdUserId;
    private java.util.Calendar modifiedDate;
    private int modifiedUserId;

    public Service() {
    }

    public Service(
           int serviceId,
           int accountId,
           com.avalara.avatax.services.account.ServiceTypeId serviceTypeId,
           int quantity,
           int companyId,
           java.util.Date effDate,
           java.util.Date endDate,
           java.util.Calendar createdDate,
           int createdUserId,
           java.util.Calendar modifiedDate,
           int modifiedUserId) {
           this.serviceId = serviceId;
           this.accountId = accountId;
           this.serviceTypeId = serviceTypeId;
           this.quantity = quantity;
           this.companyId = companyId;
           this.effDate = effDate;
           this.endDate = endDate;
           this.createdDate = createdDate;
           this.createdUserId = createdUserId;
           this.modifiedDate = modifiedDate;
           this.modifiedUserId = modifiedUserId;
    }


    /**
     * Gets the serviceId value for this Service.
     *
     * @return serviceId
     */
    public int getServiceId() {
        return serviceId;
    }


    /**
     * Sets the serviceId value for this Service.
     *
     * @param serviceId
     */
    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }


    /**
     * Gets the accountId value for this Service.
     *
     * @return accountId
     */
    public int getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this Service.
     *
     * @param accountId
     */
    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the serviceTypeId value for this Service.
     *
     * @return serviceTypeId
     */
    public com.avalara.avatax.services.account.ServiceTypeId getServiceTypeId() {
        return serviceTypeId;
    }


    /**
     * Sets the serviceTypeId value for this Service.
     *
     * @param serviceTypeId
     */
    public void setServiceTypeId(com.avalara.avatax.services.account.ServiceTypeId serviceTypeId) {
        this.serviceTypeId = serviceTypeId;
    }


    /**
     * Gets the quantity value for this Service.
     *
     * @return quantity
     */
    public int getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this Service.
     *
     * @param quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the companyId value for this Service.
     *
     * @return companyId
     */
    public int getCompanyId() {
        return companyId;
    }


    /**
     * Sets the companyId value for this Service.
     *
     * @param companyId
     */
    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }


    /**
     * Gets the effDate value for this Service.
     *
     * @return effDate
     */
    public java.util.Date getEffDate() {
        return effDate;
    }


    /**
     * Sets the effDate value for this Service.
     *
     * @param effDate
     */
    public void setEffDate(java.util.Date effDate) {
        this.effDate = effDate;
    }


    /**
     * Gets the endDate value for this Service.
     *
     * @return endDate
     */
    public java.util.Date getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this Service.
     *
     * @param endDate
     */
    public void setEndDate(java.util.Date endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the createdDate value for this Service.
     *
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Service.
     *
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the createdUserId value for this Service.
     *
     * @return createdUserId
     */
    public int getCreatedUserId() {
        return createdUserId;
    }


    /**
     * Sets the createdUserId value for this Service.
     *
     * @param createdUserId
     */
    public void setCreatedUserId(int createdUserId) {
        this.createdUserId = createdUserId;
    }


    /**
     * Gets the modifiedDate value for this Service.
     *
     * @return modifiedDate
     */
    public java.util.Calendar getModifiedDate() {
        return modifiedDate;
    }


    /**
     * Sets the modifiedDate value for this Service.
     *
     * @param modifiedDate
     */
    public void setModifiedDate(java.util.Calendar modifiedDate) {
        this.modifiedDate = modifiedDate;
    }


    /**
     * Gets the modifiedUserId value for this Service.
     *
     * @return modifiedUserId
     */
    public int getModifiedUserId() {
        return modifiedUserId;
    }


    /**
     * Sets the modifiedUserId value for this Service.
     *
     * @param modifiedUserId
     */
    public void setModifiedUserId(int modifiedUserId) {
        this.modifiedUserId = modifiedUserId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Service)) return false;
        Service other = (Service) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
            this.serviceId == other.getServiceId() &&
            this.accountId == other.getAccountId() &&
            ((this.serviceTypeId==null && other.getServiceTypeId()==null) ||
             (this.serviceTypeId!=null &&
              this.serviceTypeId.equals(other.getServiceTypeId()))) &&
            this.quantity == other.getQuantity() &&
            this.companyId == other.getCompanyId() &&
            ((this.effDate==null && other.getEffDate()==null) ||
             (this.effDate!=null &&
              this.effDate.equals(other.getEffDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) ||
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) ||
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            this.createdUserId == other.getCreatedUserId() &&
            ((this.modifiedDate==null && other.getModifiedDate()==null) ||
             (this.modifiedDate!=null &&
              this.modifiedDate.equals(other.getModifiedDate()))) &&
            this.modifiedUserId == other.getModifiedUserId();
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
        _hashCode += getServiceId();
        _hashCode += getAccountId();
        if (getServiceTypeId() != null) {
            _hashCode += getServiceTypeId().hashCode();
        }
        _hashCode += getQuantity();
        _hashCode += getCompanyId();
        if (getEffDate() != null) {
            _hashCode += getEffDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        _hashCode += getCreatedUserId();
        if (getModifiedDate() != null) {
            _hashCode += getModifiedDate().hashCode();
        }
        _hashCode += getModifiedUserId();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Service.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Service"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ServiceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "AccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ServiceTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ServiceTypeId"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CompanyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "EffDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "EndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
        elemField.setNillable(true);
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
        elemField.setNillable(true);
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
