/**
 * RegionFilingConfigFetchResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.account;

public class RegionFilingConfigFetchResult  extends com.avalara.avatax.services.account.BaseResult  implements java.io.Serializable {
    private com.avalara.avatax.services.account.ArrayOfRegionFilingConfig regionFilingConfig;
    private int recordCount;

    public RegionFilingConfigFetchResult() {
    }

    public RegionFilingConfigFetchResult(
           com.avalara.avatax.services.account.ArrayOfRegionFilingConfig regionFilingConfig,
           int recordCount) {
           this.regionFilingConfig = regionFilingConfig;
           this.recordCount = recordCount;
    }


    /**
     * Gets the regionFilingConfig value for this RegionFilingConfigFetchResult.
     * 
     * @return regionFilingConfig
     */
    public com.avalara.avatax.services.account.ArrayOfRegionFilingConfig getRegionFilingConfig() {
        return regionFilingConfig;
    }


    /**
     * Sets the regionFilingConfig value for this RegionFilingConfigFetchResult.
     * 
     * @param regionFilingConfig
     */
    public void setRegionFilingConfig(com.avalara.avatax.services.account.ArrayOfRegionFilingConfig regionFilingConfig) {
        this.regionFilingConfig = regionFilingConfig;
    }


    /**
     * Gets the recordCount value for this RegionFilingConfigFetchResult.
     * 
     * @return recordCount
     */
    public int getRecordCount() {
        return recordCount;
    }


    /**
     * Sets the recordCount value for this RegionFilingConfigFetchResult.
     * 
     * @param recordCount
     */
    public void setRecordCount(int recordCount) {
        this.recordCount = recordCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RegionFilingConfigFetchResult)) return false;
        RegionFilingConfigFetchResult other = (RegionFilingConfigFetchResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.regionFilingConfig==null && other.getRegionFilingConfig()==null) || 
             (this.regionFilingConfig!=null &&
              this.regionFilingConfig.equals(other.getRegionFilingConfig()))) &&
            this.recordCount == other.getRecordCount();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getRegionFilingConfig() != null) {
            _hashCode += getRegionFilingConfig().hashCode();
        }
        _hashCode += getRecordCount();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RegionFilingConfigFetchResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "RegionFilingConfigFetchResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regionFilingConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "RegionFilingConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ArrayOfRegionFilingConfig"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "RecordCount"));
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
