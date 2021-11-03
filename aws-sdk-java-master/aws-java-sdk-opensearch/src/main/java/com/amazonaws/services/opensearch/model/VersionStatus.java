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
package com.amazonaws.services.opensearch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The status of the OpenSearch version options for the specified OpenSearch domain.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VersionStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The OpenSearch version for the specified OpenSearch domain.
     * </p>
     */
    private String options;
    /**
     * <p>
     * The status of the OpenSearch version options for the specified OpenSearch domain.
     * </p>
     */
    private OptionStatus status;

    /**
     * <p>
     * The OpenSearch version for the specified OpenSearch domain.
     * </p>
     * 
     * @param options
     *        The OpenSearch version for the specified OpenSearch domain.
     */

    public void setOptions(String options) {
        this.options = options;
    }

    /**
     * <p>
     * The OpenSearch version for the specified OpenSearch domain.
     * </p>
     * 
     * @return The OpenSearch version for the specified OpenSearch domain.
     */

    public String getOptions() {
        return this.options;
    }

    /**
     * <p>
     * The OpenSearch version for the specified OpenSearch domain.
     * </p>
     * 
     * @param options
     *        The OpenSearch version for the specified OpenSearch domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VersionStatus withOptions(String options) {
        setOptions(options);
        return this;
    }

    /**
     * <p>
     * The status of the OpenSearch version options for the specified OpenSearch domain.
     * </p>
     * 
     * @param status
     *        The status of the OpenSearch version options for the specified OpenSearch domain.
     */

    public void setStatus(OptionStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the OpenSearch version options for the specified OpenSearch domain.
     * </p>
     * 
     * @return The status of the OpenSearch version options for the specified OpenSearch domain.
     */

    public OptionStatus getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the OpenSearch version options for the specified OpenSearch domain.
     * </p>
     * 
     * @param status
     *        The status of the OpenSearch version options for the specified OpenSearch domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VersionStatus withStatus(OptionStatus status) {
        setStatus(status);
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
        if (getOptions() != null)
            sb.append("Options: ").append(getOptions()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VersionStatus == false)
            return false;
        VersionStatus other = (VersionStatus) obj;
        if (other.getOptions() == null ^ this.getOptions() == null)
            return false;
        if (other.getOptions() != null && other.getOptions().equals(this.getOptions()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOptions() == null) ? 0 : getOptions().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public VersionStatus clone() {
        try {
            return (VersionStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opensearch.model.transform.VersionStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}