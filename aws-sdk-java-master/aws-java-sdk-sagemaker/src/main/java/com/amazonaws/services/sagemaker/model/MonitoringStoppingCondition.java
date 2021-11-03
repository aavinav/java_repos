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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A time limit for how long the monitoring job is allowed to run before stopping.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/MonitoringStoppingCondition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MonitoringStoppingCondition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The maximum runtime allowed in seconds.
     * </p>
     * <note>
     * <p>
     * The <code>MaxRuntimeInSeconds</code> cannot exceed the frequency of the job. For data quality and model
     * explainability, this can be up to 3600 seconds for an hourly schedule. For model bias and model quality hourly
     * schedules, this can be up to 1800 seconds.
     * </p>
     * </note>
     */
    private Integer maxRuntimeInSeconds;

    /**
     * <p>
     * The maximum runtime allowed in seconds.
     * </p>
     * <note>
     * <p>
     * The <code>MaxRuntimeInSeconds</code> cannot exceed the frequency of the job. For data quality and model
     * explainability, this can be up to 3600 seconds for an hourly schedule. For model bias and model quality hourly
     * schedules, this can be up to 1800 seconds.
     * </p>
     * </note>
     * 
     * @param maxRuntimeInSeconds
     *        The maximum runtime allowed in seconds.</p> <note>
     *        <p>
     *        The <code>MaxRuntimeInSeconds</code> cannot exceed the frequency of the job. For data quality and model
     *        explainability, this can be up to 3600 seconds for an hourly schedule. For model bias and model quality
     *        hourly schedules, this can be up to 1800 seconds.
     *        </p>
     */

    public void setMaxRuntimeInSeconds(Integer maxRuntimeInSeconds) {
        this.maxRuntimeInSeconds = maxRuntimeInSeconds;
    }

    /**
     * <p>
     * The maximum runtime allowed in seconds.
     * </p>
     * <note>
     * <p>
     * The <code>MaxRuntimeInSeconds</code> cannot exceed the frequency of the job. For data quality and model
     * explainability, this can be up to 3600 seconds for an hourly schedule. For model bias and model quality hourly
     * schedules, this can be up to 1800 seconds.
     * </p>
     * </note>
     * 
     * @return The maximum runtime allowed in seconds.</p> <note>
     *         <p>
     *         The <code>MaxRuntimeInSeconds</code> cannot exceed the frequency of the job. For data quality and model
     *         explainability, this can be up to 3600 seconds for an hourly schedule. For model bias and model quality
     *         hourly schedules, this can be up to 1800 seconds.
     *         </p>
     */

    public Integer getMaxRuntimeInSeconds() {
        return this.maxRuntimeInSeconds;
    }

    /**
     * <p>
     * The maximum runtime allowed in seconds.
     * </p>
     * <note>
     * <p>
     * The <code>MaxRuntimeInSeconds</code> cannot exceed the frequency of the job. For data quality and model
     * explainability, this can be up to 3600 seconds for an hourly schedule. For model bias and model quality hourly
     * schedules, this can be up to 1800 seconds.
     * </p>
     * </note>
     * 
     * @param maxRuntimeInSeconds
     *        The maximum runtime allowed in seconds.</p> <note>
     *        <p>
     *        The <code>MaxRuntimeInSeconds</code> cannot exceed the frequency of the job. For data quality and model
     *        explainability, this can be up to 3600 seconds for an hourly schedule. For model bias and model quality
     *        hourly schedules, this can be up to 1800 seconds.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitoringStoppingCondition withMaxRuntimeInSeconds(Integer maxRuntimeInSeconds) {
        setMaxRuntimeInSeconds(maxRuntimeInSeconds);
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
        if (getMaxRuntimeInSeconds() != null)
            sb.append("MaxRuntimeInSeconds: ").append(getMaxRuntimeInSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MonitoringStoppingCondition == false)
            return false;
        MonitoringStoppingCondition other = (MonitoringStoppingCondition) obj;
        if (other.getMaxRuntimeInSeconds() == null ^ this.getMaxRuntimeInSeconds() == null)
            return false;
        if (other.getMaxRuntimeInSeconds() != null && other.getMaxRuntimeInSeconds().equals(this.getMaxRuntimeInSeconds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxRuntimeInSeconds() == null) ? 0 : getMaxRuntimeInSeconds().hashCode());
        return hashCode;
    }

    @Override
    public MonitoringStoppingCondition clone() {
        try {
            return (MonitoringStoppingCondition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.MonitoringStoppingConditionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}