//Taxsvc2
package com.avalara.avatax.services.tax;

public class LocationType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected LocationType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    private static final java.lang.String _ShipFrom = "ShipFrom";
    private static final java.lang.String _ShipTo = "ShipTo";
    private static final java.lang.String _PointOfSale = "PointOfSale";
    private static final java.lang.String _PointOfOrderOrigin = "PointOfOrderOrigin";
    private static final java.lang.String _PointOfOrderAcceptance = "PointOfOrderAcceptance";

    public static final LocationType ShipFrom = new LocationType(_ShipFrom);
    public static final LocationType ShipTo = new LocationType(_ShipTo);
    public static final LocationType PointOfSale = new LocationType(_PointOfSale);
    public static final LocationType PointOfOrderOrigin = new LocationType(_PointOfOrderOrigin);
    public static final LocationType PointOfOrderAcceptance = new LocationType(_PointOfOrderAcceptance);

    public java.lang.String getValue() { return _value_;}
    public static LocationType fromValue(java.lang.String value)
            throws java.lang.IllegalArgumentException {
        LocationType enumeration = (LocationType)
                _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }

    public static LocationType fromString(java.lang.String value)
            throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    /**
     * Determines whether the specified Object is equal to the current Object.
     * Note: In current implementation all Java Strings members of the two
     * objects must be exactly alike, including in case, for equal to return true.
     * @param obj
     * @return true or false, indicating if the two objects are equal.
     */
    public boolean equals(java.lang.Object obj) {return (obj == this);}

    /**
     *  Serves as a hash function for a particular type,
     * suitable for use in hashing algorithms and data
     * structures like a hash table.
     * @return  hash code for this GetTaxRequest object
     * @see java.lang.Object#hashCode
     */
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}

    /**
     * Get Axis Custom Serializer; this method is used internally by the adapter
     * and not intended to be used by external implementation code.
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
            java.lang.String mechType,
            java.lang.Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return
                new org.apache.axis.encoding.ser.EnumSerializer(
                        _javaType, _xmlType);
    }

    /**
     * Get Axis Custom Deserializer; this method is used internally by the adapter
     * and not intended to be used by external implementation code.
     */
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
            new org.apache.axis.description.TypeDesc(LocationType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "LocationType"));
    }

    /**
     * Return Axis type metadata object; this method is used internally by the adapter
     * and not intended to be used by external implementation code.
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
