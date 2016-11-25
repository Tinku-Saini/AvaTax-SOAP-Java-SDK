/**
 * ArrayOfAddressLocationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2 May 03, 2005 (02:20:24 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.tax;

import com.avalara.avatax.services.base.Utility;

import java.util.ArrayList;


/**
 * Copyright (c) 2005, Avalara.  All rights reserved.
 */
public class ArrayOfAddressLocationType  implements java.io.Serializable {
    private com.avalara.avatax.services.tax.AddressLocationType[] addressLocationType;

    /**
     * Initializes a new instance of the class with an empty array of {@link AddressLocationType} objects.
     */
    public ArrayOfAddressLocationType() {
        addressLocationType = new AddressLocationType[0];
		//addressLocationType = new AddressLocationType;
    }

    /**
     * Initializes a new instance of the classand and its internal array
     * of {@link AddressLocationType} objects.
     * @param addressLocationType
     */
    public ArrayOfAddressLocationType(
            com.avalara.avatax.services.tax.AddressLocationType[] addressLocationType) {
        this.addressLocationType = addressLocationType;
    }

    /**
     * Retrieves the raw array of {@link AddressLocationType} objects encapsulated in
     * this object.
     *
     * @return addressLocationType warning this may be null, depending on how the object
     * was initialized.
     */
    public com.avalara.avatax.services.tax.AddressLocationType[] getAddressLocationType() {
        return addressLocationType;
    }


    /**
     * Allows one to programatically set the raw array of {@link AddressLocationType} objects
     * encapsulated by this object.
     *
     * @param addressLocationType
     */
    public void setAddressLocationType(com.avalara.avatax.services.tax.AddressLocationType[] addressLocationType) {
        if (addressLocationType != null)
        {
            this.addressLocationType = addressLocationType;
        }
        else
        {
            this.addressLocationType = new AddressLocationType[0];
        }
    }

    /**
     * Retrieves the ith {@link AddressLocationType} object (counting from 0) from the array
     * of AddressLocationTypes encapsulated in this object. Should only be used if its known
     * that {@link #getAddressLocationTypes} returns a non-null value and that i < number of AddressLocationTypes
     * actually in that array.
     *
     * @param i integer from 0 to (number of AddressLocationTypes -1)
     *
     * @return AddressLocationType
     */
    public com.avalara.avatax.services.tax.AddressLocationType getAddressLocationType(int i) {
        return this.addressLocationType[i];
    }

    /**
     * Allows one to replace the ith {@link AddressLocationType} object (counting from 0) within the array
     * of AddressLocationTypes encapsulated in this object. Should only be used if its known
     * that {@link #getAddressLocationType} returns a non-null value and that i < number of AddressLocationTypes
     * actually in that array.
     *
     * @param i integer from 0 to (number of AddressLocationTypes -1)
     * @param _value AddressLocationType object to place in the indicated position of the
     * AddressLocationType array
     */
    public void setAddressLocationType(int i, com.avalara.avatax.services.tax.AddressLocationType _value) {
        this.addressLocationType[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;

    /**
     * Determines whether the specified Object is equal to the current Object.
     * Note: In current implementation all Java Strings members of the two
     * objects must be exactly alike, including in case, for equal to return true.
     * @param obj
     * @return true or false, indicating if the two objects are equal.
     */
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfAddressLocationType)) return false;
        ArrayOfAddressLocationType other = (ArrayOfAddressLocationType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.addressLocationType==null && other.getAddressLocationType()==null) ||
                        (this.addressLocationType!=null &&
                                java.util.Arrays.equals(this.addressLocationType, other.getAddressLocationType())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;

    /**
     *  Serves as a hash function for a particular type,
     * suitable for use in hashing algorithms and data
     * structures like a hash table.
     * @return  hash code for this GetTaxRequest object
     * @see java.lang.Object#hashCode
     */
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAddressLocationType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddressLocationType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddressLocationType(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ArrayOfAddressLocationType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ArrayOfAddressLocationType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressLocationType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "AddressLocationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "AddressLocationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
    }


    /**
     * Return Axis type metadata object; this method is used internally by the adapter
     * and not intended to be used by external implementation code.
     *
     * @return Type Description
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }


    /**
     * Get Axis Custom Serializer; this method is used internally by the adapter
     * and not intended to be used by external implementation code.
     *
     * @param mechType
     * @param _javaType
     * @param _xmlType
     * @return Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
            java.lang.String mechType,
            java.lang.Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return
                new  org.apache.axis.encoding.ser.BeanSerializer(
                        _javaType, _xmlType, typeDesc);
    }


    /**
     * Get Axis Custom Deserializer; this method is used internally by the adapter
     * and not intended to be used by external implementation code.
     *
     * @param mechType
     * @param _javaType
     * @param _xmlType
     * @return Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
            java.lang.String mechType,
            java.lang.Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return
                new  com.avalara.avatax.services.base.ser.BeanDeserializer(
                        _javaType, _xmlType, typeDesc);
    }

    // BEGIN Extensions

    /**
     * Initializes a new instance of the class and and its internal array size.
     * of {@link AddressLocationType} objects.
     * @param size
     */
    public ArrayOfAddressLocationType(int size)
    {
        this.addressLocationType = new AddressLocationType[size];
    }

    /**
     * Gets the size of the array.
     * @return size
     */
    public int size()
    {
        if (addressLocationType == null)
        {
            return 0;
        }
        else
        {
            return addressLocationType.length;
        }
    }

    /**
     * Adds an item to the array, resizing it as needed.
     * @param address
     * @return Array position of the added item.
     */
    public int add(AddressLocationType address)
    {
        int pos = 0;
        if (addressLocationType == null)
        {
            addressLocationType = new AddressLocationType[1];
        }
        else
        {
            while (pos < addressLocationType.length && addressLocationType[pos] != null)
            {
                ++pos;
            }
            if (pos == addressLocationType.length)
            {
                addressLocationType = (AddressLocationType[])Utility.resizeArray(addressLocationType, pos+1);
            }
        }
        addressLocationType[pos] = address;

        return pos;
    }

    /**
     * Retrieves the {@link address} object identified by addressCode from the array
     * of AddressLocationTypes encapsulated in this object.
     *
     * @param addressCode
     *
     * @return AddressLocationType if found, else null
     */
    public com.avalara.avatax.services.tax.AddressLocationType getAddressLocationType(String addressCode)
    {
        AddressLocationType result = null;
        if (addressLocationType != null)
        {
            for (int ii = 0; ii < addressLocationType.length && result == null; ii++)
            {
                if (addressCode.equals(addressLocationType[ii].getAddressCode()))
                {
                    result = addressLocationType[ii];
                }
            }
        }

        return result;
    }
    // END Extensions
}
