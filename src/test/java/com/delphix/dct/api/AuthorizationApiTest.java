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
import com.delphix.dct.models.AccessGroup;
import com.delphix.dct.models.AccessGroupAccountIdsRequest;
import com.delphix.dct.models.AccessGroupScope;
import com.delphix.dct.models.AccessGroupScopesRequest;
import com.delphix.dct.models.AccessGroupUpdateParameters;
import com.delphix.dct.models.AllObjectPermissionsResponse;
import com.delphix.dct.models.AlwaysAllowedPermissionRequest;
import com.delphix.dct.models.CreateRole;
import com.delphix.dct.models.DeleteScopeObjectTags;
import com.delphix.dct.models.DeleteScopedObjectItem;
import com.delphix.dct.models.DeleteTag;
import com.delphix.dct.models.ListAccessGroupsResponse;
import com.delphix.dct.models.ListRolesResponse;
import com.delphix.dct.models.ObjectPermissionsResponse;
import com.delphix.dct.models.PermissionsRequest;
import com.delphix.dct.models.Role;
import com.delphix.dct.models.RoleUpdateParameters;
import com.delphix.dct.models.ScopeTagsRequest;
import com.delphix.dct.models.ScopeTagsResponse;
import com.delphix.dct.models.ScopedObjectItemsResponse;
import com.delphix.dct.models.ScopedObjectsRequest;
import com.delphix.dct.models.SearchAccessGroupsResponse;
import com.delphix.dct.models.SearchBody;
import com.delphix.dct.models.SearchRolesResponse;
import com.delphix.dct.models.TagsRequest;
import com.delphix.dct.models.TagsResponse;
import com.delphix.dct.models.UpdateAccessGroupScope;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AuthorizationApi
 */
@Disabled
public class AuthorizationApiTest {

    private final AuthorizationApi api = new AuthorizationApi();

