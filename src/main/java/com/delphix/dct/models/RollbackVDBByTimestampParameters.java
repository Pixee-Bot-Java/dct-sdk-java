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
 * RollbackVDBByTimestampParameters
 * @deprecated
 */
@Deprecated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-04T14:49:34.152994+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class RollbackVDBByTimestampParameters {
  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private OffsetDateTime timestamp;

  public static final String SERIALIZED_NAME_TIMESTAMP_IN_DATABASE_TIMEZONE = "timestamp_in_database_timezone";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP_IN_DATABASE_TIMEZONE)
  private String timestampInDatabaseTimezone;

  public static final String SERIALIZED_NAME_TIMEFLOW_ID = "timeflow_id";
  @SerializedName(SERIALIZED_NAME_TIMEFLOW_ID)
  private String timeflowId;

  public RollbackVDBByTimestampParameters() {
  }

  public RollbackVDBByTimestampParameters timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * The point in time from which to execute the operation. Mutually exclusive with timestamp_in_database_timezone. If the timestamp is not set, selects the latest point.
   * @return timestamp
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }


  public RollbackVDBByTimestampParameters timestampInDatabaseTimezone(String timestampInDatabaseTimezone) {
    this.timestampInDatabaseTimezone = timestampInDatabaseTimezone;
    return this;
  }

   /**
   * The point in time from which to execute the operation, expressed as a date-time in the timezone of the source database. Mutually exclusive with timestamp.
   * @return timestampInDatabaseTimezone
  **/
  @javax.annotation.Nullable
  public String getTimestampInDatabaseTimezone() {
    return timestampInDatabaseTimezone;
  }

  public void setTimestampInDatabaseTimezone(String timestampInDatabaseTimezone) {
    this.timestampInDatabaseTimezone = timestampInDatabaseTimezone;
  }


  public RollbackVDBByTimestampParameters timeflowId(String timeflowId) {
    this.timeflowId = timeflowId;
    return this;
  }

   /**
   * The Timeflow ID.
   * @return timeflowId
  **/
  @javax.annotation.Nullable
  public String getTimeflowId() {
    return timeflowId;
  }

  public void setTimeflowId(String timeflowId) {
    this.timeflowId = timeflowId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RollbackVDBByTimestampParameters rollbackVDBByTimestampParameters = (RollbackVDBByTimestampParameters) o;
    return Objects.equals(this.timestamp, rollbackVDBByTimestampParameters.timestamp) &&
        Objects.equals(this.timestampInDatabaseTimezone, rollbackVDBByTimestampParameters.timestampInDatabaseTimezone) &&
        Objects.equals(this.timeflowId, rollbackVDBByTimestampParameters.timeflowId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamp, timestampInDatabaseTimezone, timeflowId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RollbackVDBByTimestampParameters {\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    timestampInDatabaseTimezone: ").append(toIndentedString(timestampInDatabaseTimezone)).append("\n");
    sb.append("    timeflowId: ").append(toIndentedString(timeflowId)).append("\n");
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
    openapiFields.add("timestamp");
    openapiFields.add("timestamp_in_database_timezone");
    openapiFields.add("timeflow_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RollbackVDBByTimestampParameters
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RollbackVDBByTimestampParameters.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RollbackVDBByTimestampParameters is not found in the empty JSON string", RollbackVDBByTimestampParameters.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RollbackVDBByTimestampParameters.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RollbackVDBByTimestampParameters` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("timestamp_in_database_timezone") != null && !jsonObj.get("timestamp_in_database_timezone").isJsonNull()) && !jsonObj.get("timestamp_in_database_timezone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timestamp_in_database_timezone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timestamp_in_database_timezone").toString()));
      }
      if ((jsonObj.get("timeflow_id") != null && !jsonObj.get("timeflow_id").isJsonNull()) && !jsonObj.get("timeflow_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timeflow_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timeflow_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RollbackVDBByTimestampParameters.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RollbackVDBByTimestampParameters' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RollbackVDBByTimestampParameters> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RollbackVDBByTimestampParameters.class));

       return (TypeAdapter<T>) new TypeAdapter<RollbackVDBByTimestampParameters>() {
           @Override
           public void write(JsonWriter out, RollbackVDBByTimestampParameters value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RollbackVDBByTimestampParameters read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RollbackVDBByTimestampParameters given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RollbackVDBByTimestampParameters
  * @throws IOException if the JSON string is invalid with respect to RollbackVDBByTimestampParameters
  */
  public static RollbackVDBByTimestampParameters fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RollbackVDBByTimestampParameters.class);
  }

 /**
  * Convert an instance of RollbackVDBByTimestampParameters to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

