/*
 * External User Management API
 * API for managing user information
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PasswordAuthenticationRequest
 */
@JsonPropertyOrder({
  PasswordAuthenticationRequest.JSON_PROPERTY_CLIENT_ID,
  PasswordAuthenticationRequest.JSON_PROPERTY_CLIENT_SECRET,
  PasswordAuthenticationRequest.JSON_PROPERTY_GRANT_TYPE,
  PasswordAuthenticationRequest.JSON_PROPERTY_EMAIL,
  PasswordAuthenticationRequest.JSON_PROPERTY_PASSWORD
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PasswordAuthenticationRequest {
  public static final String JSON_PROPERTY_CLIENT_ID = "client_id";
  private String clientId;

  public static final String JSON_PROPERTY_CLIENT_SECRET = "client_secret";
  private String clientSecret;

  /**
   * The grant type of the application
   */
  public enum GrantTypeEnum {
    PASSWORD("password");

    private String value;

    GrantTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static GrantTypeEnum fromValue(String value) {
      for (GrantTypeEnum b : GrantTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_GRANT_TYPE = "grant_type";
  private GrantTypeEnum grantType;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_PASSWORD = "password";
  private String password;

  public PasswordAuthenticationRequest() {
  }

  public PasswordAuthenticationRequest clientId(String clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * The client id of the application
   * @return clientId
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CLIENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getClientId() {
    return clientId;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public PasswordAuthenticationRequest clientSecret(String clientSecret) {
    
    this.clientSecret = clientSecret;
    return this;
  }

   /**
   * The client secret of the application
   * @return clientSecret
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CLIENT_SECRET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getClientSecret() {
    return clientSecret;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_SECRET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }


  public PasswordAuthenticationRequest grantType(GrantTypeEnum grantType) {
    
    this.grantType = grantType;
    return this;
  }

   /**
   * The grant type of the application
   * @return grantType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GRANT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GrantTypeEnum getGrantType() {
    return grantType;
  }


  @JsonProperty(JSON_PROPERTY_GRANT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGrantType(GrantTypeEnum grantType) {
    this.grantType = grantType;
  }


  public PasswordAuthenticationRequest email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * The user&#39;s email address
   * @return email
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEmail(String email) {
    this.email = email;
  }


  public PasswordAuthenticationRequest password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * The user&#39;s password
   * @return password
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPassword() {
    return password;
  }


  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PasswordAuthenticationRequest passwordAuthenticationRequest = (PasswordAuthenticationRequest) o;
    return Objects.equals(this.clientId, passwordAuthenticationRequest.clientId) &&
        Objects.equals(this.clientSecret, passwordAuthenticationRequest.clientSecret) &&
        Objects.equals(this.grantType, passwordAuthenticationRequest.grantType) &&
        Objects.equals(this.email, passwordAuthenticationRequest.email) &&
        Objects.equals(this.password, passwordAuthenticationRequest.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, clientSecret, grantType, email, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PasswordAuthenticationRequest {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    grantType: ").append(toIndentedString(grantType)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

}

