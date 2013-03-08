/**
 * ExemptCertReviewStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.account;

public class ExemptCertReviewStatus implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ExemptCertReviewStatus(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _Pending = "Pending";
    public static final String _Accepted = "Accepted";
    public static final String _Rejected = "Rejected";
    public static final ExemptCertReviewStatus Pending = new ExemptCertReviewStatus(_Pending);
    public static final ExemptCertReviewStatus Accepted = new ExemptCertReviewStatus(_Accepted);
    public static final ExemptCertReviewStatus Rejected = new ExemptCertReviewStatus(_Rejected);
    public String getValue() { return _value_;}
    public static ExemptCertReviewStatus fromValue(String value)
          throws IllegalArgumentException {
        ExemptCertReviewStatus enumeration = (ExemptCertReviewStatus)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static ExemptCertReviewStatus fromString(String value)
          throws IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public String toString() { return _value_;}
    public Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExemptCertReviewStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ExemptCertReviewStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
