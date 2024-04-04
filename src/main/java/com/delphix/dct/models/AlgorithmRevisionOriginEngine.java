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
 * A record of engine that an algorithm revision originates from.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-04T14:49:34.152994+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class AlgorithmRevisionOriginEngine {
  public static final String SERIALIZED_NAME_ENGINE_ID = "engine_id";
  @SerializedName(SERIALIZED_NAME_ENGINE_ID)
  private String engineId;

  public static final String SERIALIZED_NAME_ENGINE_NAME = "engine_name";
  @SerializedName(SERIALIZED_NAME_ENGINE_NAME)
  private String engineName;

  public AlgorithmRevisionOriginEngine() {
  }

  public AlgorithmRevisionOriginEngine engineId(String engineId) {
    this.engineId = engineId;
    return this;
  }

   /**
   * The id of the engine that this algorithm revision is originated from.
   * @return engineId
  **/
  @javax.annotation.Nullable
  public String getEngineId() {
    return engineId;
  }

  public void setEngineId(String engineId) {
    this.engineId = engineId;
  }


  public AlgorithmRevisionOriginEngine engineName(String engineName) {
    this.engineName = engineName;
    return this;
  }

   /**
   * The name of the engine that this algorithm revision is originated from.
   * @return engineName
  **/
  @javax.annotation.Nullable
  public String getEngineName() {
    return engineName;
  }

  public void setEngineName(String engineName) {
    this.engineName = engineName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlgorithmRevisionOriginEngine algorithmRevisionOriginEngine = (AlgorithmRevisionOriginEngine) o;
    return Objects.equals(this.engineId, algorithmRevisionOriginEngine.engineId) &&
        Objects.equals(this.engineName, algorithmRevisionOriginEngine.engineName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(engineId, engineName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlgorithmRevisionOriginEngine {\n");
    sb.append("    engineId: ").append(toIndentedString(engineId)).append("\n");
    sb.append("    engineName: ").append(toIndentedString(engineName)).append("\n");
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
    openapiFields.add("engine_id");
    openapiFields.add("engine_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AlgorithmRevisionOriginEngine
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AlgorithmRevisionOriginEngine.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlgorithmRevisionOriginEngine is not found in the empty JSON string", AlgorithmRevisionOriginEngine.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AlgorithmRevisionOriginEngine.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlgorithmRevisionOriginEngine` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("engine_id") != null && !jsonObj.get("engine_id").isJsonNull()) && !jsonObj.get("engine_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `engine_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("engine_id").toString()));
      }
      if ((jsonObj.get("engine_name") != null && !jsonObj.get("engine_name").isJsonNull()) && !jsonObj.get("engine_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `engine_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("engine_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlgorithmRevisionOriginEngine.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlgorithmRevisionOriginEngine' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlgorithmRevisionOriginEngine> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlgorithmRevisionOriginEngine.class));

       return (TypeAdapter<T>) new TypeAdapter<AlgorithmRevisionOriginEngine>() {
           @Override
           public void write(JsonWriter out, AlgorithmRevisionOriginEngine value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlgorithmRevisionOriginEngine read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlgorithmRevisionOriginEngine given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlgorithmRevisionOriginEngine
  * @throws IOException if the JSON string is invalid with respect to AlgorithmRevisionOriginEngine
  */
  public static AlgorithmRevisionOriginEngine fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlgorithmRevisionOriginEngine.class);
  }

 /**
  * Convert an instance of AlgorithmRevisionOriginEngine to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
