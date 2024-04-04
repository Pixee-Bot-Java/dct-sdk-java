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
 * A repository corresponding to the environment.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-04T14:49:34.152994+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class EnvironmentRepository {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DATABASE_TYPE = "database_type";
  @SerializedName(SERIALIZED_NAME_DATABASE_TYPE)
  private String databaseType;

  public static final String SERIALIZED_NAME_ALLOW_PROVISIONING = "allow_provisioning";
  @SerializedName(SERIALIZED_NAME_ALLOW_PROVISIONING)
  private Boolean allowProvisioning;

  public static final String SERIALIZED_NAME_IS_STAGING = "is_staging";
  @SerializedName(SERIALIZED_NAME_IS_STAGING)
  private Boolean isStaging;

  public static final String SERIALIZED_NAME_ORACLE_BASE = "oracle_base";
  @SerializedName(SERIALIZED_NAME_ORACLE_BASE)
  private String oracleBase;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_BITS = "bits";
  @SerializedName(SERIALIZED_NAME_BITS)
  private Integer bits;

  public static final String SERIALIZED_NAME_INSTALL_GROUP = "install_group";
  @SerializedName(SERIALIZED_NAME_INSTALL_GROUP)
  private String installGroup;

  public static final String SERIALIZED_NAME_INSTALL_USER = "install_user";
  @SerializedName(SERIALIZED_NAME_INSTALL_USER)
  private String installUser;

  public static final String SERIALIZED_NAME_RAC = "rac";
  @SerializedName(SERIALIZED_NAME_RAC)
  private Boolean rac;

  public static final String SERIALIZED_NAME_PORTS = "ports";
  @SerializedName(SERIALIZED_NAME_PORTS)
  private List<Long> ports;

  public static final String SERIALIZED_NAME_DUMP_HISTORY_FILE = "dump_history_file";
  @SerializedName(SERIALIZED_NAME_DUMP_HISTORY_FILE)
  private String dumpHistoryFile;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "page_size";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Long pageSize;

  public static final String SERIALIZED_NAME_OWNER = "owner";
  @SerializedName(SERIALIZED_NAME_OWNER)
  private String owner;

  public static final String SERIALIZED_NAME_INSTALLATION_PATH = "installation_path";
  @SerializedName(SERIALIZED_NAME_INSTALLATION_PATH)
  private String installationPath;

  public static final String SERIALIZED_NAME_FULLTEXT_INSTALLED = "fulltext_installed";
  @SerializedName(SERIALIZED_NAME_FULLTEXT_INSTALLED)
  private Boolean fulltextInstalled;

  public static final String SERIALIZED_NAME_INTERNAL_VERSION = "internal_version";
  @SerializedName(SERIALIZED_NAME_INTERNAL_VERSION)
  private Long internalVersion;

  public static final String SERIALIZED_NAME_MSSQL_CLUSTER_INSTANCES_NAME = "mssql_cluster_instances_name";
  @SerializedName(SERIALIZED_NAME_MSSQL_CLUSTER_INSTANCES_NAME)
  private List<String> mssqlClusterInstancesName;

  public static final String SERIALIZED_NAME_MSSQL_CLUSTER_INSTANCES_VERSION = "mssql_cluster_instances_version";
  @SerializedName(SERIALIZED_NAME_MSSQL_CLUSTER_INSTANCES_VERSION)
  private List<String> mssqlClusterInstancesVersion;

  public static final String SERIALIZED_NAME_INSTALLATION_HOME = "installation_home";
  @SerializedName(SERIALIZED_NAME_INSTALLATION_HOME)
  private String installationHome;

  public static final String SERIALIZED_NAME_DRIVE_LETTER = "drive_letter";
  @SerializedName(SERIALIZED_NAME_DRIVE_LETTER)
  private List<String> driveLetter;

  public static final String SERIALIZED_NAME_ENVIRONMENT_ID = "environment_id";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT_ID)
  private String environmentId;

  public EnvironmentRepository() {
  }

  public EnvironmentRepository id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Entity id of the repository.
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public EnvironmentRepository name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the repository.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public EnvironmentRepository databaseType(String databaseType) {
    this.databaseType = databaseType;
    return this;
  }

   /**
   * The database type of this repository.
   * @return databaseType
  **/
  @javax.annotation.Nullable
  public String getDatabaseType() {
    return databaseType;
  }

  public void setDatabaseType(String databaseType) {
    this.databaseType = databaseType;
  }


  public EnvironmentRepository allowProvisioning(Boolean allowProvisioning) {
    this.allowProvisioning = allowProvisioning;
    return this;
  }

   /**
   * Flag indicating whether the repository should be used for provisioning.
   * @return allowProvisioning
  **/
  @javax.annotation.Nullable
  public Boolean getAllowProvisioning() {
    return allowProvisioning;
  }

  public void setAllowProvisioning(Boolean allowProvisioning) {
    this.allowProvisioning = allowProvisioning;
  }


  public EnvironmentRepository isStaging(Boolean isStaging) {
    this.isStaging = isStaging;
    return this;
  }

   /**
   * Flag indicating whether this repository can be used by the Delphix Engine for internal processing.
   * @return isStaging
  **/
  @javax.annotation.Nullable
  public Boolean getIsStaging() {
    return isStaging;
  }

  public void setIsStaging(Boolean isStaging) {
    this.isStaging = isStaging;
  }


  public EnvironmentRepository oracleBase(String oracleBase) {
    this.oracleBase = oracleBase;
    return this;
  }

   /**
   * The Oracle base where database binaries are located.
   * @return oracleBase
  **/
  @javax.annotation.Nullable
  public String getOracleBase() {
    return oracleBase;
  }

  public void setOracleBase(String oracleBase) {
    this.oracleBase = oracleBase;
  }


  public EnvironmentRepository version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Version of the repository.
   * @return version
  **/
  @javax.annotation.Nullable
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  public EnvironmentRepository bits(Integer bits) {
    this.bits = bits;
    return this;
  }

   /**
   * 32 or 64 bits.
   * @return bits
  **/
  @javax.annotation.Nullable
  public Integer getBits() {
    return bits;
  }

  public void setBits(Integer bits) {
    this.bits = bits;
  }


  public EnvironmentRepository installGroup(String installGroup) {
    this.installGroup = installGroup;
    return this;
  }

   /**
   * Group name of the user that owns the install.
   * @return installGroup
  **/
  @javax.annotation.Nullable
  public String getInstallGroup() {
    return installGroup;
  }

  public void setInstallGroup(String installGroup) {
    this.installGroup = installGroup;
  }


  public EnvironmentRepository installUser(String installUser) {
    this.installUser = installUser;
    return this;
  }

   /**
   * User name of the user that owns the install.
   * @return installUser
  **/
  @javax.annotation.Nullable
  public String getInstallUser() {
    return installUser;
  }

  public void setInstallUser(String installUser) {
    this.installUser = installUser;
  }


  public EnvironmentRepository rac(Boolean rac) {
    this.rac = rac;
    return this;
  }

   /**
   * Flag indicating whether the install supports Oracle RAC.
   * @return rac
  **/
  @javax.annotation.Nullable
  public Boolean getRac() {
    return rac;
  }

  public void setRac(Boolean rac) {
    this.rac = rac;
  }


  public EnvironmentRepository ports(List<Long> ports) {
    this.ports = ports;
    return this;
  }

  public EnvironmentRepository addPortsItem(Long portsItem) {
    if (this.ports == null) {
      this.ports = new ArrayList<>();
    }
    this.ports.add(portsItem);
    return this;
  }

   /**
   * The network ports for connecting to the database instance.
   * @return ports
  **/
  @javax.annotation.Nullable
  public List<Long> getPorts() {
    return ports;
  }

  public void setPorts(List<Long> ports) {
    this.ports = ports;
  }


  public EnvironmentRepository dumpHistoryFile(String dumpHistoryFile) {
    this.dumpHistoryFile = dumpHistoryFile;
    return this;
  }

   /**
   * Fully qualified name of the dump history file.
   * @return dumpHistoryFile
  **/
  @javax.annotation.Nullable
  public String getDumpHistoryFile() {
    return dumpHistoryFile;
  }

  public void setDumpHistoryFile(String dumpHistoryFile) {
    this.dumpHistoryFile = dumpHistoryFile;
  }


  public EnvironmentRepository pageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Database page size for the SAP ASE instance.
   * @return pageSize
  **/
  @javax.annotation.Nullable
  public Long getPageSize() {
    return pageSize;
  }

  public void setPageSize(Long pageSize) {
    this.pageSize = pageSize;
  }


  public EnvironmentRepository owner(String owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Account the database server instance is running as.
   * @return owner
  **/
  @javax.annotation.Nullable
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }


  public EnvironmentRepository installationPath(String installationPath) {
    this.installationPath = installationPath;
    return this;
  }

   /**
   * Directory path where the installation is located.
   * @return installationPath
  **/
  @javax.annotation.Nullable
  public String getInstallationPath() {
    return installationPath;
  }

  public void setInstallationPath(String installationPath) {
    this.installationPath = installationPath;
  }


  public EnvironmentRepository fulltextInstalled(Boolean fulltextInstalled) {
    this.fulltextInstalled = fulltextInstalled;
    return this;
  }

   /**
   * This property determines if the full-text search and semantic search is installed or not.
   * @return fulltextInstalled
  **/
  @javax.annotation.Nullable
  public Boolean getFulltextInstalled() {
    return fulltextInstalled;
  }

  public void setFulltextInstalled(Boolean fulltextInstalled) {
    this.fulltextInstalled = fulltextInstalled;
  }


  public EnvironmentRepository internalVersion(Long internalVersion) {
    this.internalVersion = internalVersion;
    return this;
  }

   /**
   * The internal version is tied to the data format of a database and is used to detect compatibility.
   * @return internalVersion
  **/
  @javax.annotation.Nullable
  public Long getInternalVersion() {
    return internalVersion;
  }

  public void setInternalVersion(Long internalVersion) {
    this.internalVersion = internalVersion;
  }


  public EnvironmentRepository mssqlClusterInstancesName(List<String> mssqlClusterInstancesName) {
    this.mssqlClusterInstancesName = mssqlClusterInstancesName;
    return this;
  }

  public EnvironmentRepository addMssqlClusterInstancesNameItem(String mssqlClusterInstancesNameItem) {
    if (this.mssqlClusterInstancesName == null) {
      this.mssqlClusterInstancesName = new ArrayList<>();
    }
    this.mssqlClusterInstancesName.add(mssqlClusterInstancesNameItem);
    return this;
  }

   /**
   * MSSQL cluster instances name.
   * @return mssqlClusterInstancesName
  **/
  @javax.annotation.Nullable
  public List<String> getMssqlClusterInstancesName() {
    return mssqlClusterInstancesName;
  }

  public void setMssqlClusterInstancesName(List<String> mssqlClusterInstancesName) {
    this.mssqlClusterInstancesName = mssqlClusterInstancesName;
  }


  public EnvironmentRepository mssqlClusterInstancesVersion(List<String> mssqlClusterInstancesVersion) {
    this.mssqlClusterInstancesVersion = mssqlClusterInstancesVersion;
    return this;
  }

  public EnvironmentRepository addMssqlClusterInstancesVersionItem(String mssqlClusterInstancesVersionItem) {
    if (this.mssqlClusterInstancesVersion == null) {
      this.mssqlClusterInstancesVersion = new ArrayList<>();
    }
    this.mssqlClusterInstancesVersion.add(mssqlClusterInstancesVersionItem);
    return this;
  }

   /**
   * MSSQL cluster instances version.
   * @return mssqlClusterInstancesVersion
  **/
  @javax.annotation.Nullable
  public List<String> getMssqlClusterInstancesVersion() {
    return mssqlClusterInstancesVersion;
  }

  public void setMssqlClusterInstancesVersion(List<String> mssqlClusterInstancesVersion) {
    this.mssqlClusterInstancesVersion = mssqlClusterInstancesVersion;
  }


  public EnvironmentRepository installationHome(String installationHome) {
    this.installationHome = installationHome;
    return this;
  }

   /**
   * Directory where the installation home is located.
   * @return installationHome
  **/
  @javax.annotation.Nullable
  public String getInstallationHome() {
    return installationHome;
  }

  public void setInstallationHome(String installationHome) {
    this.installationHome = installationHome;
  }


  public EnvironmentRepository driveLetter(List<String> driveLetter) {
    this.driveLetter = driveLetter;
    return this;
  }

  public EnvironmentRepository addDriveLetterItem(String driveLetterItem) {
    if (this.driveLetter == null) {
      this.driveLetter = new ArrayList<>();
    }
    this.driveLetter.add(driveLetterItem);
    return this;
  }

   /**
   * MSSQL failover cluster drive letter.
   * @return driveLetter
  **/
  @javax.annotation.Nullable
  public List<String> getDriveLetter() {
    return driveLetter;
  }

  public void setDriveLetter(List<String> driveLetter) {
    this.driveLetter = driveLetter;
  }


  public EnvironmentRepository environmentId(String environmentId) {
    this.environmentId = environmentId;
    return this;
  }

   /**
   * The environment ID.
   * @return environmentId
  **/
  @javax.annotation.Nullable
  public String getEnvironmentId() {
    return environmentId;
  }

  public void setEnvironmentId(String environmentId) {
    this.environmentId = environmentId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvironmentRepository environmentRepository = (EnvironmentRepository) o;
    return Objects.equals(this.id, environmentRepository.id) &&
        Objects.equals(this.name, environmentRepository.name) &&
        Objects.equals(this.databaseType, environmentRepository.databaseType) &&
        Objects.equals(this.allowProvisioning, environmentRepository.allowProvisioning) &&
        Objects.equals(this.isStaging, environmentRepository.isStaging) &&
        Objects.equals(this.oracleBase, environmentRepository.oracleBase) &&
        Objects.equals(this.version, environmentRepository.version) &&
        Objects.equals(this.bits, environmentRepository.bits) &&
        Objects.equals(this.installGroup, environmentRepository.installGroup) &&
        Objects.equals(this.installUser, environmentRepository.installUser) &&
        Objects.equals(this.rac, environmentRepository.rac) &&
        Objects.equals(this.ports, environmentRepository.ports) &&
        Objects.equals(this.dumpHistoryFile, environmentRepository.dumpHistoryFile) &&
        Objects.equals(this.pageSize, environmentRepository.pageSize) &&
        Objects.equals(this.owner, environmentRepository.owner) &&
        Objects.equals(this.installationPath, environmentRepository.installationPath) &&
        Objects.equals(this.fulltextInstalled, environmentRepository.fulltextInstalled) &&
        Objects.equals(this.internalVersion, environmentRepository.internalVersion) &&
        Objects.equals(this.mssqlClusterInstancesName, environmentRepository.mssqlClusterInstancesName) &&
        Objects.equals(this.mssqlClusterInstancesVersion, environmentRepository.mssqlClusterInstancesVersion) &&
        Objects.equals(this.installationHome, environmentRepository.installationHome) &&
        Objects.equals(this.driveLetter, environmentRepository.driveLetter) &&
        Objects.equals(this.environmentId, environmentRepository.environmentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, databaseType, allowProvisioning, isStaging, oracleBase, version, bits, installGroup, installUser, rac, ports, dumpHistoryFile, pageSize, owner, installationPath, fulltextInstalled, internalVersion, mssqlClusterInstancesName, mssqlClusterInstancesVersion, installationHome, driveLetter, environmentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvironmentRepository {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    databaseType: ").append(toIndentedString(databaseType)).append("\n");
    sb.append("    allowProvisioning: ").append(toIndentedString(allowProvisioning)).append("\n");
    sb.append("    isStaging: ").append(toIndentedString(isStaging)).append("\n");
    sb.append("    oracleBase: ").append(toIndentedString(oracleBase)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    bits: ").append(toIndentedString(bits)).append("\n");
    sb.append("    installGroup: ").append(toIndentedString(installGroup)).append("\n");
    sb.append("    installUser: ").append(toIndentedString(installUser)).append("\n");
    sb.append("    rac: ").append(toIndentedString(rac)).append("\n");
    sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
    sb.append("    dumpHistoryFile: ").append(toIndentedString(dumpHistoryFile)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    installationPath: ").append(toIndentedString(installationPath)).append("\n");
    sb.append("    fulltextInstalled: ").append(toIndentedString(fulltextInstalled)).append("\n");
    sb.append("    internalVersion: ").append(toIndentedString(internalVersion)).append("\n");
    sb.append("    mssqlClusterInstancesName: ").append(toIndentedString(mssqlClusterInstancesName)).append("\n");
    sb.append("    mssqlClusterInstancesVersion: ").append(toIndentedString(mssqlClusterInstancesVersion)).append("\n");
    sb.append("    installationHome: ").append(toIndentedString(installationHome)).append("\n");
    sb.append("    driveLetter: ").append(toIndentedString(driveLetter)).append("\n");
    sb.append("    environmentId: ").append(toIndentedString(environmentId)).append("\n");
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
    openapiFields.add("database_type");
    openapiFields.add("allow_provisioning");
    openapiFields.add("is_staging");
    openapiFields.add("oracle_base");
    openapiFields.add("version");
    openapiFields.add("bits");
    openapiFields.add("install_group");
    openapiFields.add("install_user");
    openapiFields.add("rac");
    openapiFields.add("ports");
    openapiFields.add("dump_history_file");
    openapiFields.add("page_size");
    openapiFields.add("owner");
    openapiFields.add("installation_path");
    openapiFields.add("fulltext_installed");
    openapiFields.add("internal_version");
    openapiFields.add("mssql_cluster_instances_name");
    openapiFields.add("mssql_cluster_instances_version");
    openapiFields.add("installation_home");
    openapiFields.add("drive_letter");
    openapiFields.add("environment_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EnvironmentRepository
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EnvironmentRepository.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EnvironmentRepository is not found in the empty JSON string", EnvironmentRepository.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EnvironmentRepository.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EnvironmentRepository` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("database_type") != null && !jsonObj.get("database_type").isJsonNull()) && !jsonObj.get("database_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `database_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("database_type").toString()));
      }
      if ((jsonObj.get("oracle_base") != null && !jsonObj.get("oracle_base").isJsonNull()) && !jsonObj.get("oracle_base").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `oracle_base` to be a primitive type in the JSON string but got `%s`", jsonObj.get("oracle_base").toString()));
      }
      if ((jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull()) && !jsonObj.get("version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
      if ((jsonObj.get("install_group") != null && !jsonObj.get("install_group").isJsonNull()) && !jsonObj.get("install_group").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `install_group` to be a primitive type in the JSON string but got `%s`", jsonObj.get("install_group").toString()));
      }
      if ((jsonObj.get("install_user") != null && !jsonObj.get("install_user").isJsonNull()) && !jsonObj.get("install_user").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `install_user` to be a primitive type in the JSON string but got `%s`", jsonObj.get("install_user").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("ports") != null && !jsonObj.get("ports").isJsonNull() && !jsonObj.get("ports").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ports` to be an array in the JSON string but got `%s`", jsonObj.get("ports").toString()));
      }
      if ((jsonObj.get("dump_history_file") != null && !jsonObj.get("dump_history_file").isJsonNull()) && !jsonObj.get("dump_history_file").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dump_history_file` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dump_history_file").toString()));
      }
      if ((jsonObj.get("owner") != null && !jsonObj.get("owner").isJsonNull()) && !jsonObj.get("owner").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `owner` to be a primitive type in the JSON string but got `%s`", jsonObj.get("owner").toString()));
      }
      if ((jsonObj.get("installation_path") != null && !jsonObj.get("installation_path").isJsonNull()) && !jsonObj.get("installation_path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `installation_path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("installation_path").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("mssql_cluster_instances_name") != null && !jsonObj.get("mssql_cluster_instances_name").isJsonNull() && !jsonObj.get("mssql_cluster_instances_name").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `mssql_cluster_instances_name` to be an array in the JSON string but got `%s`", jsonObj.get("mssql_cluster_instances_name").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("mssql_cluster_instances_version") != null && !jsonObj.get("mssql_cluster_instances_version").isJsonNull() && !jsonObj.get("mssql_cluster_instances_version").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `mssql_cluster_instances_version` to be an array in the JSON string but got `%s`", jsonObj.get("mssql_cluster_instances_version").toString()));
      }
      if ((jsonObj.get("installation_home") != null && !jsonObj.get("installation_home").isJsonNull()) && !jsonObj.get("installation_home").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `installation_home` to be a primitive type in the JSON string but got `%s`", jsonObj.get("installation_home").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("drive_letter") != null && !jsonObj.get("drive_letter").isJsonNull() && !jsonObj.get("drive_letter").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `drive_letter` to be an array in the JSON string but got `%s`", jsonObj.get("drive_letter").toString()));
      }
      if ((jsonObj.get("environment_id") != null && !jsonObj.get("environment_id").isJsonNull()) && !jsonObj.get("environment_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `environment_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("environment_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EnvironmentRepository.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EnvironmentRepository' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EnvironmentRepository> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EnvironmentRepository.class));

       return (TypeAdapter<T>) new TypeAdapter<EnvironmentRepository>() {
           @Override
           public void write(JsonWriter out, EnvironmentRepository value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EnvironmentRepository read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EnvironmentRepository given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EnvironmentRepository
  * @throws IOException if the JSON string is invalid with respect to EnvironmentRepository
  */
  public static EnvironmentRepository fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EnvironmentRepository.class);
  }

 /**
  * Convert an instance of EnvironmentRepository to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
