/**
 * FormTypeId.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.account;

public class FormTypeId implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected FormTypeId(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _SalesUse = "SalesUse";
    public static final java.lang.String _Sales = "Sales";
    public static final java.lang.String _SellersUse = "SellersUse";
    public static final java.lang.String _Lodging = "Lodging";
    public static final java.lang.String _SalesLodging = "SalesLodging";
    public static final java.lang.String _ConsumersUse = "ConsumersUse";
    public static final java.lang.String _ResortRental = "ResortRental";
    public static final java.lang.String _TouristRental = "TouristRental";
    public static final java.lang.String _Prepayment = "Prepayment";
    public static final FormTypeId SalesUse = new FormTypeId(_SalesUse);
    public static final FormTypeId Sales = new FormTypeId(_Sales);
    public static final FormTypeId SellersUse = new FormTypeId(_SellersUse);
    public static final FormTypeId Lodging = new FormTypeId(_Lodging);
    public static final FormTypeId SalesLodging = new FormTypeId(_SalesLodging);
    public static final FormTypeId ConsumersUse = new FormTypeId(_ConsumersUse);
    public static final FormTypeId ResortRental = new FormTypeId(_ResortRental);
    public static final FormTypeId TouristRental = new FormTypeId(_TouristRental);
    public static final FormTypeId Prepayment = new FormTypeId(_Prepayment);
    public java.lang.String getValue() { return _value_;}
    public static FormTypeId fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        FormTypeId enumeration = (FormTypeId)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static FormTypeId fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(FormTypeId.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "FormTypeId"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
