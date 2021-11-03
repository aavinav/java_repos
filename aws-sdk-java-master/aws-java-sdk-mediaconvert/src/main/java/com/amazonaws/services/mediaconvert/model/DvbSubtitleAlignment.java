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
package com.amazonaws.services.mediaconvert.model;

import javax.annotation.Generated;

/**
 * Specify the alignment of your captions. If no explicit x_position is provided, setting alignment to centered will
 * placethe captions at the bottom center of the output. Similarly, setting a left alignment willalign captions to the
 * bottom left of the output. If x and y positions are given in conjunction with the alignment parameter, the font will
 * be justified (either left or centered) relative to those coordinates. Within your job settings, all of your DVB-Sub
 * settings must be identical.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum DvbSubtitleAlignment {

    CENTERED("CENTERED"),
    LEFT("LEFT"),
    AUTO("AUTO");

    private String value;

    private DvbSubtitleAlignment(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *        real value
     * @return DvbSubtitleAlignment corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static DvbSubtitleAlignment fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (DvbSubtitleAlignment enumEntry : DvbSubtitleAlignment.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}