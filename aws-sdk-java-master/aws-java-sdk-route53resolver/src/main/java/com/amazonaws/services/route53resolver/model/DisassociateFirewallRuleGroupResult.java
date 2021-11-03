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
package com.amazonaws.services.route53resolver.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/DisassociateFirewallRuleGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateFirewallRuleGroupResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The firewall rule group association that you just removed.
     * </p>
     */
    private FirewallRuleGroupAssociation firewallRuleGroupAssociation;

    /**
     * <p>
     * The firewall rule group association that you just removed.
     * </p>
     * 
     * @param firewallRuleGroupAssociation
     *        The firewall rule group association that you just removed.
     */

    public void setFirewallRuleGroupAssociation(FirewallRuleGroupAssociation firewallRuleGroupAssociation) {
        this.firewallRuleGroupAssociation = firewallRuleGroupAssociation;
    }

    /**
     * <p>
     * The firewall rule group association that you just removed.
     * </p>
     * 
     * @return The firewall rule group association that you just removed.
     */

    public FirewallRuleGroupAssociation getFirewallRuleGroupAssociation() {
        return this.firewallRuleGroupAssociation;
    }

    /**
     * <p>
     * The firewall rule group association that you just removed.
     * </p>
     * 
     * @param firewallRuleGroupAssociation
     *        The firewall rule group association that you just removed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateFirewallRuleGroupResult withFirewallRuleGroupAssociation(FirewallRuleGroupAssociation firewallRuleGroupAssociation) {
        setFirewallRuleGroupAssociation(firewallRuleGroupAssociation);
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
        if (getFirewallRuleGroupAssociation() != null)
            sb.append("FirewallRuleGroupAssociation: ").append(getFirewallRuleGroupAssociation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateFirewallRuleGroupResult == false)
            return false;
        DisassociateFirewallRuleGroupResult other = (DisassociateFirewallRuleGroupResult) obj;
        if (other.getFirewallRuleGroupAssociation() == null ^ this.getFirewallRuleGroupAssociation() == null)
            return false;
        if (other.getFirewallRuleGroupAssociation() != null && other.getFirewallRuleGroupAssociation().equals(this.getFirewallRuleGroupAssociation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFirewallRuleGroupAssociation() == null) ? 0 : getFirewallRuleGroupAssociation().hashCode());
        return hashCode;
    }

    @Override
    public DisassociateFirewallRuleGroupResult clone() {
        try {
            return (DisassociateFirewallRuleGroupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}