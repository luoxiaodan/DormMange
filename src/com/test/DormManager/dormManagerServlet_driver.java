package com.test.DormManager;

import org.junit.Test;

import com.test.Login.loginServlet_UnitTest;

import junit.framework.TestCase;

public class dormManagerServlet_driver  extends TestCase{
	static boolean UT_TC_001_004_001_001=false;
	static boolean UT_TC_001_004_001_002=false;
	static boolean UT_TC_001_004_001_003=false;
	static boolean UT_TC_001_004_001_004=false;
	static boolean UT_TC_001_004_001_005=false;
	static boolean UT_TC_001_004_002_001=false;
	static boolean UT_TC_001_004_003_001=false;
	static boolean UT_TC_001_004_004_001=false;
	static boolean UT_TC_001_004_005_001=false;
	static boolean UT_TC_001_004_006_001=false;

	
	
	@Test
	public static void test(){
	if( dormManagerServlet_UnitTest.UT_TC_001_004_001_001()){
		UT_TC_001_004_001_001=true;		
	}
	if( dormManagerServlet_UnitTest.UT_TC_001_004_001_002()){
		UT_TC_001_004_001_002=true;		
	}
	if( dormManagerServlet_UnitTest.UT_TC_001_004_001_003()){
		UT_TC_001_004_001_003=true;		
	}
	if( dormManagerServlet_UnitTest.UT_TC_001_004_001_004()){
		UT_TC_001_004_001_004=true;		
	}
	if( dormManagerServlet_UnitTest.UT_TC_001_004_001_005()){
		UT_TC_001_004_001_005=true;		
	}
	if( dormManagerServlet_UnitTest.UT_TC_001_004_002_001()){
		UT_TC_001_004_002_001=true;		
	}
	if( dormManagerServlet_UnitTest.UT_TC_001_004_003_001()){
		UT_TC_001_004_003_001=true;		
	}
	if( dormManagerServlet_UnitTest.UT_TC_001_004_004_001()){
		UT_TC_001_004_004_001=true;		
	}
	if( dormManagerServlet_UnitTest.UT_TC_001_004_005_001()){
		UT_TC_001_004_005_001=true;		
	}
	if( dormManagerServlet_UnitTest.UT_TC_001_004_006_001()){
		UT_TC_001_004_006_001=true;		
	}
	assertEquals(UT_TC_001_004_001_001,true);
	assertEquals(UT_TC_001_004_001_002,true);
	assertEquals(UT_TC_001_004_001_003,true);
	assertEquals(UT_TC_001_004_001_004,true);
	assertEquals(UT_TC_001_004_001_005,true);
	assertEquals(UT_TC_001_004_002_001,true);
	assertEquals(UT_TC_001_004_003_001,true);
	assertEquals(UT_TC_001_004_004_001,true);
	assertEquals(UT_TC_001_004_005_001,true);
	assertEquals(UT_TC_001_004_006_001,true);
	}
	
	
	public static void main(String[] args){
		test();
	}

}
