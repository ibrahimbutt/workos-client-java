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
 * ListUsers200ResponseListMetadata
 */
@JsonPropertyOrder({
  ListUsers200ResponseListMetadata.JSON_PROPERTY_BEFORE,
  ListUsers200ResponseListMetadata.JSON_PROPERTY_AFTER
})
@JsonTypeName("listUsers_200_response_list_metadata")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ListUsers200ResponseListMetadata {
  public static final String JSON_PROPERTY_BEFORE = "before";
  private String before;

  public static final String JSON_PROPERTY_AFTER = "after";
  private String after;

  public ListUsers200ResponseListMetadata() {
  }

  public ListUsers200ResponseListMetadata before(String before) {
    
    this.before = before;
    return this;
  }

   /**
   * The user id to use as a cursor for pagination
   * @return before
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BEFORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBefore() {
    return before;
  }


  @JsonProperty(JSON_PROPERTY_BEFORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBefore(String before) {
    this.before = before;
  }


  public ListUsers200ResponseListMetadata after(String after) {
    
    this.after = after;
    return this;
  }

   /**
   * The user id to use as a cursor for pagination
   * @return after
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AFTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAfter() {
    return after;
  }


  @JsonProperty(JSON_PROPERTY_AFTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAfter(String after) {
    this.after = after;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListUsers200ResponseListMetadata listUsers200ResponseListMetadata = (ListUsers200ResponseListMetadata) o;
    return Objects.equals(this.before, listUsers200ResponseListMetadata.before) &&
        Objects.equals(this.after, listUsers200ResponseListMetadata.after);
  }

  @Override
  public int hashCode() {
    return Objects.hash(before, after);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListUsers200ResponseListMetadata {\n");
    sb.append("    before: ").append(toIndentedString(before)).append("\n");
    sb.append("    after: ").append(toIndentedString(after)).append("\n");
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

