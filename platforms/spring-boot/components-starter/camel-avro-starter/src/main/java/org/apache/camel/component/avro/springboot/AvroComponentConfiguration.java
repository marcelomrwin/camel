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
package org.apache.camel.component.avro.springboot;

import javax.annotation.Generated;
import org.apache.avro.Protocol;
import org.apache.camel.component.avro.AvroTransport;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

/**
 * Working with Apache Avro for data serialization.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.avro")
public class AvroComponentConfiguration {

    /**
     * To use a shared AvroConfiguration to configure options once
     */
    private AvroConfigurationNestedConfiguration configuration;
    /**
     * Whether the component should resolve property placeholders on itself when
     * starting. Only properties which are of String type can use property
     * placeholders.
     */
    private Boolean resolvePropertyPlaceholders = true;

    public AvroConfigurationNestedConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(
            AvroConfigurationNestedConfiguration configuration) {
        this.configuration = configuration;
    }

    public Boolean getResolvePropertyPlaceholders() {
        return resolvePropertyPlaceholders;
    }

    public void setResolvePropertyPlaceholders(
            Boolean resolvePropertyPlaceholders) {
        this.resolvePropertyPlaceholders = resolvePropertyPlaceholders;
    }

    public static class AvroConfigurationNestedConfiguration {
        public static final Class CAMEL_NESTED_CLASS = org.apache.camel.component.avro.AvroConfiguration.class;
        /**
         * Hostname to use
         */
        private String host;
        /**
         * Port number to use
         */
        private Integer port;
        /**
         * Avro protocol to use
         */
        @NestedConfigurationProperty
        private Protocol protocol;
        private AvroTransport transport;
        /**
         * Avro protocol location
         */
        private String protocolLocation;
        /**
         * Avro protocol to use defined by the FQN class name
         */
        private String protocolClassName;
        /**
         * The name of the message to send.
         */
        private String messageName;
        /**
         * Authority to use (username and password)
         */
        private String uriAuthority;
        /**
         * If protocol object provided is reflection protocol. Should be used
         * only with protocol parameter because for protocolClassName protocol
         * type will be auto detected
         */
        private Boolean reflectionProtocol = false;
        /**
         * If true, consumer parameter won't be wrapped into array. Will fail if
         * protocol specifies more then 1 parameter for the message
         */
        private Boolean singleParameter = false;

        public String getHost() {
            return host;
        }

        public void setHost(String host) {
            this.host = host;
        }

        public Integer getPort() {
            return port;
        }

        public void setPort(Integer port) {
            this.port = port;
        }

        public Protocol getProtocol() {
            return protocol;
        }

        public void setProtocol(Protocol protocol) {
            this.protocol = protocol;
        }

        public AvroTransport getTransport() {
            return transport;
        }

        public void setTransport(AvroTransport transport) {
            this.transport = transport;
        }

        public String getProtocolLocation() {
            return protocolLocation;
        }

        public void setProtocolLocation(String protocolLocation) {
            this.protocolLocation = protocolLocation;
        }

        public String getProtocolClassName() {
            return protocolClassName;
        }

        public void setProtocolClassName(String protocolClassName) {
            this.protocolClassName = protocolClassName;
        }

        public String getMessageName() {
            return messageName;
        }

        public void setMessageName(String messageName) {
            this.messageName = messageName;
        }

        public String getUriAuthority() {
            return uriAuthority;
        }

        public void setUriAuthority(String uriAuthority) {
            this.uriAuthority = uriAuthority;
        }

        public Boolean getReflectionProtocol() {
            return reflectionProtocol;
        }

        public void setReflectionProtocol(Boolean reflectionProtocol) {
            this.reflectionProtocol = reflectionProtocol;
        }

        public Boolean getSingleParameter() {
            return singleParameter;
        }

        public void setSingleParameter(Boolean singleParameter) {
            this.singleParameter = singleParameter;
        }
    }
}