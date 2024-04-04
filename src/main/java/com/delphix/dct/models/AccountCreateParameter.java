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
import com.delphix.dct.models.Tag;
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
 * AccountCreateParameter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-04T14:49:34.152994+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class AccountCreateParameter {
  public static final String SERIALIZED_NAME_IS_ADMIN = "is_admin";
  @SerializedName(SERIALIZED_NAME_IS_ADMIN)
  private Boolean isAdmin = false;

  public static final String SERIALIZED_NAME_GENERATE_API_KEY = "generate_api_key";
  @SerializedName(SERIALIZED_NAME_GENERATE_API_KEY)
  private Boolean generateApiKey = false;

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

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_LDAP_PRINCIPAL = "ldap_principal";
  @SerializedName(SERIALIZED_NAME_LDAP_PRINCIPAL)
  private String ldapPrincipal;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<Tag> tags;

  public AccountCreateParameter() {
  }

  public AccountCreateParameter isAdmin(Boolean isAdmin) {
    this.isAdmin = isAdmin;
    return this;
  }

   /**
   * Whether the created account must be granted to admin role.
   * @return isAdmin
  **/
  @javax.annotation.Nullable
  public Boolean getIsAdmin() {
    return isAdmin;
  }

  public void setIsAdmin(Boolean isAdmin) {
    this.isAdmin = isAdmin;
  }


  public AccountCreateParameter generateApiKey(Boolean generateApiKey) {
    this.generateApiKey = generateApiKey;
    return this;
  }

   /**
   * Whether an API key must be generated for this Account. This must be set if the Account will be used for API key based authentication, and unset otherwise.
   * @return generateApiKey
  **/
  @javax.annotation.Nullable
  public Boolean getGenerateApiKey() {
    return generateApiKey;
  }

  public void setGenerateApiKey(Boolean generateApiKey) {
    this.generateApiKey = generateApiKey;
  }


  public AccountCreateParameter apiClientId(String apiClientId) {
    this.apiClientId = apiClientId;
    return this;
  }

   /**
   * The unique ID which is used to identify the identity of an API request. The web server (nginx) configuration must be configured so as to include the external ID as the value of the X_CLIENT_ID HTTP request header when requests are proxied. If this value isn&#39;t set, the application will automatically generate one. For OAuth2/JWT based authentication, this typically corresponds to a value extracted from the JWT, uniquely identifying the Account.
   * @return apiClientId
  **/
  @javax.annotation.Nullable
  public String getApiClientId() {
    return apiClientId;
  }

  public void setApiClientId(String apiClientId) {
    this.apiClientId = apiClientId;
  }


  public AccountCreateParameter firstName(String firstName) {
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


  public AccountCreateParameter lastName(String lastName) {
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


  public AccountCreateParameter email(String email) {
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


  public AccountCreateParameter username(String username) {
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


  public AccountCreateParameter password(String password) {
    this.password = password;
    return this;
  }

   /**
   * The password for username/password authentication.
   * @return password
  **/
  @javax.annotation.Nullable
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public AccountCreateParameter ldapPrincipal(String ldapPrincipal) {
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


  public AccountCreateParameter tags(List<Tag> tags) {
    this.tags = tags;
    return this;
  }

  public AccountCreateParameter addTagsItem(Tag tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * The tags to be created for this Account.
   * @return tags
  **/
  @javax.annotation.Nullable
  public List<Tag> getTags() {
    return tags;
  }

  public void setTags(List<Tag> tags) {
    this.tags = tags;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountCreateParameter accountCreateParameter = (AccountCreateParameter) o;
    return Objects.equals(this.isAdmin, accountCreateParameter.isAdmin) &&
        Objects.equals(this.generateApiKey, accountCreateParameter.generateApiKey) &&
        Objects.equals(this.apiClientId, accountCreateParameter.apiClientId) &&
        Objects.equals(this.firstName, accountCreateParameter.firstName) &&
        Objects.equals(this.lastName, accountCreateParameter.lastName) &&
        Objects.equals(this.email, accountCreateParameter.email) &&
        Objects.equals(this.username, accountCreateParameter.username) &&
        Objects.equals(this.password, accountCreateParameter.password) &&
        Objects.equals(this.ldapPrincipal, accountCreateParameter.ldapPrincipal) &&
        Objects.equals(this.tags, accountCreateParameter.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isAdmin, generateApiKey, apiClientId, firstName, lastName, email, username, password, ldapPrincipal, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountCreateParameter {\n");
    sb.append("    isAdmin: ").append(toIndentedString(isAdmin)).append("\n");
    sb.append("    generateApiKey: ").append(toIndentedString(generateApiKey)).append("\n");
    sb.append("    apiClientId: ").append(toIndentedString(apiClientId)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    ldapPrincipal: ").append(toIndentedString(ldapPrincipal)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
    openapiFields.add("is_admin");
    openapiFields.add("generate_api_key");
    openapiFields.add("api_client_id");
    openapiFields.add("first_name");
    openapiFields.add("last_name");
    openapiFields.add("email");
    openapiFields.add("username");
    openapiFields.add("password");
    openapiFields.add("ldap_principal");
    openapiFields.add("tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AccountCreateParameter
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AccountCreateParameter.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccountCreateParameter is not found in the empty JSON string", AccountCreateParameter.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AccountCreateParameter.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AccountCreateParameter` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
      if ((jsonObj.get("password") != null && !jsonObj.get("password").isJsonNull()) && !jsonObj.get("password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password").toString()));
      }
      if ((jsonObj.get("ldap_principal") != null && !jsonObj.get("ldap_principal").isJsonNull()) && !jsonObj.get("ldap_principal").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ldap_principal` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ldap_principal").toString()));
      }
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull()) {
        JsonArray jsonArraytags = jsonObj.getAsJsonArray("tags");
        if (jsonArraytags != null) {
          // ensure the json data is an array
          if (!jsonObj.get("tags").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
          }

          // validate the optional field `tags` (array)
          for (int i = 0; i < jsonArraytags.size(); i++) {
            Tag.validateJsonElement(jsonArraytags.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccountCreateParameter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccountCreateParameter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccountCreateParameter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccountCreateParameter.class));

       return (TypeAdapter<T>) new TypeAdapter<AccountCreateParameter>() {
           @Override
           public void write(JsonWriter out, AccountCreateParameter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AccountCreateParameter read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AccountCreateParameter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AccountCreateParameter
  * @throws IOException if the JSON string is invalid with respect to AccountCreateParameter
  */
  public static AccountCreateParameter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccountCreateParameter.class);
  }

 /**
  * Convert an instance of AccountCreateParameter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
