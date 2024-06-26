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
 * EnginePerformanceAnalyticTrendDatapointInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-04T14:49:34.152994+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class EnginePerformanceAnalyticTrendDatapointInner {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private Long data;

  public static final String SERIALIZED_NAME_TIME = "time";
  @SerializedName(SERIALIZED_NAME_TIME)
  private OffsetDateTime time;

  public EnginePerformanceAnalyticTrendDatapointInner() {
  }

  public EnginePerformanceAnalyticTrendDatapointInner data(Long data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  public Long getData() {
    return data;
  }

  public void setData(Long data) {
    this.data = data;
  }


  public EnginePerformanceAnalyticTrendDatapointInner time(OffsetDateTime time) {
    this.time = time;
    return this;
  }

   /**
   * Get time
   * @return time
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getTime() {
    return time;
  }

  public void setTime(OffsetDateTime time) {
    this.time = time;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnginePerformanceAnalyticTrendDatapointInner enginePerformanceAnalyticTrendDatapointInner = (EnginePerformanceAnalyticTrendDatapointInner) o;
    return Objects.equals(this.data, enginePerformanceAnalyticTrendDatapointInner.data) &&
        Objects.equals(this.time, enginePerformanceAnalyticTrendDatapointInner.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnginePerformanceAnalyticTrendDatapointInner {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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
    openapiFields.add("data");
    openapiFields.add("time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EnginePerformanceAnalyticTrendDatapointInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EnginePerformanceAnalyticTrendDatapointInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EnginePerformanceAnalyticTrendDatapointInner is not found in the empty JSON string", EnginePerformanceAnalyticTrendDatapointInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EnginePerformanceAnalyticTrendDatapointInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EnginePerformanceAnalyticTrendDatapointInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EnginePerformanceAnalyticTrendDatapointInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EnginePerformanceAnalyticTrendDatapointInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EnginePerformanceAnalyticTrendDatapointInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EnginePerformanceAnalyticTrendDatapointInner.class));

       return (TypeAdapter<T>) new TypeAdapter<EnginePerformanceAnalyticTrendDatapointInner>() {
           @Override
           public void write(JsonWriter out, EnginePerformanceAnalyticTrendDatapointInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EnginePerformanceAnalyticTrendDatapointInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EnginePerformanceAnalyticTrendDatapointInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EnginePerformanceAnalyticTrendDatapointInner
  * @throws IOException if the JSON string is invalid with respect to EnginePerformanceAnalyticTrendDatapointInner
  */
  public static EnginePerformanceAnalyticTrendDatapointInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EnginePerformanceAnalyticTrendDatapointInner.class);
  }

 /**
  * Convert an instance of EnginePerformanceAnalyticTrendDatapointInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

