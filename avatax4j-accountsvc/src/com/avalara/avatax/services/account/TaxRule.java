/**
 * TaxRule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.account;

public class TaxRule  implements java.io.Serializable {
    private int taxRuleId;
    private int companyId;
    private java.lang.String state;
    private java.lang.String stateCode;
    private java.lang.String countyCode;
    private com.avalara.avatax.services.account.JurisTypeId jurisTypeId;
    private java.lang.String jurisCode;
    private java.lang.String jurisName;
    private int taxCodeId;
    private java.lang.String customerUsageType;
    private com.avalara.avatax.services.account.TaxTypeId taxTypeId;
    private com.avalara.avatax.services.account.TaxRuleTypeId taxRuleTypeId;
    private boolean isAllJuris;
    private java.math.BigDecimal value;
    private java.math.BigDecimal cap;
    private java.math.BigDecimal threshold;
    private java.lang.String options;
    private java.util.Date effDate;
    private java.util.Date endDate;
    private java.lang.String description;
    private java.util.Calendar createdDate;
    private int createdUserId;
    private java.util.Calendar modifiedDate;
    private int modifiedUserId;
    private boolean isStPro;
    private java.lang.String rateTypeId;
    private com.avalara.avatax.services.account.Company company;
    private com.avalara.avatax.services.account.TaxCode taxCode;
    private java.lang.String country;
    private java.lang.String sourcing;

    public TaxRule() {
    }

    public TaxRule(
           int taxRuleId,
           int companyId,
           java.lang.String state,
           java.lang.String stateCode,
           java.lang.String countyCode,
           com.avalara.avatax.services.account.JurisTypeId jurisTypeId,
           java.lang.String jurisCode,
           java.lang.String jurisName,
           int taxCodeId,
           java.lang.String customerUsageType,
           com.avalara.avatax.services.account.TaxTypeId taxTypeId,
           com.avalara.avatax.services.account.TaxRuleTypeId taxRuleTypeId,
           boolean isAllJuris,
           java.math.BigDecimal value,
           java.math.BigDecimal cap,
           java.math.BigDecimal threshold,
           java.lang.String options,
           java.util.Date effDate,
           java.util.Date endDate,
           java.lang.String description,
           java.util.Calendar createdDate,
           int createdUserId,
           java.util.Calendar modifiedDate,
           int modifiedUserId,
           boolean isStPro,
           java.lang.String rateTypeId,
           com.avalara.avatax.services.account.Company company,
           com.avalara.avatax.services.account.TaxCode taxCode,
           java.lang.String country,
           java.lang.String sourcing) {
           this.taxRuleId = taxRuleId;
           this.companyId = companyId;
           this.state = state;
           this.stateCode = stateCode;
           this.countyCode = countyCode;
           this.jurisTypeId = jurisTypeId;
           this.jurisCode = jurisCode;
           this.jurisName = jurisName;
           this.taxCodeId = taxCodeId;
           this.customerUsageType = customerUsageType;
           this.taxTypeId = taxTypeId;
           this.taxRuleTypeId = taxRuleTypeId;
           this.isAllJuris = isAllJuris;
           this.value = value;
           this.cap = cap;
           this.threshold = threshold;
           this.options = options;
           this.effDate = effDate;
           this.endDate = endDate;
           this.description = description;
           this.createdDate = createdDate;
           this.createdUserId = createdUserId;
           this.modifiedDate = modifiedDate;
           this.modifiedUserId = modifiedUserId;
           this.isStPro = isStPro;
           this.rateTypeId = rateTypeId;
           this.company = company;
           this.taxCode = taxCode;
           this.country = country;
           this.sourcing = sourcing;
    }


    /**
     * Gets the taxRuleId value for this TaxRule.
     * 
     * @return taxRuleId
     */
    public int getTaxRuleId() {
        return taxRuleId;
    }


    /**
     * Sets the taxRuleId value for this TaxRule.
     * 
     * @param taxRuleId
     */
    public void setTaxRuleId(int taxRuleId) {
        this.taxRuleId = taxRuleId;
    }


    /**
     * Gets the companyId value for this TaxRule.
     * 
     * @return companyId
     */
    public int getCompanyId() {
        return companyId;
    }


    /**
     * Sets the companyId value for this TaxRule.
     * 
     * @param companyId
     */
    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }


    /**
     * Gets the state value for this TaxRule.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this TaxRule.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the stateCode value for this TaxRule.
     * 
     * @return stateCode
     */
    public java.lang.String getStateCode() {
        return stateCode;
    }


    /**
     * Sets the stateCode value for this TaxRule.
     * 
     * @param stateCode
     */
    public void setStateCode(java.lang.String stateCode) {
        this.stateCode = stateCode;
    }


    /**
     * Gets the countyCode value for this TaxRule.
     * 
     * @return countyCode
     */
    public java.lang.String getCountyCode() {
        return countyCode;
    }


    /**
     * Sets the countyCode value for this TaxRule.
     * 
     * @param countyCode
     */
    public void setCountyCode(java.lang.String countyCode) {
        this.countyCode = countyCode;
    }


    /**
     * Gets the jurisTypeId value for this TaxRule.
     * 
     * @return jurisTypeId
     */
    public com.avalara.avatax.services.account.JurisTypeId getJurisTypeId() {
        return jurisTypeId;
    }


    /**
     * Sets the jurisTypeId value for this TaxRule.
     * 
     * @param jurisTypeId
     */
    public void setJurisTypeId(com.avalara.avatax.services.account.JurisTypeId jurisTypeId) {
        this.jurisTypeId = jurisTypeId;
    }


    /**
     * Gets the jurisCode value for this TaxRule.
     * 
     * @return jurisCode
     */
    public java.lang.String getJurisCode() {
        return jurisCode;
    }


    /**
     * Sets the jurisCode value for this TaxRule.
     * 
     * @param jurisCode
     */
    public void setJurisCode(java.lang.String jurisCode) {
        this.jurisCode = jurisCode;
    }


    /**
     * Gets the jurisName value for this TaxRule.
     * 
     * @return jurisName
     */
    public java.lang.String getJurisName() {
        return jurisName;
    }


    /**
     * Sets the jurisName value for this TaxRule.
     * 
     * @param jurisName
     */
    public void setJurisName(java.lang.String jurisName) {
        this.jurisName = jurisName;
    }


    /**
     * Gets the taxCodeId value for this TaxRule.
     * 
     * @return taxCodeId
     */
    public int getTaxCodeId() {
        return taxCodeId;
    }


    /**
     * Sets the taxCodeId value for this TaxRule.
     * 
     * @param taxCodeId
     */
    public void setTaxCodeId(int taxCodeId) {
        this.taxCodeId = taxCodeId;
    }


    /**
     * Gets the customerUsageType value for this TaxRule.
     * 
     * @return customerUsageType
     */
    public java.lang.String getCustomerUsageType() {
        return customerUsageType;
    }


    /**
     * Sets the customerUsageType value for this TaxRule.
     * 
     * @param customerUsageType
     */
    public void setCustomerUsageType(java.lang.String customerUsageType) {
        this.customerUsageType = customerUsageType;
    }


    /**
     * Gets the taxTypeId value for this TaxRule.
     * 
     * @return taxTypeId
     */
    public com.avalara.avatax.services.account.TaxTypeId getTaxTypeId() {
        return taxTypeId;
    }


    /**
     * Sets the taxTypeId value for this TaxRule.
     * 
     * @param taxTypeId
     */
    public void setTaxTypeId(com.avalara.avatax.services.account.TaxTypeId taxTypeId) {
        this.taxTypeId = taxTypeId;
    }


    /**
     * Gets the taxRuleTypeId value for this TaxRule.
     * 
     * @return taxRuleTypeId
     */
    public com.avalara.avatax.services.account.TaxRuleTypeId getTaxRuleTypeId() {
        return taxRuleTypeId;
    }


    /**
     * Sets the taxRuleTypeId value for this TaxRule.
     * 
     * @param taxRuleTypeId
     */
    public void setTaxRuleTypeId(com.avalara.avatax.services.account.TaxRuleTypeId taxRuleTypeId) {
        this.taxRuleTypeId = taxRuleTypeId;
    }


    /**
     * Gets the isAllJuris value for this TaxRule.
     * 
     * @return isAllJuris
     */
    public boolean isIsAllJuris() {
        return isAllJuris;
    }


    /**
     * Sets the isAllJuris value for this TaxRule.
     * 
     * @param isAllJuris
     */
    public void setIsAllJuris(boolean isAllJuris) {
        this.isAllJuris = isAllJuris;
    }


    /**
     * Gets the value value for this TaxRule.
     * 
     * @return value
     */
    public java.math.BigDecimal getValue() {
        return value;
    }


    /**
     * Sets the value value for this TaxRule.
     * 
     * @param value
     */
    public void setValue(java.math.BigDecimal value) {
        this.value = value;
    }


    /**
     * Gets the cap value for this TaxRule.
     * 
     * @return cap
     */
    public java.math.BigDecimal getCap() {
        return cap;
    }


    /**
     * Sets the cap value for this TaxRule.
     * 
     * @param cap
     */
    public void setCap(java.math.BigDecimal cap) {
        this.cap = cap;
    }


    /**
     * Gets the threshold value for this TaxRule.
     * 
     * @return threshold
     */
    public java.math.BigDecimal getThreshold() {
        return threshold;
    }


    /**
     * Sets the threshold value for this TaxRule.
     * 
     * @param threshold
     */
    public void setThreshold(java.math.BigDecimal threshold) {
        this.threshold = threshold;
    }


    /**
     * Gets the options value for this TaxRule.
     * 
     * @return options
     */
    public java.lang.String getOptions() {
        return options;
    }


    /**
     * Sets the options value for this TaxRule.
     * 
     * @param options
     */
    public void setOptions(java.lang.String options) {
        this.options = options;
    }


    /**
     * Gets the effDate value for this TaxRule.
     * 
     * @return effDate
     */
    public java.util.Date getEffDate() {
        return effDate;
    }


    /**
     * Sets the effDate value for this TaxRule.
     * 
     * @param effDate
     */
    public void setEffDate(java.util.Date effDate) {
        this.effDate = effDate;
    }


    /**
     * Gets the endDate value for this TaxRule.
     * 
     * @return endDate
     */
    public java.util.Date getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this TaxRule.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Date endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the description value for this TaxRule.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this TaxRule.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the createdDate value for this TaxRule.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this TaxRule.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the createdUserId value for this TaxRule.
     * 
     * @return createdUserId
     */
    public int getCreatedUserId() {
        return createdUserId;
    }


    /**
     * Sets the createdUserId value for this TaxRule.
     * 
     * @param createdUserId
     */
    public void setCreatedUserId(int createdUserId) {
        this.createdUserId = createdUserId;
    }


    /**
     * Gets the modifiedDate value for this TaxRule.
     * 
     * @return modifiedDate
     */
    public java.util.Calendar getModifiedDate() {
        return modifiedDate;
    }


    /**
     * Sets the modifiedDate value for this TaxRule.
     * 
     * @param modifiedDate
     */
    public void setModifiedDate(java.util.Calendar modifiedDate) {
        this.modifiedDate = modifiedDate;
    }


    /**
     * Gets the modifiedUserId value for this TaxRule.
     * 
     * @return modifiedUserId
     */
    public int getModifiedUserId() {
        return modifiedUserId;
    }


    /**
     * Sets the modifiedUserId value for this TaxRule.
     * 
     * @param modifiedUserId
     */
    public void setModifiedUserId(int modifiedUserId) {
        this.modifiedUserId = modifiedUserId;
    }


    /**
     * Gets the isStPro value for this TaxRule.
     * 
     * @return isStPro
     */
    public boolean isIsStPro() {
        return isStPro;
    }


    /**
     * Sets the isStPro value for this TaxRule.
     * 
     * @param isStPro
     */
    public void setIsStPro(boolean isStPro) {
        this.isStPro = isStPro;
    }


    /**
     * Gets the rateTypeId value for this TaxRule.
     * 
     * @return rateTypeId
     */
    public java.lang.String getRateTypeId() {
        return rateTypeId;
    }


    /**
     * Sets the rateTypeId value for this TaxRule.
     * 
     * @param rateTypeId
     */
    public void setRateTypeId(java.lang.String rateTypeId) {
        this.rateTypeId = rateTypeId;
    }


    /**
     * Gets the company value for this TaxRule.
     * 
     * @return company
     */
    public com.avalara.avatax.services.account.Company getCompany() {
        return company;
    }


    /**
     * Sets the company value for this TaxRule.
     * 
     * @param company
     */
    public void setCompany(com.avalara.avatax.services.account.Company company) {
        this.company = company;
    }


    /**
     * Gets the taxCode value for this TaxRule.
     * 
     * @return taxCode
     */
    public com.avalara.avatax.services.account.TaxCode getTaxCode() {
        return taxCode;
    }


    /**
     * Sets the taxCode value for this TaxRule.
     * 
     * @param taxCode
     */
    public void setTaxCode(com.avalara.avatax.services.account.TaxCode taxCode) {
        this.taxCode = taxCode;
    }


    /**
     * Gets the country value for this TaxRule.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this TaxRule.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the sourcing value for this TaxRule.
     * 
     * @return sourcing
     */
    public java.lang.String getSourcing() {
        return sourcing;
    }


    /**
     * Sets the sourcing value for this TaxRule.
     * 
     * @param sourcing
     */
    public void setSourcing(java.lang.String sourcing) {
        this.sourcing = sourcing;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TaxRule)) return false;
        TaxRule other = (TaxRule) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.taxRuleId == other.getTaxRuleId() &&
            this.companyId == other.getCompanyId() &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.stateCode==null && other.getStateCode()==null) || 
             (this.stateCode!=null &&
              this.stateCode.equals(other.getStateCode()))) &&
            ((this.countyCode==null && other.getCountyCode()==null) || 
             (this.countyCode!=null &&
              this.countyCode.equals(other.getCountyCode()))) &&
            ((this.jurisTypeId==null && other.getJurisTypeId()==null) || 
             (this.jurisTypeId!=null &&
              this.jurisTypeId.equals(other.getJurisTypeId()))) &&
            ((this.jurisCode==null && other.getJurisCode()==null) || 
             (this.jurisCode!=null &&
              this.jurisCode.equals(other.getJurisCode()))) &&
            ((this.jurisName==null && other.getJurisName()==null) || 
             (this.jurisName!=null &&
              this.jurisName.equals(other.getJurisName()))) &&
            this.taxCodeId == other.getTaxCodeId() &&
            ((this.customerUsageType==null && other.getCustomerUsageType()==null) || 
             (this.customerUsageType!=null &&
              this.customerUsageType.equals(other.getCustomerUsageType()))) &&
            ((this.taxTypeId==null && other.getTaxTypeId()==null) || 
             (this.taxTypeId!=null &&
              this.taxTypeId.equals(other.getTaxTypeId()))) &&
            ((this.taxRuleTypeId==null && other.getTaxRuleTypeId()==null) || 
             (this.taxRuleTypeId!=null &&
              this.taxRuleTypeId.equals(other.getTaxRuleTypeId()))) &&
            this.isAllJuris == other.isIsAllJuris() &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue()))) &&
            ((this.cap==null && other.getCap()==null) || 
             (this.cap!=null &&
              this.cap.equals(other.getCap()))) &&
            ((this.threshold==null && other.getThreshold()==null) || 
             (this.threshold!=null &&
              this.threshold.equals(other.getThreshold()))) &&
            ((this.options==null && other.getOptions()==null) || 
             (this.options!=null &&
              this.options.equals(other.getOptions()))) &&
            ((this.effDate==null && other.getEffDate()==null) || 
             (this.effDate!=null &&
              this.effDate.equals(other.getEffDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            this.createdUserId == other.getCreatedUserId() &&
            ((this.modifiedDate==null && other.getModifiedDate()==null) || 
             (this.modifiedDate!=null &&
              this.modifiedDate.equals(other.getModifiedDate()))) &&
            this.modifiedUserId == other.getModifiedUserId() &&
            this.isStPro == other.isIsStPro() &&
            ((this.rateTypeId==null && other.getRateTypeId()==null) || 
             (this.rateTypeId!=null &&
              this.rateTypeId.equals(other.getRateTypeId()))) &&
            ((this.company==null && other.getCompany()==null) || 
             (this.company!=null &&
              this.company.equals(other.getCompany()))) &&
            ((this.taxCode==null && other.getTaxCode()==null) || 
             (this.taxCode!=null &&
              this.taxCode.equals(other.getTaxCode()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.sourcing==null && other.getSourcing()==null) || 
             (this.sourcing!=null &&
              this.sourcing.equals(other.getSourcing())));
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
        _hashCode += getTaxRuleId();
        _hashCode += getCompanyId();
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getStateCode() != null) {
            _hashCode += getStateCode().hashCode();
        }
        if (getCountyCode() != null) {
            _hashCode += getCountyCode().hashCode();
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
        _hashCode += getTaxCodeId();
        if (getCustomerUsageType() != null) {
            _hashCode += getCustomerUsageType().hashCode();
        }
        if (getTaxTypeId() != null) {
            _hashCode += getTaxTypeId().hashCode();
        }
        if (getTaxRuleTypeId() != null) {
            _hashCode += getTaxRuleTypeId().hashCode();
        }
        _hashCode += (isIsAllJuris() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        if (getCap() != null) {
            _hashCode += getCap().hashCode();
        }
        if (getThreshold() != null) {
            _hashCode += getThreshold().hashCode();
        }
        if (getOptions() != null) {
            _hashCode += getOptions().hashCode();
        }
        if (getEffDate() != null) {
            _hashCode += getEffDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        _hashCode += getCreatedUserId();
        if (getModifiedDate() != null) {
            _hashCode += getModifiedDate().hashCode();
        }
        _hashCode += getModifiedUserId();
        _hashCode += (isIsStPro() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getRateTypeId() != null) {
            _hashCode += getRateTypeId().hashCode();
        }
        if (getCompany() != null) {
            _hashCode += getCompany().hashCode();
        }
        if (getTaxCode() != null) {
            _hashCode += getTaxCode().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getSourcing() != null) {
            _hashCode += getSourcing().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TaxRule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "TaxRule"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxRuleId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "TaxRuleId"));
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
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "State"));
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
        elemField.setFieldName("countyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CountyCode"));
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
        elemField.setFieldName("taxCodeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "TaxCodeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerUsageType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CustomerUsageType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "TaxTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "TaxTypeId"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxRuleTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "TaxRuleTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "TaxRuleTypeId"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isAllJuris");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "IsAllJuris"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cap");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Cap"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("threshold");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Threshold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("options");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Options"));
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
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("isStPro");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "IsStPro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rateTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "RateTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourcing");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Sourcing"));
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
