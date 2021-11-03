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
package com.amazonaws.services.transcribe.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/ListCallAnalyticsJobs" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCallAnalyticsJobsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * When specified, returns only call analytics jobs with the specified status. Jobs are ordered by creation date,
     * with the most recent jobs returned first. If you don't specify a status, Amazon Transcribe returns all analytics
     * jobs ordered by creation date.
     * </p>
     */
    private String status;
    /**
     * <p>
     * When specified, the jobs returned in the list are limited to jobs whose name contains the specified string.
     * </p>
     */
    private String jobNameContains;
    /**
     * <p>
     * If you receive a truncated result in the previous request of , include <code>NextToken</code> to fetch the next
     * set of jobs.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of call analytics jobs to return in each page of results. If there are fewer results than the
     * value you specify, only the actual results are returned. If you do not specify a value, the default of 5 is used.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * When specified, returns only call analytics jobs with the specified status. Jobs are ordered by creation date,
     * with the most recent jobs returned first. If you don't specify a status, Amazon Transcribe returns all analytics
     * jobs ordered by creation date.
     * </p>
     * 
     * @param status
     *        When specified, returns only call analytics jobs with the specified status. Jobs are ordered by creation
     *        date, with the most recent jobs returned first. If you don't specify a status, Amazon Transcribe returns
     *        all analytics jobs ordered by creation date.
     * @see CallAnalyticsJobStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * When specified, returns only call analytics jobs with the specified status. Jobs are ordered by creation date,
     * with the most recent jobs returned first. If you don't specify a status, Amazon Transcribe returns all analytics
     * jobs ordered by creation date.
     * </p>
     * 
     * @return When specified, returns only call analytics jobs with the specified status. Jobs are ordered by creation
     *         date, with the most recent jobs returned first. If you don't specify a status, Amazon Transcribe returns
     *         all analytics jobs ordered by creation date.
     * @see CallAnalyticsJobStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * When specified, returns only call analytics jobs with the specified status. Jobs are ordered by creation date,
     * with the most recent jobs returned first. If you don't specify a status, Amazon Transcribe returns all analytics
     * jobs ordered by creation date.
     * </p>
     * 
     * @param status
     *        When specified, returns only call analytics jobs with the specified status. Jobs are ordered by creation
     *        date, with the most recent jobs returned first. If you don't specify a status, Amazon Transcribe returns
     *        all analytics jobs ordered by creation date.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CallAnalyticsJobStatus
     */

    public ListCallAnalyticsJobsRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * When specified, returns only call analytics jobs with the specified status. Jobs are ordered by creation date,
     * with the most recent jobs returned first. If you don't specify a status, Amazon Transcribe returns all analytics
     * jobs ordered by creation date.
     * </p>
     * 
     * @param status
     *        When specified, returns only call analytics jobs with the specified status. Jobs are ordered by creation
     *        date, with the most recent jobs returned first. If you don't specify a status, Amazon Transcribe returns
     *        all analytics jobs ordered by creation date.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CallAnalyticsJobStatus
     */

    public ListCallAnalyticsJobsRequest withStatus(CallAnalyticsJobStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * When specified, the jobs returned in the list are limited to jobs whose name contains the specified string.
     * </p>
     * 
     * @param jobNameContains
     *        When specified, the jobs returned in the list are limited to jobs whose name contains the specified
     *        string.
     */

    public void setJobNameContains(String jobNameContains) {
        this.jobNameContains = jobNameContains;
    }

    /**
     * <p>
     * When specified, the jobs returned in the list are limited to jobs whose name contains the specified string.
     * </p>
     * 
     * @return When specified, the jobs returned in the list are limited to jobs whose name contains the specified
     *         string.
     */

    public String getJobNameContains() {
        return this.jobNameContains;
    }

    /**
     * <p>
     * When specified, the jobs returned in the list are limited to jobs whose name contains the specified string.
     * </p>
     * 
     * @param jobNameContains
     *        When specified, the jobs returned in the list are limited to jobs whose name contains the specified
     *        string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCallAnalyticsJobsRequest withJobNameContains(String jobNameContains) {
        setJobNameContains(jobNameContains);
        return this;
    }

    /**
     * <p>
     * If you receive a truncated result in the previous request of , include <code>NextToken</code> to fetch the next
     * set of jobs.
     * </p>
     * 
     * @param nextToken
     *        If you receive a truncated result in the previous request of , include <code>NextToken</code> to fetch the
     *        next set of jobs.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If you receive a truncated result in the previous request of , include <code>NextToken</code> to fetch the next
     * set of jobs.
     * </p>
     * 
     * @return If you receive a truncated result in the previous request of , include <code>NextToken</code> to fetch
     *         the next set of jobs.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If you receive a truncated result in the previous request of , include <code>NextToken</code> to fetch the next
     * set of jobs.
     * </p>
     * 
     * @param nextToken
     *        If you receive a truncated result in the previous request of , include <code>NextToken</code> to fetch the
     *        next set of jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCallAnalyticsJobsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of call analytics jobs to return in each page of results. If there are fewer results than the
     * value you specify, only the actual results are returned. If you do not specify a value, the default of 5 is used.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of call analytics jobs to return in each page of results. If there are fewer results
     *        than the value you specify, only the actual results are returned. If you do not specify a value, the
     *        default of 5 is used.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of call analytics jobs to return in each page of results. If there are fewer results than the
     * value you specify, only the actual results are returned. If you do not specify a value, the default of 5 is used.
     * </p>
     * 
     * @return The maximum number of call analytics jobs to return in each page of results. If there are fewer results
     *         than the value you specify, only the actual results are returned. If you do not specify a value, the
     *         default of 5 is used.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of call analytics jobs to return in each page of results. If there are fewer results than the
     * value you specify, only the actual results are returned. If you do not specify a value, the default of 5 is used.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of call analytics jobs to return in each page of results. If there are fewer results
     *        than the value you specify, only the actual results are returned. If you do not specify a value, the
     *        default of 5 is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCallAnalyticsJobsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getJobNameContains() != null)
            sb.append("JobNameContains: ").append(getJobNameContains()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListCallAnalyticsJobsRequest == false)
            return false;
        ListCallAnalyticsJobsRequest other = (ListCallAnalyticsJobsRequest) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getJobNameContains() == null ^ this.getJobNameContains() == null)
            return false;
        if (other.getJobNameContains() != null && other.getJobNameContains().equals(this.getJobNameContains()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getJobNameContains() == null) ? 0 : getJobNameContains().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListCallAnalyticsJobsRequest clone() {
        return (ListCallAnalyticsJobsRequest) super.clone();
    }

}