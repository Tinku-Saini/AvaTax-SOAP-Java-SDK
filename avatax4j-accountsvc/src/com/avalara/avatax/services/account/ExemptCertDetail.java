/**
 * ExemptCertDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.account;

public class ExemptCertDetail  implements java.io.Serializable {
    private int exemptCertDetailId;
    private int exemptCertId;
    private java.lang.String stateFips;
    private java.lang.String region;
    private java.lang.String idNo;
     private java.util.Date endDate;
    private java.lang.String country;
    private java.lang.String idType;

    public ExemptCertDetail() {
    }

    public ExemptCertDetail(
           int exemptCertDetailId,
           int exemptCertId,
           java.lang.String stateFips,
           java.lang.String region,
           java.lang.String idNo,java.util.Date endDate,
           java.lang.String country,
           java.lang.String idType) {
           this.exemptCertDetailId = exemptCertDetailId;
           this.exemptCertId = exemptCertId;
           this.stateFips = stateFips;
           this.region = region;
           this.idNo = idNo;
           this.endDate = endDate;
           this.country = country;
           this.idType = idType;
    }


    /**
     * Gets the exemptCertDetailId value for this ExemptCertDetail.
     * 
     * @return exemptCertDetailId
     */
    public int getExemptCertDetailId() {
        return exemptCertDetailId;
    }


    /**
     * Sets the exemptCertDetailId value for this ExemptCertDetail.
     * 
     * @param exemptCertDetailId
     */
    public void setExemptCertDetailId(int exemptCertDetailId) {
        this.exemptCertDetailId = exemptCertDetailId;
    }


    /**
     * Gets the exemptCertId value for this ExemptCertDetail.
     * 
     * @return exemptCertId
     */
    public int getExemptCertId() {
        return exemptCertId;
    }


    /**
     * Sets the exemptCertId value for this ExemptCertDetail.
     * 
     * @param exemptCertId
     */
    public void setExemptCertId(int exemptCertId) {
        this.exemptCertId = exemptCertId;
    }


    /**
     * Gets the stateFips value for this ExemptCertDetail.
     * 
     * @return stateFips
     */
    public java.lang.String getStateFips() {
        return stateFips;
    }


    /**
     * Sets the stateFips value for this ExemptCertDetail.
     * 
     * @param stateFips
     */
    public void setStateFips(java.lang.String stateFips) {
        this.stateFips = stateFips;
    }


    /**
     * Gets the region value for this ExemptCertDetail.
     * 
     * @return region
     */
    public java.lang.String getRegion() {
        return region;
    }


    /**
     * Sets the region value for this ExemptCertDetail.
     * 
     * @param region
     */
    public void setRegion(java.lang.String region) {
        this.region = region;
    }


    /**
     * Gets the idNo value for this ExemptCertDetail.
     * 
     * @return idNo
     */
    public java.lang.String getIdNo() {
        return idNo;
    }


    /**
     * Sets the idNo value for this ExemptCertDetail.
     * 
     * @param idNo
     */
    public void setIdNo(java.lang.String idNo) {
        this.idNo = idNo;
    }

    /**
     * Gets the endDate value for this ExemptCertDetail.
     *
     * @return endDate
     */
    public java.util.Date getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this ExemptCertDetail.
     *
     * @param endDate
     */
    public void setEndDate(java.util.Date endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the country value for this ExemptCertDetail.
     *
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this ExemptCertDetail.
     *
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the idType value for this ExemptCertDetail.
     *
     * @return idType
     */
    public java.lang.String getIdType() {
        return idType;
    }


    /**
     * Sets the idType value for this ExemptCertDetail.
     *
     * @param idType
     */
    public void setIdType(java.lang.String idType) {
        this.idType = idType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExemptCertDetail)) return false;
        ExemptCertDetail other = (ExemptCertDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.exemptCertDetailId == other.getExemptCertDetailId() &&
            this.exemptCertId == other.getExemptCertId() &&
            ((this.stateFips==null && other.getStateFips()==null) || 
             (this.stateFips!=null &&
              this.stateFips.equals(other.getStateFips()))) &&
            ((this.region==null && other.getRegion()==null) || 
             (this.region!=null &&
              this.region.equals(other.getRegion()))) &&
            ((this.idNo==null && other.getIdNo()==null) || 
             (this.idNo!=null &&
              this.idNo.equals(other.getIdNo())))&&
            ((this.endDate==null && other.getEndDate()==null) ||
                 (this.endDate!=null &&
                  this.endDate.equals(other.getEndDate()))) &&
                ((this.country==null && other.getCountry()==null) ||
                 (this.country!=null &&
                  this.country.equals(other.getCountry()))) &&
                ((this.idType==null && other.getIdType()==null) ||
                 (this.idType!=null &&
                  this.idType.equals(other.getIdType())));
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
        _hashCode += getExemptCertDetailId();
        _hashCode += getExemptCertId();
        if (getStateFips() != null) {
            _hashCode += getStateFips().hashCode();
        }
        if (getRegion() != null) {
            _hashCode += getRegion().hashCode();
        }
        if (getIdNo() != null) {
            _hashCode += getIdNo().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getIdType() != null) {
            _hashCode += getIdType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExemptCertDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ExemptCertDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exemptCertDetailId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ExemptCertDetailId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exemptCertId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ExemptCertId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stateFips");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "StateFips"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("region");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Region"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "IdNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "EndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "IdType"));
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
