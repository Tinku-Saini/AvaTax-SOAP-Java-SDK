/**
 * FormsServiceConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.account;

public class FormsServiceConfig  implements java.io.Serializable {
    private int accountId;
    private java.util.Calendar createdDate;
    private int createdUserId;
    private java.util.Calendar modifiedDate;
    private int modifiedUserId;
    private org.apache.axis.types.UnsignedByte reviewActionDefault;
    private org.apache.axis.types.UnsignedByte zeroDollarActionDefault;
    private org.apache.axis.types.UnsignedByte worksheetDay;

    public FormsServiceConfig() {
    }

    public FormsServiceConfig(
           int accountId,
           java.util.Calendar createdDate,
           int createdUserId,
           java.util.Calendar modifiedDate,
           int modifiedUserId,
           org.apache.axis.types.UnsignedByte reviewActionDefault,
           org.apache.axis.types.UnsignedByte zeroDollarActionDefault,
           org.apache.axis.types.UnsignedByte worksheetDay) {
           this.accountId = accountId;
           this.createdDate = createdDate;
           this.createdUserId = createdUserId;
           this.modifiedDate = modifiedDate;
           this.modifiedUserId = modifiedUserId;
           this.reviewActionDefault = reviewActionDefault;
           this.zeroDollarActionDefault = zeroDollarActionDefault;
           this.worksheetDay = worksheetDay;
    }


    /**
     * Gets the accountId value for this FormsServiceConfig.
     * 
     * @return accountId
     */
    public int getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this FormsServiceConfig.
     * 
     * @param accountId
     */
    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the createdDate value for this FormsServiceConfig.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this FormsServiceConfig.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the createdUserId value for this FormsServiceConfig.
     * 
     * @return createdUserId
     */
    public int getCreatedUserId() {
        return createdUserId;
    }


    /**
     * Sets the createdUserId value for this FormsServiceConfig.
     * 
     * @param createdUserId
     */
    public void setCreatedUserId(int createdUserId) {
        this.createdUserId = createdUserId;
    }


    /**
     * Gets the modifiedDate value for this FormsServiceConfig.
     * 
     * @return modifiedDate
     */
    public java.util.Calendar getModifiedDate() {
        return modifiedDate;
    }


    /**
     * Sets the modifiedDate value for this FormsServiceConfig.
     * 
     * @param modifiedDate
     */
    public void setModifiedDate(java.util.Calendar modifiedDate) {
        this.modifiedDate = modifiedDate;
    }


    /**
     * Gets the modifiedUserId value for this FormsServiceConfig.
     * 
     * @return modifiedUserId
     */
    public int getModifiedUserId() {
        return modifiedUserId;
    }


    /**
     * Sets the modifiedUserId value for this FormsServiceConfig.
     * 
     * @param modifiedUserId
     */
    public void setModifiedUserId(int modifiedUserId) {
        this.modifiedUserId = modifiedUserId;
    }


    /**
     * Gets the reviewActionDefault value for this FormsServiceConfig.
     * 
     * @return reviewActionDefault
     */
    public org.apache.axis.types.UnsignedByte getReviewActionDefault() {
        return reviewActionDefault;
    }


    /**
     * Sets the reviewActionDefault value for this FormsServiceConfig.
     * 
     * @param reviewActionDefault
     */
    public void setReviewActionDefault(org.apache.axis.types.UnsignedByte reviewActionDefault) {
        this.reviewActionDefault = reviewActionDefault;
    }


    /**
     * Gets the zeroDollarActionDefault value for this FormsServiceConfig.
     * 
     * @return zeroDollarActionDefault
     */
    public org.apache.axis.types.UnsignedByte getZeroDollarActionDefault() {
        return zeroDollarActionDefault;
    }


    /**
     * Sets the zeroDollarActionDefault value for this FormsServiceConfig.
     * 
     * @param zeroDollarActionDefault
     */
    public void setZeroDollarActionDefault(org.apache.axis.types.UnsignedByte zeroDollarActionDefault) {
        this.zeroDollarActionDefault = zeroDollarActionDefault;
    }


    /**
     * Gets the worksheetDay value for this FormsServiceConfig.
     * 
     * @return worksheetDay
     */
    public org.apache.axis.types.UnsignedByte getWorksheetDay() {
        return worksheetDay;
    }


    /**
     * Sets the worksheetDay value for this FormsServiceConfig.
     * 
     * @param worksheetDay
     */
    public void setWorksheetDay(org.apache.axis.types.UnsignedByte worksheetDay) {
        this.worksheetDay = worksheetDay;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FormsServiceConfig)) return false;
        FormsServiceConfig other = (FormsServiceConfig) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.accountId == other.getAccountId() &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            this.createdUserId == other.getCreatedUserId() &&
            ((this.modifiedDate==null && other.getModifiedDate()==null) || 
             (this.modifiedDate!=null &&
              this.modifiedDate.equals(other.getModifiedDate()))) &&
            this.modifiedUserId == other.getModifiedUserId() &&
            ((this.reviewActionDefault==null && other.getReviewActionDefault()==null) || 
             (this.reviewActionDefault!=null &&
              this.reviewActionDefault.equals(other.getReviewActionDefault()))) &&
            ((this.zeroDollarActionDefault==null && other.getZeroDollarActionDefault()==null) || 
             (this.zeroDollarActionDefault!=null &&
              this.zeroDollarActionDefault.equals(other.getZeroDollarActionDefault()))) &&
            ((this.worksheetDay==null && other.getWorksheetDay()==null) || 
             (this.worksheetDay!=null &&
              this.worksheetDay.equals(other.getWorksheetDay())));
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
        _hashCode += getAccountId();
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        _hashCode += getCreatedUserId();
        if (getModifiedDate() != null) {
            _hashCode += getModifiedDate().hashCode();
        }
        _hashCode += getModifiedUserId();
        if (getReviewActionDefault() != null) {
            _hashCode += getReviewActionDefault().hashCode();
        }
        if (getZeroDollarActionDefault() != null) {
            _hashCode += getZeroDollarActionDefault().hashCode();
        }
        if (getWorksheetDay() != null) {
            _hashCode += getWorksheetDay().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FormsServiceConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "FormsServiceConfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "AccountId"));
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
        elemField.setFieldName("reviewActionDefault");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ReviewActionDefault"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedByte"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zeroDollarActionDefault");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ZeroDollarActionDefault"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedByte"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("worksheetDay");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "WorksheetDay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedByte"));
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
