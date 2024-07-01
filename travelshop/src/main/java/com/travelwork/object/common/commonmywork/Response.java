package com.travelwork.object.common.commonmywork;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"id_mywork", "year", "month", "ilimit", "ioffset", "total", "id_employee", "id_vertical", "query_type", "result_case", "user_name", "vertical_name", "content_type", "activit_name", "url_name", "url_submission", "email", "password", "keywords", "description", "status", "creationdate"})
public class Response {
  @JsonProperty("id_mywork")
  private int id_mywork;
  
  @JsonProperty("year")
  private int year;
  
  @JsonProperty("month")
  private int month;
  
  @JsonProperty("ilimit")
  private int ilimit;
  
  @JsonProperty("ioffset")
  private int ioffset;
  
  @JsonProperty("total")
  private int total;
  
  @JsonProperty("id_employee")
  private int id_employee;
  
  @JsonProperty("id_vertical")
  private int id_vertical;
  
  @JsonProperty("query_type")
  private String query_type;
  
  @JsonProperty("result_case")
  private String result_case;
  
  @JsonProperty("user_name")
  private String user_name;
  
  @JsonProperty("vertical_name")
  private String vertical_name;
  
  @JsonProperty("content_type")
  private String content_type;
  
  @JsonProperty("activit_name")
  private String activit_name;
  
  @JsonProperty("url_name")
  private String url_name;
  
  @JsonProperty("url_submission")
  private String url_submission;
  
  @JsonProperty("email")
  private String email;
  
  @JsonProperty("password")
  private String password;
  
  @JsonProperty("keywords")
  private String keywords;
  
  @JsonProperty("description")
  private String description;
  
  @JsonProperty("status")
  private String status;
  
  @JsonProperty("creationdate")
  private String creationdate;
  
  @JsonProperty("id_mywork")
  public int getId_mywork() {
    return this.id_mywork;
  }
  
  @JsonProperty("id_mywork")
  public void setId_mywork(int id_mywork) {
    this.id_mywork = id_mywork;
  }
  
  @JsonProperty("year")
  public int getYear() {
    return this.year;
  }
  
  @JsonProperty("year")
  public void setYear(int year) {
    this.year = year;
  }
  
  @JsonProperty("month")
  public int getMonth() {
    return this.month;
  }
  
  @JsonProperty("month")
  public void setMonth(int month) {
    this.month = month;
  }
  
  @JsonProperty("ilimit")
  public int getIlimit() {
    return this.ilimit;
  }
  
  @JsonProperty("ilimit")
  public void setIlimit(int ilimit) {
    this.ilimit = ilimit;
  }
  
  @JsonProperty("ioffset")
  public int getIoffset() {
    return this.ioffset;
  }
  
  @JsonProperty("ioffset")
  public void setIoffset(int ioffset) {
    this.ioffset = ioffset;
  }
  
  @JsonProperty("total")
  public int getTotal() {
    return this.total;
  }
  
  @JsonProperty("total")
  public void setTotal(int total) {
    this.total = total;
  }
  
  @JsonProperty("id_employee")
  public int getId_employee() {
    return this.id_employee;
  }
  
  @JsonProperty("id_employee")
  public void setId_employee(int id_employee) {
    this.id_employee = id_employee;
  }
  
  @JsonProperty("id_vertical")
  public int getId_vertical() {
    return this.id_vertical;
  }
  
  @JsonProperty("id_vertical")
  public void setId_vertical(int id_vertical) {
    this.id_vertical = id_vertical;
  }
  
  @JsonProperty("query_type")
  public String getQuery_type() {
    return this.query_type;
  }
  
  @JsonProperty("query_type")
  public void setQuery_type(String query_type) {
    this.query_type = query_type;
  }
  
  @JsonProperty("result_case")
  public String getResult_case() {
    return this.result_case;
  }
  
  @JsonProperty("result_case")
  public void setResult_case(String result_case) {
    this.result_case = result_case;
  }
  
  @JsonProperty("user_name")
  public String getUser_name() {
    return this.user_name;
  }
  
  @JsonProperty("user_name")
  public void setUser_name(String user_name) {
    this.user_name = user_name;
  }
  
  @JsonProperty("vertical_name")
  public String getVertical_name() {
    return this.vertical_name;
  }
  
  @JsonProperty("vertical_name")
  public void setVertical_name(String vertical_name) {
    this.vertical_name = vertical_name;
  }
  
  @JsonProperty("content_type")
  public String getContent_type() {
    return this.content_type;
  }
  
  @JsonProperty("content_type")
  public void setContent_type(String content_type) {
    this.content_type = content_type;
  }
  
  @JsonProperty("activit_name")
  public String getActivit_name() {
    return this.activit_name;
  }
  
  @JsonProperty("activit_name")
  public void setActivit_name(String activit_name) {
    this.activit_name = activit_name;
  }
  
  @JsonProperty("url_name")
  public String getUrl_name() {
    return this.url_name;
  }
  
  @JsonProperty("url_name")
  public void setUrl_name(String url_name) {
    this.url_name = url_name;
  }
  
  @JsonProperty("url_submission")
  public String getUrl_submission() {
    return this.url_submission;
  }
  
  @JsonProperty("url_submission")
  public void setUrl_submission(String url_submission) {
    this.url_submission = url_submission;
  }
  
  @JsonProperty("email")
  public String getEmail() {
    return this.email;
  }
  
  @JsonProperty("email")
  public void setEmail(String email) {
    this.email = email;
  }
  
  @JsonProperty("password")
  public String getPassword() {
    return this.password;
  }
  
  @JsonProperty("password")
  public void setPassword(String password) {
    this.password = password;
  }
  
  @JsonProperty("keywords")
  public String getKeywords() {
    return this.keywords;
  }
  
  @JsonProperty("keywords")
  public void setKeywords(String keywords) {
    this.keywords = keywords;
  }
  
  @JsonProperty("description")
  public String getDescription() {
    return this.description;
  }
  
  @JsonProperty("description")
  public void setDescription(String description) {
    this.description = description;
  }
  
  @JsonProperty("status")
  public String getStatus() {
    return this.status;
  }
  
  @JsonProperty("status")
  public void setStatus(String status) {
    this.status = status;
  }
  
  @JsonProperty("creationdate")
  public String getCreationdate() {
    return this.creationdate;
  }
  
  @JsonProperty("creationdate")
  public void setCreationdate(String creationdate) {
    this.creationdate = creationdate;
  }
}
