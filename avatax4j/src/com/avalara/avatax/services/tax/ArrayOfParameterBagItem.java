/**
 * ArrayOfParameterBagItem.java
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
public class ArrayOfParameterBagItem  implements java.io.Serializable {
    private com.avalara.avatax.services.tax.ParameterBagItem[] parameterBagItem;

    /**
     * Initializes a new instance of the class with an empty array of {@link ParameterBagItem} objects.
     */
    public ArrayOfParameterBagItem() {
        parameterBagItem = new ParameterBagItem[0];
    }

    /**
     * Initializes a new instance of the classand and its internal array
     * of {@link ParameterBagItem} objects.
     * @param parameterBagItem
     */
    public ArrayOfParameterBagItem(
            com.avalara.avatax.services.tax.ParameterBagItem[] parameterBagItem) {
        this.parameterBagItem = parameterBagItem;
    }

    /**
     * Retrieves the raw array of {@link ParameterBagItem} objects encapsulated in
     * this object.
     *
     * @return parameterBagItem warning this may be null, depending on how the object
     * was initialized.
     */
    public com.avalara.avatax.services.tax.ParameterBagItem[] getParameterBagItem() {
        return parameterBagItem;
    }


    /**
     * Allows one to programatically set the raw array of {@link ParameterBagItem} objects
     * encapsulated by this object.
     *
     * @param parameterBagItem
     */
    public void setParameterBagItem(com.avalara.avatax.services.tax.ParameterBagItem[] parameterBagItem) {
        if (parameterBagItem != null)
        {
            this.parameterBagItem = parameterBagItem;
        }
        else
        {
            this.parameterBagItem = new ParameterBagItem[0];
        }
    }

    /**
     * Retrieves the ith {@link ParameterBagItem} object (counting from 0) from the array
     * of ParameterBagItems encapsulated in this object. Should only be used if its known
     * that {@link #getParameterBagItem} returns a non-null value and that i < number of ParameterBagItems
     * actually in that array.
     *
     * @param i integer from 0 to (number of ParameterBagItems -1)
     *
     * @return ParameterBagItem
     */
    public com.avalara.avatax.services.tax.ParameterBagItem getParameterBagItem(int i) {
        return this.parameterBagItem[i];
    }

    /**
     * Allows one to replace the ith {@link ParameterBagItem} object (counting from 0) within the array
     * of ParameterBagItems encapsulated in this object. Should only be used if its known
     * that {@link #getParameterBagItem} returns a non-null value and that i < number of ParameterBagItems
     * actually in that array.
     *
     * @param i integer from 0 to (number of ParameterBagItems -1)
     * @param _value ParameterBagItem object to place in the indicated position of the
     * ParameterBagItem array
     */
    public void setParameterBagItem(int i, com.avalara.avatax.services.tax.ParameterBagItem _value) {
        this.parameterBagItem[i] = _value;
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
        if (!(obj instanceof ArrayOfParameterBagItem)) return false;
        ArrayOfParameterBagItem other = (ArrayOfParameterBagItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.parameterBagItem==null && other.getParameterBagItem()==null) ||
                        (this.parameterBagItem!=null &&
                                java.util.Arrays.equals(this.parameterBagItem, other.getParameterBagItem())));
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
        if (getParameterBagItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParameterBagItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParameterBagItem(), i);
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
            new org.apache.axis.description.TypeDesc(ArrayOfParameterBagItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ArrayOfParameterBagItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameterBagItem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ParameterBagItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ParameterBagItem"));
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
     * of {@link ParameterBagItem} objects.
     * @param size
     */
    public ArrayOfParameterBagItem(int size)
    {
        this.parameterBagItem = new ParameterBagItem[size];
    }

    /**
     * Gets the size of the array.
     * @return size
     */
    public int size()
    {
        if (parameterBagItem == null)
        {
            return 0;
        }
        else
        {
            return parameterBagItem.length;
        }
    }

    /**
     * Adds an item to the array, resizing it as needed.
     * @param address
     * @return Array position of the added item.
     */
    public int add(ParameterBagItem address)
    {
        int pos = 0;
        if (parameterBagItem == null)
        {
            parameterBagItem = new ParameterBagItem[1];
        }
        else
        {
            while (pos < parameterBagItem.length && parameterBagItem[pos] != null)
            {
                ++pos;
            }
            if (pos == parameterBagItem.length)
            {
                parameterBagItem = (ParameterBagItem[])Utility.resizeArray(parameterBagItem, pos+1);
            }
        }
        parameterBagItem[pos] = address;

        return pos;
    }

    /**
     * Retrieves the {@link address} object identified by name from the array
     * of ParameterBagItems encapsulated in this object.
     *
     * @param name
     *
     * @return ParameterBagItem if found, else null
     */
    public com.avalara.avatax.services.tax.ParameterBagItem getParameterBagItem(String name)
    {
        ParameterBagItem result = null;
        if (parameterBagItem != null)
        {
            for (int ii = 0; ii < parameterBagItem.length && result == null; ii++)
            {
                if (name.equals(parameterBagItem[ii].getName()))
                {
                    result = parameterBagItem[ii];
                }
            }
        }

        return result;
    }
    // END Extensions
}
