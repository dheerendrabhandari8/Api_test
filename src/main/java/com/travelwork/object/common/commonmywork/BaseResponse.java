package com.travelwork.object.common.commonmywork;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"status", "messege"})
public class BaseResponse {
  @JsonProperty("status")
  private Integer status;
  
  @JsonProperty("messege")
  private String messege;
  
  @JsonProperty("status")
  public Integer getStatus() {
    return this.status;
  }
  
  @JsonProperty("status")
  public void setStatus(Integer status) {
    this.status = status;
  }
  
  @JsonProperty("messege")
  public String getMessege() {
    return this.messege;
  }
  
  @JsonProperty("messege")
  public void setMessege(String messege) {
    this.messege = messege;
  }
  
  @JsonIgnore
  private Map<String, Object> additionalProperties = new HashMap<>();
  
  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return this.additionalProperties;
  }
  
  @JsonAnySetter
  public void setAdditionalProperties(Map<String, Object> additionalProperties) {
    this.additionalProperties = additionalProperties;
  }
}
