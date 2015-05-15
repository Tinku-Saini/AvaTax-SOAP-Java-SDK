/**
 * SecurityRoleId.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.account;

public class SecurityRoleId implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SecurityRoleId(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NoAccess = "NoAccess";
    public static final java.lang.String _SiteAdmin = "SiteAdmin";
    public static final java.lang.String _AccountOperator = "AccountOperator";
    public static final java.lang.String _AccountAdmin = "AccountAdmin";
    public static final java.lang.String _AccountUser = "AccountUser";
    public static final java.lang.String _SystemAdmin = "SystemAdmin";
    public static final java.lang.String _Registrar = "Registrar";
    public static final java.lang.String _CSPTester = "CSPTester";
    public static final java.lang.String _CSPAdmin = "CSPAdmin";
    public static final java.lang.String _SystemOperator = "SystemOperator";
    public static final java.lang.String _TechnicalSupportUser = "TechnicalSupportUser";
    public static final java.lang.String _TechnicalSupportAdmin = "TechnicalSupportAdmin";
    public static final java.lang.String _TreasuryUser = "TreasuryUser";
    public static final java.lang.String _TreasuryAdmin = "TreasuryAdmin";
    public static final java.lang.String _ComplianceUser = "ComplianceUser";
    public static final java.lang.String _ComplianceAdmin = "ComplianceAdmin";
    public static final java.lang.String _ProStoresOperator = "ProStoresOperator";
    public static final java.lang.String _CompanyUser = "CompanyUser";
    public static final java.lang.String _CompanyAdmin = "CompanyAdmin";
    public static final SecurityRoleId NoAccess = new SecurityRoleId(_NoAccess);
    public static final SecurityRoleId SiteAdmin = new SecurityRoleId(_SiteAdmin);
    public static final SecurityRoleId AccountOperator = new SecurityRoleId(_AccountOperator);
    public static final SecurityRoleId AccountAdmin = new SecurityRoleId(_AccountAdmin);
    public static final SecurityRoleId AccountUser = new SecurityRoleId(_AccountUser);
    public static final SecurityRoleId SystemAdmin = new SecurityRoleId(_SystemAdmin);
    public static final SecurityRoleId Registrar = new SecurityRoleId(_Registrar);
    public static final SecurityRoleId CSPTester = new SecurityRoleId(_CSPTester);
    public static final SecurityRoleId CSPAdmin = new SecurityRoleId(_CSPAdmin);
    public static final SecurityRoleId SystemOperator = new SecurityRoleId(_SystemOperator);
    public static final SecurityRoleId TechnicalSupportUser = new SecurityRoleId(_TechnicalSupportUser);
    public static final SecurityRoleId TechnicalSupportAdmin = new SecurityRoleId(_TechnicalSupportAdmin);
    public static final SecurityRoleId TreasuryUser = new SecurityRoleId(_TreasuryUser);
    public static final SecurityRoleId TreasuryAdmin = new SecurityRoleId(_TreasuryAdmin);
    public static final SecurityRoleId ComplianceUser = new SecurityRoleId(_ComplianceUser);
    public static final SecurityRoleId ComplianceAdmin = new SecurityRoleId(_ComplianceAdmin);
    public static final SecurityRoleId ProStoresOperator = new SecurityRoleId(_ProStoresOperator);
    public static final SecurityRoleId CompanyUser = new SecurityRoleId(_CompanyUser);
    public static final SecurityRoleId CompanyAdmin = new SecurityRoleId(_CompanyAdmin);
    public java.lang.String getValue() { return _value_;}
    public static SecurityRoleId fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SecurityRoleId enumeration = (SecurityRoleId)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SecurityRoleId fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SecurityRoleId.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "SecurityRoleId"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
