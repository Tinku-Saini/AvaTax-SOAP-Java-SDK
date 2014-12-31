/**
 * ExemptCert.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.account;

import java.util.Calendar;

public class ExemptCert  implements java.io.Serializable {
    private int exemptCertId;
    private int companyId;
    private java.lang.String customerCode;
    private java.lang.String customerName;
    private java.lang.String address1;
    private java.lang.String address2;
    private java.lang.String address3;
    private java.lang.String city;
    private java.lang.String region;
    private java.lang.String postalCode;
    private java.lang.String country;

    private com.avalara.avatax.services.account.ExemptCertType exemptCertTypeId;
    private java.lang.String documentRefNo;
    private org.apache.axis.types.UnsignedByte businessTypeId;
    private java.lang.String businessTypeOtherDescription;
    private java.lang.String exemptReasonId;
    private java.lang.String exemptReasonOtherDescription;
    private java.util.Date effDate;
    private java.lang.String regionsApplicable;

    private com.avalara.avatax.services.account.ExemptCertStatus exemptCertStatusId;
    private java.util.Calendar createdDate;
    private int createdUserId;
    private java.util.Calendar modifiedDate;
    private int modifiedUserId;
    private java.util.Calendar lastTransactionDate;
    private java.lang.String exemptTypeDescription;
    private java.lang.String businessTypeDescription;
    private java.lang.String exemptReasonDescription;
    private java.lang.String statusDescription;
    private java.lang.String entityTypeDescription;
    private com.avalara.avatax.services.account.ArrayOfExemptCertDetail exemptCertDetails;
    private java.util.Date expiryDate;

    private java.lang.String countryIssued;
    private java.lang.String avaCertId;
    private com.avalara.avatax.services.account.ExemptCertReviewStatus exemptCertReviewStatusId;
    

    public ExemptCert() {           
    }

    public ExemptCert(
           int exemptCertId,
           int companyId,
           java.lang.String customerCode,
           java.lang.String customerName,
           java.lang.String address1,
           java.lang.String address2,
           java.lang.String address3,
           java.lang.String city,
           java.lang.String region,
           java.lang.String postalCode,
           java.lang.String country,
           java.lang.String PTIN,
           java.lang.String regionIssued,
           java.lang.String FEIN,
           java.lang.String driversLicenseNo,
           java.lang.String driversLicenseRegion,
           java.lang.String FDN,
           com.avalara.avatax.services.account.ExemptCertType exemptCertTypeId,
           java.lang.String documentRefNo,
           org.apache.axis.types.UnsignedByte businessTypeId,
           java.lang.String businessTypeOtherDescription,
           java.lang.String exemptReasonId,
           java.lang.String exemptReasonOtherDescription,
           java.util.Date effDate,
           java.lang.String regionsApplicable,
           boolean isEntity,
           com.avalara.avatax.services.account.ExemptCertStatus exemptCertStatusId,
           java.util.Calendar createdDate,
           int createdUserId,
           java.util.Calendar modifiedDate,
           int modifiedUserId,
           java.util.Calendar lastTransactionDate,
           java.lang.String exemptTypeDescription,
           java.lang.String businessTypeDescription,
           java.lang.String exemptReasonDescription,
           java.lang.String statusDescription,
           java.lang.String entityTypeDescription,
           com.avalara.avatax.services.account.ArrayOfExemptCertDetail exemptCertDetails,
           java.lang.String countryIssued,
           java.lang.String avaCertId,
           com.avalara.avatax.services.account.ExemptCertReviewStatus exemptCertReviewStatusId,
           java.util.Date expiryDate
           ) {
           this.exemptCertId = exemptCertId;
           this.companyId = companyId;
           this.customerCode = customerCode;
           this.customerName = customerName;
           this.address1 = address1;
           this.address2 = address2;
           this.address3 = address3;
           this.city = city;
           this.region = region;
           this.postalCode = postalCode;
           this.country = country;
           this.exemptCertTypeId = exemptCertTypeId;
           this.documentRefNo = documentRefNo;
           this.businessTypeId = businessTypeId;
           this.businessTypeOtherDescription = businessTypeOtherDescription;
           this.exemptReasonId = exemptReasonId;
           this.exemptReasonOtherDescription = exemptReasonOtherDescription;
           this.effDate = effDate;
           this.regionsApplicable = regionsApplicable;
           this.exemptCertStatusId = exemptCertStatusId;
           this.createdDate = createdDate;
           this.createdUserId = createdUserId;
           this.modifiedDate = modifiedDate;
           this.modifiedUserId = modifiedUserId;
           this.lastTransactionDate = lastTransactionDate;
           this.exemptTypeDescription = exemptTypeDescription;
           this.businessTypeDescription = businessTypeDescription;
           this.exemptReasonDescription = exemptReasonDescription;
           this.statusDescription = statusDescription;
           this.entityTypeDescription = entityTypeDescription;
           this.exemptCertDetails = exemptCertDetails;
            this.countryIssued = countryIssued;
           this.avaCertId = avaCertId;
           this.exemptCertReviewStatusId = exemptCertReviewStatusId;
           this.expiryDate = expiryDate;
           
    }


    /**
     * Gets the exemptCertId value for this ExemptCert.
     * 
     * @return exemptCertId
     */
    public int getExemptCertId() {
        return exemptCertId;
    }


    /**
     * Sets the exemptCertId value for this ExemptCert.
     * 
     * @param exemptCertId
     */
    public void setExemptCertId(int exemptCertId) {
        this.exemptCertId = exemptCertId;
    }


    /**
     * Gets the companyId value for this ExemptCert.
     * 
     * @return companyId
     */
    public int getCompanyId() {
        return companyId;
    }


    /**
     * Sets the companyId value for this ExemptCert.
     * 
     * @param companyId
     */
    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }


    /**
     * Gets the customerCode value for this ExemptCert.
     * 
     * @return customerCode
     */
    public java.lang.String getCustomerCode() {
        return customerCode;
    }


    /**
     * Sets the customerCode value for this ExemptCert.
     * 
     * @param customerCode
     */
    public void setCustomerCode(java.lang.String customerCode) {
        this.customerCode = customerCode;
    }


    /**
     * Gets the customerName value for this ExemptCert.
     * 
     * @return customerName
     */
    public java.lang.String getCustomerName() {
        return customerName;
    }


    /**
     * Sets the customerName value for this ExemptCert.
     * 
     * @param customerName
     */
    public void setCustomerName(java.lang.String customerName) {
        this.customerName = customerName;
    }


    /**
     * Gets the address1 value for this ExemptCert.
     * 
     * @return address1
     */
    public java.lang.String getAddress1() {
        return address1;
    }


    /**
     * Sets the address1 value for this ExemptCert.
     * 
     * @param address1
     */
    public void setAddress1(java.lang.String address1) {
        this.address1 = address1;
    }


    /**
     * Gets the address2 value for this ExemptCert.
     * 
     * @return address2
     */
    public java.lang.String getAddress2() {
        return address2;
    }


    /**
     * Sets the address2 value for this ExemptCert.
     * 
     * @param address2
     */
    public void setAddress2(java.lang.String address2) {
        this.address2 = address2;
    }


    /**
     * Gets the address3 value for this ExemptCert.
     * 
     * @return address3
     */
    public java.lang.String getAddress3() {
        return address3;
    }


    /**
     * Sets the address3 value for this ExemptCert.
     * 
     * @param address3
     */
    public void setAddress3(java.lang.String address3) {
        this.address3 = address3;
    }


    /**
     * Gets the city value for this ExemptCert.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this ExemptCert.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the region value for this ExemptCert.
     * 
     * @return region
     */
    public java.lang.String getRegion() {
        return region;
    }


    /**
     * Sets the region value for this ExemptCert.
     * 
     * @param region
     */
    public void setRegion(java.lang.String region) {
        this.region = region;
    }


    /**
     * Gets the postalCode value for this ExemptCert.
     * 
     * @return postalCode
     */
    public java.lang.String getPostalCode() {
        return postalCode;
    }


    /**
     * Sets the postalCode value for this ExemptCert.
     * 
     * @param postalCode
     */
    public void setPostalCode(java.lang.String postalCode) {
        this.postalCode = postalCode;
    }


    /**
     * Gets the country value for this ExemptCert.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this ExemptCert.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }





    /**
     * Gets the exemptCertTypeId value for this ExemptCert.
     * 
     * @return exemptCertTypeId
     */
    public com.avalara.avatax.services.account.ExemptCertType getExemptCertTypeId() {
        return exemptCertTypeId;
    }


    /**
     * Sets the exemptCertTypeId value for this ExemptCert.
     * 
     * @param exemptCertTypeId
     */
    public void setExemptCertTypeId(com.avalara.avatax.services.account.ExemptCertType exemptCertTypeId) {
        this.exemptCertTypeId = exemptCertTypeId;
    }


    /**
     * Gets the documentRefNo value for this ExemptCert.
     * 
     * @return documentRefNo
     */
    public java.lang.String getDocumentRefNo() {
        return documentRefNo;
    }


    /**
     * Sets the documentRefNo value for this ExemptCert.
     * 
     * @param documentRefNo
     */
    public void setDocumentRefNo(java.lang.String documentRefNo) {
        this.documentRefNo = documentRefNo;
    }


    /**
     * Gets the businessTypeId value for this ExemptCert.
     * 
     * @return businessTypeId
     */
    public org.apache.axis.types.UnsignedByte getBusinessTypeId() {
        return businessTypeId;
    }


    /**
     * Sets the businessTypeId value for this ExemptCert.
     * 
     * @param businessTypeId
     */
    public void setBusinessTypeId(org.apache.axis.types.UnsignedByte businessTypeId) {
        this.businessTypeId = businessTypeId;
    }


    /**
     * Gets the businessTypeOtherDescription value for this ExemptCert.
     * 
     * @return businessTypeOtherDescription
     */
    public java.lang.String getBusinessTypeOtherDescription() {
        return businessTypeOtherDescription;
    }


    /**
     * Sets the businessTypeOtherDescription value for this ExemptCert.
     * 
     * @param businessTypeOtherDescription
     */
    public void setBusinessTypeOtherDescription(java.lang.String businessTypeOtherDescription) {
        this.businessTypeOtherDescription = businessTypeOtherDescription;
    }


    /**
     * Gets the exemptReasonId value for this ExemptCert.
     * 
     * @return exemptReasonId
     */
    public java.lang.String getExemptReasonId() {
        return exemptReasonId;
    }


    /**
     * Sets the exemptReasonId value for this ExemptCert.
     * 
     * @param exemptReasonId
     */
    public void setExemptReasonId(java.lang.String exemptReasonId) {
        this.exemptReasonId = exemptReasonId;
    }


    /**
     * Gets the exemptReasonOtherDescription value for this ExemptCert.
     * 
     * @return exemptReasonOtherDescription
     */
    public java.lang.String getExemptReasonOtherDescription() {
        return exemptReasonOtherDescription;
    }


    /**
     * Sets the exemptReasonOtherDescription value for this ExemptCert.
     * 
     * @param exemptReasonOtherDescription
     */
    public void setExemptReasonOtherDescription(java.lang.String exemptReasonOtherDescription) {
        this.exemptReasonOtherDescription = exemptReasonOtherDescription;
    }


    /**
     * Gets the effDate value for this ExemptCert.
     * 
     * @return effDate
     */
    public java.util.Date getEffDate() {
        return effDate;
    }


    /**
     * Sets the effDate value for this ExemptCert.
     * 
     * @param effDate
     */
    public void setEffDate(java.util.Date effDate) {
        this.effDate = effDate;
    }


    /**
     * Gets the regionsApplicable value for this ExemptCert.
     * 
     * @return regionsApplicable
     */
    public java.lang.String getRegionsApplicable() {
        return regionsApplicable;
    }


    /**
     * Sets the regionsApplicable value for this ExemptCert.
     * 
     * @param regionsApplicable
     */
    public void setRegionsApplicable(java.lang.String regionsApplicable) {
        this.regionsApplicable = regionsApplicable;
    }





    /**
     * Gets the exemptCertStatusId value for this ExemptCert.
     * 
     * @return exemptCertStatusId
     */
    public com.avalara.avatax.services.account.ExemptCertStatus getExemptCertStatusId() {
        return exemptCertStatusId;
    }


    /**
     * Sets the exemptCertStatusId value for this ExemptCert.
     * 
     * @param exemptCertStatusId
     */
    public void setExemptCertStatusId(com.avalara.avatax.services.account.ExemptCertStatus exemptCertStatusId) {
        this.exemptCertStatusId = exemptCertStatusId;
    }


    /**
     * Gets the createdDate value for this ExemptCert.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this ExemptCert.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the createdUserId value for this ExemptCert.
     * 
     * @return createdUserId
     */
    public int getCreatedUserId() {
        return createdUserId;
    }


    /**
     * Sets the createdUserId value for this ExemptCert.
     * 
     * @param createdUserId
     */
    public void setCreatedUserId(int createdUserId) {
        this.createdUserId = createdUserId;
    }


    /**
     * Gets the modifiedDate value for this ExemptCert.
     * 
     * @return modifiedDate
     */
    public java.util.Calendar getModifiedDate() {
        return modifiedDate;
    }


    /**
     * Sets the modifiedDate value for this ExemptCert.
     * 
     * @param modifiedDate
     */
    public void setModifiedDate(java.util.Calendar modifiedDate) {
        this.modifiedDate = modifiedDate;
    }


    /**
     * Gets the modifiedUserId value for this ExemptCert.
     * 
     * @return modifiedUserId
     */
    public int getModifiedUserId() {
        return modifiedUserId;
    }


    /**
     * Sets the modifiedUserId value for this ExemptCert.
     * 
     * @param modifiedUserId
     */
    public void setModifiedUserId(int modifiedUserId) {
        this.modifiedUserId = modifiedUserId;
    }


    /**
     * Gets the lastTransactionDate value for this ExemptCert.
     * 
     * @return lastTransactionDate
     */
    public java.util.Calendar getLastTransactionDate() {
        return lastTransactionDate;
    }


    /**
     * Sets the lastTransactionDate value for this ExemptCert.
     * 
     * @param lastTransactionDate
     */
    public void setLastTransactionDate(java.util.Calendar lastTransactionDate) {
        this.lastTransactionDate = lastTransactionDate;
    }


    /**
     * Gets the exemptTypeDescription value for this ExemptCert.
     * 
     * @return exemptTypeDescription
     */
    public java.lang.String getExemptTypeDescription() {
        return exemptTypeDescription;
    }


    /**
     * Sets the exemptTypeDescription value for this ExemptCert.
     * 
     * @param exemptTypeDescription
     */
    public void setExemptTypeDescription(java.lang.String exemptTypeDescription) {
        this.exemptTypeDescription = exemptTypeDescription;
    }


    /**
     * Gets the businessTypeDescription value for this ExemptCert.
     * 
     * @return businessTypeDescription
     */
    public java.lang.String getBusinessTypeDescription() {
        return businessTypeDescription;
    }


    /**
     * Sets the businessTypeDescription value for this ExemptCert.
     * 
     * @param businessTypeDescription
     */
    public void setBusinessTypeDescription(java.lang.String businessTypeDescription) {
        this.businessTypeDescription = businessTypeDescription;
    }


    /**
     * Gets the exemptReasonDescription value for this ExemptCert.
     * 
     * @return exemptReasonDescription
     */
    public java.lang.String getExemptReasonDescription() {
        return exemptReasonDescription;
    }


    /**
     * Sets the exemptReasonDescription value for this ExemptCert.
     * 
     * @param exemptReasonDescription
     */
    public void setExemptReasonDescription(java.lang.String exemptReasonDescription) {
        this.exemptReasonDescription = exemptReasonDescription;
    }


    /**
     * Gets the statusDescription value for this ExemptCert.
     * 
     * @return statusDescription
     */
    public java.lang.String getStatusDescription() {
        return statusDescription;
    }


    /**
     * Sets the statusDescription value for this ExemptCert.
     * 
     * @param statusDescription
     */
    public void setStatusDescription(java.lang.String statusDescription) {
        this.statusDescription = statusDescription;
    }


    /**
     * Gets the entityTypeDescription value for this ExemptCert.
     * 
     * @return entityTypeDescription
     */
    public java.lang.String getEntityTypeDescription() {
        return entityTypeDescription;
    }


    /**
     * Sets the entityTypeDescription value for this ExemptCert.
     * 
     * @param entityTypeDescription
     */
    public void setEntityTypeDescription(java.lang.String entityTypeDescription) {
        this.entityTypeDescription = entityTypeDescription;
    }


    /**
     * Gets the exemptCertDetails value for this ExemptCert.
     * 
     * @return exemptCertDetails
     */
    public com.avalara.avatax.services.account.ArrayOfExemptCertDetail getExemptCertDetails() {
        return exemptCertDetails;
    }


    /**
     * Sets the exemptCertDetails value for this ExemptCert.
     * 
     * @param exemptCertDetails
     */
    public void setExemptCertDetails(com.avalara.avatax.services.account.ArrayOfExemptCertDetail exemptCertDetails) {
        this.exemptCertDetails = exemptCertDetails;
    }

    /**
     * Gets the countryIssued value for this ExemptCert.
     *
     * @return countryIssued
     */
    public java.lang.String getCountryIssued() {
        return countryIssued;
    }


    /**
     * Sets the countryIssued value for this ExemptCert.
     *
     * @param countryIssued
     */
    public void setCountryIssued(java.lang.String countryIssued) {
        this.countryIssued = countryIssued;
    }


    /**
     * Gets the avaCertId value for this ExemptCert.
     *
     * @return avaCertId
     */
    public java.lang.String getAvaCertId() {
        return avaCertId;
    }


    /**
     * Sets the avaCertId value for this ExemptCert.
     *
     * @param avaCertId
     */
    public void setAvaCertId(java.lang.String avaCertId) {
        this.avaCertId = avaCertId;
    }


    /**
     * Gets the exemptCertReviewStatusId value for this ExemptCert.
     *
     * @return exemptCertReviewStatusId
     */
    public com.avalara.avatax.services.account.ExemptCertReviewStatus getExemptCertReviewStatusId() {
        return exemptCertReviewStatusId;
    }


    /**
     * Sets the exemptCertReviewStatusId value for this ExemptCert.
     *
     * @param exemptCertReviewStatusId
     */
    public void setExemptCertReviewStatusId(com.avalara.avatax.services.account.ExemptCertReviewStatus exemptCertReviewStatusId) {
        this.exemptCertReviewStatusId = exemptCertReviewStatusId;
    }


    /**
     * Gets the expiryDate value for this ExemptCert.
     * 
     * @return expiryDate
     */
    public java.util.Date getExpiryDate() {
        return expiryDate;
    }


    /**
     * Sets the expiryDate value for this ExemptCert.
     * 
     * @param expiryDate
     */
    public void setExpiryDate(java.util.Date expiryDate) {
        this.expiryDate = expiryDate;
    }


    
    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExemptCert)) return false;
        ExemptCert other = (ExemptCert) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.exemptCertId == other.getExemptCertId() &&
            this.companyId == other.getCompanyId() &&
            ((this.customerCode==null && other.getCustomerCode()==null) || 
             (this.customerCode!=null &&
              this.customerCode.equals(other.getCustomerCode()))) &&
            ((this.customerName==null && other.getCustomerName()==null) || 
             (this.customerName!=null &&
              this.customerName.equals(other.getCustomerName()))) &&
            ((this.address1==null && other.getAddress1()==null) || 
             (this.address1!=null &&
              this.address1.equals(other.getAddress1()))) &&
            ((this.address2==null && other.getAddress2()==null) || 
             (this.address2!=null &&
              this.address2.equals(other.getAddress2()))) &&
            ((this.address3==null && other.getAddress3()==null) || 
             (this.address3!=null &&
              this.address3.equals(other.getAddress3()))) &&
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
            ((this.exemptCertTypeId==null && other.getExemptCertTypeId()==null) || 
             (this.exemptCertTypeId!=null &&
              this.exemptCertTypeId.equals(other.getExemptCertTypeId()))) &&
            ((this.documentRefNo==null && other.getDocumentRefNo()==null) || 
             (this.documentRefNo!=null &&
              this.documentRefNo.equals(other.getDocumentRefNo()))) &&
            ((this.businessTypeId==null && other.getBusinessTypeId()==null) || 
             (this.businessTypeId!=null &&
              this.businessTypeId.equals(other.getBusinessTypeId()))) &&
            ((this.businessTypeOtherDescription==null && other.getBusinessTypeOtherDescription()==null) || 
             (this.businessTypeOtherDescription!=null &&
              this.businessTypeOtherDescription.equals(other.getBusinessTypeOtherDescription()))) &&
            ((this.exemptReasonId==null && other.getExemptReasonId()==null) || 
             (this.exemptReasonId!=null &&
              this.exemptReasonId.equals(other.getExemptReasonId()))) &&
            ((this.exemptReasonOtherDescription==null && other.getExemptReasonOtherDescription()==null) || 
             (this.exemptReasonOtherDescription!=null &&
              this.exemptReasonOtherDescription.equals(other.getExemptReasonOtherDescription()))) &&
            ((this.effDate==null && other.getEffDate()==null) || 
             (this.effDate!=null &&
              this.effDate.equals(other.getEffDate()))) &&
            ((this.regionsApplicable==null && other.getRegionsApplicable()==null) || 
             (this.regionsApplicable!=null &&
              this.regionsApplicable.equals(other.getRegionsApplicable()))) &&            
            ((this.exemptCertStatusId==null && other.getExemptCertStatusId()==null) || 
             (this.exemptCertStatusId!=null &&
              this.exemptCertStatusId.equals(other.getExemptCertStatusId()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            this.createdUserId == other.getCreatedUserId() &&
            ((this.modifiedDate==null && other.getModifiedDate()==null) || 
             (this.modifiedDate!=null &&
              this.modifiedDate.equals(other.getModifiedDate()))) &&
            this.modifiedUserId == other.getModifiedUserId() &&
            ((this.lastTransactionDate==null && other.getLastTransactionDate()==null) || 
             (this.lastTransactionDate!=null &&
              this.lastTransactionDate.equals(other.getLastTransactionDate()))) &&
            ((this.exemptTypeDescription==null && other.getExemptTypeDescription()==null) || 
             (this.exemptTypeDescription!=null &&
              this.exemptTypeDescription.equals(other.getExemptTypeDescription()))) &&
            ((this.businessTypeDescription==null && other.getBusinessTypeDescription()==null) || 
             (this.businessTypeDescription!=null &&
              this.businessTypeDescription.equals(other.getBusinessTypeDescription()))) &&
            ((this.exemptReasonDescription==null && other.getExemptReasonDescription()==null) || 
             (this.exemptReasonDescription!=null &&
              this.exemptReasonDescription.equals(other.getExemptReasonDescription()))) &&
            ((this.statusDescription==null && other.getStatusDescription()==null) || 
             (this.statusDescription!=null &&
              this.statusDescription.equals(other.getStatusDescription()))) &&
            ((this.entityTypeDescription==null && other.getEntityTypeDescription()==null) || 
             (this.entityTypeDescription!=null &&
              this.entityTypeDescription.equals(other.getEntityTypeDescription()))) &&
            ((this.exemptCertDetails==null && other.getExemptCertDetails()==null) || 
             (this.exemptCertDetails!=null &&
              this.exemptCertDetails.equals(other.getExemptCertDetails()))) &&
            ((this.countryIssued==null && other.getCountryIssued()==null) ||
             (this.countryIssued!=null &&
              this.countryIssued.equals(other.getCountryIssued()))) &&
            ((this.avaCertId==null && other.getAvaCertId()==null) ||
             (this.avaCertId!=null &&
              this.avaCertId.equals(other.getAvaCertId()))) &&
            ((this.exemptCertReviewStatusId==null && other.getExemptCertReviewStatusId()==null) ||
             (this.exemptCertReviewStatusId!=null &&
              this.exemptCertReviewStatusId.equals(other.getExemptCertReviewStatusId()))) &&
            ((this.expiryDate==null && other.getExpiryDate()==null) || 
             (this.expiryDate!=null &&
              this.expiryDate.equals(other.getExpiryDate())));

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
        _hashCode += getExemptCertId();
        _hashCode += getCompanyId();
        if (getCustomerCode() != null) {
            _hashCode += getCustomerCode().hashCode();
        }
        if (getCustomerName() != null) {
            _hashCode += getCustomerName().hashCode();
        }
        if (getAddress1() != null) {
            _hashCode += getAddress1().hashCode();
        }
        if (getAddress2() != null) {
            _hashCode += getAddress2().hashCode();
        }
        if (getAddress3() != null) {
            _hashCode += getAddress3().hashCode();
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

        if (getExemptCertTypeId() != null) {
            _hashCode += getExemptCertTypeId().hashCode();
        }
        if (getDocumentRefNo() != null) {
            _hashCode += getDocumentRefNo().hashCode();
        }
        if (getBusinessTypeId() != null) {
            _hashCode += getBusinessTypeId().hashCode();
        }
        if (getBusinessTypeOtherDescription() != null) {
            _hashCode += getBusinessTypeOtherDescription().hashCode();
        }
        if (getExemptReasonId() != null) {
            _hashCode += getExemptReasonId().hashCode();
        }
        if (getExemptReasonOtherDescription() != null) {
            _hashCode += getExemptReasonOtherDescription().hashCode();
        }
        if (getEffDate() != null) {
            _hashCode += getEffDate().hashCode();
        }
        if (getRegionsApplicable() != null) {
            _hashCode += getRegionsApplicable().hashCode();
        }
        
        if (getExemptCertStatusId() != null) {
            _hashCode += getExemptCertStatusId().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        _hashCode += getCreatedUserId();
        if (getModifiedDate() != null) {
            _hashCode += getModifiedDate().hashCode();
        }
        _hashCode += getModifiedUserId();
        if (getLastTransactionDate() != null) {
            _hashCode += getLastTransactionDate().hashCode();
        }
        if (getExemptTypeDescription() != null) {
            _hashCode += getExemptTypeDescription().hashCode();
        }
        if (getBusinessTypeDescription() != null) {
            _hashCode += getBusinessTypeDescription().hashCode();
        }
        if (getExemptReasonDescription() != null) {
            _hashCode += getExemptReasonDescription().hashCode();
        }
        if (getStatusDescription() != null) {
            _hashCode += getStatusDescription().hashCode();
        }
        if (getEntityTypeDescription() != null) {
            _hashCode += getEntityTypeDescription().hashCode();
        }
        if (getExemptCertDetails() != null) {
            _hashCode += getExemptCertDetails().hashCode();
        }
        if (getCountryIssued() != null) {
            _hashCode += getCountryIssued().hashCode();
        }
        if (getAvaCertId() != null) {
            _hashCode += getAvaCertId().hashCode();
        }
        if (getExemptCertReviewStatusId() != null) {
            _hashCode += getExemptCertReviewStatusId().hashCode();
        }
        if (getExpiryDate() != null) {
            _hashCode += getExpiryDate().hashCode();
        }
        
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExemptCert.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ExemptCert"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exemptCertId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ExemptCertId"));
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
        elemField.setFieldName("customerCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CustomerCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CustomerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Address1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Address2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Address3"));
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
        elemField.setFieldName("exemptCertTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ExemptCertTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ExemptCertType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentRefNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "DocumentRefNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "BusinessTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedByte"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessTypeOtherDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "BusinessTypeOtherDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exemptReasonId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ExemptReasonId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exemptReasonOtherDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ExemptReasonOtherDescription"));
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
        elemField.setFieldName("regionsApplicable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "RegionsApplicable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);

        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exemptCertStatusId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ExemptCertStatusId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ExemptCertStatus"));
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
        elemField.setFieldName("lastTransactionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "LastTransactionDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exemptTypeDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ExemptTypeDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessTypeDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "BusinessTypeDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exemptReasonDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ExemptReasonDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "StatusDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityTypeDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "EntityTypeDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exemptCertDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ExemptCertDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ArrayOfExemptCertDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);

        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryIssued");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CountryIssued"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("avaCertId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "AvaCertId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exemptCertReviewStatusId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ExemptCertReviewStatusId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ExemptCertReviewStatus"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);

        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ExpiryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
