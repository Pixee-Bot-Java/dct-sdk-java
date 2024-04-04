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


package com.delphix.dct.models;

import java.util.Objects;
import com.delphix.dct.models.AlwaysAllowedPermission;
import com.delphix.dct.models.ScopeTag;
import com.delphix.dct.models.ScopedObjectItem;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.delphix.dct.JSON;

/**
 * An Access group scope allows a role to be granted to accounts in the Access group.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-04T14:49:34.152994+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class AccessGroupScope {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ROLE_ID = "role_id";
  @SerializedName(SERIALIZED_NAME_ROLE_ID)
  private String roleId;

  /**
   * Specifies the type of the scope. Scope of type SIMPLE would grant access to all DCT objects. Scope of type SCOPED would grant access to all objects based on objects and object-tags and permissions defined in linked role. Scope of type ADVANCED would grant access to DCT objects based on objects and object-tags and the individual permissions.
   */
  @JsonAdapter(ScopeTypeEnum.Adapter.class)
  public enum ScopeTypeEnum {
    SIMPLE("SIMPLE"),
    
    SCOPED("SCOPED"),
    
    ADVANCED("ADVANCED");

    private String value;

    ScopeTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ScopeTypeEnum fromValue(String value) {
      for (ScopeTypeEnum b : ScopeTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ScopeTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ScopeTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ScopeTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ScopeTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ScopeTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_SCOPE_TYPE = "scope_type";
  @SerializedName(SERIALIZED_NAME_SCOPE_TYPE)
  private ScopeTypeEnum scopeType;

  public static final String SERIALIZED_NAME_OBJECT_TAGS = "object_tags";
  @SerializedName(SERIALIZED_NAME_OBJECT_TAGS)
  private List<ScopeTag> objectTags;

  public static final String SERIALIZED_NAME_OBJECTS = "objects";
  @SerializedName(SERIALIZED_NAME_OBJECTS)
  private List<ScopedObjectItem> objects;

  public static final String SERIALIZED_NAME_ALWAYS_ALLOWED_PERMISSIONS = "always_allowed_permissions";
  @SerializedName(SERIALIZED_NAME_ALWAYS_ALLOWED_PERMISSIONS)
  private List<AlwaysAllowedPermission> alwaysAllowedPermissions;

  public AccessGroupScope() {
  }

  public AccessGroupScope(
     String id
  ) {
    this();
    this.id = id;
  }

   /**
   * The Access group scope ID.
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }



  public AccessGroupScope name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The Access group scope name.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public AccessGroupScope roleId(String roleId) {
    this.roleId = roleId;
    return this;
  }

   /**
   * The Access group role id.
   * @return roleId
  **/
  @javax.annotation.Nonnull
  public String getRoleId() {
    return roleId;
  }

  public void setRoleId(String roleId) {
    this.roleId = roleId;
  }


  public AccessGroupScope scopeType(ScopeTypeEnum scopeType) {
    this.scopeType = scopeType;
    return this;
  }

   /**
   * Specifies the type of the scope. Scope of type SIMPLE would grant access to all DCT objects. Scope of type SCOPED would grant access to all objects based on objects and object-tags and permissions defined in linked role. Scope of type ADVANCED would grant access to DCT objects based on objects and object-tags and the individual permissions.
   * @return scopeType
  **/
  @javax.annotation.Nullable
  public ScopeTypeEnum getScopeType() {
    return scopeType;
  }

  public void setScopeType(ScopeTypeEnum scopeType) {
    this.scopeType = scopeType;
  }


  public AccessGroupScope objectTags(List<ScopeTag> objectTags) {
    this.objectTags = objectTags;
    return this;
  }

  public AccessGroupScope addObjectTagsItem(ScopeTag objectTagsItem) {
    if (this.objectTags == null) {
      this.objectTags = new ArrayList<>();
    }
    this.objectTags.add(objectTagsItem);
    return this;
  }

   /**
   * The permissions in this access group scope will be granted to all DCT objects tagged with tags matching this property. This is cumulative with objects defined in the &#39;objects&#39; property, and mutually exclusive with scope_type &#39;SIMPLE&#39;.
   * @return objectTags
  **/
  @javax.annotation.Nullable
  public List<ScopeTag> getObjectTags() {
    return objectTags;
  }

  public void setObjectTags(List<ScopeTag> objectTags) {
    this.objectTags = objectTags;
  }


  public AccessGroupScope objects(List<ScopedObjectItem> objects) {
    this.objects = objects;
    return this;
  }

  public AccessGroupScope addObjectsItem(ScopedObjectItem objectsItem) {
    if (this.objects == null) {
      this.objects = new ArrayList<>();
    }
    this.objects.add(objectsItem);
    return this;
  }

   /**
   * The permissions in this access group scope will be granted to all DCT objects with matching object id and object type, mutually exclusive with  scope_type &#39;SIMPLE&#39;.
   * @return objects
  **/
  @javax.annotation.Nullable
  public List<ScopedObjectItem> getObjects() {
    return objects;
  }

  public void setObjects(List<ScopedObjectItem> objects) {
    this.objects = objects;
  }


  public AccessGroupScope alwaysAllowedPermissions(List<AlwaysAllowedPermission> alwaysAllowedPermissions) {
    this.alwaysAllowedPermissions = alwaysAllowedPermissions;
    return this;
  }

  public AccessGroupScope addAlwaysAllowedPermissionsItem(AlwaysAllowedPermission alwaysAllowedPermissionsItem) {
    if (this.alwaysAllowedPermissions == null) {
      this.alwaysAllowedPermissions = new ArrayList<>();
    }
    this.alwaysAllowedPermissions.add(alwaysAllowedPermissionsItem);
    return this;
  }

   /**
   * An array of always allowed permissions which can be used to specify object type and permission. An object with same object type and permission can not be added in &#39;objects&#39; array.
   * @return alwaysAllowedPermissions
  **/
  @javax.annotation.Nullable
  public List<AlwaysAllowedPermission> getAlwaysAllowedPermissions() {
    return alwaysAllowedPermissions;
  }

  public void setAlwaysAllowedPermissions(List<AlwaysAllowedPermission> alwaysAllowedPermissions) {
    this.alwaysAllowedPermissions = alwaysAllowedPermissions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessGroupScope accessGroupScope = (AccessGroupScope) o;
    return Objects.equals(this.id, accessGroupScope.id) &&
        Objects.equals(this.name, accessGroupScope.name) &&
        Objects.equals(this.roleId, accessGroupScope.roleId) &&
        Objects.equals(this.scopeType, accessGroupScope.scopeType) &&
        Objects.equals(this.objectTags, accessGroupScope.objectTags) &&
        Objects.equals(this.objects, accessGroupScope.objects) &&
        Objects.equals(this.alwaysAllowedPermissions, accessGroupScope.alwaysAllowedPermissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, roleId, scopeType, objectTags, objects, alwaysAllowedPermissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessGroupScope {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
    sb.append("    scopeType: ").append(toIndentedString(scopeType)).append("\n");
    sb.append("    objectTags: ").append(toIndentedString(objectTags)).append("\n");
    sb.append("    objects: ").append(toIndentedString(objects)).append("\n");
    sb.append("    alwaysAllowedPermissions: ").append(toIndentedString(alwaysAllowedPermissions)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("role_id");
    openapiFields.add("scope_type");
    openapiFields.add("object_tags");
    openapiFields.add("objects");
    openapiFields.add("always_allowed_permissions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("role_id");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AccessGroupScope
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AccessGroupScope.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccessGroupScope is not found in the empty JSON string", AccessGroupScope.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AccessGroupScope.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AccessGroupScope` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AccessGroupScope.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("role_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `role_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("role_id").toString()));
      }
      if ((jsonObj.get("scope_type") != null && !jsonObj.get("scope_type").isJsonNull()) && !jsonObj.get("scope_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scope_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scope_type").toString()));
      }
      // validate the optional field `scope_type`
      if (jsonObj.get("scope_type") != null && !jsonObj.get("scope_type").isJsonNull()) {
        ScopeTypeEnum.validateJsonElement(jsonObj.get("scope_type"));
      }
      if (jsonObj.get("object_tags") != null && !jsonObj.get("object_tags").isJsonNull()) {
        JsonArray jsonArrayobjectTags = jsonObj.getAsJsonArray("object_tags");
        if (jsonArrayobjectTags != null) {
          // ensure the json data is an array
          if (!jsonObj.get("object_tags").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `object_tags` to be an array in the JSON string but got `%s`", jsonObj.get("object_tags").toString()));
          }

          // validate the optional field `object_tags` (array)
          for (int i = 0; i < jsonArrayobjectTags.size(); i++) {
            ScopeTag.validateJsonElement(jsonArrayobjectTags.get(i));
          };
        }
      }
      if (jsonObj.get("objects") != null && !jsonObj.get("objects").isJsonNull()) {
        JsonArray jsonArrayobjects = jsonObj.getAsJsonArray("objects");
        if (jsonArrayobjects != null) {
          // ensure the json data is an array
          if (!jsonObj.get("objects").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `objects` to be an array in the JSON string but got `%s`", jsonObj.get("objects").toString()));
          }

          // validate the optional field `objects` (array)
          for (int i = 0; i < jsonArrayobjects.size(); i++) {
            ScopedObjectItem.validateJsonElement(jsonArrayobjects.get(i));
          };
        }
      }
      if (jsonObj.get("always_allowed_permissions") != null && !jsonObj.get("always_allowed_permissions").isJsonNull()) {
        JsonArray jsonArrayalwaysAllowedPermissions = jsonObj.getAsJsonArray("always_allowed_permissions");
        if (jsonArrayalwaysAllowedPermissions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("always_allowed_permissions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `always_allowed_permissions` to be an array in the JSON string but got `%s`", jsonObj.get("always_allowed_permissions").toString()));
          }

          // validate the optional field `always_allowed_permissions` (array)
          for (int i = 0; i < jsonArrayalwaysAllowedPermissions.size(); i++) {
            AlwaysAllowedPermission.validateJsonElement(jsonArrayalwaysAllowedPermissions.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccessGroupScope.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccessGroupScope' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccessGroupScope> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccessGroupScope.class));

       return (TypeAdapter<T>) new TypeAdapter<AccessGroupScope>() {
           @Override
           public void write(JsonWriter out, AccessGroupScope value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AccessGroupScope read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AccessGroupScope given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AccessGroupScope
  * @throws IOException if the JSON string is invalid with respect to AccessGroupScope
  */
  public static AccessGroupScope fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccessGroupScope.class);
  }

 /**
  * Convert an instance of AccessGroupScope to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
