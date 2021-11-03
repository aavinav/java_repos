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
package com.amazonaws.services.fms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Violation detail for an expected route missing in Network Firewall.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/NetworkFirewallMissingExpectedRoutesViolation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkFirewallMissingExpectedRoutesViolation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The target of the violation.
     * </p>
     */
    private String violationTarget;
    /**
     * <p>
     * The expected routes.
     * </p>
     */
    private java.util.List<ExpectedRoute> expectedRoutes;
    /**
     * <p>
     * Information about the VPC ID.
     * </p>
     */
    private String vpcId;

    /**
     * <p>
     * The target of the violation.
     * </p>
     * 
     * @param violationTarget
     *        The target of the violation.
     */

    public void setViolationTarget(String violationTarget) {
        this.violationTarget = violationTarget;
    }

    /**
     * <p>
     * The target of the violation.
     * </p>
     * 
     * @return The target of the violation.
     */

    public String getViolationTarget() {
        return this.violationTarget;
    }

    /**
     * <p>
     * The target of the violation.
     * </p>
     * 
     * @param violationTarget
     *        The target of the violation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkFirewallMissingExpectedRoutesViolation withViolationTarget(String violationTarget) {
        setViolationTarget(violationTarget);
        return this;
    }

    /**
     * <p>
     * The expected routes.
     * </p>
     * 
     * @return The expected routes.
     */

    public java.util.List<ExpectedRoute> getExpectedRoutes() {
        return expectedRoutes;
    }

    /**
     * <p>
     * The expected routes.
     * </p>
     * 
     * @param expectedRoutes
     *        The expected routes.
     */

    public void setExpectedRoutes(java.util.Collection<ExpectedRoute> expectedRoutes) {
        if (expectedRoutes == null) {
            this.expectedRoutes = null;
            return;
        }

        this.expectedRoutes = new java.util.ArrayList<ExpectedRoute>(expectedRoutes);
    }

    /**
     * <p>
     * The expected routes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExpectedRoutes(java.util.Collection)} or {@link #withExpectedRoutes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param expectedRoutes
     *        The expected routes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkFirewallMissingExpectedRoutesViolation withExpectedRoutes(ExpectedRoute... expectedRoutes) {
        if (this.expectedRoutes == null) {
            setExpectedRoutes(new java.util.ArrayList<ExpectedRoute>(expectedRoutes.length));
        }
        for (ExpectedRoute ele : expectedRoutes) {
            this.expectedRoutes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The expected routes.
     * </p>
     * 
     * @param expectedRoutes
     *        The expected routes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkFirewallMissingExpectedRoutesViolation withExpectedRoutes(java.util.Collection<ExpectedRoute> expectedRoutes) {
        setExpectedRoutes(expectedRoutes);
        return this;
    }

    /**
     * <p>
     * Information about the VPC ID.
     * </p>
     * 
     * @param vpcId
     *        Information about the VPC ID.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * Information about the VPC ID.
     * </p>
     * 
     * @return Information about the VPC ID.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * Information about the VPC ID.
     * </p>
     * 
     * @param vpcId
     *        Information about the VPC ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkFirewallMissingExpectedRoutesViolation withVpcId(String vpcId) {
        setVpcId(vpcId);
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
        if (getViolationTarget() != null)
            sb.append("ViolationTarget: ").append(getViolationTarget()).append(",");
        if (getExpectedRoutes() != null)
            sb.append("ExpectedRoutes: ").append(getExpectedRoutes()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NetworkFirewallMissingExpectedRoutesViolation == false)
            return false;
        NetworkFirewallMissingExpectedRoutesViolation other = (NetworkFirewallMissingExpectedRoutesViolation) obj;
        if (other.getViolationTarget() == null ^ this.getViolationTarget() == null)
            return false;
        if (other.getViolationTarget() != null && other.getViolationTarget().equals(this.getViolationTarget()) == false)
            return false;
        if (other.getExpectedRoutes() == null ^ this.getExpectedRoutes() == null)
            return false;
        if (other.getExpectedRoutes() != null && other.getExpectedRoutes().equals(this.getExpectedRoutes()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getViolationTarget() == null) ? 0 : getViolationTarget().hashCode());
        hashCode = prime * hashCode + ((getExpectedRoutes() == null) ? 0 : getExpectedRoutes().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        return hashCode;
    }

    @Override
    public NetworkFirewallMissingExpectedRoutesViolation clone() {
        try {
            return (NetworkFirewallMissingExpectedRoutesViolation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fms.model.transform.NetworkFirewallMissingExpectedRoutesViolationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}