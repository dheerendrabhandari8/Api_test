package com.travelwork.repository.common;

import com.travelwork.entity.common.CommonLoginLogoutEntity;
import java.util.List;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface CommonLoginLogoutRepository extends CrudRepository<CommonLoginLogoutEntity, Integer>
{
  @Procedure(procedureName = "sp_common_login_logout")
  List<CommonLoginLogoutEntity> function_sp_common_login_logout(@Param("query_type") String paramString1, @Param("email") String paramString2, @Param("password") String paramString3, @Param("user_ip") String paramString4);
}
