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
 * Parameters to test NetBackup master server and client connectivity on an environment.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-04T14:49:34.152994+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class NetbackupConnectivityCheckParameters {
  public static final String SERIALIZED_NAME_ENVIRONMENT_ID = "environment_id";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT_ID)
  private String environmentId;

  public static final String SERIALIZED_NAME_ENVIRONMENT_USER_ID = "environment_user_id";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT_USER_ID)
  private String environmentUserId;

  public static final String SERIALIZED_NAME_MASTER_SERVER_NAME = "master_server_name";
  @SerializedName(SERIALIZED_NAME_MASTER_SERVER_NAME)
  private String masterServerName;

  public static final String SERIALIZED_NAME_SOURCE_CLIENT_NAME = "source_client_name";
  @SerializedName(SERIALIZED_NAME_SOURCE_CLIENT_NAME)
  private String sourceClientName;

  public NetbackupConnectivityCheckParameters() {
  }

  public NetbackupConnectivityCheckParameters environmentId(String environmentId) {
    this.environmentId = environmentId;
    return this;
  }

   /**
   * Id of the target environment to test NetBackup connectivity from.
   * @return environmentId
  **/
  @javax.annotation.Nonnull
  public String getEnvironmentId() {
    return environmentId;
  }

  public void setEnvironmentId(String environmentId) {
    this.environmentId = environmentId;
  }


  public NetbackupConnectivityCheckParameters environmentUserId(String environmentUserId) {
    this.environmentUserId = environmentUserId;
    return this;
  }

   /**
   * Id of the environment user.
   * @return environmentUserId
  **/
  @javax.annotation.Nonnull
  public String getEnvironmentUserId() {
    return environmentUserId;
  }

  public void setEnvironmentUserId(String environmentUserId) {
    this.environmentUserId = environmentUserId;
  }


  public NetbackupConnectivityCheckParameters masterServerName(String masterServerName) {
    this.masterServerName = masterServerName;
    return this;
  }

   /**
   * The name of the NetBackup master server to attempt to connect to.
   * @return masterServerName
  **/
  @javax.annotation.Nonnull
  public String getMasterServerName() {
    return masterServerName;
  }

  public void setMasterServerName(String masterServerName) {
    this.masterServerName = masterServerName;
  }


  public NetbackupConnectivityCheckParameters sourceClientName(String sourceClientName) {
    this.sourceClientName = sourceClientName;
    return this;
  }

   /**
   * The name of the NetBackup client to attempt to connect with.
   * @return sourceClientName
  **/
  @javax.annotation.Nonnull
  public String getSourceClientName() {
    return sourceClientName;
  }

  public void setSourceClientName(String sourceClientName) {
    this.sourceClientName = sourceClientName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetbackupConnectivityCheckParameters netbackupConnectivityCheckParameters = (NetbackupConnectivityCheckParameters) o;
    return Objects.equals(this.environmentId, netbackupConnectivityCheckParameters.environmentId) &&
        Objects.equals(this.environmentUserId, netbackupConnectivityCheckParameters.environmentUserId) &&
        Objects.equals(this.masterServerName, netbackupConnectivityCheckParameters.masterServerName) &&
        Objects.equals(this.sourceClientName, netbackupConnectivityCheckParameters.sourceClientName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentId, environmentUserId, masterServerName, sourceClientName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetbackupConnectivityCheckParameters {\n");
    sb.append("    environmentId: ").append(toIndentedString(environmentId)).append("\n");
    sb.append("    environmentUserId: ").append(toIndentedString(environmentUserId)).append("\n");
    sb.append("    masterServerName: ").append(toIndentedString(masterServerName)).append("\n");
    sb.append("    sourceClientName: ").append(toIndentedString(sourceClientName)).append("\n");
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
    openapiFields.add("environment_id");
    openapiFields.add("environment_user_id");
    openapiFields.add("master_server_name");
    openapiFields.add("source_client_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("environment_id");
    openapiRequiredFields.add("environment_user_id");
    openapiRequiredFields.add("master_server_name");
    openapiRequiredFields.add("source_client_name");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to NetbackupConnectivityCheckParameters
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!NetbackupConnectivityCheckParameters.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NetbackupConnectivityCheckParameters is not found in the empty JSON string", NetbackupConnectivityCheckParameters.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!NetbackupConnectivityCheckParameters.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NetbackupConnectivityCheckParameters` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : NetbackupConnectivityCheckParameters.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("environment_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `environment_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("environment_id").toString()));
      }
      if (!jsonObj.get("environment_user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `environment_user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("environment_user_id").toString()));
      }
      if (!jsonObj.get("master_server_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `master_server_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("master_server_name").toString()));
      }
      if (!jsonObj.get("source_client_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source_client_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source_client_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NetbackupConnectivityCheckParameters.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NetbackupConnectivityCheckParameters' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NetbackupConnectivityCheckParameters> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NetbackupConnectivityCheckParameters.class));

       return (TypeAdapter<T>) new TypeAdapter<NetbackupConnectivityCheckParameters>() {
           @Override
           public void write(JsonWriter out, NetbackupConnectivityCheckParameters value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NetbackupConnectivityCheckParameters read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NetbackupConnectivityCheckParameters given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NetbackupConnectivityCheckParameters
  * @throws IOException if the JSON string is invalid with respect to NetbackupConnectivityCheckParameters
  */
  public static NetbackupConnectivityCheckParameters fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NetbackupConnectivityCheckParameters.class);
  }

 /**
  * Convert an instance of NetbackupConnectivityCheckParameters to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
