package com.test.Login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.lero.dao.DormBuildDao;
import com.lero.model.Admin;
import com.lero.model.DormManager;
import com.lero.model.Student;

public class loginServlet_stub {
	public static boolean STUB_SUC=false;
	
	public static Admin adminLogin(Connection con,Admin admin) throws SQLException{
		Admin resultAdmin = null;
		if(loginServlet_UnitTest.CASE_NUM.equals("UT_TC_001_001_002_001")||
		   loginServlet_UnitTest.CASE_NUM.equals("UT_TC_001_001_003_001")||
		   loginServlet_UnitTest.CASE_NUM.equals("UT_TC_001_001_003_002")||
		   loginServlet_UnitTest.CASE_NUM.equals("UT_TC_001_001_004_001")||
		   loginServlet_UnitTest.CASE_NUM.equals("UT_TC_001_001_006_001")){
			
			STUB_SUC=true;
			if(loginServlet_UnitTest.CASE_NUM.equals("UT_TC_001_001_006_001")){
				resultAdmin=new Admin("admin","111");
			}
		}
		return resultAdmin;
		
	}
	
	public static DormManager managerLogin(Connection con, DormManager dormManager) throws SQLException{
		DormManager resultDormManager = null;
		if(loginServlet_UnitTest.CASE_NUM.equals("UT_TC_001_001_002_002")||
			loginServlet_UnitTest.CASE_NUM.equals("UT_TC_001_001_003_003")||
			loginServlet_UnitTest.CASE_NUM.equals("UT_TC_001_001_003_004")||
			loginServlet_UnitTest.CASE_NUM.equals("UT_TC_001_001_004_002")||
			loginServlet_UnitTest.CASE_NUM.equals("UT_TC_001_001_006_002")){
					
			STUB_SUC=true;
			if(loginServlet_UnitTest.CASE_NUM.equals("UT_TC_001_001_006_002")){
				resultDormManager=new DormManager("manager2","555");
			}
		}
		return resultDormManager;
	
	}
	
	public static Student studentLogin(Connection con, Student student) throws Exception{
		Student resultStudent = null;
		if(loginServlet_UnitTest.CASE_NUM.equals("UT_TC_001_001_002_003")||
		   loginServlet_UnitTest.CASE_NUM.equals("UT_TC_001_001_003_005")||
		   loginServlet_UnitTest.CASE_NUM.equals("UT_TC_001_001_003_006")||
		   loginServlet_UnitTest.CASE_NUM.equals("UT_TC_001_001_004_003")||
		   loginServlet_UnitTest.CASE_NUM.equals("UT_TC_001_001_006_003")){
					
			STUB_SUC=true;
			if(loginServlet_UnitTest.CASE_NUM.equals("UT_TC_001_001_006_003")){
				resultStudent=new Student("002","123");
			}
		}
		return resultStudent;
	}

}
