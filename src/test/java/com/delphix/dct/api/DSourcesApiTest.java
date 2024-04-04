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
import com.delphix.dct.models.ASEDSourceLinkSourceParameters;
import com.delphix.dct.models.AppDataDSourceLinkSourceParameters;
import com.delphix.dct.models.DSource;
import com.delphix.dct.models.DSourceSnapshotParameters;
import com.delphix.dct.models.DeleteDSourceRequest;
import com.delphix.dct.models.DeleteTag;
import com.delphix.dct.models.DisableDsourceParameters;
import com.delphix.dct.models.DisableDsourceResponse;
import com.delphix.dct.models.EnableDsourceParameters;
import com.delphix.dct.models.EnableDsourceResponse;
import com.delphix.dct.models.Job;
import com.delphix.dct.models.LinkDSourceDefaultRequest;
import com.delphix.dct.models.LinkDSourceResponse;
import com.delphix.dct.models.LinkStagingPushDSourceDefaultRequest;
import com.delphix.dct.models.ListDSourcesResponse;
import com.delphix.dct.models.ListSnapshotsResponse;
import com.delphix.dct.models.MSSQLDSourceLinkSourceParameters;
import com.delphix.dct.models.MSSQLDSourceStagingPushLinkSourceParameters;
import com.delphix.dct.models.OracleDSourceLinkSourceParameters;
import com.delphix.dct.models.OracleLinkStagingPushDSourceDefaultRequest;
import com.delphix.dct.models.OracleStagingPushDSourceLinkSourceParameters;
import com.delphix.dct.models.PermissionEnum;
import com.delphix.dct.models.SearchBody;
import com.delphix.dct.models.SearchDSourcesResponse;
import com.delphix.dct.models.SnapshotDSourceResponse;
import com.delphix.dct.models.TagsRequest;
import com.delphix.dct.models.TagsResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DSourcesApi
 */
@Disabled
public class DSourcesApiTest {

    private final DSourcesApi api = new DSourcesApi();

