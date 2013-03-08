/**
 * ArrayOfSite.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.account;

public class ArrayOfSite  implements java.io.Serializable {
    private com.avalara.avatax.services.account.Site[] site;

    public ArrayOfSite() {
    }

    public ArrayOfSite(
           com.avalara.avatax.services.account.Site[] site) {
           this.site = site;
    }


    /**
     * Gets the site value for this ArrayOfSite.
     * 
     * @return site
     */
    public com.avalara.avatax.services.account.Site[] getSite() {
        return site;
    }


    /**
     * Sets the site value for this ArrayOfSite.
     * 
     * @param site
     */
    public void setSite(com.avalara.avatax.services.account.Site[] site) {
        this.site = site;
    }

    public com.avalara.avatax.services.account.Site getSite(int i) {
        return this.site[i];
    }

    public void setSite(int i, com.avalara.avatax.services.account.Site _value) {
        this.site[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfSite)) return false;
        ArrayOfSite other = (ArrayOfSite) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.site==null && other.getSite()==null) || 
             (this.site!=null &&
              java.util.Arrays.equals(this.site, other.getSite())));
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
        if (getSite() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSite());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSite(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfSite.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ArrayOfSite"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("site");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Site"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Site"));
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
