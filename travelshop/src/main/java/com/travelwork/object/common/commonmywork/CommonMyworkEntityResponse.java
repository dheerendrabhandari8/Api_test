package com.travelwork.object.common.commonmywork;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"baseResponse", "response"})
public class CommonMyworkEntityResponse {
  @JsonProperty("baseResponse")
  private BaseResponse baseResponse;
  
  @JsonProperty("baseResponse")
  public BaseResponse getBaseResponse() {
    return this.baseResponse;
  }
  
  @JsonProperty("baseResponse")
  public void setBaseResponse(BaseResponse baseResponse) {
    this.baseResponse = baseResponse;
  }
  
  @JsonProperty("response")
  private List<Response> response = null;
  
  @JsonProperty("response")
  public List<Response> getResponse() {
    return this.response;
  }
  
  @JsonProperty("response")
  public void setResponse(List<Response> response) {
    this.response = response;
  }
  
  @JsonIgnore
  private Map<String, Object> additionalProperties = new HashMap<>();
  
  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return this.additionalProperties;
  }
  
  @JsonAnySetter
  public void setAdditionalProperty(String name, Object value) {
    this.additionalProperties.put(name, value);
  }
  
  public String toString() {
    return "CommonMyworkEntityResponse [baseResponse=" + this.baseResponse + ", response=" + this.response + ", additionalProperties=" + this.additionalProperties + "]";
  }
}
