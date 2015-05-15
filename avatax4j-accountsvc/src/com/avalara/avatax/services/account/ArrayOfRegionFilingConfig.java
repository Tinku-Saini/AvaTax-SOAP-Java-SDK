/**
 * ArrayOfRegionFilingConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.account;

public class ArrayOfRegionFilingConfig  implements java.io.Serializable {
    private com.avalara.avatax.services.account.RegionFilingConfig[] regionFilingConfig;

    public ArrayOfRegionFilingConfig() {
    }

    public ArrayOfRegionFilingConfig(
           com.avalara.avatax.services.account.RegionFilingConfig[] regionFilingConfig) {
           this.regionFilingConfig = regionFilingConfig;
    }


    /**
     * Gets the regionFilingConfig value for this ArrayOfRegionFilingConfig.
     * 
     * @return regionFilingConfig
     */
    public com.avalara.avatax.services.account.RegionFilingConfig[] getRegionFilingConfig() {
        return regionFilingConfig;
    }


    /**
     * Sets the regionFilingConfig value for this ArrayOfRegionFilingConfig.
     * 
     * @param regionFilingConfig
     */
    public void setRegionFilingConfig(com.avalara.avatax.services.account.RegionFilingConfig[] regionFilingConfig) {
        this.regionFilingConfig = regionFilingConfig;
    }

    public com.avalara.avatax.services.account.RegionFilingConfig getRegionFilingConfig(int i) {
        return this.regionFilingConfig[i];
    }

    public void setRegionFilingConfig(int i, com.avalara.avatax.services.account.RegionFilingConfig _value) {
        this.regionFilingConfig[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfRegionFilingConfig)) return false;
        ArrayOfRegionFilingConfig other = (ArrayOfRegionFilingConfig) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.regionFilingConfig==null && other.getRegionFilingConfig()==null) || 
             (this.regionFilingConfig!=null &&
              java.util.Arrays.equals(this.regionFilingConfig, other.getRegionFilingConfig())));
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
        if (getRegionFilingConfig() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRegionFilingConfig());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRegionFilingConfig(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArrayOfRegionFilingConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ArrayOfRegionFilingConfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regionFilingConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "RegionFilingConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "RegionFilingConfig"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
