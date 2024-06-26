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
import com.delphix.dct.models.CredentialsEnvVariable;
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
 * SourceOperation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-04T14:49:34.152994+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class SourceOperation {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_COMMAND = "command";
  @SerializedName(SERIALIZED_NAME_COMMAND)
  private String command;

  /**
   * Gets or Sets shell
   */
  @JsonAdapter(ShellEnum.Adapter.class)
  public enum ShellEnum {
    BASH("bash"),
    
    SHELL("shell"),
    
    EXPECT("expect"),
    
    PS("ps"),
    
    PSD("psd");

    private String value;

    ShellEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ShellEnum fromValue(String value) {
      for (ShellEnum b : ShellEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ShellEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ShellEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ShellEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ShellEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ShellEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_SHELL = "shell";
  @SerializedName(SERIALIZED_NAME_SHELL)
  private ShellEnum shell = ShellEnum.BASH;

  public static final String SERIALIZED_NAME_CREDENTIALS_ENV_VARS = "credentials_env_vars";
  @SerializedName(SERIALIZED_NAME_CREDENTIALS_ENV_VARS)
  private List<CredentialsEnvVariable> credentialsEnvVars;

  public SourceOperation() {
  }

  public SourceOperation name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public SourceOperation command(String command) {
    this.command = command;
    return this;
  }

   /**
   * Get command
   * @return command
  **/
  @javax.annotation.Nonnull
  public String getCommand() {
    return command;
  }

  public void setCommand(String command) {
    this.command = command;
  }


  public SourceOperation shell(ShellEnum shell) {
    this.shell = shell;
    return this;
  }

   /**
   * Get shell
   * @return shell
  **/
  @javax.annotation.Nullable
  public ShellEnum getShell() {
    return shell;
  }

  public void setShell(ShellEnum shell) {
    this.shell = shell;
  }


  public SourceOperation credentialsEnvVars(List<CredentialsEnvVariable> credentialsEnvVars) {
    this.credentialsEnvVars = credentialsEnvVars;
    return this;
  }

  public SourceOperation addCredentialsEnvVarsItem(CredentialsEnvVariable credentialsEnvVarsItem) {
    if (this.credentialsEnvVars == null) {
      this.credentialsEnvVars = new ArrayList<>();
    }
    this.credentialsEnvVars.add(credentialsEnvVarsItem);
    return this;
  }

   /**
   * List of environment variables that will contain credentials for this operation.
   * @return credentialsEnvVars
  **/
  @javax.annotation.Nullable
  public List<CredentialsEnvVariable> getCredentialsEnvVars() {
    return credentialsEnvVars;
  }

  public void setCredentialsEnvVars(List<CredentialsEnvVariable> credentialsEnvVars) {
    this.credentialsEnvVars = credentialsEnvVars;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SourceOperation sourceOperation = (SourceOperation) o;
    return Objects.equals(this.name, sourceOperation.name) &&
        Objects.equals(this.command, sourceOperation.command) &&
        Objects.equals(this.shell, sourceOperation.shell) &&
        Objects.equals(this.credentialsEnvVars, sourceOperation.credentialsEnvVars);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, command, shell, credentialsEnvVars);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SourceOperation {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    command: ").append(toIndentedString(command)).append("\n");
    sb.append("    shell: ").append(toIndentedString(shell)).append("\n");
    sb.append("    credentialsEnvVars: ").append(toIndentedString(credentialsEnvVars)).append("\n");
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
    openapiFields.add("command");
    openapiFields.add("shell");
    openapiFields.add("credentials_env_vars");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("command");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SourceOperation
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SourceOperation.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SourceOperation is not found in the empty JSON string", SourceOperation.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SourceOperation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SourceOperation` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SourceOperation.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("command").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `command` to be a primitive type in the JSON string but got `%s`", jsonObj.get("command").toString()));
      }
      if ((jsonObj.get("shell") != null && !jsonObj.get("shell").isJsonNull()) && !jsonObj.get("shell").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shell` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shell").toString()));
      }
      // validate the optional field `shell`
      if (jsonObj.get("shell") != null && !jsonObj.get("shell").isJsonNull()) {
        ShellEnum.validateJsonElement(jsonObj.get("shell"));
      }
      if (jsonObj.get("credentials_env_vars") != null && !jsonObj.get("credentials_env_vars").isJsonNull()) {
        JsonArray jsonArraycredentialsEnvVars = jsonObj.getAsJsonArray("credentials_env_vars");
        if (jsonArraycredentialsEnvVars != null) {
          // ensure the json data is an array
          if (!jsonObj.get("credentials_env_vars").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `credentials_env_vars` to be an array in the JSON string but got `%s`", jsonObj.get("credentials_env_vars").toString()));
          }

          // validate the optional field `credentials_env_vars` (array)
          for (int i = 0; i < jsonArraycredentialsEnvVars.size(); i++) {
            CredentialsEnvVariable.validateJsonElement(jsonArraycredentialsEnvVars.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SourceOperation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SourceOperation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SourceOperation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SourceOperation.class));

       return (TypeAdapter<T>) new TypeAdapter<SourceOperation>() {
           @Override
           public void write(JsonWriter out, SourceOperation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SourceOperation read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SourceOperation given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SourceOperation
  * @throws IOException if the JSON string is invalid with respect to SourceOperation
  */
  public static SourceOperation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SourceOperation.class);
  }

 /**
  * Convert an instance of SourceOperation to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

