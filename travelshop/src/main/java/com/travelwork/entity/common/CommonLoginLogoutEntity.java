package com.travelwork.entity.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_user")
@JsonIgnoreProperties(ignoreUnknown = true)
public class CommonLoginLogoutEntity
{
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id_user;  
  public Integer getId_user() { return id_user; }
  public void setId_user(Integer id_user) {	this.id_user = id_user; }

  private Integer id_location;  
  public Integer getId_location() {	return id_location; }
  public void setId_location(Integer id_location) { this.id_location = id_location; }

  private Integer id_client;  
  public Integer getId_client() { return id_client; }
  public void setId_client(Integer id_client) { this.id_client = id_client; }

  private String first_name;
  public String getFirst_name() { return this.first_name; }	  
  public void setFirst_name(String first_name) { this.first_name = first_name; }
  
  private String last_name;
  public String getLast_name() { return this.last_name; }
  public void setLast_name(String last_name) { this.last_name = last_name; }
  
  private String user_name;
  public String getUser_name() { return this.user_name; }  
  public void setUser_name(String user_name) { this.user_name = user_name; }
  
  private String query_type;
  public String getQuery_type() { return this.query_type; }  
  public void setQuery_type(String query_type) { this.query_type = query_type; }
  
  private String email;
  public String getEmail() { return this.email; }  
  public void setEmail(String email) { this.email = email; }
  
  private String password;
  public String getPassword() { return this.password; }  
  public void setPassword(String password) { this.password = password; }
  
  private String user_ip;
  public String getUser_ip() { return this.user_ip; }  
  public void setUser_ip(String user_ip) { this.user_ip = user_ip; }
  
  private String location_name;
  public String getLocation_name() { return location_name; }
  public void setLocation_name(String location_name) { this.location_name = location_name; }
  
  private String client_name;  
  public String getClient_name() { return client_name; }
  public void setClient_name(String client_name) {	this.client_name = client_name; }
  
  public CommonLoginLogoutEntity(Integer id_user, Integer id_location, Integer id_client, String first_name,
		String last_name, String user_name, String query_type, String email, String password, String user_ip,
		String location_name, String client_name)
  {
	super();
	this.id_user = id_user;
	this.id_location = id_location;
	this.id_client = id_client;
	this.first_name = first_name;
	this.last_name = last_name;
	this.user_name = user_name;
	this.query_type = query_type;
	this.email = email;
	this.password = password;
	this.user_ip = user_ip;
	this.location_name = location_name;
	this.client_name = client_name;
  }
  
  public CommonLoginLogoutEntity() {
	super();
	// TODO Auto-generated constructor stub
  }
  
  
  @Override
  public String toString()
  {
	return "{\"id_user\":\"" + id_user + "\", \"id_location\":\"" + id_location + "\", \"id_client\":\"" + id_client
			+ "\", \"first_name\":\"" + first_name + "\", \"last_name\":\"" + last_name + "\", \"user_name\":\"" + user_name + "\", \"query_type\":\""
			+ query_type + "\", \"email\":\"" + email + "\", \"password\":\"" + password + "\", \"user_ip\":\"" + user_ip + "\", \"location_name\":\""
			+ location_name + "\", \"client_name\":\"" + client_name + "\"}";
  }
}
