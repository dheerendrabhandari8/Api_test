package com.travelwork.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.mysql.cj.jdbc.CallableStatement;
//import org.json.JSONArray;
//import org.json.JSONObject;

@Service
public class DB_return_resultset
{
	//@Value("${spring.datasource.url}")
	private String spring_datasource_url="jdbc:mysql://localhost:3306/db_dashboard";
	//@Value("${spring.datasource.username}")
	private String spring_datasource_username="root";
	//@Value("${spring.datasource.password}")
	//private String spring_datasource_password="Root@123";
	//private String spring_datasource_password="admin";
	private String spring_datasource_password="root";
	//@Value("${spring.datasource.driver-class-name}")
	private String spring_datasource_driver="com.mysql.cj.jdbc.Driver";
	//public ResultSet DB_Query_Return(String sQuery)
	public Map<String,String> objMap(String sQuery)
	{
		//List<String> objList = new ArrayList<String>();
		Map<String,String> objList = new HashMap<String, String>(); 
		ResultSet objResultSet=null;
		/*System.out.println("1 : "+spring_datasource_url);
		System.out.println("2 : "+spring_datasource_username);
		System.out.println("3 : "+spring_datasource_password);
		System.out.println("4 : "+spring_datasource_driver);*/
		try
		{
			System.out.println("sQuery : "+sQuery);
			Class.forName(spring_datasource_driver);//("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection(spring_datasource_url,spring_datasource_username,spring_datasource_password);//("jdbc:mysql://localhost:3306/db_dashboard","root","admin");  
			Statement stmt=con.createStatement();
			objResultSet=stmt.executeQuery(sQuery);
			ResultSetMetaData rsmd = objResultSet.getMetaData();
			
			int column_count = rsmd.getColumnCount();
			
			System.out.println("column_count : "+column_count);
			
			/*System.out.println(rsmd.getColumnLabel(1)+" : "+rsmd.getColumnName(1));
			System.out.println(rsmd.getColumnLabel(2)+" : "+rsmd.getColumnName(2));
			System.out.println(rsmd.getColumnLabel(3)+" : "+rsmd.getColumnName(3));
			System.out.println(rsmd.getColumnLabel(4)+" : "+rsmd.getColumnName(4));
			System.out.println(rsmd.getColumnLabel(5)+" : "+rsmd.getColumnName(5));
			System.out.println(rsmd.getColumnLabel(6)+" : "+rsmd.getColumnName(6));
			System.out.println(rsmd.getColumnLabel(7)+" : "+rsmd.getColumnName(7));
			System.out.println(rsmd.getColumnLabel(8)+" : "+rsmd.getColumnName(8));
			System.out.println(rsmd.getColumnLabel(9)+" : "+rsmd.getColumnName(9));
			System.out.println(rsmd.getColumnLabel(10)+" : "+rsmd.getColumnName(10));*/			
			
			/*
			//TO GET HEADING
			*/
			//System.out.println(rsmd.getColumnName(11));
			
			//for(int i=2;i<=column_count;i++)
			{
				//System.out.println(objResultSet.next());
				//System.out.println(objResultSet.next());
			}
			while(objResultSet.next())
			{
				for(int i=1;i<=column_count;i++)
				{
					if(isInteger(objResultSet.getString(i),10)==true)
						objList.put(rsmd.getColumnName(i),Integer.toString(objResultSet.getInt(i)));
					else
						objList.put(rsmd.getColumnName(i),objResultSet.getString(i));
				}
				//objList.add(Integer.toString(objResultSet.getInt(0)));
				//objList.add(objResultSet.getString(1));
				
				//System.out.println(objResultSet.getString(2));
				//objList.add(objResultSet.getString(2));				
			}
			
			
			System.out.println("objList : --> "+objList);
			
			/*int c=0;
			for(Map.Entry entry:objList.entrySet())
			{
				System.out.println("AAAAA "+c);c=c+1;
				System.out.println(entry.getKey()+":"+entry.getValue());
			}*/
			//System.out.println(objResultSet.getString(1));
			//System.out.println(objResultSet.getString(2));
			//System.out.println(objResultSet.getString(3));
			//System.out.println(objResultSet.getString(4));
			//System.out.println(objResultSet.getString(5));
			//System.out.println(objResultSet.getString(6));
			//System.out.println(objResultSet.getString(7));
			//System.out.println(objResultSet.getString(8));
			//System.out.println(objResultSet.getString(9));
			//System.out.println(objResultSet.getString(10));
			con.close();
		}catch(Exception e){ System.out.println("ERROR_JDBC : "+e);}	
		
		return objList;
	}
	
