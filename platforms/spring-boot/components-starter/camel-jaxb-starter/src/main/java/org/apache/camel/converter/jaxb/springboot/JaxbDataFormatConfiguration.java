/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.converter.jaxb.springboot;

import javax.annotation.Generated;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Camel JAXB support
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.dataformat.jaxb")
public class JaxbDataFormatConfiguration {

    /**
     * Package name where your JAXB classes are located.
     */
    private String contextPath;
    /**
     * To validate against an existing schema. Your can use the prefix
     * classpath: file: or http: to specify how the resource should by resolved.
     * You can separate multiple schema files by using the '' character.
     */
    private String schema;
    /**
     * To enable pretty printing output nicely formatted. Is by default false.
     */
    private Boolean prettyPrint = false;
    /**
     * Whether to allow using ObjectFactory classes to create the POJO classes
     * during marshalling. This only applies to POJO classes that has not been
     * annotated with JAXB and providing jaxb.index descriptor files.
     */
    private Boolean objectFactory = false;
    /**
     * Whether to ignore JAXBElement elements - only needed to be set to false
     * in very special use-cases.
     */
    private Boolean ignoreJAXBElement = false;
    /**
     * Whether marhsalling must be java objects with JAXB annotations. And if
     * not then it fails. This option can be set to false to relax that such as
     * when the data is already in XML format.
     */
    private Boolean mustBeJAXBElement = false;
    /**
     * To ignore non xml characheters and replace them with an empty space.
     */
    private Boolean filterNonXmlChars = false;
    /**
     * To overrule and use a specific encoding
     */
    private String encoding;
    /**
     * To turn on marshalling XML fragment trees. By default JAXB looks for
     * XmlRootElement annotation on given class to operate on whole XML tree.
     * This is useful but not always - sometimes generated code does not have
     * XmlRootElement annotation sometimes you need unmarshall only part of
     * tree. In that case you can use partial unmarshalling. To enable this
     * behaviours you need set property partClass. Camel will pass this class to
     * JAXB's unmarshaler.
     */
    private Boolean fragment = false;
    /**
     * Name of class used for fragment parsing. See more details at the fragment
     * option.
     */
    private String partClass;
    /**
     * XML namespace to use for fragment parsing. See more details at the
     * fragment option.
     */
    private String partNamespace;
    /**
     * When marshalling using JAXB or SOAP then the JAXB implementation will
     * automatic assign namespace prefixes such as ns2 ns3 ns4 etc. To control
     * this mapping Camel allows you to refer to a map which contains the
     * desired mapping.
     */
    private String namespacePrefixRef;
    /**
     * To use a custom xml stream writer.
     */
    private String xmlStreamWriterWrapper;
    /**
     * To define the location of the schema
     */
    private String schemaLocation;
    /**
     * To define the location of the namespaceless schema
     */
    private String noNamespaceSchemaLocation;
    /**
     * Refers to a custom java.util.Map to lookup in the registry containing
     * custom JAXB provider properties to be used with the JAXB marshaller.
     */
    private String jaxbProviderProperties;
    /**
     * Whether the data format should set the Content-Type header with the type
     * from the data format if the data format is capable of doing so. For
     * example application/xml for data formats marshalling to XML or
     * application/json for data formats marshalling to JSon etc.
     */
    private Boolean contentTypeHeader = false;

    public String getContextPath() {
        return contextPath;
    }

    public void setContextPath(String contextPath) {
        this.contextPath = contextPath;
    }

    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public Boolean getPrettyPrint() {
        return prettyPrint;
    }

    public void setPrettyPrint(Boolean prettyPrint) {
        this.prettyPrint = prettyPrint;
    }

    public Boolean getObjectFactory() {
        return objectFactory;
    }

    public void setObjectFactory(Boolean objectFactory) {
        this.objectFactory = objectFactory;
    }

    public Boolean getIgnoreJAXBElement() {
        return ignoreJAXBElement;
    }

    public void setIgnoreJAXBElement(Boolean ignoreJAXBElement) {
        this.ignoreJAXBElement = ignoreJAXBElement;
    }

    public Boolean getMustBeJAXBElement() {
        return mustBeJAXBElement;
    }

    public void setMustBeJAXBElement(Boolean mustBeJAXBElement) {
        this.mustBeJAXBElement = mustBeJAXBElement;
    }

    public Boolean getFilterNonXmlChars() {
        return filterNonXmlChars;
    }

    public void setFilterNonXmlChars(Boolean filterNonXmlChars) {
        this.filterNonXmlChars = filterNonXmlChars;
    }

    public String getEncoding() {
        return encoding;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    public Boolean getFragment() {
        return fragment;
    }

    public void setFragment(Boolean fragment) {
        this.fragment = fragment;
    }

    public String getPartClass() {
        return partClass;
    }

    public void setPartClass(String partClass) {
        this.partClass = partClass;
    }

    public String getPartNamespace() {
        return partNamespace;
    }

    public void setPartNamespace(String partNamespace) {
        this.partNamespace = partNamespace;
    }

    public String getNamespacePrefixRef() {
        return namespacePrefixRef;
    }

    public void setNamespacePrefixRef(String namespacePrefixRef) {
        this.namespacePrefixRef = namespacePrefixRef;
    }

    public String getXmlStreamWriterWrapper() {
        return xmlStreamWriterWrapper;
    }

    public void setXmlStreamWriterWrapper(String xmlStreamWriterWrapper) {
        this.xmlStreamWriterWrapper = xmlStreamWriterWrapper;
    }

    public String getSchemaLocation() {
        return schemaLocation;
    }

    public void setSchemaLocation(String schemaLocation) {
        this.schemaLocation = schemaLocation;
    }

    public String getNoNamespaceSchemaLocation() {
        return noNamespaceSchemaLocation;
    }

    public void setNoNamespaceSchemaLocation(String noNamespaceSchemaLocation) {
        this.noNamespaceSchemaLocation = noNamespaceSchemaLocation;
    }

    public String getJaxbProviderProperties() {
        return jaxbProviderProperties;
    }

    public void setJaxbProviderProperties(String jaxbProviderProperties) {
        this.jaxbProviderProperties = jaxbProviderProperties;
    }

    public Boolean getContentTypeHeader() {
        return contentTypeHeader;
    }

    public void setContentTypeHeader(Boolean contentTypeHeader) {
        this.contentTypeHeader = contentTypeHeader;
    }
}