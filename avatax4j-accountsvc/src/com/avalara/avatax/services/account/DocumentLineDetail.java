/**
 * DocumentLineDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.account;

public class DocumentLineDetail  implements java.io.Serializable {
    private long addressId;
    private java.lang.String countyFips;
    private java.lang.String country;
    private long documentLineDetailId;
    private long documentLineId;
    private java.math.BigDecimal exemptAmount;
    private java.lang.Long exemptReasonId;
    private java.lang.Boolean inState;
    private java.lang.String jurisCode;
    private java.lang.Integer jurisdictionId;
    private java.lang.String jurisName;
    private com.avalara.avatax.services.account.JurisTypeId jurisTypeId;
    private java.math.BigDecimal nonTaxableAmount;
    private java.lang.Integer nonTaxableRuleId;
    private com.avalara.avatax.services.account.TaxRuleTypeId nonTaxableTypeId;
    private java.math.BigDecimal rate;
    private java.lang.String rateTypeId;
    private java.lang.Integer rateRuleId;
    private java.lang.Integer rateSourceId;
    private java.lang.String region;
    private java.lang.String SERCode;
    private java.lang.String sourcing;
    private java.lang.String signatureCode;
    private java.lang.String stateCode;
    private java.lang.String stateAssignedNo;
    private java.math.BigDecimal tax;
    private java.math.BigDecimal taxableAmount;
    private java.math.BigDecimal taxCalculated;
    private com.avalara.avatax.services.account.TaxTypeId taxTypeId;
    private java.lang.String taxName;
    private int taxAuthorityTypeId;
    private java.lang.Integer taxRegionId;
    private java.math.BigDecimal taxOverride;

    public DocumentLineDetail() {
    }

    public DocumentLineDetail(
           long addressId,
           java.lang.String countyFips,
           java.lang.String country,
           long documentLineDetailId,
           long documentLineId,
           java.math.BigDecimal exemptAmount,
           java.lang.Long exemptReasonId,
           java.lang.Boolean inState,
           java.lang.String jurisCode,
           java.lang.Integer jurisdictionId,
           java.lang.String jurisName,
           com.avalara.avatax.services.account.JurisTypeId jurisTypeId,
           java.math.BigDecimal nonTaxableAmount,
           java.lang.Integer nonTaxableRuleId,
           com.avalara.avatax.services.account.TaxRuleTypeId nonTaxableTypeId,
           java.math.BigDecimal rate,
           java.lang.String rateTypeId,
           java.lang.Integer rateRuleId,
           java.lang.Integer rateSourceId,
           java.lang.String region,
           java.lang.String SERCode,
           java.lang.String sourcing,
           java.lang.String signatureCode,
           java.lang.String stateCode,
           java.lang.String stateAssignedNo,
           java.math.BigDecimal tax,
           java.math.BigDecimal taxableAmount,
           java.math.BigDecimal taxCalculated,
           com.avalara.avatax.services.account.TaxTypeId taxTypeId,
           java.lang.String taxName,
           int taxAuthorityTypeId,
           java.lang.Integer taxRegionId,
           java.math.BigDecimal taxOverride) {
           this.addressId = addressId;
           this.countyFips = countyFips;
           this.country = country;
           this.documentLineDetailId = documentLineDetailId;
           this.documentLineId = documentLineId;
           this.exemptAmount = exemptAmount;
           this.exemptReasonId = exemptReasonId;
           this.inState = inState;
           this.jurisCode = jurisCode;
           this.jurisdictionId = jurisdictionId;
           this.jurisName = jurisName;
           this.jurisTypeId = jurisTypeId;
           this.nonTaxableAmount = nonTaxableAmount;
           this.nonTaxableRuleId = nonTaxableRuleId;
           this.nonTaxableTypeId = nonTaxableTypeId;
           this.rate = rate;
           this.rateTypeId = rateTypeId;
           this.rateRuleId = rateRuleId;
           this.rateSourceId = rateSourceId;
           this.region = region;
           this.SERCode = SERCode;
           this.sourcing = sourcing;
           this.signatureCode = signatureCode;
           this.stateCode = stateCode;
           this.stateAssignedNo = stateAssignedNo;
           this.tax = tax;
           this.taxableAmount = taxableAmount;
           this.taxCalculated = taxCalculated;
           this.taxTypeId = taxTypeId;
           this.taxName = taxName;
           this.taxAuthorityTypeId = taxAuthorityTypeId;
           this.taxRegionId = taxRegionId;
           this.taxOverride = taxOverride;
    }


    /**
     * Gets the addressId value for this DocumentLineDetail.
     * 
     * @return addressId
     */
    public long getAddressId() {
        return addressId;
    }


    /**
     * Sets the addressId value for this DocumentLineDetail.
     * 
     * @param addressId
     */
    public void setAddressId(long addressId) {
        this.addressId = addressId;
    }


    /**
     * Gets the countyFips value for this DocumentLineDetail.
     * 
     * @return countyFips
     */
    public java.lang.String getCountyFips() {
        return countyFips;
    }


    /**
     * Sets the countyFips value for this DocumentLineDetail.
     * 
     * @param countyFips
     */
    public void setCountyFips(java.lang.String countyFips) {
        this.countyFips = countyFips;
    }


    /**
     * Gets the country value for this DocumentLineDetail.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this DocumentLineDetail.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the documentLineDetailId value for this DocumentLineDetail.
     * 
     * @return documentLineDetailId
     */
    public long getDocumentLineDetailId() {
        return documentLineDetailId;
    }


    /**
     * Sets the documentLineDetailId value for this DocumentLineDetail.
     * 
     * @param documentLineDetailId
     */
    public void setDocumentLineDetailId(long documentLineDetailId) {
        this.documentLineDetailId = documentLineDetailId;
    }


    /**
     * Gets the documentLineId value for this DocumentLineDetail.
     * 
     * @return documentLineId
     */
    public long getDocumentLineId() {
        return documentLineId;
    }


    /**
     * Sets the documentLineId value for this DocumentLineDetail.
     * 
     * @param documentLineId
     */
    public void setDocumentLineId(long documentLineId) {
        this.documentLineId = documentLineId;
    }


    /**
     * Gets the exemptAmount value for this DocumentLineDetail.
     * 
     * @return exemptAmount
     */
    public java.math.BigDecimal getExemptAmount() {
        return exemptAmount;
    }


    /**
     * Sets the exemptAmount value for this DocumentLineDetail.
     * 
     * @param exemptAmount
     */
    public void setExemptAmount(java.math.BigDecimal exemptAmount) {
        this.exemptAmount = exemptAmount;
    }


    /**
     * Gets the exemptReasonId value for this DocumentLineDetail.
     * 
     * @return exemptReasonId
     */
    public java.lang.Long getExemptReasonId() {
        return exemptReasonId;
    }


    /**
     * Sets the exemptReasonId value for this DocumentLineDetail.
     * 
     * @param exemptReasonId
     */
    public void setExemptReasonId(java.lang.Long exemptReasonId) {
        this.exemptReasonId = exemptReasonId;
    }


    /**
     * Gets the inState value for this DocumentLineDetail.
     * 
     * @return inState
     */
    public java.lang.Boolean getInState() {
        return inState;
    }


    /**
     * Sets the inState value for this DocumentLineDetail.
     * 
     * @param inState
     */
    public void setInState(java.lang.Boolean inState) {
        this.inState = inState;
    }


    /**
     * Gets the jurisCode value for this DocumentLineDetail.
     * 
     * @return jurisCode
     */
    public java.lang.String getJurisCode() {
        return jurisCode;
    }


    /**
     * Sets the jurisCode value for this DocumentLineDetail.
     * 
     * @param jurisCode
     */
    public void setJurisCode(java.lang.String jurisCode) {
        this.jurisCode = jurisCode;
    }


    /**
     * Gets the jurisdictionId value for this DocumentLineDetail.
     * 
     * @return jurisdictionId
     */
    public java.lang.Integer getJurisdictionId() {
        return jurisdictionId;
    }


    /**
     * Sets the jurisdictionId value for this DocumentLineDetail.
     * 
     * @param jurisdictionId
     */
    public void setJurisdictionId(java.lang.Integer jurisdictionId) {
        this.jurisdictionId = jurisdictionId;
    }


    /**
     * Gets the jurisName value for this DocumentLineDetail.
     * 
     * @return jurisName
     */
    public java.lang.String getJurisName() {
        return jurisName;
    }


    /**
     * Sets the jurisName value for this DocumentLineDetail.
     * 
     * @param jurisName
     */
    public void setJurisName(java.lang.String jurisName) {
        this.jurisName = jurisName;
    }


    /**
     * Gets the jurisTypeId value for this DocumentLineDetail.
     * 
     * @return jurisTypeId
     */
    public com.avalara.avatax.services.account.JurisTypeId getJurisTypeId() {
        return jurisTypeId;
    }


    /**
     * Sets the jurisTypeId value for this DocumentLineDetail.
     * 
     * @param jurisTypeId
     */
    public void setJurisTypeId(com.avalara.avatax.services.account.JurisTypeId jurisTypeId) {
        this.jurisTypeId = jurisTypeId;
    }


    /**
     * Gets the nonTaxableAmount value for this DocumentLineDetail.
     * 
     * @return nonTaxableAmount
     */
    public java.math.BigDecimal getNonTaxableAmount() {
        return nonTaxableAmount;
    }


    /**
     * Sets the nonTaxableAmount value for this DocumentLineDetail.
     * 
     * @param nonTaxableAmount
     */
    public void setNonTaxableAmount(java.math.BigDecimal nonTaxableAmount) {
        this.nonTaxableAmount = nonTaxableAmount;
    }


    /**
     * Gets the nonTaxableRuleId value for this DocumentLineDetail.
     * 
     * @return nonTaxableRuleId
     */
    public java.lang.Integer getNonTaxableRuleId() {
        return nonTaxableRuleId;
    }


    /**
     * Sets the nonTaxableRuleId value for this DocumentLineDetail.
     * 
     * @param nonTaxableRuleId
     */
    public void setNonTaxableRuleId(java.lang.Integer nonTaxableRuleId) {
        this.nonTaxableRuleId = nonTaxableRuleId;
    }


    /**
     * Gets the nonTaxableTypeId value for this DocumentLineDetail.
     * 
     * @return nonTaxableTypeId
     */
    public com.avalara.avatax.services.account.TaxRuleTypeId getNonTaxableTypeId() {
        return nonTaxableTypeId;
    }


    /**
     * Sets the nonTaxableTypeId value for this DocumentLineDetail.
     * 
     * @param nonTaxableTypeId
     */
    public void setNonTaxableTypeId(com.avalara.avatax.services.account.TaxRuleTypeId nonTaxableTypeId) {
        this.nonTaxableTypeId = nonTaxableTypeId;
    }


    /**
     * Gets the rate value for this DocumentLineDetail.
     * 
     * @return rate
     */
    public java.math.BigDecimal getRate() {
        return rate;
    }


    /**
     * Sets the rate value for this DocumentLineDetail.
     * 
     * @param rate
     */
    public void setRate(java.math.BigDecimal rate) {
        this.rate = rate;
    }


    /**
     * Gets the rateTypeId value for this DocumentLineDetail.
     * 
     * @return rateTypeId
     */
    public java.lang.String getRateTypeId() {
        return rateTypeId;
    }


    /**
     * Sets the rateTypeId value for this DocumentLineDetail.
     * 
     * @param rateTypeId
     */
    public void setRateTypeId(java.lang.String rateTypeId) {
        this.rateTypeId = rateTypeId;
    }


    /**
     * Gets the rateRuleId value for this DocumentLineDetail.
     * 
     * @return rateRuleId
     */
    public java.lang.Integer getRateRuleId() {
        return rateRuleId;
    }


    /**
     * Sets the rateRuleId value for this DocumentLineDetail.
     * 
     * @param rateRuleId
     */
    public void setRateRuleId(java.lang.Integer rateRuleId) {
        this.rateRuleId = rateRuleId;
    }


    /**
     * Gets the rateSourceId value for this DocumentLineDetail.
     * 
     * @return rateSourceId
     */
    public java.lang.Integer getRateSourceId() {
        return rateSourceId;
    }


    /**
     * Sets the rateSourceId value for this DocumentLineDetail.
     * 
     * @param rateSourceId
     */
    public void setRateSourceId(java.lang.Integer rateSourceId) {
        this.rateSourceId = rateSourceId;
    }


    /**
     * Gets the region value for this DocumentLineDetail.
     * 
     * @return region
     */
    public java.lang.String getRegion() {
        return region;
    }


    /**
     * Sets the region value for this DocumentLineDetail.
     * 
     * @param region
     */
    public void setRegion(java.lang.String region) {
        this.region = region;
    }


    /**
     * Gets the SERCode value for this DocumentLineDetail.
     * 
     * @return SERCode
     */
    public java.lang.String getSERCode() {
        return SERCode;
    }


    /**
     * Sets the SERCode value for this DocumentLineDetail.
     * 
     * @param SERCode
     */
    public void setSERCode(java.lang.String SERCode) {
        this.SERCode = SERCode;
    }


    /**
     * Gets the sourcing value for this DocumentLineDetail.
     * 
     * @return sourcing
     */
    public java.lang.String getSourcing() {
        return sourcing;
    }


    /**
     * Sets the sourcing value for this DocumentLineDetail.
     * 
     * @param sourcing
     */
    public void setSourcing(java.lang.String sourcing) {
        this.sourcing = sourcing;
    }


    /**
     * Gets the signatureCode value for this DocumentLineDetail.
     * 
     * @return signatureCode
     */
    public java.lang.String getSignatureCode() {
        return signatureCode;
    }


    /**
     * Sets the signatureCode value for this DocumentLineDetail.
     * 
     * @param signatureCode
     */
    public void setSignatureCode(java.lang.String signatureCode) {
        this.signatureCode = signatureCode;
    }


    /**
     * Gets the stateCode value for this DocumentLineDetail.
     * 
     * @return stateCode
     */
    public java.lang.String getStateCode() {
        return stateCode;
    }


    /**
     * Sets the stateCode value for this DocumentLineDetail.
     * 
     * @param stateCode
     */
    public void setStateCode(java.lang.String stateCode) {
        this.stateCode = stateCode;
    }


    /**
     * Gets the stateAssignedNo value for this DocumentLineDetail.
     * 
     * @return stateAssignedNo
     */
    public java.lang.String getStateAssignedNo() {
        return stateAssignedNo;
    }


    /**
     * Sets the stateAssignedNo value for this DocumentLineDetail.
     * 
     * @param stateAssignedNo
     */
    public void setStateAssignedNo(java.lang.String stateAssignedNo) {
        this.stateAssignedNo = stateAssignedNo;
    }


    /**
     * Gets the tax value for this DocumentLineDetail.
     * 
     * @return tax
     */
    public java.math.BigDecimal getTax() {
        return tax;
    }


    /**
     * Sets the tax value for this DocumentLineDetail.
     * 
     * @param tax
     */
    public void setTax(java.math.BigDecimal tax) {
        this.tax = tax;
    }


    /**
     * Gets the taxableAmount value for this DocumentLineDetail.
     * 
     * @return taxableAmount
     */
    public java.math.BigDecimal getTaxableAmount() {
        return taxableAmount;
    }


    /**
     * Sets the taxableAmount value for this DocumentLineDetail.
     * 
     * @param taxableAmount
     */
    public void setTaxableAmount(java.math.BigDecimal taxableAmount) {
        this.taxableAmount = taxableAmount;
    }


    /**
     * Gets the taxCalculated value for this DocumentLineDetail.
     * 
     * @return taxCalculated
     */
    public java.math.BigDecimal getTaxCalculated() {
        return taxCalculated;
    }


    /**
     * Sets the taxCalculated value for this DocumentLineDetail.
     * 
     * @param taxCalculated
     */
    public void setTaxCalculated(java.math.BigDecimal taxCalculated) {
        this.taxCalculated = taxCalculated;
    }


    /**
     * Gets the taxTypeId value for this DocumentLineDetail.
     * 
     * @return taxTypeId
     */
    public com.avalara.avatax.services.account.TaxTypeId getTaxTypeId() {
        return taxTypeId;
    }


    /**
     * Sets the taxTypeId value for this DocumentLineDetail.
     * 
     * @param taxTypeId
     */
    public void setTaxTypeId(com.avalara.avatax.services.account.TaxTypeId taxTypeId) {
        this.taxTypeId = taxTypeId;
    }


    /**
     * Gets the taxName value for this DocumentLineDetail.
     * 
     * @return taxName
     */
    public java.lang.String getTaxName() {
        return taxName;
    }


    /**
     * Sets the taxName value for this DocumentLineDetail.
     * 
     * @param taxName
     */
    public void setTaxName(java.lang.String taxName) {
        this.taxName = taxName;
    }


    /**
     * Gets the taxAuthorityTypeId value for this DocumentLineDetail.
     * 
     * @return taxAuthorityTypeId
     */
    public int getTaxAuthorityTypeId() {
        return taxAuthorityTypeId;
    }


    /**
     * Sets the taxAuthorityTypeId value for this DocumentLineDetail.
     * 
     * @param taxAuthorityTypeId
     */
    public void setTaxAuthorityTypeId(int taxAuthorityTypeId) {
        this.taxAuthorityTypeId = taxAuthorityTypeId;
    }


    /**
     * Gets the taxRegionId value for this DocumentLineDetail.
     * 
     * @return taxRegionId
     */
    public java.lang.Integer getTaxRegionId() {
        return taxRegionId;
    }


    /**
     * Sets the taxRegionId value for this DocumentLineDetail.
     * 
     * @param taxRegionId
     */
    public void setTaxRegionId(java.lang.Integer taxRegionId) {
        this.taxRegionId = taxRegionId;
    }


    /**
     * Gets the taxOverride value for this DocumentLineDetail.
     * 
     * @return taxOverride
     */
    public java.math.BigDecimal getTaxOverride() {
        return taxOverride;
    }


    /**
     * Sets the taxOverride value for this DocumentLineDetail.
     * 
     * @param taxOverride
     */
    public void setTaxOverride(java.math.BigDecimal taxOverride) {
        this.taxOverride = taxOverride;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DocumentLineDetail)) return false;
        DocumentLineDetail other = (DocumentLineDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.addressId == other.getAddressId() &&
            ((this.countyFips==null && other.getCountyFips()==null) || 
             (this.countyFips!=null &&
              this.countyFips.equals(other.getCountyFips()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            this.documentLineDetailId == other.getDocumentLineDetailId() &&
            this.documentLineId == other.getDocumentLineId() &&
            ((this.exemptAmount==null && other.getExemptAmount()==null) || 
             (this.exemptAmount!=null &&
              this.exemptAmount.equals(other.getExemptAmount()))) &&
            ((this.exemptReasonId==null && other.getExemptReasonId()==null) || 
             (this.exemptReasonId!=null &&
              this.exemptReasonId.equals(other.getExemptReasonId()))) &&
            ((this.inState==null && other.getInState()==null) || 
             (this.inState!=null &&
              this.inState.equals(other.getInState()))) &&
            ((this.jurisCode==null && other.getJurisCode()==null) || 
             (this.jurisCode!=null &&
              this.jurisCode.equals(other.getJurisCode()))) &&
            ((this.jurisdictionId==null && other.getJurisdictionId()==null) || 
             (this.jurisdictionId!=null &&
              this.jurisdictionId.equals(other.getJurisdictionId()))) &&
            ((this.jurisName==null && other.getJurisName()==null) || 
             (this.jurisName!=null &&
              this.jurisName.equals(other.getJurisName()))) &&
            ((this.jurisTypeId==null && other.getJurisTypeId()==null) || 
             (this.jurisTypeId!=null &&
              this.jurisTypeId.equals(other.getJurisTypeId()))) &&
            ((this.nonTaxableAmount==null && other.getNonTaxableAmount()==null) || 
             (this.nonTaxableAmount!=null &&
              this.nonTaxableAmount.equals(other.getNonTaxableAmount()))) &&
            ((this.nonTaxableRuleId==null && other.getNonTaxableRuleId()==null) || 
             (this.nonTaxableRuleId!=null &&
              this.nonTaxableRuleId.equals(other.getNonTaxableRuleId()))) &&
            ((this.nonTaxableTypeId==null && other.getNonTaxableTypeId()==null) || 
             (this.nonTaxableTypeId!=null &&
              this.nonTaxableTypeId.equals(other.getNonTaxableTypeId()))) &&
            ((this.rate==null && other.getRate()==null) || 
             (this.rate!=null &&
              this.rate.equals(other.getRate()))) &&
            ((this.rateTypeId==null && other.getRateTypeId()==null) || 
             (this.rateTypeId!=null &&
              this.rateTypeId.equals(other.getRateTypeId()))) &&
            ((this.rateRuleId==null && other.getRateRuleId()==null) || 
             (this.rateRuleId!=null &&
              this.rateRuleId.equals(other.getRateRuleId()))) &&
            ((this.rateSourceId==null && other.getRateSourceId()==null) || 
             (this.rateSourceId!=null &&
              this.rateSourceId.equals(other.getRateSourceId()))) &&
            ((this.region==null && other.getRegion()==null) || 
             (this.region!=null &&
              this.region.equals(other.getRegion()))) &&
            ((this.SERCode==null && other.getSERCode()==null) || 
             (this.SERCode!=null &&
              this.SERCode.equals(other.getSERCode()))) &&
            ((this.sourcing==null && other.getSourcing()==null) || 
             (this.sourcing!=null &&
              this.sourcing.equals(other.getSourcing()))) &&
            ((this.signatureCode==null && other.getSignatureCode()==null) || 
             (this.signatureCode!=null &&
              this.signatureCode.equals(other.getSignatureCode()))) &&
            ((this.stateCode==null && other.getStateCode()==null) || 
             (this.stateCode!=null &&
              this.stateCode.equals(other.getStateCode()))) &&
            ((this.stateAssignedNo==null && other.getStateAssignedNo()==null) || 
             (this.stateAssignedNo!=null &&
              this.stateAssignedNo.equals(other.getStateAssignedNo()))) &&
            ((this.tax==null && other.getTax()==null) || 
             (this.tax!=null &&
              this.tax.equals(other.getTax()))) &&
            ((this.taxableAmount==null && other.getTaxableAmount()==null) || 
             (this.taxableAmount!=null &&
              this.taxableAmount.equals(other.getTaxableAmount()))) &&
            ((this.taxCalculated==null && other.getTaxCalculated()==null) || 
             (this.taxCalculated!=null &&
              this.taxCalculated.equals(other.getTaxCalculated()))) &&
            ((this.taxTypeId==null && other.getTaxTypeId()==null) || 
             (this.taxTypeId!=null &&
              this.taxTypeId.equals(other.getTaxTypeId()))) &&
            ((this.taxName==null && other.getTaxName()==null) || 
             (this.taxName!=null &&
              this.taxName.equals(other.getTaxName()))) &&
            this.taxAuthorityTypeId == other.getTaxAuthorityTypeId() &&
            ((this.taxRegionId==null && other.getTaxRegionId()==null) || 
             (this.taxRegionId!=null &&
              this.taxRegionId.equals(other.getTaxRegionId()))) &&
            ((this.taxOverride==null && other.getTaxOverride()==null) || 
             (this.taxOverride!=null &&
              this.taxOverride.equals(other.getTaxOverride())));
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
        _hashCode += new Long(getAddressId()).hashCode();
        if (getCountyFips() != null) {
            _hashCode += getCountyFips().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        _hashCode += new Long(getDocumentLineDetailId()).hashCode();
        _hashCode += new Long(getDocumentLineId()).hashCode();
        if (getExemptAmount() != null) {
            _hashCode += getExemptAmount().hashCode();
        }
        if (getExemptReasonId() != null) {
            _hashCode += getExemptReasonId().hashCode();
        }
        if (getInState() != null) {
            _hashCode += getInState().hashCode();
        }
        if (getJurisCode() != null) {
            _hashCode += getJurisCode().hashCode();
        }
        if (getJurisName() != null) {
            _hashCode += getJurisName().hashCode();
        }
        if (getJurisTypeId() != null) {
            _hashCode += getJurisTypeId().hashCode();
        }
        if (getNonTaxableAmount() != null) {
            _hashCode += getNonTaxableAmount().hashCode();
        }
        if (getNonTaxableRuleId() != null) {
            _hashCode += getNonTaxableRuleId().hashCode();
        }
        if (getNonTaxableTypeId() != null) {
            _hashCode += getNonTaxableTypeId().hashCode();
        }
        if (getRate() != null) {
            _hashCode += getRate().hashCode();
        }
        if (getRateTypeId() != null) {
            _hashCode += getRateTypeId().hashCode();
        }
        if (getRateRuleId() != null) {
            _hashCode += getRateRuleId().hashCode();
        }
        if (getRateSourceId() != null) {
            _hashCode += getRateSourceId().hashCode();
        }
        if (getRegion() != null) {
            _hashCode += getRegion().hashCode();
        }
        if (getSERCode() != null) {
            _hashCode += getSERCode().hashCode();
        }
        if (getSourcing() != null) {
            _hashCode += getSourcing().hashCode();
        }
        if (getSignatureCode() != null) {
            _hashCode += getSignatureCode().hashCode();
        }
        if (getStateCode() != null) {
            _hashCode += getStateCode().hashCode();
        }
        if (getStateAssignedNo() != null) {
            _hashCode += getStateAssignedNo().hashCode();
        }
        if (getTax() != null) {
            _hashCode += getTax().hashCode();
        }
        if (getTaxableAmount() != null) {
            _hashCode += getTaxableAmount().hashCode();
        }
        if (getTaxCalculated() != null) {
            _hashCode += getTaxCalculated().hashCode();
        }
        if (getTaxTypeId() != null) {
            _hashCode += getTaxTypeId().hashCode();
        }
        if (getTaxName() != null) {
            _hashCode += getTaxName().hashCode();
        }
        _hashCode += getTaxAuthorityTypeId();
        if (getTaxRegionId() != null) {
            _hashCode += getTaxRegionId().hashCode();
        }
        if (getTaxOverride() != null) {
            _hashCode += getTaxOverride().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DocumentLineDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "DocumentLineDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "AddressId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countyFips");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CountyFips"));
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
        elemField.setFieldName("documentLineDetailId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "DocumentLineDetailId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentLineId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "DocumentLineId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exemptAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ExemptAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exemptReasonId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ExemptReasonId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "InState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("jurisdictionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "JurisdictionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("nonTaxableAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "NonTaxableAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nonTaxableRuleId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "NonTaxableRuleId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nonTaxableTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "NonTaxableTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "TaxRuleTypeId"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Rate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
        elemField.setFieldName("rateRuleId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "RateRuleId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rateSourceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "RateSourceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("SERCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "SERCode"));
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
        elemField.setFieldName("stateAssignedNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "StateAssignedNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tax");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Tax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxableAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "TaxableAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxCalculated");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "TaxCalculated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
        elemField.setFieldName("taxName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "TaxName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxAuthorityTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "TaxAuthorityTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxRegionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "TaxRegionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxOverride");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "TaxOverride"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
