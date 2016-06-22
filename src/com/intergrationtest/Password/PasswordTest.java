package com.intergrationtest.Password;

import com.integrationtest.Login.LoginServlet;

import junit.framework.TestCase;

public class PasswordTest extends TestCase{

	private static final long serialVersionUID = 1L;
	static boolean CASE_SUB=false;
	public static String CASE_NUM="";
 
	public static boolean IT_TD_002_001_001(){
		CASE_NUM="IT_TD_002_001_001";
		if(!PasswordServlet.passwordChange("","111","222","222")){
			return true;
		}
		return false;
	}
	public static boolean IT_TD_002_001_002(){
		CASE_NUM="IT_TD_002_001_002";
		if(!PasswordServlet.passwordChange("admin","","222","222")){
			return true;
		}
		return false;
	}
	public static boolean IT_TD_002_001_003(){
		CASE_NUM="IT_TD_002_001_003";
		if(!PasswordServlet.passwordChange("admin","111","","222")){
			return true;
		}
		return false;
	}
	public static boolean IT_TD_002_001_004(){
		CASE_NUM="IT_TD_002_001_004";
		if(!PasswordServlet.passwordChange("admin","111","222","")){
			return true;
		}
		return false;
	}
	
	
	public static boolean IT_TD_002_002_001(){
		CASE_NUM="IT_TD_002_002_001";
		if(!PasswordServlet.passwordChange("admin","999","222","222")){
			return true;
		}
		return false;
	}
	public static boolean IT_TD_002_002_002(){
		CASE_NUM="IT_TD_002_002_002";
		if(!PasswordServlet.passwordChange("dormManager","999","222","222")){
			return true;
		}
		return false;
	}
	public static boolean IT_TD_002_002_003(){
		CASE_NUM="IT_TD_002_002_003";
		if(!PasswordServlet.passwordChange("student","999","222","222")){
			return true;
		}
		return false;
	}
	public static boolean IT_TD_002_003_001(){
		CASE_NUM="IT_TD_002_003_001";
		if(!PasswordServlet.passwordChange("admin","999","222","333")){
			return true;
		}
		return false;
	}
	public static boolean IT_TD_002_003_002(){
		CASE_NUM="IT_TD_002_003_002";
		if(!PasswordServlet.passwordChange("dormManager","999","222","333")){
			return true;
		}
		return false;
	}
	public static boolean IT_TD_002_003_003(){
		CASE_NUM="IT_TD_002_003_003";
		if(!PasswordServlet.passwordChange("student","999","222","333")){
			return true;
		}
		return false;
	}
	
	public static boolean IT_TD_002_004_001(){
		CASE_NUM="IT_TD_002_004_001";
		if(PasswordServlet.passwordChange("admin","111","222","222")){
			return true;
		}
		return false;
	}
	public static boolean IT_TD_002_004_002(){
		CASE_NUM="IT_TD_002_004_002";
		if(PasswordServlet.passwordChange("dormManager","555","222","222")){
			return true;
		}
		return false;
	}
	public static boolean IT_TD_002_004_003(){
		CASE_NUM="IT_TD_002_004_003";
		if(PasswordServlet.passwordChange("student","123","222","222")){
			return true;
		}
		return false;
	}
	
	public static void test(){
		
		
		assertEquals(IT_TD_002_001_001(),true);
		assertEquals(IT_TD_002_001_002(),true);
		assertEquals(IT_TD_002_001_003(),true);
		assertEquals(IT_TD_002_001_004(),true);
		assertEquals(IT_TD_002_002_001(),true);
		assertEquals(IT_TD_002_002_002(),true);
		assertEquals(IT_TD_002_002_003(),true);
		assertEquals(IT_TD_002_003_001(),true);
		assertEquals(IT_TD_002_003_002(),true);
		assertEquals(IT_TD_002_003_003(),true);
		assertEquals(IT_TD_002_004_001(),true);
		assertEquals(IT_TD_002_004_002(),true);
		assertEquals(IT_TD_002_004_003(),true);
}
	public static void main(String[] args){
		test();
	}

}
