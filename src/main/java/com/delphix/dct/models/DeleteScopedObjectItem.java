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
import com.delphix.dct.models.ScopedObjectItem;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

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
 * DeleteScopedObjectItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-03T12:02:33.321319+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class DeleteScopedObjectItem {
  public static final String SERIALIZED_NAME_OBJECTS = "objects";
  @SerializedName(SERIALIZED_NAME_OBJECTS)
  private Set<ScopedObjectItem> objects = new LinkedHashSet<>();

  public DeleteScopedObjectItem() {
  }

  public DeleteScopedObjectItem objects(Set<ScopedObjectItem> objects) {
    this.objects = objects;
    return this;
  }

  public DeleteScopedObjectItem addObjectsItem(ScopedObjectItem objectsItem) {
    if (this.objects == null) {
      this.objects = new LinkedHashSet<>();
    }
    this.objects.add(objectsItem);
    return this;
  }

   /**
   * List of scoped objects to be deleted
   * @return objects
  **/
  @javax.annotation.Nonnull
  public Set<ScopedObjectItem> getObjects() {
    return objects;
  }

  public void setObjects(Set<ScopedObjectItem> objects) {
    this.objects = objects;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteScopedObjectItem deleteScopedObjectItem = (DeleteScopedObjectItem) o;
    return Objects.equals(this.objects, deleteScopedObjectItem.objects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objects);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteScopedObjectItem {\n");
    sb.append("    objects: ").append(toIndentedString(objects)).append("\n");
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
    openapiFields.add("objects");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("objects");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DeleteScopedObjectItem
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DeleteScopedObjectItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DeleteScopedObjectItem is not found in the empty JSON string", DeleteScopedObjectItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DeleteScopedObjectItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DeleteScopedObjectItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DeleteScopedObjectItem.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("objects").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `objects` to be an array in the JSON string but got `%s`", jsonObj.get("objects").toString()));
      }

      JsonArray jsonArrayobjects = jsonObj.getAsJsonArray("objects");
      // validate the required field `objects` (array)
      for (int i = 0; i < jsonArrayobjects.size(); i++) {
        ScopedObjectItem.validateJsonElement(jsonArrayobjects.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DeleteScopedObjectItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DeleteScopedObjectItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DeleteScopedObjectItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DeleteScopedObjectItem.class));

       return (TypeAdapter<T>) new TypeAdapter<DeleteScopedObjectItem>() {
           @Override
           public void write(JsonWriter out, DeleteScopedObjectItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DeleteScopedObjectItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DeleteScopedObjectItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DeleteScopedObjectItem
  * @throws IOException if the JSON string is invalid with respect to DeleteScopedObjectItem
  */
  public static DeleteScopedObjectItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeleteScopedObjectItem.class);
  }

 /**
  * Convert an instance of DeleteScopedObjectItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

