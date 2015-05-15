/**
 * FilingTypeId.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.account;

public class FilingTypeId implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected FilingTypeId(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _PaperReturn = "PaperReturn";
    public static final java.lang.String _ElectronicReturn = "ElectronicReturn";
    public static final java.lang.String _SER = "SER";
    public static final java.lang.String _EFTPaper = "EFTPaper";
    public static final java.lang.String _PhonePaper = "PhonePaper";
    public static final java.lang.String _SignatureReady = "SignatureReady";
    public static final FilingTypeId PaperReturn = new FilingTypeId(_PaperReturn);
    public static final FilingTypeId ElectronicReturn = new FilingTypeId(_ElectronicReturn);
    public static final FilingTypeId SER = new FilingTypeId(_SER);
    public static final FilingTypeId EFTPaper = new FilingTypeId(_EFTPaper);
    public static final FilingTypeId PhonePaper = new FilingTypeId(_PhonePaper);
    public static final FilingTypeId SignatureReady = new FilingTypeId(_SignatureReady);
    public java.lang.String getValue() { return _value_;}
    public static FilingTypeId fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        FilingTypeId enumeration = (FilingTypeId)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static FilingTypeId fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(FilingTypeId.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "FilingTypeId"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
