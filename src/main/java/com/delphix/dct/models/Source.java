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
import com.delphix.dct.models.Tag;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * The Delphix representation of the source database (not typically managed by Delphix).
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-04T14:49:34.152994+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class Source {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_DATABASE_TYPE = "database_type";
  @SerializedName(SERIALIZED_NAME_DATABASE_TYPE)
  private String databaseType;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAMESPACE_ID = "namespace_id";
  @SerializedName(SERIALIZED_NAME_NAMESPACE_ID)
  private String namespaceId;

  public static final String SERIALIZED_NAME_NAMESPACE_NAME = "namespace_name";
  @SerializedName(SERIALIZED_NAME_NAMESPACE_NAME)
  private String namespaceName;

  public static final String SERIALIZED_NAME_IS_REPLICA = "is_replica";
  @SerializedName(SERIALIZED_NAME_IS_REPLICA)
  private Boolean isReplica;

  public static final String SERIALIZED_NAME_DATABASE_VERSION = "database_version";
  @SerializedName(SERIALIZED_NAME_DATABASE_VERSION)
  private String databaseVersion;

  public static final String SERIALIZED_NAME_ENVIRONMENT_ID = "environment_id";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT_ID)
  private String environmentId;

  public static final String SERIALIZED_NAME_DATA_UUID = "data_uuid";
  @SerializedName(SERIALIZED_NAME_DATA_UUID)
  private String dataUuid;

  public static final String SERIALIZED_NAME_IP_ADDRESS = "ip_address";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESS)
  private String ipAddress;

  public static final String SERIALIZED_NAME_FQDN = "fqdn";
  @SerializedName(SERIALIZED_NAME_FQDN)
  private String fqdn;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Long size;

  public static final String SERIALIZED_NAME_JDBC_CONNECTION_STRING = "jdbc_connection_string";
  @SerializedName(SERIALIZED_NAME_JDBC_CONNECTION_STRING)
  private String jdbcConnectionString;

  public static final String SERIALIZED_NAME_PLUGIN_VERSION = "plugin_version";
  @SerializedName(SERIALIZED_NAME_PLUGIN_VERSION)
  private String pluginVersion;

  public static final String SERIALIZED_NAME_TOOLKIT_ID = "toolkit_id";
  @SerializedName(SERIALIZED_NAME_TOOLKIT_ID)
  private String toolkitId;

  public static final String SERIALIZED_NAME_IS_DSOURCE = "is_dsource";
  @SerializedName(SERIALIZED_NAME_IS_DSOURCE)
  private Boolean isDsource;

  public static final String SERIALIZED_NAME_REPOSITORY = "repository";
  @SerializedName(SERIALIZED_NAME_REPOSITORY)
  private String repository;

  public static final String SERIALIZED_NAME_RECOVERY_MODEL = "recovery_model";
  @SerializedName(SERIALIZED_NAME_RECOVERY_MODEL)
  private String recoveryModel;

  public static final String SERIALIZED_NAME_MSSQL_SOURCE_TYPE = "mssql_source_type";
  @SerializedName(SERIALIZED_NAME_MSSQL_SOURCE_TYPE)
  private String mssqlSourceType;

  public static final String SERIALIZED_NAME_APPDATA_SOURCE_TYPE = "appdata_source_type";
  @SerializedName(SERIALIZED_NAME_APPDATA_SOURCE_TYPE)
  private String appdataSourceType;

  public static final String SERIALIZED_NAME_IS_PDB = "is_pdb";
  @SerializedName(SERIALIZED_NAME_IS_PDB)
  private Boolean isPdb;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<Tag> tags;

  public Source() {
  }

  public Source id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The Source object entity ID.
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public Source databaseType(String databaseType) {
    this.databaseType = databaseType;
    return this;
  }

   /**
   * The type of this source database.
   * @return databaseType
  **/
  @javax.annotation.Nullable
  public String getDatabaseType() {
    return databaseType;
  }

  public void setDatabaseType(String databaseType) {
    this.databaseType = databaseType;
  }


  public Source name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of this source database.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public Source namespaceId(String namespaceId) {
    this.namespaceId = namespaceId;
    return this;
  }

   /**
   * The namespace id of this source database.
   * @return namespaceId
  **/
  @javax.annotation.Nullable
  public String getNamespaceId() {
    return namespaceId;
  }

  public void setNamespaceId(String namespaceId) {
    this.namespaceId = namespaceId;
  }


  public Source namespaceName(String namespaceName) {
    this.namespaceName = namespaceName;
    return this;
  }

   /**
   * The namespace name of this source database.
   * @return namespaceName
  **/
  @javax.annotation.Nullable
  public String getNamespaceName() {
    return namespaceName;
  }

  public void setNamespaceName(String namespaceName) {
    this.namespaceName = namespaceName;
  }


  public Source isReplica(Boolean isReplica) {
    this.isReplica = isReplica;
    return this;
  }

   /**
   * Is this a replicated object.
   * @return isReplica
  **/
  @javax.annotation.Nullable
  public Boolean getIsReplica() {
    return isReplica;
  }

  public void setIsReplica(Boolean isReplica) {
    this.isReplica = isReplica;
  }


  public Source databaseVersion(String databaseVersion) {
    this.databaseVersion = databaseVersion;
    return this;
  }

   /**
   * The version of this source database.
   * @return databaseVersion
  **/
  @javax.annotation.Nullable
  public String getDatabaseVersion() {
    return databaseVersion;
  }

  public void setDatabaseVersion(String databaseVersion) {
    this.databaseVersion = databaseVersion;
  }


  public Source environmentId(String environmentId) {
    this.environmentId = environmentId;
    return this;
  }

   /**
   * A reference to the Environment that hosts this source database.
   * @return environmentId
  **/
  @javax.annotation.Nullable
  public String getEnvironmentId() {
    return environmentId;
  }

  public void setEnvironmentId(String environmentId) {
    this.environmentId = environmentId;
  }


  public Source dataUuid(String dataUuid) {
    this.dataUuid = dataUuid;
    return this;
  }

   /**
   * A universal ID that uniquely identifies this source database.
   * @return dataUuid
  **/
  @javax.annotation.Nullable
  public String getDataUuid() {
    return dataUuid;
  }

  public void setDataUuid(String dataUuid) {
    this.dataUuid = dataUuid;
  }


  public Source ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * The IP address of the source&#39;s host.
   * @return ipAddress
  **/
  @javax.annotation.Nullable
  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }


  public Source fqdn(String fqdn) {
    this.fqdn = fqdn;
    return this;
  }

   /**
   * The FQDN of the source&#39;s host.
   * @return fqdn
  **/
  @javax.annotation.Nullable
  public String getFqdn() {
    return fqdn;
  }

  public void setFqdn(String fqdn) {
    this.fqdn = fqdn;
  }


  public Source size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * The total size of this source database, in bytes.
   * @return size
  **/
  @javax.annotation.Nullable
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }


  public Source jdbcConnectionString(String jdbcConnectionString) {
    this.jdbcConnectionString = jdbcConnectionString;
    return this;
  }

   /**
   * The JDBC connection URL for this source database.
   * @return jdbcConnectionString
  **/
  @javax.annotation.Nullable
  public String getJdbcConnectionString() {
    return jdbcConnectionString;
  }

  public void setJdbcConnectionString(String jdbcConnectionString) {
    this.jdbcConnectionString = jdbcConnectionString;
  }


  public Source pluginVersion(String pluginVersion) {
    this.pluginVersion = pluginVersion;
    return this;
  }

   /**
   * The version of the plugin associated with this source database.
   * @return pluginVersion
  **/
  @javax.annotation.Nullable
  public String getPluginVersion() {
    return pluginVersion;
  }

  public void setPluginVersion(String pluginVersion) {
    this.pluginVersion = pluginVersion;
  }


  public Source toolkitId(String toolkitId) {
    this.toolkitId = toolkitId;
    return this;
  }

   /**
   * The ID of the toolkit associated with this source database(AppData only).
   * @return toolkitId
  **/
  @javax.annotation.Nullable
  public String getToolkitId() {
    return toolkitId;
  }

  public void setToolkitId(String toolkitId) {
    this.toolkitId = toolkitId;
  }


  public Source isDsource(Boolean isDsource) {
    this.isDsource = isDsource;
    return this;
  }

   /**
   * Get isDsource
   * @return isDsource
  **/
  @javax.annotation.Nullable
  public Boolean getIsDsource() {
    return isDsource;
  }

  public void setIsDsource(Boolean isDsource) {
    this.isDsource = isDsource;
  }


  public Source repository(String repository) {
    this.repository = repository;
    return this;
  }

   /**
   * The repository id for this source
   * @return repository
  **/
  @javax.annotation.Nullable
  public String getRepository() {
    return repository;
  }

  public void setRepository(String repository) {
    this.repository = repository;
  }


  public Source recoveryModel(String recoveryModel) {
    this.recoveryModel = recoveryModel;
    return this;
  }

   /**
   * Recovery model of the source database (MSSql Only).
   * @return recoveryModel
  **/
  @javax.annotation.Nullable
  public String getRecoveryModel() {
    return recoveryModel;
  }

  public void setRecoveryModel(String recoveryModel) {
    this.recoveryModel = recoveryModel;
  }


  public Source mssqlSourceType(String mssqlSourceType) {
    this.mssqlSourceType = mssqlSourceType;
    return this;
  }

   /**
   * The type of this mssql source database (MSSql Only).
   * @return mssqlSourceType
  **/
  @javax.annotation.Nullable
  public String getMssqlSourceType() {
    return mssqlSourceType;
  }

  public void setMssqlSourceType(String mssqlSourceType) {
    this.mssqlSourceType = mssqlSourceType;
  }


  public Source appdataSourceType(String appdataSourceType) {
    this.appdataSourceType = appdataSourceType;
    return this;
  }

   /**
   * The type of this appdata source database (Appdata Only).
   * @return appdataSourceType
  **/
  @javax.annotation.Nullable
  public String getAppdataSourceType() {
    return appdataSourceType;
  }

  public void setAppdataSourceType(String appdataSourceType) {
    this.appdataSourceType = appdataSourceType;
  }


  public Source isPdb(Boolean isPdb) {
    this.isPdb = isPdb;
    return this;
  }

   /**
   * If this source is of PDB type (Oracle Only).
   * @return isPdb
  **/
  @javax.annotation.Nullable
  public Boolean getIsPdb() {
    return isPdb;
  }

  public void setIsPdb(Boolean isPdb) {
    this.isPdb = isPdb;
  }


  public Source tags(List<Tag> tags) {
    this.tags = tags;
    return this;
  }

  public Source addTagsItem(Tag tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nullable
  public List<Tag> getTags() {
    return tags;
  }

  public void setTags(List<Tag> tags) {
    this.tags = tags;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Source source = (Source) o;
    return Objects.equals(this.id, source.id) &&
        Objects.equals(this.databaseType, source.databaseType) &&
        Objects.equals(this.name, source.name) &&
        Objects.equals(this.namespaceId, source.namespaceId) &&
        Objects.equals(this.namespaceName, source.namespaceName) &&
        Objects.equals(this.isReplica, source.isReplica) &&
        Objects.equals(this.databaseVersion, source.databaseVersion) &&
        Objects.equals(this.environmentId, source.environmentId) &&
        Objects.equals(this.dataUuid, source.dataUuid) &&
        Objects.equals(this.ipAddress, source.ipAddress) &&
        Objects.equals(this.fqdn, source.fqdn) &&
        Objects.equals(this.size, source.size) &&
        Objects.equals(this.jdbcConnectionString, source.jdbcConnectionString) &&
        Objects.equals(this.pluginVersion, source.pluginVersion) &&
        Objects.equals(this.toolkitId, source.toolkitId) &&
        Objects.equals(this.isDsource, source.isDsource) &&
        Objects.equals(this.repository, source.repository) &&
        Objects.equals(this.recoveryModel, source.recoveryModel) &&
        Objects.equals(this.mssqlSourceType, source.mssqlSourceType) &&
        Objects.equals(this.appdataSourceType, source.appdataSourceType) &&
        Objects.equals(this.isPdb, source.isPdb) &&
        Objects.equals(this.tags, source.tags);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, databaseType, name, namespaceId, namespaceName, isReplica, databaseVersion, environmentId, dataUuid, ipAddress, fqdn, size, jdbcConnectionString, pluginVersion, toolkitId, isDsource, repository, recoveryModel, mssqlSourceType, appdataSourceType, isPdb, tags);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Source {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    databaseType: ").append(toIndentedString(databaseType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespaceId: ").append(toIndentedString(namespaceId)).append("\n");
    sb.append("    namespaceName: ").append(toIndentedString(namespaceName)).append("\n");
    sb.append("    isReplica: ").append(toIndentedString(isReplica)).append("\n");
    sb.append("    databaseVersion: ").append(toIndentedString(databaseVersion)).append("\n");
    sb.append("    environmentId: ").append(toIndentedString(environmentId)).append("\n");
    sb.append("    dataUuid: ").append(toIndentedString(dataUuid)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    fqdn: ").append(toIndentedString(fqdn)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    jdbcConnectionString: ").append(toIndentedString(jdbcConnectionString)).append("\n");
    sb.append("    pluginVersion: ").append(toIndentedString(pluginVersion)).append("\n");
    sb.append("    toolkitId: ").append(toIndentedString(toolkitId)).append("\n");
    sb.append("    isDsource: ").append(toIndentedString(isDsource)).append("\n");
    sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
    sb.append("    recoveryModel: ").append(toIndentedString(recoveryModel)).append("\n");
    sb.append("    mssqlSourceType: ").append(toIndentedString(mssqlSourceType)).append("\n");
    sb.append("    appdataSourceType: ").append(toIndentedString(appdataSourceType)).append("\n");
    sb.append("    isPdb: ").append(toIndentedString(isPdb)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
    openapiFields.add("database_type");
    openapiFields.add("name");
    openapiFields.add("namespace_id");
    openapiFields.add("namespace_name");
    openapiFields.add("is_replica");
    openapiFields.add("database_version");
    openapiFields.add("environment_id");
    openapiFields.add("data_uuid");
    openapiFields.add("ip_address");
    openapiFields.add("fqdn");
    openapiFields.add("size");
    openapiFields.add("jdbc_connection_string");
    openapiFields.add("plugin_version");
    openapiFields.add("toolkit_id");
    openapiFields.add("is_dsource");
    openapiFields.add("repository");
    openapiFields.add("recovery_model");
    openapiFields.add("mssql_source_type");
    openapiFields.add("appdata_source_type");
    openapiFields.add("is_pdb");
    openapiFields.add("tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Source
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Source.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Source is not found in the empty JSON string", Source.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Source.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Source` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("database_type") != null && !jsonObj.get("database_type").isJsonNull()) && !jsonObj.get("database_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `database_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("database_type").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("namespace_id") != null && !jsonObj.get("namespace_id").isJsonNull()) && !jsonObj.get("namespace_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `namespace_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("namespace_id").toString()));
      }
      if ((jsonObj.get("namespace_name") != null && !jsonObj.get("namespace_name").isJsonNull()) && !jsonObj.get("namespace_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `namespace_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("namespace_name").toString()));
      }
      if ((jsonObj.get("database_version") != null && !jsonObj.get("database_version").isJsonNull()) && !jsonObj.get("database_version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `database_version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("database_version").toString()));
      }
      if ((jsonObj.get("environment_id") != null && !jsonObj.get("environment_id").isJsonNull()) && !jsonObj.get("environment_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `environment_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("environment_id").toString()));
      }
      if ((jsonObj.get("data_uuid") != null && !jsonObj.get("data_uuid").isJsonNull()) && !jsonObj.get("data_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `data_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("data_uuid").toString()));
      }
      if ((jsonObj.get("ip_address") != null && !jsonObj.get("ip_address").isJsonNull()) && !jsonObj.get("ip_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ip_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ip_address").toString()));
      }
      if ((jsonObj.get("fqdn") != null && !jsonObj.get("fqdn").isJsonNull()) && !jsonObj.get("fqdn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fqdn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fqdn").toString()));
      }
      if ((jsonObj.get("jdbc_connection_string") != null && !jsonObj.get("jdbc_connection_string").isJsonNull()) && !jsonObj.get("jdbc_connection_string").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `jdbc_connection_string` to be a primitive type in the JSON string but got `%s`", jsonObj.get("jdbc_connection_string").toString()));
      }
      if ((jsonObj.get("plugin_version") != null && !jsonObj.get("plugin_version").isJsonNull()) && !jsonObj.get("plugin_version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plugin_version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plugin_version").toString()));
      }
      if ((jsonObj.get("toolkit_id") != null && !jsonObj.get("toolkit_id").isJsonNull()) && !jsonObj.get("toolkit_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `toolkit_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("toolkit_id").toString()));
      }
      if ((jsonObj.get("repository") != null && !jsonObj.get("repository").isJsonNull()) && !jsonObj.get("repository").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `repository` to be a primitive type in the JSON string but got `%s`", jsonObj.get("repository").toString()));
      }
      if ((jsonObj.get("recovery_model") != null && !jsonObj.get("recovery_model").isJsonNull()) && !jsonObj.get("recovery_model").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recovery_model` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recovery_model").toString()));
      }
      if ((jsonObj.get("mssql_source_type") != null && !jsonObj.get("mssql_source_type").isJsonNull()) && !jsonObj.get("mssql_source_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mssql_source_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mssql_source_type").toString()));
      }
      if ((jsonObj.get("appdata_source_type") != null && !jsonObj.get("appdata_source_type").isJsonNull()) && !jsonObj.get("appdata_source_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `appdata_source_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("appdata_source_type").toString()));
      }
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull()) {
        JsonArray jsonArraytags = jsonObj.getAsJsonArray("tags");
        if (jsonArraytags != null) {
          // ensure the json data is an array
          if (!jsonObj.get("tags").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
          }

          // validate the optional field `tags` (array)
          for (int i = 0; i < jsonArraytags.size(); i++) {
            Tag.validateJsonElement(jsonArraytags.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Source.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Source' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Source> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Source.class));

       return (TypeAdapter<T>) new TypeAdapter<Source>() {
           @Override
           public void write(JsonWriter out, Source value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Source read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Source given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Source
  * @throws IOException if the JSON string is invalid with respect to Source
  */
  public static Source fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Source.class);
  }

 /**
  * Convert an instance of Source to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

