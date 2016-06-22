package com.integrationtest.DormBuild;

import org.junit.Test;

import junit.framework.TestCase;




public class DormBuildTest extends TestCase{


	private static final long serialVersionUID = 1L;
	static boolean CASE_SUB=false;
	public static String CASE_NUM="";
 
	public static boolean IT_TD_003_001_001() {
		CASE_NUM="IT_TD_003_001_001";
		
		if(!DormBuildServlet.DormBuild("1","","first","save")){
			return true;
		}
		return false;
	}
	public static boolean IT_TD_003_002_001(){
		CASE_NUM="IT_TD_003_002_001";
		if(! DormBuildServlet.DormBuild("6","6떠","six","")){
			return true;
		}
		return false;
	}
	public static boolean IT_TD_003_003_001(){
		CASE_NUM="IT_TD_003_003_001";
		if(! DormBuildServlet.DormBuild("1","1떠","first","save")){
			return true;
		}
		return false;
	}
	public static boolean IT_TD_003_004_001(){
		CASE_NUM="IT_TD_003_004_001";
		if(DormBuildServlet.DormBuild("6","6떠","six","save")){
			return true;
		}
		return false;
	}
	public static boolean IT_TD_004_001_001(){
		CASE_NUM="IT_TD_004_001_001";
		if(! DormBuildServlet.DormBuild("1","","first","preSave")){
			return true;
		}
		return false;
	}
	public static boolean IT_TD_004_002_001(){
		CASE_NUM="IT_TD_004_002_001";
		if(! DormBuildServlet.DormBuild("4","2떠","two","preSave")){
			return true;
		}
		return false;
	}
	public static boolean IT_TD_004_003_001(){
		CASE_NUM="IT_TD_004_003_001";
		if(! DormBuildServlet.DormBuild("1","1떠","first","")){
			return true;
		}
		return false;
	}
	public static boolean IT_TD_004_004_001(){
		CASE_NUM="IT_TD_004_004_001";
		if(DormBuildServlet.DormBuild("4","2떠","","preSave")){
			return true;
		}
		return false;
	}
	public static boolean IT_TD_004_005_001(){
		CASE_NUM="IT_TD_004_005_001";
		if(DormBuildServlet.DormBuild("1","1떠","first","preSave")){
			return true;
		}
		return false;
	}
	public static boolean IT_TD_004_006_001(){
		CASE_NUM="IT_TD_004_006_001";
		if(DormBuildServlet.DormBuild("1","11떠","first","preSave")){
			return true;
		}
		return false;
	}
	@Test
	public static void test(){
		
		
		assertEquals(IT_TD_003_001_001(),true);
		assertEquals(IT_TD_003_002_001(),true);
		assertEquals(IT_TD_003_003_001(),true);
		assertEquals(IT_TD_003_004_001(),true);
		assertEquals(IT_TD_004_001_001(),true);
		assertEquals(IT_TD_004_002_001(),true);
		assertEquals(IT_TD_004_003_001(),true);
		assertEquals(IT_TD_004_004_001(),true);
		assertEquals(IT_TD_004_005_001(),true);
		assertEquals(IT_TD_004_006_001(),true);
	}
	public static void main(String[] args){
		test();
	}
}
