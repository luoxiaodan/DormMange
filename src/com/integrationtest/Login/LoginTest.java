package com.integrationtest.Login;

import junit.framework.TestCase;
import com.integrationtest.Login.LoginServlet;
import com.test.Login.loginServlet_UnitTest;



public class LoginTest extends TestCase{


	private static final long serialVersionUID = 1L;
	static boolean CASE_SUB=false;
	public static String CASE_NUM="";
 
	public static boolean IT_TD_001_001_001(){
		CASE_NUM="IT_TD_001_001_001";
		if(!LoginServlet.Login("","111","admin")){
			return true;
		}
		return false;
	}
	public static boolean IT_TD_001_001_002(){
		CASE_NUM="IT_TD_001_001_002";
		if(!LoginServlet.Login("admin","","admin")){
			return true;
		}
		return false;
	}
	public static boolean IT_TD_001_001_003(){
		CASE_NUM="IT_TD_001_001_003";
		if(!LoginServlet.Login("admin","111","student")){
			return true;
		}
		return false;
	}
	public static boolean IT_TD_001_001_004(){
		CASE_NUM="IT_TD_001_001_004";
		if(!LoginServlet.Login("","555","dormManager")){
			return true;
		}
		return false;
	}
	public static boolean IT_TD_001_001_005(){
		CASE_NUM="IT_TD_001_001_005";
		if(!LoginServlet.Login("manager2","","admdormManagerin")){
			return true;
		}
		return false;
	}
	public static boolean IT_TD_001_001_006(){
		CASE_NUM="IT_TD_001_001_006";
		if(!LoginServlet.Login("manager2","555","admin")){
			return true;
		}
		return false;
	}
	public static boolean IT_TD_001_001_007(){
		CASE_NUM="IT_TD_001_001_007";
		if(!LoginServlet.Login("","123","student")){
			return true;
		}
		return false;
	}
	public static boolean IT_TD_001_001_008(){
		CASE_NUM="IT_TD_001_001_008";
		if(!LoginServlet.Login("002","","student")){
			return true;
		}
		return false;
	}
	public static boolean IT_TD_001_001_009(){
		CASE_NUM="IT_TD_001_001_009";
		if(!LoginServlet.Login("002","123","admin")){
			return true;
		}
		return false;
	}
	public static boolean IT_TD_001_002_001(){
		CASE_NUM="IT_TD_001_002_001";
		if(!LoginServlet.Login("admin","222","admin")){
			return true;
		}
		return false;
	}
	public static boolean IT_TD_001_002_002(){
		CASE_NUM="IT_TD_001_002_002";
		if(!LoginServlet.Login("manager2","333","dormManager")){
			return true;
		}
		return false;
	}
	public static boolean IT_TD_001_002_003(){
		CASE_NUM="IT_TD_001_002_003";
		if(!LoginServlet.Login("002","444","student")){
			return true;
		}
		return false;
	}
	public static boolean IT_TD_001_003_001(){
		CASE_NUM="IT_TD_001_003_001";
		if(!LoginServlet.Login("admin","555","admin")){
			return true;
		}
		return false;
	}
	public static boolean IT_TD_001_003_002(){
		CASE_NUM="IT_TD_001_003_002";
		if(!LoginServlet.Login("admin","123","admin")){
			return true;
		}
		return false;
	}
	public static boolean IT_TD_001_003_003(){
		CASE_NUM="IT_TD_001_003_003";
		if(!LoginServlet.Login("manager2","111","dormManager")){
			return true;
		}
		return false;
	}
	public static boolean IT_TD_001_003_004(){
		CASE_NUM="IT_TD_001_003_004";
		if(!LoginServlet.Login("manager2","123","dormManager")){
			return true;
		}
		return false;
	}
	public static boolean IT_TD_001_003_005(){
		CASE_NUM="IT_TD_001_003_005";
		if(!LoginServlet.Login("002","111","student")){
			return true;
		}
		return false;
	}
	public static boolean IT_TD_001_003_006(){
		CASE_NUM="IT_TD_001_003_006";
		if(!LoginServlet.Login("002","555","student")){
			return true;
		}
		return false;
	}
	public static boolean IT_TD_001_004_001(){
		CASE_NUM="IT_TD_001_004_001";
		if(!LoginServlet.Login("admin1111","111","admin")){
			return true;
		}
		return false;
	}
	public static boolean IT_TD_001_004_002(){
		CASE_NUM="IT_TD_001_004_002";
		if(!LoginServlet.Login("manager2222","555","dormManager")){
			return true;
		}
		return false;
	}
	public static boolean IT_TD_001_004_003(){
		CASE_NUM="IT_TD_001_004_003";
		if(!LoginServlet.Login("888","123","student")){
			return true;
		}
		return false;
	}
	public static boolean IT_TD_001_005_001(){
		CASE_NUM="IT_TD_001_005_001";
			if(!LoginServlet.Login("admin","111","student")){
			return true;
		}
		return false;
	}
	public static boolean IT_TD_001_005_002(){
		CASE_NUM="IT_TD_001_005_002";
		if(!LoginServlet.Login("admin","111","student")){
			return true;
		}
		return false;
	}
	public static boolean IT_TD_001_005_003(){
		CASE_NUM="IT_TD_001_005_003";
		if(!LoginServlet.Login("manager2","555","admin")){
			return true;
		}
		return false;
	}
	public static boolean IT_TD_001_005_004(){
		CASE_NUM="IT_TD_001_005_004";
		if(!LoginServlet.Login("manager2","555","student")){
			return true;
		}
		return false;
	}
	public static boolean IT_TD_001_005_005(){
		CASE_NUM="IT_TD_001_005_005";
		if(!LoginServlet.Login("002","123","admin")){
			return true;
		}
		return false;
	}
	public static boolean IT_TD_001_005_006(){
		CASE_NUM="IT_TD_001_005_006";
		if(!LoginServlet.Login("002","123","dormManager")){
			return true;
		}
		return false;
	}
	public static boolean IT_TD_001_006_001(){
		CASE_NUM="IT_TD_001_006_001";
		if(LoginServlet.Login("admin","111","admin")){
			return true;
		}
		return false;
	}
	public static boolean IT_TD_001_006_002(){
		CASE_NUM="IT_TD_001_006_002";
		if(LoginServlet.Login("manager2","555","dormManager")){
			return true;
		}
		return false;
	}
	public static boolean IT_TD_001_006_003(){
		CASE_NUM="IT_TD_001_006_003";
		if(LoginServlet.Login("002","123","student")){
			return true;
		}
		return false;
	}
	public static void test(){
		
		
		assertEquals(IT_TD_001_001_001(),true);
		assertEquals(IT_TD_001_001_002(),true);
		assertEquals(IT_TD_001_001_003(),true);
		assertEquals(IT_TD_001_001_004(),true);
		assertEquals(IT_TD_001_001_005(),true);
		assertEquals(IT_TD_001_001_006(),true);
		assertEquals(IT_TD_001_001_007(),true);
		assertEquals(IT_TD_001_001_008(),true);
		assertEquals(IT_TD_001_001_009(),true);
		assertEquals(IT_TD_001_002_001(),true);
		assertEquals(IT_TD_001_002_002(),true);
		assertEquals(IT_TD_001_002_003(),true);
		assertEquals(IT_TD_001_003_001(),true);
		assertEquals(IT_TD_001_003_002(),true);
		assertEquals(IT_TD_001_003_003(),true);
		assertEquals(IT_TD_001_003_004(),true);
		assertEquals(IT_TD_001_003_005(),true);
		assertEquals(IT_TD_001_003_006(),true);
		assertEquals(IT_TD_001_004_001(),true);
		assertEquals(IT_TD_001_004_002(),true);
		assertEquals(IT_TD_001_004_003(),true);
		assertEquals(IT_TD_001_005_001(),true);
		assertEquals(IT_TD_001_005_002(),true);
		assertEquals(IT_TD_001_005_003(),true);
		assertEquals(IT_TD_001_005_004(),true);
		assertEquals(IT_TD_001_005_005(),true);
		assertEquals(IT_TD_001_005_006(),true);
		assertEquals(IT_TD_001_006_001(),true);
		assertEquals(IT_TD_001_006_002(),true);
		assertEquals(IT_TD_001_006_003(),true);
	}
	public static void main(String[] args){
		test();
	}
}
