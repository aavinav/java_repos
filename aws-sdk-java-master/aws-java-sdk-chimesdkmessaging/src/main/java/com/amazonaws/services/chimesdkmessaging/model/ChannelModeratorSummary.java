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
package com.amazonaws.services.chimesdkmessaging.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Summary of the details of a <code>ChannelModerator</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/ChannelModeratorSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChannelModeratorSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The data for a moderator.
     * </p>
     */
    private Identity moderator;

    /**
     * <p>
     * The data for a moderator.
     * </p>
     * 
     * @param moderator
     *        The data for a moderator.
     */

    public void setModerator(Identity moderator) {
        this.moderator = moderator;
    }

    /**
     * <p>
     * The data for a moderator.
     * </p>
     * 
     * @return The data for a moderator.
     */

    public Identity getModerator() {
        return this.moderator;
    }

    /**
     * <p>
     * The data for a moderator.
     * </p>
     * 
     * @param moderator
     *        The data for a moderator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChannelModeratorSummary withModerator(Identity moderator) {
        setModerator(moderator);
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
        if (getModerator() != null)
            sb.append("Moderator: ").append(getModerator());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChannelModeratorSummary == false)
            return false;
        ChannelModeratorSummary other = (ChannelModeratorSummary) obj;
        if (other.getModerator() == null ^ this.getModerator() == null)
            return false;
        if (other.getModerator() != null && other.getModerator().equals(this.getModerator()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModerator() == null) ? 0 : getModerator().hashCode());
        return hashCode;
    }

    @Override
    public ChannelModeratorSummary clone() {
        try {
            return (ChannelModeratorSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkmessaging.model.transform.ChannelModeratorSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}