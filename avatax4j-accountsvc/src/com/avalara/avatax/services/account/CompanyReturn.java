/**
 * CompanyReturn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.account;

public class CompanyReturn  implements java.io.Serializable {
    private int yearStart;
    private long companyReturnId;
    private com.avalara.avatax.services.account.ArrayOfCompanySupportingReturn companySupportingReturn;
    private int companyId;
    private java.lang.String companyName;
    private java.lang.String returnName;
    private com.avalara.avatax.services.account.FilingFrequencyId filingFrequencyId;
    private short months;
    private java.lang.String registrationId;
    private java.lang.String ein;
    private java.lang.String line1;
    private java.lang.String line2;
    private java.lang.String city;
    private java.lang.String region;
    private java.lang.String postalCode;
    private java.lang.String country;
    private java.lang.String phone;
    private java.lang.String description;
    private java.lang.String legalEntityName;
    private java.util.Date effDate;
    private java.util.Date endDate;
    private int createdUserId;
    private java.util.Calendar createdDate;
    private int modifiedUserId;
    private java.util.Calendar modifiedDate;
    private int filingCalendarId;
    private com.avalara.avatax.services.account.FilingTypeId filingTypeId;
    private java.lang.String efilePassword;
    private byte prepayPercentage;
    private java.lang.String taxTypeId;

    public CompanyReturn() {
    }

    public CompanyReturn(
           int yearStart,
           long companyReturnId,
           com.avalara.avatax.services.account.ArrayOfCompanySupportingReturn companySupportingReturn,
           int companyId,
           java.lang.String companyName,
           java.lang.String returnName,
           com.avalara.avatax.services.account.FilingFrequencyId filingFrequencyId,
           short months,
           java.lang.String registrationId,
           java.lang.String ein,
           java.lang.String line1,
           java.lang.String line2,
           java.lang.String city,
           java.lang.String region,
           java.lang.String postalCode,
           java.lang.String country,
           java.lang.String phone,
           java.lang.String description,
           java.lang.String legalEntityName,
           java.util.Date effDate,
           java.util.Date endDate,
           int createdUserId,
           java.util.Calendar createdDate,
           int modifiedUserId,
           java.util.Calendar modifiedDate,
           int filingCalendarId,
           com.avalara.avatax.services.account.FilingTypeId filingTypeId,
           java.lang.String efilePassword,
           byte prepayPercentage,
           java.lang.String taxTypeId) {
           this.yearStart = yearStart;
           this.companyReturnId = companyReturnId;
           this.companySupportingReturn = companySupportingReturn;
           this.companyId = companyId;
           this.companyName = companyName;
           this.returnName = returnName;
           this.filingFrequencyId = filingFrequencyId;
           this.months = months;
           this.registrationId = registrationId;
           this.ein = ein;
           this.line1 = line1;
           this.line2 = line2;
           this.city = city;
           this.region = region;
           this.postalCode = postalCode;
           this.country = country;
           this.phone = phone;
           this.description = description;
           this.legalEntityName = legalEntityName;
           this.effDate = effDate;
           this.endDate = endDate;
           this.createdUserId = createdUserId;
           this.createdDate = createdDate;
           this.modifiedUserId = modifiedUserId;
           this.modifiedDate = modifiedDate;
           this.filingCalendarId = filingCalendarId;
           this.filingTypeId = filingTypeId;
           this.efilePassword = efilePassword;
           this.prepayPercentage = prepayPercentage;
           this.taxTypeId = taxTypeId;
    }


    /**
     * Gets the yearStart value for this CompanyReturn.
     * 
     * @return yearStart
     */
    public int getYearStart() {
        return yearStart;
    }


    /**
     * Sets the yearStart value for this CompanyReturn.
     * 
     * @param yearStart
     */
    public void setYearStart(int yearStart) {
        this.yearStart = yearStart;
    }


    /**
     * Gets the companyReturnId value for this CompanyReturn.
     * 
     * @return companyReturnId
     */
    public long getCompanyReturnId() {
        return companyReturnId;
    }


    /**
     * Sets the companyReturnId value for this CompanyReturn.
     * 
     * @param companyReturnId
     */
    public void setCompanyReturnId(long companyReturnId) {
        this.companyReturnId = companyReturnId;
    }


    /**
     * Gets the companySupportingReturn value for this CompanyReturn.
     * 
     * @return companySupportingReturn
     */
    public com.avalara.avatax.services.account.ArrayOfCompanySupportingReturn getCompanySupportingReturn() {
        return companySupportingReturn;
    }


    /**
     * Sets the companySupportingReturn value for this CompanyReturn.
     * 
     * @param companySupportingReturn
     */
    public void setCompanySupportingReturn(com.avalara.avatax.services.account.ArrayOfCompanySupportingReturn companySupportingReturn) {
        this.companySupportingReturn = companySupportingReturn;
    }


    /**
     * Gets the companyId value for this CompanyReturn.
     * 
     * @return companyId
     */
    public int getCompanyId() {
        return companyId;
    }


    /**
     * Sets the companyId value for this CompanyReturn.
     * 
     * @param companyId
     */
    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }


    /**
     * Gets the companyName value for this CompanyReturn.
     * 
     * @return companyName
     */
    public java.lang.String getCompanyName() {
        return companyName;
    }


    /**
     * Sets the companyName value for this CompanyReturn.
     * 
     * @param companyName
     */
    public void setCompanyName(java.lang.String companyName) {
        this.companyName = companyName;
    }


    /**
     * Gets the returnName value for this CompanyReturn.
     * 
     * @return returnName
     */
    public java.lang.String getReturnName() {
        return returnName;
    }


    /**
     * Sets the returnName value for this CompanyReturn.
     * 
     * @param returnName
     */
    public void setReturnName(java.lang.String returnName) {
        this.returnName = returnName;
    }


    /**
     * Gets the filingFrequencyId value for this CompanyReturn.
     * 
     * @return filingFrequencyId
     */
    public com.avalara.avatax.services.account.FilingFrequencyId getFilingFrequencyId() {
        return filingFrequencyId;
    }


    /**
     * Sets the filingFrequencyId value for this CompanyReturn.
     * 
     * @param filingFrequencyId
     */
    public void setFilingFrequencyId(com.avalara.avatax.services.account.FilingFrequencyId filingFrequencyId) {
        this.filingFrequencyId = filingFrequencyId;
    }


    /**
     * Gets the months value for this CompanyReturn.
     * 
     * @return months
     */
    public short getMonths() {
        return months;
    }


    /**
     * Sets the months value for this CompanyReturn.
     * 
     * @param months
     */
    public void setMonths(short months) {
        this.months = months;
    }


    /**
     * Gets the registrationId value for this CompanyReturn.
     * 
     * @return registrationId
     */
    public java.lang.String getRegistrationId() {
        return registrationId;
    }


    /**
     * Sets the registrationId value for this CompanyReturn.
     * 
     * @param registrationId
     */
    public void setRegistrationId(java.lang.String registrationId) {
        this.registrationId = registrationId;
    }


    /**
     * Gets the ein value for this CompanyReturn.
     * 
     * @return ein
     */
    public java.lang.String getEin() {
        return ein;
    }


    /**
     * Sets the ein value for this CompanyReturn.
     * 
     * @param ein
     */
    public void setEin(java.lang.String ein) {
        this.ein = ein;
    }


    /**
     * Gets the line1 value for this CompanyReturn.
     * 
     * @return line1
     */
    public java.lang.String getLine1() {
        return line1;
    }


    /**
     * Sets the line1 value for this CompanyReturn.
     * 
     * @param line1
     */
    public void setLine1(java.lang.String line1) {
        this.line1 = line1;
    }


    /**
     * Gets the line2 value for this CompanyReturn.
     * 
     * @return line2
     */
    public java.lang.String getLine2() {
        return line2;
    }


    /**
     * Sets the line2 value for this CompanyReturn.
     * 
     * @param line2
     */
    public void setLine2(java.lang.String line2) {
        this.line2 = line2;
    }


    /**
     * Gets the city value for this CompanyReturn.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this CompanyReturn.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the region value for this CompanyReturn.
     * 
     * @return region
     */
    public java.lang.String getRegion() {
        return region;
    }


    /**
     * Sets the region value for this CompanyReturn.
     * 
     * @param region
     */
    public void setRegion(java.lang.String region) {
        this.region = region;
    }


    /**
     * Gets the postalCode value for this CompanyReturn.
     * 
     * @return postalCode
     */
    public java.lang.String getPostalCode() {
        return postalCode;
    }


    /**
     * Sets the postalCode value for this CompanyReturn.
     * 
     * @param postalCode
     */
    public void setPostalCode(java.lang.String postalCode) {
        this.postalCode = postalCode;
    }


    /**
     * Gets the country value for this CompanyReturn.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this CompanyReturn.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the phone value for this CompanyReturn.
     * 
     * @return phone
     */
    public java.lang.String getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this CompanyReturn.
     * 
     * @param phone
     */
    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }


    /**
     * Gets the description value for this CompanyReturn.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this CompanyReturn.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the legalEntityName value for this CompanyReturn.
     * 
     * @return legalEntityName
     */
    public java.lang.String getLegalEntityName() {
        return legalEntityName;
    }


    /**
     * Sets the legalEntityName value for this CompanyReturn.
     * 
     * @param legalEntityName
     */
    public void setLegalEntityName(java.lang.String legalEntityName) {
        this.legalEntityName = legalEntityName;
    }


    /**
     * Gets the effDate value for this CompanyReturn.
     * 
     * @return effDate
     */
    public java.util.Date getEffDate() {
        return effDate;
    }


    /**
     * Sets the effDate value for this CompanyReturn.
     * 
     * @param effDate
     */
    public void setEffDate(java.util.Date effDate) {
        this.effDate = effDate;
    }


    /**
     * Gets the endDate value for this CompanyReturn.
     * 
     * @return endDate
     */
    public java.util.Date getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this CompanyReturn.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Date endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the createdUserId value for this CompanyReturn.
     * 
     * @return createdUserId
     */
    public int getCreatedUserId() {
        return createdUserId;
    }


    /**
     * Sets the createdUserId value for this CompanyReturn.
     * 
     * @param createdUserId
     */
    public void setCreatedUserId(int createdUserId) {
        this.createdUserId = createdUserId;
    }


    /**
     * Gets the createdDate value for this CompanyReturn.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this CompanyReturn.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the modifiedUserId value for this CompanyReturn.
     * 
     * @return modifiedUserId
     */
    public int getModifiedUserId() {
        return modifiedUserId;
    }


    /**
     * Sets the modifiedUserId value for this CompanyReturn.
     * 
     * @param modifiedUserId
     */
    public void setModifiedUserId(int modifiedUserId) {
        this.modifiedUserId = modifiedUserId;
    }


    /**
     * Gets the modifiedDate value for this CompanyReturn.
     * 
     * @return modifiedDate
     */
    public java.util.Calendar getModifiedDate() {
        return modifiedDate;
    }


    /**
     * Sets the modifiedDate value for this CompanyReturn.
     * 
     * @param modifiedDate
     */
    public void setModifiedDate(java.util.Calendar modifiedDate) {
        this.modifiedDate = modifiedDate;
    }


    /**
     * Gets the filingCalendarId value for this CompanyReturn.
     * 
     * @return filingCalendarId
     */
    public int getFilingCalendarId() {
        return filingCalendarId;
    }


    /**
     * Sets the filingCalendarId value for this CompanyReturn.
     * 
     * @param filingCalendarId
     */
    public void setFilingCalendarId(int filingCalendarId) {
        this.filingCalendarId = filingCalendarId;
    }


    /**
     * Gets the filingTypeId value for this CompanyReturn.
     * 
     * @return filingTypeId
     */
    public com.avalara.avatax.services.account.FilingTypeId getFilingTypeId() {
        return filingTypeId;
    }


    /**
     * Sets the filingTypeId value for this CompanyReturn.
     * 
     * @param filingTypeId
     */
    public void setFilingTypeId(com.avalara.avatax.services.account.FilingTypeId filingTypeId) {
        this.filingTypeId = filingTypeId;
    }


    /**
     * Gets the efilePassword value for this CompanyReturn.
     * 
     * @return efilePassword
     */
    public java.lang.String getEfilePassword() {
        return efilePassword;
    }


    /**
     * Sets the efilePassword value for this CompanyReturn.
     * 
     * @param efilePassword
     */
    public void setEfilePassword(java.lang.String efilePassword) {
        this.efilePassword = efilePassword;
    }


    /**
     * Gets the prepayPercentage value for this CompanyReturn.
     * 
     * @return prepayPercentage
     */
    public byte getPrepayPercentage() {
        return prepayPercentage;
    }


    /**
     * Sets the prepayPercentage value for this CompanyReturn.
     * 
     * @param prepayPercentage
     */
    public void setPrepayPercentage(byte prepayPercentage) {
        this.prepayPercentage = prepayPercentage;
    }


    /**
     * Gets the taxTypeId value for this CompanyReturn.
     * 
     * @return taxTypeId
     */
    public java.lang.String getTaxTypeId() {
        return taxTypeId;
    }


    /**
     * Sets the taxTypeId value for this CompanyReturn.
     * 
     * @param taxTypeId
     */
    public void setTaxTypeId(java.lang.String taxTypeId) {
        this.taxTypeId = taxTypeId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CompanyReturn)) return false;
        CompanyReturn other = (CompanyReturn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.yearStart == other.getYearStart() &&
            this.companyReturnId == other.getCompanyReturnId() &&
            ((this.companySupportingReturn==null && other.getCompanySupportingReturn()==null) || 
             (this.companySupportingReturn!=null &&
              this.companySupportingReturn.equals(other.getCompanySupportingReturn()))) &&
            this.companyId == other.getCompanyId() &&
            ((this.companyName==null && other.getCompanyName()==null) || 
             (this.companyName!=null &&
              this.companyName.equals(other.getCompanyName()))) &&
            ((this.returnName==null && other.getReturnName()==null) || 
             (this.returnName!=null &&
              this.returnName.equals(other.getReturnName()))) &&
            ((this.filingFrequencyId==null && other.getFilingFrequencyId()==null) || 
             (this.filingFrequencyId!=null &&
              this.filingFrequencyId.equals(other.getFilingFrequencyId()))) &&
            this.months == other.getMonths() &&
            ((this.registrationId==null && other.getRegistrationId()==null) || 
             (this.registrationId!=null &&
              this.registrationId.equals(other.getRegistrationId()))) &&
            ((this.ein==null && other.getEin()==null) || 
             (this.ein!=null &&
              this.ein.equals(other.getEin()))) &&
            ((this.line1==null && other.getLine1()==null) || 
             (this.line1!=null &&
              this.line1.equals(other.getLine1()))) &&
            ((this.line2==null && other.getLine2()==null) || 
             (this.line2!=null &&
              this.line2.equals(other.getLine2()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.region==null && other.getRegion()==null) || 
             (this.region!=null &&
              this.region.equals(other.getRegion()))) &&
            ((this.postalCode==null && other.getPostalCode()==null) || 
             (this.postalCode!=null &&
              this.postalCode.equals(other.getPostalCode()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.legalEntityName==null && other.getLegalEntityName()==null) || 
             (this.legalEntityName!=null &&
              this.legalEntityName.equals(other.getLegalEntityName()))) &&
            ((this.effDate==null && other.getEffDate()==null) || 
             (this.effDate!=null &&
              this.effDate.equals(other.getEffDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            this.createdUserId == other.getCreatedUserId() &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            this.modifiedUserId == other.getModifiedUserId() &&
            ((this.modifiedDate==null && other.getModifiedDate()==null) || 
             (this.modifiedDate!=null &&
              this.modifiedDate.equals(other.getModifiedDate()))) &&
            this.filingCalendarId == other.getFilingCalendarId() &&
            ((this.filingTypeId==null && other.getFilingTypeId()==null) || 
             (this.filingTypeId!=null &&
              this.filingTypeId.equals(other.getFilingTypeId()))) &&
            ((this.efilePassword==null && other.getEfilePassword()==null) || 
             (this.efilePassword!=null &&
              this.efilePassword.equals(other.getEfilePassword()))) &&
            this.prepayPercentage == other.getPrepayPercentage() &&
            ((this.taxTypeId==null && other.getTaxTypeId()==null) || 
             (this.taxTypeId!=null &&
              this.taxTypeId.equals(other.getTaxTypeId())));
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
        _hashCode += getYearStart();
        _hashCode += new Long(getCompanyReturnId()).hashCode();
        if (getCompanySupportingReturn() != null) {
            _hashCode += getCompanySupportingReturn().hashCode();
        }
        _hashCode += getCompanyId();
        if (getCompanyName() != null) {
            _hashCode += getCompanyName().hashCode();
        }
        if (getReturnName() != null) {
            _hashCode += getReturnName().hashCode();
        }
        if (getFilingFrequencyId() != null) {
            _hashCode += getFilingFrequencyId().hashCode();
        }
        _hashCode += getMonths();
        if (getRegistrationId() != null) {
            _hashCode += getRegistrationId().hashCode();
        }
        if (getEin() != null) {
            _hashCode += getEin().hashCode();
        }
        if (getLine1() != null) {
            _hashCode += getLine1().hashCode();
        }
        if (getLine2() != null) {
            _hashCode += getLine2().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getRegion() != null) {
            _hashCode += getRegion().hashCode();
        }
        if (getPostalCode() != null) {
            _hashCode += getPostalCode().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getLegalEntityName() != null) {
            _hashCode += getLegalEntityName().hashCode();
        }
        if (getEffDate() != null) {
            _hashCode += getEffDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        _hashCode += getCreatedUserId();
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        _hashCode += getModifiedUserId();
        if (getModifiedDate() != null) {
            _hashCode += getModifiedDate().hashCode();
        }
        _hashCode += getFilingCalendarId();
        if (getFilingTypeId() != null) {
            _hashCode += getFilingTypeId().hashCode();
        }
        if (getEfilePassword() != null) {
            _hashCode += getEfilePassword().hashCode();
        }
        _hashCode += getPrepayPercentage();
        if (getTaxTypeId() != null) {
            _hashCode += getTaxTypeId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CompanyReturn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CompanyReturn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("yearStart");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "YearStart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyReturnId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CompanyReturnId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companySupportingReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CompanySupportingReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ArrayOfCompanySupportingReturn"));
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
        elemField.setFieldName("companyName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CompanyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ReturnName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filingFrequencyId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "FilingFrequencyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "FilingFrequencyId"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("months");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Months"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registrationId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "RegistrationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ein");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Ein"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("line1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Line1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("line2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Line2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "City"));
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
        elemField.setFieldName("postalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "PostalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("legalEntityName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "LegalEntityName"));
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
        elemField.setFieldName("createdUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CreatedUserId"));
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
        elemField.setFieldName("modifiedUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ModifiedUserId"));
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
        elemField.setFieldName("filingCalendarId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "FilingCalendarId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filingTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "FilingTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "FilingTypeId"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("efilePassword");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "EfilePassword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prepayPercentage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "PrepayPercentage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "byte"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "TaxTypeId"));
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
