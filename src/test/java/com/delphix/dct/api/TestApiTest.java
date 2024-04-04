/*
 * Delphix DCT API
 * Delphix DCT API
 *
 * The version of the OpenAPI document: 3.10.0
 * Contact: support@delphix.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.delphix.dct.api;

import com.delphix.dct.ApiException;
import com.delphix.dct.models.EnableScaleTestingRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TestApi
 */
@Disabled
public class TestApiTest {

    private final TestApi api = new TestApi();

    /**
     * This is used for performance testing to enable engine and object duplication.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void enableScaleTestingTest() throws ApiException {
        EnableScaleTestingRequest enableScaleTestingRequest = null;
        api.enableScaleTesting(enableScaleTestingRequest);
        // TODO: test validations
    }

}
