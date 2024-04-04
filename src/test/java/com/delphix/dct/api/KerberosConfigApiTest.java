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
import com.delphix.dct.models.KerberosConfig;
import com.delphix.dct.models.ListKerberosConfigsResponse;
import com.delphix.dct.models.SearchBody;
import com.delphix.dct.models.SearchKerberosConfigsResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for KerberosConfigApi
 */
@Disabled
public class KerberosConfigApiTest {

    private final KerberosConfigApi api = new KerberosConfigApi();

    /**
     * Get a kerberos config by ID or Name.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getKerberosConfigByIdTest() throws ApiException {
        String kerberosConfigId = null;
        KerberosConfig response = api.getKerberosConfigById(kerberosConfigId);
        // TODO: test validations
    }

    /**
     * List all kerberos configs.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listKerberosConfigsTest() throws ApiException {
        Integer limit = null;
        String cursor = null;
        String sort = null;
        ListKerberosConfigsResponse response = api.listKerberosConfigs(limit, cursor, sort);
        // TODO: test validations
    }

    /**
     * Search for Kerberos Configs.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchKerberosConfigsTest() throws ApiException {
        Integer limit = null;
        String cursor = null;
        String sort = null;
        SearchBody searchBody = null;
        SearchKerberosConfigsResponse response = api.searchKerberosConfigs(limit, cursor, sort, searchBody);
        // TODO: test validations
    }

}
