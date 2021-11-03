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
package com.amazonaws.services.lightsail.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lightsail.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateBucketRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateBucketRequestMarshaller {

    private static final MarshallingInfo<String> BUCKETNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("bucketName").build();
    private static final MarshallingInfo<StructuredPojo> ACCESSRULES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("accessRules").build();
    private static final MarshallingInfo<String> VERSIONING_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("versioning").build();
    private static final MarshallingInfo<List> READONLYACCESSACCOUNTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("readonlyAccessAccounts").build();
    private static final MarshallingInfo<StructuredPojo> ACCESSLOGCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("accessLogConfig").build();

    private static final UpdateBucketRequestMarshaller instance = new UpdateBucketRequestMarshaller();

    public static UpdateBucketRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateBucketRequest updateBucketRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateBucketRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateBucketRequest.getBucketName(), BUCKETNAME_BINDING);
            protocolMarshaller.marshall(updateBucketRequest.getAccessRules(), ACCESSRULES_BINDING);
            protocolMarshaller.marshall(updateBucketRequest.getVersioning(), VERSIONING_BINDING);
            protocolMarshaller.marshall(updateBucketRequest.getReadonlyAccessAccounts(), READONLYACCESSACCOUNTS_BINDING);
            protocolMarshaller.marshall(updateBucketRequest.getAccessLogConfig(), ACCESSLOGCONFIG_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}