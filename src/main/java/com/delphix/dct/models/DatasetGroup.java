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
 * A Delphix engine dataset group.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-04T14:49:34.152994+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class DatasetGroup {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAMESPACE_ID = "namespace_id";
  @SerializedName(SERIALIZED_NAME_NAMESPACE_ID)
  private String namespaceId;

  public static final String SERIALIZED_NAME_NAMESPACE_NAME = "namespace_name";
  @SerializedName(SERIALIZED_NAME_NAMESPACE_NAME)
  private String namespaceName;

  public static final String SERIALIZED_NAME_IS_REPLICA = "is_replica";
  @SerializedName(SERIALIZED_NAME_IS_REPLICA)
  private Boolean isReplica;

  public static final String SERIALIZED_NAME_ENGINE_ID = "engine_id";
  @SerializedName(SERIALIZED_NAME_ENGINE_ID)
  private String engineId;

  public static final String SERIALIZED_NAME_ENGINE_NAME = "engine_name";
  @SerializedName(SERIALIZED_NAME_ENGINE_NAME)
  private String engineName;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public DatasetGroup() {
  }

  public DatasetGroup id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The dataset group ID.
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public DatasetGroup name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of this dataset group.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public DatasetGroup namespaceId(String namespaceId) {
    this.namespaceId = namespaceId;
    return this;
  }

   /**
   * The namespace id of this dataset group.
   * @return namespaceId
  **/
  @javax.annotation.Nullable
  public String getNamespaceId() {
    return namespaceId;
  }

  public void setNamespaceId(String namespaceId) {
    this.namespaceId = namespaceId;
  }


  public DatasetGroup namespaceName(String namespaceName) {
    this.namespaceName = namespaceName;
    return this;
  }

   /**
   * The namespace name of this dataset group.
   * @return namespaceName
  **/
  @javax.annotation.Nullable
  public String getNamespaceName() {
    return namespaceName;
  }

  public void setNamespaceName(String namespaceName) {
    this.namespaceName = namespaceName;
  }


  public DatasetGroup isReplica(Boolean isReplica) {
    this.isReplica = isReplica;
    return this;
  }

   /**
   * Is this a replicated object.
   * @return isReplica
  **/
  @javax.annotation.Nullable
  public Boolean getIsReplica() {
    return isReplica;
  }

  public void setIsReplica(Boolean isReplica) {
    this.isReplica = isReplica;
  }


  public DatasetGroup engineId(String engineId) {
    this.engineId = engineId;
    return this;
  }

   /**
   * Id of the Engine that this dataset group belongs to.
   * @return engineId
  **/
  @javax.annotation.Nullable
  public String getEngineId() {
    return engineId;
  }

  public void setEngineId(String engineId) {
    this.engineId = engineId;
  }


  public DatasetGroup engineName(String engineName) {
    this.engineName = engineName;
    return this;
  }

   /**
   * Name of the Engine that this dataset group belongs to.
   * @return engineName
  **/
  @javax.annotation.Nullable
  public String getEngineName() {
    return engineName;
  }

  public void setEngineName(String engineName) {
    this.engineName = engineName;
  }


  public DatasetGroup namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

   /**
   * The namespace of this dataset group.
   * @return namespace
  **/
  @javax.annotation.Nullable
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatasetGroup datasetGroup = (DatasetGroup) o;
    return Objects.equals(this.id, datasetGroup.id) &&
        Objects.equals(this.name, datasetGroup.name) &&
        Objects.equals(this.namespaceId, datasetGroup.namespaceId) &&
        Objects.equals(this.namespaceName, datasetGroup.namespaceName) &&
        Objects.equals(this.isReplica, datasetGroup.isReplica) &&
        Objects.equals(this.engineId, datasetGroup.engineId) &&
        Objects.equals(this.engineName, datasetGroup.engineName) &&
        Objects.equals(this.namespace, datasetGroup.namespace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, namespaceId, namespaceName, isReplica, engineId, engineName, namespace);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatasetGroup {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespaceId: ").append(toIndentedString(namespaceId)).append("\n");
    sb.append("    namespaceName: ").append(toIndentedString(namespaceName)).append("\n");
    sb.append("    isReplica: ").append(toIndentedString(isReplica)).append("\n");
    sb.append("    engineId: ").append(toIndentedString(engineId)).append("\n");
    sb.append("    engineName: ").append(toIndentedString(engineName)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
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
    openapiFields.add("namespace_id");
    openapiFields.add("namespace_name");
    openapiFields.add("is_replica");
    openapiFields.add("engine_id");
    openapiFields.add("engine_name");
    openapiFields.add("namespace");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DatasetGroup
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DatasetGroup.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DatasetGroup is not found in the empty JSON string", DatasetGroup.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DatasetGroup.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DatasetGroup` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("namespace_id") != null && !jsonObj.get("namespace_id").isJsonNull()) && !jsonObj.get("namespace_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `namespace_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("namespace_id").toString()));
      }
      if ((jsonObj.get("namespace_name") != null && !jsonObj.get("namespace_name").isJsonNull()) && !jsonObj.get("namespace_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `namespace_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("namespace_name").toString()));
      }
      if ((jsonObj.get("engine_id") != null && !jsonObj.get("engine_id").isJsonNull()) && !jsonObj.get("engine_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `engine_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("engine_id").toString()));
      }
      if ((jsonObj.get("engine_name") != null && !jsonObj.get("engine_name").isJsonNull()) && !jsonObj.get("engine_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `engine_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("engine_name").toString()));
      }
      if ((jsonObj.get("namespace") != null && !jsonObj.get("namespace").isJsonNull()) && !jsonObj.get("namespace").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `namespace` to be a primitive type in the JSON string but got `%s`", jsonObj.get("namespace").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DatasetGroup.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DatasetGroup' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DatasetGroup> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DatasetGroup.class));

       return (TypeAdapter<T>) new TypeAdapter<DatasetGroup>() {
           @Override
           public void write(JsonWriter out, DatasetGroup value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DatasetGroup read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DatasetGroup given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DatasetGroup
  * @throws IOException if the JSON string is invalid with respect to DatasetGroup
  */
  public static DatasetGroup fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DatasetGroup.class);
  }

 /**
  * Convert an instance of DatasetGroup to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

