/*
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
package org.apache.camel.builder.endpoint.dsl;

import java.util.List;
import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * The aws-ses component is used for sending emails with Amazon's SES service.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface SesEndpointBuilderFactory {


    /**
     * Builder for endpoint for the AWS Simple Email Service component.
     */
    public interface SesEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedSesEndpointBuilder advanced() {
            return (AdvancedSesEndpointBuilder) this;
        }
        /**
         * To use the AmazonSimpleEmailService as the client.
         * 
         * The option is a:
         * <code>com.amazonaws.services.simpleemail.AmazonSimpleEmailService</code> type.
         * 
         * Group: producer
         */
        default SesEndpointBuilder amazonSESClient(Object amazonSESClient) {
            setProperty("amazonSESClient", amazonSESClient);
            return this;
        }
        /**
         * To use the AmazonSimpleEmailService as the client.
         * 
         * The option will be converted to a
         * <code>com.amazonaws.services.simpleemail.AmazonSimpleEmailService</code> type.
         * 
         * Group: producer
         */
        default SesEndpointBuilder amazonSESClient(String amazonSESClient) {
            setProperty("amazonSESClient", amazonSESClient);
            return this;
        }
        /**
         * To define a proxy host when instantiating the SES client.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default SesEndpointBuilder proxyHost(String proxyHost) {
            setProperty("proxyHost", proxyHost);
            return this;
        }
        /**
         * To define a proxy port when instantiating the SES client.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: producer
         */
        default SesEndpointBuilder proxyPort(Integer proxyPort) {
            setProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * To define a proxy port when instantiating the SES client.
         * 
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * 
         * Group: producer
         */
        default SesEndpointBuilder proxyPort(String proxyPort) {
            setProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * The region in which SES client needs to work. When using this
         * parameter, the configuration will expect the capitalized name of the
         * region (for example AP_EAST_1) You'll need to use the name
         * Regions.EU_WEST_1.name().
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default SesEndpointBuilder region(String region) {
            setProperty("region", region);
            return this;
        }
        /**
         * List of reply-to email address(es) for the message, override it using
         * 'CamelAwsSesReplyToAddresses' header.
         * 
         * The option is a: <code>java.util.List&lt;java.lang.String&gt;</code>
         * type.
         * 
         * Group: producer
         */
        default SesEndpointBuilder replyToAddresses(
                List<String> replyToAddresses) {
            setProperty("replyToAddresses", replyToAddresses);
            return this;
        }
        /**
         * List of reply-to email address(es) for the message, override it using
         * 'CamelAwsSesReplyToAddresses' header.
         * 
         * The option will be converted to a
         * <code>java.util.List&lt;java.lang.String&gt;</code> type.
         * 
         * Group: producer
         */
        default SesEndpointBuilder replyToAddresses(String replyToAddresses) {
            setProperty("replyToAddresses", replyToAddresses);
            return this;
        }
        /**
         * The email address to which bounce notifications are to be forwarded,
         * override it using 'CamelAwsSesReturnPath' header.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default SesEndpointBuilder returnPath(String returnPath) {
            setProperty("returnPath", returnPath);
            return this;
        }
        /**
         * The subject which is used if the message header 'CamelAwsSesSubject'
         * is not present.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default SesEndpointBuilder subject(String subject) {
            setProperty("subject", subject);
            return this;
        }
        /**
         * List of destination email address. Can be overriden with
         * 'CamelAwsSesTo' header.
         * 
         * The option is a: <code>java.util.List&lt;java.lang.String&gt;</code>
         * type.
         * 
         * Group: producer
         */
        default SesEndpointBuilder to(List<String> to) {
            setProperty("to", to);
            return this;
        }
        /**
         * List of destination email address. Can be overriden with
         * 'CamelAwsSesTo' header.
         * 
         * The option will be converted to a
         * <code>java.util.List&lt;java.lang.String&gt;</code> type.
         * 
         * Group: producer
         */
        default SesEndpointBuilder to(String to) {
            setProperty("to", to);
            return this;
        }
        /**
         * Amazon AWS Access Key.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default SesEndpointBuilder accessKey(String accessKey) {
            setProperty("accessKey", accessKey);
            return this;
        }
        /**
         * Amazon AWS Secret Key.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default SesEndpointBuilder secretKey(String secretKey) {
            setProperty("secretKey", secretKey);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the AWS Simple Email Service component.
     */
    public interface AdvancedSesEndpointBuilder
            extends
                EndpointProducerBuilder {
        default SesEndpointBuilder basic() {
            return (SesEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedSesEndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedSesEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedSesEndpointBuilder synchronous(boolean synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedSesEndpointBuilder synchronous(String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }
    /**
     * AWS Simple Email Service (camel-aws-ses)
     * The aws-ses component is used for sending emails with Amazon's SES
     * service.
     * 
     * Category: cloud,mail
     * Available as of version: 2.9
     * Maven coordinates: org.apache.camel:camel-aws-ses
     * 
     * Syntax: <code>aws-ses:from</code>
     * 
     * Path parameter: from (required)
     * The sender's email address.
     */
    default SesEndpointBuilder ses(String path) {
        class SesEndpointBuilderImpl extends AbstractEndpointBuilder implements SesEndpointBuilder, AdvancedSesEndpointBuilder {
            public SesEndpointBuilderImpl(String path) {
                super("aws-ses", path);
            }
        }
        return new SesEndpointBuilderImpl(path);
    }
}