/**
 * CompanyLocation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.account;

public class CompanyLocation  implements java.io.Serializable {
    private int companyLocationId;
    private int companyId;
    private java.lang.String locationCode;
    private java.lang.String description;
    private int addressTypeId;
    private int addressCategoryId;
    private java.lang.String line1;
    private java.lang.String line2;
    private java.lang.String line3;
    private java.lang.String city;
    private java.lang.String region;
    private java.lang.String postalCode;
    private java.lang.String country;
    private java.lang.String stateAssignedCode;
    private int createdUserId;
    private java.util.Calendar createdDate;
    private int modifiedUserId;
    private java.util.Calendar modifiedDate;
    private boolean isDefault;
    private java.lang.String addressCategoryDescription;
    private java.lang.String addressTypeDescription;

    public CompanyLocation() {
    }

    public CompanyLocation(
           int companyLocationId,
           int companyId,
           java.lang.String locationCode,
           java.lang.String description,
           int addressTypeId,
           int addressCategoryId,
           java.lang.String line1,
           java.lang.String line2,
           java.lang.String line3,
           java.lang.String city,
           java.lang.String region,
           java.lang.String postalCode,
           java.lang.String country,
           java.lang.String stateAssignedCode,
           int createdUserId,
           java.util.Calendar createdDate,
           int modifiedUserId,
           java.util.Calendar modifiedDate,
           boolean isDefault,
           java.lang.String addressCategoryDescription,
           java.lang.String addressTypeDescription) {
           this.companyLocationId = companyLocationId;
           this.companyId = companyId;
           this.locationCode = locationCode;
           this.description = description;
           this.addressTypeId = addressTypeId;
           this.addressCategoryId = addressCategoryId;
           this.line1 = line1;
           this.line2 = line2;
           this.line3 = line3;
           this.city = city;
           this.region = region;
           this.postalCode = postalCode;
           this.country = country;
           this.stateAssignedCode = stateAssignedCode;
           this.createdUserId = createdUserId;
           this.createdDate = createdDate;
           this.modifiedUserId = modifiedUserId;
           this.modifiedDate = modifiedDate;
           this.isDefault = isDefault;
           this.addressCategoryDescription = addressCategoryDescription;
           this.addressTypeDescription = addressTypeDescription;
    }


    /**
     * Gets the companyLocationId value for this CompanyLocation.
     * 
     * @return companyLocationId
     */
    public int getCompanyLocationId() {
        return companyLocationId;
    }


    /**
     * Sets the companyLocationId value for this CompanyLocation.
     * 
     * @param companyLocationId
     */
    public void setCompanyLocationId(int companyLocationId) {
        this.companyLocationId = companyLocationId;
    }


    /**
     * Gets the companyId value for this CompanyLocation.
     * 
     * @return companyId
     */
    public int getCompanyId() {
        return companyId;
    }


    /**
     * Sets the companyId value for this CompanyLocation.
     * 
     * @param companyId
     */
    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }


    /**
     * Gets the locationCode value for this CompanyLocation.
     * 
     * @return locationCode
     */
    public java.lang.String getLocationCode() {
        return locationCode;
    }


    /**
     * Sets the locationCode value for this CompanyLocation.
     * 
     * @param locationCode
     */
    public void setLocationCode(java.lang.String locationCode) {
        this.locationCode = locationCode;
    }


    /**
     * Gets the description value for this CompanyLocation.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this CompanyLocation.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the addressTypeId value for this CompanyLocation.
     * 
     * @return addressTypeId
     */
    public int getAddressTypeId() {
        return addressTypeId;
    }


    /**
     * Sets the addressTypeId value for this CompanyLocation.
     * 
     * @param addressTypeId
     */
    public void setAddressTypeId(int addressTypeId) {
        this.addressTypeId = addressTypeId;
    }


    /**
     * Gets the addressCategoryId value for this CompanyLocation.
     * 
     * @return addressCategoryId
     */
    public int getAddressCategoryId() {
        return addressCategoryId;
    }


    /**
     * Sets the addressCategoryId value for this CompanyLocation.
     * 
     * @param addressCategoryId
     */
    public void setAddressCategoryId(int addressCategoryId) {
        this.addressCategoryId = addressCategoryId;
    }


    /**
     * Gets the line1 value for this CompanyLocation.
     * 
     * @return line1
     */
    public java.lang.String getLine1() {
        return line1;
    }


    /**
     * Sets the line1 value for this CompanyLocation.
     * 
     * @param line1
     */
    public void setLine1(java.lang.String line1) {
        this.line1 = line1;
    }


    /**
     * Gets the line2 value for this CompanyLocation.
     * 
     * @return line2
     */
    public java.lang.String getLine2() {
        return line2;
    }


    /**
     * Sets the line2 value for this CompanyLocation.
     * 
     * @param line2
     */
    public void setLine2(java.lang.String line2) {
        this.line2 = line2;
    }


    /**
     * Gets the line3 value for this CompanyLocation.
     * 
     * @return line3
     */
    public java.lang.String getLine3() {
        return line3;
    }


    /**
     * Sets the line3 value for this CompanyLocation.
     * 
     * @param line3
     */
    public void setLine3(java.lang.String line3) {
        this.line3 = line3;
    }


    /**
     * Gets the city value for this CompanyLocation.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this CompanyLocation.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the region value for this CompanyLocation.
     * 
     * @return region
     */
    public java.lang.String getRegion() {
        return region;
    }


    /**
     * Sets the region value for this CompanyLocation.
     * 
     * @param region
     */
    public void setRegion(java.lang.String region) {
        this.region = region;
    }


    /**
     * Gets the postalCode value for this CompanyLocation.
     * 
     * @return postalCode
     */
    public java.lang.String getPostalCode() {
        return postalCode;
    }


    /**
     * Sets the postalCode value for this CompanyLocation.
     * 
     * @param postalCode
     */
    public void setPostalCode(java.lang.String postalCode) {
        this.postalCode = postalCode;
    }


    /**
     * Gets the country value for this CompanyLocation.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this CompanyLocation.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the stateAssignedCode value for this CompanyLocation.
     * 
     * @return stateAssignedCode
     */
    public java.lang.String getStateAssignedCode() {
        return stateAssignedCode;
    }


    /**
     * Sets the stateAssignedCode value for this CompanyLocation.
     * 
     * @param stateAssignedCode
     */
    public void setStateAssignedCode(java.lang.String stateAssignedCode) {
        this.stateAssignedCode = stateAssignedCode;
    }


    /**
     * Gets the createdUserId value for this CompanyLocation.
     * 
     * @return createdUserId
     */
    public int getCreatedUserId() {
        return createdUserId;
    }


    /**
     * Sets the createdUserId value for this CompanyLocation.
     * 
     * @param createdUserId
     */
    public void setCreatedUserId(int createdUserId) {
        this.createdUserId = createdUserId;
    }


    /**
     * Gets the createdDate value for this CompanyLocation.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this CompanyLocation.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the modifiedUserId value for this CompanyLocation.
     * 
     * @return modifiedUserId
     */
    public int getModifiedUserId() {
        return modifiedUserId;
    }


    /**
     * Sets the modifiedUserId value for this CompanyLocation.
     * 
     * @param modifiedUserId
     */
    public void setModifiedUserId(int modifiedUserId) {
        this.modifiedUserId = modifiedUserId;
    }


    /**
     * Gets the modifiedDate value for this CompanyLocation.
     * 
     * @return modifiedDate
     */
    public java.util.Calendar getModifiedDate() {
        return modifiedDate;
    }


    /**
     * Sets the modifiedDate value for this CompanyLocation.
     * 
     * @param modifiedDate
     */
    public void setModifiedDate(java.util.Calendar modifiedDate) {
        this.modifiedDate = modifiedDate;
    }


    /**
     * Gets the isDefault value for this CompanyLocation.
     * 
     * @return isDefault
     */
    public boolean isIsDefault() {
        return isDefault;
    }


    /**
     * Sets the isDefault value for this CompanyLocation.
     * 
     * @param isDefault
     */
    public void setIsDefault(boolean isDefault) {
        this.isDefault = isDefault;
    }


    /**
     * Gets the addressCategoryDescription value for this CompanyLocation.
     * 
     * @return addressCategoryDescription
     */
    public java.lang.String getAddressCategoryDescription() {
        return addressCategoryDescription;
    }


    /**
     * Sets the addressCategoryDescription value for this CompanyLocation.
     * 
     * @param addressCategoryDescription
     */
    public void setAddressCategoryDescription(java.lang.String addressCategoryDescription) {
        this.addressCategoryDescription = addressCategoryDescription;
    }


    /**
     * Gets the addressTypeDescription value for this CompanyLocation.
     * 
     * @return addressTypeDescription
     */
    public java.lang.String getAddressTypeDescription() {
        return addressTypeDescription;
    }


    /**
     * Sets the addressTypeDescription value for this CompanyLocation.
     * 
     * @param addressTypeDescription
     */
    public void setAddressTypeDescription(java.lang.String addressTypeDescription) {
        this.addressTypeDescription = addressTypeDescription;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CompanyLocation)) return false;
        CompanyLocation other = (CompanyLocation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.companyLocationId == other.getCompanyLocationId() &&
            this.companyId == other.getCompanyId() &&
            ((this.locationCode==null && other.getLocationCode()==null) || 
             (this.locationCode!=null &&
              this.locationCode.equals(other.getLocationCode()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            this.addressTypeId == other.getAddressTypeId() &&
            this.addressCategoryId == other.getAddressCategoryId() &&
            ((this.line1==null && other.getLine1()==null) || 
             (this.line1!=null &&
              this.line1.equals(other.getLine1()))) &&
            ((this.line2==null && other.getLine2()==null) || 
             (this.line2!=null &&
              this.line2.equals(other.getLine2()))) &&
            ((this.line3==null && other.getLine3()==null) || 
             (this.line3!=null &&
              this.line3.equals(other.getLine3()))) &&
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
            ((this.stateAssignedCode==null && other.getStateAssignedCode()==null) || 
             (this.stateAssignedCode!=null &&
              this.stateAssignedCode.equals(other.getStateAssignedCode()))) &&
            this.createdUserId == other.getCreatedUserId() &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            this.modifiedUserId == other.getModifiedUserId() &&
            ((this.modifiedDate==null && other.getModifiedDate()==null) || 
             (this.modifiedDate!=null &&
              this.modifiedDate.equals(other.getModifiedDate()))) &&
            this.isDefault == other.isIsDefault() &&
            ((this.addressCategoryDescription==null && other.getAddressCategoryDescription()==null) || 
             (this.addressCategoryDescription!=null &&
              this.addressCategoryDescription.equals(other.getAddressCategoryDescription()))) &&
            ((this.addressTypeDescription==null && other.getAddressTypeDescription()==null) || 
             (this.addressTypeDescription!=null &&
              this.addressTypeDescription.equals(other.getAddressTypeDescription())));
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
        _hashCode += getCompanyLocationId();
        _hashCode += getCompanyId();
        if (getLocationCode() != null) {
            _hashCode += getLocationCode().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        _hashCode += getAddressTypeId();
        _hashCode += getAddressCategoryId();
        if (getLine1() != null) {
            _hashCode += getLine1().hashCode();
        }
        if (getLine2() != null) {
            _hashCode += getLine2().hashCode();
        }
        if (getLine3() != null) {
            _hashCode += getLine3().hashCode();
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
        if (getStateAssignedCode() != null) {
            _hashCode += getStateAssignedCode().hashCode();
        }
        _hashCode += getCreatedUserId();
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        _hashCode += getModifiedUserId();
        if (getModifiedDate() != null) {
            _hashCode += getModifiedDate().hashCode();
        }
        _hashCode += (isIsDefault() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getAddressCategoryDescription() != null) {
            _hashCode += getAddressCategoryDescription().hashCode();
        }
        if (getAddressTypeDescription() != null) {
            _hashCode += getAddressTypeDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CompanyLocation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CompanyLocation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyLocationId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CompanyLocationId"));
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
        elemField.setFieldName("locationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "LocationCode"));
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
        elemField.setFieldName("addressTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "AddressTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressCategoryId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "AddressCategoryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("line3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Line3"));
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
        elemField.setFieldName("stateAssignedCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "StateAssignedCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("isDefault");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "IsDefault"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressCategoryDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "AddressCategoryDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressTypeDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "AddressTypeDescription"));
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