    /**
     * Add account ids to an Access group
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addAccessGroupAccountIdsTest() throws ApiException {
        String accessGroupId = null;
        AccessGroupAccountIdsRequest accessGroupAccountIdsRequest = null;
        AccessGroup response = api.addAccessGroupAccountIds(accessGroupId, accessGroupAccountIdsRequest);
        // TODO: test validations
    }

    /**
     * Add account tags to an Access group
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addAccessGroupAccountTagsTest() throws ApiException {
        String accessGroupId = null;
        TagsRequest tagsRequest = null;
        AccessGroup response = api.addAccessGroupAccountTags(accessGroupId, tagsRequest);
        // TODO: test validations
    }

    /**
     * Add scopes to an Access group
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addAccessGroupScopesTest() throws ApiException {
        String accessGroupId = null;
        AccessGroupScopesRequest accessGroupScopesRequest = null;
        AccessGroup response = api.addAccessGroupScopes(accessGroupId, accessGroupScopesRequest);
        // TODO: test validations
    }

    /**
     * Add always allowed permissions for given object type.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addAlwaysAllowedPermissionsTest() throws ApiException {
        String accessGroupId = null;
        String scopeId = null;
        AlwaysAllowedPermissionRequest alwaysAllowedPermissionRequest = null;
        AccessGroupScope response = api.addAlwaysAllowedPermissions(accessGroupId, scopeId, alwaysAllowedPermissionRequest);
        // TODO: test validations
    }

    /**
     * Add objects to the access group scope.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addObjectsToAccessGroupScopeTest() throws ApiException {
        String accessGroupId = null;
        String scopeId = null;
        ScopedObjectsRequest scopedObjectsRequest = null;
        ScopedObjectItemsResponse response = api.addObjectsToAccessGroupScope(accessGroupId, scopeId, scopedObjectsRequest);
        // TODO: test validations
    }

    /**
     * Add permissions to a role.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addRolePermissionsTest() throws ApiException {
        String roleId = null;
        PermissionsRequest permissionsRequest = null;
        Role response = api.addRolePermissions(roleId, permissionsRequest);
        // TODO: test validations
    }

    /**
     * Add object tags to the access group scope.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addTagsToScopeTest() throws ApiException {
        String accessGroupId = null;
        String scopeId = null;
        ScopeTagsRequest scopeTagsRequest = null;
        ScopeTagsResponse response = api.addTagsToScope(accessGroupId, scopeId, scopeTagsRequest);
        // TODO: test validations
    }

    /**
     * Create a new access group.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createAccessGroupTest() throws ApiException {
        AccessGroup accessGroup = null;
        AccessGroup response = api.createAccessGroup(accessGroup);
        // TODO: test validations
    }

    /**
     * Create custom role
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createRoleTest() throws ApiException {
        CreateRole createRole = null;
        Role response = api.createRole(createRole);
        // TODO: test validations
    }

    /**
     * Create tags for a role.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createRoleTagsTest() throws ApiException {
        String roleId = null;
        TagsRequest tagsRequest = null;
        TagsResponse response = api.createRoleTags(roleId, tagsRequest);
        // TODO: test validations
    }

    /**
     * Delete an Access group.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteAccessGroupTest() throws ApiException {
        String accessGroupId = null;
        api.deleteAccessGroup(accessGroupId);
        // TODO: test validations
    }

    /**
     * Remove tags from the access group scope.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteAccessGroupScopeObjectTagsTest() throws ApiException {
        String accessGroupId = null;
        String scopeId = null;
        DeleteScopeObjectTags deleteScopeObjectTags = null;
        ScopeTagsResponse response = api.deleteAccessGroupScopeObjectTags(accessGroupId, scopeId, deleteScopeObjectTags);
        // TODO: test validations
    }

    /**
     * Remove objects from the access group scope.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteAccessGroupScopeObjectsTest() throws ApiException {
        String accessGroupId = null;
        String scopeId = null;
        DeleteScopedObjectItem deleteScopedObjectItem = null;
        ScopedObjectItemsResponse response = api.deleteAccessGroupScopeObjects(accessGroupId, scopeId, deleteScopedObjectItem);
        // TODO: test validations
    }

    /**
     * Delete role by ID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteRoleTest() throws ApiException {
        String roleId = null;
        api.deleteRole(roleId);
        // TODO: test validations
    }

    /**
     * Delete tags for a Role.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteRoleTagTest() throws ApiException {
        String roleId = null;
        DeleteTag deleteTag = null;
        api.deleteRoleTag(roleId, deleteTag);
        // TODO: test validations
    }

    /**
     * Returns an Access group by ID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAccessGroupByIdTest() throws ApiException {
        String accessGroupId = null;
        AccessGroup response = api.getAccessGroupById(accessGroupId);
        // TODO: test validations
    }

    /**
     * Get access group scope.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAccessGroupScopeTest() throws ApiException {
        String accessGroupId = null;
        String scopeId = null;
        AccessGroupScope response = api.getAccessGroupScope(accessGroupId, scopeId);
        // TODO: test validations
    }

    /**
     * List all access groups.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAccessGroupsTest() throws ApiException {
        Integer limit = null;
        String cursor = null;
        String sort = null;
        ListAccessGroupsResponse response = api.getAccessGroups(limit, cursor, sort);
        // TODO: test validations
    }

    /**
     * Returns all of the possible permissions for all of the objects.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllObjectPermissionsTest() throws ApiException {
        AllObjectPermissionsResponse response = api.getAllObjectPermissions();
        // TODO: test validations
    }

    /**
     * Returns permissions for given object.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getObjectPermissionsTest() throws ApiException {
        String objectType = null;
        String objectId = null;
        ObjectPermissionsResponse response = api.getObjectPermissions(objectType, objectId);
        // TODO: test validations
    }

    /**
     * Returns role by ID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getRoleByIdTest() throws ApiException {
        String roleId = null;
        Role response = api.getRoleById(roleId);
        // TODO: test validations
    }

    /**
     * Get tags for a Role.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getRoleTagsTest() throws ApiException {
        String roleId = null;
        TagsResponse response = api.getRoleTags(roleId);
        // TODO: test validations
    }

    /**
     * List all roles
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getRolesTest() throws ApiException {
        ListRolesResponse response = api.getRoles();
        // TODO: test validations
    }

    /**
     * Remove the account from the access group.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeAccessGroupAccountIdTest() throws ApiException {
        String accessGroupId = null;
        Long accountId = null;
        AccessGroup response = api.removeAccessGroupAccountId(accessGroupId, accountId);
        // TODO: test validations
    }

    /**
     * Remove account tags from an access group.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeAccessGroupAccountTagsTest() throws ApiException {
        String accessGroupId = null;
        DeleteTag deleteTag = null;
        AccessGroup response = api.removeAccessGroupAccountTags(accessGroupId, deleteTag);
        // TODO: test validations
    }

    /**
     * Remove the scope from the Access group.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeAccessGroupScopeTest() throws ApiException {
        String accessGroupId = null;
        String scopeId = null;
        AccessGroup response = api.removeAccessGroupScope(accessGroupId, scopeId);
        // TODO: test validations
    }

    /**
     * Remove always allowed permissions for given object type.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeAlwaysAllowedPermissionsTest() throws ApiException {
        String accessGroupId = null;
        String scopeId = null;
        AlwaysAllowedPermissionRequest alwaysAllowedPermissionRequest = null;
        AccessGroupScope response = api.removeAlwaysAllowedPermissions(accessGroupId, scopeId, alwaysAllowedPermissionRequest);
        // TODO: test validations
    }

    /**
     * Remove permissions from a role.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeRolePermissionsTest() throws ApiException {
        String roleId = null;
        PermissionsRequest permissionsRequest = null;
        Role response = api.removeRolePermissions(roleId, permissionsRequest);
        // TODO: test validations
    }

    /**
     * Search for access groups.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchAccessGroupsTest() throws ApiException {
        Integer limit = null;
        String cursor = null;
        String sort = null;
        SearchBody searchBody = null;
        SearchAccessGroupsResponse response = api.searchAccessGroups(limit, cursor, sort, searchBody);
        // TODO: test validations
    }

    /**
     * Search for roles.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchRolesTest() throws ApiException {
        Integer limit = null;
        String cursor = null;
        String sort = null;
        SearchBody searchBody = null;
        SearchRolesResponse response = api.searchRoles(limit, cursor, sort, searchBody);
        // TODO: test validations
    }

    /**
     * Update an Access group.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateAccessGroupTest() throws ApiException {
        String accessGroupId = null;
        AccessGroupUpdateParameters accessGroupUpdateParameters = null;
        AccessGroup response = api.updateAccessGroup(accessGroupId, accessGroupUpdateParameters);
        // TODO: test validations
    }

    /**
     * Update access group scope.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateAccessGroupScopeTest() throws ApiException {
        String accessGroupId = null;
        String scopeId = null;
        UpdateAccessGroupScope updateAccessGroupScope = null;
        AccessGroupScope response = api.updateAccessGroupScope(accessGroupId, scopeId, updateAccessGroupScope);
        // TODO: test validations
    }

    /**
     * Update a Role.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateRoleTest() throws ApiException {
        String roleId = null;
        RoleUpdateParameters roleUpdateParameters = null;
        Role response = api.updateRole(roleId, roleUpdateParameters);
        // TODO: test validations
    }

}