	public Map<String,String> DB_Query_Return_Column(String sQuery)
	{
		Map<String,String> row = new HashMap();
		//HashMap row = new HashMap();
		ResultSet objResultSet=null;
		try
		{
			Class.forName(spring_datasource_driver);//("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection(spring_datasource_url,spring_datasource_username,spring_datasource_password);//("jdbc:mysql://localhost:3306/db_dashboard","root","admin");  
			Statement stmt=con.createStatement();
			objResultSet=stmt.executeQuery(sQuery);
			System.out.println("sQuery : "+sQuery);
			
			ResultSetMetaData rsmd = objResultSet.getMetaData();
			int column_count = rsmd.getColumnCount();
			System.out.println("column_count : "+column_count);
			//System.out.println("------------------DATA------------------");
			int i=0;
			while (objResultSet.next())
			{
				//for (int i = 1; i <= column_count; i++)
			    {
					/*String columnAstring = objResultSet.getString(1);
				    String columnBstring = objResultSet.getString(2);
				    String columnCstring = objResultSet.getString(3);
				    String columnDstring = objResultSet.getString(4);
				    String columnEstring = objResultSet.getString(5);
				    String columnFstring = objResultSet.getString(6);
				    String columnGstring = objResultSet.getString(7);
				    String columnHstring = objResultSet.getString(8);
				    String columnIstring = objResultSet.getString(9);
				    String columnJstring = objResultSet.getString(10);*/
				    
//System.out.println(objResultSet.getString(1)+","+objResultSet.getString(2)+","+objResultSet.getString(3)+","+objResultSet.getString(4)+","+objResultSet.getString(5)+","+objResultSet.getString(6));
				    //System.out.println(objResultSet.getString(1)+"----"+objResultSet.getString(2));
					//row.put(i, objResultSet.getString(1)+":"+objResultSet.getString(2));i=i+1;
				    //row.put(objResultSet.getString(1)+":"+ (String.valueOf(i)), objResultSet.getString(2));
				    //i=i+1;
					//System.out.println("DATA_ADDED_SUCCESSFULLY");
			    }			    
			    row.put(objResultSet.getString(1), objResultSet.getString(2));
			}
			
			/*List<String> keyList = new ArrayList(row.keySet());
			List<String> valueList = new ArrayList(row.values());
			
			System.out.println("Key List: " + keyList);
	        System.out.println("Value List: " + valueList);*/
	        
			//System.out.println("FUNCTION_DOUBLE--START");
			//System.out.println("sQuery : "+sQuery);
			//System.out.println("column_count : "+column_count);
			//System.out.println("objResultSet : "+objResultSet);
			con.close();
		}catch(Exception e){ System.out.println("ERROR_JDBC : "+e);}	
		
		return row;
	}
	
	//public Map<String,String> DB_Query_Return_Column_Heading(String sQuery)
	public String DB_Query_Return_Column_Heading(String sQuery)
	{
		String sResult="";
		Integer iFound=0; 
		
		Map<String,String> row = new HashMap();
		//HashMap row = new HashMap();
		ResultSet objResultSet=null;
		
		try
		{
			Class.forName(spring_datasource_driver);//("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection(spring_datasource_url,spring_datasource_username,spring_datasource_password);//("jdbc:mysql://localhost:3306/db_dashboard","root","admin");  
			Statement stmt=con.createStatement();
			objResultSet=stmt.executeQuery(sQuery);
			//System.out.println("sQuery : "+sQuery);
			
			ResultSetMetaData rsmd = objResultSet.getMetaData();
			int column_count = rsmd.getColumnCount();
			//System.out.println("column_count : "+column_count);
			
			//System.out.println("------------------DATA------------------");
			//sResult="{\"baseResponse\":{\"status\":1,\"messege\":\"Success\"},\"response\":[";
			//sResult="[";
			sResult="{\"baseResponse\": {\"status\": 1,\"messege\": \"Success\"},\"response\":[";
			while (objResultSet.next())
			{
				for(int j=0;j<=column_count;j++)
				{
					iFound=1;
					if(j==0)
						sResult=sResult+"{";
					else
					{
						sResult=sResult+ "\""+rsmd.getColumnName(j)+"\""+":"+"\""+objResultSet.getString(j)+"\",";
					
						if(j==column_count)
						{
							sResult=sResult+"},";
							sResult=sResult.replace(",},", "},");									
						}
					}					
				}
			}
			
			StringBuffer sb= new StringBuffer(sResult);
			if(iFound==1)
			{
				sb.deleteCharAt(sb.length()-1);  
				sResult=sb.toString()+"]}";
			}
			else
				sResult="";
			
			/*List<String> keyList = new ArrayList(row.keySet());
			List<String> valueList = new ArrayList(row.values());
			
			System.out.println("Key List: " + keyList);
	        System.out.println("Value List: " + valueList);*/
	        
			//System.out.println("FUNCTION_DOUBLE--START");
			//System.out.println("sQuery : "+sQuery);
			//System.out.println("column_count : "+column_count);
			//System.out.println("objResultSet : "+objResultSet);
			con.close();
		}catch(Exception e){ System.out.println("ERROR_JDBC : "+e);}	
		
		return sResult;//row;
	}
	
