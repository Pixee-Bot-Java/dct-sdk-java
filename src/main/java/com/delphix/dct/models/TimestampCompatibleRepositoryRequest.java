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
import java.time.OffsetDateTime;
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
 * TimestampCompatibleRepositoryRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-04T14:49:34.152994+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class TimestampCompatibleRepositoryRequest {
  public static final String SERIALIZED_NAME_SOURCE_DATA_ID = "source_data_id";
  @SerializedName(SERIALIZED_NAME_SOURCE_DATA_ID)
  private String sourceDataId;

  public static final String SERIALIZED_NAME_ENGINE_ID = "engine_id";
  @SerializedName(SERIALIZED_NAME_ENGINE_ID)
  private String engineId;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private OffsetDateTime timestamp;

  public static final String SERIALIZED_NAME_TIMEFLOW_ID = "timeflow_id";
  @SerializedName(SERIALIZED_NAME_TIMEFLOW_ID)
  private String timeflowId;

  public static final String SERIALIZED_NAME_ENVIRONMENT_ID = "environment_id";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT_ID)
  private String environmentId;

  public TimestampCompatibleRepositoryRequest() {
  }

  public TimestampCompatibleRepositoryRequest sourceDataId(String sourceDataId) {
    this.sourceDataId = sourceDataId;
    return this;
  }

   /**
   * The ID of the source object (dSource or VDB) to get the compatible repos. All other objects referenced by the parameters must live on the same engine as the source.
   * @return sourceDataId
  **/
  @javax.annotation.Nullable
  public String getSourceDataId() {
    return sourceDataId;
  }

  public void setSourceDataId(String sourceDataId) {
    this.sourceDataId = sourceDataId;
  }


  public TimestampCompatibleRepositoryRequest engineId(String engineId) {
    this.engineId = engineId;
    return this;
  }

   /**
   * The ID of the Engine from where to get the compatible repos. If the source ID unambiguously identifies a source object, this parameter is unnecessary and ignored.
   * @return engineId
  **/
  @javax.annotation.Nullable
  public String getEngineId() {
    return engineId;
  }

  public void setEngineId(String engineId) {
    this.engineId = engineId;
  }


  public TimestampCompatibleRepositoryRequest timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * The point in time from which to execute the operation. If the timestamp is not set, selects the latest point.
   * @return timestamp
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }


  public TimestampCompatibleRepositoryRequest timeflowId(String timeflowId) {
    this.timeflowId = timeflowId;
    return this;
  }

   /**
   * ID of the timeflow from which compatible repos need to be fetched, mutually exclusive with source_data_id.
   * @return timeflowId
  **/
  @javax.annotation.Nullable
  public String getTimeflowId() {
    return timeflowId;
  }

  public void setTimeflowId(String timeflowId) {
    this.timeflowId = timeflowId;
  }


  public TimestampCompatibleRepositoryRequest environmentId(String environmentId) {
    this.environmentId = environmentId;
    return this;
  }

   /**
   * The ID or name of the target environment.
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
    TimestampCompatibleRepositoryRequest timestampCompatibleRepositoryRequest = (TimestampCompatibleRepositoryRequest) o;
    return Objects.equals(this.sourceDataId, timestampCompatibleRepositoryRequest.sourceDataId) &&
        Objects.equals(this.engineId, timestampCompatibleRepositoryRequest.engineId) &&
        Objects.equals(this.timestamp, timestampCompatibleRepositoryRequest.timestamp) &&
        Objects.equals(this.timeflowId, timestampCompatibleRepositoryRequest.timeflowId) &&
        Objects.equals(this.environmentId, timestampCompatibleRepositoryRequest.environmentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceDataId, engineId, timestamp, timeflowId, environmentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimestampCompatibleRepositoryRequest {\n");
    sb.append("    sourceDataId: ").append(toIndentedString(sourceDataId)).append("\n");
    sb.append("    engineId: ").append(toIndentedString(engineId)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    timeflowId: ").append(toIndentedString(timeflowId)).append("\n");
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
    openapiFields.add("source_data_id");
    openapiFields.add("engine_id");
    openapiFields.add("timestamp");
    openapiFields.add("timeflow_id");
    openapiFields.add("environment_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TimestampCompatibleRepositoryRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TimestampCompatibleRepositoryRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TimestampCompatibleRepositoryRequest is not found in the empty JSON string", TimestampCompatibleRepositoryRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TimestampCompatibleRepositoryRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TimestampCompatibleRepositoryRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("source_data_id") != null && !jsonObj.get("source_data_id").isJsonNull()) && !jsonObj.get("source_data_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source_data_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source_data_id").toString()));
      }
      if ((jsonObj.get("engine_id") != null && !jsonObj.get("engine_id").isJsonNull()) && !jsonObj.get("engine_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `engine_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("engine_id").toString()));
      }
      if ((jsonObj.get("timeflow_id") != null && !jsonObj.get("timeflow_id").isJsonNull()) && !jsonObj.get("timeflow_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timeflow_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timeflow_id").toString()));
      }
      if ((jsonObj.get("environment_id") != null && !jsonObj.get("environment_id").isJsonNull()) && !jsonObj.get("environment_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `environment_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("environment_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TimestampCompatibleRepositoryRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TimestampCompatibleRepositoryRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TimestampCompatibleRepositoryRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TimestampCompatibleRepositoryRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<TimestampCompatibleRepositoryRequest>() {
           @Override
           public void write(JsonWriter out, TimestampCompatibleRepositoryRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TimestampCompatibleRepositoryRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TimestampCompatibleRepositoryRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TimestampCompatibleRepositoryRequest
  * @throws IOException if the JSON string is invalid with respect to TimestampCompatibleRepositoryRequest
  */
  public static TimestampCompatibleRepositoryRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TimestampCompatibleRepositoryRequest.class);
  }

 /**
  * Convert an instance of TimestampCompatibleRepositoryRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

