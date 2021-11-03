/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package software.amazon.awssdk.core.client.config;

import java.net.URI;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import software.amazon.awssdk.annotations.SdkProtectedApi;
import software.amazon.awssdk.core.ClientType;
import software.amazon.awssdk.core.ServiceConfiguration;
import software.amazon.awssdk.core.interceptor.ExecutionAttributes;
import software.amazon.awssdk.core.interceptor.ExecutionInterceptor;
import software.amazon.awssdk.core.retry.RetryMode;
import software.amazon.awssdk.core.retry.RetryPolicy;
import software.amazon.awssdk.http.SdkHttpClient;
import software.amazon.awssdk.http.async.SdkAsyncHttpClient;
import software.amazon.awssdk.metrics.MetricPublisher;
import software.amazon.awssdk.profiles.ProfileFile;

/**
 * A set of internal options required by the SDK via {@link SdkClientConfiguration}.
 */
@SdkProtectedApi
public final class SdkClientOption<T> extends ClientOption<T> {
    /**
     * @see ClientOverrideConfiguration#headers()
     */
    public static final SdkClientOption<Map<String, List<String>>> ADDITIONAL_HTTP_HEADERS =
            new SdkClientOption<>(new UnsafeValueType(Map.class));

    /**
     * @see ClientOverrideConfiguration#retryPolicy()
     */
    public static final SdkClientOption<RetryPolicy> RETRY_POLICY = new SdkClientOption<>(RetryPolicy.class);

    /**
     * @see ClientOverrideConfiguration#executionInterceptors()
     */
    public static final SdkClientOption<List<ExecutionInterceptor>> EXECUTION_INTERCEPTORS =
            new SdkClientOption<>(new UnsafeValueType(List.class));

    /**
     * The effective endpoint the client is configured to make requests to. If the client has been configured with
     * an endpoint override then this value will be the provided endpoint value.
     */
    public static final SdkClientOption<URI> ENDPOINT = new SdkClientOption<>(URI.class);

    /**
     * A flag that when set to true indicates the endpoint stored in {@link SdkClientOption#ENDPOINT} was a customer
     * supplied value and not generated by the client based on Region metadata.
     */
    public static final SdkClientOption<Boolean> ENDPOINT_OVERRIDDEN = new SdkClientOption<>(Boolean.class);

    /**
     * Service-specific configuration used by some services, like S3.
     */
    public static final SdkClientOption<ServiceConfiguration> SERVICE_CONFIGURATION =
            new SdkClientOption<>(ServiceConfiguration.class);

    /**
     * Whether to calculate the CRC 32 checksum of a message based on the uncompressed data. By default, this is false.
     */
    public static final SdkClientOption<Boolean> CRC32_FROM_COMPRESSED_DATA_ENABLED =
        new SdkClientOption<>(Boolean.class);

    /**
     * The internal SDK scheduled executor service that is used for scheduling tasks such as async retry attempts
     * and timeout task.
     */
    public static final SdkClientOption<ScheduledExecutorService> SCHEDULED_EXECUTOR_SERVICE =
            new SdkClientOption<>(ScheduledExecutorService.class);

    /**
     * The asynchronous HTTP client implementation to make HTTP requests with.
     */
    public static final SdkClientOption<SdkAsyncHttpClient> ASYNC_HTTP_CLIENT =
            new SdkClientOption<>(SdkAsyncHttpClient.class);

    /**
     * The HTTP client implementation to make HTTP requests with.
     */
    public static final SdkClientOption<SdkHttpClient> SYNC_HTTP_CLIENT =
            new SdkClientOption<>(SdkHttpClient.class);

    /**
     * The type of client used to make requests.
     */
    public static final SdkClientOption<ClientType> CLIENT_TYPE = new SdkClientOption<>(ClientType.class);

    /**
     * @see ClientOverrideConfiguration#apiCallAttemptTimeout()
     */
    public static final SdkClientOption<Duration> API_CALL_ATTEMPT_TIMEOUT = new SdkClientOption<>(Duration.class);

    /**
     * @see ClientOverrideConfiguration#apiCallTimeout()
     */
    public static final SdkClientOption<Duration> API_CALL_TIMEOUT = new SdkClientOption<>(Duration.class);

    /**
     * Descriptive name for the service. Used primarily for metrics and also in metadata like AwsErrorDetails.
     */
    public static final SdkClientOption<String> SERVICE_NAME = new SdkClientOption<>(String.class);

    /**
     * Whether or not endpoint discovery is enabled for this client.
     */
    public static final SdkClientOption<Boolean> ENDPOINT_DISCOVERY_ENABLED = new SdkClientOption<>(Boolean.class);

    /**
     * The profile file to use for this client.
     */
    public static final SdkClientOption<ProfileFile> PROFILE_FILE = new SdkClientOption<>(ProfileFile.class);

    /**
     * The profile name to use for this client.
     */
    public static final SdkClientOption<String> PROFILE_NAME = new SdkClientOption<>(String.class);

    public static final SdkClientOption<List<MetricPublisher>> METRIC_PUBLISHERS =
            new SdkClientOption<>(new UnsafeValueType(List.class));

    /**
     * Option to specify if the default signer has been overridden on the client.
     */
    public static final SdkClientOption<Boolean> SIGNER_OVERRIDDEN = new SdkClientOption<>(Boolean.class);

    /**
     * Option to specify additional execution attributes to each client call.
     */
    public static final SdkClientOption<ExecutionAttributes> EXECUTION_ATTRIBUTES =
            new SdkClientOption<>(new UnsafeValueType(ExecutionAttributes.class));
    /**
     * Option to specify the internal user agent.
     */
    public static final SdkClientOption<String> INTERNAL_USER_AGENT = new SdkClientOption<>(String.class);

    /**
     * Option to specify the default retry mode.
     *
     * @see RetryMode.Resolver#defaultRetryMode(RetryMode)
     */
    public static final SdkClientOption<RetryMode> DEFAULT_RETRY_MODE = new SdkClientOption<>(RetryMode.class);

    private SdkClientOption(Class<T> valueClass) {
        super(valueClass);
    }

    private SdkClientOption(UnsafeValueType valueType) {
        super(valueType);
    }
}