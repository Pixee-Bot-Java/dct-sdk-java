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
import com.delphix.dct.models.DeleteTag;
import com.delphix.dct.models.ListToolkitResponse;
import com.delphix.dct.models.SearchBody;
import com.delphix.dct.models.SearchToolkitResponse;
import com.delphix.dct.models.TagsRequest;
import com.delphix.dct.models.TagsResponse;
import com.delphix.dct.models.Toolkit;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ToolkitsApi
 */
@Disabled
public class ToolkitsApiTest {

    private final ToolkitsApi api = new ToolkitsApi();

    /**
     * Create tags for a toolkit.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createToolkitTagsTest() throws ApiException {
        String toolkitId = null;
        TagsRequest tagsRequest = null;
        TagsResponse response = api.createToolkitTags(toolkitId, tagsRequest);
        // TODO: test validations
    }

    /**
     * Delete tags for a Toolkit.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteToolkitTagsTest() throws ApiException {
        String toolkitId = null;
        DeleteTag deleteTag = null;
        api.deleteToolkitTags(toolkitId, deleteTag);
        // TODO: test validations
    }

    /**
     * Get Toolkit by ID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getToolkitByIdTest() throws ApiException {
        String toolkitId = null;
        Toolkit response = api.getToolkitById(toolkitId);
        // TODO: test validations
    }

    /**
     * Get tags for a Toolkit.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getToolkitTagsTest() throws ApiException {
        String toolkitId = null;
        TagsResponse response = api.getToolkitTags(toolkitId);
        // TODO: test validations
    }

    /**
     * List all toolkits.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getToolkitsTest() throws ApiException {
        Integer limit = null;
        String cursor = null;
        String sort = null;
        ListToolkitResponse response = api.getToolkits(limit, cursor, sort);
        // TODO: test validations
    }

    /**
     * Search for toolkits.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchToolkitsTest() throws ApiException {
        Integer limit = null;
        String cursor = null;
        String sort = null;
        SearchBody searchBody = null;
        SearchToolkitResponse response = api.searchToolkits(limit, cursor, sort, searchBody);
        // TODO: test validations
    }

}
