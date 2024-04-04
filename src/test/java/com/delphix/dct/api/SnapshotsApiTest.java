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
import com.delphix.dct.models.DeleteSnapshotResponse;
import com.delphix.dct.models.DeleteTag;
import com.delphix.dct.models.FindByLocationResponse;
import com.delphix.dct.models.FindByTimestampResponse;
import com.delphix.dct.models.ListSnapshotsResponse;
import java.time.OffsetDateTime;
import com.delphix.dct.models.SearchBody;
import com.delphix.dct.models.SearchSnapshotsResponse;
import com.delphix.dct.models.Snapshot;
import com.delphix.dct.models.TagsRequest;
import com.delphix.dct.models.TagsResponse;
import com.delphix.dct.models.TimeflowRange;
import com.delphix.dct.models.UnsetSnapshotRetentionResponse;
import com.delphix.dct.models.UpdateSnapshotParameters;
import com.delphix.dct.models.UpdateSnapshotResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SnapshotsApi
 */
@Disabled
public class SnapshotsApiTest {

    private final SnapshotsApi api = new SnapshotsApi();

    /**
     * Create tags for a Snapshot.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createSnapshotTagsTest() throws ApiException {
        String snapshotId = null;
        TagsRequest tagsRequest = null;
        TagsResponse response = api.createSnapshotTags(snapshotId, tagsRequest);
        // TODO: test validations
    }

    /**
     * Delete a Snapshot.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteSnapshotTest() throws ApiException {
        String snapshotId = null;
        DeleteSnapshotResponse response = api.deleteSnapshot(snapshotId);
        // TODO: test validations
    }

    /**
     * Delete tags for a Snapshot.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteSnapshotTagsTest() throws ApiException {
        String snapshotId = null;
        DeleteTag deleteTag = null;
        api.deleteSnapshotTags(snapshotId, deleteTag);
        // TODO: test validations
    }

    /**
     * Get the snapshots at this location for a dataset.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findByLocationTest() throws ApiException {
        String datasetId = null;
        String location = null;
        FindByLocationResponse response = api.findByLocation(datasetId, location);
        // TODO: test validations
    }

    /**
     * Get the snapshots at this timestamp for a dataset.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findByTimestampTest() throws ApiException {
        String datasetId = null;
        OffsetDateTime timestamp = null;
        FindByTimestampResponse response = api.findByTimestamp(datasetId, timestamp);
        // TODO: test validations
    }

    /**
     * Get a Snapshot by ID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSnapshotByIdTest() throws ApiException {
        String snapshotId = null;
        Snapshot response = api.getSnapshotById(snapshotId);
        // TODO: test validations
    }

    /**
     * Get tags for a Snapshot.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSnapshotTagsTest() throws ApiException {
        String snapshotId = null;
        TagsResponse response = api.getSnapshotTags(snapshotId);
        // TODO: test validations
    }

    /**
     * Return the provisionable timeflow range based on a specific snapshot.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSnapshotTimeflowRangeTest() throws ApiException {
        String snapshotId = null;
        TimeflowRange response = api.getSnapshotTimeflowRange(snapshotId);
        // TODO: test validations
    }

    /**
     * Retrieve the list of snapshots.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSnapshotsTest() throws ApiException {
        Integer limit = null;
        String cursor = null;
        String sort = null;
        ListSnapshotsResponse response = api.getSnapshots(limit, cursor, sort);
        // TODO: test validations
    }

    /**
     * Search snapshots.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchSnapshotsTest() throws ApiException {
        Integer limit = null;
        String cursor = null;
        String sort = null;
        SearchBody searchBody = null;
        SearchSnapshotsResponse response = api.searchSnapshots(limit, cursor, sort, searchBody);
        // TODO: test validations
    }

    /**
     * Unset a Snapshot&#39;s expiration, removing expiration and retain_forever values for the snapshot.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void unsetSnapshotRetentionTest() throws ApiException {
        String snapshotId = null;
        UnsetSnapshotRetentionResponse response = api.unsetSnapshotRetention(snapshotId);
        // TODO: test validations
    }

    /**
     * Update values of a Snapshot.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateSnapshotTest() throws ApiException {
        String snapshotId = null;
        UpdateSnapshotParameters updateSnapshotParameters = null;
        UpdateSnapshotResponse response = api.updateSnapshot(snapshotId, updateSnapshotParameters);
        // TODO: test validations
    }

}