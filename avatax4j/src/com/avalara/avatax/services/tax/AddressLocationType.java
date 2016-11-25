/**
 * 	Added for Taxsvc2
 *	AddressLocationType.java
 */

package com.avalara.avatax.services.tax;

public class AddressLocationType implements java.io.Serializable {
    
    private java.lang.String addressCode;
    private com.avalara.avatax.services.tax.LocationType locationTypeCode;

    public AddressLocationType() {
    }

    private AddressLocationType(           
           java.lang.String addressCode,
           com.avalara.avatax.services.tax.LocationType locationTypeCode) {

           this.addressCode = addressCode;
           this.locationTypeCode = locationTypeCode;
    }

    public java.lang.String getAddressCode() {
        return addressCode;
    }

    public void setAddressCode(java.lang.String addressCode) {
        this.addressCode = addressCode;
    }

    public com.avalara.avatax.services.tax.LocationType getLocationTypeCode() {
        return locationTypeCode;
    }

    public void setLocationTypeCode(com.avalara.avatax.services.tax.LocationType locationTypeCode) {
        this.locationTypeCode = locationTypeCode;
    }
	
    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddressLocationType)) return false;
        AddressLocationType other = (AddressLocationType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&             
            ((this.addressCode==null && other.getAddressCode()==null) || 
             (this.addressCode!=null &&
              this.addressCode.equals(other.getAddressCode()))) &&
            ((this.locationTypeCode==null && other.getLocationTypeCode()==null) || 
             (this.locationTypeCode!=null &&
              this.locationTypeCode.equals(other.getLocationTypeCode())));
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
        if (getAddressCode() != null) {
            _hashCode += getAddressCode().hashCode();
        }
        if (getLocationTypeCode() != null) {
            _hashCode += getLocationTypeCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddressLocationType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "AddressLocationType"));        
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "AddressCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationTypeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "LocationTypeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "LocationType"));
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