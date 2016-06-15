package com.test.DormBuild;

import java.io.IOException;

import javax.servlet.ServletException;

import com.test.Login.LoginServlet;
import com.test.Login.loginServlet_stub;

public class dormBuildServlet_UnitTest {

	static boolean CASE_SUB=false;
	public static String CASE_NUM="";
 
	public static boolean UT_TC_001_002_001_001() {
		CASE_NUM="UT_TC_001_002_001_001";
		
		if(!DormBuildServlet.DormBuild("1","","first","save")&&dormBuildServlet_stub.STUB_SUC==false){
			return CASE_SUB=true;
		}
		return CASE_SUB;
	}
	public static boolean UT_TC_001_002_002_001(){
		CASE_NUM="UT_TC_001_002_002_001";
		if(! DormBuildServlet.DormBuild("6","6떠","six","")&&dormBuildServlet_stub.STUB_SUC==false){
			return CASE_SUB=true;
		}
		return CASE_SUB;
	}
	public static boolean UT_TC_001_002_003_001(){
		CASE_NUM="UT_TC_001_002_003_001";
		if(! DormBuildServlet.DormBuild("1","1떠","first","save")&&dormBuildServlet_stub.STUB_SUC==true){
			return CASE_SUB=true;
		}
		return CASE_SUB;
	}
	public static boolean UT_TC_001_002_004_001(){
		CASE_NUM="UT_TC_001_002_004_001";
		if(DormBuildServlet.DormBuild("6","6떠","six","save")&&dormBuildServlet_stub.STUB_SUC==true){
			return CASE_SUB=true;
		}
		return CASE_SUB;
	}
	public static boolean UT_TC_001_003_001_001(){
		CASE_NUM="UT_TC_001_003_001_001";
		if(! DormBuildServlet.DormBuild("1","","first","preSave")&&dormBuildServlet_stub.STUB_SUC==false){
			return CASE_SUB=true;
		}
		return CASE_SUB;
	}
	public static boolean UT_TC_001_003_002_001(){
		CASE_NUM="UT_TC_001_003_002_001";
		if(! DormBuildServlet.DormBuild("2","2떠","two","preSave")&&dormBuildServlet_stub.STUB_SUC==true){
			return CASE_SUB=true;
		}
		return CASE_SUB;
	}
	public static boolean UT_TC_001_003_003_001(){
		CASE_NUM="UT_TC_001_003_003_001";
		if(! DormBuildServlet.DormBuild("1","1떠","first","")&&dormBuildServlet_stub.STUB_SUC==false){
			return CASE_SUB=true;
		}
		return CASE_SUB;
	}
	public static boolean UT_TC_001_003_004_001(){
		CASE_NUM="UT_TC_001_003_004_001";
		if(! DormBuildServlet.DormBuild("2","2떠","","preSave")&&dormBuildServlet_stub.STUB_SUC==true){
			return CASE_SUB=true;
		}
		return CASE_SUB;
	}
	public static boolean UT_TC_001_003_005_001(){
		CASE_NUM="UT_TC_001_003_005_001";
		if(! DormBuildServlet.DormBuild("1","1떠","first","preSave")&&dormBuildServlet_stub.STUB_SUC==true){
			return CASE_SUB=true;
		}
		return CASE_SUB;
	}
	public static boolean UT_TC_001_003_006_001(){
		CASE_NUM="UT_TC_001_003_006_001";
		if(DormBuildServlet.DormBuild("1","11떠","first","preSave")&&dormBuildServlet_stub.STUB_SUC==true){
			return CASE_SUB=true;
		}
		return CASE_SUB;
	}
}
