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
 * AccountUpdateParameter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-04T14:49:34.152994+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class AccountUpdateParameter {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_API_CLIENT_ID = "api_client_id";
  @SerializedName(SERIALIZED_NAME_API_CLIENT_ID)
  private String apiClientId;

  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_LDAP_PRINCIPAL = "ldap_principal";
  @SerializedName(SERIALIZED_NAME_LDAP_PRINCIPAL)
  private String ldapPrincipal;

  public AccountUpdateParameter() {
  }

  public AccountUpdateParameter(
     Long id
  ) {
    this();
    this.id = id;
  }

   /**
   * Numeric ID of the Account.
   * @return id
  **/
  @javax.annotation.Nullable
  public Long getId() {
    return id;
  }



  public AccountUpdateParameter apiClientId(String apiClientId) {
    this.apiClientId = apiClientId;
    return this;
  }

   /**
   * The unique ID which is used to identify the identity of an API request. The web server (nginx) configuration must be configured so as to include the external ID as the value of the X_CLIENT_ID HTTP request header when requests are proxied. For OAuth2/JWT based authentication, this typically corresponds to a value extracted from the JWT, uniquely identifying the Account.
   * @return apiClientId
  **/
  @javax.annotation.Nullable
  public String getApiClientId() {
    return apiClientId;
  }

  public void setApiClientId(String apiClientId) {
    this.apiClientId = apiClientId;
  }


  public AccountUpdateParameter firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * An optional first name for the Account.
   * @return firstName
  **/
  @javax.annotation.Nullable
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public AccountUpdateParameter lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * An optional last name for the Account.
   * @return lastName
  **/
  @javax.annotation.Nullable
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public AccountUpdateParameter email(String email) {
    this.email = email;
    return this;
  }

   /**
   * An optional email for the Account.
   * @return email
  **/
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public AccountUpdateParameter username(String username) {
    this.username = username;
    return this;
  }

   /**
   * The username for username/password authentication. This can also be used to provide an optional logical name for the Account.
   * @return username
  **/
  @javax.annotation.Nullable
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public AccountUpdateParameter ldapPrincipal(String ldapPrincipal) {
    this.ldapPrincipal = ldapPrincipal;
    return this;
  }

   /**
   * This value will be used for linking this account to an LDAP user when authenticated with the same LDAP principal. When accounts authenticate with LDAP, an LDAP principal value is calculated based on the username, msad_domain_name, search_base and username_pattern.
   * @return ldapPrincipal
  **/
  @javax.annotation.Nullable
  public String getLdapPrincipal() {
    return ldapPrincipal;
  }

  public void setLdapPrincipal(String ldapPrincipal) {
    this.ldapPrincipal = ldapPrincipal;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountUpdateParameter accountUpdateParameter = (AccountUpdateParameter) o;
    return Objects.equals(this.id, accountUpdateParameter.id) &&
        Objects.equals(this.apiClientId, accountUpdateParameter.apiClientId) &&
        Objects.equals(this.firstName, accountUpdateParameter.firstName) &&
        Objects.equals(this.lastName, accountUpdateParameter.lastName) &&
        Objects.equals(this.email, accountUpdateParameter.email) &&
        Objects.equals(this.username, accountUpdateParameter.username) &&
        Objects.equals(this.ldapPrincipal, accountUpdateParameter.ldapPrincipal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, apiClientId, firstName, lastName, email, username, ldapPrincipal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountUpdateParameter {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    apiClientId: ").append(toIndentedString(apiClientId)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    ldapPrincipal: ").append(toIndentedString(ldapPrincipal)).append("\n");
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
    openapiFields.add("api_client_id");
    openapiFields.add("first_name");
    openapiFields.add("last_name");
    openapiFields.add("email");
    openapiFields.add("username");
    openapiFields.add("ldap_principal");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AccountUpdateParameter
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AccountUpdateParameter.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccountUpdateParameter is not found in the empty JSON string", AccountUpdateParameter.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AccountUpdateParameter.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AccountUpdateParameter` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("api_client_id") != null && !jsonObj.get("api_client_id").isJsonNull()) && !jsonObj.get("api_client_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `api_client_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("api_client_id").toString()));
      }
      if ((jsonObj.get("first_name") != null && !jsonObj.get("first_name").isJsonNull()) && !jsonObj.get("first_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `first_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("first_name").toString()));
      }
      if ((jsonObj.get("last_name") != null && !jsonObj.get("last_name").isJsonNull()) && !jsonObj.get("last_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_name").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("username") != null && !jsonObj.get("username").isJsonNull()) && !jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
      if ((jsonObj.get("ldap_principal") != null && !jsonObj.get("ldap_principal").isJsonNull()) && !jsonObj.get("ldap_principal").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ldap_principal` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ldap_principal").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccountUpdateParameter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccountUpdateParameter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccountUpdateParameter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccountUpdateParameter.class));

       return (TypeAdapter<T>) new TypeAdapter<AccountUpdateParameter>() {
           @Override
           public void write(JsonWriter out, AccountUpdateParameter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AccountUpdateParameter read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AccountUpdateParameter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AccountUpdateParameter
  * @throws IOException if the JSON string is invalid with respect to AccountUpdateParameter
  */
  public static AccountUpdateParameter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccountUpdateParameter.class);
  }

 /**
  * Convert an instance of AccountUpdateParameter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

