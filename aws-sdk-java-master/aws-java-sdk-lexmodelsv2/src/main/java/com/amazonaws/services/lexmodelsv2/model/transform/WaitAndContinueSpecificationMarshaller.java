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
package com.amazonaws.services.lexmodelsv2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lexmodelsv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * WaitAndContinueSpecificationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class WaitAndContinueSpecificationMarshaller {

    private static final MarshallingInfo<StructuredPojo> WAITINGRESPONSE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("waitingResponse").build();
    private static final MarshallingInfo<StructuredPojo> CONTINUERESPONSE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("continueResponse").build();
    private static final MarshallingInfo<StructuredPojo> STILLWAITINGRESPONSE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("stillWaitingResponse").build();
    private static final MarshallingInfo<Boolean> ACTIVE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("active").build();

    private static final WaitAndContinueSpecificationMarshaller instance = new WaitAndContinueSpecificationMarshaller();

    public static WaitAndContinueSpecificationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(WaitAndContinueSpecification waitAndContinueSpecification, ProtocolMarshaller protocolMarshaller) {

        if (waitAndContinueSpecification == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(waitAndContinueSpecification.getWaitingResponse(), WAITINGRESPONSE_BINDING);
            protocolMarshaller.marshall(waitAndContinueSpecification.getContinueResponse(), CONTINUERESPONSE_BINDING);
            protocolMarshaller.marshall(waitAndContinueSpecification.getStillWaitingResponse(), STILLWAITINGRESPONSE_BINDING);
            protocolMarshaller.marshall(waitAndContinueSpecification.getActive(), ACTIVE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}