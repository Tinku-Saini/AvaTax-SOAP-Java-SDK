/**
 * TaxOverrideTypeId.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.account;

public class TaxOverrideTypeId implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TaxOverrideTypeId(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _None = "None";
    public static final java.lang.String _TaxAmount = "TaxAmount";
    public static final java.lang.String _Exemption = "Exemption";
    public static final java.lang.String _TaxDate = "TaxDate";
    public static final TaxOverrideTypeId None = new TaxOverrideTypeId(_None);
    public static final TaxOverrideTypeId TaxAmount = new TaxOverrideTypeId(_TaxAmount);
    public static final TaxOverrideTypeId Exemption = new TaxOverrideTypeId(_Exemption);
    public static final TaxOverrideTypeId TaxDate = new TaxOverrideTypeId(_TaxDate);
    public java.lang.String getValue() { return _value_;}
    public static TaxOverrideTypeId fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        TaxOverrideTypeId enumeration = (TaxOverrideTypeId)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TaxOverrideTypeId fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TaxOverrideTypeId.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "TaxOverrideTypeId"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
