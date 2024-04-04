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
import com.delphix.dct.models.HyperscaleTaskError;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
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
 * HyperscaleTaskEvent
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-03T12:02:33.321319+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class HyperscaleTaskEvent {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PROGRESS = "progress";
  @SerializedName(SERIALIZED_NAME_PROGRESS)
  private BigDecimal progress;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    CANCELLED("CANCELLED"),
    
    CANCEL_INITIATED("CANCEL_INITIATED"),
    
    FAILED("FAILED"),
    
    RUNNING("RUNNING"),
    
    SUCCEEDED("SUCCEEDED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      StatusEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_PROCESSED_OBJECTS = "processed_objects";
  @SerializedName(SERIALIZED_NAME_PROCESSED_OBJECTS)
  private Long processedObjects;

  public static final String SERIALIZED_NAME_PROCESSED_ROWS = "processed_rows";
  @SerializedName(SERIALIZED_NAME_PROCESSED_ROWS)
  private Long processedRows;

  public static final String SERIALIZED_NAME_PROCESSED_CONSTRAINTS = "processed_constraints";
  @SerializedName(SERIALIZED_NAME_PROCESSED_CONSTRAINTS)
  private Long processedConstraints;

  public static final String SERIALIZED_NAME_TOTAL_CONSTRAINTS = "total_constraints";
  @SerializedName(SERIALIZED_NAME_TOTAL_CONSTRAINTS)
  private Long totalConstraints;

  public static final String SERIALIZED_NAME_PROCESSED_INDEXES = "processed_indexes";
  @SerializedName(SERIALIZED_NAME_PROCESSED_INDEXES)
  private Long processedIndexes;

  public static final String SERIALIZED_NAME_TOTAL_INDEXES = "total_indexes";
  @SerializedName(SERIALIZED_NAME_TOTAL_INDEXES)
  private Long totalIndexes;

  public static final String SERIALIZED_NAME_PROCESSED_TRIGGERS = "processed_triggers";
  @SerializedName(SERIALIZED_NAME_PROCESSED_TRIGGERS)
  private Long processedTriggers;

  public static final String SERIALIZED_NAME_TOTAL_TRIGGERS = "total_triggers";
  @SerializedName(SERIALIZED_NAME_TOTAL_TRIGGERS)
  private Long totalTriggers;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private OffsetDateTime startTime;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private OffsetDateTime endTime;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<HyperscaleTaskError> errors;

  public HyperscaleTaskEvent() {
  }

  public HyperscaleTaskEvent name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the task (Unload, Masking, Load, Post-Load)
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public HyperscaleTaskEvent progress(BigDecimal progress) {
    this.progress = progress;
    return this;
  }

   /**
   * progress of the task (between 0 and 1)
   * @return progress
  **/
  @javax.annotation.Nullable
  public BigDecimal getProgress() {
    return progress;
  }

  public void setProgress(BigDecimal progress) {
    this.progress = progress;
  }


  public HyperscaleTaskEvent status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public HyperscaleTaskEvent processedObjects(Long processedObjects) {
    this.processedObjects = processedObjects;
    return this;
  }

   /**
   * The number of objects (tables) already processed by this task.
   * @return processedObjects
  **/
  @javax.annotation.Nullable
  public Long getProcessedObjects() {
    return processedObjects;
  }

  public void setProcessedObjects(Long processedObjects) {
    this.processedObjects = processedObjects;
  }


  public HyperscaleTaskEvent processedRows(Long processedRows) {
    this.processedRows = processedRows;
    return this;
  }

   /**
   * The number of rows already processed by this task.
   * @return processedRows
  **/
  @javax.annotation.Nullable
  public Long getProcessedRows() {
    return processedRows;
  }

  public void setProcessedRows(Long processedRows) {
    this.processedRows = processedRows;
  }


  public HyperscaleTaskEvent processedConstraints(Long processedConstraints) {
    this.processedConstraints = processedConstraints;
    return this;
  }

   /**
   * The number of constraints processed by this task (Post-load task only)
   * @return processedConstraints
  **/
  @javax.annotation.Nullable
  public Long getProcessedConstraints() {
    return processedConstraints;
  }

  public void setProcessedConstraints(Long processedConstraints) {
    this.processedConstraints = processedConstraints;
  }


  public HyperscaleTaskEvent totalConstraints(Long totalConstraints) {
    this.totalConstraints = totalConstraints;
    return this;
  }

   /**
   * The total number of constraints to be processed by this task (Post-load task only)
   * @return totalConstraints
  **/
  @javax.annotation.Nullable
  public Long getTotalConstraints() {
    return totalConstraints;
  }

  public void setTotalConstraints(Long totalConstraints) {
    this.totalConstraints = totalConstraints;
  }


  public HyperscaleTaskEvent processedIndexes(Long processedIndexes) {
    this.processedIndexes = processedIndexes;
    return this;
  }

   /**
   * The number of indexes processed by this task (Post-load task only)
   * @return processedIndexes
  **/
  @javax.annotation.Nullable
  public Long getProcessedIndexes() {
    return processedIndexes;
  }

  public void setProcessedIndexes(Long processedIndexes) {
    this.processedIndexes = processedIndexes;
  }


  public HyperscaleTaskEvent totalIndexes(Long totalIndexes) {
    this.totalIndexes = totalIndexes;
    return this;
  }

   /**
   * The total number of indexes to be processed by this task (Post-load task only)
   * @return totalIndexes
  **/
  @javax.annotation.Nullable
  public Long getTotalIndexes() {
    return totalIndexes;
  }

  public void setTotalIndexes(Long totalIndexes) {
    this.totalIndexes = totalIndexes;
  }


  public HyperscaleTaskEvent processedTriggers(Long processedTriggers) {
    this.processedTriggers = processedTriggers;
    return this;
  }

   /**
   * The number of triggered processed by this task (Post-load task only)
   * @return processedTriggers
  **/
  @javax.annotation.Nullable
  public Long getProcessedTriggers() {
    return processedTriggers;
  }

  public void setProcessedTriggers(Long processedTriggers) {
    this.processedTriggers = processedTriggers;
  }


  public HyperscaleTaskEvent totalTriggers(Long totalTriggers) {
    this.totalTriggers = totalTriggers;
    return this;
  }

   /**
   * The total number of triggers to be processed by this task (Post-load task only)
   * @return totalTriggers
  **/
  @javax.annotation.Nullable
  public Long getTotalTriggers() {
    return totalTriggers;
  }

  public void setTotalTriggers(Long totalTriggers) {
    this.totalTriggers = totalTriggers;
  }


  public HyperscaleTaskEvent startTime(OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * The date and time that this task was started.
   * @return startTime
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }


  public HyperscaleTaskEvent endTime(OffsetDateTime endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * The date and time that this task completed.
   * @return endTime
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getEndTime() {
    return endTime;
  }

  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }


  public HyperscaleTaskEvent errors(List<HyperscaleTaskError> errors) {
    this.errors = errors;
    return this;
  }

  public HyperscaleTaskEvent addErrorsItem(HyperscaleTaskError errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @javax.annotation.Nullable
  public List<HyperscaleTaskError> getErrors() {
    return errors;
  }

  public void setErrors(List<HyperscaleTaskError> errors) {
    this.errors = errors;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HyperscaleTaskEvent hyperscaleTaskEvent = (HyperscaleTaskEvent) o;
    return Objects.equals(this.name, hyperscaleTaskEvent.name) &&
        Objects.equals(this.progress, hyperscaleTaskEvent.progress) &&
        Objects.equals(this.status, hyperscaleTaskEvent.status) &&
        Objects.equals(this.processedObjects, hyperscaleTaskEvent.processedObjects) &&
        Objects.equals(this.processedRows, hyperscaleTaskEvent.processedRows) &&
        Objects.equals(this.processedConstraints, hyperscaleTaskEvent.processedConstraints) &&
        Objects.equals(this.totalConstraints, hyperscaleTaskEvent.totalConstraints) &&
        Objects.equals(this.processedIndexes, hyperscaleTaskEvent.processedIndexes) &&
        Objects.equals(this.totalIndexes, hyperscaleTaskEvent.totalIndexes) &&
        Objects.equals(this.processedTriggers, hyperscaleTaskEvent.processedTriggers) &&
        Objects.equals(this.totalTriggers, hyperscaleTaskEvent.totalTriggers) &&
        Objects.equals(this.startTime, hyperscaleTaskEvent.startTime) &&
        Objects.equals(this.endTime, hyperscaleTaskEvent.endTime) &&
        Objects.equals(this.errors, hyperscaleTaskEvent.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, progress, status, processedObjects, processedRows, processedConstraints, totalConstraints, processedIndexes, totalIndexes, processedTriggers, totalTriggers, startTime, endTime, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HyperscaleTaskEvent {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    processedObjects: ").append(toIndentedString(processedObjects)).append("\n");
    sb.append("    processedRows: ").append(toIndentedString(processedRows)).append("\n");
    sb.append("    processedConstraints: ").append(toIndentedString(processedConstraints)).append("\n");
    sb.append("    totalConstraints: ").append(toIndentedString(totalConstraints)).append("\n");
    sb.append("    processedIndexes: ").append(toIndentedString(processedIndexes)).append("\n");
    sb.append("    totalIndexes: ").append(toIndentedString(totalIndexes)).append("\n");
    sb.append("    processedTriggers: ").append(toIndentedString(processedTriggers)).append("\n");
    sb.append("    totalTriggers: ").append(toIndentedString(totalTriggers)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
    openapiFields.add("progress");
    openapiFields.add("status");
    openapiFields.add("processed_objects");
    openapiFields.add("processed_rows");
    openapiFields.add("processed_constraints");
    openapiFields.add("total_constraints");
    openapiFields.add("processed_indexes");
    openapiFields.add("total_indexes");
    openapiFields.add("processed_triggers");
    openapiFields.add("total_triggers");
    openapiFields.add("start_time");
    openapiFields.add("end_time");
    openapiFields.add("errors");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to HyperscaleTaskEvent
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!HyperscaleTaskEvent.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in HyperscaleTaskEvent is not found in the empty JSON string", HyperscaleTaskEvent.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!HyperscaleTaskEvent.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `HyperscaleTaskEvent` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        StatusEnum.validateJsonElement(jsonObj.get("status"));
      }
      if (jsonObj.get("errors") != null && !jsonObj.get("errors").isJsonNull()) {
        JsonArray jsonArrayerrors = jsonObj.getAsJsonArray("errors");
        if (jsonArrayerrors != null) {
          // ensure the json data is an array
          if (!jsonObj.get("errors").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `errors` to be an array in the JSON string but got `%s`", jsonObj.get("errors").toString()));
          }

          // validate the optional field `errors` (array)
          for (int i = 0; i < jsonArrayerrors.size(); i++) {
            HyperscaleTaskError.validateJsonElement(jsonArrayerrors.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!HyperscaleTaskEvent.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'HyperscaleTaskEvent' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<HyperscaleTaskEvent> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(HyperscaleTaskEvent.class));

       return (TypeAdapter<T>) new TypeAdapter<HyperscaleTaskEvent>() {
           @Override
           public void write(JsonWriter out, HyperscaleTaskEvent value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public HyperscaleTaskEvent read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of HyperscaleTaskEvent given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of HyperscaleTaskEvent
  * @throws IOException if the JSON string is invalid with respect to HyperscaleTaskEvent
  */
  public static HyperscaleTaskEvent fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, HyperscaleTaskEvent.class);
  }

 /**
  * Convert an instance of HyperscaleTaskEvent to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

