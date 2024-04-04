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
import com.delphix.dct.models.Job;
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
 * CreateEnvironmentResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-04T14:49:34.152994+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class CreateEnvironmentResponse {
  public static final String SERIALIZED_NAME_JOB = "job";
  @SerializedName(SERIALIZED_NAME_JOB)
  private Job job;

  public static final String SERIALIZED_NAME_ENVIRONMENT_ID = "environment_id";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT_ID)
  private String environmentId;

  public CreateEnvironmentResponse() {
  }

  public CreateEnvironmentResponse job(Job job) {
    this.job = job;
    return this;
  }

   /**
   * Get job
   * @return job
  **/
  @javax.annotation.Nullable
  public Job getJob() {
    return job;
  }

  public void setJob(Job job) {
    this.job = job;
  }


  public CreateEnvironmentResponse environmentId(String environmentId) {
    this.environmentId = environmentId;
    return this;
  }

   /**
   * The id of environment created.
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
    CreateEnvironmentResponse createEnvironmentResponse = (CreateEnvironmentResponse) o;
    return Objects.equals(this.job, createEnvironmentResponse.job) &&
        Objects.equals(this.environmentId, createEnvironmentResponse.environmentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(job, environmentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateEnvironmentResponse {\n");
    sb.append("    job: ").append(toIndentedString(job)).append("\n");
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
    openapiFields.add("job");
    openapiFields.add("environment_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateEnvironmentResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateEnvironmentResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateEnvironmentResponse is not found in the empty JSON string", CreateEnvironmentResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateEnvironmentResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateEnvironmentResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `job`
      if (jsonObj.get("job") != null && !jsonObj.get("job").isJsonNull()) {
        Job.validateJsonElement(jsonObj.get("job"));
      }
      if ((jsonObj.get("environment_id") != null && !jsonObj.get("environment_id").isJsonNull()) && !jsonObj.get("environment_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `environment_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("environment_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateEnvironmentResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateEnvironmentResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateEnvironmentResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateEnvironmentResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateEnvironmentResponse>() {
           @Override
           public void write(JsonWriter out, CreateEnvironmentResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateEnvironmentResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateEnvironmentResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateEnvironmentResponse
  * @throws IOException if the JSON string is invalid with respect to CreateEnvironmentResponse
  */
  public static CreateEnvironmentResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateEnvironmentResponse.class);
  }

 /**
  * Convert an instance of CreateEnvironmentResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
