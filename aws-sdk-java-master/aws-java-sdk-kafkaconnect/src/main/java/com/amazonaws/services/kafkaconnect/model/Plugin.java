/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.kafkaconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A plugin is an AWS resource that contains the code that defines your connector logic.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafkaconnect-2021-09-14/Plugin" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Plugin implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Details about a custom plugin.
     * </p>
     */
    private CustomPlugin customPlugin;

    /**
     * <p>
     * Details about a custom plugin.
     * </p>
     * 
     * @param customPlugin
     *        Details about a custom plugin.
     */

    public void setCustomPlugin(CustomPlugin customPlugin) {
        this.customPlugin = customPlugin;
    }

    /**
     * <p>
     * Details about a custom plugin.
     * </p>
     * 
     * @return Details about a custom plugin.
     */

    public CustomPlugin getCustomPlugin() {
        return this.customPlugin;
    }

    /**
     * <p>
     * Details about a custom plugin.
     * </p>
     * 
     * @param customPlugin
     *        Details about a custom plugin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Plugin withCustomPlugin(CustomPlugin customPlugin) {
        setCustomPlugin(customPlugin);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCustomPlugin() != null)
            sb.append("CustomPlugin: ").append(getCustomPlugin());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Plugin == false)
            return false;
        Plugin other = (Plugin) obj;
        if (other.getCustomPlugin() == null ^ this.getCustomPlugin() == null)
            return false;
        if (other.getCustomPlugin() != null && other.getCustomPlugin().equals(this.getCustomPlugin()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCustomPlugin() == null) ? 0 : getCustomPlugin().hashCode());
        return hashCode;
    }

    @Override
    public Plugin clone() {
        try {
            return (Plugin) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kafkaconnect.model.transform.PluginMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}