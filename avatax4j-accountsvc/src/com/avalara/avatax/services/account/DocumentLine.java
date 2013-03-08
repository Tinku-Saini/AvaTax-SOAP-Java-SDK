/**
 * DocumentLine.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.account;

public class DocumentLine  implements java.io.Serializable {
    private int accountingMethodId;
    private int boundaryOverrideId;
    private java.lang.String customerUsageType;
    private java.lang.String description;
    private long destinationAddressId;
    private com.avalara.avatax.services.account.ArrayOfDocumentLineDetail details;
    private java.math.BigDecimal discountAmount;
    private long documentId;
    private long documentLineId;
    private java.math.BigDecimal exemptAmount;
    private int exemptCertId;
    private java.lang.String exemptNo;
    private boolean isItemTaxable;
    private boolean isSTP;
    private java.lang.String itemCode;
    private java.math.BigDecimal lineAmount;
    private java.lang.String lineNo;
    private long originAddressId;
    private java.math.BigDecimal quantity;
    private java.lang.String ref1;
    private java.lang.String ref2;
    private java.util.Date reportingDate;
    private java.lang.String revAccount;
    private java.lang.String sourcing;
    private java.math.BigDecimal tax;
    private java.math.BigDecimal taxableAmount;
    private java.math.BigDecimal taxCalculated;
    private java.lang.String taxCode;
    private int taxCodeId;
    private java.util.Date taxDate;
    private boolean taxIncluded;
    private com.avalara.avatax.services.account.TaxOverrideTypeId taxOverrideTypeId;
    private java.math.BigDecimal taxOverrideAmount;
    private java.lang.String taxOverrideReason;
    private java.lang.String taxEngine;

    public DocumentLine() {
    }

    public DocumentLine(
           int accountingMethodId,
           int boundaryOverrideId,
           java.lang.String customerUsageType,
           java.lang.String description,
           long destinationAddressId,
           com.avalara.avatax.services.account.ArrayOfDocumentLineDetail details,
           java.math.BigDecimal discountAmount,
           long documentId,
           long documentLineId,
           java.math.BigDecimal exemptAmount,
           int exemptCertId,
           java.lang.String exemptNo,
           boolean isItemTaxable,
           boolean isSTP,
           java.lang.String itemCode,
           java.math.BigDecimal lineAmount,
           java.lang.String lineNo,
           long originAddressId,
           java.math.BigDecimal quantity,
           java.lang.String ref1,
           java.lang.String ref2,
           java.util.Date reportingDate,
           java.lang.String revAccount,
           java.lang.String sourcing,
           java.math.BigDecimal tax,
           java.math.BigDecimal taxableAmount,
           java.math.BigDecimal taxCalculated,
           java.lang.String taxCode,
           int taxCodeId,
           java.util.Date taxDate,
           boolean taxIncluded,
           com.avalara.avatax.services.account.TaxOverrideTypeId taxOverrideTypeId,
           java.math.BigDecimal taxOverrideAmount,
           java.lang.String taxOverrideReason,
           java.lang.String taxEngine) {
           this.accountingMethodId = accountingMethodId;
           this.boundaryOverrideId = boundaryOverrideId;
           this.customerUsageType = customerUsageType;
           this.description = description;
           this.destinationAddressId = destinationAddressId;
           this.details = details;
           this.discountAmount = discountAmount;
           this.documentId = documentId;
           this.documentLineId = documentLineId;
           this.exemptAmount = exemptAmount;
           this.exemptCertId = exemptCertId;
           this.exemptNo = exemptNo;
           this.isItemTaxable = isItemTaxable;
           this.isSTP = isSTP;
           this.itemCode = itemCode;
           this.lineAmount = lineAmount;
           this.lineNo = lineNo;
           this.originAddressId = originAddressId;
           this.quantity = quantity;
           this.ref1 = ref1;
           this.ref2 = ref2;
           this.reportingDate = reportingDate;
           this.revAccount = revAccount;
           this.sourcing = sourcing;
           this.tax = tax;
           this.taxableAmount = taxableAmount;
           this.taxCalculated = taxCalculated;
           this.taxCode = taxCode;
           this.taxCodeId = taxCodeId;
           this.taxDate = taxDate;
           this.taxIncluded = taxIncluded;
           this.taxOverrideTypeId = taxOverrideTypeId;
           this.taxOverrideAmount = taxOverrideAmount;
           this.taxOverrideReason = taxOverrideReason;
           this.taxEngine = taxEngine;
    }


    /**
     * Gets the accountingMethodId value for this DocumentLine.
     * 
     * @return accountingMethodId
     */
    public int getAccountingMethodId() {
        return accountingMethodId;
    }


    /**
     * Sets the accountingMethodId value for this DocumentLine.
     * 
     * @param accountingMethodId
     */
    public void setAccountingMethodId(int accountingMethodId) {
        this.accountingMethodId = accountingMethodId;
    }


    /**
     * Gets the boundaryOverrideId value for this DocumentLine.
     * 
     * @return boundaryOverrideId
     */
    public int getBoundaryOverrideId() {
        return boundaryOverrideId;
    }


    /**
     * Sets the boundaryOverrideId value for this DocumentLine.
     * 
     * @param boundaryOverrideId
     */
    public void setBoundaryOverrideId(int boundaryOverrideId) {
        this.boundaryOverrideId = boundaryOverrideId;
    }


    /**
     * Gets the customerUsageType value for this DocumentLine.
     * 
     * @return customerUsageType
     */
    public java.lang.String getCustomerUsageType() {
        return customerUsageType;
    }


    /**
     * Sets the customerUsageType value for this DocumentLine.
     * 
     * @param customerUsageType
     */
    public void setCustomerUsageType(java.lang.String customerUsageType) {
        this.customerUsageType = customerUsageType;
    }


    /**
     * Gets the description value for this DocumentLine.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this DocumentLine.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the destinationAddressId value for this DocumentLine.
     * 
     * @return destinationAddressId
     */
    public long getDestinationAddressId() {
        return destinationAddressId;
    }


    /**
     * Sets the destinationAddressId value for this DocumentLine.
     * 
     * @param destinationAddressId
     */
    public void setDestinationAddressId(long destinationAddressId) {
        this.destinationAddressId = destinationAddressId;
    }


    /**
     * Gets the details value for this DocumentLine.
     * 
     * @return details
     */
    public com.avalara.avatax.services.account.ArrayOfDocumentLineDetail getDetails() {
        return details;
    }


    /**
     * Sets the details value for this DocumentLine.
     * 
     * @param details
     */
    public void setDetails(com.avalara.avatax.services.account.ArrayOfDocumentLineDetail details) {
        this.details = details;
    }


    /**
     * Gets the discountAmount value for this DocumentLine.
     * 
     * @return discountAmount
     */
    public java.math.BigDecimal getDiscountAmount() {
        return discountAmount;
    }


    /**
     * Sets the discountAmount value for this DocumentLine.
     * 
     * @param discountAmount
     */
    public void setDiscountAmount(java.math.BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }


    /**
     * Gets the documentId value for this DocumentLine.
     * 
     * @return documentId
     */
    public long getDocumentId() {
        return documentId;
    }


    /**
     * Sets the documentId value for this DocumentLine.
     * 
     * @param documentId
     */
    public void setDocumentId(long documentId) {
        this.documentId = documentId;
    }


    /**
     * Gets the documentLineId value for this DocumentLine.
     * 
     * @return documentLineId
     */
    public long getDocumentLineId() {
        return documentLineId;
    }


    /**
     * Sets the documentLineId value for this DocumentLine.
     * 
     * @param documentLineId
     */
    public void setDocumentLineId(long documentLineId) {
        this.documentLineId = documentLineId;
    }


    /**
     * Gets the exemptAmount value for this DocumentLine.
     * 
     * @return exemptAmount
     */
    public java.math.BigDecimal getExemptAmount() {
        return exemptAmount;
    }


    /**
     * Sets the exemptAmount value for this DocumentLine.
     * 
     * @param exemptAmount
     */
    public void setExemptAmount(java.math.BigDecimal exemptAmount) {
        this.exemptAmount = exemptAmount;
    }


    /**
     * Gets the exemptCertId value for this DocumentLine.
     * 
     * @return exemptCertId
     */
    public int getExemptCertId() {
        return exemptCertId;
    }


    /**
     * Sets the exemptCertId value for this DocumentLine.
     * 
     * @param exemptCertId
     */
    public void setExemptCertId(int exemptCertId) {
        this.exemptCertId = exemptCertId;
    }


    /**
     * Gets the exemptNo value for this DocumentLine.
     * 
     * @return exemptNo
     */
    public java.lang.String getExemptNo() {
        return exemptNo;
    }


    /**
     * Sets the exemptNo value for this DocumentLine.
     * 
     * @param exemptNo
     */
    public void setExemptNo(java.lang.String exemptNo) {
        this.exemptNo = exemptNo;
    }


    /**
     * Gets the isItemTaxable value for this DocumentLine.
     * 
     * @return isItemTaxable
     */
    public boolean isIsItemTaxable() {
        return isItemTaxable;
    }


    /**
     * Sets the isItemTaxable value for this DocumentLine.
     * 
     * @param isItemTaxable
     */
    public void setIsItemTaxable(boolean isItemTaxable) {
        this.isItemTaxable = isItemTaxable;
    }


    /**
     * Gets the isSTP value for this DocumentLine.
     * 
     * @return isSTP
     */
    public boolean isIsSTP() {
        return isSTP;
    }


    /**
     * Sets the isSTP value for this DocumentLine.
     * 
     * @param isSTP
     */
    public void setIsSTP(boolean isSTP) {
        this.isSTP = isSTP;
    }


    /**
     * Gets the itemCode value for this DocumentLine.
     * 
     * @return itemCode
     */
    public java.lang.String getItemCode() {
        return itemCode;
    }


    /**
     * Sets the itemCode value for this DocumentLine.
     * 
     * @param itemCode
     */
    public void setItemCode(java.lang.String itemCode) {
        this.itemCode = itemCode;
    }


    /**
     * Gets the lineAmount value for this DocumentLine.
     * 
     * @return lineAmount
     */
    public java.math.BigDecimal getLineAmount() {
        return lineAmount;
    }


    /**
     * Sets the lineAmount value for this DocumentLine.
     * 
     * @param lineAmount
     */
    public void setLineAmount(java.math.BigDecimal lineAmount) {
        this.lineAmount = lineAmount;
    }


    /**
     * Gets the lineNo value for this DocumentLine.
     * 
     * @return lineNo
     */
    public java.lang.String getLineNo() {
        return lineNo;
    }


    /**
     * Sets the lineNo value for this DocumentLine.
     * 
     * @param lineNo
     */
    public void setLineNo(java.lang.String lineNo) {
        this.lineNo = lineNo;
    }


    /**
     * Gets the originAddressId value for this DocumentLine.
     * 
     * @return originAddressId
     */
    public long getOriginAddressId() {
        return originAddressId;
    }


    /**
     * Sets the originAddressId value for this DocumentLine.
     * 
     * @param originAddressId
     */
    public void setOriginAddressId(long originAddressId) {
        this.originAddressId = originAddressId;
    }


    /**
     * Gets the quantity value for this DocumentLine.
     * 
     * @return quantity
     */
    public java.math.BigDecimal getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this DocumentLine.
     * 
     * @param quantity
     */
    public void setQuantity(java.math.BigDecimal quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the ref1 value for this DocumentLine.
     * 
     * @return ref1
     */
    public java.lang.String getRef1() {
        return ref1;
    }


    /**
     * Sets the ref1 value for this DocumentLine.
     * 
     * @param ref1
     */
    public void setRef1(java.lang.String ref1) {
        this.ref1 = ref1;
    }


    /**
     * Gets the ref2 value for this DocumentLine.
     * 
     * @return ref2
     */
    public java.lang.String getRef2() {
        return ref2;
    }


    /**
     * Sets the ref2 value for this DocumentLine.
     * 
     * @param ref2
     */
    public void setRef2(java.lang.String ref2) {
        this.ref2 = ref2;
    }


    /**
     * Gets the reportingDate value for this DocumentLine.
     * 
     * @return reportingDate
     */
    public java.util.Date getReportingDate() {
        return reportingDate;
    }


    /**
     * Sets the reportingDate value for this DocumentLine.
     * 
     * @param reportingDate
     */
    public void setReportingDate(java.util.Date reportingDate) {
        this.reportingDate = reportingDate;
    }


    /**
     * Gets the revAccount value for this DocumentLine.
     * 
     * @return revAccount
     */
    public java.lang.String getRevAccount() {
        return revAccount;
    }


    /**
     * Sets the revAccount value for this DocumentLine.
     * 
     * @param revAccount
     */
    public void setRevAccount(java.lang.String revAccount) {
        this.revAccount = revAccount;
    }


    /**
     * Gets the sourcing value for this DocumentLine.
     * 
     * @return sourcing
     */
    public java.lang.String getSourcing() {
        return sourcing;
    }


    /**
     * Sets the sourcing value for this DocumentLine.
     * 
     * @param sourcing
     */
    public void setSourcing(java.lang.String sourcing) {
        this.sourcing = sourcing;
    }


    /**
     * Gets the tax value for this DocumentLine.
     * 
     * @return tax
     */
    public java.math.BigDecimal getTax() {
        return tax;
    }


    /**
     * Sets the tax value for this DocumentLine.
     * 
     * @param tax
     */
    public void setTax(java.math.BigDecimal tax) {
        this.tax = tax;
    }


    /**
     * Gets the taxableAmount value for this DocumentLine.
     * 
     * @return taxableAmount
     */
    public java.math.BigDecimal getTaxableAmount() {
        return taxableAmount;
    }


    /**
     * Sets the taxableAmount value for this DocumentLine.
     * 
     * @param taxableAmount
     */
    public void setTaxableAmount(java.math.BigDecimal taxableAmount) {
        this.taxableAmount = taxableAmount;
    }


    /**
     * Gets the taxCalculated value for this DocumentLine.
     * 
     * @return taxCalculated
     */
    public java.math.BigDecimal getTaxCalculated() {
        return taxCalculated;
    }


    /**
     * Sets the taxCalculated value for this DocumentLine.
     * 
     * @param taxCalculated
     */
    public void setTaxCalculated(java.math.BigDecimal taxCalculated) {
        this.taxCalculated = taxCalculated;
    }


    /**
     * Gets the taxCode value for this DocumentLine.
     * 
     * @return taxCode
     */
    public java.lang.String getTaxCode() {
        return taxCode;
    }


    /**
     * Sets the taxCode value for this DocumentLine.
     * 
     * @param taxCode
     */
    public void setTaxCode(java.lang.String taxCode) {
        this.taxCode = taxCode;
    }


    /**
     * Gets the taxCodeId value for this DocumentLine.
     * 
     * @return taxCodeId
     */
    public int getTaxCodeId() {
        return taxCodeId;
    }


    /**
     * Sets the taxCodeId value for this DocumentLine.
     * 
     * @param taxCodeId
     */
    public void setTaxCodeId(int taxCodeId) {
        this.taxCodeId = taxCodeId;
    }


    /**
     * Gets the taxDate value for this DocumentLine.
     * 
     * @return taxDate
     */
    public java.util.Date getTaxDate() {
        return taxDate;
    }


    /**
     * Sets the taxDate value for this DocumentLine.
     * 
     * @param taxDate
     */
    public void setTaxDate(java.util.Date taxDate) {
        this.taxDate = taxDate;
    }


    /**
     * Gets the taxIncluded value for this DocumentLine.
     * 
     * @return taxIncluded
     */
    public boolean isTaxIncluded() {
        return taxIncluded;
    }


    /**
     * Sets the taxIncluded value for this DocumentLine.
     * 
     * @param taxIncluded
     */
    public void setTaxIncluded(boolean taxIncluded) {
        this.taxIncluded = taxIncluded;
    }


    /**
     * Gets the taxOverrideTypeId value for this DocumentLine.
     * 
     * @return taxOverrideTypeId
     */
    public com.avalara.avatax.services.account.TaxOverrideTypeId getTaxOverrideTypeId() {
        return taxOverrideTypeId;
    }


    /**
     * Sets the taxOverrideTypeId value for this DocumentLine.
     * 
     * @param taxOverrideTypeId
     */
    public void setTaxOverrideTypeId(com.avalara.avatax.services.account.TaxOverrideTypeId taxOverrideTypeId) {
        this.taxOverrideTypeId = taxOverrideTypeId;
    }


    /**
     * Gets the taxOverrideAmount value for this DocumentLine.
     * 
     * @return taxOverrideAmount
     */
    public java.math.BigDecimal getTaxOverrideAmount() {
        return taxOverrideAmount;
    }


    /**
     * Sets the taxOverrideAmount value for this DocumentLine.
     * 
     * @param taxOverrideAmount
     */
    public void setTaxOverrideAmount(java.math.BigDecimal taxOverrideAmount) {
        this.taxOverrideAmount = taxOverrideAmount;
    }


    /**
     * Gets the taxOverrideReason value for this DocumentLine.
     * 
     * @return taxOverrideReason
     */
    public java.lang.String getTaxOverrideReason() {
        return taxOverrideReason;
    }


    /**
     * Sets the taxOverrideReason value for this DocumentLine.
     * 
     * @param taxOverrideReason
     */
    public void setTaxOverrideReason(java.lang.String taxOverrideReason) {
        this.taxOverrideReason = taxOverrideReason;
    }


    /**
     * Gets the taxEngine value for this DocumentLine.
     * 
     * @return taxEngine
     */
    public java.lang.String getTaxEngine() {
        return taxEngine;
    }


    /**
     * Sets the taxEngine value for this DocumentLine.
     * 
     * @param taxEngine
     */
    public void setTaxEngine(java.lang.String taxEngine) {
        this.taxEngine = taxEngine;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DocumentLine)) return false;
        DocumentLine other = (DocumentLine) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.accountingMethodId == other.getAccountingMethodId() &&
            this.boundaryOverrideId == other.getBoundaryOverrideId() &&
            ((this.customerUsageType==null && other.getCustomerUsageType()==null) || 
             (this.customerUsageType!=null &&
              this.customerUsageType.equals(other.getCustomerUsageType()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            this.destinationAddressId == other.getDestinationAddressId() &&
            ((this.details==null && other.getDetails()==null) || 
             (this.details!=null &&
              this.details.equals(other.getDetails()))) &&
            ((this.discountAmount==null && other.getDiscountAmount()==null) || 
             (this.discountAmount!=null &&
              this.discountAmount.equals(other.getDiscountAmount()))) &&
            this.documentId == other.getDocumentId() &&
            this.documentLineId == other.getDocumentLineId() &&
            ((this.exemptAmount==null && other.getExemptAmount()==null) || 
             (this.exemptAmount!=null &&
              this.exemptAmount.equals(other.getExemptAmount()))) &&
            this.exemptCertId == other.getExemptCertId() &&
            ((this.exemptNo==null && other.getExemptNo()==null) || 
             (this.exemptNo!=null &&
              this.exemptNo.equals(other.getExemptNo()))) &&
            this.isItemTaxable == other.isIsItemTaxable() &&
            this.isSTP == other.isIsSTP() &&
            ((this.itemCode==null && other.getItemCode()==null) || 
             (this.itemCode!=null &&
              this.itemCode.equals(other.getItemCode()))) &&
            ((this.lineAmount==null && other.getLineAmount()==null) || 
             (this.lineAmount!=null &&
              this.lineAmount.equals(other.getLineAmount()))) &&
            ((this.lineNo==null && other.getLineNo()==null) || 
             (this.lineNo!=null &&
              this.lineNo.equals(other.getLineNo()))) &&
            this.originAddressId == other.getOriginAddressId() &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.ref1==null && other.getRef1()==null) || 
             (this.ref1!=null &&
              this.ref1.equals(other.getRef1()))) &&
            ((this.ref2==null && other.getRef2()==null) || 
             (this.ref2!=null &&
              this.ref2.equals(other.getRef2()))) &&
            ((this.reportingDate==null && other.getReportingDate()==null) || 
             (this.reportingDate!=null &&
              this.reportingDate.equals(other.getReportingDate()))) &&
            ((this.revAccount==null && other.getRevAccount()==null) || 
             (this.revAccount!=null &&
              this.revAccount.equals(other.getRevAccount()))) &&
            ((this.sourcing==null && other.getSourcing()==null) || 
             (this.sourcing!=null &&
              this.sourcing.equals(other.getSourcing()))) &&
            ((this.tax==null && other.getTax()==null) || 
             (this.tax!=null &&
              this.tax.equals(other.getTax()))) &&
            ((this.taxableAmount==null && other.getTaxableAmount()==null) || 
             (this.taxableAmount!=null &&
              this.taxableAmount.equals(other.getTaxableAmount()))) &&
            ((this.taxCalculated==null && other.getTaxCalculated()==null) || 
             (this.taxCalculated!=null &&
              this.taxCalculated.equals(other.getTaxCalculated()))) &&
            ((this.taxCode==null && other.getTaxCode()==null) || 
             (this.taxCode!=null &&
              this.taxCode.equals(other.getTaxCode()))) &&
            this.taxCodeId == other.getTaxCodeId() &&
            ((this.taxDate==null && other.getTaxDate()==null) || 
             (this.taxDate!=null &&
              this.taxDate.equals(other.getTaxDate()))) &&
            this.taxIncluded == other.isTaxIncluded() &&
            ((this.taxOverrideTypeId==null && other.getTaxOverrideTypeId()==null) || 
             (this.taxOverrideTypeId!=null &&
              this.taxOverrideTypeId.equals(other.getTaxOverrideTypeId()))) &&
            ((this.taxOverrideAmount==null && other.getTaxOverrideAmount()==null) || 
             (this.taxOverrideAmount!=null &&
              this.taxOverrideAmount.equals(other.getTaxOverrideAmount()))) &&
            ((this.taxOverrideReason==null && other.getTaxOverrideReason()==null) || 
             (this.taxOverrideReason!=null &&
              this.taxOverrideReason.equals(other.getTaxOverrideReason()))) &&
            ((this.taxEngine==null && other.getTaxEngine()==null) || 
             (this.taxEngine!=null &&
              this.taxEngine.equals(other.getTaxEngine())));
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
        _hashCode += getAccountingMethodId();
        _hashCode += getBoundaryOverrideId();
        if (getCustomerUsageType() != null) {
            _hashCode += getCustomerUsageType().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        _hashCode += new Long(getDestinationAddressId()).hashCode();
        if (getDetails() != null) {
            _hashCode += getDetails().hashCode();
        }
        if (getDiscountAmount() != null) {
            _hashCode += getDiscountAmount().hashCode();
        }
        _hashCode += new Long(getDocumentId()).hashCode();
        _hashCode += new Long(getDocumentLineId()).hashCode();
        if (getExemptAmount() != null) {
            _hashCode += getExemptAmount().hashCode();
        }
        _hashCode += getExemptCertId();
        if (getExemptNo() != null) {
            _hashCode += getExemptNo().hashCode();
        }
        _hashCode += (isIsItemTaxable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsSTP() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getItemCode() != null) {
            _hashCode += getItemCode().hashCode();
        }
        if (getLineAmount() != null) {
            _hashCode += getLineAmount().hashCode();
        }
        if (getLineNo() != null) {
            _hashCode += getLineNo().hashCode();
        }
        _hashCode += new Long(getOriginAddressId()).hashCode();
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        if (getRef1() != null) {
            _hashCode += getRef1().hashCode();
        }
        if (getRef2() != null) {
            _hashCode += getRef2().hashCode();
        }
        if (getReportingDate() != null) {
            _hashCode += getReportingDate().hashCode();
        }
        if (getRevAccount() != null) {
            _hashCode += getRevAccount().hashCode();
        }
        if (getSourcing() != null) {
            _hashCode += getSourcing().hashCode();
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
        if (getTaxCode() != null) {
            _hashCode += getTaxCode().hashCode();
        }
        _hashCode += getTaxCodeId();
        if (getTaxDate() != null) {
            _hashCode += getTaxDate().hashCode();
        }
        _hashCode += (isTaxIncluded() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getTaxOverrideTypeId() != null) {
            _hashCode += getTaxOverrideTypeId().hashCode();
        }
        if (getTaxOverrideAmount() != null) {
            _hashCode += getTaxOverrideAmount().hashCode();
        }
        if (getTaxOverrideReason() != null) {
            _hashCode += getTaxOverrideReason().hashCode();
        }
        if (getTaxEngine() != null) {
            _hashCode += getTaxEngine().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DocumentLine.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "DocumentLine"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountingMethodId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "AccountingMethodId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("boundaryOverrideId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "BoundaryOverrideId"));
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
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationAddressId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "DestinationAddressId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("details");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Details"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ArrayOfDocumentLineDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discountAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "DiscountAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "DocumentId"));
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
        elemField.setFieldName("exemptCertId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ExemptCertId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("isItemTaxable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "IsItemTaxable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSTP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "IsSTP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ItemCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "LineAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "LineNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originAddressId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "OriginAddressId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ref1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Ref1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ref2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Ref2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportingDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ReportingDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "RevAccount"));
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
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "TaxCode"));
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
        elemField.setFieldName("taxDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "TaxDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxIncluded");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "TaxIncluded"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("taxEngine");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "TaxEngine"));
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
