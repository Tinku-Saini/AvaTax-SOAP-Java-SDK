/**
 * Jurisdiction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.account;

public class Jurisdiction  implements java.io.Serializable {
    private java.lang.String jurisCode;
    private java.lang.String jurisName;
    private com.avalara.avatax.services.account.JurisTypeId jurisTypeId;
    private java.math.BigDecimal rate;
    private java.math.BigDecimal salesRate;
    private java.lang.String signatureCode;
    private java.lang.String stateCode;
    private java.math.BigDecimal useRate;

    public Jurisdiction() {
    }

    public Jurisdiction(
           java.lang.String jurisCode,
           java.lang.String jurisName,
           com.avalara.avatax.services.account.JurisTypeId jurisTypeId,
           java.math.BigDecimal rate,
           java.math.BigDecimal salesRate,
           java.lang.String signatureCode,
           java.lang.String stateCode,
           java.math.BigDecimal useRate) {
           this.jurisCode = jurisCode;
           this.jurisName = jurisName;
           this.jurisTypeId = jurisTypeId;
           this.rate = rate;
           this.salesRate = salesRate;
           this.signatureCode = signatureCode;
           this.stateCode = stateCode;
           this.useRate = useRate;
    }


    /**
     * Gets the jurisCode value for this Jurisdiction.
     * 
     * @return jurisCode
     */
    public java.lang.String getJurisCode() {
        return jurisCode;
    }


    /**
     * Sets the jurisCode value for this Jurisdiction.
     * 
     * @param jurisCode
     */
    public void setJurisCode(java.lang.String jurisCode) {
        this.jurisCode = jurisCode;
    }


    /**
     * Gets the jurisName value for this Jurisdiction.
     * 
     * @return jurisName
     */
    public java.lang.String getJurisName() {
        return jurisName;
    }


    /**
     * Sets the jurisName value for this Jurisdiction.
     * 
     * @param jurisName
     */
    public void setJurisName(java.lang.String jurisName) {
        this.jurisName = jurisName;
    }


    /**
     * Gets the jurisTypeId value for this Jurisdiction.
     * 
     * @return jurisTypeId
     */
    public com.avalara.avatax.services.account.JurisTypeId getJurisTypeId() {
        return jurisTypeId;
    }


    /**
     * Sets the jurisTypeId value for this Jurisdiction.
     * 
     * @param jurisTypeId
     */
    public void setJurisTypeId(com.avalara.avatax.services.account.JurisTypeId jurisTypeId) {
        this.jurisTypeId = jurisTypeId;
    }


    /**
     * Gets the rate value for this Jurisdiction.
     * 
     * @return rate
     */
    public java.math.BigDecimal getRate() {
        return rate;
    }


    /**
     * Sets the rate value for this Jurisdiction.
     * 
     * @param rate
     */
    public void setRate(java.math.BigDecimal rate) {
        this.rate = rate;
    }


    /**
     * Gets the salesRate value for this Jurisdiction.
     * 
     * @return salesRate
     */
    public java.math.BigDecimal getSalesRate() {
        return salesRate;
    }


    /**
     * Sets the salesRate value for this Jurisdiction.
     * 
     * @param salesRate
     */
    public void setSalesRate(java.math.BigDecimal salesRate) {
        this.salesRate = salesRate;
    }


    /**
     * Gets the signatureCode value for this Jurisdiction.
     * 
     * @return signatureCode
     */
    public java.lang.String getSignatureCode() {
        return signatureCode;
    }


    /**
     * Sets the signatureCode value for this Jurisdiction.
     * 
     * @param signatureCode
     */
    public void setSignatureCode(java.lang.String signatureCode) {
        this.signatureCode = signatureCode;
    }


    /**
     * Gets the stateCode value for this Jurisdiction.
     * 
     * @return stateCode
     */
    public java.lang.String getStateCode() {
        return stateCode;
    }


    /**
     * Sets the stateCode value for this Jurisdiction.
     * 
     * @param stateCode
     */
    public void setStateCode(java.lang.String stateCode) {
        this.stateCode = stateCode;
    }


    /**
     * Gets the useRate value for this Jurisdiction.
     * 
     * @return useRate
     */
    public java.math.BigDecimal getUseRate() {
        return useRate;
    }


    /**
     * Sets the useRate value for this Jurisdiction.
     * 
     * @param useRate
     */
    public void setUseRate(java.math.BigDecimal useRate) {
        this.useRate = useRate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Jurisdiction)) return false;
        Jurisdiction other = (Jurisdiction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.jurisCode==null && other.getJurisCode()==null) || 
             (this.jurisCode!=null &&
              this.jurisCode.equals(other.getJurisCode()))) &&
            ((this.jurisName==null && other.getJurisName()==null) || 
             (this.jurisName!=null &&
              this.jurisName.equals(other.getJurisName()))) &&
            ((this.jurisTypeId==null && other.getJurisTypeId()==null) || 
             (this.jurisTypeId!=null &&
              this.jurisTypeId.equals(other.getJurisTypeId()))) &&
            ((this.rate==null && other.getRate()==null) || 
             (this.rate!=null &&
              this.rate.equals(other.getRate()))) &&
            ((this.salesRate==null && other.getSalesRate()==null) || 
             (this.salesRate!=null &&
              this.salesRate.equals(other.getSalesRate()))) &&
            ((this.signatureCode==null && other.getSignatureCode()==null) || 
             (this.signatureCode!=null &&
              this.signatureCode.equals(other.getSignatureCode()))) &&
            ((this.stateCode==null && other.getStateCode()==null) || 
             (this.stateCode!=null &&
              this.stateCode.equals(other.getStateCode()))) &&
            ((this.useRate==null && other.getUseRate()==null) || 
             (this.useRate!=null &&
              this.useRate.equals(other.getUseRate())));
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
        if (getJurisCode() != null) {
            _hashCode += getJurisCode().hashCode();
        }
        if (getJurisName() != null) {
            _hashCode += getJurisName().hashCode();
        }
        if (getJurisTypeId() != null) {
            _hashCode += getJurisTypeId().hashCode();
        }
        if (getRate() != null) {
            _hashCode += getRate().hashCode();
        }
        if (getSalesRate() != null) {
            _hashCode += getSalesRate().hashCode();
        }
        if (getSignatureCode() != null) {
            _hashCode += getSignatureCode().hashCode();
        }
        if (getStateCode() != null) {
            _hashCode += getStateCode().hashCode();
        }
        if (getUseRate() != null) {
            _hashCode += getUseRate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Jurisdiction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Jurisdiction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jurisCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "JurisCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jurisName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "JurisName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jurisTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "JurisTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "JurisTypeId"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Rate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesRate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "SalesRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signatureCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "SignatureCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stateCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "StateCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useRate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "UseRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
