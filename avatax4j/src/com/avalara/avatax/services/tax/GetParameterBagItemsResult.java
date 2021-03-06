/**
 * GetParameterBagItemsResult.java
 * Taxsvc2
 *
 */

package com.avalara.avatax.services.tax;

/**
 * Copyright (c) 2016, Avalara.  All rights reserved.
 */
public class GetParameterBagItemsResult extends com.avalara.avatax.services.tax.BaseResult  implements java.io.Serializable {
    private com.avalara.avatax.services.tax.ArrayOfParameterBagItem parameterBagItems;

    /**
     * Initializes a new instance of the class.
     */
    public GetParameterBagItemsResult() {
    }

    private GetParameterBagItemsResult(com.avalara.avatax.services.tax.ArrayOfParameterBagItem parameterBagItems) {
        this.parameterBagItems = parameterBagItems;
    }

    public com.avalara.avatax.services.tax.ArrayOfParameterBagItem getParameterBagItems() {
        return parameterBagItems;
    }

    public void setParameterBagItems(com.avalara.avatax.services.tax.ArrayOfParameterBagItem parameterBagItems) {
        this.parameterBagItems = parameterBagItems;
    }

    private java.lang.Object __equalsCalc = null;

    /**
     * Determines whether the specified Object is equal to the current Object.
     * Note: In current implementation all Java Strings members of the two
     * objects must be exactly alike, including in case, for equal to return true.
     * @param obj
     * @return true or false, indicating if the two objects are equal.
     */
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetParameterBagItemsResult)) return false;
        GetParameterBagItemsResult other = (GetParameterBagItemsResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.parameterBagItems==null && other.getParameterBagItems()==null) ||
                        (this.parameterBagItems!=null &&
                                this.parameterBagItems.equals(other.getParameterBagItems())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;

    /**
     *  Serves as a hash function for a particular type,
     * suitable for use in hashing algorithms and data
     * structures like a hash table.
     * @return  hash code for this GetTaxRequest object
     * @see java.lang.Object#hashCode
     */
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getParameterBagItems() != null) {
            _hashCode += getParameterBagItems().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(GetParameterBagItemsResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "GetParameterBagItemsResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameterBagItems");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ParameterBagItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ArrayOfParameterBagItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return Axis type metadata object; this method is used internally by the adapter
     * and not intended to be used by external implementation code.
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Axis Custom Serializer; this method is used internally by the adapter
     * and not intended to be used by external implementation code.
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
     * Get Axis Custom Deserializer; this method is used internally by the adapter
     * and not intended to be used by external implementation code.
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
