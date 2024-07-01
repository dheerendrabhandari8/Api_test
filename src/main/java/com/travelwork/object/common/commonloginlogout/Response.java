package com.travelwork.object.common.commonloginlogout;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"id_menu", "menu_head", "menu_sub", "id_employee", "first_name", "last_name", "user_name", "id_department", "id_designation", "department_name", "designation_name", "user_status", "query_type", "email", "password", "user_ip"})
public class Response {
  @JsonProperty("id_menu")
  private Integer id_menu;
  
  @JsonProperty("id_employee")
  private Integer id_employee;
  
  @JsonProperty("id_department")
  private Integer id_department;
  
  @JsonProperty("id_designation")
  private Integer id_designation;
  
  @JsonProperty("menu_head")
  private String menu_head;
  
  @JsonProperty("menu_sub")
  private String menu_sub;
  
  @JsonProperty("first_name")
  private String first_name;
  
  @JsonProperty("last_name")
  private String last_name;
  
  @JsonProperty("user_name")
  private String user_name;
  
  @JsonProperty("department_name")
  private String department_name;
  
  @JsonProperty("designation_name")
  private String designation_name;
  
  @JsonProperty("user_status")
  private String user_status;
  
  @JsonProperty("query_type")
  private String query_type;
  
  @JsonProperty("email")
  private String email;
  
  @JsonProperty("password")
  private String password;
  
  @JsonProperty("user_ip")
  private String user_ip;
  
  public Integer getId_menu() {
    return this.id_menu;
  }
  
  public void setId_menu(Integer id_menu) {
    this.id_menu = id_menu;
  }
  
  public Integer getId_employee() {
    return this.id_employee;
  }
  
  public void setId_employee(Integer id_employee) {
    this.id_employee = id_employee;
  }
  
  public Integer getId_department() {
    return this.id_department;
  }
  
  public void setId_department(Integer id_department) {
    this.id_department = id_department;
  }
  
  public Integer getId_designation() {
    return this.id_designation;
  }
  
  public void setId_designation(Integer id_designation) {
    this.id_designation = id_designation;
  }
  
  public String getMenu_head() {
    return this.menu_head;
  }
  
  public void setMenu_head(String menu_head) {
    this.menu_head = menu_head;
  }
  
  public String getMenu_sub() {
    return this.menu_sub;
  }
  
  public void setMenu_sub(String menu_sub) {
    this.menu_sub = menu_sub;
  }
  
  public String getFirst_name() {
    return this.first_name;
  }
  
  public void setFirst_name(String first_name) {
    this.first_name = first_name;
  }
  
  public String getLast_name() {
    return this.last_name;
  }
  
  public void setLast_name(String last_name) {
    this.last_name = last_name;
  }
  
  public String getUser_name() {
    return this.user_name;
  }
  
  public void setUser_name(String user_name) {
    this.user_name = user_name;
  }
  
  public String getDepartment_name() {
    return this.department_name;
  }
  
  public void setDepartment_name(String department_name) {
    this.department_name = department_name;
  }
  
  public String getDesignation_name() {
    return this.designation_name;
  }
  
  public void setDesignation_name(String designation_name) {
    this.designation_name = designation_name;
  }
  
  public String getUser_status() {
    return this.user_status;
  }
  
  public void setUser_status(String user_status) {
    this.user_status = user_status;
  }
  
  public String getQuery_type() {
    return this.query_type;
  }
  
  public void setQuery_type(String query_type) {
    this.query_type = query_type;
  }
  
  public String getEmail() {
    return this.email;
  }
  
  public void setEmail(String email) {
    this.email = email;
  }
  
  public String getPassword() {
    return this.password;
  }
  
  public void setPassword(String password) {
    this.password = password;
  }
  
  public String getUser_ip() {
    return this.user_ip;
  }
  
  public void setUser_ip(String user_ip) {
    this.user_ip = user_ip;
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
