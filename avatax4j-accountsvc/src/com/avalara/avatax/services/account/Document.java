/**
 * Document.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.account;

public class Document  implements java.io.Serializable {
    private org.apache.axis.types.UnsignedByte adjustmentReasonId;
    private java.lang.String adjustmentDescription;
    private com.avalara.avatax.services.account.ArrayOfDocumentAddress addresses;
    private java.lang.String batchCode;
    private int companyId;
    private java.lang.String currencyCode;
    private java.lang.String customerUsageType;
    private java.lang.String customerVendorCode;
    private java.lang.Long destinationAddressId;
    private java.lang.String documentCode;
    private java.util.Date documentDate;
    private long documentId;
    private com.avalara.avatax.services.account.DocumentStatusId documentStatusId;
    private com.avalara.avatax.services.account.DocumentTypeId documentTypeId;
    private java.lang.String exemptNo;
    private java.util.Date exchangeRateEffDate;
    private java.math.BigDecimal exchangeRate;
    private boolean isLocked;
    private boolean isReconciled;
    private com.avalara.avatax.services.account.ArrayOfDocumentLine lines;
    private java.lang.String locationCode;
    private java.util.Calendar modifiedDate;
    private java.lang.Long originAddressId;
    private java.util.Calendar paymentDate;
    private java.lang.String purchaseOrderNo;
    private java.lang.String referenceCode;
    private java.lang.String salespersonCode;
    private java.lang.String softwareVersion;
    private java.util.Date taxDate;
    private com.avalara.avatax.services.account.TaxOverrideTypeId taxOverrideTypeId;
    private java.math.BigDecimal taxOverrideAmount;
    private java.lang.String taxOverrideReason;
    private java.math.BigDecimal totalAmount;
    private java.math.BigDecimal totalExempt;
    private java.math.BigDecimal totalTax;
    private java.math.BigDecimal totalTaxCalculated;
    private java.math.BigDecimal totalTaxable;
    private int version;

    public Document() {
    }

    public Document(
           org.apache.axis.types.UnsignedByte adjustmentReasonId,
           java.lang.String adjustmentDescription,
           com.avalara.avatax.services.account.ArrayOfDocumentAddress addresses,
           java.lang.String batchCode,
           int companyId,
           java.lang.String currencyCode,
           java.lang.String customerUsageType,
           java.lang.String customerVendorCode,
           java.lang.Long destinationAddressId,
           java.lang.String documentCode,
           java.util.Date documentDate,
           long documentId,
           com.avalara.avatax.services.account.DocumentStatusId documentStatusId,
           com.avalara.avatax.services.account.DocumentTypeId documentTypeId,
           java.lang.String exemptNo,
           java.util.Date exchangeRateEffDate,
           java.math.BigDecimal exchangeRate,
           boolean isLocked,
           boolean isReconciled,
           com.avalara.avatax.services.account.ArrayOfDocumentLine lines,
           java.lang.String locationCode,
           java.util.Calendar modifiedDate,
           java.lang.Long originAddressId,
           java.util.Calendar paymentDate,
           java.lang.String purchaseOrderNo,
           java.lang.String referenceCode,
           java.lang.String salespersonCode,
           java.lang.String softwareVersion,
           java.util.Date taxDate,
           com.avalara.avatax.services.account.TaxOverrideTypeId taxOverrideTypeId,
           java.math.BigDecimal taxOverrideAmount,
           java.lang.String taxOverrideReason,
           java.math.BigDecimal totalAmount,
           java.math.BigDecimal totalExempt,
           java.math.BigDecimal totalTax,
           java.math.BigDecimal totalTaxCalculated,
           java.math.BigDecimal totalTaxable,
           int version) {
           this.adjustmentReasonId = adjustmentReasonId;
           this.adjustmentDescription = adjustmentDescription;
           this.addresses = addresses;
           this.batchCode = batchCode;
           this.companyId = companyId;
           this.currencyCode = currencyCode;
           this.customerUsageType = customerUsageType;
           this.customerVendorCode = customerVendorCode;
           this.destinationAddressId = destinationAddressId;
           this.documentCode = documentCode;
           this.documentDate = documentDate;
           this.documentId = documentId;
           this.documentStatusId = documentStatusId;
           this.documentTypeId = documentTypeId;
           this.exemptNo = exemptNo;
           this.exchangeRateEffDate = exchangeRateEffDate;
           this.exchangeRate = exchangeRate;
           this.isLocked = isLocked;
           this.isReconciled = isReconciled;
           this.lines = lines;
           this.locationCode = locationCode;
           this.modifiedDate = modifiedDate;
           this.originAddressId = originAddressId;
           this.paymentDate = paymentDate;
           this.purchaseOrderNo = purchaseOrderNo;
           this.referenceCode = referenceCode;
           this.salespersonCode = salespersonCode;
           this.softwareVersion = softwareVersion;
           this.taxDate = taxDate;
           this.taxOverrideTypeId = taxOverrideTypeId;
           this.taxOverrideAmount = taxOverrideAmount;
           this.taxOverrideReason = taxOverrideReason;
           this.totalAmount = totalAmount;
           this.totalExempt = totalExempt;
           this.totalTax = totalTax;
           this.totalTaxCalculated = totalTaxCalculated;
           this.totalTaxable = totalTaxable;
           this.version = version;
    }


    /**
     * Gets the adjustmentReasonId value for this Document.
     * 
     * @return adjustmentReasonId
     */
    public org.apache.axis.types.UnsignedByte getAdjustmentReasonId() {
        return adjustmentReasonId;
    }


    /**
     * Sets the adjustmentReasonId value for this Document.
     * 
     * @param adjustmentReasonId
     */
    public void setAdjustmentReasonId(org.apache.axis.types.UnsignedByte adjustmentReasonId) {
        this.adjustmentReasonId = adjustmentReasonId;
    }


    /**
     * Gets the adjustmentDescription value for this Document.
     * 
     * @return adjustmentDescription
     */
    public java.lang.String getAdjustmentDescription() {
        return adjustmentDescription;
    }


    /**
     * Sets the adjustmentDescription value for this Document.
     * 
     * @param adjustmentDescription
     */
    public void setAdjustmentDescription(java.lang.String adjustmentDescription) {
        this.adjustmentDescription = adjustmentDescription;
    }


    /**
     * Gets the addresses value for this Document.
     * 
     * @return addresses
     */
    public com.avalara.avatax.services.account.ArrayOfDocumentAddress getAddresses() {
        return addresses;
    }


    /**
     * Sets the addresses value for this Document.
     * 
     * @param addresses
     */
    public void setAddresses(com.avalara.avatax.services.account.ArrayOfDocumentAddress addresses) {
        this.addresses = addresses;
    }


    /**
     * Gets the batchCode value for this Document.
     * 
     * @return batchCode
     */
    public java.lang.String getBatchCode() {
        return batchCode;
    }


    /**
     * Sets the batchCode value for this Document.
     * 
     * @param batchCode
     */
    public void setBatchCode(java.lang.String batchCode) {
        this.batchCode = batchCode;
    }


    /**
     * Gets the companyId value for this Document.
     * 
     * @return companyId
     */
    public int getCompanyId() {
        return companyId;
    }


    /**
     * Sets the companyId value for this Document.
     * 
     * @param companyId
     */
    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }


    /**
     * Gets the currencyCode value for this Document.
     * 
     * @return currencyCode
     */
    public java.lang.String getCurrencyCode() {
        return currencyCode;
    }


    /**
     * Sets the currencyCode value for this Document.
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(java.lang.String currencyCode) {
        this.currencyCode = currencyCode;
    }


    /**
     * Gets the customerUsageType value for this Document.
     * 
     * @return customerUsageType
     */
    public java.lang.String getCustomerUsageType() {
        return customerUsageType;
    }


    /**
     * Sets the customerUsageType value for this Document.
     * 
     * @param customerUsageType
     */
    public void setCustomerUsageType(java.lang.String customerUsageType) {
        this.customerUsageType = customerUsageType;
    }


    /**
     * Gets the customerVendorCode value for this Document.
     * 
     * @return customerVendorCode
     */
    public java.lang.String getCustomerVendorCode() {
        return customerVendorCode;
    }


    /**
     * Sets the customerVendorCode value for this Document.
     * 
     * @param customerVendorCode
     */
    public void setCustomerVendorCode(java.lang.String customerVendorCode) {
        this.customerVendorCode = customerVendorCode;
    }


    /**
     * Gets the destinationAddressId value for this Document.
     * 
     * @return destinationAddressId
     */
    public java.lang.Long getDestinationAddressId() {
        return destinationAddressId;
    }


    /**
     * Sets the destinationAddressId value for this Document.
     * 
     * @param destinationAddressId
     */
    public void setDestinationAddressId(java.lang.Long destinationAddressId) {
        this.destinationAddressId = destinationAddressId;
    }


    /**
     * Gets the documentCode value for this Document.
     * 
     * @return documentCode
     */
    public java.lang.String getDocumentCode() {
        return documentCode;
    }


    /**
     * Sets the documentCode value for this Document.
     * 
     * @param documentCode
     */
    public void setDocumentCode(java.lang.String documentCode) {
        this.documentCode = documentCode;
    }


    /**
     * Gets the documentDate value for this Document.
     * 
     * @return documentDate
     */
    public java.util.Date getDocumentDate() {
        return documentDate;
    }


    /**
     * Sets the documentDate value for this Document.
     * 
     * @param documentDate
     */
    public void setDocumentDate(java.util.Date documentDate) {
        this.documentDate = documentDate;
    }


    /**
     * Gets the documentId value for this Document.
     * 
     * @return documentId
     */
    public long getDocumentId() {
        return documentId;
    }


    /**
     * Sets the documentId value for this Document.
     * 
     * @param documentId
     */
    public void setDocumentId(long documentId) {
        this.documentId = documentId;
    }


    /**
     * Gets the documentStatusId value for this Document.
     * 
     * @return documentStatusId
     */
    public com.avalara.avatax.services.account.DocumentStatusId getDocumentStatusId() {
        return documentStatusId;
    }


    /**
     * Sets the documentStatusId value for this Document.
     * 
     * @param documentStatusId
     */
    public void setDocumentStatusId(com.avalara.avatax.services.account.DocumentStatusId documentStatusId) {
        this.documentStatusId = documentStatusId;
    }


    /**
     * Gets the documentTypeId value for this Document.
     * 
     * @return documentTypeId
     */
    public com.avalara.avatax.services.account.DocumentTypeId getDocumentTypeId() {
        return documentTypeId;
    }


    /**
     * Sets the documentTypeId value for this Document.
     * 
     * @param documentTypeId
     */
    public void setDocumentTypeId(com.avalara.avatax.services.account.DocumentTypeId documentTypeId) {
        this.documentTypeId = documentTypeId;
    }


    /**
     * Gets the exemptNo value for this Document.
     * 
     * @return exemptNo
     */
    public java.lang.String getExemptNo() {
        return exemptNo;
    }


    /**
     * Sets the exemptNo value for this Document.
     * 
     * @param exemptNo
     */
    public void setExemptNo(java.lang.String exemptNo) {
        this.exemptNo = exemptNo;
    }


    /**
     * Gets the exchangeRateEffDate value for this Document.
     * 
     * @return exchangeRateEffDate
     */
    public java.util.Date getExchangeRateEffDate() {
        return exchangeRateEffDate;
    }


    /**
     * Sets the exchangeRateEffDate value for this Document.
     * 
     * @param exchangeRateEffDate
     */
    public void setExchangeRateEffDate(java.util.Date exchangeRateEffDate) {
        this.exchangeRateEffDate = exchangeRateEffDate;
    }


    /**
     * Gets the exchangeRate value for this Document.
     * 
     * @return exchangeRate
     */
    public java.math.BigDecimal getExchangeRate() {
        return exchangeRate;
    }


    /**
     * Sets the exchangeRate value for this Document.
     * 
     * @param exchangeRate
     */
    public void setExchangeRate(java.math.BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
    }


    /**
     * Gets the isLocked value for this Document.
     * 
     * @return isLocked
     */
    public boolean isIsLocked() {
        return isLocked;
    }


    /**
     * Sets the isLocked value for this Document.
     * 
     * @param isLocked
     */
    public void setIsLocked(boolean isLocked) {
        this.isLocked = isLocked;
    }


    /**
     * Gets the isReconciled value for this Document.
     * 
     * @return isReconciled
     */
    public boolean isIsReconciled() {
        return isReconciled;
    }


    /**
     * Sets the isReconciled value for this Document.
     * 
     * @param isReconciled
     */
    public void setIsReconciled(boolean isReconciled) {
        this.isReconciled = isReconciled;
    }


    /**
     * Gets the lines value for this Document.
     * 
     * @return lines
     */
    public com.avalara.avatax.services.account.ArrayOfDocumentLine getLines() {
        return lines;
    }


    /**
     * Sets the lines value for this Document.
     * 
     * @param lines
     */
    public void setLines(com.avalara.avatax.services.account.ArrayOfDocumentLine lines) {
        this.lines = lines;
    }


    /**
     * Gets the locationCode value for this Document.
     * 
     * @return locationCode
     */
    public java.lang.String getLocationCode() {
        return locationCode;
    }


    /**
     * Sets the locationCode value for this Document.
     * 
     * @param locationCode
     */
    public void setLocationCode(java.lang.String locationCode) {
        this.locationCode = locationCode;
    }


    /**
     * Gets the modifiedDate value for this Document.
     * 
     * @return modifiedDate
     */
    public java.util.Calendar getModifiedDate() {
        return modifiedDate;
    }


    /**
     * Sets the modifiedDate value for this Document.
     * 
     * @param modifiedDate
     */
    public void setModifiedDate(java.util.Calendar modifiedDate) {
        this.modifiedDate = modifiedDate;
    }


    /**
     * Gets the originAddressId value for this Document.
     * 
     * @return originAddressId
     */
    public java.lang.Long getOriginAddressId() {
        return originAddressId;
    }


    /**
     * Sets the originAddressId value for this Document.
     * 
     * @param originAddressId
     */
    public void setOriginAddressId(java.lang.Long originAddressId) {
        this.originAddressId = originAddressId;
    }


    /**
     * Gets the paymentDate value for this Document.
     * 
     * @return paymentDate
     */
    public java.util.Calendar getPaymentDate() {
        return paymentDate;
    }


    /**
     * Sets the paymentDate value for this Document.
     * 
     * @param paymentDate
     */
    public void setPaymentDate(java.util.Calendar paymentDate) {
        this.paymentDate = paymentDate;
    }


    /**
     * Gets the purchaseOrderNo value for this Document.
     * 
     * @return purchaseOrderNo
     */
    public java.lang.String getPurchaseOrderNo() {
        return purchaseOrderNo;
    }


    /**
     * Sets the purchaseOrderNo value for this Document.
     * 
     * @param purchaseOrderNo
     */
    public void setPurchaseOrderNo(java.lang.String purchaseOrderNo) {
        this.purchaseOrderNo = purchaseOrderNo;
    }


    /**
     * Gets the referenceCode value for this Document.
     * 
     * @return referenceCode
     */
    public java.lang.String getReferenceCode() {
        return referenceCode;
    }


    /**
     * Sets the referenceCode value for this Document.
     * 
     * @param referenceCode
     */
    public void setReferenceCode(java.lang.String referenceCode) {
        this.referenceCode = referenceCode;
    }


    /**
     * Gets the salespersonCode value for this Document.
     * 
     * @return salespersonCode
     */
    public java.lang.String getSalespersonCode() {
        return salespersonCode;
    }


    /**
     * Sets the salespersonCode value for this Document.
     * 
     * @param salespersonCode
     */
    public void setSalespersonCode(java.lang.String salespersonCode) {
        this.salespersonCode = salespersonCode;
    }


    /**
     * Gets the softwareVersion value for this Document.
     * 
     * @return softwareVersion
     */
    public java.lang.String getSoftwareVersion() {
        return softwareVersion;
    }


    /**
     * Sets the softwareVersion value for this Document.
     * 
     * @param softwareVersion
     */
    public void setSoftwareVersion(java.lang.String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }


    /**
     * Gets the taxDate value for this Document.
     * 
     * @return taxDate
     */
    public java.util.Date getTaxDate() {
        return taxDate;
    }


    /**
     * Sets the taxDate value for this Document.
     * 
     * @param taxDate
     */
    public void setTaxDate(java.util.Date taxDate) {
        this.taxDate = taxDate;
    }


    /**
     * Gets the taxOverrideTypeId value for this Document.
     * 
     * @return taxOverrideTypeId
     */
    public com.avalara.avatax.services.account.TaxOverrideTypeId getTaxOverrideTypeId() {
        return taxOverrideTypeId;
    }


    /**
     * Sets the taxOverrideTypeId value for this Document.
     * 
     * @param taxOverrideTypeId
     */
    public void setTaxOverrideTypeId(com.avalara.avatax.services.account.TaxOverrideTypeId taxOverrideTypeId) {
        this.taxOverrideTypeId = taxOverrideTypeId;
    }


    /**
     * Gets the taxOverrideAmount value for this Document.
     * 
     * @return taxOverrideAmount
     */
    public java.math.BigDecimal getTaxOverrideAmount() {
        return taxOverrideAmount;
    }


    /**
     * Sets the taxOverrideAmount value for this Document.
     * 
     * @param taxOverrideAmount
     */
    public void setTaxOverrideAmount(java.math.BigDecimal taxOverrideAmount) {
        this.taxOverrideAmount = taxOverrideAmount;
    }


    /**
     * Gets the taxOverrideReason value for this Document.
     * 
     * @return taxOverrideReason
     */
    public java.lang.String getTaxOverrideReason() {
        return taxOverrideReason;
    }


    /**
     * Sets the taxOverrideReason value for this Document.
     * 
     * @param taxOverrideReason
     */
    public void setTaxOverrideReason(java.lang.String taxOverrideReason) {
        this.taxOverrideReason = taxOverrideReason;
    }


    /**
     * Gets the totalAmount value for this Document.
     * 
     * @return totalAmount
     */
    public java.math.BigDecimal getTotalAmount() {
        return totalAmount;
    }


    /**
     * Sets the totalAmount value for this Document.
     * 
     * @param totalAmount
     */
    public void setTotalAmount(java.math.BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }


    /**
     * Gets the totalExempt value for this Document.
     * 
     * @return totalExempt
     */
    public java.math.BigDecimal getTotalExempt() {
        return totalExempt;
    }


    /**
     * Sets the totalExempt value for this Document.
     * 
     * @param totalExempt
     */
    public void setTotalExempt(java.math.BigDecimal totalExempt) {
        this.totalExempt = totalExempt;
    }


    /**
     * Gets the totalTax value for this Document.
     * 
     * @return totalTax
     */
    public java.math.BigDecimal getTotalTax() {
        return totalTax;
    }


    /**
     * Sets the totalTax value for this Document.
     * 
     * @param totalTax
     */
    public void setTotalTax(java.math.BigDecimal totalTax) {
        this.totalTax = totalTax;
    }


    /**
     * Gets the totalTaxCalculated value for this Document.
     * 
     * @return totalTaxCalculated
     */
    public java.math.BigDecimal getTotalTaxCalculated() {
        return totalTaxCalculated;
    }


    /**
     * Sets the totalTaxCalculated value for this Document.
     * 
     * @param totalTaxCalculated
     */
    public void setTotalTaxCalculated(java.math.BigDecimal totalTaxCalculated) {
        this.totalTaxCalculated = totalTaxCalculated;
    }


    /**
     * Gets the totalTaxable value for this Document.
     * 
     * @return totalTaxable
     */
    public java.math.BigDecimal getTotalTaxable() {
        return totalTaxable;
    }


    /**
     * Sets the totalTaxable value for this Document.
     * 
     * @param totalTaxable
     */
    public void setTotalTaxable(java.math.BigDecimal totalTaxable) {
        this.totalTaxable = totalTaxable;
    }


    /**
     * Gets the version value for this Document.
     * 
     * @return version
     */
    public int getVersion() {
        return version;
    }


    /**
     * Sets the version value for this Document.
     * 
     * @param version
     */
    public void setVersion(int version) {
        this.version = version;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Document)) return false;
        Document other = (Document) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.adjustmentReasonId==null && other.getAdjustmentReasonId()==null) || 
             (this.adjustmentReasonId!=null &&
              this.adjustmentReasonId.equals(other.getAdjustmentReasonId()))) &&
            ((this.adjustmentDescription==null && other.getAdjustmentDescription()==null) || 
             (this.adjustmentDescription!=null &&
              this.adjustmentDescription.equals(other.getAdjustmentDescription()))) &&
            ((this.addresses==null && other.getAddresses()==null) || 
             (this.addresses!=null &&
              this.addresses.equals(other.getAddresses()))) &&
            ((this.batchCode==null && other.getBatchCode()==null) || 
             (this.batchCode!=null &&
              this.batchCode.equals(other.getBatchCode()))) &&
            this.companyId == other.getCompanyId() &&
            ((this.currencyCode==null && other.getCurrencyCode()==null) || 
             (this.currencyCode!=null &&
              this.currencyCode.equals(other.getCurrencyCode()))) &&
            ((this.customerUsageType==null && other.getCustomerUsageType()==null) || 
             (this.customerUsageType!=null &&
              this.customerUsageType.equals(other.getCustomerUsageType()))) &&
            ((this.customerVendorCode==null && other.getCustomerVendorCode()==null) || 
             (this.customerVendorCode!=null &&
              this.customerVendorCode.equals(other.getCustomerVendorCode()))) &&
            ((this.destinationAddressId==null && other.getDestinationAddressId()==null) || 
             (this.destinationAddressId!=null &&
              this.destinationAddressId.equals(other.getDestinationAddressId()))) &&
            ((this.documentCode==null && other.getDocumentCode()==null) || 
             (this.documentCode!=null &&
              this.documentCode.equals(other.getDocumentCode()))) &&
            ((this.documentDate==null && other.getDocumentDate()==null) || 
             (this.documentDate!=null &&
              this.documentDate.equals(other.getDocumentDate()))) &&
            this.documentId == other.getDocumentId() &&
            ((this.documentStatusId==null && other.getDocumentStatusId()==null) || 
             (this.documentStatusId!=null &&
              this.documentStatusId.equals(other.getDocumentStatusId()))) &&
            ((this.documentTypeId==null && other.getDocumentTypeId()==null) || 
             (this.documentTypeId!=null &&
              this.documentTypeId.equals(other.getDocumentTypeId()))) &&
            ((this.exemptNo==null && other.getExemptNo()==null) || 
             (this.exemptNo!=null &&
              this.exemptNo.equals(other.getExemptNo()))) &&
            ((this.exchangeRateEffDate==null && other.getExchangeRateEffDate()==null) || 
             (this.exchangeRateEffDate!=null &&
              this.exchangeRateEffDate.equals(other.getExchangeRateEffDate()))) &&
            ((this.exchangeRate==null && other.getExchangeRate()==null) || 
             (this.exchangeRate!=null &&
              this.exchangeRate.equals(other.getExchangeRate()))) &&
            this.isLocked == other.isIsLocked() &&
            this.isReconciled == other.isIsReconciled() &&
            ((this.lines==null && other.getLines()==null) || 
             (this.lines!=null &&
              this.lines.equals(other.getLines()))) &&
            ((this.locationCode==null && other.getLocationCode()==null) || 
             (this.locationCode!=null &&
              this.locationCode.equals(other.getLocationCode()))) &&
            ((this.modifiedDate==null && other.getModifiedDate()==null) || 
             (this.modifiedDate!=null &&
              this.modifiedDate.equals(other.getModifiedDate()))) &&
            ((this.originAddressId==null && other.getOriginAddressId()==null) || 
             (this.originAddressId!=null &&
              this.originAddressId.equals(other.getOriginAddressId()))) &&
            ((this.paymentDate==null && other.getPaymentDate()==null) || 
             (this.paymentDate!=null &&
              this.paymentDate.equals(other.getPaymentDate()))) &&
            ((this.purchaseOrderNo==null && other.getPurchaseOrderNo()==null) || 
             (this.purchaseOrderNo!=null &&
              this.purchaseOrderNo.equals(other.getPurchaseOrderNo()))) &&
            ((this.referenceCode==null && other.getReferenceCode()==null) || 
             (this.referenceCode!=null &&
              this.referenceCode.equals(other.getReferenceCode()))) &&
            ((this.salespersonCode==null && other.getSalespersonCode()==null) || 
             (this.salespersonCode!=null &&
              this.salespersonCode.equals(other.getSalespersonCode()))) &&
            ((this.softwareVersion==null && other.getSoftwareVersion()==null) || 
             (this.softwareVersion!=null &&
              this.softwareVersion.equals(other.getSoftwareVersion()))) &&
            ((this.taxDate==null && other.getTaxDate()==null) || 
             (this.taxDate!=null &&
              this.taxDate.equals(other.getTaxDate()))) &&
            ((this.taxOverrideTypeId==null && other.getTaxOverrideTypeId()==null) || 
             (this.taxOverrideTypeId!=null &&
              this.taxOverrideTypeId.equals(other.getTaxOverrideTypeId()))) &&
            ((this.taxOverrideAmount==null && other.getTaxOverrideAmount()==null) || 
             (this.taxOverrideAmount!=null &&
              this.taxOverrideAmount.equals(other.getTaxOverrideAmount()))) &&
            ((this.taxOverrideReason==null && other.getTaxOverrideReason()==null) || 
             (this.taxOverrideReason!=null &&
              this.taxOverrideReason.equals(other.getTaxOverrideReason()))) &&
            ((this.totalAmount==null && other.getTotalAmount()==null) || 
             (this.totalAmount!=null &&
              this.totalAmount.equals(other.getTotalAmount()))) &&
            ((this.totalExempt==null && other.getTotalExempt()==null) || 
             (this.totalExempt!=null &&
              this.totalExempt.equals(other.getTotalExempt()))) &&
            ((this.totalTax==null && other.getTotalTax()==null) || 
             (this.totalTax!=null &&
              this.totalTax.equals(other.getTotalTax()))) &&
            ((this.totalTaxCalculated==null && other.getTotalTaxCalculated()==null) || 
             (this.totalTaxCalculated!=null &&
              this.totalTaxCalculated.equals(other.getTotalTaxCalculated()))) &&
            ((this.totalTaxable==null && other.getTotalTaxable()==null) || 
             (this.totalTaxable!=null &&
              this.totalTaxable.equals(other.getTotalTaxable()))) &&
            this.version == other.getVersion();
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
        if (getAdjustmentReasonId() != null) {
            _hashCode += getAdjustmentReasonId().hashCode();
        }
        if (getAdjustmentDescription() != null) {
            _hashCode += getAdjustmentDescription().hashCode();
        }
        if (getAddresses() != null) {
            _hashCode += getAddresses().hashCode();
        }
        if (getBatchCode() != null) {
            _hashCode += getBatchCode().hashCode();
        }
        _hashCode += getCompanyId();
        if (getCurrencyCode() != null) {
            _hashCode += getCurrencyCode().hashCode();
        }
        if (getCustomerUsageType() != null) {
            _hashCode += getCustomerUsageType().hashCode();
        }
        if (getCustomerVendorCode() != null) {
            _hashCode += getCustomerVendorCode().hashCode();
        }
        if (getDestinationAddressId() != null) {
            _hashCode += getDestinationAddressId().hashCode();
        }
        if (getDocumentCode() != null) {
            _hashCode += getDocumentCode().hashCode();
        }
        if (getDocumentDate() != null) {
            _hashCode += getDocumentDate().hashCode();
        }
        _hashCode += new Long(getDocumentId()).hashCode();
        if (getDocumentStatusId() != null) {
            _hashCode += getDocumentStatusId().hashCode();
        }
        if (getDocumentTypeId() != null) {
            _hashCode += getDocumentTypeId().hashCode();
        }
        if (getExemptNo() != null) {
            _hashCode += getExemptNo().hashCode();
        }
        if (getExchangeRateEffDate() != null) {
            _hashCode += getExchangeRateEffDate().hashCode();
        }
        if (getExchangeRate() != null) {
            _hashCode += getExchangeRate().hashCode();
        }
        _hashCode += (isIsLocked() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsReconciled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getLines() != null) {
            _hashCode += getLines().hashCode();
        }
        if (getLocationCode() != null) {
            _hashCode += getLocationCode().hashCode();
        }
        if (getModifiedDate() != null) {
            _hashCode += getModifiedDate().hashCode();
        }
        if (getOriginAddressId() != null) {
            _hashCode += getOriginAddressId().hashCode();
        }
        if (getPaymentDate() != null) {
            _hashCode += getPaymentDate().hashCode();
        }
        if (getPurchaseOrderNo() != null) {
            _hashCode += getPurchaseOrderNo().hashCode();
        }
        if (getReferenceCode() != null) {
            _hashCode += getReferenceCode().hashCode();
        }
        if (getSalespersonCode() != null) {
            _hashCode += getSalespersonCode().hashCode();
        }
        if (getSoftwareVersion() != null) {
            _hashCode += getSoftwareVersion().hashCode();
        }
        if (getTaxDate() != null) {
            _hashCode += getTaxDate().hashCode();
        }
        if (getTaxOverrideTypeId() != null) {
            _hashCode += getTaxOverrideTypeId().hashCode();
        }
        if (getTaxOverrideAmount() != null) {
            _hashCode += getTaxOverrideAmount().hashCode();
        }
        if (getTaxOverrideReason() != null) {
            _hashCode += getTaxOverrideReason().hashCode();
        }
        if (getTotalAmount() != null) {
            _hashCode += getTotalAmount().hashCode();
        }
        if (getTotalExempt() != null) {
            _hashCode += getTotalExempt().hashCode();
        }
        if (getTotalTax() != null) {
            _hashCode += getTotalTax().hashCode();
        }
        if (getTotalTaxCalculated() != null) {
            _hashCode += getTotalTaxCalculated().hashCode();
        }
        if (getTotalTaxable() != null) {
            _hashCode += getTotalTaxable().hashCode();
        }
        _hashCode += getVersion();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Document.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Document"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjustmentReasonId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "AdjustmentReasonId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedByte"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjustmentDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "AdjustmentDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addresses");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Addresses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ArrayOfDocumentAddress"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "BatchCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("currencyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CurrencyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("customerVendorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CustomerVendorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationAddressId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "DestinationAddressId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "DocumentCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "DocumentDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "DocumentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentStatusId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "DocumentStatusId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "DocumentStatusId"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "DocumentTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "DocumentTypeId"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exemptNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ExemptNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exchangeRateEffDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ExchangeRateEffDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exchangeRate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ExchangeRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isLocked");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "IsLocked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isReconciled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "IsReconciled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lines");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Lines"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ArrayOfDocumentLine"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "LocationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originAddressId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "OriginAddressId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "PaymentDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseOrderNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "PurchaseOrderNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ReferenceCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salespersonCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "SalespersonCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("softwareVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "SoftwareVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "TaxDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxOverrideTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "TaxOverrideTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "TaxOverrideTypeId"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxOverrideAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "TaxOverrideAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxOverrideReason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "TaxOverrideReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "TotalAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalExempt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "TotalExempt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalTax");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "TotalTax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalTaxCalculated");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "TotalTaxCalculated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalTaxable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "IsLocked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Version"));
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
