/**
 * Company.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.account;

public class Company  implements java.io.Serializable {
    private int accountId;
    private int companyId;
    private java.lang.String companyCode;
    private java.lang.String companyName;
    private java.util.Calendar createdDate;
    private int createdUserId;
    private int entityNo;
    private boolean hasProfile;
    private boolean isActive;
    private boolean isDefault;
    private boolean isReportingEntity;
    private java.util.Calendar modifiedDate;
    private int modifiedUserId;
    private int parentId;
    private java.util.Date SSTEffDate;
    private java.lang.String SSTPID;
    private java.lang.String TIN;
    private java.lang.String regalBankId;
    private java.lang.String defaultCountry;
    private java.lang.String baseCurrencyCode;
    private com.avalara.avatax.services.account.RoundingLevelId roundingLevelId;
    private boolean cashBasisAccountingEnabled;
    private com.avalara.avatax.services.account.ArrayOfCompany children;
    private com.avalara.avatax.services.account.ArrayOfCompanyContact contacts;
    private com.avalara.avatax.services.account.ArrayOfItem items;
    private com.avalara.avatax.services.account.ArrayOfNexus nexuses;
    private com.avalara.avatax.services.account.Company parent;
    private com.avalara.avatax.services.account.ArrayOfTaxCode taxCodes;
    private com.avalara.avatax.services.account.ArrayOfTaxRule taxRules;
    private boolean warningsEnabled;
    private boolean isTest;
    private com.avalara.avatax.services.account.TaxDependencyLevelId taxDependencyLevelId;
    private boolean inProgress;
    private int defaultLocationId;

    public Company() {
    }

    public Company(
           int accountId,
           int companyId,
           java.lang.String companyCode,
           java.lang.String companyName,
           java.util.Calendar createdDate,
           int createdUserId,
           int entityNo,
           boolean hasProfile,
           boolean isActive,
           boolean isDefault,
           boolean isReportingEntity,
           java.util.Calendar modifiedDate,
           int modifiedUserId,
           int parentId,
           java.util.Date SSTEffDate,
           java.lang.String SSTPID,
           java.lang.String TIN,
           java.lang.String regalBankId,
           java.lang.String defaultCountry,
           java.lang.String baseCurrencyCode,
           com.avalara.avatax.services.account.RoundingLevelId roundingLevelId,
           boolean cashBasisAccountingEnabled,
           com.avalara.avatax.services.account.ArrayOfCompany children,
           com.avalara.avatax.services.account.ArrayOfCompanyContact contacts,
           com.avalara.avatax.services.account.ArrayOfItem items,
           com.avalara.avatax.services.account.ArrayOfNexus nexuses,
           com.avalara.avatax.services.account.Company parent,
           com.avalara.avatax.services.account.ArrayOfTaxCode taxCodes,
           com.avalara.avatax.services.account.ArrayOfTaxRule taxRules,
           boolean warningsEnabled,
           boolean isTest,
           com.avalara.avatax.services.account.TaxDependencyLevelId taxDependencyLevelId,
           boolean inProgress,
           int defaultLocationId) {
           this.accountId = accountId;
           this.companyId = companyId;
           this.companyCode = companyCode;
           this.companyName = companyName;
           this.createdDate = createdDate;
           this.createdUserId = createdUserId;
           this.entityNo = entityNo;
           this.hasProfile = hasProfile;
           this.isActive = isActive;
           this.isDefault = isDefault;
           this.isReportingEntity = isReportingEntity;
           this.modifiedDate = modifiedDate;
           this.modifiedUserId = modifiedUserId;
           this.parentId = parentId;
           this.SSTEffDate = SSTEffDate;
           this.SSTPID = SSTPID;
           this.TIN = TIN;
           this.regalBankId = regalBankId;
           this.defaultCountry = defaultCountry;
           this.baseCurrencyCode = baseCurrencyCode;
           this.roundingLevelId = roundingLevelId;
           this.cashBasisAccountingEnabled = cashBasisAccountingEnabled;
           this.children = children;
           this.contacts = contacts;
           this.items = items;
           this.nexuses = nexuses;
           this.parent = parent;
           this.taxCodes = taxCodes;
           this.taxRules = taxRules;
           this.warningsEnabled = warningsEnabled;
           this.isTest = isTest;
           this.taxDependencyLevelId = taxDependencyLevelId;
           this.inProgress = inProgress;
        this.defaultLocationId = defaultLocationId;

    }


    /**
     * Gets the accountId value for this Company.
     * 
     * @return accountId
     */
    public int getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this Company.
     * 
     * @param accountId
     */
    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the companyId value for this Company.
     * 
     * @return companyId
     */
    public int getCompanyId() {
        return companyId;
    }


    /**
     * Sets the companyId value for this Company.
     * 
     * @param companyId
     */
    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }


    /**
     * Gets the companyCode value for this Company.
     * 
     * @return companyCode
     */
    public java.lang.String getCompanyCode() {
        return companyCode;
    }


    /**
     * Sets the companyCode value for this Company.
     * 
     * @param companyCode
     */
    public void setCompanyCode(java.lang.String companyCode) {
        this.companyCode = companyCode;
    }


    /**
     * Gets the companyName value for this Company.
     * 
     * @return companyName
     */
    public java.lang.String getCompanyName() {
        return companyName;
    }


    /**
     * Sets the companyName value for this Company.
     * 
     * @param companyName
     */
    public void setCompanyName(java.lang.String companyName) {
        this.companyName = companyName;
    }


    /**
     * Gets the createdDate value for this Company.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Company.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the createdUserId value for this Company.
     * 
     * @return createdUserId
     */
    public int getCreatedUserId() {
        return createdUserId;
    }


    /**
     * Sets the createdUserId value for this Company.
     * 
     * @param createdUserId
     */
    public void setCreatedUserId(int createdUserId) {
        this.createdUserId = createdUserId;
    }


    /**
     * Gets the entityNo value for this Company.
     * 
     * @return entityNo
     */
    public int getEntityNo() {
        return entityNo;
    }


    /**
     * Sets the entityNo value for this Company.
     * 
     * @param entityNo
     */
    public void setEntityNo(int entityNo) {
        this.entityNo = entityNo;
    }


    /**
     * Gets the hasProfile value for this Company.
     * 
     * @return hasProfile
     */
    public boolean isHasProfile() {
        return hasProfile;
    }


    /**
     * Sets the hasProfile value for this Company.
     * 
     * @param hasProfile
     */
    public void setHasProfile(boolean hasProfile) {
        this.hasProfile = hasProfile;
    }


    /**
     * Gets the isActive value for this Company.
     * 
     * @return isActive
     */
    public boolean isIsActive() {
        return isActive;
    }


    /**
     * Sets the isActive value for this Company.
     * 
     * @param isActive
     */
    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }


    /**
     * Gets the isDefault value for this Company.
     * 
     * @return isDefault
     */
    public boolean isIsDefault() {
        return isDefault;
    }


    /**
     * Sets the isDefault value for this Company.
     * 
     * @param isDefault
     */
    public void setIsDefault(boolean isDefault) {
        this.isDefault = isDefault;
    }


    /**
     * Gets the isReportingEntity value for this Company.
     * 
     * @return isReportingEntity
     */
    public boolean isIsReportingEntity() {
        return isReportingEntity;
    }


    /**
     * Sets the isReportingEntity value for this Company.
     * 
     * @param isReportingEntity
     */
    public void setIsReportingEntity(boolean isReportingEntity) {
        this.isReportingEntity = isReportingEntity;
    }


    /**
     * Gets the modifiedDate value for this Company.
     * 
     * @return modifiedDate
     */
    public java.util.Calendar getModifiedDate() {
        return modifiedDate;
    }


    /**
     * Sets the modifiedDate value for this Company.
     * 
     * @param modifiedDate
     */
    public void setModifiedDate(java.util.Calendar modifiedDate) {
        this.modifiedDate = modifiedDate;
    }


    /**
     * Gets the modifiedUserId value for this Company.
     * 
     * @return modifiedUserId
     */
    public int getModifiedUserId() {
        return modifiedUserId;
    }


    /**
     * Sets the modifiedUserId value for this Company.
     * 
     * @param modifiedUserId
     */
    public void setModifiedUserId(int modifiedUserId) {
        this.modifiedUserId = modifiedUserId;
    }


    /**
     * Gets the parentId value for this Company.
     * 
     * @return parentId
     */
    public int getParentId() {
        return parentId;
    }


    /**
     * Sets the parentId value for this Company.
     * 
     * @param parentId
     */
    public void setParentId(int parentId) {
        this.parentId = parentId;
    }


    /**
     * Gets the SSTEffDate value for this Company.
     * 
     * @return SSTEffDate
     */
    public java.util.Date getSSTEffDate() {
        return SSTEffDate;
    }


    /**
     * Sets the SSTEffDate value for this Company.
     * 
     * @param SSTEffDate
     */
    public void setSSTEffDate(java.util.Date SSTEffDate) {
        this.SSTEffDate = SSTEffDate;
    }


    /**
     * Gets the SSTPID value for this Company.
     * 
     * @return SSTPID
     */
    public java.lang.String getSSTPID() {
        return SSTPID;
    }


    /**
     * Sets the SSTPID value for this Company.
     * 
     * @param SSTPID
     */
    public void setSSTPID(java.lang.String SSTPID) {
        this.SSTPID = SSTPID;
    }


    /**
     * Gets the TIN value for this Company.
     * 
     * @return TIN
     */
    public java.lang.String getTIN() {
        return TIN;
    }


    /**
     * Sets the TIN value for this Company.
     * 
     * @param TIN
     */
    public void setTIN(java.lang.String TIN) {
        this.TIN = TIN;
    }


    /**
     * Gets the regalBankId value for this Company.
     * 
     * @return regalBankId
     */
    public java.lang.String getRegalBankId() {
        return regalBankId;
    }


    /**
     * Sets the regalBankId value for this Company.
     * 
     * @param regalBankId
     */
    public void setRegalBankId(java.lang.String regalBankId) {
        this.regalBankId = regalBankId;
    }


    /**
     * Gets the defaultCountry value for this Company.
     * 
     * @return defaultCountry
     */
    public java.lang.String getDefaultCountry() {
        return defaultCountry;
    }


    /**
     * Sets the defaultCountry value for this Company.
     * 
     * @param defaultCountry
     */
    public void setDefaultCountry(java.lang.String defaultCountry) {
        this.defaultCountry = defaultCountry;
    }


    /**
     * Gets the baseCurrencyCode value for this Company.
     * 
     * @return baseCurrencyCode
     */
    public java.lang.String getBaseCurrencyCode() {
        return baseCurrencyCode;
    }


    /**
     * Sets the baseCurrencyCode value for this Company.
     * 
     * @param baseCurrencyCode
     */
    public void setBaseCurrencyCode(java.lang.String baseCurrencyCode) {
        this.baseCurrencyCode = baseCurrencyCode;
    }


    /**
     * Gets the roundingLevelId value for this Company.
     * 
     * @return roundingLevelId
     */
    public com.avalara.avatax.services.account.RoundingLevelId getRoundingLevelId() {
        return roundingLevelId;
    }


    /**
     * Sets the roundingLevelId value for this Company.
     * 
     * @param roundingLevelId
     */
    public void setRoundingLevelId(com.avalara.avatax.services.account.RoundingLevelId roundingLevelId) {
        this.roundingLevelId = roundingLevelId;
    }


    /**
     * Gets the cashBasisAccountingEnabled value for this Company.
     * 
     * @return cashBasisAccountingEnabled
     */
    public boolean isCashBasisAccountingEnabled() {
        return cashBasisAccountingEnabled;
    }


    /**
     * Sets the cashBasisAccountingEnabled value for this Company.
     * 
     * @param cashBasisAccountingEnabled
     */
    public void setCashBasisAccountingEnabled(boolean cashBasisAccountingEnabled) {
        this.cashBasisAccountingEnabled = cashBasisAccountingEnabled;
    }


    /**
     * Gets the children value for this Company.
     * 
     * @return children
     */
    public com.avalara.avatax.services.account.ArrayOfCompany getChildren() {
        return children;
    }


    /**
     * Sets the children value for this Company.
     * 
     * @param children
     */
    public void setChildren(com.avalara.avatax.services.account.ArrayOfCompany children) {
        this.children = children;
    }


    /**
     * Gets the contacts value for this Company.
     * 
     * @return contacts
     */
    public com.avalara.avatax.services.account.ArrayOfCompanyContact getContacts() {
        return contacts;
    }


    /**
     * Sets the contacts value for this Company.
     * 
     * @param contacts
     */
    public void setContacts(com.avalara.avatax.services.account.ArrayOfCompanyContact contacts) {
        this.contacts = contacts;
    }


    /**
     * Gets the items value for this Company.
     * 
     * @return items
     */
    public com.avalara.avatax.services.account.ArrayOfItem getItems() {
        return items;
    }


    /**
     * Sets the items value for this Company.
     * 
     * @param items
     */
    public void setItems(com.avalara.avatax.services.account.ArrayOfItem items) {
        this.items = items;
    }


    /**
     * Gets the nexuses value for this Company.
     * 
     * @return nexuses
     */
    public com.avalara.avatax.services.account.ArrayOfNexus getNexuses() {
        return nexuses;
    }


    /**
     * Sets the nexuses value for this Company.
     * 
     * @param nexuses
     */
    public void setNexuses(com.avalara.avatax.services.account.ArrayOfNexus nexuses) {
        this.nexuses = nexuses;
    }


    /**
     * Gets the parent value for this Company.
     * 
     * @return parent
     */
    public com.avalara.avatax.services.account.Company getParent() {
        return parent;
    }


    /**
     * Sets the parent value for this Company.
     * 
     * @param parent
     */
    public void setParent(com.avalara.avatax.services.account.Company parent) {
        this.parent = parent;
    }


    /**
     * Gets the taxCodes value for this Company.
     * 
     * @return taxCodes
     */
    public com.avalara.avatax.services.account.ArrayOfTaxCode getTaxCodes() {
        return taxCodes;
    }


    /**
     * Sets the taxCodes value for this Company.
     * 
     * @param taxCodes
     */
    public void setTaxCodes(com.avalara.avatax.services.account.ArrayOfTaxCode taxCodes) {
        this.taxCodes = taxCodes;
    }


    /**
     * Gets the taxRules value for this Company.
     * 
     * @return taxRules
     */
    public com.avalara.avatax.services.account.ArrayOfTaxRule getTaxRules() {
        return taxRules;
    }


    /**
     * Sets the taxRules value for this Company.
     * 
     * @param taxRules
     */
    public void setTaxRules(com.avalara.avatax.services.account.ArrayOfTaxRule taxRules) {
        this.taxRules = taxRules;
    }


    /**
     * Gets the warningsEnabled value for this Company.
     * 
     * @return warningsEnabled
     */
    public boolean isWarningsEnabled() {
        return warningsEnabled;
    }


    /**
     * Sets the warningsEnabled value for this Company.
     * 
     * @param warningsEnabled
     */
    public void setWarningsEnabled(boolean warningsEnabled) {
        this.warningsEnabled = warningsEnabled;
    }


    /**
     * Gets the isTest value for this Company.
     * 
     * @return isTest
     */
    public boolean isIsTest() {
        return isTest;
    }


    /**
     * Sets the isTest value for this Company.
     * 
     * @param isTest
     */
    public void setIsTest(boolean isTest) {
        this.isTest = isTest;
    }

     /**
     * Gets the taxDependencyLevelId value for this Company.
     *
     * @return taxDependencyLevelId
     */
    public com.avalara.avatax.services.account.TaxDependencyLevelId getTaxDependencyLevelId() {
        return taxDependencyLevelId;
    }


    /**
     * Sets the taxDependencyLevelId value for this Company.
     *
     * @param taxDependencyLevelId
     */
    public void setTaxDependencyLevelId(com.avalara.avatax.services.account.TaxDependencyLevelId taxDependencyLevelId) {
        this.taxDependencyLevelId = taxDependencyLevelId;
    }


    /**
     * Gets the inProgress value for this Company.
     *
     * @return inProgress
     */
    public boolean isInProgress() {
        return inProgress;
    }


    /**
     * Sets the inProgress value for this Company.
     *
     * @param inProgress
     */
    public void setInProgress(boolean inProgress) {
        this.inProgress = inProgress;
    }

    /**
     * Gets the defaultLocationId value for this Company.
     *
     * @return defaultLocationId
     */
    public int getDefaultLocationId() {
        return defaultLocationId;
    }


    /**
     * Sets the defaultLocationId value for this Company.
     *
     * @param defaultLocationId
     */
    public void setDefaultLocationId(int defaultLocationId) {
        this.defaultLocationId = defaultLocationId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Company)) return false;
        Company other = (Company) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.accountId == other.getAccountId() &&
            this.companyId == other.getCompanyId() &&
            ((this.companyCode==null && other.getCompanyCode()==null) || 
             (this.companyCode!=null &&
              this.companyCode.equals(other.getCompanyCode()))) &&
            ((this.companyName==null && other.getCompanyName()==null) || 
             (this.companyName!=null &&
              this.companyName.equals(other.getCompanyName()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            this.createdUserId == other.getCreatedUserId() &&
            this.entityNo == other.getEntityNo() &&
            this.hasProfile == other.isHasProfile() &&
            this.isActive == other.isIsActive() &&
            this.isDefault == other.isIsDefault() &&
            this.isReportingEntity == other.isIsReportingEntity() &&
            ((this.modifiedDate==null && other.getModifiedDate()==null) || 
             (this.modifiedDate!=null &&
              this.modifiedDate.equals(other.getModifiedDate()))) &&
            this.modifiedUserId == other.getModifiedUserId() &&
            this.parentId == other.getParentId() &&
            ((this.SSTEffDate==null && other.getSSTEffDate()==null) || 
             (this.SSTEffDate!=null &&
              this.SSTEffDate.equals(other.getSSTEffDate()))) &&
            ((this.SSTPID==null && other.getSSTPID()==null) || 
             (this.SSTPID!=null &&
              this.SSTPID.equals(other.getSSTPID()))) &&
            ((this.TIN==null && other.getTIN()==null) || 
             (this.TIN!=null &&
              this.TIN.equals(other.getTIN()))) &&
            ((this.regalBankId==null && other.getRegalBankId()==null) || 
             (this.regalBankId!=null &&
              this.regalBankId.equals(other.getRegalBankId()))) &&
            ((this.defaultCountry==null && other.getDefaultCountry()==null) || 
             (this.defaultCountry!=null &&
              this.defaultCountry.equals(other.getDefaultCountry()))) &&
            ((this.baseCurrencyCode==null && other.getBaseCurrencyCode()==null) || 
             (this.baseCurrencyCode!=null &&
              this.baseCurrencyCode.equals(other.getBaseCurrencyCode()))) &&
            ((this.roundingLevelId==null && other.getRoundingLevelId()==null) || 
             (this.roundingLevelId!=null &&
              this.roundingLevelId.equals(other.getRoundingLevelId()))) &&
            this.cashBasisAccountingEnabled == other.isCashBasisAccountingEnabled() &&
            ((this.children==null && other.getChildren()==null) || 
             (this.children!=null &&
              this.children.equals(other.getChildren()))) &&
            ((this.contacts==null && other.getContacts()==null) || 
             (this.contacts!=null &&
              this.contacts.equals(other.getContacts()))) &&
            ((this.items==null && other.getItems()==null) || 
             (this.items!=null &&
              this.items.equals(other.getItems()))) &&
            ((this.nexuses==null && other.getNexuses()==null) || 
             (this.nexuses!=null &&
              this.nexuses.equals(other.getNexuses()))) &&
            ((this.parent==null && other.getParent()==null) || 
             (this.parent!=null &&
              this.parent.equals(other.getParent()))) &&
            ((this.taxCodes==null && other.getTaxCodes()==null) || 
             (this.taxCodes!=null &&
              this.taxCodes.equals(other.getTaxCodes()))) &&
            ((this.taxRules==null && other.getTaxRules()==null) || 
             (this.taxRules!=null &&
              this.taxRules.equals(other.getTaxRules()))) &&
            this.warningsEnabled == other.isWarningsEnabled() &&
            this.isTest == other.isIsTest()&&
            ((this.taxDependencyLevelId==null && other.getTaxDependencyLevelId()==null) ||
                (this.taxDependencyLevelId!=null &&
                    this.taxDependencyLevelId.equals(other.getTaxDependencyLevelId()))) &&
            this.inProgress == other.isInProgress()&&
        this.defaultLocationId == other.getDefaultLocationId();
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
        _hashCode += getCompanyId();
        if (getCompanyCode() != null) {
            _hashCode += getCompanyCode().hashCode();
        }
        if (getCompanyName() != null) {
            _hashCode += getCompanyName().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        _hashCode += getCreatedUserId();
        _hashCode += getEntityNo();
        _hashCode += (isHasProfile() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsActive() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsDefault() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsReportingEntity() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getModifiedDate() != null) {
            _hashCode += getModifiedDate().hashCode();
        }
        _hashCode += getModifiedUserId();
        _hashCode += getParentId();
        if (getSSTEffDate() != null) {
            _hashCode += getSSTEffDate().hashCode();
        }
        if (getSSTPID() != null) {
            _hashCode += getSSTPID().hashCode();
        }
        if (getTIN() != null) {
            _hashCode += getTIN().hashCode();
        }
        if (getRegalBankId() != null) {
            _hashCode += getRegalBankId().hashCode();
        }
        if (getDefaultCountry() != null) {
            _hashCode += getDefaultCountry().hashCode();
        }
        if (getBaseCurrencyCode() != null) {
            _hashCode += getBaseCurrencyCode().hashCode();
        }
        if (getRoundingLevelId() != null) {
            _hashCode += getRoundingLevelId().hashCode();
        }
        _hashCode += (isCashBasisAccountingEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getChildren() != null) {
            _hashCode += getChildren().hashCode();
        }
        if (getContacts() != null) {
            _hashCode += getContacts().hashCode();
        }
        if (getItems() != null) {
            _hashCode += getItems().hashCode();
        }
        if (getNexuses() != null) {
            _hashCode += getNexuses().hashCode();
        }
        if (getParent() != null) {
            _hashCode += getParent().hashCode();
        }
        if (getTaxCodes() != null) {
            _hashCode += getTaxCodes().hashCode();
        }
        if (getTaxRules() != null) {
            _hashCode += getTaxRules().hashCode();
        }
        _hashCode += (isWarningsEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsTest() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getTaxDependencyLevelId() != null) {
            _hashCode += getTaxDependencyLevelId().hashCode();
        }
        _hashCode += (isInProgress() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getDefaultLocationId();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Company.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Company"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "AccountId"));
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
        elemField.setFieldName("companyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CompanyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CompanyName"));
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
        elemField.setFieldName("entityNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "EntityNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasProfile");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "HasProfile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isActive");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "IsActive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDefault");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "IsDefault"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isReportingEntity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "IsReportingEntity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("parentId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ParentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SSTEffDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "SSTEffDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SSTPID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "SSTPID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TIN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "TIN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regalBankId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "RegalBankId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "DefaultCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseCurrencyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "BaseCurrencyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roundingLevelId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "RoundingLevelId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "RoundingLevelId"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cashBasisAccountingEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CashBasisAccountingEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("children");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Children"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ArrayOfCompany"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contacts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Contacts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ArrayOfCompanyContact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("items");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Items"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ArrayOfItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nexuses");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Nexuses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ArrayOfNexus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Parent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Company"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxCodes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "TaxCodes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ArrayOfTaxCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxRules");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "TaxRules"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ArrayOfTaxRule"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("warningsEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "WarningsEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isTest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "IsTest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxDependencyLevelId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "TaxDependencyLevelId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "TaxDependencyLevelId"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inProgress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "InProgress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultLocationId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "DefaultLocationId"));
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
