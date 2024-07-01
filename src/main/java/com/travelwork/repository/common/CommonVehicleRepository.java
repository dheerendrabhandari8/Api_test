package com.travelwork.repository.common;

import java.util.List;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.travelwork.entity.common.CommonVehicleReportEntity;

public interface CommonVehicleRepository extends CrudRepository<CommonVehicleReportEntity, Integer>
{
  @Procedure(procedureName = "sp_common_vehicle_report")
  List<CommonVehicleReportEntity> function_sp_common_vehicle_report(
		  @Param("query_type") String paramString1, 
		  @Param("id_location") String paramString2,
		  @Param("vehicle_no") String paramString3,
		  @Param("vehicle_model") String paramString4,
		  @Param("job_card_no") String paramString5,
		  @Param("advisor_name") String paramString6,
		  @Param("floor_status") String paramString7,
		  @Param("danting") String paramString8,
		  @Param("panting") String paramString9,
		  @Param("fitting") String paramString10,
		  @Param("fi") String paramString11,
		  @Param("status") String paramString12,
		  @Param("pna") String paramString13,
		  @Param("progress") String paramString14,
		  @Param("id_vehicle_data") String paramStrin15);
}