	public String DB_Query_Update(String sQuery)
	{
		String sResult="0";		
		try
		{
			Class.forName(spring_datasource_driver);//("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection(spring_datasource_url,spring_datasource_username,spring_datasource_password);//("jdbc:mysql://localhost:3306/db_dashboard","root","admin");  
			Statement stmt=con.createStatement();
			int updateCount = stmt.executeUpdate(sQuery);
			sResult=Integer.toString(updateCount);
			System.out.println("Update Result : "+sResult);
		}catch(Exception e){System.out.println("ERROR : "+e);}
		
		return sResult;
	}
	
	public int DB_SP_Login(int id_employee)
	{		
		int Result=0;
		try
		{
			Class.forName(spring_datasource_driver);//("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection(spring_datasource_url,spring_datasource_username,spring_datasource_password);//("jdbc:mysql://localhost:3306/db_dashboard","root","admin");  
			//Statement stmt=con.createStatement();
			
			CallableStatement cstmt = (CallableStatement) con.prepareCall("{call sp_user_login(?)}");
			cstmt.setInt(1,id_employee);
			cstmt.executeUpdate();
			Result=1;
			//int updateCount = stmt.executeUpdate(sQuery);
			//sResult=Integer.toString(updateCount);
		}catch(Exception e){System.out.println("ERROR : "+e);}
		
		return Result;
	}
	
	public int DB_SP_Logout(int id_employee)
	{		
		int Result=0;
		try
		{
			Class.forName(spring_datasource_driver);//("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection(spring_datasource_url,spring_datasource_username,spring_datasource_password);//("jdbc:mysql://localhost:3306/db_dashboard","root","admin");  
			//Statement stmt=con.createStatement();
			
			CallableStatement cstmt = (CallableStatement) con.prepareCall("{call sp_user_logout(?)}");
			cstmt.setInt(1,id_employee);
			cstmt.executeUpdate();
			Result=1;
			//int updateCount = stmt.executeUpdate(sQuery);
			//sResult=Integer.toString(updateCount);
		}catch(Exception e){System.out.println("ERROR : "+e);}
		
		return Result;
	}
	
	public String DB_sp_get_url_list(int idata,int ipagedata,String searchType, String searchdata)
	{
		String sResult="";
		Integer iFound=0;
		Map<String,String> row = new HashMap();
		ResultSet objResultSet=null;
		try
		{
			Class.forName(spring_datasource_driver);  
			Connection con=DriverManager.getConnection(spring_datasource_url,spring_datasource_username,spring_datasource_password);//("jdbc:mysql://localhost:3306/db_dashboard","root","admin");  
			
			String sSP="";
			
			if(searchType.equals("default")==true) {sSP="{call sp_get_url_list(?,?)}";}
			if(searchType.equals("vertical")==true) {sSP="{call sp_get_url_list_by_vertical_name(?,?,?)}";}
			if(searchType.equals("user")==true) {sSP="{call sp_get_url_list_by_user_name(?,?,?)}";}
			if(searchType.equals("product")==true) {sSP="{call sp_get_url_list_by_product_name(?,?,?)}";}			
			
			CallableStatement cstmt = (CallableStatement) con.prepareCall(sSP);
			if(searchType.equals("default")==true) 
				{cstmt.setInt(1,idata);cstmt.setInt(2,ipagedata);}
			else
				{cstmt.setInt(1,idata);cstmt.setInt(2,ipagedata);cstmt.setString(3,searchdata);}			
			
			objResultSet=cstmt.executeQuery();
			
			ResultSetMetaData rsmd = objResultSet.getMetaData();
			int column_count = rsmd.getColumnCount();
			sResult="{\"baseResponse\": {\"status\": 1,\"messege\": \"Success\"},\"response\":[";
			while (objResultSet.next())
			{
				for(int j=0;j<=column_count;j++)
				{
					iFound=1;
					if(j==0)
						sResult=sResult+"{";
					else
					{
						sResult=sResult+ "\""+rsmd.getColumnName(j)+"\""+":"+"\""+objResultSet.getString(j)+"\",";
					
						if(j==column_count)
						{
							sResult=sResult+"},";
							sResult=sResult.replace(",},", "},");									
						}
					}					
				}
			}
			
			StringBuffer sb= new StringBuffer(sResult);
			if(iFound==1)
			{
				sb.deleteCharAt(sb.length()-1);  
				sResult=sb.toString()+"]}";
			}
			else
				sResult="";
			
			con.close();
		}catch(Exception e){ System.out.println("ERROR_JDBC : "+e);}	
		
		return sResult;//row;
	}
	
