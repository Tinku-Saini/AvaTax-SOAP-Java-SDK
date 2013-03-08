/**
 * AvaFileForm.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.account;

public class AvaFileForm  implements java.io.Serializable {
    private int avaFileFormId;
    private java.lang.String formName;
    private java.lang.String returnName;
    private java.lang.String description;
    private java.util.Calendar effDate;
    private java.util.Calendar endDate;
    private java.lang.String region;
    private java.lang.String country;
    private int formType;
    private com.avalara.avatax.services.account.ArrayOfAvaFileFormGroup groups;

    public AvaFileForm() {
    }

    public AvaFileForm(
           int avaFileFormId,
           java.lang.String formName,
           java.lang.String returnName,
           java.lang.String description,
           java.util.Calendar effDate,
           java.util.Calendar endDate,
           java.lang.String region,
           java.lang.String country,
           int formType,
           com.avalara.avatax.services.account.ArrayOfAvaFileFormGroup groups) {
           this.avaFileFormId = avaFileFormId;
           this.formName = formName;
           this.returnName = returnName;
           this.description = description;
           this.effDate = effDate;
           this.endDate = endDate;
           this.region = region;
           this.country = country;
           this.formType = formType;
           this.groups = groups;
    }


    /**
     * Gets the avaFileFormId value for this AvaFileForm.
     * 
     * @return avaFileFormId
     */
    public int getAvaFileFormId() {
        return avaFileFormId;
    }


    /**
     * Sets the avaFileFormId value for this AvaFileForm.
     * 
     * @param avaFileFormId
     */
    public void setAvaFileFormId(int avaFileFormId) {
        this.avaFileFormId = avaFileFormId;
    }


    /**
     * Gets the formName value for this AvaFileForm.
     * 
     * @return formName
     */
    public java.lang.String getFormName() {
        return formName;
    }


    /**
     * Sets the formName value for this AvaFileForm.
     * 
     * @param formName
     */
    public void setFormName(java.lang.String formName) {
        this.formName = formName;
    }


    /**
     * Gets the returnName value for this AvaFileForm.
     * 
     * @return returnName
     */
    public java.lang.String getReturnName() {
        return returnName;
    }


    /**
     * Sets the returnName value for this AvaFileForm.
     * 
     * @param returnName
     */
    public void setReturnName(java.lang.String returnName) {
        this.returnName = returnName;
    }


    /**
     * Gets the description value for this AvaFileForm.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this AvaFileForm.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the effDate value for this AvaFileForm.
     * 
     * @return effDate
     */
    public java.util.Calendar getEffDate() {
        return effDate;
    }


    /**
     * Sets the effDate value for this AvaFileForm.
     * 
     * @param effDate
     */
    public void setEffDate(java.util.Calendar effDate) {
        this.effDate = effDate;
    }


    /**
     * Gets the endDate value for this AvaFileForm.
     * 
     * @return endDate
     */
    public java.util.Calendar getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this AvaFileForm.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Calendar endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the region value for this AvaFileForm.
     * 
     * @return region
     */
    public java.lang.String getRegion() {
        return region;
    }


    /**
     * Sets the region value for this AvaFileForm.
     * 
     * @param region
     */
    public void setRegion(java.lang.String region) {
        this.region = region;
    }


    /**
     * Gets the country value for this AvaFileForm.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this AvaFileForm.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the formType value for this AvaFileForm.
     * 
     * @return formType
     */
    public int getFormType() {
        return formType;
    }


    /**
     * Sets the formType value for this AvaFileForm.
     * 
     * @param formType
     */
    public void setFormType(int formType) {
        this.formType = formType;
    }


    /**
     * Gets the groups value for this AvaFileForm.
     * 
     * @return groups
     */
    public com.avalara.avatax.services.account.ArrayOfAvaFileFormGroup getGroups() {
        return groups;
    }


    /**
     * Sets the groups value for this AvaFileForm.
     * 
     * @param groups
     */
    public void setGroups(com.avalara.avatax.services.account.ArrayOfAvaFileFormGroup groups) {
        this.groups = groups;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AvaFileForm)) return false;
        AvaFileForm other = (AvaFileForm) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.avaFileFormId == other.getAvaFileFormId() &&
            ((this.formName==null && other.getFormName()==null) || 
             (this.formName!=null &&
              this.formName.equals(other.getFormName()))) &&
            ((this.returnName==null && other.getReturnName()==null) || 
             (this.returnName!=null &&
              this.returnName.equals(other.getReturnName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.effDate==null && other.getEffDate()==null) || 
             (this.effDate!=null &&
              this.effDate.equals(other.getEffDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.region==null && other.getRegion()==null) || 
             (this.region!=null &&
              this.region.equals(other.getRegion()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            this.formType == other.getFormType() &&
            ((this.groups==null && other.getGroups()==null) || 
             (this.groups!=null &&
              this.groups.equals(other.getGroups())));
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
        _hashCode += getAvaFileFormId();
        if (getFormName() != null) {
            _hashCode += getFormName().hashCode();
        }
        if (getReturnName() != null) {
            _hashCode += getReturnName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getEffDate() != null) {
            _hashCode += getEffDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getRegion() != null) {
            _hashCode += getRegion().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        _hashCode += getFormType();
        if (getGroups() != null) {
            _hashCode += getGroups().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AvaFileForm.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "AvaFileForm"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("avaFileFormId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "AvaFileFormId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "FormName"));
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
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "EffDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "EndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "FormType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groups");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Groups"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ArrayOfAvaFileFormGroup"));
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
