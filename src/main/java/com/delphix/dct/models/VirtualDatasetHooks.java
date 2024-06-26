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
import com.delphix.dct.models.Hook;
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
 * VDB operation hooks.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-04T14:49:34.152994+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class VirtualDatasetHooks {
  public static final String SERIALIZED_NAME_PRE_REFRESH = "pre_refresh";
  @SerializedName(SERIALIZED_NAME_PRE_REFRESH)
  private List<Hook> preRefresh;

  public static final String SERIALIZED_NAME_POST_REFRESH = "post_refresh";
  @SerializedName(SERIALIZED_NAME_POST_REFRESH)
  private List<Hook> postRefresh;

  public static final String SERIALIZED_NAME_PRE_SELF_REFRESH = "pre_self_refresh";
  @SerializedName(SERIALIZED_NAME_PRE_SELF_REFRESH)
  private List<Hook> preSelfRefresh;

  public static final String SERIALIZED_NAME_POST_SELF_REFRESH = "post_self_refresh";
  @SerializedName(SERIALIZED_NAME_POST_SELF_REFRESH)
  private List<Hook> postSelfRefresh;

  public static final String SERIALIZED_NAME_PRE_ROLLBACK = "pre_rollback";
  @Deprecated
  @SerializedName(SERIALIZED_NAME_PRE_ROLLBACK)
  private List<Hook> preRollback;

  public static final String SERIALIZED_NAME_POST_ROLLBACK = "post_rollback";
  @Deprecated
  @SerializedName(SERIALIZED_NAME_POST_ROLLBACK)
  private List<Hook> postRollback;

  public static final String SERIALIZED_NAME_CONFIGURE_CLONE = "configure_clone";
  @SerializedName(SERIALIZED_NAME_CONFIGURE_CLONE)
  private List<Hook> configureClone;

  public static final String SERIALIZED_NAME_PRE_SNAPSHOT = "pre_snapshot";
  @SerializedName(SERIALIZED_NAME_PRE_SNAPSHOT)
  private List<Hook> preSnapshot;

  public static final String SERIALIZED_NAME_POST_SNAPSHOT = "post_snapshot";
  @SerializedName(SERIALIZED_NAME_POST_SNAPSHOT)
  private List<Hook> postSnapshot;

  public static final String SERIALIZED_NAME_PRE_START = "pre_start";
  @SerializedName(SERIALIZED_NAME_PRE_START)
  private List<Hook> preStart;

  public static final String SERIALIZED_NAME_POST_START = "post_start";
  @SerializedName(SERIALIZED_NAME_POST_START)
  private List<Hook> postStart;

  public static final String SERIALIZED_NAME_PRE_STOP = "pre_stop";
  @SerializedName(SERIALIZED_NAME_PRE_STOP)
  private List<Hook> preStop;

  public static final String SERIALIZED_NAME_POST_STOP = "post_stop";
  @SerializedName(SERIALIZED_NAME_POST_STOP)
  private List<Hook> postStop;

  public VirtualDatasetHooks() {
  }

  public VirtualDatasetHooks preRefresh(List<Hook> preRefresh) {
    this.preRefresh = preRefresh;
    return this;
  }

  public VirtualDatasetHooks addPreRefreshItem(Hook preRefreshItem) {
    if (this.preRefresh == null) {
      this.preRefresh = new ArrayList<>();
    }
    this.preRefresh.add(preRefreshItem);
    return this;
  }

   /**
   * The commands to execute on the target environment before refreshing the VDB.
   * @return preRefresh
  **/
  @javax.annotation.Nullable
  public List<Hook> getPreRefresh() {
    return preRefresh;
  }

  public void setPreRefresh(List<Hook> preRefresh) {
    this.preRefresh = preRefresh;
  }


  public VirtualDatasetHooks postRefresh(List<Hook> postRefresh) {
    this.postRefresh = postRefresh;
    return this;
  }

  public VirtualDatasetHooks addPostRefreshItem(Hook postRefreshItem) {
    if (this.postRefresh == null) {
      this.postRefresh = new ArrayList<>();
    }
    this.postRefresh.add(postRefreshItem);
    return this;
  }

   /**
   * The commands to execute on the target environment after refreshing the VDB.
   * @return postRefresh
  **/
  @javax.annotation.Nullable
  public List<Hook> getPostRefresh() {
    return postRefresh;
  }

  public void setPostRefresh(List<Hook> postRefresh) {
    this.postRefresh = postRefresh;
  }


  public VirtualDatasetHooks preSelfRefresh(List<Hook> preSelfRefresh) {
    this.preSelfRefresh = preSelfRefresh;
    return this;
  }

  public VirtualDatasetHooks addPreSelfRefreshItem(Hook preSelfRefreshItem) {
    if (this.preSelfRefresh == null) {
      this.preSelfRefresh = new ArrayList<>();
    }
    this.preSelfRefresh.add(preSelfRefreshItem);
    return this;
  }

   /**
   * The commands to execute on the target environment before refreshing the VDB with data from itself.
   * @return preSelfRefresh
  **/
  @javax.annotation.Nullable
  public List<Hook> getPreSelfRefresh() {
    return preSelfRefresh;
  }

  public void setPreSelfRefresh(List<Hook> preSelfRefresh) {
    this.preSelfRefresh = preSelfRefresh;
  }


  public VirtualDatasetHooks postSelfRefresh(List<Hook> postSelfRefresh) {
    this.postSelfRefresh = postSelfRefresh;
    return this;
  }

  public VirtualDatasetHooks addPostSelfRefreshItem(Hook postSelfRefreshItem) {
    if (this.postSelfRefresh == null) {
      this.postSelfRefresh = new ArrayList<>();
    }
    this.postSelfRefresh.add(postSelfRefreshItem);
    return this;
  }

   /**
   * The commands to execute on the target environment after refreshing the VDB with data from itself.
   * @return postSelfRefresh
  **/
  @javax.annotation.Nullable
  public List<Hook> getPostSelfRefresh() {
    return postSelfRefresh;
  }

  public void setPostSelfRefresh(List<Hook> postSelfRefresh) {
    this.postSelfRefresh = postSelfRefresh;
  }


  @Deprecated
  public VirtualDatasetHooks preRollback(List<Hook> preRollback) {
    this.preRollback = preRollback;
    return this;
  }

  public VirtualDatasetHooks addPreRollbackItem(Hook preRollbackItem) {
    if (this.preRollback == null) {
      this.preRollback = new ArrayList<>();
    }
    this.preRollback.add(preRollbackItem);
    return this;
  }

   /**
   * The commands to execute on the target environment before rewinding the VDB.
   * @return preRollback
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  public List<Hook> getPreRollback() {
    return preRollback;
  }

  @Deprecated
  public void setPreRollback(List<Hook> preRollback) {
    this.preRollback = preRollback;
  }


  @Deprecated
  public VirtualDatasetHooks postRollback(List<Hook> postRollback) {
    this.postRollback = postRollback;
    return this;
  }

  public VirtualDatasetHooks addPostRollbackItem(Hook postRollbackItem) {
    if (this.postRollback == null) {
      this.postRollback = new ArrayList<>();
    }
    this.postRollback.add(postRollbackItem);
    return this;
  }

   /**
   * The commands to execute on the target environment after rewinding the VDB.
   * @return postRollback
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  public List<Hook> getPostRollback() {
    return postRollback;
  }

  @Deprecated
  public void setPostRollback(List<Hook> postRollback) {
    this.postRollback = postRollback;
  }


  public VirtualDatasetHooks configureClone(List<Hook> configureClone) {
    this.configureClone = configureClone;
    return this;
  }

  public VirtualDatasetHooks addConfigureCloneItem(Hook configureCloneItem) {
    if (this.configureClone == null) {
      this.configureClone = new ArrayList<>();
    }
    this.configureClone.add(configureCloneItem);
    return this;
  }

   /**
   * The commands to execute on the target environment when the VDB is created or refreshed.
   * @return configureClone
  **/
  @javax.annotation.Nullable
  public List<Hook> getConfigureClone() {
    return configureClone;
  }

  public void setConfigureClone(List<Hook> configureClone) {
    this.configureClone = configureClone;
  }


  public VirtualDatasetHooks preSnapshot(List<Hook> preSnapshot) {
    this.preSnapshot = preSnapshot;
    return this;
  }

  public VirtualDatasetHooks addPreSnapshotItem(Hook preSnapshotItem) {
    if (this.preSnapshot == null) {
      this.preSnapshot = new ArrayList<>();
    }
    this.preSnapshot.add(preSnapshotItem);
    return this;
  }

   /**
   * The commands to execute on the target environment before snapshotting a virtual source. These commands can quiesce any data prior to snapshotting.
   * @return preSnapshot
  **/
  @javax.annotation.Nullable
  public List<Hook> getPreSnapshot() {
    return preSnapshot;
  }

  public void setPreSnapshot(List<Hook> preSnapshot) {
    this.preSnapshot = preSnapshot;
  }


  public VirtualDatasetHooks postSnapshot(List<Hook> postSnapshot) {
    this.postSnapshot = postSnapshot;
    return this;
  }

  public VirtualDatasetHooks addPostSnapshotItem(Hook postSnapshotItem) {
    if (this.postSnapshot == null) {
      this.postSnapshot = new ArrayList<>();
    }
    this.postSnapshot.add(postSnapshotItem);
    return this;
  }

   /**
   * The commands to execute on the target environment after snapshotting a virtual source.
   * @return postSnapshot
  **/
  @javax.annotation.Nullable
  public List<Hook> getPostSnapshot() {
    return postSnapshot;
  }

  public void setPostSnapshot(List<Hook> postSnapshot) {
    this.postSnapshot = postSnapshot;
  }


  public VirtualDatasetHooks preStart(List<Hook> preStart) {
    this.preStart = preStart;
    return this;
  }

  public VirtualDatasetHooks addPreStartItem(Hook preStartItem) {
    if (this.preStart == null) {
      this.preStart = new ArrayList<>();
    }
    this.preStart.add(preStartItem);
    return this;
  }

   /**
   * The commands to execute on the target environment before starting a virtual source.
   * @return preStart
  **/
  @javax.annotation.Nullable
  public List<Hook> getPreStart() {
    return preStart;
  }

  public void setPreStart(List<Hook> preStart) {
    this.preStart = preStart;
  }


  public VirtualDatasetHooks postStart(List<Hook> postStart) {
    this.postStart = postStart;
    return this;
  }

  public VirtualDatasetHooks addPostStartItem(Hook postStartItem) {
    if (this.postStart == null) {
      this.postStart = new ArrayList<>();
    }
    this.postStart.add(postStartItem);
    return this;
  }

   /**
   * The commands to execute on the target environment after starting a virtual source.
   * @return postStart
  **/
  @javax.annotation.Nullable
  public List<Hook> getPostStart() {
    return postStart;
  }

  public void setPostStart(List<Hook> postStart) {
    this.postStart = postStart;
  }


  public VirtualDatasetHooks preStop(List<Hook> preStop) {
    this.preStop = preStop;
    return this;
  }

  public VirtualDatasetHooks addPreStopItem(Hook preStopItem) {
    if (this.preStop == null) {
      this.preStop = new ArrayList<>();
    }
    this.preStop.add(preStopItem);
    return this;
  }

   /**
   * The commands to execute on the target environment before stopping a virtual source.
   * @return preStop
  **/
  @javax.annotation.Nullable
  public List<Hook> getPreStop() {
    return preStop;
  }

  public void setPreStop(List<Hook> preStop) {
    this.preStop = preStop;
  }


  public VirtualDatasetHooks postStop(List<Hook> postStop) {
    this.postStop = postStop;
    return this;
  }

  public VirtualDatasetHooks addPostStopItem(Hook postStopItem) {
    if (this.postStop == null) {
      this.postStop = new ArrayList<>();
    }
    this.postStop.add(postStopItem);
    return this;
  }

   /**
   * The commands to execute on the target environment after stopping a virtual source.
   * @return postStop
  **/
  @javax.annotation.Nullable
  public List<Hook> getPostStop() {
    return postStop;
  }

  public void setPostStop(List<Hook> postStop) {
    this.postStop = postStop;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VirtualDatasetHooks virtualDatasetHooks = (VirtualDatasetHooks) o;
    return Objects.equals(this.preRefresh, virtualDatasetHooks.preRefresh) &&
        Objects.equals(this.postRefresh, virtualDatasetHooks.postRefresh) &&
        Objects.equals(this.preSelfRefresh, virtualDatasetHooks.preSelfRefresh) &&
        Objects.equals(this.postSelfRefresh, virtualDatasetHooks.postSelfRefresh) &&
        Objects.equals(this.preRollback, virtualDatasetHooks.preRollback) &&
        Objects.equals(this.postRollback, virtualDatasetHooks.postRollback) &&
        Objects.equals(this.configureClone, virtualDatasetHooks.configureClone) &&
        Objects.equals(this.preSnapshot, virtualDatasetHooks.preSnapshot) &&
        Objects.equals(this.postSnapshot, virtualDatasetHooks.postSnapshot) &&
        Objects.equals(this.preStart, virtualDatasetHooks.preStart) &&
        Objects.equals(this.postStart, virtualDatasetHooks.postStart) &&
        Objects.equals(this.preStop, virtualDatasetHooks.preStop) &&
        Objects.equals(this.postStop, virtualDatasetHooks.postStop);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preRefresh, postRefresh, preSelfRefresh, postSelfRefresh, preRollback, postRollback, configureClone, preSnapshot, postSnapshot, preStart, postStart, preStop, postStop);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VirtualDatasetHooks {\n");
    sb.append("    preRefresh: ").append(toIndentedString(preRefresh)).append("\n");
    sb.append("    postRefresh: ").append(toIndentedString(postRefresh)).append("\n");
    sb.append("    preSelfRefresh: ").append(toIndentedString(preSelfRefresh)).append("\n");
    sb.append("    postSelfRefresh: ").append(toIndentedString(postSelfRefresh)).append("\n");
    sb.append("    preRollback: ").append(toIndentedString(preRollback)).append("\n");
    sb.append("    postRollback: ").append(toIndentedString(postRollback)).append("\n");
    sb.append("    configureClone: ").append(toIndentedString(configureClone)).append("\n");
    sb.append("    preSnapshot: ").append(toIndentedString(preSnapshot)).append("\n");
    sb.append("    postSnapshot: ").append(toIndentedString(postSnapshot)).append("\n");
    sb.append("    preStart: ").append(toIndentedString(preStart)).append("\n");
    sb.append("    postStart: ").append(toIndentedString(postStart)).append("\n");
    sb.append("    preStop: ").append(toIndentedString(preStop)).append("\n");
    sb.append("    postStop: ").append(toIndentedString(postStop)).append("\n");
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
    openapiFields.add("pre_refresh");
    openapiFields.add("post_refresh");
    openapiFields.add("pre_self_refresh");
    openapiFields.add("post_self_refresh");
    openapiFields.add("pre_rollback");
    openapiFields.add("post_rollback");
    openapiFields.add("configure_clone");
    openapiFields.add("pre_snapshot");
    openapiFields.add("post_snapshot");
    openapiFields.add("pre_start");
    openapiFields.add("post_start");
    openapiFields.add("pre_stop");
    openapiFields.add("post_stop");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to VirtualDatasetHooks
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!VirtualDatasetHooks.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VirtualDatasetHooks is not found in the empty JSON string", VirtualDatasetHooks.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!VirtualDatasetHooks.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VirtualDatasetHooks` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("pre_refresh") != null && !jsonObj.get("pre_refresh").isJsonNull()) {
        JsonArray jsonArraypreRefresh = jsonObj.getAsJsonArray("pre_refresh");
        if (jsonArraypreRefresh != null) {
          // ensure the json data is an array
          if (!jsonObj.get("pre_refresh").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `pre_refresh` to be an array in the JSON string but got `%s`", jsonObj.get("pre_refresh").toString()));
          }

          // validate the optional field `pre_refresh` (array)
          for (int i = 0; i < jsonArraypreRefresh.size(); i++) {
            Hook.validateJsonElement(jsonArraypreRefresh.get(i));
          };
        }
      }
      if (jsonObj.get("post_refresh") != null && !jsonObj.get("post_refresh").isJsonNull()) {
        JsonArray jsonArraypostRefresh = jsonObj.getAsJsonArray("post_refresh");
        if (jsonArraypostRefresh != null) {
          // ensure the json data is an array
          if (!jsonObj.get("post_refresh").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `post_refresh` to be an array in the JSON string but got `%s`", jsonObj.get("post_refresh").toString()));
          }

          // validate the optional field `post_refresh` (array)
          for (int i = 0; i < jsonArraypostRefresh.size(); i++) {
            Hook.validateJsonElement(jsonArraypostRefresh.get(i));
          };
        }
      }
      if (jsonObj.get("pre_self_refresh") != null && !jsonObj.get("pre_self_refresh").isJsonNull()) {
        JsonArray jsonArraypreSelfRefresh = jsonObj.getAsJsonArray("pre_self_refresh");
        if (jsonArraypreSelfRefresh != null) {
          // ensure the json data is an array
          if (!jsonObj.get("pre_self_refresh").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `pre_self_refresh` to be an array in the JSON string but got `%s`", jsonObj.get("pre_self_refresh").toString()));
          }

          // validate the optional field `pre_self_refresh` (array)
          for (int i = 0; i < jsonArraypreSelfRefresh.size(); i++) {
            Hook.validateJsonElement(jsonArraypreSelfRefresh.get(i));
          };
        }
      }
      if (jsonObj.get("post_self_refresh") != null && !jsonObj.get("post_self_refresh").isJsonNull()) {
        JsonArray jsonArraypostSelfRefresh = jsonObj.getAsJsonArray("post_self_refresh");
        if (jsonArraypostSelfRefresh != null) {
          // ensure the json data is an array
          if (!jsonObj.get("post_self_refresh").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `post_self_refresh` to be an array in the JSON string but got `%s`", jsonObj.get("post_self_refresh").toString()));
          }

          // validate the optional field `post_self_refresh` (array)
          for (int i = 0; i < jsonArraypostSelfRefresh.size(); i++) {
            Hook.validateJsonElement(jsonArraypostSelfRefresh.get(i));
          };
        }
      }
      if (jsonObj.get("pre_rollback") != null && !jsonObj.get("pre_rollback").isJsonNull()) {
        JsonArray jsonArraypreRollback = jsonObj.getAsJsonArray("pre_rollback");
        if (jsonArraypreRollback != null) {
          // ensure the json data is an array
          if (!jsonObj.get("pre_rollback").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `pre_rollback` to be an array in the JSON string but got `%s`", jsonObj.get("pre_rollback").toString()));
          }

          // validate the optional field `pre_rollback` (array)
          for (int i = 0; i < jsonArraypreRollback.size(); i++) {
            Hook.validateJsonElement(jsonArraypreRollback.get(i));
          };
        }
      }
      if (jsonObj.get("post_rollback") != null && !jsonObj.get("post_rollback").isJsonNull()) {
        JsonArray jsonArraypostRollback = jsonObj.getAsJsonArray("post_rollback");
        if (jsonArraypostRollback != null) {
          // ensure the json data is an array
          if (!jsonObj.get("post_rollback").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `post_rollback` to be an array in the JSON string but got `%s`", jsonObj.get("post_rollback").toString()));
          }

          // validate the optional field `post_rollback` (array)
          for (int i = 0; i < jsonArraypostRollback.size(); i++) {
            Hook.validateJsonElement(jsonArraypostRollback.get(i));
          };
        }
      }
      if (jsonObj.get("configure_clone") != null && !jsonObj.get("configure_clone").isJsonNull()) {
        JsonArray jsonArrayconfigureClone = jsonObj.getAsJsonArray("configure_clone");
        if (jsonArrayconfigureClone != null) {
          // ensure the json data is an array
          if (!jsonObj.get("configure_clone").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `configure_clone` to be an array in the JSON string but got `%s`", jsonObj.get("configure_clone").toString()));
          }

          // validate the optional field `configure_clone` (array)
          for (int i = 0; i < jsonArrayconfigureClone.size(); i++) {
            Hook.validateJsonElement(jsonArrayconfigureClone.get(i));
          };
        }
      }
      if (jsonObj.get("pre_snapshot") != null && !jsonObj.get("pre_snapshot").isJsonNull()) {
        JsonArray jsonArraypreSnapshot = jsonObj.getAsJsonArray("pre_snapshot");
        if (jsonArraypreSnapshot != null) {
          // ensure the json data is an array
          if (!jsonObj.get("pre_snapshot").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `pre_snapshot` to be an array in the JSON string but got `%s`", jsonObj.get("pre_snapshot").toString()));
          }

          // validate the optional field `pre_snapshot` (array)
          for (int i = 0; i < jsonArraypreSnapshot.size(); i++) {
            Hook.validateJsonElement(jsonArraypreSnapshot.get(i));
          };
        }
      }
      if (jsonObj.get("post_snapshot") != null && !jsonObj.get("post_snapshot").isJsonNull()) {
        JsonArray jsonArraypostSnapshot = jsonObj.getAsJsonArray("post_snapshot");
        if (jsonArraypostSnapshot != null) {
          // ensure the json data is an array
          if (!jsonObj.get("post_snapshot").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `post_snapshot` to be an array in the JSON string but got `%s`", jsonObj.get("post_snapshot").toString()));
          }

          // validate the optional field `post_snapshot` (array)
          for (int i = 0; i < jsonArraypostSnapshot.size(); i++) {
            Hook.validateJsonElement(jsonArraypostSnapshot.get(i));
          };
        }
      }
      if (jsonObj.get("pre_start") != null && !jsonObj.get("pre_start").isJsonNull()) {
        JsonArray jsonArraypreStart = jsonObj.getAsJsonArray("pre_start");
        if (jsonArraypreStart != null) {
          // ensure the json data is an array
          if (!jsonObj.get("pre_start").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `pre_start` to be an array in the JSON string but got `%s`", jsonObj.get("pre_start").toString()));
          }

          // validate the optional field `pre_start` (array)
          for (int i = 0; i < jsonArraypreStart.size(); i++) {
            Hook.validateJsonElement(jsonArraypreStart.get(i));
          };
        }
      }
      if (jsonObj.get("post_start") != null && !jsonObj.get("post_start").isJsonNull()) {
        JsonArray jsonArraypostStart = jsonObj.getAsJsonArray("post_start");
        if (jsonArraypostStart != null) {
          // ensure the json data is an array
          if (!jsonObj.get("post_start").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `post_start` to be an array in the JSON string but got `%s`", jsonObj.get("post_start").toString()));
          }

          // validate the optional field `post_start` (array)
          for (int i = 0; i < jsonArraypostStart.size(); i++) {
            Hook.validateJsonElement(jsonArraypostStart.get(i));
          };
        }
      }
      if (jsonObj.get("pre_stop") != null && !jsonObj.get("pre_stop").isJsonNull()) {
        JsonArray jsonArraypreStop = jsonObj.getAsJsonArray("pre_stop");
        if (jsonArraypreStop != null) {
          // ensure the json data is an array
          if (!jsonObj.get("pre_stop").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `pre_stop` to be an array in the JSON string but got `%s`", jsonObj.get("pre_stop").toString()));
          }

          // validate the optional field `pre_stop` (array)
          for (int i = 0; i < jsonArraypreStop.size(); i++) {
            Hook.validateJsonElement(jsonArraypreStop.get(i));
          };
        }
      }
      if (jsonObj.get("post_stop") != null && !jsonObj.get("post_stop").isJsonNull()) {
        JsonArray jsonArraypostStop = jsonObj.getAsJsonArray("post_stop");
        if (jsonArraypostStop != null) {
          // ensure the json data is an array
          if (!jsonObj.get("post_stop").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `post_stop` to be an array in the JSON string but got `%s`", jsonObj.get("post_stop").toString()));
          }

          // validate the optional field `post_stop` (array)
          for (int i = 0; i < jsonArraypostStop.size(); i++) {
            Hook.validateJsonElement(jsonArraypostStop.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VirtualDatasetHooks.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VirtualDatasetHooks' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VirtualDatasetHooks> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VirtualDatasetHooks.class));

       return (TypeAdapter<T>) new TypeAdapter<VirtualDatasetHooks>() {
           @Override
           public void write(JsonWriter out, VirtualDatasetHooks value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VirtualDatasetHooks read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VirtualDatasetHooks given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VirtualDatasetHooks
  * @throws IOException if the JSON string is invalid with respect to VirtualDatasetHooks
  */
  public static VirtualDatasetHooks fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VirtualDatasetHooks.class);
  }

 /**
  * Convert an instance of VirtualDatasetHooks to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

