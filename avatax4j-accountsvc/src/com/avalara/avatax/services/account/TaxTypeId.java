/**
 * TaxTypeId.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.account;

public class TaxTypeId implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TaxTypeId(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _B = "B";
    public static final java.lang.String _C = "C";
    public static final java.lang.String _S = "S";
    public static final java.lang.String _U = "U";
    public static final java.lang.String _O = "O";
    public static final java.lang.String _I = "I";
    public static final java.lang.String _N = "N";
    public static final java.lang.String _R = "R";
    public static final java.lang.String _F = "F";
    public static final TaxTypeId B = new TaxTypeId(_B);
    public static final TaxTypeId C = new TaxTypeId(_C);
    public static final TaxTypeId S = new TaxTypeId(_S);
    public static final TaxTypeId U = new TaxTypeId(_U);
    public static final TaxTypeId O = new TaxTypeId(_O);
    public static final TaxTypeId I = new TaxTypeId(_I);
    public static final TaxTypeId N = new TaxTypeId(_N);
    public static final TaxTypeId R = new TaxTypeId(_R);
    public static final TaxTypeId F = new TaxTypeId(_F);
    public java.lang.String getValue() { return _value_;}
    public static TaxTypeId fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        TaxTypeId enumeration = (TaxTypeId)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TaxTypeId fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(TaxTypeId.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "TaxTypeId"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
