package com.travelwork.entity.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_vehicle_data")
@JsonIgnoreProperties(ignoreUnknown = true)
public class CommonVehicleReportEntity
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id_vehicle_data;
	public Integer getId_vehicle_data() { return id_vehicle_data; }
	public void setId_vehicle_data(Integer id_vehicle_data) { this.id_vehicle_data = id_vehicle_data; }
	
	private Integer id_location;
	public Integer getId_location() { return id_location; }
	public void setId_location(Integer id_location) { this.id_location = id_location; }
	
	private String location_name;
	public String getLocation_name() { return location_name; }
	public void setLocation_name(String location_name) { this.location_name = location_name; }
	
	private String vehicle_no;
	public String getVehicle_no() { return vehicle_no; }
	public void setVehicle_no(String vehicle_no) { this.vehicle_no = vehicle_no; }
	
	private String job_card_no;
	public String getJob_card_no() { return job_card_no; }
	public void setJob_card_no(String job_card_no) { this.job_card_no = job_card_no; }
	
	private String vehicle_model;
	public String getVehicle_model() { return vehicle_model; }
	public void setVehicle_model(String vehicle_model) { this.vehicle_model = vehicle_model; }
	
	private String advisor_name;
	public String getAdvisor_name() { return advisor_name; }
	public void setAdvisor_name(String advisor_name) { this.advisor_name = advisor_name; }
	
	private String floor_status;
	public String getFloor_status() { return floor_status; }
	public void setFloor_status(String floor_status) { this.floor_status = floor_status; }
	
	private String danting;
	public String getDanting() { return danting; }
	public void setDanting(String danting) { this.danting = danting; }
	
	private String panting;
	public String getPanting() { return panting; }
	public void setPanting(String panting) { this.panting = panting; }
	
	private String fitting;
	public String getFitting() { return fitting; }
	public void setFitting(String fitting) { this.fitting = fitting; }
	
	private String fi;
	public String getFi() { return fi; }
	public void setFi(String fi) { this.fi = fi; }
	
	private String status;
	public String getStatus() { return status; }
	public void setStatus(String status) { this.status = status; }
	
	private String pna;	
	public String getPna() { return pna; }
	public void setPna(String pna) { this.pna = pna; }

	private String progress;
	public String getProgress() { return progress; }
	public void setProgress(String progress) { this.progress = progress; }
	
	private String creationdate;
	public String getCreationdate() { return creationdate; }
	public void setCreationdate(String creationdate) { this.creationdate = creationdate;}
	
	private String query_type;
	public String getQuery_type() { return query_type; }
	public void setQuery_type(String query_type) { this.query_type = query_type; }
	
	public CommonVehicleReportEntity()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CommonVehicleReportEntity(Integer id_vehicle_data, Integer id_location, String location_name,
			String vehicle_no, String job_card_no, String vehicle_model, String advisor_name, String floor_status,
			String danting, String panting, String fitting, String fi, String status, String pna, String progress,
			String creationdate, String query_type) {
		super();
		this.id_vehicle_data = id_vehicle_data;
		this.id_location = id_location;
		this.location_name = location_name;
		this.vehicle_no = vehicle_no;
		this.job_card_no = job_card_no;
		this.vehicle_model = vehicle_model;
		this.advisor_name = advisor_name;
		this.floor_status = floor_status;
		this.danting = danting;
		this.panting = panting;
		this.fitting = fitting;
		this.fi = fi;
		this.status = status;
		pna = pna;
		this.progress = progress;
		this.creationdate = creationdate;
		this.query_type = query_type;
	}
	@Override
	public String toString() {
		return"{\"id_vehicle_data\":\"" + id_vehicle_data + "\", \"id_location\":\"" + id_location
				+ "\", \"location_name\":\"" + location_name + "\", \"vehicle_no\":\"" + vehicle_no + "\", \"job_card_no\":\"" + job_card_no
				+ "\", \"vehicle_model\":\"" + vehicle_model + "\", \"advisor_name\":\"" + advisor_name + "\", \"floor_status\":\""
				+ floor_status + "\", \"danting\":\"" + danting + "\", \"panting\":\"" + panting + "\", \"fitting\":\"" + fitting + "\", \"fi\":\"" + fi
				+ "\", \"status\":\"" + status + "\", \"pna\":\"" + pna + "\", \"progress\":\"" + progress + "\", \"creationdate\":\"" + creationdate
				+ "\", \"query_type\":\"" + query_type + "\"}";
	}
}
