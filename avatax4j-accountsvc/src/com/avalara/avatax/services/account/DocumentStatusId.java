/**
 * DocumentStatusId.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.account;

public class DocumentStatusId implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DocumentStatusId(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Temporary = "Temporary";
    public static final java.lang.String _Saved = "Saved";
    public static final java.lang.String _Posted = "Posted";
    public static final java.lang.String _Committed = "Committed";
    public static final java.lang.String _Cancelled = "Cancelled";
    public static final java.lang.String _Adjusted = "Adjusted";
    public static final DocumentStatusId Temporary = new DocumentStatusId(_Temporary);
    public static final DocumentStatusId Saved = new DocumentStatusId(_Saved);
    public static final DocumentStatusId Posted = new DocumentStatusId(_Posted);
    public static final DocumentStatusId Committed = new DocumentStatusId(_Committed);
    public static final DocumentStatusId Cancelled = new DocumentStatusId(_Cancelled);
    public static final DocumentStatusId Adjusted = new DocumentStatusId(_Adjusted);
    public java.lang.String getValue() { return _value_;}
    public static DocumentStatusId fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        DocumentStatusId enumeration = (DocumentStatusId)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static DocumentStatusId fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(DocumentStatusId.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "DocumentStatusId"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
