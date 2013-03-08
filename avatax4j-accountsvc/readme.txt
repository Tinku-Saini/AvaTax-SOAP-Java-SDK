AVATAX4J README
---------------

This is a Java client adapter for Avalara AvaTax web services.  This version has support for the tax and 
address services.

The adapter was built using Apache Axis WSDL2Java to build the stubs which were then enhanced to support a
custom Profile SOAP header element and a WS-Security UsernameToken SOAP header element.  It uses WSS4J to
build the security token.

A set of JUnit tests are provided as examples.  Refer to .NET/COM documentation for more details.

YOU MUST CONFIGURE avatax4j.properties FIRST!
Use avatax4j.properties.sample as an example and insert your account and license.

CONTENTS

/lib - All required jars

/samples - Coming.  See test.

/src - Full source

/test - TaxSvcTest JUnit test class to be used as an initial example.

avatax4j.properties.sample - Sample properties file for JUnit tests to configure url, account, license
    This must be renamed to avatax4.properties and configured prior to running the unit tests.

avatax4j.wsdd - Axis deployment descriptor (required for WSS4J)

build.xml - Ant build script.  Run "ant" without params for usage instructions

DEPENDENCIES

    J2SDK 1.4.x
    JUnit 3.x
    Apache Ant 1.6.x

KNOWN ISSUES

1.  If you get a warning message regarding Xalan as follows:
    Unable to patch xalan function table.
       java.lang.NoSuchFieldException: m_functions
              at java.lang.Class.getField(Unknown Source)
              at org.apache.xml.security.Init.registerHereFunction(Init.java:429)
              at org.apache.xml.security.Init.init(Init.java:124)… (and so on)

    You need to copy the xalan-2.6.0.jar to your JAVA_HOME/lib/endorsed/ directory.  You may need to create the endorsed directory.
