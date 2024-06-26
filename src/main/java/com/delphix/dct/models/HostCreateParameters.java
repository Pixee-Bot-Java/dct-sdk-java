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
import com.delphix.dct.models.OracleVirtualIP;
import com.delphix.dct.models.SSHVerificationStrategy;
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
 * HostCreateParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-04T14:49:34.152994+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class HostCreateParameters {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_HOSTNAME = "hostname";
  @SerializedName(SERIALIZED_NAME_HOSTNAME)
  private String hostname;

  public static final String SERIALIZED_NAME_NFS_ADDRESSES = "nfs_addresses";
  @SerializedName(SERIALIZED_NAME_NFS_ADDRESSES)
  private List<String> nfsAddresses;

  public static final String SERIALIZED_NAME_SSH_PORT = "ssh_port";
  @SerializedName(SERIALIZED_NAME_SSH_PORT)
  private Integer sshPort = 22;

  public static final String SERIALIZED_NAME_PRIVILEGE_ELEVATION_PROFILE_REFERENCE = "privilege_elevation_profile_reference";
  @SerializedName(SERIALIZED_NAME_PRIVILEGE_ELEVATION_PROFILE_REFERENCE)
  private String privilegeElevationProfileReference;

  public static final String SERIALIZED_NAME_DSP_KEYSTORE_ALIAS = "dsp_keystore_alias";
  @SerializedName(SERIALIZED_NAME_DSP_KEYSTORE_ALIAS)
  private String dspKeystoreAlias;

  public static final String SERIALIZED_NAME_DSP_KEYSTORE_PASSWORD = "dsp_keystore_password";
  @SerializedName(SERIALIZED_NAME_DSP_KEYSTORE_PASSWORD)
  private String dspKeystorePassword;

  public static final String SERIALIZED_NAME_DSP_KEYSTORE_PATH = "dsp_keystore_path";
  @SerializedName(SERIALIZED_NAME_DSP_KEYSTORE_PATH)
  private String dspKeystorePath;

  public static final String SERIALIZED_NAME_DSP_TRUSTSTORE_PASSWORD = "dsp_truststore_password";
  @SerializedName(SERIALIZED_NAME_DSP_TRUSTSTORE_PASSWORD)
  private String dspTruststorePassword;

  public static final String SERIALIZED_NAME_DSP_TRUSTSTORE_PATH = "dsp_truststore_path";
  @SerializedName(SERIALIZED_NAME_DSP_TRUSTSTORE_PATH)
  private String dspTruststorePath;

  public static final String SERIALIZED_NAME_JAVA_HOME = "java_home";
  @SerializedName(SERIALIZED_NAME_JAVA_HOME)
  private String javaHome;

  public static final String SERIALIZED_NAME_TOOLKIT_PATH = "toolkit_path";
  @SerializedName(SERIALIZED_NAME_TOOLKIT_PATH)
  private String toolkitPath;

  public static final String SERIALIZED_NAME_ORACLE_JDBC_KEYSTORE_PASSWORD = "oracle_jdbc_keystore_password";
  @SerializedName(SERIALIZED_NAME_ORACLE_JDBC_KEYSTORE_PASSWORD)
  private String oracleJdbcKeystorePassword;

  public static final String SERIALIZED_NAME_ORACLE_TDE_KEYSTORES_ROOT_PATH = "oracle_tde_keystores_root_path";
  @SerializedName(SERIALIZED_NAME_ORACLE_TDE_KEYSTORES_ROOT_PATH)
  private String oracleTdeKeystoresRootPath;

  public static final String SERIALIZED_NAME_SSH_VERIFICATION_STRATEGY = "ssh_verification_strategy";
  @SerializedName(SERIALIZED_NAME_SSH_VERIFICATION_STRATEGY)
  private SSHVerificationStrategy sshVerificationStrategy;

  public static final String SERIALIZED_NAME_ORACLE_CLUSTER_NODE_VIRTUAL_IPS = "oracle_cluster_node_virtual_ips";
  @SerializedName(SERIALIZED_NAME_ORACLE_CLUSTER_NODE_VIRTUAL_IPS)
  private List<OracleVirtualIP> oracleClusterNodeVirtualIps;

  public HostCreateParameters() {
  }

  public HostCreateParameters name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name to associate with the host.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public HostCreateParameters hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

   /**
   * The hostname or IP address of this host.
   * @return hostname
  **/
  @javax.annotation.Nullable
  public String getHostname() {
    return hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }


  public HostCreateParameters nfsAddresses(List<String> nfsAddresses) {
    this.nfsAddresses = nfsAddresses;
    return this;
  }

  public HostCreateParameters addNfsAddressesItem(String nfsAddressesItem) {
    if (this.nfsAddresses == null) {
      this.nfsAddresses = new ArrayList<>();
    }
    this.nfsAddresses.add(nfsAddressesItem);
    return this;
  }

   /**
   * The list of host/IP addresses to use for NFS export.
   * @return nfsAddresses
  **/
  @javax.annotation.Nullable
  public List<String> getNfsAddresses() {
    return nfsAddresses;
  }

  public void setNfsAddresses(List<String> nfsAddresses) {
    this.nfsAddresses = nfsAddresses;
  }


  public HostCreateParameters sshPort(Integer sshPort) {
    this.sshPort = sshPort;
    return this;
  }

   /**
   * The port number used to connect to the host via SSH.
   * @return sshPort
  **/
  @javax.annotation.Nullable
  public Integer getSshPort() {
    return sshPort;
  }

  public void setSshPort(Integer sshPort) {
    this.sshPort = sshPort;
  }


  public HostCreateParameters privilegeElevationProfileReference(String privilegeElevationProfileReference) {
    this.privilegeElevationProfileReference = privilegeElevationProfileReference;
    return this;
  }

   /**
   * Reference to a profile for escalating user privileges.
   * @return privilegeElevationProfileReference
  **/
  @javax.annotation.Nullable
  public String getPrivilegeElevationProfileReference() {
    return privilegeElevationProfileReference;
  }

  public void setPrivilegeElevationProfileReference(String privilegeElevationProfileReference) {
    this.privilegeElevationProfileReference = privilegeElevationProfileReference;
  }


  public HostCreateParameters dspKeystoreAlias(String dspKeystoreAlias) {
    this.dspKeystoreAlias = dspKeystoreAlias;
    return this;
  }

   /**
   * The lowercase alias to use inside the user managed DSP keystore.
   * @return dspKeystoreAlias
  **/
  @javax.annotation.Nullable
  public String getDspKeystoreAlias() {
    return dspKeystoreAlias;
  }

  public void setDspKeystoreAlias(String dspKeystoreAlias) {
    this.dspKeystoreAlias = dspKeystoreAlias;
  }


  public HostCreateParameters dspKeystorePassword(String dspKeystorePassword) {
    this.dspKeystorePassword = dspKeystorePassword;
    return this;
  }

   /**
   * The password for the user managed DSP keystore.
   * @return dspKeystorePassword
  **/
  @javax.annotation.Nullable
  public String getDspKeystorePassword() {
    return dspKeystorePassword;
  }

  public void setDspKeystorePassword(String dspKeystorePassword) {
    this.dspKeystorePassword = dspKeystorePassword;
  }


  public HostCreateParameters dspKeystorePath(String dspKeystorePath) {
    this.dspKeystorePath = dspKeystorePath;
    return this;
  }

   /**
   * The path to the user managed DSP keystore.
   * @return dspKeystorePath
  **/
  @javax.annotation.Nullable
  public String getDspKeystorePath() {
    return dspKeystorePath;
  }

  public void setDspKeystorePath(String dspKeystorePath) {
    this.dspKeystorePath = dspKeystorePath;
  }


  public HostCreateParameters dspTruststorePassword(String dspTruststorePassword) {
    this.dspTruststorePassword = dspTruststorePassword;
    return this;
  }

   /**
   * The password for the user managed DSP truststore.
   * @return dspTruststorePassword
  **/
  @javax.annotation.Nullable
  public String getDspTruststorePassword() {
    return dspTruststorePassword;
  }

  public void setDspTruststorePassword(String dspTruststorePassword) {
    this.dspTruststorePassword = dspTruststorePassword;
  }


  public HostCreateParameters dspTruststorePath(String dspTruststorePath) {
    this.dspTruststorePath = dspTruststorePath;
    return this;
  }

   /**
   * The path to the user managed DSP truststore.
   * @return dspTruststorePath
  **/
  @javax.annotation.Nullable
  public String getDspTruststorePath() {
    return dspTruststorePath;
  }

  public void setDspTruststorePath(String dspTruststorePath) {
    this.dspTruststorePath = dspTruststorePath;
  }


  public HostCreateParameters javaHome(String javaHome) {
    this.javaHome = javaHome;
    return this;
  }

   /**
   * The path to the user managed Java Development Kit (JDK). If not specified, then the OpenJDK will be used.
   * @return javaHome
  **/
  @javax.annotation.Nullable
  public String getJavaHome() {
    return javaHome;
  }

  public void setJavaHome(String javaHome) {
    this.javaHome = javaHome;
  }


  public HostCreateParameters toolkitPath(String toolkitPath) {
    this.toolkitPath = toolkitPath;
    return this;
  }

   /**
   * The path for the toolkit that resides on the host.
   * @return toolkitPath
  **/
  @javax.annotation.Nullable
  public String getToolkitPath() {
    return toolkitPath;
  }

  public void setToolkitPath(String toolkitPath) {
    this.toolkitPath = toolkitPath;
  }


  public HostCreateParameters oracleJdbcKeystorePassword(String oracleJdbcKeystorePassword) {
    this.oracleJdbcKeystorePassword = oracleJdbcKeystorePassword;
    return this;
  }

   /**
   * The password for the user managed Oracle JDBC keystore.
   * @return oracleJdbcKeystorePassword
  **/
  @javax.annotation.Nullable
  public String getOracleJdbcKeystorePassword() {
    return oracleJdbcKeystorePassword;
  }

  public void setOracleJdbcKeystorePassword(String oracleJdbcKeystorePassword) {
    this.oracleJdbcKeystorePassword = oracleJdbcKeystorePassword;
  }


  public HostCreateParameters oracleTdeKeystoresRootPath(String oracleTdeKeystoresRootPath) {
    this.oracleTdeKeystoresRootPath = oracleTdeKeystoresRootPath;
    return this;
  }

   /**
   * The path to the root of the Oracle TDE keystores artifact directories.
   * @return oracleTdeKeystoresRootPath
  **/
  @javax.annotation.Nullable
  public String getOracleTdeKeystoresRootPath() {
    return oracleTdeKeystoresRootPath;
  }

  public void setOracleTdeKeystoresRootPath(String oracleTdeKeystoresRootPath) {
    this.oracleTdeKeystoresRootPath = oracleTdeKeystoresRootPath;
  }


  public HostCreateParameters sshVerificationStrategy(SSHVerificationStrategy sshVerificationStrategy) {
    this.sshVerificationStrategy = sshVerificationStrategy;
    return this;
  }

   /**
   * Get sshVerificationStrategy
   * @return sshVerificationStrategy
  **/
  @javax.annotation.Nullable
  public SSHVerificationStrategy getSshVerificationStrategy() {
    return sshVerificationStrategy;
  }

  public void setSshVerificationStrategy(SSHVerificationStrategy sshVerificationStrategy) {
    this.sshVerificationStrategy = sshVerificationStrategy;
  }


  public HostCreateParameters oracleClusterNodeVirtualIps(List<OracleVirtualIP> oracleClusterNodeVirtualIps) {
    this.oracleClusterNodeVirtualIps = oracleClusterNodeVirtualIps;
    return this;
  }

  public HostCreateParameters addOracleClusterNodeVirtualIpsItem(OracleVirtualIP oracleClusterNodeVirtualIpsItem) {
    if (this.oracleClusterNodeVirtualIps == null) {
      this.oracleClusterNodeVirtualIps = new ArrayList<>();
    }
    this.oracleClusterNodeVirtualIps.add(oracleClusterNodeVirtualIpsItem);
    return this;
  }

   /**
   * The Virtual IP addresses associated with the OracleClusterNode.
   * @return oracleClusterNodeVirtualIps
  **/
  @javax.annotation.Nullable
  public List<OracleVirtualIP> getOracleClusterNodeVirtualIps() {
    return oracleClusterNodeVirtualIps;
  }

  public void setOracleClusterNodeVirtualIps(List<OracleVirtualIP> oracleClusterNodeVirtualIps) {
    this.oracleClusterNodeVirtualIps = oracleClusterNodeVirtualIps;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HostCreateParameters hostCreateParameters = (HostCreateParameters) o;
    return Objects.equals(this.name, hostCreateParameters.name) &&
        Objects.equals(this.hostname, hostCreateParameters.hostname) &&
        Objects.equals(this.nfsAddresses, hostCreateParameters.nfsAddresses) &&
        Objects.equals(this.sshPort, hostCreateParameters.sshPort) &&
        Objects.equals(this.privilegeElevationProfileReference, hostCreateParameters.privilegeElevationProfileReference) &&
        Objects.equals(this.dspKeystoreAlias, hostCreateParameters.dspKeystoreAlias) &&
        Objects.equals(this.dspKeystorePassword, hostCreateParameters.dspKeystorePassword) &&
        Objects.equals(this.dspKeystorePath, hostCreateParameters.dspKeystorePath) &&
        Objects.equals(this.dspTruststorePassword, hostCreateParameters.dspTruststorePassword) &&
        Objects.equals(this.dspTruststorePath, hostCreateParameters.dspTruststorePath) &&
        Objects.equals(this.javaHome, hostCreateParameters.javaHome) &&
        Objects.equals(this.toolkitPath, hostCreateParameters.toolkitPath) &&
        Objects.equals(this.oracleJdbcKeystorePassword, hostCreateParameters.oracleJdbcKeystorePassword) &&
        Objects.equals(this.oracleTdeKeystoresRootPath, hostCreateParameters.oracleTdeKeystoresRootPath) &&
        Objects.equals(this.sshVerificationStrategy, hostCreateParameters.sshVerificationStrategy) &&
        Objects.equals(this.oracleClusterNodeVirtualIps, hostCreateParameters.oracleClusterNodeVirtualIps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, hostname, nfsAddresses, sshPort, privilegeElevationProfileReference, dspKeystoreAlias, dspKeystorePassword, dspKeystorePath, dspTruststorePassword, dspTruststorePath, javaHome, toolkitPath, oracleJdbcKeystorePassword, oracleTdeKeystoresRootPath, sshVerificationStrategy, oracleClusterNodeVirtualIps);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HostCreateParameters {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    nfsAddresses: ").append(toIndentedString(nfsAddresses)).append("\n");
    sb.append("    sshPort: ").append(toIndentedString(sshPort)).append("\n");
    sb.append("    privilegeElevationProfileReference: ").append(toIndentedString(privilegeElevationProfileReference)).append("\n");
    sb.append("    dspKeystoreAlias: ").append(toIndentedString(dspKeystoreAlias)).append("\n");
    sb.append("    dspKeystorePassword: ").append("*").append("\n");
    sb.append("    dspKeystorePath: ").append(toIndentedString(dspKeystorePath)).append("\n");
    sb.append("    dspTruststorePassword: ").append("*").append("\n");
    sb.append("    dspTruststorePath: ").append(toIndentedString(dspTruststorePath)).append("\n");
    sb.append("    javaHome: ").append(toIndentedString(javaHome)).append("\n");
    sb.append("    toolkitPath: ").append(toIndentedString(toolkitPath)).append("\n");
    sb.append("    oracleJdbcKeystorePassword: ").append("*").append("\n");
    sb.append("    oracleTdeKeystoresRootPath: ").append(toIndentedString(oracleTdeKeystoresRootPath)).append("\n");
    sb.append("    sshVerificationStrategy: ").append(toIndentedString(sshVerificationStrategy)).append("\n");
    sb.append("    oracleClusterNodeVirtualIps: ").append(toIndentedString(oracleClusterNodeVirtualIps)).append("\n");
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
    openapiFields.add("hostname");
    openapiFields.add("nfs_addresses");
    openapiFields.add("ssh_port");
    openapiFields.add("privilege_elevation_profile_reference");
    openapiFields.add("dsp_keystore_alias");
    openapiFields.add("dsp_keystore_password");
    openapiFields.add("dsp_keystore_path");
    openapiFields.add("dsp_truststore_password");
    openapiFields.add("dsp_truststore_path");
    openapiFields.add("java_home");
    openapiFields.add("toolkit_path");
    openapiFields.add("oracle_jdbc_keystore_password");
    openapiFields.add("oracle_tde_keystores_root_path");
    openapiFields.add("ssh_verification_strategy");
    openapiFields.add("oracle_cluster_node_virtual_ips");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to HostCreateParameters
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!HostCreateParameters.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in HostCreateParameters is not found in the empty JSON string", HostCreateParameters.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!HostCreateParameters.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `HostCreateParameters` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("hostname") != null && !jsonObj.get("hostname").isJsonNull()) && !jsonObj.get("hostname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hostname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hostname").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("nfs_addresses") != null && !jsonObj.get("nfs_addresses").isJsonNull() && !jsonObj.get("nfs_addresses").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `nfs_addresses` to be an array in the JSON string but got `%s`", jsonObj.get("nfs_addresses").toString()));
      }
      if ((jsonObj.get("privilege_elevation_profile_reference") != null && !jsonObj.get("privilege_elevation_profile_reference").isJsonNull()) && !jsonObj.get("privilege_elevation_profile_reference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `privilege_elevation_profile_reference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("privilege_elevation_profile_reference").toString()));
      }
      if ((jsonObj.get("dsp_keystore_alias") != null && !jsonObj.get("dsp_keystore_alias").isJsonNull()) && !jsonObj.get("dsp_keystore_alias").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dsp_keystore_alias` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dsp_keystore_alias").toString()));
      }
      if ((jsonObj.get("dsp_keystore_password") != null && !jsonObj.get("dsp_keystore_password").isJsonNull()) && !jsonObj.get("dsp_keystore_password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dsp_keystore_password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dsp_keystore_password").toString()));
      }
      if ((jsonObj.get("dsp_keystore_path") != null && !jsonObj.get("dsp_keystore_path").isJsonNull()) && !jsonObj.get("dsp_keystore_path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dsp_keystore_path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dsp_keystore_path").toString()));
      }
      if ((jsonObj.get("dsp_truststore_password") != null && !jsonObj.get("dsp_truststore_password").isJsonNull()) && !jsonObj.get("dsp_truststore_password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dsp_truststore_password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dsp_truststore_password").toString()));
      }
      if ((jsonObj.get("dsp_truststore_path") != null && !jsonObj.get("dsp_truststore_path").isJsonNull()) && !jsonObj.get("dsp_truststore_path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dsp_truststore_path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dsp_truststore_path").toString()));
      }
      if ((jsonObj.get("java_home") != null && !jsonObj.get("java_home").isJsonNull()) && !jsonObj.get("java_home").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `java_home` to be a primitive type in the JSON string but got `%s`", jsonObj.get("java_home").toString()));
      }
      if ((jsonObj.get("toolkit_path") != null && !jsonObj.get("toolkit_path").isJsonNull()) && !jsonObj.get("toolkit_path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `toolkit_path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("toolkit_path").toString()));
      }
      if ((jsonObj.get("oracle_jdbc_keystore_password") != null && !jsonObj.get("oracle_jdbc_keystore_password").isJsonNull()) && !jsonObj.get("oracle_jdbc_keystore_password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `oracle_jdbc_keystore_password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("oracle_jdbc_keystore_password").toString()));
      }
      if ((jsonObj.get("oracle_tde_keystores_root_path") != null && !jsonObj.get("oracle_tde_keystores_root_path").isJsonNull()) && !jsonObj.get("oracle_tde_keystores_root_path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `oracle_tde_keystores_root_path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("oracle_tde_keystores_root_path").toString()));
      }
      // validate the optional field `ssh_verification_strategy`
      if (jsonObj.get("ssh_verification_strategy") != null && !jsonObj.get("ssh_verification_strategy").isJsonNull()) {
        SSHVerificationStrategy.validateJsonElement(jsonObj.get("ssh_verification_strategy"));
      }
      if (jsonObj.get("oracle_cluster_node_virtual_ips") != null && !jsonObj.get("oracle_cluster_node_virtual_ips").isJsonNull()) {
        JsonArray jsonArrayoracleClusterNodeVirtualIps = jsonObj.getAsJsonArray("oracle_cluster_node_virtual_ips");
        if (jsonArrayoracleClusterNodeVirtualIps != null) {
          // ensure the json data is an array
          if (!jsonObj.get("oracle_cluster_node_virtual_ips").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `oracle_cluster_node_virtual_ips` to be an array in the JSON string but got `%s`", jsonObj.get("oracle_cluster_node_virtual_ips").toString()));
          }

          // validate the optional field `oracle_cluster_node_virtual_ips` (array)
          for (int i = 0; i < jsonArrayoracleClusterNodeVirtualIps.size(); i++) {
            OracleVirtualIP.validateJsonElement(jsonArrayoracleClusterNodeVirtualIps.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!HostCreateParameters.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'HostCreateParameters' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<HostCreateParameters> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(HostCreateParameters.class));

       return (TypeAdapter<T>) new TypeAdapter<HostCreateParameters>() {
           @Override
           public void write(JsonWriter out, HostCreateParameters value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public HostCreateParameters read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of HostCreateParameters given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of HostCreateParameters
  * @throws IOException if the JSON string is invalid with respect to HostCreateParameters
  */
  public static HostCreateParameters fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, HostCreateParameters.class);
  }

 /**
  * Convert an instance of HostCreateParameters to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

