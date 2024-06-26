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
import com.delphix.dct.models.HyperscaleTaskEvent;
import com.delphix.dct.models.TaskEvent;
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
 * The execution of a masking or profile job.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-04T14:49:34.152994+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class Execution {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ENGINE_ID = "engine_id";
  @SerializedName(SERIALIZED_NAME_ENGINE_ID)
  private String engineId;

  public static final String SERIALIZED_NAME_HYPERSCALE_INSTANCE_ID = "hyperscale_instance_id";
  @SerializedName(SERIALIZED_NAME_HYPERSCALE_INSTANCE_ID)
  private String hyperscaleInstanceId;

  public static final String SERIALIZED_NAME_ENGINE_NAME = "engine_name";
  @SerializedName(SERIALIZED_NAME_ENGINE_NAME)
  private String engineName;

  public static final String SERIALIZED_NAME_MASKING_JOB_ID = "masking_job_id";
  @SerializedName(SERIALIZED_NAME_MASKING_JOB_ID)
  private String maskingJobId;

  public static final String SERIALIZED_NAME_MASKING_JOB_NAME = "masking_job_name";
  @SerializedName(SERIALIZED_NAME_MASKING_JOB_NAME)
  private String maskingJobName;

  public static final String SERIALIZED_NAME_SOURCE_CONNECTOR_ID = "source_connector_id";
  @SerializedName(SERIALIZED_NAME_SOURCE_CONNECTOR_ID)
  private String sourceConnectorId;

  public static final String SERIALIZED_NAME_TARGET_CONNECTOR_ID = "target_connector_id";
  @SerializedName(SERIALIZED_NAME_TARGET_CONNECTOR_ID)
  private String targetConnectorId;

  /**
   * The status of the execution regarding its completion.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    PENDING("PENDING"),
    
    QUEUED("QUEUED"),
    
    RUNNING("RUNNING"),
    
    CANCELLED("CANCELLED"),
    
    FAILED("FAILED"),
    
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

  public static final String SERIALIZED_NAME_ROWS_MASKED = "rows_masked";
  @SerializedName(SERIALIZED_NAME_ROWS_MASKED)
  private Long rowsMasked;

  public static final String SERIALIZED_NAME_ROWS_TOTAL = "rows_total";
  @SerializedName(SERIALIZED_NAME_ROWS_TOTAL)
  private Long rowsTotal;

  public static final String SERIALIZED_NAME_BYTES_PROCESSED = "bytes_processed";
  @SerializedName(SERIALIZED_NAME_BYTES_PROCESSED)
  private Long bytesProcessed;

  public static final String SERIALIZED_NAME_BYTES_TOTAL = "bytes_total";
  @SerializedName(SERIALIZED_NAME_BYTES_TOTAL)
  private Long bytesTotal;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private OffsetDateTime startTime;

  public static final String SERIALIZED_NAME_SUBMIT_TIME = "submit_time";
  @SerializedName(SERIALIZED_NAME_SUBMIT_TIME)
  private OffsetDateTime submitTime;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private OffsetDateTime endTime;

  public static final String SERIALIZED_NAME_TASK_EVENTS = "task_events";
  @SerializedName(SERIALIZED_NAME_TASK_EVENTS)
  private List<TaskEvent> taskEvents;

  public static final String SERIALIZED_NAME_HYPERSCALE_TASK_EVENTS = "hyperscale_task_events";
  @SerializedName(SERIALIZED_NAME_HYPERSCALE_TASK_EVENTS)
  private List<HyperscaleTaskEvent> hyperscaleTaskEvents;

  public static final String SERIALIZED_NAME_PROGRESS = "progress";
  @SerializedName(SERIALIZED_NAME_PROGRESS)
  private BigDecimal progress;

  public Execution() {
  }

  public Execution id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The Execution entity ID.
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public Execution engineId(String engineId) {
    this.engineId = engineId;
    return this;
  }

   /**
   * The ID of the engine where this execution ran.
   * @return engineId
  **/
  @javax.annotation.Nullable
  public String getEngineId() {
    return engineId;
  }

  public void setEngineId(String engineId) {
    this.engineId = engineId;
  }


  public Execution hyperscaleInstanceId(String hyperscaleInstanceId) {
    this.hyperscaleInstanceId = hyperscaleInstanceId;
    return this;
  }

   /**
   * Get hyperscaleInstanceId
   * @return hyperscaleInstanceId
  **/
  @javax.annotation.Nullable
  public String getHyperscaleInstanceId() {
    return hyperscaleInstanceId;
  }

  public void setHyperscaleInstanceId(String hyperscaleInstanceId) {
    this.hyperscaleInstanceId = hyperscaleInstanceId;
  }


  public Execution engineName(String engineName) {
    this.engineName = engineName;
    return this;
  }

   /**
   * The name of the engine where this execution ran.
   * @return engineName
  **/
  @javax.annotation.Nullable
  public String getEngineName() {
    return engineName;
  }

  public void setEngineName(String engineName) {
    this.engineName = engineName;
  }


  public Execution maskingJobId(String maskingJobId) {
    this.maskingJobId = maskingJobId;
    return this;
  }

   /**
   * The ID of the masking job that is being executed.
   * @return maskingJobId
  **/
  @javax.annotation.Nullable
  public String getMaskingJobId() {
    return maskingJobId;
  }

  public void setMaskingJobId(String maskingJobId) {
    this.maskingJobId = maskingJobId;
  }


  public Execution maskingJobName(String maskingJobName) {
    this.maskingJobName = maskingJobName;
    return this;
  }

   /**
   * The name of the masking job that is being executed.
   * @return maskingJobName
  **/
  @javax.annotation.Nullable
  public String getMaskingJobName() {
    return maskingJobName;
  }

  public void setMaskingJobName(String maskingJobName) {
    this.maskingJobName = maskingJobName;
  }


  public Execution sourceConnectorId(String sourceConnectorId) {
    this.sourceConnectorId = sourceConnectorId;
    return this;
  }

   /**
   * The ID of the source connector. This field is only used for multi-tenant jobs that are also on-the-fly.
   * @return sourceConnectorId
  **/
  @javax.annotation.Nullable
  public String getSourceConnectorId() {
    return sourceConnectorId;
  }

  public void setSourceConnectorId(String sourceConnectorId) {
    this.sourceConnectorId = sourceConnectorId;
  }


  public Execution targetConnectorId(String targetConnectorId) {
    this.targetConnectorId = targetConnectorId;
    return this;
  }

   /**
   * The ID of the target connector. This field is only used for multi-tenant jobs.
   * @return targetConnectorId
  **/
  @javax.annotation.Nullable
  public String getTargetConnectorId() {
    return targetConnectorId;
  }

  public void setTargetConnectorId(String targetConnectorId) {
    this.targetConnectorId = targetConnectorId;
  }


  public Execution status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the execution regarding its completion.
   * @return status
  **/
  @javax.annotation.Nullable
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public Execution rowsMasked(Long rowsMasked) {
    this.rowsMasked = rowsMasked;
    return this;
  }

   /**
   * The number of rows masked or profiled so far by this execution. This is not applicable for JSON file type.
   * @return rowsMasked
  **/
  @javax.annotation.Nullable
  public Long getRowsMasked() {
    return rowsMasked;
  }

  public void setRowsMasked(Long rowsMasked) {
    this.rowsMasked = rowsMasked;
  }


  public Execution rowsTotal(Long rowsTotal) {
    this.rowsTotal = rowsTotal;
    return this;
  }

   /**
   * The total number of rows that this execution should mask. This value is set to -1 while the total row count is being calculated. This is not applicable for JSON file type.
   * @return rowsTotal
  **/
  @javax.annotation.Nullable
  public Long getRowsTotal() {
    return rowsTotal;
  }

  public void setRowsTotal(Long rowsTotal) {
    this.rowsTotal = rowsTotal;
  }


  public Execution bytesProcessed(Long bytesProcessed) {
    this.bytesProcessed = bytesProcessed;
    return this;
  }

   /**
   * The number of bytes masked so far by this execution. This is only applicable for JSON file type.
   * @return bytesProcessed
  **/
  @javax.annotation.Nullable
  public Long getBytesProcessed() {
    return bytesProcessed;
  }

  public void setBytesProcessed(Long bytesProcessed) {
    this.bytesProcessed = bytesProcessed;
  }


  public Execution bytesTotal(Long bytesTotal) {
    this.bytesTotal = bytesTotal;
    return this;
  }

   /**
   * The total number of bytes that this execution should mask. This value is set to -1 while the total byte count is being calculated. This is only applicable for JSON file type.
   * @return bytesTotal
  **/
  @javax.annotation.Nullable
  public Long getBytesTotal() {
    return bytesTotal;
  }

  public void setBytesTotal(Long bytesTotal) {
    this.bytesTotal = bytesTotal;
  }


  public Execution startTime(OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * The date and time that this execution was started.
   * @return startTime
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }


  public Execution submitTime(OffsetDateTime submitTime) {
    this.submitTime = submitTime;
    return this;
  }

   /**
   * The date and time that this execution was submitted.
   * @return submitTime
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getSubmitTime() {
    return submitTime;
  }

  public void setSubmitTime(OffsetDateTime submitTime) {
    this.submitTime = submitTime;
  }


  public Execution endTime(OffsetDateTime endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * The date and time that this execution completed.
   * @return endTime
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getEndTime() {
    return endTime;
  }

  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }


  public Execution taskEvents(List<TaskEvent> taskEvents) {
    this.taskEvents = taskEvents;
    return this;
  }

  public Execution addTaskEventsItem(TaskEvent taskEventsItem) {
    if (this.taskEvents == null) {
      this.taskEvents = new ArrayList<>();
    }
    this.taskEvents.add(taskEventsItem);
    return this;
  }

   /**
   * The progression of steps or events performed by this execution. Only available for executions on masking engines that are version 6.0.14.0 and higher.
   * @return taskEvents
  **/
  @javax.annotation.Nullable
  public List<TaskEvent> getTaskEvents() {
    return taskEvents;
  }

  public void setTaskEvents(List<TaskEvent> taskEvents) {
    this.taskEvents = taskEvents;
  }


  public Execution hyperscaleTaskEvents(List<HyperscaleTaskEvent> hyperscaleTaskEvents) {
    this.hyperscaleTaskEvents = hyperscaleTaskEvents;
    return this;
  }

  public Execution addHyperscaleTaskEventsItem(HyperscaleTaskEvent hyperscaleTaskEventsItem) {
    if (this.hyperscaleTaskEvents == null) {
      this.hyperscaleTaskEvents = new ArrayList<>();
    }
    this.hyperscaleTaskEvents.add(hyperscaleTaskEventsItem);
    return this;
  }

   /**
   * Get hyperscaleTaskEvents
   * @return hyperscaleTaskEvents
  **/
  @javax.annotation.Nullable
  public List<HyperscaleTaskEvent> getHyperscaleTaskEvents() {
    return hyperscaleTaskEvents;
  }

  public void setHyperscaleTaskEvents(List<HyperscaleTaskEvent> hyperscaleTaskEvents) {
    this.hyperscaleTaskEvents = hyperscaleTaskEvents;
  }


  public Execution progress(BigDecimal progress) {
    this.progress = progress;
    return this;
  }

   /**
   * Progress of the task (value between 0 and 1, Hyperscale executions only)
   * @return progress
  **/
  @javax.annotation.Nullable
  public BigDecimal getProgress() {
    return progress;
  }

  public void setProgress(BigDecimal progress) {
    this.progress = progress;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Execution execution = (Execution) o;
    return Objects.equals(this.id, execution.id) &&
        Objects.equals(this.engineId, execution.engineId) &&
        Objects.equals(this.hyperscaleInstanceId, execution.hyperscaleInstanceId) &&
        Objects.equals(this.engineName, execution.engineName) &&
        Objects.equals(this.maskingJobId, execution.maskingJobId) &&
        Objects.equals(this.maskingJobName, execution.maskingJobName) &&
        Objects.equals(this.sourceConnectorId, execution.sourceConnectorId) &&
        Objects.equals(this.targetConnectorId, execution.targetConnectorId) &&
        Objects.equals(this.status, execution.status) &&
        Objects.equals(this.rowsMasked, execution.rowsMasked) &&
        Objects.equals(this.rowsTotal, execution.rowsTotal) &&
        Objects.equals(this.bytesProcessed, execution.bytesProcessed) &&
        Objects.equals(this.bytesTotal, execution.bytesTotal) &&
        Objects.equals(this.startTime, execution.startTime) &&
        Objects.equals(this.submitTime, execution.submitTime) &&
        Objects.equals(this.endTime, execution.endTime) &&
        Objects.equals(this.taskEvents, execution.taskEvents) &&
        Objects.equals(this.hyperscaleTaskEvents, execution.hyperscaleTaskEvents) &&
        Objects.equals(this.progress, execution.progress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, engineId, hyperscaleInstanceId, engineName, maskingJobId, maskingJobName, sourceConnectorId, targetConnectorId, status, rowsMasked, rowsTotal, bytesProcessed, bytesTotal, startTime, submitTime, endTime, taskEvents, hyperscaleTaskEvents, progress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Execution {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    engineId: ").append(toIndentedString(engineId)).append("\n");
    sb.append("    hyperscaleInstanceId: ").append(toIndentedString(hyperscaleInstanceId)).append("\n");
    sb.append("    engineName: ").append(toIndentedString(engineName)).append("\n");
    sb.append("    maskingJobId: ").append(toIndentedString(maskingJobId)).append("\n");
    sb.append("    maskingJobName: ").append(toIndentedString(maskingJobName)).append("\n");
    sb.append("    sourceConnectorId: ").append(toIndentedString(sourceConnectorId)).append("\n");
    sb.append("    targetConnectorId: ").append(toIndentedString(targetConnectorId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    rowsMasked: ").append(toIndentedString(rowsMasked)).append("\n");
    sb.append("    rowsTotal: ").append(toIndentedString(rowsTotal)).append("\n");
    sb.append("    bytesProcessed: ").append(toIndentedString(bytesProcessed)).append("\n");
    sb.append("    bytesTotal: ").append(toIndentedString(bytesTotal)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    submitTime: ").append(toIndentedString(submitTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    taskEvents: ").append(toIndentedString(taskEvents)).append("\n");
    sb.append("    hyperscaleTaskEvents: ").append(toIndentedString(hyperscaleTaskEvents)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
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
    openapiFields.add("engine_id");
    openapiFields.add("hyperscale_instance_id");
    openapiFields.add("engine_name");
    openapiFields.add("masking_job_id");
    openapiFields.add("masking_job_name");
    openapiFields.add("source_connector_id");
    openapiFields.add("target_connector_id");
    openapiFields.add("status");
    openapiFields.add("rows_masked");
    openapiFields.add("rows_total");
    openapiFields.add("bytes_processed");
    openapiFields.add("bytes_total");
    openapiFields.add("start_time");
    openapiFields.add("submit_time");
    openapiFields.add("end_time");
    openapiFields.add("task_events");
    openapiFields.add("hyperscale_task_events");
    openapiFields.add("progress");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Execution
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Execution.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Execution is not found in the empty JSON string", Execution.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Execution.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Execution` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("engine_id") != null && !jsonObj.get("engine_id").isJsonNull()) && !jsonObj.get("engine_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `engine_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("engine_id").toString()));
      }
      if ((jsonObj.get("hyperscale_instance_id") != null && !jsonObj.get("hyperscale_instance_id").isJsonNull()) && !jsonObj.get("hyperscale_instance_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hyperscale_instance_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hyperscale_instance_id").toString()));
      }
      if ((jsonObj.get("engine_name") != null && !jsonObj.get("engine_name").isJsonNull()) && !jsonObj.get("engine_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `engine_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("engine_name").toString()));
      }
      if ((jsonObj.get("masking_job_id") != null && !jsonObj.get("masking_job_id").isJsonNull()) && !jsonObj.get("masking_job_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `masking_job_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("masking_job_id").toString()));
      }
      if ((jsonObj.get("masking_job_name") != null && !jsonObj.get("masking_job_name").isJsonNull()) && !jsonObj.get("masking_job_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `masking_job_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("masking_job_name").toString()));
      }
      if ((jsonObj.get("source_connector_id") != null && !jsonObj.get("source_connector_id").isJsonNull()) && !jsonObj.get("source_connector_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source_connector_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source_connector_id").toString()));
      }
      if ((jsonObj.get("target_connector_id") != null && !jsonObj.get("target_connector_id").isJsonNull()) && !jsonObj.get("target_connector_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_connector_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_connector_id").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        StatusEnum.validateJsonElement(jsonObj.get("status"));
      }
      if (jsonObj.get("task_events") != null && !jsonObj.get("task_events").isJsonNull()) {
        JsonArray jsonArraytaskEvents = jsonObj.getAsJsonArray("task_events");
        if (jsonArraytaskEvents != null) {
          // ensure the json data is an array
          if (!jsonObj.get("task_events").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `task_events` to be an array in the JSON string but got `%s`", jsonObj.get("task_events").toString()));
          }

          // validate the optional field `task_events` (array)
          for (int i = 0; i < jsonArraytaskEvents.size(); i++) {
            TaskEvent.validateJsonElement(jsonArraytaskEvents.get(i));
          };
        }
      }
      if (jsonObj.get("hyperscale_task_events") != null && !jsonObj.get("hyperscale_task_events").isJsonNull()) {
        JsonArray jsonArrayhyperscaleTaskEvents = jsonObj.getAsJsonArray("hyperscale_task_events");
        if (jsonArrayhyperscaleTaskEvents != null) {
          // ensure the json data is an array
          if (!jsonObj.get("hyperscale_task_events").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `hyperscale_task_events` to be an array in the JSON string but got `%s`", jsonObj.get("hyperscale_task_events").toString()));
          }

          // validate the optional field `hyperscale_task_events` (array)
          for (int i = 0; i < jsonArrayhyperscaleTaskEvents.size(); i++) {
            HyperscaleTaskEvent.validateJsonElement(jsonArrayhyperscaleTaskEvents.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Execution.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Execution' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Execution> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Execution.class));

       return (TypeAdapter<T>) new TypeAdapter<Execution>() {
           @Override
           public void write(JsonWriter out, Execution value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Execution read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Execution given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Execution
  * @throws IOException if the JSON string is invalid with respect to Execution
  */
  public static Execution fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Execution.class);
  }

 /**
  * Convert an instance of Execution to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

