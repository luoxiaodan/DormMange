package com.test.DormBuild;

import org.junit.Test;

import junit.framework.TestCase;

public class dormBuildServlet_driver extends TestCase{
	
	static boolean UT_TC_001_002_001_001=false;
	static boolean UT_TC_001_002_002_001=false;
	static boolean UT_TC_001_002_003_001=false;
	static boolean UT_TC_001_002_004_001=false;
	static boolean UT_TC_001_003_001_001=false;
	static boolean UT_TC_001_003_002_001=false;
	static boolean UT_TC_001_003_003_001=false;
	static boolean UT_TC_001_003_004_001=false;
	static boolean UT_TC_001_003_005_001=false;
	static boolean UT_TC_001_003_006_001=false;
	
	@Test
	public static void test(){
		if(dormBuildServlet_UnitTest.UT_TC_001_002_001_001()){
			UT_TC_001_002_001_001=true;
		}
		if(dormBuildServlet_UnitTest.UT_TC_001_002_002_001()){
			UT_TC_001_002_002_001=true;
		}
		if(dormBuildServlet_UnitTest.UT_TC_001_002_003_001()){
			UT_TC_001_002_003_001=true;
		}
		if(dormBuildServlet_UnitTest.UT_TC_001_002_004_001()){
			UT_TC_001_002_004_001=true;
		}
		if(dormBuildServlet_UnitTest.UT_TC_001_003_001_001()){
			UT_TC_001_003_001_001=true;
		}
		if(dormBuildServlet_UnitTest.UT_TC_001_003_002_001()){
			UT_TC_001_003_002_001=true;
		}
		if(dormBuildServlet_UnitTest.UT_TC_001_003_003_001()){
			UT_TC_001_003_003_001=true;
		}
		if(dormBuildServlet_UnitTest.UT_TC_001_003_004_001()){
			UT_TC_001_003_004_001=true;
		}
		if(dormBuildServlet_UnitTest.UT_TC_001_003_005_001()){
			UT_TC_001_003_005_001=true;
		}
		if(dormBuildServlet_UnitTest.UT_TC_001_003_006_001()){
			UT_TC_001_003_006_001=true;
		}
		assertEquals(UT_TC_001_002_001_001,true);
		assertEquals(UT_TC_001_002_002_001,true);
		assertEquals(UT_TC_001_002_003_001,true);
		assertEquals(UT_TC_001_002_004_001,true);
		assertEquals(UT_TC_001_003_001_001,true);
		assertEquals(UT_TC_001_003_002_001,true);
		assertEquals(UT_TC_001_003_003_001,true);
		assertEquals(UT_TC_001_003_004_001,true);
		assertEquals(UT_TC_001_003_005_001,true);
		assertEquals(UT_TC_001_003_006_001,true);
		
		
		}
		public static void main(String[] args){
			test();
		}
	
}
