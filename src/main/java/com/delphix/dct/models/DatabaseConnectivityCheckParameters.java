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
import java.util.Arrays;

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
 * Parameters to test JDBC connectivity to source configs.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-04T14:49:34.152994+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class DatabaseConnectivityCheckParameters {
  /**
   * The type of credentials.
   */
  @JsonAdapter(CredentialsTypeEnum.Adapter.class)
  public enum CredentialsTypeEnum {
    MSSQL_ENVIRONMENT_USER("MSSQL_ENVIRONMENT_USER"),
    
    MSSQL_DOMAIN_USER("MSSQL_DOMAIN_USER"),
    
    MSSQL_DATABASE_USER("MSSQL_DATABASE_USER"),
    
    ORACLE("ORACLE"),
    
    ASE("ASE"),
    
    SOURCE_CONFIG("SOURCE_CONFIG");

    private String value;

    CredentialsTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CredentialsTypeEnum fromValue(String value) {
      for (CredentialsTypeEnum b : CredentialsTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CredentialsTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CredentialsTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CredentialsTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CredentialsTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      CredentialsTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_CREDENTIALS_TYPE = "credentials_type";
  @SerializedName(SERIALIZED_NAME_CREDENTIALS_TYPE)
  private CredentialsTypeEnum credentialsType;

  public static final String SERIALIZED_NAME_SOURCE_ID = "source_id";
  @SerializedName(SERIALIZED_NAME_SOURCE_ID)
  private String sourceId;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_VAULT = "vault";
  @SerializedName(SERIALIZED_NAME_VAULT)
  private String vault;

  public static final String SERIALIZED_NAME_HASHICORP_VAULT_ENGINE = "hashicorp_vault_engine";
  @SerializedName(SERIALIZED_NAME_HASHICORP_VAULT_ENGINE)
  private String hashicorpVaultEngine;

  public static final String SERIALIZED_NAME_HASHICORP_VAULT_SECRET_PATH = "hashicorp_vault_secret_path";
  @SerializedName(SERIALIZED_NAME_HASHICORP_VAULT_SECRET_PATH)
  private String hashicorpVaultSecretPath;

  public static final String SERIALIZED_NAME_HASHICORP_VAULT_USERNAME_KEY = "hashicorp_vault_username_key";
  @SerializedName(SERIALIZED_NAME_HASHICORP_VAULT_USERNAME_KEY)
  private String hashicorpVaultUsernameKey;

  public static final String SERIALIZED_NAME_HASHICORP_VAULT_SECRET_KEY = "hashicorp_vault_secret_key";
  @SerializedName(SERIALIZED_NAME_HASHICORP_VAULT_SECRET_KEY)
  private String hashicorpVaultSecretKey;

  public static final String SERIALIZED_NAME_AZURE_VAULT_NAME = "azure_vault_name";
  @SerializedName(SERIALIZED_NAME_AZURE_VAULT_NAME)
  private String azureVaultName;

  public static final String SERIALIZED_NAME_AZURE_VAULT_USERNAME_KEY = "azure_vault_username_key";
  @SerializedName(SERIALIZED_NAME_AZURE_VAULT_USERNAME_KEY)
  private String azureVaultUsernameKey;

  public static final String SERIALIZED_NAME_AZURE_VAULT_SECRET_KEY = "azure_vault_secret_key";
  @SerializedName(SERIALIZED_NAME_AZURE_VAULT_SECRET_KEY)
  private String azureVaultSecretKey;

  public static final String SERIALIZED_NAME_CYBERARK_VAULT_QUERY_STRING = "cyberark_vault_query_string";
  @SerializedName(SERIALIZED_NAME_CYBERARK_VAULT_QUERY_STRING)
  private String cyberarkVaultQueryString;

  public static final String SERIALIZED_NAME_ENVIRONMENT_ID = "environment_id";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT_ID)
  private String environmentId;

  public static final String SERIALIZED_NAME_ENVIRONMENT_USER = "environment_user";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT_USER)
  private String environmentUser;

  public DatabaseConnectivityCheckParameters() {
  }

  public DatabaseConnectivityCheckParameters credentialsType(CredentialsTypeEnum credentialsType) {
    this.credentialsType = credentialsType;
    return this;
  }

   /**
   * The type of credentials.
   * @return credentialsType
  **/
  @javax.annotation.Nonnull
  public CredentialsTypeEnum getCredentialsType() {
    return credentialsType;
  }

  public void setCredentialsType(CredentialsTypeEnum credentialsType) {
    this.credentialsType = credentialsType;
  }


  public DatabaseConnectivityCheckParameters sourceId(String sourceId) {
    this.sourceId = sourceId;
    return this;
  }

   /**
   * Source database config Id.
   * @return sourceId
  **/
  @javax.annotation.Nonnull
  public String getSourceId() {
    return sourceId;
  }

  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }


  public DatabaseConnectivityCheckParameters username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Database username (Not applicable for MSSQL_ENVIRONMENT_USER).
   * @return username
  **/
  @javax.annotation.Nullable
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public DatabaseConnectivityCheckParameters password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Database password (Not applicable for MSSQL_ENVIRONMENT_USER and mutually exclusive with vault attributes).
   * @return password
  **/
  @javax.annotation.Nullable
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public DatabaseConnectivityCheckParameters vault(String vault) {
    this.vault = vault;
    return this;
  }

   /**
   * The name or reference of the vault from which to read the database credentials (ORACLE, ASE and MSSQL_DOMAIN_USER only).
   * @return vault
  **/
  @javax.annotation.Nullable
  public String getVault() {
    return vault;
  }

  public void setVault(String vault) {
    this.vault = vault;
  }


  public DatabaseConnectivityCheckParameters hashicorpVaultEngine(String hashicorpVaultEngine) {
    this.hashicorpVaultEngine = hashicorpVaultEngine;
    return this;
  }

   /**
   * Vault engine name where the credential is stored (ORACLE, ASE and MSSQL_DOMAIN_USER only).
   * @return hashicorpVaultEngine
  **/
  @javax.annotation.Nullable
  public String getHashicorpVaultEngine() {
    return hashicorpVaultEngine;
  }

  public void setHashicorpVaultEngine(String hashicorpVaultEngine) {
    this.hashicorpVaultEngine = hashicorpVaultEngine;
  }


  public DatabaseConnectivityCheckParameters hashicorpVaultSecretPath(String hashicorpVaultSecretPath) {
    this.hashicorpVaultSecretPath = hashicorpVaultSecretPath;
    return this;
  }

   /**
   * Path in the vault engine where the credential is stored (ORACLE, ASE and MSSQL_DOMAIN_USER only).
   * @return hashicorpVaultSecretPath
  **/
  @javax.annotation.Nullable
  public String getHashicorpVaultSecretPath() {
    return hashicorpVaultSecretPath;
  }

  public void setHashicorpVaultSecretPath(String hashicorpVaultSecretPath) {
    this.hashicorpVaultSecretPath = hashicorpVaultSecretPath;
  }


  public DatabaseConnectivityCheckParameters hashicorpVaultUsernameKey(String hashicorpVaultUsernameKey) {
    this.hashicorpVaultUsernameKey = hashicorpVaultUsernameKey;
    return this;
  }

   /**
   * Hashicorp vault key for the username in the key-value store (ORACLE, ASE and MSSQL_DOMAIN_USER only).
   * @return hashicorpVaultUsernameKey
  **/
  @javax.annotation.Nullable
  public String getHashicorpVaultUsernameKey() {
    return hashicorpVaultUsernameKey;
  }

  public void setHashicorpVaultUsernameKey(String hashicorpVaultUsernameKey) {
    this.hashicorpVaultUsernameKey = hashicorpVaultUsernameKey;
  }


  public DatabaseConnectivityCheckParameters hashicorpVaultSecretKey(String hashicorpVaultSecretKey) {
    this.hashicorpVaultSecretKey = hashicorpVaultSecretKey;
    return this;
  }

   /**
   * Hashicorp vault key for the password in the key-value store (ORACLE, ASE and MSSQL_DOMAIN_USER only).
   * @return hashicorpVaultSecretKey
  **/
  @javax.annotation.Nullable
  public String getHashicorpVaultSecretKey() {
    return hashicorpVaultSecretKey;
  }

  public void setHashicorpVaultSecretKey(String hashicorpVaultSecretKey) {
    this.hashicorpVaultSecretKey = hashicorpVaultSecretKey;
  }


  public DatabaseConnectivityCheckParameters azureVaultName(String azureVaultName) {
    this.azureVaultName = azureVaultName;
    return this;
  }

   /**
   * Azure key vault name (ORACLE, ASE and MSSQL_DOMAIN_USER only).
   * @return azureVaultName
  **/
  @javax.annotation.Nullable
  public String getAzureVaultName() {
    return azureVaultName;
  }

  public void setAzureVaultName(String azureVaultName) {
    this.azureVaultName = azureVaultName;
  }


  public DatabaseConnectivityCheckParameters azureVaultUsernameKey(String azureVaultUsernameKey) {
    this.azureVaultUsernameKey = azureVaultUsernameKey;
    return this;
  }

   /**
   * Azure vault key for the username in the key-value store (ORACLE, ASE and MSSQL_DOMAIN_USER only).
   * @return azureVaultUsernameKey
  **/
  @javax.annotation.Nullable
  public String getAzureVaultUsernameKey() {
    return azureVaultUsernameKey;
  }

  public void setAzureVaultUsernameKey(String azureVaultUsernameKey) {
    this.azureVaultUsernameKey = azureVaultUsernameKey;
  }


  public DatabaseConnectivityCheckParameters azureVaultSecretKey(String azureVaultSecretKey) {
    this.azureVaultSecretKey = azureVaultSecretKey;
    return this;
  }

   /**
   * Azure vault key for the password in the key-value store (ORACLE, ASE and MSSQL_DOMAIN_USER only).
   * @return azureVaultSecretKey
  **/
  @javax.annotation.Nullable
  public String getAzureVaultSecretKey() {
    return azureVaultSecretKey;
  }

  public void setAzureVaultSecretKey(String azureVaultSecretKey) {
    this.azureVaultSecretKey = azureVaultSecretKey;
  }


  public DatabaseConnectivityCheckParameters cyberarkVaultQueryString(String cyberarkVaultQueryString) {
    this.cyberarkVaultQueryString = cyberarkVaultQueryString;
    return this;
  }

   /**
   * Query to find a credential in the CyberArk vault (ORACLE, ASE and MSSQL_DOMAIN_USER only).
   * @return cyberarkVaultQueryString
  **/
  @javax.annotation.Nullable
  public String getCyberarkVaultQueryString() {
    return cyberarkVaultQueryString;
  }

  public void setCyberarkVaultQueryString(String cyberarkVaultQueryString) {
    this.cyberarkVaultQueryString = cyberarkVaultQueryString;
  }


  public DatabaseConnectivityCheckParameters environmentId(String environmentId) {
    this.environmentId = environmentId;
    return this;
  }

   /**
   * Id of the environment to which environment user belongs (MSSQL_ENVIRONMENT_USER only).
   * @return environmentId
  **/
  @javax.annotation.Nullable
  public String getEnvironmentId() {
    return environmentId;
  }

  public void setEnvironmentId(String environmentId) {
    this.environmentId = environmentId;
  }


  public DatabaseConnectivityCheckParameters environmentUser(String environmentUser) {
    this.environmentUser = environmentUser;
    return this;
  }

   /**
   * Reference to the environment user (MSSQL_ENVIRONMENT_USER only).
   * @return environmentUser
  **/
  @javax.annotation.Nullable
  public String getEnvironmentUser() {
    return environmentUser;
  }

  public void setEnvironmentUser(String environmentUser) {
    this.environmentUser = environmentUser;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatabaseConnectivityCheckParameters databaseConnectivityCheckParameters = (DatabaseConnectivityCheckParameters) o;
    return Objects.equals(this.credentialsType, databaseConnectivityCheckParameters.credentialsType) &&
        Objects.equals(this.sourceId, databaseConnectivityCheckParameters.sourceId) &&
        Objects.equals(this.username, databaseConnectivityCheckParameters.username) &&
        Objects.equals(this.password, databaseConnectivityCheckParameters.password) &&
        Objects.equals(this.vault, databaseConnectivityCheckParameters.vault) &&
        Objects.equals(this.hashicorpVaultEngine, databaseConnectivityCheckParameters.hashicorpVaultEngine) &&
        Objects.equals(this.hashicorpVaultSecretPath, databaseConnectivityCheckParameters.hashicorpVaultSecretPath) &&
        Objects.equals(this.hashicorpVaultUsernameKey, databaseConnectivityCheckParameters.hashicorpVaultUsernameKey) &&
        Objects.equals(this.hashicorpVaultSecretKey, databaseConnectivityCheckParameters.hashicorpVaultSecretKey) &&
        Objects.equals(this.azureVaultName, databaseConnectivityCheckParameters.azureVaultName) &&
        Objects.equals(this.azureVaultUsernameKey, databaseConnectivityCheckParameters.azureVaultUsernameKey) &&
        Objects.equals(this.azureVaultSecretKey, databaseConnectivityCheckParameters.azureVaultSecretKey) &&
        Objects.equals(this.cyberarkVaultQueryString, databaseConnectivityCheckParameters.cyberarkVaultQueryString) &&
        Objects.equals(this.environmentId, databaseConnectivityCheckParameters.environmentId) &&
        Objects.equals(this.environmentUser, databaseConnectivityCheckParameters.environmentUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentialsType, sourceId, username, password, vault, hashicorpVaultEngine, hashicorpVaultSecretPath, hashicorpVaultUsernameKey, hashicorpVaultSecretKey, azureVaultName, azureVaultUsernameKey, azureVaultSecretKey, cyberarkVaultQueryString, environmentId, environmentUser);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatabaseConnectivityCheckParameters {\n");
    sb.append("    credentialsType: ").append(toIndentedString(credentialsType)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    vault: ").append(toIndentedString(vault)).append("\n");
    sb.append("    hashicorpVaultEngine: ").append(toIndentedString(hashicorpVaultEngine)).append("\n");
    sb.append("    hashicorpVaultSecretPath: ").append(toIndentedString(hashicorpVaultSecretPath)).append("\n");
    sb.append("    hashicorpVaultUsernameKey: ").append(toIndentedString(hashicorpVaultUsernameKey)).append("\n");
    sb.append("    hashicorpVaultSecretKey: ").append(toIndentedString(hashicorpVaultSecretKey)).append("\n");
    sb.append("    azureVaultName: ").append(toIndentedString(azureVaultName)).append("\n");
    sb.append("    azureVaultUsernameKey: ").append(toIndentedString(azureVaultUsernameKey)).append("\n");
    sb.append("    azureVaultSecretKey: ").append(toIndentedString(azureVaultSecretKey)).append("\n");
    sb.append("    cyberarkVaultQueryString: ").append(toIndentedString(cyberarkVaultQueryString)).append("\n");
    sb.append("    environmentId: ").append(toIndentedString(environmentId)).append("\n");
    sb.append("    environmentUser: ").append(toIndentedString(environmentUser)).append("\n");
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
    openapiFields.add("credentials_type");
    openapiFields.add("source_id");
    openapiFields.add("username");
    openapiFields.add("password");
    openapiFields.add("vault");
    openapiFields.add("hashicorp_vault_engine");
    openapiFields.add("hashicorp_vault_secret_path");
    openapiFields.add("hashicorp_vault_username_key");
    openapiFields.add("hashicorp_vault_secret_key");
    openapiFields.add("azure_vault_name");
    openapiFields.add("azure_vault_username_key");
    openapiFields.add("azure_vault_secret_key");
    openapiFields.add("cyberark_vault_query_string");
    openapiFields.add("environment_id");
    openapiFields.add("environment_user");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("credentials_type");
    openapiRequiredFields.add("source_id");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DatabaseConnectivityCheckParameters
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DatabaseConnectivityCheckParameters.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DatabaseConnectivityCheckParameters is not found in the empty JSON string", DatabaseConnectivityCheckParameters.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DatabaseConnectivityCheckParameters.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DatabaseConnectivityCheckParameters` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DatabaseConnectivityCheckParameters.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("credentials_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `credentials_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("credentials_type").toString()));
      }
      // validate the required field `credentials_type`
      CredentialsTypeEnum.validateJsonElement(jsonObj.get("credentials_type"));
      if (!jsonObj.get("source_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source_id").toString()));
      }
      if ((jsonObj.get("username") != null && !jsonObj.get("username").isJsonNull()) && !jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
      if ((jsonObj.get("password") != null && !jsonObj.get("password").isJsonNull()) && !jsonObj.get("password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password").toString()));
      }
      if ((jsonObj.get("vault") != null && !jsonObj.get("vault").isJsonNull()) && !jsonObj.get("vault").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vault` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vault").toString()));
      }
      if ((jsonObj.get("hashicorp_vault_engine") != null && !jsonObj.get("hashicorp_vault_engine").isJsonNull()) && !jsonObj.get("hashicorp_vault_engine").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hashicorp_vault_engine` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hashicorp_vault_engine").toString()));
      }
      if ((jsonObj.get("hashicorp_vault_secret_path") != null && !jsonObj.get("hashicorp_vault_secret_path").isJsonNull()) && !jsonObj.get("hashicorp_vault_secret_path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hashicorp_vault_secret_path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hashicorp_vault_secret_path").toString()));
      }
      if ((jsonObj.get("hashicorp_vault_username_key") != null && !jsonObj.get("hashicorp_vault_username_key").isJsonNull()) && !jsonObj.get("hashicorp_vault_username_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hashicorp_vault_username_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hashicorp_vault_username_key").toString()));
      }
      if ((jsonObj.get("hashicorp_vault_secret_key") != null && !jsonObj.get("hashicorp_vault_secret_key").isJsonNull()) && !jsonObj.get("hashicorp_vault_secret_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hashicorp_vault_secret_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hashicorp_vault_secret_key").toString()));
      }
      if ((jsonObj.get("azure_vault_name") != null && !jsonObj.get("azure_vault_name").isJsonNull()) && !jsonObj.get("azure_vault_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `azure_vault_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("azure_vault_name").toString()));
      }
      if ((jsonObj.get("azure_vault_username_key") != null && !jsonObj.get("azure_vault_username_key").isJsonNull()) && !jsonObj.get("azure_vault_username_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `azure_vault_username_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("azure_vault_username_key").toString()));
      }
      if ((jsonObj.get("azure_vault_secret_key") != null && !jsonObj.get("azure_vault_secret_key").isJsonNull()) && !jsonObj.get("azure_vault_secret_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `azure_vault_secret_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("azure_vault_secret_key").toString()));
      }
      if ((jsonObj.get("cyberark_vault_query_string") != null && !jsonObj.get("cyberark_vault_query_string").isJsonNull()) && !jsonObj.get("cyberark_vault_query_string").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cyberark_vault_query_string` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cyberark_vault_query_string").toString()));
      }
      if ((jsonObj.get("environment_id") != null && !jsonObj.get("environment_id").isJsonNull()) && !jsonObj.get("environment_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `environment_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("environment_id").toString()));
      }
      if ((jsonObj.get("environment_user") != null && !jsonObj.get("environment_user").isJsonNull()) && !jsonObj.get("environment_user").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `environment_user` to be a primitive type in the JSON string but got `%s`", jsonObj.get("environment_user").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DatabaseConnectivityCheckParameters.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DatabaseConnectivityCheckParameters' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DatabaseConnectivityCheckParameters> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DatabaseConnectivityCheckParameters.class));

       return (TypeAdapter<T>) new TypeAdapter<DatabaseConnectivityCheckParameters>() {
           @Override
           public void write(JsonWriter out, DatabaseConnectivityCheckParameters value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DatabaseConnectivityCheckParameters read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DatabaseConnectivityCheckParameters given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DatabaseConnectivityCheckParameters
  * @throws IOException if the JSON string is invalid with respect to DatabaseConnectivityCheckParameters
  */
  public static DatabaseConnectivityCheckParameters fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DatabaseConnectivityCheckParameters.class);
  }

 /**
  * Convert an instance of DatabaseConnectivityCheckParameters to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

