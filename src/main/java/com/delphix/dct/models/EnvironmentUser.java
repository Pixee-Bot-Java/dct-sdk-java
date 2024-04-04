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
 * EnvironmentUser
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-04T14:49:34.152994+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class EnvironmentUser {
  public static final String SERIALIZED_NAME_USER_REF = "user_ref";
  @SerializedName(SERIALIZED_NAME_USER_REF)
  private String userRef;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_PRIMARY_USER = "primary_user";
  @SerializedName(SERIALIZED_NAME_PRIMARY_USER)
  private Boolean primaryUser;

  /**
   * Authentication type of this user. PasswordCredential indicates username and password are used, SystemKeyCredential indicates public key based security credential, KeyPairCredential indicates public key based security credential consisting of a user specified key pair, KerberosCredential indicates Kerberos authentication, CyberArkVaultCredential indicates CyberArk Vault is used and HashiCorpVaultCredential indicates that Hashicorp vault is used for authentication
   */
  @JsonAdapter(AuthTypeEnum.Adapter.class)
  public enum AuthTypeEnum {
    PASSWORDCREDENTIAL("PasswordCredential"),
    
    SYSTEMKEYCREDENTIAL("SystemKeyCredential"),
    
    KEYPAIRCREDENTIAL("KeyPairCredential"),
    
    KERBEROSCREDENTIAL("KerberosCredential"),
    
    CYBERARKVAULTCREDENTIAL("CyberArkVaultCredential"),
    
    HASHICORPVAULTCREDENTIAL("HashiCorpVaultCredential");

    private String value;

    AuthTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AuthTypeEnum fromValue(String value) {
      for (AuthTypeEnum b : AuthTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AuthTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AuthTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AuthTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AuthTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      AuthTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_AUTH_TYPE = "auth_type";
  @SerializedName(SERIALIZED_NAME_AUTH_TYPE)
  private AuthTypeEnum authType;

  public EnvironmentUser() {
  }

  public EnvironmentUser userRef(String userRef) {
    this.userRef = userRef;
    return this;
  }

   /**
   * Environment user reference
   * @return userRef
  **/
  @javax.annotation.Nullable
  public String getUserRef() {
    return userRef;
  }

  public void setUserRef(String userRef) {
    this.userRef = userRef;
  }


  public EnvironmentUser username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Username of environment user
   * @return username
  **/
  @javax.annotation.Nullable
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public EnvironmentUser primaryUser(Boolean primaryUser) {
    this.primaryUser = primaryUser;
    return this;
  }

   /**
   * This indicates if this user is primary or not
   * @return primaryUser
  **/
  @javax.annotation.Nullable
  public Boolean getPrimaryUser() {
    return primaryUser;
  }

  public void setPrimaryUser(Boolean primaryUser) {
    this.primaryUser = primaryUser;
  }


  public EnvironmentUser authType(AuthTypeEnum authType) {
    this.authType = authType;
    return this;
  }

   /**
   * Authentication type of this user. PasswordCredential indicates username and password are used, SystemKeyCredential indicates public key based security credential, KeyPairCredential indicates public key based security credential consisting of a user specified key pair, KerberosCredential indicates Kerberos authentication, CyberArkVaultCredential indicates CyberArk Vault is used and HashiCorpVaultCredential indicates that Hashicorp vault is used for authentication
   * @return authType
  **/
  @javax.annotation.Nullable
  public AuthTypeEnum getAuthType() {
    return authType;
  }

  public void setAuthType(AuthTypeEnum authType) {
    this.authType = authType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvironmentUser environmentUser = (EnvironmentUser) o;
    return Objects.equals(this.userRef, environmentUser.userRef) &&
        Objects.equals(this.username, environmentUser.username) &&
        Objects.equals(this.primaryUser, environmentUser.primaryUser) &&
        Objects.equals(this.authType, environmentUser.authType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userRef, username, primaryUser, authType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvironmentUser {\n");
    sb.append("    userRef: ").append(toIndentedString(userRef)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    primaryUser: ").append(toIndentedString(primaryUser)).append("\n");
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
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
    openapiFields.add("user_ref");
    openapiFields.add("username");
    openapiFields.add("primary_user");
    openapiFields.add("auth_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EnvironmentUser
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EnvironmentUser.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EnvironmentUser is not found in the empty JSON string", EnvironmentUser.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EnvironmentUser.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EnvironmentUser` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("user_ref") != null && !jsonObj.get("user_ref").isJsonNull()) && !jsonObj.get("user_ref").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_ref` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_ref").toString()));
      }
      if ((jsonObj.get("username") != null && !jsonObj.get("username").isJsonNull()) && !jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
      if ((jsonObj.get("auth_type") != null && !jsonObj.get("auth_type").isJsonNull()) && !jsonObj.get("auth_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `auth_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("auth_type").toString()));
      }
      // validate the optional field `auth_type`
      if (jsonObj.get("auth_type") != null && !jsonObj.get("auth_type").isJsonNull()) {
        AuthTypeEnum.validateJsonElement(jsonObj.get("auth_type"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EnvironmentUser.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EnvironmentUser' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EnvironmentUser> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EnvironmentUser.class));

       return (TypeAdapter<T>) new TypeAdapter<EnvironmentUser>() {
           @Override
           public void write(JsonWriter out, EnvironmentUser value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EnvironmentUser read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EnvironmentUser given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EnvironmentUser
  * @throws IOException if the JSON string is invalid with respect to EnvironmentUser
  */
  public static EnvironmentUser fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EnvironmentUser.class);
  }

 /**
  * Convert an instance of EnvironmentUser to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
