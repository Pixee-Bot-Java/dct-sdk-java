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
 * OracleRacCustomEnvFile
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-04T14:49:34.152994+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class OracleRacCustomEnvFile {
  public static final String SERIALIZED_NAME_NODE_ID = "node_id";
  @SerializedName(SERIALIZED_NAME_NODE_ID)
  private String nodeId;

  public static final String SERIALIZED_NAME_PATH_PARAMETERS = "path_parameters";
  @SerializedName(SERIALIZED_NAME_PATH_PARAMETERS)
  private String pathParameters;

  public OracleRacCustomEnvFile() {
  }

  public OracleRacCustomEnvFile nodeId(String nodeId) {
    this.nodeId = nodeId;
    return this;
  }

   /**
   * Get nodeId
   * @return nodeId
  **/
  @javax.annotation.Nullable
  public String getNodeId() {
    return nodeId;
  }

  public void setNodeId(String nodeId) {
    this.nodeId = nodeId;
  }


  public OracleRacCustomEnvFile pathParameters(String pathParameters) {
    this.pathParameters = pathParameters;
    return this;
  }

   /**
   * Get pathParameters
   * @return pathParameters
  **/
  @javax.annotation.Nullable
  public String getPathParameters() {
    return pathParameters;
  }

  public void setPathParameters(String pathParameters) {
    this.pathParameters = pathParameters;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OracleRacCustomEnvFile oracleRacCustomEnvFile = (OracleRacCustomEnvFile) o;
    return Objects.equals(this.nodeId, oracleRacCustomEnvFile.nodeId) &&
        Objects.equals(this.pathParameters, oracleRacCustomEnvFile.pathParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeId, pathParameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OracleRacCustomEnvFile {\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    pathParameters: ").append(toIndentedString(pathParameters)).append("\n");
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
    openapiFields.add("node_id");
    openapiFields.add("path_parameters");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OracleRacCustomEnvFile
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OracleRacCustomEnvFile.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OracleRacCustomEnvFile is not found in the empty JSON string", OracleRacCustomEnvFile.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OracleRacCustomEnvFile.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OracleRacCustomEnvFile` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("node_id") != null && !jsonObj.get("node_id").isJsonNull()) && !jsonObj.get("node_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `node_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("node_id").toString()));
      }
      if ((jsonObj.get("path_parameters") != null && !jsonObj.get("path_parameters").isJsonNull()) && !jsonObj.get("path_parameters").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `path_parameters` to be a primitive type in the JSON string but got `%s`", jsonObj.get("path_parameters").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OracleRacCustomEnvFile.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OracleRacCustomEnvFile' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OracleRacCustomEnvFile> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OracleRacCustomEnvFile.class));

       return (TypeAdapter<T>) new TypeAdapter<OracleRacCustomEnvFile>() {
           @Override
           public void write(JsonWriter out, OracleRacCustomEnvFile value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OracleRacCustomEnvFile read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OracleRacCustomEnvFile given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OracleRacCustomEnvFile
  * @throws IOException if the JSON string is invalid with respect to OracleRacCustomEnvFile
  */
  public static OracleRacCustomEnvFile fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OracleRacCustomEnvFile.class);
  }

 /**
  * Convert an instance of OracleRacCustomEnvFile to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
