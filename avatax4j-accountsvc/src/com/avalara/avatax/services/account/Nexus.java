/**
 * Nexus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.account;

public class Nexus  implements java.io.Serializable {
    private int nexusId;
    private int companyId;
    private java.lang.String country;
    private java.lang.String state;
    private com.avalara.avatax.services.account.JurisTypeId jurisTypeId;
    private java.lang.String jurisCode;
    private java.lang.String jurisName;
    private java.lang.String shortName;
    private java.util.Date effDate;
    private java.util.Date endDate;
    private java.util.Calendar createdDate;
    private int createdUserId;
    private java.util.Calendar modifiedDate;
    private int modifiedUserId;
    private com.avalara.avatax.services.account.NexusTypeId nexusTypeId;
    private int accountingMethodId;
    private boolean hasLocalNexus;
    private java.lang.String sourcing;
    private com.avalara.avatax.services.account.LocalNexusTypeId localNexusTypeId;

    public Nexus() {
    }

    public Nexus(
           int nexusId,
           int companyId,
           java.lang.String country,
           java.lang.String state,
           com.avalara.avatax.services.account.JurisTypeId jurisTypeId,
           java.lang.String jurisCode,
           java.lang.String jurisName,
           java.lang.String shortName,
           java.util.Date effDate,
           java.util.Date endDate,
           java.util.Calendar createdDate,
           int createdUserId,
           java.util.Calendar modifiedDate,
           int modifiedUserId,
           com.avalara.avatax.services.account.NexusTypeId nexusTypeId,
           int accountingMethodId,
           boolean hasLocalNexus,
           java.lang.String sourcing,
           com.avalara.avatax.services.account.LocalNexusTypeId localNexusTypeId) {
           this.nexusId = nexusId;
           this.companyId = companyId;
           this.country = country;
           this.state = state;
           this.jurisTypeId = jurisTypeId;
           this.jurisCode = jurisCode;
           this.jurisName = jurisName;
           this.shortName = shortName;
           this.effDate = effDate;
           this.endDate = endDate;
           this.createdDate = createdDate;
           this.createdUserId = createdUserId;
           this.modifiedDate = modifiedDate;
           this.modifiedUserId = modifiedUserId;
           this.nexusTypeId = nexusTypeId;
           this.accountingMethodId = accountingMethodId;
           this.hasLocalNexus = hasLocalNexus;
           this.sourcing = sourcing;
           this.localNexusTypeId = localNexusTypeId;
    }


    /**
     * Gets the nexusId value for this Nexus.
     * 
     * @return nexusId
     */
    public int getNexusId() {
        return nexusId;
    }


    /**
     * Sets the nexusId value for this Nexus.
     * 
     * @param nexusId
     */
    public void setNexusId(int nexusId) {
        this.nexusId = nexusId;
    }


    /**
     * Gets the companyId value for this Nexus.
     * 
     * @return companyId
     */
    public int getCompanyId() {
        return companyId;
    }


    /**
     * Sets the companyId value for this Nexus.
     * 
     * @param companyId
     */
    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }


    /**
     * Gets the country value for this Nexus.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this Nexus.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the state value for this Nexus.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this Nexus.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the jurisTypeId value for this Nexus.
     * 
     * @return jurisTypeId
     */
    public com.avalara.avatax.services.account.JurisTypeId getJurisTypeId() {
        return jurisTypeId;
    }


    /**
     * Sets the jurisTypeId value for this Nexus.
     * 
     * @param jurisTypeId
     */
    public void setJurisTypeId(com.avalara.avatax.services.account.JurisTypeId jurisTypeId) {
        this.jurisTypeId = jurisTypeId;
    }


    /**
     * Gets the jurisCode value for this Nexus.
     * 
     * @return jurisCode
     */
    public java.lang.String getJurisCode() {
        return jurisCode;
    }


    /**
     * Sets the jurisCode value for this Nexus.
     * 
     * @param jurisCode
     */
    public void setJurisCode(java.lang.String jurisCode) {
        this.jurisCode = jurisCode;
    }


    /**
     * Gets the jurisName value for this Nexus.
     * 
     * @return jurisName
     */
    public java.lang.String getJurisName() {
        return jurisName;
    }


    /**
     * Sets the jurisName value for this Nexus.
     * 
     * @param jurisName
     */
    public void setJurisName(java.lang.String jurisName) {
        this.jurisName = jurisName;
    }


    /**
     * Gets the shortName value for this Nexus.
     * 
     * @return shortName
     */
    public java.lang.String getShortName() {
        return shortName;
    }


    /**
     * Sets the shortName value for this Nexus.
     * 
     * @param shortName
     */
    public void setShortName(java.lang.String shortName) {
        this.shortName = shortName;
    }


    /**
     * Gets the effDate value for this Nexus.
     * 
     * @return effDate
     */
    public java.util.Date getEffDate() {
        return effDate;
    }


    /**
     * Sets the effDate value for this Nexus.
     * 
     * @param effDate
     */
    public void setEffDate(java.util.Date effDate) {
        this.effDate = effDate;
    }


    /**
     * Gets the endDate value for this Nexus.
     * 
     * @return endDate
     */
    public java.util.Date getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this Nexus.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Date endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the createdDate value for this Nexus.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Nexus.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the createdUserId value for this Nexus.
     * 
     * @return createdUserId
     */
    public int getCreatedUserId() {
        return createdUserId;
    }


    /**
     * Sets the createdUserId value for this Nexus.
     * 
     * @param createdUserId
     */
    public void setCreatedUserId(int createdUserId) {
        this.createdUserId = createdUserId;
    }


    /**
     * Gets the modifiedDate value for this Nexus.
     * 
     * @return modifiedDate
     */
    public java.util.Calendar getModifiedDate() {
        return modifiedDate;
    }


    /**
     * Sets the modifiedDate value for this Nexus.
     * 
     * @param modifiedDate
     */
    public void setModifiedDate(java.util.Calendar modifiedDate) {
        this.modifiedDate = modifiedDate;
    }


    /**
     * Gets the modifiedUserId value for this Nexus.
     * 
     * @return modifiedUserId
     */
    public int getModifiedUserId() {
        return modifiedUserId;
    }


    /**
     * Sets the modifiedUserId value for this Nexus.
     * 
     * @param modifiedUserId
     */
    public void setModifiedUserId(int modifiedUserId) {
        this.modifiedUserId = modifiedUserId;
    }


    /**
     * Gets the nexusTypeId value for this Nexus.
     * 
     * @return nexusTypeId
     */
    public com.avalara.avatax.services.account.NexusTypeId getNexusTypeId() {
        return nexusTypeId;
    }


    /**
     * Sets the nexusTypeId value for this Nexus.
     * 
     * @param nexusTypeId
     */
    public void setNexusTypeId(com.avalara.avatax.services.account.NexusTypeId nexusTypeId) {
        this.nexusTypeId = nexusTypeId;
    }


    /**
     * Gets the accountingMethodId value for this Nexus.
     * 
     * @return accountingMethodId
     */
    public int getAccountingMethodId() {
        return accountingMethodId;
    }


    /**
     * Sets the accountingMethodId value for this Nexus.
     * 
     * @param accountingMethodId
     */
    public void setAccountingMethodId(int accountingMethodId) {
        this.accountingMethodId = accountingMethodId;
    }


    /**
     * Gets the hasLocalNexus value for this Nexus.
     * 
     * @return hasLocalNexus
     */
    public boolean isHasLocalNexus() {
        return hasLocalNexus;
    }


    /**
     * Sets the hasLocalNexus value for this Nexus.
     * 
     * @param hasLocalNexus
     */
    public void setHasLocalNexus(boolean hasLocalNexus) {
        this.hasLocalNexus = hasLocalNexus;
    }


    /**
     * Gets the sourcing value for this Nexus.
     * 
     * @return sourcing
     */
    public java.lang.String getSourcing() {
        return sourcing;
    }


    /**
     * Sets the sourcing value for this Nexus.
     * 
     * @param sourcing
     */
    public void setSourcing(java.lang.String sourcing) {
        this.sourcing = sourcing;
    }

    /**
     * Gets the localNexusTypeId value for this Nexus.
     *
     * @return localNexusTypeId
     */
    public com.avalara.avatax.services.account.LocalNexusTypeId getLocalNexusTypeId() {
        return localNexusTypeId;
    }


    /**
     * Sets the localNexusTypeId value for this Nexus.
     *
     * @param localNexusTypeId
     */
    public void setLocalNexusTypeId(com.avalara.avatax.services.account.LocalNexusTypeId localNexusTypeId) {
        this.localNexusTypeId = localNexusTypeId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Nexus)) return false;
        Nexus other = (Nexus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.nexusId == other.getNexusId() &&
            this.companyId == other.getCompanyId() &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.jurisTypeId==null && other.getJurisTypeId()==null) || 
             (this.jurisTypeId!=null &&
              this.jurisTypeId.equals(other.getJurisTypeId()))) &&
            ((this.jurisCode==null && other.getJurisCode()==null) || 
             (this.jurisCode!=null &&
              this.jurisCode.equals(other.getJurisCode()))) &&
            ((this.jurisName==null && other.getJurisName()==null) || 
             (this.jurisName!=null &&
              this.jurisName.equals(other.getJurisName()))) &&
            ((this.shortName==null && other.getShortName()==null) || 
             (this.shortName!=null &&
              this.shortName.equals(other.getShortName()))) &&
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
            this.modifiedUserId == other.getModifiedUserId() &&
            ((this.nexusTypeId==null && other.getNexusTypeId()==null) || 
             (this.nexusTypeId!=null &&
              this.nexusTypeId.equals(other.getNexusTypeId()))) &&
            this.accountingMethodId == other.getAccountingMethodId() &&
            this.hasLocalNexus == other.isHasLocalNexus() &&
            ((this.sourcing==null && other.getSourcing()==null) || 
             (this.sourcing!=null &&
              this.sourcing.equals(other.getSourcing())))&&
            ((this.localNexusTypeId==null && other.getLocalNexusTypeId()==null) ||
             (this.localNexusTypeId!=null &&
              this.localNexusTypeId.equals(other.getLocalNexusTypeId())));
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
        _hashCode += getNexusId();
        _hashCode += getCompanyId();
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getJurisTypeId() != null) {
            _hashCode += getJurisTypeId().hashCode();
        }
        if (getJurisCode() != null) {
            _hashCode += getJurisCode().hashCode();
        }
        if (getJurisName() != null) {
            _hashCode += getJurisName().hashCode();
        }
        if (getShortName() != null) {
            _hashCode += getShortName().hashCode();
        }
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
        if (getNexusTypeId() != null) {
            _hashCode += getNexusTypeId().hashCode();
        }
        _hashCode += getAccountingMethodId();
        _hashCode += (isHasLocalNexus() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getSourcing() != null) {
            _hashCode += getSourcing().hashCode();
        }
         if (getLocalNexusTypeId() != null) {
            _hashCode += getLocalNexusTypeId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Nexus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Nexus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nexusId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "NexusId"));
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
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "State"));
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
        elemField.setFieldName("shortName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ShortName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("nexusTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "NexusTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "NexusTypeId"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountingMethodId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "AccountingMethodId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasLocalNexus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "HasLocalNexus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourcing");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Sourcing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localNexusTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "LocalNexusTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "LocalNexusTypeId"));
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