	public String DB_sp_update_url(int id_url_in, int id_vertical_in,String keywords_in,String product_name_in, String url_in, String url_rank_in, String url_type_in, int isactive_in)
	{
		System.out.println("DB_sp_update_url--START");
		System.out.println("url_rank_in : "+url_rank_in);
		String sResult="";
		Integer iFound=0;
		Map<String,String> row = new HashMap();
		ResultSet objResultSet=null;
		try
		{
			Class.forName(spring_datasource_driver);  
			Connection con=DriverManager.getConnection(spring_datasource_url,spring_datasource_username,spring_datasource_password);//("jdbc:mysql://localhost:3306/db_dashboard","root","admin");  
			
			//String sSP="{call sp_update_url(?,?,?,?,?,?,?,?)}";
			String sSP="{call sp_update_url(?,?,?,?,?,?,?,?)}";
			
			CallableStatement cstmt = (CallableStatement) con.prepareCall(sSP);
			cstmt.setInt(1,id_url_in);			//IN id_url_in INT
			cstmt.setInt(2,id_vertical_in);		//IN id_vertical_in INT
			cstmt.setString(3,keywords_in);		//IN keywords_in varchar(100)
			cstmt.setString(4,product_name_in);	//IN product_name_in varchar(100)
			cstmt.setString(5,url_in);			//IN url_in varchar(500)
			cstmt.setString(6,url_rank_in);		//IN url_rank_in varchar(5)
			cstmt.setString(7,url_type_in);		//IN url_type_in varchar(50)
			cstmt.setInt(8,isactive_in);	//IN isactive_in INT
			
			objResultSet=cstmt.executeQuery();
			
			ResultSetMetaData rsmd = objResultSet.getMetaData();
			int column_count = rsmd.getColumnCount();
			sResult="{\"baseResponse\": {\"status\": 1,\"messege\": \"Success\"},\"response\":[\"DONE\"]}";
			con.close();
		}catch(Exception e){ System.out.println("ERROR_JDBC : "+e);}		
		return sResult;//row;
	}
	
	public String DB_sp_timesheet(int id_employee)
	{		
		String sResult="";
		Integer iFound=0;
		Map<String,String> row = new HashMap();
		ResultSet objResultSet=null;
		try
		{
			Class.forName(spring_datasource_driver);  
			Connection con=DriverManager.getConnection(spring_datasource_url,spring_datasource_username,spring_datasource_password);//("jdbc:mysql://localhost:3306/db_dashboard","root","admin");  
			
			//String sSP="{call sp_update_url(?,?,?,?,?,?,?,?)}";
			String sSP="{call sp_timesheet_user_all()}";
			
			if(id_employee!=0)
				sSP="{call sp_timesheet_user(?)}";
			
			CallableStatement cstmt = (CallableStatement) con.prepareCall(sSP);
			cstmt.setInt(1,id_employee);			//IN id_url_in INT
			objResultSet=cstmt.executeQuery();
			
			ResultSetMetaData rsmd = objResultSet.getMetaData();
			int column_count = rsmd.getColumnCount();
			sResult="{\"baseResponse\": {\"status\": 1,\"messege\": \"Success\"},\"response\":[";
			while (objResultSet.next())
			{
				for(int j=0;j<=column_count;j++)
				{
					iFound=1;
					if(j==0)
						sResult=sResult+"{";
					else
					{
						sResult=sResult+ "\""+rsmd.getColumnName(j)+"\""+":"+"\""+objResultSet.getString(j)+"\",";
					
						if(j==column_count)
						{
							sResult=sResult+"},";
							sResult=sResult.replace(",},", "},");									
						}
					}					
				}
			}
			
			StringBuffer sb= new StringBuffer(sResult);
			if(iFound==1)
			{
				sb.deleteCharAt(sb.length()-1);  
				sResult=sb.toString()+"]}";
			}
			else
				sResult="";
			
			con.close();
		}catch(Exception e){ System.out.println("ERROR_JDBC : "+e);}		
		return sResult;//row;
	}
	
