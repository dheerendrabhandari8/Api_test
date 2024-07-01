package com.travelwork.service;


import com.travelwork.entity.common.CommonLoginLogoutEntity;
import com.travelwork.entity.common.CommonVehicleReportEntity;
import com.travelwork.repository.common.CommonLoginLogoutRepository;
import com.travelwork.repository.common.CommonVehicleRepository;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

@Service
public class CommonService {
  //WORKING
  @Autowired
  private CommonLoginLogoutRepository commonLoginLogoutRepository;
  
  //WORKING
  @Autowired
  private CommonVehicleRepository commonVehicleRepository;
  
  //WORKING
  @Transactional
  public List<CommonLoginLogoutEntity> function_sp_common_login_logout(CommonLoginLogoutEntity cObj) {
    System.out.println("cObj.getQuery_type() : " + cObj.getQuery_type());
    System.out.println("cObj.getEmail() : " + cObj.getEmail());
    System.out.println("cObj.getPassword() : " + cObj.getPassword());
    return this.commonLoginLogoutRepository.function_sp_common_login_logout(cObj.getQuery_type(), cObj.getEmail(), cObj.getPassword(), cObj.getUser_ip());
  }
  
  //WORKING
  @Transactional
  public List<CommonVehicleReportEntity> function_sp_common_vehicle_report(CommonVehicleReportEntity cObj)
  {
	System.out.println("Query_type :: "+cObj.getQuery_type());
	System.out.println("Id_location :: "+cObj.getId_location()); 
	System.out.println("Vehicle_no :: "+cObj.getVehicle_no());
	System.out.println("Vehicle_model :: "+cObj.getVehicle_model()); 
	System.out.println("Job_card_no :: "+cObj.getJob_card_no()); 
	System.out.println("Advisor_name :: "+cObj.getAdvisor_name()); 
	System.out.println("Floor_status :: "+cObj.getFloor_status()); 
	System.out.println("Status :: "+cObj.getStatus()); 
	System.out.println("Danting :: "+cObj.getDanting()); 
	System.out.println("Panting :: "+cObj.getPanting()); 
	System.out.println("Fitting :: "+cObj.getFitting()); 
	System.out.println("Fi :: "+cObj.getFi()); 
	System.out.println("pna :: "+cObj.getPna()); 
	System.out.println("Progress :: "+cObj.getProgress());
	System.out.println("id_vehicle_data :: "+cObj.getId_vehicle_data());
	
	if(cObj.getQuery_type().equals("report_all")==true)
		return this.commonVehicleRepository.function_sp_common_vehicle_report(cObj.getQuery_type(), "", "", "", "", "", "", "", "", "", "", "", "", "","");
	else if(cObj.getQuery_type().equals("report_by_location")==true)
	{
		return this.commonVehicleRepository.function_sp_common_vehicle_report(cObj.getQuery_type(), cObj.getId_location().toString(), "", "", "", "", "", "", "", "", "", "", "", "","0");
	}
	else 
	{
    //return this.commonVehicleRepository.function_sp_common_vehicle_report(cObj.getQuery_type(), "", "", "", "", "", "", "", "", "", "", "", "", "","");
	//return this.commonVehicleRepository.function_sp_common_vehicle_report(cObj.getQuery_type(), cObj.getId_location().toString(), "", "", "", "", "", "", "", "", "", "", "", "","0");
	return this.commonVehicleRepository.function_sp_common_vehicle_report(cObj.getQuery_type(), cObj.getId_location().toString(),
			cObj.getVehicle_no(), cObj.getVehicle_model(), cObj.getJob_card_no(), cObj.getAdvisor_name(),
			cObj.getFloor_status(), cObj.getDanting(), cObj.getPanting(), cObj.getFitting(), cObj.getFi(), cObj.getStatus(),
			cObj.getPna(), cObj.getProgress(), cObj.getId_vehicle_data().toString());
	}
  }
}
