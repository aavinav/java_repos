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
package com.amazonaws.services.codebuild.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codebuild.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ProjectBuildBatchConfigMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ProjectBuildBatchConfigMarshaller {

    private static final MarshallingInfo<String> SERVICEROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("serviceRole").build();
    private static final MarshallingInfo<Boolean> COMBINEARTIFACTS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("combineArtifacts").build();
    private static final MarshallingInfo<StructuredPojo> RESTRICTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("restrictions").build();
    private static final MarshallingInfo<Integer> TIMEOUTINMINS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("timeoutInMins").build();
    private static final MarshallingInfo<String> BATCHREPORTMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("batchReportMode").build();

    private static final ProjectBuildBatchConfigMarshaller instance = new ProjectBuildBatchConfigMarshaller();

    public static ProjectBuildBatchConfigMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ProjectBuildBatchConfig projectBuildBatchConfig, ProtocolMarshaller protocolMarshaller) {

        if (projectBuildBatchConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(projectBuildBatchConfig.getServiceRole(), SERVICEROLE_BINDING);
            protocolMarshaller.marshall(projectBuildBatchConfig.getCombineArtifacts(), COMBINEARTIFACTS_BINDING);
            protocolMarshaller.marshall(projectBuildBatchConfig.getRestrictions(), RESTRICTIONS_BINDING);
            protocolMarshaller.marshall(projectBuildBatchConfig.getTimeoutInMins(), TIMEOUTINMINS_BINDING);
            protocolMarshaller.marshall(projectBuildBatchConfig.getBatchReportMode(), BATCHREPORTMODE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}