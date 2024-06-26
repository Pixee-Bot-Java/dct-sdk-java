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
 * UpdateRepositoryParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-04T14:49:34.152994+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class UpdateRepositoryParameters {
  /**
   * The database type of this repository.
   */
  @JsonAdapter(DatabaseTypeEnum.Adapter.class)
  public enum DatabaseTypeEnum {
    ORACLE("ORACLE"),
    
    MSSQL("MSSQL"),
    
    ASE("ASE"),
    
    APPDATA("APPDATA");

    private String value;

    DatabaseTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DatabaseTypeEnum fromValue(String value) {
      for (DatabaseTypeEnum b : DatabaseTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DatabaseTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DatabaseTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DatabaseTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DatabaseTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      DatabaseTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_DATABASE_TYPE = "database_type";
  @SerializedName(SERIALIZED_NAME_DATABASE_TYPE)
  private DatabaseTypeEnum databaseType;

  public static final String SERIALIZED_NAME_ALLOW_PROVISIONING = "allow_provisioning";
  @SerializedName(SERIALIZED_NAME_ALLOW_PROVISIONING)
  private Boolean allowProvisioning;

  public static final String SERIALIZED_NAME_IS_STAGING = "is_staging";
  @SerializedName(SERIALIZED_NAME_IS_STAGING)
  private Boolean isStaging;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public UpdateRepositoryParameters() {
  }

  public UpdateRepositoryParameters databaseType(DatabaseTypeEnum databaseType) {
    this.databaseType = databaseType;
    return this;
  }

   /**
   * The database type of this repository.
   * @return databaseType
  **/
  @javax.annotation.Nonnull
  public DatabaseTypeEnum getDatabaseType() {
    return databaseType;
  }

  public void setDatabaseType(DatabaseTypeEnum databaseType) {
    this.databaseType = databaseType;
  }


  public UpdateRepositoryParameters allowProvisioning(Boolean allowProvisioning) {
    this.allowProvisioning = allowProvisioning;
    return this;
  }

   /**
   * Flag indicating whether the repository should be used for provisioning.
   * @return allowProvisioning
  **/
  @javax.annotation.Nullable
  public Boolean getAllowProvisioning() {
    return allowProvisioning;
  }

  public void setAllowProvisioning(Boolean allowProvisioning) {
    this.allowProvisioning = allowProvisioning;
  }


  public UpdateRepositoryParameters isStaging(Boolean isStaging) {
    this.isStaging = isStaging;
    return this;
  }

   /**
   * Flag indicating whether this repository can be used by the Delphix Engine for internal processing.
   * @return isStaging
  **/
  @javax.annotation.Nullable
  public Boolean getIsStaging() {
    return isStaging;
  }

  public void setIsStaging(Boolean isStaging) {
    this.isStaging = isStaging;
  }


  public UpdateRepositoryParameters version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Version of the repository.
   * @return version
  **/
  @javax.annotation.Nullable
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateRepositoryParameters updateRepositoryParameters = (UpdateRepositoryParameters) o;
    return Objects.equals(this.databaseType, updateRepositoryParameters.databaseType) &&
        Objects.equals(this.allowProvisioning, updateRepositoryParameters.allowProvisioning) &&
        Objects.equals(this.isStaging, updateRepositoryParameters.isStaging) &&
        Objects.equals(this.version, updateRepositoryParameters.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(databaseType, allowProvisioning, isStaging, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateRepositoryParameters {\n");
    sb.append("    databaseType: ").append(toIndentedString(databaseType)).append("\n");
    sb.append("    allowProvisioning: ").append(toIndentedString(allowProvisioning)).append("\n");
    sb.append("    isStaging: ").append(toIndentedString(isStaging)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
    openapiFields.add("database_type");
    openapiFields.add("allow_provisioning");
    openapiFields.add("is_staging");
    openapiFields.add("version");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("database_type");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UpdateRepositoryParameters
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateRepositoryParameters.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateRepositoryParameters is not found in the empty JSON string", UpdateRepositoryParameters.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateRepositoryParameters.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateRepositoryParameters` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdateRepositoryParameters.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("database_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `database_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("database_type").toString()));
      }
      // validate the required field `database_type`
      DatabaseTypeEnum.validateJsonElement(jsonObj.get("database_type"));
      if ((jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull()) && !jsonObj.get("version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateRepositoryParameters.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateRepositoryParameters' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateRepositoryParameters> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateRepositoryParameters.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateRepositoryParameters>() {
           @Override
           public void write(JsonWriter out, UpdateRepositoryParameters value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateRepositoryParameters read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateRepositoryParameters given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateRepositoryParameters
  * @throws IOException if the JSON string is invalid with respect to UpdateRepositoryParameters
  */
  public static UpdateRepositoryParameters fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateRepositoryParameters.class);
  }

 /**
  * Convert an instance of UpdateRepositoryParameters to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

