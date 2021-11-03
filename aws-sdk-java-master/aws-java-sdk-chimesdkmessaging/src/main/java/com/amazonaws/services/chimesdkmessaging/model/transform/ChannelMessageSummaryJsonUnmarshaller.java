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
package com.amazonaws.services.chimesdkmessaging.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.chimesdkmessaging.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ChannelMessageSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChannelMessageSummaryJsonUnmarshaller implements Unmarshaller<ChannelMessageSummary, JsonUnmarshallerContext> {

    public ChannelMessageSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        ChannelMessageSummary channelMessageSummary = new ChannelMessageSummary();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("MessageId", targetDepth)) {
                    context.nextToken();
                    channelMessageSummary.setMessageId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Content", targetDepth)) {
                    context.nextToken();
                    channelMessageSummary.setContent(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Metadata", targetDepth)) {
                    context.nextToken();
                    channelMessageSummary.setMetadata(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Type", targetDepth)) {
                    context.nextToken();
                    channelMessageSummary.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedTimestamp", targetDepth)) {
                    context.nextToken();
                    channelMessageSummary.setCreatedTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastUpdatedTimestamp", targetDepth)) {
                    context.nextToken();
                    channelMessageSummary.setLastUpdatedTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastEditedTimestamp", targetDepth)) {
                    context.nextToken();
                    channelMessageSummary.setLastEditedTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Sender", targetDepth)) {
                    context.nextToken();
                    channelMessageSummary.setSender(IdentityJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Redacted", targetDepth)) {
                    context.nextToken();
                    channelMessageSummary.setRedacted(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    channelMessageSummary.setStatus(ChannelMessageStatusStructureJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("MessageAttributes", targetDepth)) {
                    context.nextToken();
                    channelMessageSummary.setMessageAttributes(new MapUnmarshaller<String, MessageAttributeValue>(context.getUnmarshaller(String.class),
                            MessageAttributeValueJsonUnmarshaller.getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return channelMessageSummary;
    }

    private static ChannelMessageSummaryJsonUnmarshaller instance;

    public static ChannelMessageSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ChannelMessageSummaryJsonUnmarshaller();
        return instance;
    }
}