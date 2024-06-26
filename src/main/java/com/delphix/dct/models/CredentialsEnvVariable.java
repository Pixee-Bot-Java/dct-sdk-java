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
 * CredentialsEnvVariable
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-04T14:49:34.152994+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class CredentialsEnvVariable {
  public static final String SERIALIZED_NAME_BASE_VAR_NAME = "base_var_name";
  @SerializedName(SERIALIZED_NAME_BASE_VAR_NAME)
  private String baseVarName;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_VAULT_USERNAME = "vault_username";
  @SerializedName(SERIALIZED_NAME_VAULT_USERNAME)
  private String vaultUsername;

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

  public CredentialsEnvVariable() {
  }

  public CredentialsEnvVariable baseVarName(String baseVarName) {
    this.baseVarName = baseVarName;
    return this;
  }

   /**
   * Base name of the environment variables. Variables are named by appending &#39;_USER&#39;, &#39;_PASSWORD&#39;, &#39;_PUBKEY&#39; and &#39;_PRIVKEY&#39; to this base name, respectively. Variables whose values are not entered or are not present in the type of credential or vault selected, will not be set.
   * @return baseVarName
  **/
  @javax.annotation.Nonnull
  public String getBaseVarName() {
    return baseVarName;
  }

  public void setBaseVarName(String baseVarName) {
    this.baseVarName = baseVarName;
  }


  public CredentialsEnvVariable password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Password to assign to the environment variables.
   * @return password
  **/
  @javax.annotation.Nullable
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public CredentialsEnvVariable vaultUsername(String vaultUsername) {
    this.vaultUsername = vaultUsername;
    return this;
  }

   /**
   * Delphix display name for the vault user.
   * @return vaultUsername
  **/
  @javax.annotation.Nullable
  public String getVaultUsername() {
    return vaultUsername;
  }

  public void setVaultUsername(String vaultUsername) {
    this.vaultUsername = vaultUsername;
  }


  public CredentialsEnvVariable vault(String vault) {
    this.vault = vault;
    return this;
  }

   /**
   * The name or reference of the vault to assign to the environment variables.
   * @return vault
  **/
  @javax.annotation.Nullable
  public String getVault() {
    return vault;
  }

  public void setVault(String vault) {
    this.vault = vault;
  }


  public CredentialsEnvVariable hashicorpVaultEngine(String hashicorpVaultEngine) {
    this.hashicorpVaultEngine = hashicorpVaultEngine;
    return this;
  }

   /**
   * Vault engine name where the credential is stored.
   * @return hashicorpVaultEngine
  **/
  @javax.annotation.Nullable
  public String getHashicorpVaultEngine() {
    return hashicorpVaultEngine;
  }

  public void setHashicorpVaultEngine(String hashicorpVaultEngine) {
    this.hashicorpVaultEngine = hashicorpVaultEngine;
  }


  public CredentialsEnvVariable hashicorpVaultSecretPath(String hashicorpVaultSecretPath) {
    this.hashicorpVaultSecretPath = hashicorpVaultSecretPath;
    return this;
  }

   /**
   * Path in the vault engine where the credential is stored.
   * @return hashicorpVaultSecretPath
  **/
  @javax.annotation.Nullable
  public String getHashicorpVaultSecretPath() {
    return hashicorpVaultSecretPath;
  }

  public void setHashicorpVaultSecretPath(String hashicorpVaultSecretPath) {
    this.hashicorpVaultSecretPath = hashicorpVaultSecretPath;
  }


  public CredentialsEnvVariable hashicorpVaultUsernameKey(String hashicorpVaultUsernameKey) {
    this.hashicorpVaultUsernameKey = hashicorpVaultUsernameKey;
    return this;
  }

   /**
   * Hashicorp vault key for the username in the key-value store.
   * @return hashicorpVaultUsernameKey
  **/
  @javax.annotation.Nullable
  public String getHashicorpVaultUsernameKey() {
    return hashicorpVaultUsernameKey;
  }

  public void setHashicorpVaultUsernameKey(String hashicorpVaultUsernameKey) {
    this.hashicorpVaultUsernameKey = hashicorpVaultUsernameKey;
  }


  public CredentialsEnvVariable hashicorpVaultSecretKey(String hashicorpVaultSecretKey) {
    this.hashicorpVaultSecretKey = hashicorpVaultSecretKey;
    return this;
  }

   /**
   * Hashicorp vault key for the password in the key-value store.
   * @return hashicorpVaultSecretKey
  **/
  @javax.annotation.Nullable
  public String getHashicorpVaultSecretKey() {
    return hashicorpVaultSecretKey;
  }

  public void setHashicorpVaultSecretKey(String hashicorpVaultSecretKey) {
    this.hashicorpVaultSecretKey = hashicorpVaultSecretKey;
  }


  public CredentialsEnvVariable azureVaultName(String azureVaultName) {
    this.azureVaultName = azureVaultName;
    return this;
  }

   /**
   * Azure key vault name.
   * @return azureVaultName
  **/
  @javax.annotation.Nullable
  public String getAzureVaultName() {
    return azureVaultName;
  }

  public void setAzureVaultName(String azureVaultName) {
    this.azureVaultName = azureVaultName;
  }


  public CredentialsEnvVariable azureVaultUsernameKey(String azureVaultUsernameKey) {
    this.azureVaultUsernameKey = azureVaultUsernameKey;
    return this;
  }

   /**
   * Azure vault key in the key-value store.
   * @return azureVaultUsernameKey
  **/
  @javax.annotation.Nullable
  public String getAzureVaultUsernameKey() {
    return azureVaultUsernameKey;
  }

  public void setAzureVaultUsernameKey(String azureVaultUsernameKey) {
    this.azureVaultUsernameKey = azureVaultUsernameKey;
  }


  public CredentialsEnvVariable azureVaultSecretKey(String azureVaultSecretKey) {
    this.azureVaultSecretKey = azureVaultSecretKey;
    return this;
  }

   /**
   * Azure vault key in the key-value store.
   * @return azureVaultSecretKey
  **/
  @javax.annotation.Nullable
  public String getAzureVaultSecretKey() {
    return azureVaultSecretKey;
  }

  public void setAzureVaultSecretKey(String azureVaultSecretKey) {
    this.azureVaultSecretKey = azureVaultSecretKey;
  }


  public CredentialsEnvVariable cyberarkVaultQueryString(String cyberarkVaultQueryString) {
    this.cyberarkVaultQueryString = cyberarkVaultQueryString;
    return this;
  }

   /**
   * Query to find a credential in the CyberArk vault.
   * @return cyberarkVaultQueryString
  **/
  @javax.annotation.Nullable
  public String getCyberarkVaultQueryString() {
    return cyberarkVaultQueryString;
  }

  public void setCyberarkVaultQueryString(String cyberarkVaultQueryString) {
    this.cyberarkVaultQueryString = cyberarkVaultQueryString;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CredentialsEnvVariable credentialsEnvVariable = (CredentialsEnvVariable) o;
    return Objects.equals(this.baseVarName, credentialsEnvVariable.baseVarName) &&
        Objects.equals(this.password, credentialsEnvVariable.password) &&
        Objects.equals(this.vaultUsername, credentialsEnvVariable.vaultUsername) &&
        Objects.equals(this.vault, credentialsEnvVariable.vault) &&
        Objects.equals(this.hashicorpVaultEngine, credentialsEnvVariable.hashicorpVaultEngine) &&
        Objects.equals(this.hashicorpVaultSecretPath, credentialsEnvVariable.hashicorpVaultSecretPath) &&
        Objects.equals(this.hashicorpVaultUsernameKey, credentialsEnvVariable.hashicorpVaultUsernameKey) &&
        Objects.equals(this.hashicorpVaultSecretKey, credentialsEnvVariable.hashicorpVaultSecretKey) &&
        Objects.equals(this.azureVaultName, credentialsEnvVariable.azureVaultName) &&
        Objects.equals(this.azureVaultUsernameKey, credentialsEnvVariable.azureVaultUsernameKey) &&
        Objects.equals(this.azureVaultSecretKey, credentialsEnvVariable.azureVaultSecretKey) &&
        Objects.equals(this.cyberarkVaultQueryString, credentialsEnvVariable.cyberarkVaultQueryString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseVarName, password, vaultUsername, vault, hashicorpVaultEngine, hashicorpVaultSecretPath, hashicorpVaultUsernameKey, hashicorpVaultSecretKey, azureVaultName, azureVaultUsernameKey, azureVaultSecretKey, cyberarkVaultQueryString);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CredentialsEnvVariable {\n");
    sb.append("    baseVarName: ").append(toIndentedString(baseVarName)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    vaultUsername: ").append(toIndentedString(vaultUsername)).append("\n");
    sb.append("    vault: ").append(toIndentedString(vault)).append("\n");
    sb.append("    hashicorpVaultEngine: ").append(toIndentedString(hashicorpVaultEngine)).append("\n");
    sb.append("    hashicorpVaultSecretPath: ").append(toIndentedString(hashicorpVaultSecretPath)).append("\n");
    sb.append("    hashicorpVaultUsernameKey: ").append(toIndentedString(hashicorpVaultUsernameKey)).append("\n");
    sb.append("    hashicorpVaultSecretKey: ").append(toIndentedString(hashicorpVaultSecretKey)).append("\n");
    sb.append("    azureVaultName: ").append(toIndentedString(azureVaultName)).append("\n");
    sb.append("    azureVaultUsernameKey: ").append(toIndentedString(azureVaultUsernameKey)).append("\n");
    sb.append("    azureVaultSecretKey: ").append(toIndentedString(azureVaultSecretKey)).append("\n");
    sb.append("    cyberarkVaultQueryString: ").append(toIndentedString(cyberarkVaultQueryString)).append("\n");
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
    openapiFields.add("base_var_name");
    openapiFields.add("password");
    openapiFields.add("vault_username");
    openapiFields.add("vault");
    openapiFields.add("hashicorp_vault_engine");
    openapiFields.add("hashicorp_vault_secret_path");
    openapiFields.add("hashicorp_vault_username_key");
    openapiFields.add("hashicorp_vault_secret_key");
    openapiFields.add("azure_vault_name");
    openapiFields.add("azure_vault_username_key");
    openapiFields.add("azure_vault_secret_key");
    openapiFields.add("cyberark_vault_query_string");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("base_var_name");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CredentialsEnvVariable
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CredentialsEnvVariable.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CredentialsEnvVariable is not found in the empty JSON string", CredentialsEnvVariable.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CredentialsEnvVariable.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CredentialsEnvVariable` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CredentialsEnvVariable.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("base_var_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `base_var_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("base_var_name").toString()));
      }
      if ((jsonObj.get("password") != null && !jsonObj.get("password").isJsonNull()) && !jsonObj.get("password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password").toString()));
      }
      if ((jsonObj.get("vault_username") != null && !jsonObj.get("vault_username").isJsonNull()) && !jsonObj.get("vault_username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vault_username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vault_username").toString()));
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
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CredentialsEnvVariable.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CredentialsEnvVariable' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CredentialsEnvVariable> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CredentialsEnvVariable.class));

       return (TypeAdapter<T>) new TypeAdapter<CredentialsEnvVariable>() {
           @Override
           public void write(JsonWriter out, CredentialsEnvVariable value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CredentialsEnvVariable read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CredentialsEnvVariable given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CredentialsEnvVariable
  * @throws IOException if the JSON string is invalid with respect to CredentialsEnvVariable
  */
  public static CredentialsEnvVariable fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CredentialsEnvVariable.class);
  }

 /**
  * Convert an instance of CredentialsEnvVariable to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

