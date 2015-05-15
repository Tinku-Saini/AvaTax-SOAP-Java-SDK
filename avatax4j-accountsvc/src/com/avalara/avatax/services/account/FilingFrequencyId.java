/**
 * FilingFrequencyId.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.account;

public class FilingFrequencyId implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected FilingFrequencyId(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Monthly = "Monthly";
    public static final java.lang.String _Quarterly = "Quarterly";
    public static final java.lang.String _SemiAnnually = "SemiAnnually";
    public static final java.lang.String _Annually = "Annually";
    public static final java.lang.String _Bimonthly = "Bimonthly";
    public static final FilingFrequencyId Monthly = new FilingFrequencyId(_Monthly);
    public static final FilingFrequencyId Quarterly = new FilingFrequencyId(_Quarterly);
    public static final FilingFrequencyId SemiAnnually = new FilingFrequencyId(_SemiAnnually);
    public static final FilingFrequencyId Annually = new FilingFrequencyId(_Annually);
    public static final FilingFrequencyId Bimonthly = new FilingFrequencyId(_Bimonthly);
    public java.lang.String getValue() { return _value_;}
    public static FilingFrequencyId fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        FilingFrequencyId enumeration = (FilingFrequencyId)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static FilingFrequencyId fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(FilingFrequencyId.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "FilingFrequencyId"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
