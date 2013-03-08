/**
 * TaxRuleTypeId.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.account;

public class TaxRuleTypeId implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TaxRuleTypeId(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _RateRule = "RateRule";
    public static final java.lang.String _RateOverrideRule = "RateOverrideRule";
    public static final java.lang.String _BaseRule = "BaseRule";
    public static final java.lang.String _ExemptEntityRule = "ExemptEntityRule";
    public static final java.lang.String _ProductTaxabilityRule = "ProductTaxabilityRule";
    public static final java.lang.String _NexusRule = "NexusRule";
    public static final TaxRuleTypeId RateRule = new TaxRuleTypeId(_RateRule);
    public static final TaxRuleTypeId RateOverrideRule = new TaxRuleTypeId(_RateOverrideRule);
    public static final TaxRuleTypeId BaseRule = new TaxRuleTypeId(_BaseRule);
    public static final TaxRuleTypeId ExemptEntityRule = new TaxRuleTypeId(_ExemptEntityRule);
    public static final TaxRuleTypeId ProductTaxabilityRule = new TaxRuleTypeId(_ProductTaxabilityRule);
    public static final TaxRuleTypeId NexusRule = new TaxRuleTypeId(_NexusRule);
    public java.lang.String getValue() { return _value_;}
    public static TaxRuleTypeId fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        TaxRuleTypeId enumeration = (TaxRuleTypeId)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TaxRuleTypeId fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(TaxRuleTypeId.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "TaxRuleTypeId"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
