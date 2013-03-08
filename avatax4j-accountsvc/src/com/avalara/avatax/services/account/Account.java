/**
 * Account.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.account;

public class Account  implements java.io.Serializable {
    private int accountId;
    private int siteId;
    private java.lang.String accountName;
    private com.avalara.avatax.services.account.AccountStatusId accountStatusId;
    private java.util.Date effDate;
    private java.util.Date endDate;
    private java.util.Calendar createdDate;
    private int createdUserId;
    private java.util.Calendar modifiedDate;
    private int modifiedUserId;
    private com.avalara.avatax.services.account.ArrayOfService services;
    private com.avalara.avatax.services.account.Site site;
    private com.avalara.avatax.services.account.AddressServiceConfig addressServiceConfig;
    private com.avalara.avatax.services.account.FormsServiceConfig formsServiceConfig;
    private com.avalara.avatax.services.account.TaxServiceConfig taxServiceConfig;
    private com.avalara.avatax.services.account.ArrayOfCompany companies;
    private com.avalara.avatax.services.account.ArrayOfUser users;

    public Account() {
    }

    public Account(
           int accountId,
           int siteId,
           java.lang.String accountName,
           com.avalara.avatax.services.account.AccountStatusId accountStatusId,
           java.util.Date effDate,
           java.util.Date endDate,
           java.util.Calendar createdDate,
           int createdUserId,
           java.util.Calendar modifiedDate,
           int modifiedUserId,
           com.avalara.avatax.services.account.ArrayOfService services,
           com.avalara.avatax.services.account.Site site,
           com.avalara.avatax.services.account.AddressServiceConfig addressServiceConfig,
           com.avalara.avatax.services.account.FormsServiceConfig formsServiceConfig,
           com.avalara.avatax.services.account.TaxServiceConfig taxServiceConfig,
           com.avalara.avatax.services.account.ArrayOfCompany companies,
           com.avalara.avatax.services.account.ArrayOfUser users) {
           this.accountId = accountId;
           this.siteId = siteId;
           this.accountName = accountName;
           this.accountStatusId = accountStatusId;
           this.effDate = effDate;
           this.endDate = endDate;
           this.createdDate = createdDate;
           this.createdUserId = createdUserId;
           this.modifiedDate = modifiedDate;
           this.modifiedUserId = modifiedUserId;
           this.services = services;
           this.site = site;
           this.addressServiceConfig = addressServiceConfig;
           this.formsServiceConfig = formsServiceConfig;
           this.taxServiceConfig = taxServiceConfig;
           this.companies = companies;
           this.users = users;
    }


    /**
     * Gets the accountId value for this Account.
     * 
     * @return accountId
     */
    public int getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this Account.
     * 
     * @param accountId
     */
    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the siteId value for this Account.
     * 
     * @return siteId
     */
    public int getSiteId() {
        return siteId;
    }


    /**
     * Sets the siteId value for this Account.
     * 
     * @param siteId
     */
    public void setSiteId(int siteId) {
        this.siteId = siteId;
    }


    /**
     * Gets the accountName value for this Account.
     * 
     * @return accountName
     */
    public java.lang.String getAccountName() {
        return accountName;
    }


    /**
     * Sets the accountName value for this Account.
     * 
     * @param accountName
     */
    public void setAccountName(java.lang.String accountName) {
        this.accountName = accountName;
    }


    /**
     * Gets the accountStatusId value for this Account.
     * 
     * @return accountStatusId
     */
    public com.avalara.avatax.services.account.AccountStatusId getAccountStatusId() {
        return accountStatusId;
    }


    /**
     * Sets the accountStatusId value for this Account.
     * 
     * @param accountStatusId
     */
    public void setAccountStatusId(com.avalara.avatax.services.account.AccountStatusId accountStatusId) {
        this.accountStatusId = accountStatusId;
    }


    /**
     * Gets the effDate value for this Account.
     * 
     * @return effDate
     */
    public java.util.Date getEffDate() {
        return effDate;
    }


    /**
     * Sets the effDate value for this Account.
     * 
     * @param effDate
     */
    public void setEffDate(java.util.Date effDate) {
        this.effDate = effDate;
    }


    /**
     * Gets the endDate value for this Account.
     * 
     * @return endDate
     */
    public java.util.Date getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this Account.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Date endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the createdDate value for this Account.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Account.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the createdUserId value for this Account.
     * 
     * @return createdUserId
     */
    public int getCreatedUserId() {
        return createdUserId;
    }


    /**
     * Sets the createdUserId value for this Account.
     * 
     * @param createdUserId
     */
    public void setCreatedUserId(int createdUserId) {
        this.createdUserId = createdUserId;
    }


    /**
     * Gets the modifiedDate value for this Account.
     * 
     * @return modifiedDate
     */
    public java.util.Calendar getModifiedDate() {
        return modifiedDate;
    }


    /**
     * Sets the modifiedDate value for this Account.
     * 
     * @param modifiedDate
     */
    public void setModifiedDate(java.util.Calendar modifiedDate) {
        this.modifiedDate = modifiedDate;
    }


    /**
     * Gets the modifiedUserId value for this Account.
     * 
     * @return modifiedUserId
     */
    public int getModifiedUserId() {
        return modifiedUserId;
    }


    /**
     * Sets the modifiedUserId value for this Account.
     * 
     * @param modifiedUserId
     */
    public void setModifiedUserId(int modifiedUserId) {
        this.modifiedUserId = modifiedUserId;
    }


    /**
     * Gets the services value for this Account.
     * 
     * @return services
     */
    public com.avalara.avatax.services.account.ArrayOfService getServices() {
        return services;
    }


    /**
     * Sets the services value for this Account.
     * 
     * @param services
     */
    public void setServices(com.avalara.avatax.services.account.ArrayOfService services) {
        this.services = services;
    }


    /**
     * Gets the site value for this Account.
     * 
     * @return site
     */
    public com.avalara.avatax.services.account.Site getSite() {
        return site;
    }


    /**
     * Sets the site value for this Account.
     * 
     * @param site
     */
    public void setSite(com.avalara.avatax.services.account.Site site) {
        this.site = site;
    }


    /**
     * Gets the addressServiceConfig value for this Account.
     * 
     * @return addressServiceConfig
     */
    public com.avalara.avatax.services.account.AddressServiceConfig getAddressServiceConfig() {
        return addressServiceConfig;
    }


    /**
     * Sets the addressServiceConfig value for this Account.
     * 
     * @param addressServiceConfig
     */
    public void setAddressServiceConfig(com.avalara.avatax.services.account.AddressServiceConfig addressServiceConfig) {
        this.addressServiceConfig = addressServiceConfig;
    }


    /**
     * Gets the formsServiceConfig value for this Account.
     * 
     * @return formsServiceConfig
     */
    public com.avalara.avatax.services.account.FormsServiceConfig getFormsServiceConfig() {
        return formsServiceConfig;
    }


    /**
     * Sets the formsServiceConfig value for this Account.
     * 
     * @param formsServiceConfig
     */
    public void setFormsServiceConfig(com.avalara.avatax.services.account.FormsServiceConfig formsServiceConfig) {
        this.formsServiceConfig = formsServiceConfig;
    }


    /**
     * Gets the taxServiceConfig value for this Account.
     * 
     * @return taxServiceConfig
     */
    public com.avalara.avatax.services.account.TaxServiceConfig getTaxServiceConfig() {
        return taxServiceConfig;
    }


    /**
     * Sets the taxServiceConfig value for this Account.
     * 
     * @param taxServiceConfig
     */
    public void setTaxServiceConfig(com.avalara.avatax.services.account.TaxServiceConfig taxServiceConfig) {
        this.taxServiceConfig = taxServiceConfig;
    }


    /**
     * Gets the companies value for this Account.
     * 
     * @return companies
     */
    public com.avalara.avatax.services.account.ArrayOfCompany getCompanies() {
        return companies;
    }


    /**
     * Sets the companies value for this Account.
     * 
     * @param companies
     */
    public void setCompanies(com.avalara.avatax.services.account.ArrayOfCompany companies) {
        this.companies = companies;
    }


    /**
     * Gets the users value for this Account.
     * 
     * @return users
     */
    public com.avalara.avatax.services.account.ArrayOfUser getUsers() {
        return users;
    }


    /**
     * Sets the users value for this Account.
     * 
     * @param users
     */
    public void setUsers(com.avalara.avatax.services.account.ArrayOfUser users) {
        this.users = users;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Account)) return false;
        Account other = (Account) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.accountId == other.getAccountId() &&
            this.siteId == other.getSiteId() &&
            ((this.accountName==null && other.getAccountName()==null) || 
             (this.accountName!=null &&
              this.accountName.equals(other.getAccountName()))) &&
            ((this.accountStatusId==null && other.getAccountStatusId()==null) || 
             (this.accountStatusId!=null &&
              this.accountStatusId.equals(other.getAccountStatusId()))) &&
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
            ((this.services==null && other.getServices()==null) || 
             (this.services!=null &&
              this.services.equals(other.getServices()))) &&
            ((this.site==null && other.getSite()==null) || 
             (this.site!=null &&
              this.site.equals(other.getSite()))) &&
            ((this.addressServiceConfig==null && other.getAddressServiceConfig()==null) || 
             (this.addressServiceConfig!=null &&
              this.addressServiceConfig.equals(other.getAddressServiceConfig()))) &&
            ((this.formsServiceConfig==null && other.getFormsServiceConfig()==null) || 
             (this.formsServiceConfig!=null &&
              this.formsServiceConfig.equals(other.getFormsServiceConfig()))) &&
            ((this.taxServiceConfig==null && other.getTaxServiceConfig()==null) || 
             (this.taxServiceConfig!=null &&
              this.taxServiceConfig.equals(other.getTaxServiceConfig()))) &&
            ((this.companies==null && other.getCompanies()==null) || 
             (this.companies!=null &&
              this.companies.equals(other.getCompanies()))) &&
            ((this.users==null && other.getUsers()==null) || 
             (this.users!=null &&
              this.users.equals(other.getUsers())));
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
        _hashCode += getSiteId();
        if (getAccountName() != null) {
            _hashCode += getAccountName().hashCode();
        }
        if (getAccountStatusId() != null) {
            _hashCode += getAccountStatusId().hashCode();
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
        if (getServices() != null) {
            _hashCode += getServices().hashCode();
        }
        if (getSite() != null) {
            _hashCode += getSite().hashCode();
        }
        if (getAddressServiceConfig() != null) {
            _hashCode += getAddressServiceConfig().hashCode();
        }
        if (getFormsServiceConfig() != null) {
            _hashCode += getFormsServiceConfig().hashCode();
        }
        if (getTaxServiceConfig() != null) {
            _hashCode += getTaxServiceConfig().hashCode();
        }
        if (getCompanies() != null) {
            _hashCode += getCompanies().hashCode();
        }
        if (getUsers() != null) {
            _hashCode += getUsers().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Account.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Account"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "AccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "SiteId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "AccountName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountStatusId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "AccountStatusId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "AccountStatusId"));
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
        elemField.setFieldName("services");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Services"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ArrayOfService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("site");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Site"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Site"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressServiceConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "AddressServiceConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "AddressServiceConfig"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formsServiceConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "FormsServiceConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "FormsServiceConfig"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxServiceConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "TaxServiceConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "TaxServiceConfig"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companies");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Companies"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ArrayOfCompany"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("users");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Users"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ArrayOfUser"));
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
