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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * ScopedObjectItemsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-04T14:49:34.152994+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class ScopedObjectItemsResponse {
  public static final String SERIALIZED_NAME_OBJECTS = "objects";
  @SerializedName(SERIALIZED_NAME_OBJECTS)
  private List<ScopedObjectItem> objects;

  public ScopedObjectItemsResponse() {
  }

  public ScopedObjectItemsResponse objects(List<ScopedObjectItem> objects) {
    this.objects = objects;
    return this;
  }

  public ScopedObjectItemsResponse addObjectsItem(ScopedObjectItem objectsItem) {
    if (this.objects == null) {
      this.objects = new ArrayList<>();
    }
    this.objects.add(objectsItem);
    return this;
  }

   /**
   * Array of access group scope objects with object id and object type
   * @return objects
  **/
  @javax.annotation.Nullable
  public List<ScopedObjectItem> getObjects() {
    return objects;
  }

  public void setObjects(List<ScopedObjectItem> objects) {
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
    ScopedObjectItemsResponse scopedObjectItemsResponse = (ScopedObjectItemsResponse) o;
    return Objects.equals(this.objects, scopedObjectItemsResponse.objects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objects);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScopedObjectItemsResponse {\n");
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
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ScopedObjectItemsResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ScopedObjectItemsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ScopedObjectItemsResponse is not found in the empty JSON string", ScopedObjectItemsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ScopedObjectItemsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ScopedObjectItemsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("objects") != null && !jsonObj.get("objects").isJsonNull()) {
        JsonArray jsonArrayobjects = jsonObj.getAsJsonArray("objects");
        if (jsonArrayobjects != null) {
          // ensure the json data is an array
          if (!jsonObj.get("objects").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `objects` to be an array in the JSON string but got `%s`", jsonObj.get("objects").toString()));
          }

          // validate the optional field `objects` (array)
          for (int i = 0; i < jsonArrayobjects.size(); i++) {
            ScopedObjectItem.validateJsonElement(jsonArrayobjects.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ScopedObjectItemsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ScopedObjectItemsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ScopedObjectItemsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ScopedObjectItemsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ScopedObjectItemsResponse>() {
           @Override
           public void write(JsonWriter out, ScopedObjectItemsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ScopedObjectItemsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ScopedObjectItemsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ScopedObjectItemsResponse
  * @throws IOException if the JSON string is invalid with respect to ScopedObjectItemsResponse
  */
  public static ScopedObjectItemsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ScopedObjectItemsResponse.class);
  }

 /**
  * Convert an instance of ScopedObjectItemsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

