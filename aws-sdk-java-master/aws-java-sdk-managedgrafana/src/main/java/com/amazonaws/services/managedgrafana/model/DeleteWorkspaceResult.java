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
package com.amazonaws.services.managedgrafana.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/DeleteWorkspace" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteWorkspaceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A structure containing information about the workspace that was deleted.
     * </p>
     */
    private WorkspaceDescription workspace;

    /**
     * <p>
     * A structure containing information about the workspace that was deleted.
     * </p>
     * 
     * @param workspace
     *        A structure containing information about the workspace that was deleted.
     */

    public void setWorkspace(WorkspaceDescription workspace) {
        this.workspace = workspace;
    }

    /**
     * <p>
     * A structure containing information about the workspace that was deleted.
     * </p>
     * 
     * @return A structure containing information about the workspace that was deleted.
     */

    public WorkspaceDescription getWorkspace() {
        return this.workspace;
    }

    /**
     * <p>
     * A structure containing information about the workspace that was deleted.
     * </p>
     * 
     * @param workspace
     *        A structure containing information about the workspace that was deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteWorkspaceResult withWorkspace(WorkspaceDescription workspace) {
        setWorkspace(workspace);
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
        if (getWorkspace() != null)
            sb.append("Workspace: ").append(getWorkspace());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteWorkspaceResult == false)
            return false;
        DeleteWorkspaceResult other = (DeleteWorkspaceResult) obj;
        if (other.getWorkspace() == null ^ this.getWorkspace() == null)
            return false;
        if (other.getWorkspace() != null && other.getWorkspace().equals(this.getWorkspace()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkspace() == null) ? 0 : getWorkspace().hashCode());
        return hashCode;
    }

    @Override
    public DeleteWorkspaceResult clone() {
        try {
            return (DeleteWorkspaceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}