	public String DB_sp_timesheet_user_search(int id_employee,String sdate_start, String sdate_end)
	{		
		String sResult="";
		Integer iFound=0;
		Map<String,String> row = new HashMap();
		ResultSet objResultSet=null;
		try
		{
			Class.forName(spring_datasource_driver);  
			Connection con=DriverManager.getConnection(spring_datasource_url,spring_datasource_username,spring_datasource_password);//("jdbc:mysql://localhost:3306/db_dashboard","root","admin");  
			
			//String sSP="{call sp_update_url(?,?,?,?,?,?,?,?)}";
			String sSP="{call sp_timesheet_user_search_all()}";
			
			if(id_employee!=0)
				sSP="{call sp_timesheet_user_search(?,?,?)}";
			
			CallableStatement cstmt = (CallableStatement) con.prepareCall(sSP);
			cstmt.setInt(1,id_employee);
			cstmt.setString(2,sdate_start);
			cstmt.setString(3,sdate_end);
			
			objResultSet=cstmt.executeQuery();
			
			ResultSetMetaData rsmd = objResultSet.getMetaData();
			int column_count = rsmd.getColumnCount();
			sResult="{\"baseResponse\": {\"status\": 1,\"messege\": \"Success\"},\"response\":[";
			while (objResultSet.next())
			{
				for(int j=0;j<=column_count;j++)
				{
					iFound=1;
					if(j==0)
						sResult=sResult+"{";
					else
					{
						sResult=sResult+ "\""+rsmd.getColumnName(j)+"\""+":"+"\""+objResultSet.getString(j)+"\",";
					
						if(j==column_count)
						{
							sResult=sResult+"},";
							sResult=sResult.replace(",},", "},");									
						}
					}
				}
			}
			
			StringBuffer sb= new StringBuffer(sResult);
			if(iFound==1)
			{
				sb.deleteCharAt(sb.length()-1);  
				sResult=sb.toString()+"]}";
			}
			else
				sResult="";
			
			con.close();
		}catch(Exception e){ System.out.println("ERROR_JDBC : "+e);}		
		return sResult;//row;
	}
	
	public String DB_sp_keywords_findby_url(String url_in)
	{
		String sResult="";
		
		Integer iFound=0;
		Map<String,String> row = new HashMap();
		ResultSet objResultSet=null;
		try
		{
			Class.forName(spring_datasource_driver);  
			Connection con=DriverManager.getConnection(spring_datasource_url,spring_datasource_username,spring_datasource_password);
			String sSP="{call sp_keywords_findby_url(?,?)}";
			
			CallableStatement cstmt = (CallableStatement) con.prepareCall(sSP);
			cstmt.setString(1,url_in);
			cstmt.registerOutParameter(2, java.sql.Types.VARCHAR);
			//String result = cstmt.getString(2);
			//System.out.println("result : "+result);
			
			cstmt.execute();
			sResult = cstmt.getString(2);
			//System.out.println("sResult : "+sResult);
			//objResultSet=cstmt.executeQuery();
			//ResultSetMetaData rsmd = objResultSet.getMetaData();
			//int column_count = rsmd.getColumnCount();
			/*sResult="{\"baseResponse\": {\"status\": 1,\"messege\": \"Success\"},\"response\":[";
			while (objResultSet.next())
			{
				for(int j=0;j<=column_count;j++)
				{
					iFound=1;
					if(j==0)
						sResult=sResult+"{";
					else
					{
						sResult=sResult+ "\""+rsmd.getColumnName(j)+"\""+":"+"\""+objResultSet.getString(j)+"\",";
					
						if(j==column_count)
						{
							sResult=sResult+"},";
							sResult=sResult.replace(",},", "},");									
						}
					}
				}
			}*/
			
			/*StringBuffer sb= new StringBuffer(sResult);
			if(iFound==1)
			{
				sb.deleteCharAt(sb.length()-1);  
				sResult=sb.toString()+"]}";
			}
			else
				sResult="";
			
			System.out.println("sResult : "+sResult);*/
			con.close();
			
		}catch(Exception e){ System.out.println("ERROR_JDBC : "+e);}
		return sResult;
	}
	
	public static boolean isInteger(String s, int radix)
	{
	    if(s.isEmpty()) return false;
	    for(int i = 0; i < s.length(); i++)
	    {
	        if(i == 0 && s.charAt(i) == '-')
	        {
	            if(s.length() == 1) return false;
	            else continue;
	        }
	        if(Character.digit(s.charAt(i),radix) < 0) return false;
	    }
	    return true;
	}
}
