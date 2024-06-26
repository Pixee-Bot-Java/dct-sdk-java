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
import com.delphix.dct.models.DSourceHooksOpsPreSyncInner;
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
 * DSource operation hooks.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-04T14:49:34.152994+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class DSourceHooks {
  public static final String SERIALIZED_NAME_OPS_PRE_SYNC = "ops_pre_sync";
  @SerializedName(SERIALIZED_NAME_OPS_PRE_SYNC)
  private List<DSourceHooksOpsPreSyncInner> opsPreSync;

  public static final String SERIALIZED_NAME_OPS_PRE_LOG_SYNC = "ops_pre_log_sync";
  @SerializedName(SERIALIZED_NAME_OPS_PRE_LOG_SYNC)
  private List<DSourceHooksOpsPreSyncInner> opsPreLogSync;

  public static final String SERIALIZED_NAME_OPS_POST_SYNC = "ops_post_sync";
  @SerializedName(SERIALIZED_NAME_OPS_POST_SYNC)
  private List<DSourceHooksOpsPreSyncInner> opsPostSync;

  public static final String SERIALIZED_NAME_PRE_VALIDATED_SYNC = "pre_validated_sync";
  @SerializedName(SERIALIZED_NAME_PRE_VALIDATED_SYNC)
  private List<DSourceHooksOpsPreSyncInner> preValidatedSync;

  public static final String SERIALIZED_NAME_POST_VALIDATED_SYNC = "post_validated_sync";
  @SerializedName(SERIALIZED_NAME_POST_VALIDATED_SYNC)
  private List<DSourceHooksOpsPreSyncInner> postValidatedSync;

  public DSourceHooks() {
  }

  public DSourceHooks opsPreSync(List<DSourceHooksOpsPreSyncInner> opsPreSync) {
    this.opsPreSync = opsPreSync;
    return this;
  }

  public DSourceHooks addOpsPreSyncItem(DSourceHooksOpsPreSyncInner opsPreSyncItem) {
    if (this.opsPreSync == null) {
      this.opsPreSync = new ArrayList<>();
    }
    this.opsPreSync.add(opsPreSyncItem);
    return this;
  }

   /**
   * The commands to execute before syncing with external data.
   * @return opsPreSync
  **/
  @javax.annotation.Nullable
  public List<DSourceHooksOpsPreSyncInner> getOpsPreSync() {
    return opsPreSync;
  }

  public void setOpsPreSync(List<DSourceHooksOpsPreSyncInner> opsPreSync) {
    this.opsPreSync = opsPreSync;
  }


  public DSourceHooks opsPreLogSync(List<DSourceHooksOpsPreSyncInner> opsPreLogSync) {
    this.opsPreLogSync = opsPreLogSync;
    return this;
  }

  public DSourceHooks addOpsPreLogSyncItem(DSourceHooksOpsPreSyncInner opsPreLogSyncItem) {
    if (this.opsPreLogSync == null) {
      this.opsPreLogSync = new ArrayList<>();
    }
    this.opsPreLogSync.add(opsPreLogSyncItem);
    return this;
  }

   /**
   * The commands to execute after syncing with external data and before running the LogSync.
   * @return opsPreLogSync
  **/
  @javax.annotation.Nullable
  public List<DSourceHooksOpsPreSyncInner> getOpsPreLogSync() {
    return opsPreLogSync;
  }

  public void setOpsPreLogSync(List<DSourceHooksOpsPreSyncInner> opsPreLogSync) {
    this.opsPreLogSync = opsPreLogSync;
  }


  public DSourceHooks opsPostSync(List<DSourceHooksOpsPreSyncInner> opsPostSync) {
    this.opsPostSync = opsPostSync;
    return this;
  }

  public DSourceHooks addOpsPostSyncItem(DSourceHooksOpsPreSyncInner opsPostSyncItem) {
    if (this.opsPostSync == null) {
      this.opsPostSync = new ArrayList<>();
    }
    this.opsPostSync.add(opsPostSyncItem);
    return this;
  }

   /**
   * The commands to execute after syncing a linked source.
   * @return opsPostSync
  **/
  @javax.annotation.Nullable
  public List<DSourceHooksOpsPreSyncInner> getOpsPostSync() {
    return opsPostSync;
  }

  public void setOpsPostSync(List<DSourceHooksOpsPreSyncInner> opsPostSync) {
    this.opsPostSync = opsPostSync;
  }


  public DSourceHooks preValidatedSync(List<DSourceHooksOpsPreSyncInner> preValidatedSync) {
    this.preValidatedSync = preValidatedSync;
    return this;
  }

  public DSourceHooks addPreValidatedSyncItem(DSourceHooksOpsPreSyncInner preValidatedSyncItem) {
    if (this.preValidatedSync == null) {
      this.preValidatedSync = new ArrayList<>();
    }
    this.preValidatedSync.add(preValidatedSyncItem);
    return this;
  }

   /**
   * The commands to execute on the staging source before performing a validated sync.
   * @return preValidatedSync
  **/
  @javax.annotation.Nullable
  public List<DSourceHooksOpsPreSyncInner> getPreValidatedSync() {
    return preValidatedSync;
  }

  public void setPreValidatedSync(List<DSourceHooksOpsPreSyncInner> preValidatedSync) {
    this.preValidatedSync = preValidatedSync;
  }


  public DSourceHooks postValidatedSync(List<DSourceHooksOpsPreSyncInner> postValidatedSync) {
    this.postValidatedSync = postValidatedSync;
    return this;
  }

  public DSourceHooks addPostValidatedSyncItem(DSourceHooksOpsPreSyncInner postValidatedSyncItem) {
    if (this.postValidatedSync == null) {
      this.postValidatedSync = new ArrayList<>();
    }
    this.postValidatedSync.add(postValidatedSyncItem);
    return this;
  }

   /**
   * The commands to execute on the staging source after performing a validated sync.
   * @return postValidatedSync
  **/
  @javax.annotation.Nullable
  public List<DSourceHooksOpsPreSyncInner> getPostValidatedSync() {
    return postValidatedSync;
  }

  public void setPostValidatedSync(List<DSourceHooksOpsPreSyncInner> postValidatedSync) {
    this.postValidatedSync = postValidatedSync;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DSourceHooks dsourceHooks = (DSourceHooks) o;
    return Objects.equals(this.opsPreSync, dsourceHooks.opsPreSync) &&
        Objects.equals(this.opsPreLogSync, dsourceHooks.opsPreLogSync) &&
        Objects.equals(this.opsPostSync, dsourceHooks.opsPostSync) &&
        Objects.equals(this.preValidatedSync, dsourceHooks.preValidatedSync) &&
        Objects.equals(this.postValidatedSync, dsourceHooks.postValidatedSync);
  }

  @Override
  public int hashCode() {
    return Objects.hash(opsPreSync, opsPreLogSync, opsPostSync, preValidatedSync, postValidatedSync);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DSourceHooks {\n");
    sb.append("    opsPreSync: ").append(toIndentedString(opsPreSync)).append("\n");
    sb.append("    opsPreLogSync: ").append(toIndentedString(opsPreLogSync)).append("\n");
    sb.append("    opsPostSync: ").append(toIndentedString(opsPostSync)).append("\n");
    sb.append("    preValidatedSync: ").append(toIndentedString(preValidatedSync)).append("\n");
    sb.append("    postValidatedSync: ").append(toIndentedString(postValidatedSync)).append("\n");
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
    openapiFields.add("ops_pre_sync");
    openapiFields.add("ops_pre_log_sync");
    openapiFields.add("ops_post_sync");
    openapiFields.add("pre_validated_sync");
    openapiFields.add("post_validated_sync");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DSourceHooks
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DSourceHooks.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DSourceHooks is not found in the empty JSON string", DSourceHooks.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DSourceHooks.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DSourceHooks` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("ops_pre_sync") != null && !jsonObj.get("ops_pre_sync").isJsonNull()) {
        JsonArray jsonArrayopsPreSync = jsonObj.getAsJsonArray("ops_pre_sync");
        if (jsonArrayopsPreSync != null) {
          // ensure the json data is an array
          if (!jsonObj.get("ops_pre_sync").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `ops_pre_sync` to be an array in the JSON string but got `%s`", jsonObj.get("ops_pre_sync").toString()));
          }

          // validate the optional field `ops_pre_sync` (array)
          for (int i = 0; i < jsonArrayopsPreSync.size(); i++) {
            DSourceHooksOpsPreSyncInner.validateJsonElement(jsonArrayopsPreSync.get(i));
          };
        }
      }
      if (jsonObj.get("ops_pre_log_sync") != null && !jsonObj.get("ops_pre_log_sync").isJsonNull()) {
        JsonArray jsonArrayopsPreLogSync = jsonObj.getAsJsonArray("ops_pre_log_sync");
        if (jsonArrayopsPreLogSync != null) {
          // ensure the json data is an array
          if (!jsonObj.get("ops_pre_log_sync").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `ops_pre_log_sync` to be an array in the JSON string but got `%s`", jsonObj.get("ops_pre_log_sync").toString()));
          }

          // validate the optional field `ops_pre_log_sync` (array)
          for (int i = 0; i < jsonArrayopsPreLogSync.size(); i++) {
            DSourceHooksOpsPreSyncInner.validateJsonElement(jsonArrayopsPreLogSync.get(i));
          };
        }
      }
      if (jsonObj.get("ops_post_sync") != null && !jsonObj.get("ops_post_sync").isJsonNull()) {
        JsonArray jsonArrayopsPostSync = jsonObj.getAsJsonArray("ops_post_sync");
        if (jsonArrayopsPostSync != null) {
          // ensure the json data is an array
          if (!jsonObj.get("ops_post_sync").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `ops_post_sync` to be an array in the JSON string but got `%s`", jsonObj.get("ops_post_sync").toString()));
          }

          // validate the optional field `ops_post_sync` (array)
          for (int i = 0; i < jsonArrayopsPostSync.size(); i++) {
            DSourceHooksOpsPreSyncInner.validateJsonElement(jsonArrayopsPostSync.get(i));
          };
        }
      }
      if (jsonObj.get("pre_validated_sync") != null && !jsonObj.get("pre_validated_sync").isJsonNull()) {
        JsonArray jsonArraypreValidatedSync = jsonObj.getAsJsonArray("pre_validated_sync");
        if (jsonArraypreValidatedSync != null) {
          // ensure the json data is an array
          if (!jsonObj.get("pre_validated_sync").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `pre_validated_sync` to be an array in the JSON string but got `%s`", jsonObj.get("pre_validated_sync").toString()));
          }

          // validate the optional field `pre_validated_sync` (array)
          for (int i = 0; i < jsonArraypreValidatedSync.size(); i++) {
            DSourceHooksOpsPreSyncInner.validateJsonElement(jsonArraypreValidatedSync.get(i));
          };
        }
      }
      if (jsonObj.get("post_validated_sync") != null && !jsonObj.get("post_validated_sync").isJsonNull()) {
        JsonArray jsonArraypostValidatedSync = jsonObj.getAsJsonArray("post_validated_sync");
        if (jsonArraypostValidatedSync != null) {
          // ensure the json data is an array
          if (!jsonObj.get("post_validated_sync").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `post_validated_sync` to be an array in the JSON string but got `%s`", jsonObj.get("post_validated_sync").toString()));
          }

          // validate the optional field `post_validated_sync` (array)
          for (int i = 0; i < jsonArraypostValidatedSync.size(); i++) {
            DSourceHooksOpsPreSyncInner.validateJsonElement(jsonArraypostValidatedSync.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DSourceHooks.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DSourceHooks' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DSourceHooks> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DSourceHooks.class));

       return (TypeAdapter<T>) new TypeAdapter<DSourceHooks>() {
           @Override
           public void write(JsonWriter out, DSourceHooks value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DSourceHooks read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DSourceHooks given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DSourceHooks
  * @throws IOException if the JSON string is invalid with respect to DSourceHooks
  */
  public static DSourceHooks fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DSourceHooks.class);
  }

 /**
  * Convert an instance of DSourceHooks to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

