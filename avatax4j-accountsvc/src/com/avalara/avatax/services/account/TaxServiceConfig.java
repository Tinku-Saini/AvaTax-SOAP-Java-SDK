/**
 * TaxServiceConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.account;

public class TaxServiceConfig  implements java.io.Serializable {
    private boolean requireMappedItemCode;
    private boolean requireOriginAddress;
    private java.util.Calendar createdDate;
    private int createdUserId;
    private java.util.Calendar modifiedDate;
    private int modifiedUserId;
    private boolean ecmsEnabled;
    private com.avalara.avatax.services.account.EcmsCertUseId ecmsCertUseUs;
    private boolean ecmsCompleteCertsRequired;
    private java.lang.String ecmsOverrideCode;
    private boolean ecmsSstCertsRequired;
    private int maxLines;
    private com.avalara.avatax.services.account.EcmsCertUseId ecmsCertUseCa;

    public TaxServiceConfig() {
    }

    public TaxServiceConfig(
           boolean requireMappedItemCode,
           boolean requireOriginAddress,
           java.util.Calendar createdDate,
           int createdUserId,
           java.util.Calendar modifiedDate,
           int modifiedUserId,
           boolean ecmsEnabled,
           com.avalara.avatax.services.account.EcmsCertUseId ecmsCertUseUs,
           com.avalara.avatax.services.account.EcmsCertUseId ecmsCertUseCa,
           boolean ecmsCompleteCertsRequired,
           java.lang.String ecmsOverrideCode,
           boolean ecmsSstCertsRequired,
           int maxLines) {
           this.requireMappedItemCode = requireMappedItemCode;
           this.requireOriginAddress = requireOriginAddress;
           this.createdDate = createdDate;
           this.createdUserId = createdUserId;
           this.modifiedDate = modifiedDate;
           this.modifiedUserId = modifiedUserId;
           this.ecmsEnabled = ecmsEnabled;
           this.ecmsCertUseUs = ecmsCertUseUs;
            this.ecmsCertUseCa=ecmsCertUseCa;
           this.ecmsCompleteCertsRequired = ecmsCompleteCertsRequired;
           this.ecmsOverrideCode = ecmsOverrideCode;
           this.ecmsSstCertsRequired = ecmsSstCertsRequired;
           this.maxLines = maxLines;
    }


    /**
     * Gets the requireMappedItemCode value for this TaxServiceConfig.
     * 
     * @return requireMappedItemCode
     */
    public boolean isRequireMappedItemCode() {
        return requireMappedItemCode;
    }


    /**
     * Sets the requireMappedItemCode value for this TaxServiceConfig.
     * 
     * @param requireMappedItemCode
     */
    public void setRequireMappedItemCode(boolean requireMappedItemCode) {
        this.requireMappedItemCode = requireMappedItemCode;
    }


    /**
     * Gets the requireOriginAddress value for this TaxServiceConfig.
     * 
     * @return requireOriginAddress
     */
    public boolean isRequireOriginAddress() {
        return requireOriginAddress;
    }


    /**
     * Sets the requireOriginAddress value for this TaxServiceConfig.
     * 
     * @param requireOriginAddress
     */
    public void setRequireOriginAddress(boolean requireOriginAddress) {
        this.requireOriginAddress = requireOriginAddress;
    }


    /**
     * Gets the createdDate value for this TaxServiceConfig.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this TaxServiceConfig.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the createdUserId value for this TaxServiceConfig.
     * 
     * @return createdUserId
     */
    public int getCreatedUserId() {
        return createdUserId;
    }


    /**
     * Sets the createdUserId value for this TaxServiceConfig.
     * 
     * @param createdUserId
     */
    public void setCreatedUserId(int createdUserId) {
        this.createdUserId = createdUserId;
    }


    /**
     * Gets the modifiedDate value for this TaxServiceConfig.
     * 
     * @return modifiedDate
     */
    public java.util.Calendar getModifiedDate() {
        return modifiedDate;
    }


    /**
     * Sets the modifiedDate value for this TaxServiceConfig.
     * 
     * @param modifiedDate
     */
    public void setModifiedDate(java.util.Calendar modifiedDate) {
        this.modifiedDate = modifiedDate;
    }


    /**
     * Gets the modifiedUserId value for this TaxServiceConfig.
     * 
     * @return modifiedUserId
     */
    public int getModifiedUserId() {
        return modifiedUserId;
    }


    /**
     * Sets the modifiedUserId value for this TaxServiceConfig.
     * 
     * @param modifiedUserId
     */
    public void setModifiedUserId(int modifiedUserId) {
        this.modifiedUserId = modifiedUserId;
    }


    /**
     * Gets the ecmsEnabled value for this TaxServiceConfig.
     * 
     * @return ecmsEnabled
     */
    public boolean isEcmsEnabled() {
        return ecmsEnabled;
    }


    /**
     * Sets the ecmsEnabled value for this TaxServiceConfig.
     * 
     * @param ecmsEnabled
     */
    public void setEcmsEnabled(boolean ecmsEnabled) {
        this.ecmsEnabled = ecmsEnabled;
    }


    /**
     * Gets the ecmsCertUse value for this TaxServiceConfig.
     * 
     * @return ecmsCertUse
     */
    public com.avalara.avatax.services.account.EcmsCertUseId getEcmsCertUseUs() {
        return ecmsCertUseUs;
    }


    /**
     * Sets the ecmsCertUse value for this TaxServiceConfig.
     * 
     * @param ecmsCertUseUs
     */
    public void setEcmsCertUseUs(com.avalara.avatax.services.account.EcmsCertUseId ecmsCertUseUs) {
        this.ecmsCertUseUs = ecmsCertUseUs;
    }

    /**
     * Gets the ecmsCertUseCa value for this TaxServiceConfig.
     *
     * @return ecmsCertUseCa
     */
    public com.avalara.avatax.services.account.EcmsCertUseId getEcmsCertUseCa() {
        return ecmsCertUseCa;
    }


    /**
     * Sets the ecmsCertUseCa value for this TaxServiceConfig.
     *
     * @param ecmsCertUseCa
     */
    public void setEcmsCertUseCa(com.avalara.avatax.services.account.EcmsCertUseId ecmsCertUseCa) {
        this.ecmsCertUseCa = ecmsCertUseCa;
    }


    /**
     * Gets the ecmsCompleteCertsRequired value for this TaxServiceConfig.
     * 
     * @return ecmsCompleteCertsRequired
     */
    public boolean isEcmsCompleteCertsRequired() {
        return ecmsCompleteCertsRequired;
    }


    /**
     * Sets the ecmsCompleteCertsRequired value for this TaxServiceConfig.
     * 
     * @param ecmsCompleteCertsRequired
     */
    public void setEcmsCompleteCertsRequired(boolean ecmsCompleteCertsRequired) {
        this.ecmsCompleteCertsRequired = ecmsCompleteCertsRequired;
    }


    /**
     * Gets the ecmsOverrideCode value for this TaxServiceConfig.
     * 
     * @return ecmsOverrideCode
     */
    public java.lang.String getEcmsOverrideCode() {
        return ecmsOverrideCode;
    }


    /**
     * Sets the ecmsOverrideCode value for this TaxServiceConfig.
     * 
     * @param ecmsOverrideCode
     */
    public void setEcmsOverrideCode(java.lang.String ecmsOverrideCode) {
        this.ecmsOverrideCode = ecmsOverrideCode;
    }


    /**
     * Gets the ecmsSstCertsRequired value for this TaxServiceConfig.
     * 
     * @return ecmsSstCertsRequired
     */
    public boolean isEcmsSstCertsRequired() {
        return ecmsSstCertsRequired;
    }


    /**
     * Sets the ecmsSstCertsRequired value for this TaxServiceConfig.
     * 
     * @param ecmsSstCertsRequired
     */
    public void setEcmsSstCertsRequired(boolean ecmsSstCertsRequired) {
        this.ecmsSstCertsRequired = ecmsSstCertsRequired;
    }


    /**
     * Gets the maxLines value for this TaxServiceConfig.
     * 
     * @return maxLines
     */
    public int getMaxLines() {
        return maxLines;
    }


    /**
     * Sets the maxLines value for this TaxServiceConfig.
     * 
     * @param maxLines
     */
    public void setMaxLines(int maxLines) {
        this.maxLines = maxLines;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TaxServiceConfig)) return false;
        TaxServiceConfig other = (TaxServiceConfig) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.requireMappedItemCode == other.isRequireMappedItemCode() &&
            this.requireOriginAddress == other.isRequireOriginAddress() &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            this.createdUserId == other.getCreatedUserId() &&
            ((this.modifiedDate==null && other.getModifiedDate()==null) || 
             (this.modifiedDate!=null &&
              this.modifiedDate.equals(other.getModifiedDate()))) &&
            this.modifiedUserId == other.getModifiedUserId() &&
            this.ecmsEnabled == other.isEcmsEnabled() &&
            ((this.ecmsCertUseUs==null && other.getEcmsCertUseUs()==null) ||
             (this.ecmsCertUseUs!=null &&
              this.ecmsCertUseUs.equals(other.getEcmsCertUseUs()))) &&
            ((this.ecmsCertUseCa==null && other.getEcmsCertUseCa()==null) ||
             (this.ecmsCertUseCa!=null &&
              this.ecmsCertUseCa.equals(other.getEcmsCertUseCa()))) &&
            this.ecmsCompleteCertsRequired == other.isEcmsCompleteCertsRequired() &&
            ((this.ecmsOverrideCode==null && other.getEcmsOverrideCode()==null) || 
             (this.ecmsOverrideCode!=null &&
              this.ecmsOverrideCode.equals(other.getEcmsOverrideCode()))) &&
            this.ecmsSstCertsRequired == other.isEcmsSstCertsRequired() &&
            this.maxLines == other.getMaxLines();
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
        _hashCode += (isRequireMappedItemCode() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isRequireOriginAddress() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        _hashCode += getCreatedUserId();
        if (getModifiedDate() != null) {
            _hashCode += getModifiedDate().hashCode();
        }
        _hashCode += getModifiedUserId();
        _hashCode += (isEcmsEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getEcmsCertUseUs() != null) {
            _hashCode += getEcmsCertUseUs().hashCode();
        }
        if (getEcmsCertUseCa() != null) {
            _hashCode += getEcmsCertUseCa().hashCode();
        }
        _hashCode += (isEcmsCompleteCertsRequired() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getEcmsOverrideCode() != null) {
            _hashCode += getEcmsOverrideCode().hashCode();
        }
        _hashCode += (isEcmsSstCertsRequired() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getMaxLines();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TaxServiceConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "TaxServiceConfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requireMappedItemCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "RequireMappedItemCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requireOriginAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "RequireOriginAddress"));
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
        elemField.setFieldName("ecmsEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "EcmsEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ecmsCertUseUs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "EcmsCertUseUs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "EcmsCertUseId"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ecmsCertUseCa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "EcmsCertUseCa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "EcmsCertUseId"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ecmsCompleteCertsRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "EcmsCompleteCertsRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ecmsOverrideCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "EcmsOverrideCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ecmsSstCertsRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "EcmsSstCertsRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxLines");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "MaxLines"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
