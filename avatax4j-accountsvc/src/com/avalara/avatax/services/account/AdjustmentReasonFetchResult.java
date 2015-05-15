/**
 * AdjustmentReasonFetchResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.account;

public class AdjustmentReasonFetchResult  extends com.avalara.avatax.services.account.BaseResult  implements java.io.Serializable {
    private com.avalara.avatax.services.account.ArrayOfAdjustmentReason adjustmentReasons;
    private int recordCount;

    public AdjustmentReasonFetchResult() {
    }

    public AdjustmentReasonFetchResult(
           com.avalara.avatax.services.account.ArrayOfAdjustmentReason adjustmentReasons,
           int recordCount) {
           this.adjustmentReasons = adjustmentReasons;
           this.recordCount = recordCount;
    }


    /**
     * Gets the adjustmentReasons value for this AdjustmentReasonFetchResult.
     * 
     * @return adjustmentReasons
     */
    public com.avalara.avatax.services.account.ArrayOfAdjustmentReason getAdjustmentReasons() {
        return adjustmentReasons;
    }


    /**
     * Sets the adjustmentReasons value for this AdjustmentReasonFetchResult.
     * 
     * @param adjustmentReasons
     */
    public void setAdjustmentReasons(com.avalara.avatax.services.account.ArrayOfAdjustmentReason adjustmentReasons) {
        this.adjustmentReasons = adjustmentReasons;
    }


    /**
     * Gets the recordCount value for this AdjustmentReasonFetchResult.
     * 
     * @return recordCount
     */
    public int getRecordCount() {
        return recordCount;
    }


    /**
     * Sets the recordCount value for this AdjustmentReasonFetchResult.
     * 
     * @param recordCount
     */
    public void setRecordCount(int recordCount) {
        this.recordCount = recordCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdjustmentReasonFetchResult)) return false;
        AdjustmentReasonFetchResult other = (AdjustmentReasonFetchResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.adjustmentReasons==null && other.getAdjustmentReasons()==null) || 
             (this.adjustmentReasons!=null &&
              this.adjustmentReasons.equals(other.getAdjustmentReasons()))) &&
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
        if (getAdjustmentReasons() != null) {
            _hashCode += getAdjustmentReasons().hashCode();
        }
        _hashCode += getRecordCount();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdjustmentReasonFetchResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "AdjustmentReasonFetchResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjustmentReasons");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "AdjustmentReasons"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ArrayOfAdjustmentReason"));
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
