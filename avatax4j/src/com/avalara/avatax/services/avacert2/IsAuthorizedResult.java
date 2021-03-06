package com.avalara.avatax.services.avacert2;
/**
 * IsAuthorizedResult.java
 * Checks authentication of and authorization to one or more operations on the service.
 * <br><b>Example:</b>
 * <pre>
 * [Java]
 *      try{
 *       <b>
 *       IsAuthorizedResult result = port.isAuthorized("Ping,IsAuthorized,Validate");</b>  }
 *       catch (RemoteException e) {         e.printStackTrace(); } 
 *       Assert.assertEquals(SeverityLevel.Success, result.getResultCode());
 *       Assert.assertEquals("Ping,IsAuthorized,Validate", result.getOperations());
 *       Calendar calendar = result.getExpires();
 *       ArrayOfMessage messages = result.getMessages();
 *
 * This file was auto-generated from WSDL
 * </pre>
 * Copyright (c) 2011, Avalara.  All rights reserved.
 */

public class IsAuthorizedResult  extends BaseResult  implements java.io.Serializable {

    /**
     * Operations
     */
    private java.lang.String operations;
    /**
     * Expiration Date
     */
    private java.util.Calendar expires;

    /**
     * Initializes the instance of  IsAuthorizedResult class
     */
    public IsAuthorizedResult() {
    }

    /**
     * Initializes the instance of  IsAuthorizedResult class
     * @param operations
     * @param expires
     */
    public IsAuthorizedResult(
           java.lang.String operations,
           java.util.Calendar expires) {
           this.operations = operations;
           this.expires = expires;
    }


    /**
     * Gets the operations value for this IsAuthorizedResult.
     * 
     * @return operations
     */
    public java.lang.String getOperations() {
        return operations;
    }


    /**
     * Sets the operations value for this IsAuthorizedResult.
     *
     * @param operations
     */
    public void setOperations(java.lang.String operations) {
        this.operations = operations;
    }


    /**
     * Gets the expires value for this IsAuthorizedResult.
     * 
     * @return expires
     */
    public java.util.Calendar getExpires() {
        return expires;
    }


    /**
     * Sets the expires value for this IsAuthorizedResult.
     *
     * @param expires
     */
    public void setExpires(java.util.Calendar expires) {
        this.expires = expires;
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
        if (!(obj instanceof IsAuthorizedResult)) return false;
        IsAuthorizedResult other = (IsAuthorizedResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.operations==null && other.getOperations()==null) || 
             (this.operations!=null &&
              this.operations.equals(other.getOperations()))) &&
            ((this.expires==null && other.getExpires()==null) || 
             (this.expires!=null &&
              this.expires.equals(other.getExpires())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;

     /**
        *  Serves as a hash function for a particular type,
        * suitable for use in hashing algorithms and data
        * structures like a hash table.
        * @return  hash code for this IsAuthorizedResult object
        * @see java.lang.Object#hashCode
        */
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getOperations() != null) {
            _hashCode += getOperations().hashCode();
        }
        if (getExpires() != null) {
            _hashCode += getExpires().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IsAuthorizedResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "IsAuthorizedResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operations");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Operations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expires");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Expires"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
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
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
