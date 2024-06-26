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
import com.delphix.dct.models.ExecuteReplicationProfileResponse;
import com.delphix.dct.models.ListReplicationProfilesResponse;
import com.delphix.dct.models.ReplicationProfile;
import com.delphix.dct.models.ReplicationProfileDeleteJobResponse;
import com.delphix.dct.models.SearchBody;
import com.delphix.dct.models.SearchReplicationProfilesResponse;
import com.delphix.dct.models.TagsRequest;
import com.delphix.dct.models.TagsResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ReplicationApi
 */
@Disabled
public class ReplicationApiTest {

    private final ReplicationApi api = new ReplicationApi();

    /**
     * Create tags for a ReplicationProfile.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createReplicationProfileTagsTest() throws ApiException {
        String replicationProfileId = null;
        TagsRequest tagsRequest = null;
        TagsResponse response = api.createReplicationProfileTags(replicationProfileId, tagsRequest);
        // TODO: test validations
    }

    /**
     * Delete tags for a ReplicationProfile.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteRepliationProfileTagsTest() throws ApiException {
        String replicationProfileId = null;
        DeleteTag deleteTag = null;
        api.deleteRepliationProfileTags(replicationProfileId, deleteTag);
        // TODO: test validations
    }

    /**
     * Delete a ReplicationProfile.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteReplicationProfileTest() throws ApiException {
        String replicationProfileId = null;
        ReplicationProfileDeleteJobResponse response = api.deleteReplicationProfile(replicationProfileId);
        // TODO: test validations
    }

    /**
     * Disable tag replication for given ReplicationProfile.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void disableTagReplicationTest() throws ApiException {
        String replicationProfileId = null;
        api.disableTagReplication(replicationProfileId);
        // TODO: test validations
    }

    /**
     * Enable tag replication for given ReplicationProfile.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void enableTagReplicationTest() throws ApiException {
        String replicationProfileId = null;
        api.enableTagReplication(replicationProfileId);
        // TODO: test validations
    }

    /**
     * Execute a ReplicationProfile.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void executeReplicationProfileTest() throws ApiException {
        String replicationProfileId = null;
        ExecuteReplicationProfileResponse response = api.executeReplicationProfile(replicationProfileId);
        // TODO: test validations
    }

    /**
     * Get a ReplicationProfile by ID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getReplicationProfileByIdTest() throws ApiException {
        String replicationProfileId = null;
        ReplicationProfile response = api.getReplicationProfileById(replicationProfileId);
        // TODO: test validations
    }

    /**
     * Get tags for a ReplicationProfile.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getReplicationProfileTagsTest() throws ApiException {
        String replicationProfileId = null;
        TagsResponse response = api.getReplicationProfileTags(replicationProfileId);
        // TODO: test validations
    }

    /**
     * List all ReplicationProfiles.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getReplicationProfilesTest() throws ApiException {
        Integer limit = null;
        String cursor = null;
        String sort = null;
        ListReplicationProfilesResponse response = api.getReplicationProfiles(limit, cursor, sort);
        // TODO: test validations
    }

    /**
     * Search for ReplicationProfiles.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchReplicationProfilesTest() throws ApiException {
        Integer limit = null;
        String cursor = null;
        String sort = null;
        SearchBody searchBody = null;
        SearchReplicationProfilesResponse response = api.searchReplicationProfiles(limit, cursor, sort, searchBody);
        // TODO: test validations
    }

}
