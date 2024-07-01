package com.travelwork.controller.api;

import com.travelwork.common.DB_return_resultset;
import com.travelwork.entity.common.CommonLoginLogoutEntity;
import com.travelwork.entity.common.CommonVehicleReportEntity;
import com.travelwork.service.CommonService;
import java.io.IOException;
import java.util.Locale;
import javax.servlet.http.HttpServletRequest;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@CrossOrigin(origins = {"*"})
public class APICommonContentController {
  @Autowired
  private CommonService objCommonService;
  
  DB_return_resultset objDB_return_resultset = new DB_return_resultset();
  
  //WORKING
  @RequestMapping(value = {"/api_db_login"}, method = {RequestMethod.GET, RequestMethod.POST})
  @ResponseBody
  public String api_db_login(@RequestBody CommonLoginLogoutEntity objEntity, BindingResult result, Locale locale, HttpServletRequest request, Model model) {
    String sResult = "{}";
    String sEmail = "", sPassword = "";
    String sJSonFormat = "{\"baseResponse\":{\"status\": 1,\"messege\":\"Success\"},\"response\": ";
    if (objEntity.getQuery_type().equals("login"))
    try
    {
        sEmail = objEntity.getEmail();
        sPassword = objEntity.getPassword();
        System.out.println("query_type : " + objEntity.getQuery_type());
        System.out.println("email : " + sEmail);
        System.out.println("password : " + sPassword);
        sJSonFormat = String.valueOf(sJSonFormat) + this.objCommonService.function_sp_common_login_logout(objEntity).toString() + "}";
        sResult = sJSonFormat;
        System.out.println("sJSonFormat: " + sJSonFormat);
      } catch (Exception Ex) {
        sResult = "{\"baseResponse\":{\"status\": 0,\"messege\":\"Failure\"},\"response\": {}";
      }  
    if (objEntity.getQuery_type().equals("logout"))
      try {
        sEmail = objEntity.getEmail();
        sPassword = objEntity.getPassword();
        System.out.println("query_type : " + objEntity.getQuery_type());
        System.out.println("email : " + sEmail);
        System.out.println("password : " + sPassword);
        sJSonFormat = String.valueOf(sJSonFormat) + this.objCommonService.function_sp_common_login_logout(objEntity).toString() + "}";
        sResult = sJSonFormat;
        System.out.println("sJSonFormat: " + sJSonFormat);
      } catch (Exception Ex) {
        sResult = "{\"baseResponse\":{\"status\": 0,\"messege\":\"Failure\"},\"response\": {}";
      }  
    return sResult;
  }
  
  //WORKING
  @RequestMapping(value = {"/api_vehicle_report"}, method = {RequestMethod.GET, RequestMethod.POST})
  @ResponseBody
  public String api_vehicle_report(@RequestBody CommonVehicleReportEntity objEntity, BindingResult result, Locale locale, HttpServletRequest request, Model model)
  {
    String sResult = "{}";
    String sJSonFormat = "{\"baseResponse\":{\"status\": 1,\"messege\":\"Success\"},\"response\": ";
    try
    {
        //sEmail = objEntity.getEmail();
        //sPassword = objEntity.getPassword();
        System.out.println("query_type --> " + objEntity.getQuery_type());
        //System.out.println("id_location : " + objEntity.getId_location());
        //System.out.println("password : " + sPassword);
        sJSonFormat = String.valueOf(sJSonFormat) + this.objCommonService.function_sp_common_vehicle_report(objEntity).toString() + "}";
        sResult = sJSonFormat;
        System.out.println("sJSonFormat: " + sJSonFormat);
    } 
    catch (Exception Ex)
    {
    	sResult = "{\"baseResponse\":{\"status\": 0,\"messege\":\"Failure\"},\"response\": {}";
    }  
    return sResult;
  }
}
