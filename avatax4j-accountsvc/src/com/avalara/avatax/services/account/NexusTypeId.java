/**
 * NexusTypeId.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.account;

public class NexusTypeId implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected NexusTypeId(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _None = "None";
    public static final java.lang.String _Volunteer = "Volunteer";
    public static final java.lang.String _NonVolunteer = "NonVolunteer";
    public static final java.lang.String _SSTVolunteer = "SSTVolunteer";
    public static final java.lang.String _SSTNonVolunteer = "SSTNonVolunteer";
    public static final java.lang.String _Collect = "Collect";
    public static final java.lang.String _Legal = "Legal";
    public static final NexusTypeId None = new NexusTypeId(_None);
    public static final NexusTypeId Volunteer = new NexusTypeId(_Volunteer);
    public static final NexusTypeId NonVolunteer = new NexusTypeId(_NonVolunteer);
    public static final NexusTypeId SSTVolunteer = new NexusTypeId(_SSTVolunteer);
    public static final NexusTypeId SSTNonVolunteer = new NexusTypeId(_SSTNonVolunteer);
    /**
     * @deprecated  As of release 5.3, replaced by Volunteer
     */
    public static final NexusTypeId Collect = new NexusTypeId(_Collect);
    /**
     * @deprecated  As of release 5.3, replaced by NonVolunteer
     */
    public static final NexusTypeId Legal = new NexusTypeId(_Legal);
    public java.lang.String getValue() { return _value_;}
    public static NexusTypeId fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        NexusTypeId enumeration = (NexusTypeId)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static NexusTypeId fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(NexusTypeId.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "NexusTypeId"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
