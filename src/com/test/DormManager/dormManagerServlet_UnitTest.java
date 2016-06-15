package com.test.DormManager;

import com.test.Login.LoginServlet;
import com.test.Login.loginServlet_stub;

public class dormManagerServlet_UnitTest {
	private static final long serialVersionUID = 1L;
	static boolean CASE_SUB=false;
	public static String CASE_NUM="";
 
	public static boolean UT_TC_001_004_001_001(){
		CASE_NUM="UT_TC_001_004_001_001";
		
		if(!LoginServlet.Login("","111","admin")&&loginServlet_stub.STUB_SUC==false){
			return CASE_SUB=true;
		}
		return CASE_SUB;
	}
}
