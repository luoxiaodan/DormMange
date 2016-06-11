package com.test.Login;

import java.io.DataInputStream;
import java.io.DataOutputStream;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;


public class loginServlet_UnitTest {

	
	
	private static final long serialVersionUID = 1L;
	static boolean CASE_SUB=false;
	public static String CASE_NUM="";
	static String URL = "http://localhost:8080/DormManage/testlogin/LoginServlet.java";
   
	public static boolean UT_TC_001_001_001_001(){
		CASE_NUM="UT_TC_001_001_001_001";
		String postData="userName=&password=111&userType=admin";
		if(!LoginServlet.Login("","111","admin")&&loginServlet_stub.STUB_SUC==false){
			return CASE_SUB=true;
		}
		return CASE_SUB;
	}
	public static boolean UT_TC_001_001_001_002(){
		CASE_NUM="UT_TC_001_001_001_002";
		String postData="userName=admin&password=&userType=admin";
		if(!LoginServlet.Login("admin","","admin")&&loginServlet_stub.STUB_SUC==false){
			return CASE_SUB=true;
		}
		return CASE_SUB;
	}
	public static boolean UT_TC_001_001_001_003(){
		CASE_NUM="UT_TC_001_001_001_003";
		String postData="userName=admin&password=111&userType=student";
		if(!LoginServlet.Login("admin","111","student")&&loginServlet_stub.STUB_SUC==false){
			return CASE_SUB=true;
		}
		return CASE_SUB;
	}
	public static boolean UT_TC_001_001_001_004(){
		CASE_NUM="UT_TC_001_001_001_004";
		String postData="userName=&password=555&userType=dormManager";
		if(!LoginServlet.Login("","555","dormManager")&&loginServlet_stub.STUB_SUC==false){
			return CASE_SUB=true;
		}
		return CASE_SUB;
	}
	public static boolean UT_TC_001_001_001_005(){
		CASE_NUM="UT_TC_001_001_001_005";
		String postData="userName=manager2&password=&userType=dormManager";
		if(!LoginServlet.Login("manager2","","admdormManagerin")&&loginServlet_stub.STUB_SUC==false){
			return CASE_SUB=true;
		}
		return CASE_SUB;
	}
	public static boolean UT_TC_001_001_001_006(){
		CASE_NUM="UT_TC_001_001_001_006";
		String postData="userName=manager2&password=555&userType=admin";
		if(!LoginServlet.Login("manager2","555","admin")&&loginServlet_stub.STUB_SUC==false){
			return CASE_SUB=true;
		}
		return CASE_SUB;
	}
	public static boolean UT_TC_001_001_001_007(){
		CASE_NUM="UT_TC_001_001_001_007";
		String postData="userName=&password=123&userType=student";
		if(!LoginServlet.Login("","123","student")&&loginServlet_stub.STUB_SUC==false){
			return CASE_SUB=true;
		}
		return CASE_SUB;
	}
	public static boolean UT_TC_001_001_001_008(){
		CASE_NUM="UT_TC_001_001_001_008";
		String postData="userName=002&password=&userType=student";
		if(!LoginServlet.Login("002","","student")&&loginServlet_stub.STUB_SUC==false){
			return CASE_SUB=true;
		}
		return CASE_SUB;
	}
	public static boolean UT_TC_001_001_001_009(){
		CASE_NUM="UT_TC_001_001_001_009";
		String postData="userName=002&password=123&userType=admin";
		if(!LoginServlet.Login("002","123","admin")&&loginServlet_stub.STUB_SUC==false){
			return CASE_SUB=true;
		}
		return CASE_SUB;
	}
	public static boolean UT_TC_001_001_002_001(){
		CASE_NUM="UT_TC_001_001_002_001";
		String postData="userName=admin&password=222&userType=admin";
		if(!LoginServlet.Login("admin","222","admin")&&loginServlet_stub.STUB_SUC==true){
			return CASE_SUB=true;
		}
		return CASE_SUB;
	}
	public static boolean UT_TC_001_001_002_002(){
		CASE_NUM="UT_TC_001_001_002_002";
		String postData="userName=manager2&password=333&userType=dormManager";
		if(!LoginServlet.Login("manager2","333","dormManager")&&loginServlet_stub.STUB_SUC==true){
			return CASE_SUB=true;
		}
		return CASE_SUB;
	}
	public static boolean UT_TC_001_001_002_003(){
		CASE_NUM="UT_TC_001_001_002_003";
		String postData="userName=002&password=444&userType=student";
		if(!LoginServlet.Login("002","444","student")&&loginServlet_stub.STUB_SUC==true){
			return CASE_SUB=true;
		}
		return CASE_SUB;
	}
	public static boolean UT_TC_001_001_003_001(){
		CASE_NUM="UT_TC_001_001_003_001";
		String postData="userName=admin&password=555&userType=admin";
		if(!LoginServlet.Login("admin","555","admin")&&loginServlet_stub.STUB_SUC==true){
			return CASE_SUB=true;
		}
		return CASE_SUB;
	}
	public static boolean UT_TC_001_001_003_002(){
		CASE_NUM="UT_TC_001_001_003_002";
		String postData="userName=admin&password=123&userType=admin";
		if(!LoginServlet.Login("admin","123","admin")&&loginServlet_stub.STUB_SUC==true){
			return CASE_SUB=true;
		}
		return CASE_SUB;
	}
	public static boolean UT_TC_001_001_003_003(){
		CASE_NUM="UT_TC_001_001_003_003";
		String postData="userName=manager2&password=111&userType=dormManager";
		if(!LoginServlet.Login("manager2","111","dormManager")&&loginServlet_stub.STUB_SUC==true){
			return CASE_SUB=true;
		}
		return CASE_SUB;
	}
	public static boolean UT_TC_001_001_003_004(){
		CASE_NUM="UT_TC_001_001_003_004";
		String postData="userName=manager2&password=123&userType=dormManager";
		if(!LoginServlet.Login("manager2","123","dormManager")&&loginServlet_stub.STUB_SUC==true){
			return CASE_SUB=true;
		}
		return CASE_SUB;
	}
	public static boolean UT_TC_001_001_003_005(){
		CASE_NUM="UT_TC_001_001_003_005";
		String postData="userName=002&password=111&userType=student";
		if(!LoginServlet.Login("002","111","student")&&loginServlet_stub.STUB_SUC==true){
			return CASE_SUB=true;
		}
		return CASE_SUB;
	}
	public static boolean UT_TC_001_001_003_006(){
		CASE_NUM="UT_TC_001_001_003_006";
		String postData="userName=002&password=555&userType=student";
		if(!LoginServlet.Login("002","555","student")&&loginServlet_stub.STUB_SUC==true){
			return CASE_SUB=true;
		}
		return CASE_SUB;
	}
	public static boolean UT_TC_001_001_004_001(){
		CASE_NUM="UT_TC_001_001_004_001";
		String postData="userName=admin1111&password=111&userType=admin";
		if(!LoginServlet.Login("admin1111","111","admin")&&loginServlet_stub.STUB_SUC==true){
			return CASE_SUB=true;
		}
		return CASE_SUB;
	}
	public static boolean UT_TC_001_001_004_002(){
		CASE_NUM="UT_TC_001_001_004_002";
		String postData="userName=manager2222&password=555&userType=dormManager";
		if(!LoginServlet.Login("manager2222","555","dormManager")&&loginServlet_stub.STUB_SUC==true){
			return CASE_SUB=true;
		}
		return CASE_SUB;
	}
	public static boolean UT_TC_001_001_004_003(){
		CASE_NUM="UT_TC_001_001_004_003";
		String postData="userName=888&password=123&userType=student";
		if(!LoginServlet.Login("888","123","student")&&loginServlet_stub.STUB_SUC==true){
			return CASE_SUB=true;
		}
		return CASE_SUB;
	}
	public static boolean UT_TC_001_001_005_001(){
		CASE_NUM="UT_TC_001_001_005_001";
		String postData="userName=admin&password=111&userType=student";
		if(!LoginServlet.Login("admin","111","student")&&loginServlet_stub.STUB_SUC==false){
			return CASE_SUB=true;
		}
		return CASE_SUB;
	}
	public static boolean UT_TC_001_001_005_002(){
		CASE_NUM="UT_TC_001_001_005_002";
		String postData="userName=admin&password=111&userType=student";
		if(!LoginServlet.Login("admin","111","student")&&loginServlet_stub.STUB_SUC==false){
			return CASE_SUB=true;
		}
		return CASE_SUB;
	}
	public static boolean UT_TC_001_001_005_003(){
		CASE_NUM="UT_TC_001_001_005_003";
		String postData="userName=manager2&password=555&userType=admin";
		if(!LoginServlet.Login("manager2","555","admin")&&loginServlet_stub.STUB_SUC==false){
			return CASE_SUB=true;
		}
		return CASE_SUB;
	}
	public static boolean UT_TC_001_001_005_004(){
		CASE_NUM="UT_TC_001_001_005_004";
		String postData="userName=manager2&password=555&userType=student";
		if(!LoginServlet.Login("manager2","555","student")&&loginServlet_stub.STUB_SUC==false){
			return CASE_SUB=true;
		}
		return CASE_SUB;
	}
	public static boolean UT_TC_001_001_005_005(){
		CASE_NUM="UT_TC_001_001_005_005";
		String postData="userName=002&password=123&userType=admin";
		if(!LoginServlet.Login("002","123","admin")&&loginServlet_stub.STUB_SUC==false){
			return CASE_SUB=true;
		}
		return CASE_SUB;
	}
	public static boolean UT_TC_001_001_005_006(){
		CASE_NUM="UT_TC_001_001_005_006";
		String postData="userName=002&password=123&userType=dormManager";
		if(!LoginServlet.Login("002","123","dormManager")&&loginServlet_stub.STUB_SUC==false){
			return CASE_SUB=true;
		}
		return CASE_SUB;
	}
	public static boolean UT_TC_001_001_006_001(){
		CASE_NUM="UT_TC_001_001_006_001";
		String postData="userName=admin&password=111&userType=admin";
		if(LoginServlet.Login("admin","111","admin")&&loginServlet_stub.STUB_SUC==true){
			return CASE_SUB=true;
		}
		return CASE_SUB;
	}
	public static boolean UT_TC_001_001_006_002(){
		CASE_NUM="UT_TC_001_001_006_002";
		String postData="userName=manager2&password=555&userType=dormManager";
		if(LoginServlet.Login("manager2","555","dormManager")&&loginServlet_stub.STUB_SUC==true){
			return CASE_SUB=true;
		}
		return CASE_SUB;
	}
	public static boolean UT_TC_001_001_006_003(){
		CASE_NUM="UT_TC_001_001_006_003";
		String postData="userName=002&password=123&userType=student";
		if(LoginServlet.Login("002","123","student")&&loginServlet_stub.STUB_SUC==true){
			return CASE_SUB=true;
		}
		return CASE_SUB;
	}
	
}