    /**
     * Create tags for a dSource.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createTagsDsourceTest() throws ApiException {
        String dsourceId = null;
        TagsRequest tagsRequest = null;
        TagsResponse response = api.createTagsDsource(dsourceId, tagsRequest);
        // TODO: test validations
    }

    /**
     * Delete the specified dSource.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteDsourceTest() throws ApiException {
        DeleteDSourceRequest deleteDSourceRequest = null;
        Job response = api.deleteDsource(deleteDSourceRequest);
        // TODO: test validations
    }

    /**
     * Delete tags for a dSource.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteTagsDsourceTest() throws ApiException {
        String dsourceId = null;
        DeleteTag deleteTag = null;
        api.deleteTagsDsource(dsourceId, deleteTag);
        // TODO: test validations
    }

    /**
     * Disable a dSource.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void disableDsourceTest() throws ApiException {
        String dsourceId = null;
        DisableDsourceParameters disableDsourceParameters = null;
        DisableDsourceResponse response = api.disableDsource(dsourceId, disableDsourceParameters);
        // TODO: test validations
    }

    /**
     * Enable a dSource.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void enableDsourceTest() throws ApiException {
        String dsourceId = null;
        EnableDsourceParameters enableDsourceParameters = null;
        EnableDsourceResponse response = api.enableDsource(dsourceId, enableDsourceParameters);
        // TODO: test validations
    }

    /**
     * Get defaults for an AppData dSource linking.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAppdataDsourceLinkingDefaultsTest() throws ApiException {
        LinkDSourceDefaultRequest linkDSourceDefaultRequest = null;
        AppDataDSourceLinkSourceParameters response = api.getAppdataDsourceLinkingDefaults(linkDSourceDefaultRequest);
        // TODO: test validations
    }

    /**
     * Get defaults for an ASE dSource linking.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAseDsourceLinkingDefaultsTest() throws ApiException {
        LinkDSourceDefaultRequest linkDSourceDefaultRequest = null;
        ASEDSourceLinkSourceParameters response = api.getAseDsourceLinkingDefaults(linkDSourceDefaultRequest);
        // TODO: test validations
    }

    /**
     * Get a dSource by ID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDsourceByIdTest() throws ApiException {
        String dsourceId = null;
        DSource response = api.getDsourceById(dsourceId);
        // TODO: test validations
    }

    /**
     * List Snapshots for a dSource.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDsourceSnapshotsTest() throws ApiException {
        String dsourceId = null;
        Integer limit = null;
        String cursor = null;
        ListSnapshotsResponse response = api.getDsourceSnapshots(dsourceId, limit, cursor);
        // TODO: test validations
    }

    /**
     * List all dSources.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDsourcesTest() throws ApiException {
        Integer limit = null;
        String cursor = null;
        String sort = null;
        PermissionEnum permission = null;
        ListDSourcesResponse response = api.getDsources(limit, cursor, sort, permission);
        // TODO: test validations
    }

    /**
     * Get defaults for a MSSql dSource linking.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getMssqlDsourceLinkingDefaultsTest() throws ApiException {
        LinkDSourceDefaultRequest linkDSourceDefaultRequest = null;
        MSSQLDSourceLinkSourceParameters response = api.getMssqlDsourceLinkingDefaults(linkDSourceDefaultRequest);
        // TODO: test validations
    }

    /**
     * Get defaults for a MSSql staging push dSource linking.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getMssqlStagingPushDsourceLinkingDefaultsTest() throws ApiException {
        LinkStagingPushDSourceDefaultRequest linkStagingPushDSourceDefaultRequest = null;
        MSSQLDSourceStagingPushLinkSourceParameters response = api.getMssqlStagingPushDsourceLinkingDefaults(linkStagingPushDSourceDefaultRequest);
        // TODO: test validations
    }

    /**
     * Get defaults for dSource linking.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getOracleDsourceLinkingDefaultsTest() throws ApiException {
        LinkDSourceDefaultRequest linkDSourceDefaultRequest = null;
        OracleDSourceLinkSourceParameters response = api.getOracleDsourceLinkingDefaults(linkDSourceDefaultRequest);
        // TODO: test validations
    }

    /**
     * Get defaults for a Oracle staging push dSource linking.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getOracleStagingPushDsourceLinkingDefaultsTest() throws ApiException {
        OracleLinkStagingPushDSourceDefaultRequest oracleLinkStagingPushDSourceDefaultRequest = null;
        OracleStagingPushDSourceLinkSourceParameters response = api.getOracleStagingPushDsourceLinkingDefaults(oracleLinkStagingPushDSourceDefaultRequest);
        // TODO: test validations
    }

    /**
     * Get tags for a dSource.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTagsDsourceTest() throws ApiException {
        String dsourceId = null;
        TagsResponse response = api.getTagsDsource(dsourceId);
        // TODO: test validations
    }

    /**
     * Link an AppData database as dSource.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void linkAppdataDatabaseTest() throws ApiException {
        AppDataDSourceLinkSourceParameters appDataDSourceLinkSourceParameters = null;
        LinkDSourceResponse response = api.linkAppdataDatabase(appDataDSourceLinkSourceParameters);
        // TODO: test validations
    }

    /**
     * Link an ASE database as dSource.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void linkAseDatabaseTest() throws ApiException {
        ASEDSourceLinkSourceParameters asEDSourceLinkSourceParameters = null;
        LinkDSourceResponse response = api.linkAseDatabase(asEDSourceLinkSourceParameters);
        // TODO: test validations
    }

    /**
     * Link a MSSql database as dSource.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void linkMssqlDatabaseTest() throws ApiException {
        MSSQLDSourceLinkSourceParameters msSQLDSourceLinkSourceParameters = null;
        LinkDSourceResponse response = api.linkMssqlDatabase(msSQLDSourceLinkSourceParameters);
        // TODO: test validations
    }

    /**
     * Link a MSSql staging push database as dSource.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void linkMssqlStagingPushDatabaseTest() throws ApiException {
        MSSQLDSourceStagingPushLinkSourceParameters msSQLDSourceStagingPushLinkSourceParameters = null;
        LinkDSourceResponse response = api.linkMssqlStagingPushDatabase(msSQLDSourceStagingPushLinkSourceParameters);
        // TODO: test validations
    }

    /**
     * Link Oracle database as dSource.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void linkOracleDatabaseTest() throws ApiException {
        OracleDSourceLinkSourceParameters oracleDSourceLinkSourceParameters = null;
        LinkDSourceResponse response = api.linkOracleDatabase(oracleDSourceLinkSourceParameters);
        // TODO: test validations
    }

    /**
     * Link an Oracle staging push database as dSource.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void linkOracleStagingPushDatabaseTest() throws ApiException {
        OracleStagingPushDSourceLinkSourceParameters oracleStagingPushDSourceLinkSourceParameters = null;
        LinkDSourceResponse response = api.linkOracleStagingPushDatabase(oracleStagingPushDSourceLinkSourceParameters);
        // TODO: test validations
    }

    /**
     * Search for dSources.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchDsourcesTest() throws ApiException {
        Integer limit = null;
        String cursor = null;
        String sort = null;
        PermissionEnum permission = null;
        SearchBody searchBody = null;
        SearchDSourcesResponse response = api.searchDsources(limit, cursor, sort, permission, searchBody);
        // TODO: test validations
    }

    /**
     * Snapshot a dSource.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void snapshotDsourceTest() throws ApiException {
        String dsourceId = null;
        DSourceSnapshotParameters dsourceSnapshotParameters = null;
        SnapshotDSourceResponse response = api.snapshotDsource(dsourceId, dsourceSnapshotParameters);
        // TODO: test validations
    }

}
