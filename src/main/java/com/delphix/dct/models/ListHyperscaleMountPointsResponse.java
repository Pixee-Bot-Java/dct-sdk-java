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
import com.delphix.dct.models.HyperscaleMountPoint;
import com.delphix.dct.models.PaginatedResponseMetadata;
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
 * ListHyperscaleMountPointsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-04T14:49:34.152994+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class ListHyperscaleMountPointsResponse {
  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<HyperscaleMountPoint> items;

  public static final String SERIALIZED_NAME_RESPONSE_METADATA = "response_metadata";
  @SerializedName(SERIALIZED_NAME_RESPONSE_METADATA)
  private PaginatedResponseMetadata responseMetadata;

  public ListHyperscaleMountPointsResponse() {
  }

  public ListHyperscaleMountPointsResponse items(List<HyperscaleMountPoint> items) {
    this.items = items;
    return this;
  }

  public ListHyperscaleMountPointsResponse addItemsItem(HyperscaleMountPoint itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nullable
  public List<HyperscaleMountPoint> getItems() {
    return items;
  }

  public void setItems(List<HyperscaleMountPoint> items) {
    this.items = items;
  }


  public ListHyperscaleMountPointsResponse responseMetadata(PaginatedResponseMetadata responseMetadata) {
    this.responseMetadata = responseMetadata;
    return this;
  }

   /**
   * Get responseMetadata
   * @return responseMetadata
  **/
  @javax.annotation.Nullable
  public PaginatedResponseMetadata getResponseMetadata() {
    return responseMetadata;
  }

  public void setResponseMetadata(PaginatedResponseMetadata responseMetadata) {
    this.responseMetadata = responseMetadata;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListHyperscaleMountPointsResponse listHyperscaleMountPointsResponse = (ListHyperscaleMountPointsResponse) o;
    return Objects.equals(this.items, listHyperscaleMountPointsResponse.items) &&
        Objects.equals(this.responseMetadata, listHyperscaleMountPointsResponse.responseMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, responseMetadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListHyperscaleMountPointsResponse {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    responseMetadata: ").append(toIndentedString(responseMetadata)).append("\n");
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
    openapiFields.add("items");
    openapiFields.add("response_metadata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ListHyperscaleMountPointsResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ListHyperscaleMountPointsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListHyperscaleMountPointsResponse is not found in the empty JSON string", ListHyperscaleMountPointsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ListHyperscaleMountPointsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListHyperscaleMountPointsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("items") != null && !jsonObj.get("items").isJsonNull()) {
        JsonArray jsonArrayitems = jsonObj.getAsJsonArray("items");
        if (jsonArrayitems != null) {
          // ensure the json data is an array
          if (!jsonObj.get("items").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `items` to be an array in the JSON string but got `%s`", jsonObj.get("items").toString()));
          }

          // validate the optional field `items` (array)
          for (int i = 0; i < jsonArrayitems.size(); i++) {
            HyperscaleMountPoint.validateJsonElement(jsonArrayitems.get(i));
          };
        }
      }
      // validate the optional field `response_metadata`
      if (jsonObj.get("response_metadata") != null && !jsonObj.get("response_metadata").isJsonNull()) {
        PaginatedResponseMetadata.validateJsonElement(jsonObj.get("response_metadata"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListHyperscaleMountPointsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListHyperscaleMountPointsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListHyperscaleMountPointsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListHyperscaleMountPointsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ListHyperscaleMountPointsResponse>() {
           @Override
           public void write(JsonWriter out, ListHyperscaleMountPointsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListHyperscaleMountPointsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListHyperscaleMountPointsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListHyperscaleMountPointsResponse
  * @throws IOException if the JSON string is invalid with respect to ListHyperscaleMountPointsResponse
  */
  public static ListHyperscaleMountPointsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListHyperscaleMountPointsResponse.class);
  }

 /**
  * Convert an instance of ListHyperscaleMountPointsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
