/**
 * ServiceTypeId.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.account;

public class ServiceTypeId implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ServiceTypeId(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _None = "None";
    public static final java.lang.String _AvaTaxST = "AvaTaxST";
    public static final java.lang.String _AvaTaxPro = "AvaTaxPro";
    public static final java.lang.String _AvaTaxGlobal = "AvaTaxGlobal";
    public static final java.lang.String _AutoAddress = "AutoAddress";
    public static final java.lang.String _AutoReturns = "AutoReturns";
    public static final java.lang.String _TaxSolver = "TaxSolver";
    public static final java.lang.String _AvaTaxCsp = "AvaTaxCsp";
    public static final java.lang.String _Twe = "Twe";
    public static final java.lang.String _Mrs = "Mrs";
    public static final java.lang.String _AvaCert = "AvaCert"; 
    public static final ServiceTypeId None = new ServiceTypeId(_None);
    public static final ServiceTypeId AvaTaxST = new ServiceTypeId(_AvaTaxST);
    public static final ServiceTypeId AvaTaxPro = new ServiceTypeId(_AvaTaxPro);
    public static final ServiceTypeId AvaTaxGlobal = new ServiceTypeId(_AvaTaxGlobal);
    public static final ServiceTypeId AutoAddress = new ServiceTypeId(_AutoAddress);
    public static final ServiceTypeId AutoReturns = new ServiceTypeId(_AutoReturns);
    public static final ServiceTypeId TaxSolver = new ServiceTypeId(_TaxSolver);
    public static final ServiceTypeId AvaTaxCsp = new ServiceTypeId(_AvaTaxCsp);
    public static final ServiceTypeId Twe = new ServiceTypeId(_Twe);
    public static final ServiceTypeId Mrs = new ServiceTypeId(_Mrs);
    public static final ServiceTypeId AvaCert = new ServiceTypeId(_AvaCert);    
    public java.lang.String getValue() { return _value_;}
    public static ServiceTypeId fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ServiceTypeId enumeration = (ServiceTypeId)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ServiceTypeId fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ServiceTypeId.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ServiceTypeId"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
