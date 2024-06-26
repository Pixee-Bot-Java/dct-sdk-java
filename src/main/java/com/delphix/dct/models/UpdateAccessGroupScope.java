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
 * An Access group scope parameters that are allowed to update.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-04T14:49:34.152994+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class UpdateAccessGroupScope {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * Specifies the type of the scope. Scope of type SIMPLE would grant access to all DCT objects. Scope of type SCOPED would grant access to all objects based on objects and object-tags and permissions defined in linked role. Scope of type ADVANCED would grant access to DCT objects based on objects and object-tags and the individual permissions.
   */
  @JsonAdapter(ScopeTypeEnum.Adapter.class)
  public enum ScopeTypeEnum {
    SIMPLE("SIMPLE"),
    
    SCOPED("SCOPED"),
    
    ADVANCED("ADVANCED");

    private String value;

    ScopeTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ScopeTypeEnum fromValue(String value) {
      for (ScopeTypeEnum b : ScopeTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ScopeTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ScopeTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ScopeTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ScopeTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ScopeTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_SCOPE_TYPE = "scope_type";
  @SerializedName(SERIALIZED_NAME_SCOPE_TYPE)
  private ScopeTypeEnum scopeType;

  public UpdateAccessGroupScope() {
  }

  public UpdateAccessGroupScope name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The Access group scope name.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public UpdateAccessGroupScope scopeType(ScopeTypeEnum scopeType) {
    this.scopeType = scopeType;
    return this;
  }

   /**
   * Specifies the type of the scope. Scope of type SIMPLE would grant access to all DCT objects. Scope of type SCOPED would grant access to all objects based on objects and object-tags and permissions defined in linked role. Scope of type ADVANCED would grant access to DCT objects based on objects and object-tags and the individual permissions.
   * @return scopeType
  **/
  @javax.annotation.Nullable
  public ScopeTypeEnum getScopeType() {
    return scopeType;
  }

  public void setScopeType(ScopeTypeEnum scopeType) {
    this.scopeType = scopeType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateAccessGroupScope updateAccessGroupScope = (UpdateAccessGroupScope) o;
    return Objects.equals(this.name, updateAccessGroupScope.name) &&
        Objects.equals(this.scopeType, updateAccessGroupScope.scopeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, scopeType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAccessGroupScope {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    scopeType: ").append(toIndentedString(scopeType)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("scope_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UpdateAccessGroupScope
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateAccessGroupScope.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateAccessGroupScope is not found in the empty JSON string", UpdateAccessGroupScope.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateAccessGroupScope.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateAccessGroupScope` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("scope_type") != null && !jsonObj.get("scope_type").isJsonNull()) && !jsonObj.get("scope_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scope_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scope_type").toString()));
      }
      // validate the optional field `scope_type`
      if (jsonObj.get("scope_type") != null && !jsonObj.get("scope_type").isJsonNull()) {
        ScopeTypeEnum.validateJsonElement(jsonObj.get("scope_type"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateAccessGroupScope.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateAccessGroupScope' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateAccessGroupScope> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateAccessGroupScope.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateAccessGroupScope>() {
           @Override
           public void write(JsonWriter out, UpdateAccessGroupScope value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateAccessGroupScope read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateAccessGroupScope given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateAccessGroupScope
  * @throws IOException if the JSON string is invalid with respect to UpdateAccessGroupScope
  */
  public static UpdateAccessGroupScope fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateAccessGroupScope.class);
  }

 /**
  * Convert an instance of UpdateAccessGroupScope to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

