package com.integrationtest.DormManager;

import junit.framework.TestCase;



public class DormManagerTest extends TestCase{


	private static final long serialVersionUID = 1L;
	static boolean CASE_SUB=false;
	public static String CASE_NUM="";
 
	public static boolean IT_TD_009_001_001(){
		CASE_NUM="IT_TD_009_001_001";
		if(!DormManagerServlet.DormManager("","555","555","小王","女","123","save")){
			return true;
		}
		return false;
	}
	public static boolean IT_TD_009_001_002(){
		CASE_NUM="IT_TD_009_001_002";
		if(!DormManagerServlet.DormManager("manager10","","555","小王","女","123","save")){
					return true;
		}
		return false;
	}
	public static boolean IT_TD_009_001_003(){
		CASE_NUM="IT_TD_009_001_003";
		if(!DormManagerServlet.DormManager("manager10","555","","小王","女","123","save")){
					return true;
		}
		return false;
	}
	public static boolean IT_TD_009_001_004(){
		CASE_NUM="IT_TD_009_001_004";
		if(!DormManagerServlet.DormManager("manager10","555","555","","女","123","save")){
					return true;
		}
		return false;
	}
	public static boolean IT_TD_009_001_005(){
		CASE_NUM="IT_TD_009_001_005";
		if(!DormManagerServlet.DormManager("manager10","555","555","小王","女","","save")){
					return true;
		}
		return false;
	}
	
	public static boolean IT_TD_009_002_001(){
		CASE_NUM="IT_TD_009_002_001";
		if(!DormManagerServlet.DormManager("manager10","555","555","小王","女","123","")){
					return true;
		}
		return false;
	}
	
	public static boolean IT_TD_009_003_001(){
		CASE_NUM="IT_TD_009_003_001";
		if(!DormManagerServlet.DormManager("manager2","555","555","小王","女","123","save")){
					return true;
		}
		return false;
	}
	
	public static boolean IT_TD_009_004_001(){
		CASE_NUM="IT_TD_009_004_001";
		if(!DormManagerServlet.DormManager("manager10","222","555","小王","女","123","save")){
					return true;
		}
		return false;
	}
	
	public static boolean IT_TD_009_005_001(){
		CASE_NUM="IT_TD_009_005_001";
		if(!DormManagerServlet.DormManager("manager10","555","555","小王","女","","save")){
					return true;
		}
		return false;
	}
	
	public static boolean IT_TD_009_006_001(){
		CASE_NUM="IT_TD_009_006_001";
		if(DormManagerServlet.DormManager("manager10","555","555","小王","女","123","save")){
					return true;
		}
		return false;
	}
	
	public static boolean IT_TD_0010_001_001(){
		CASE_NUM="IT_TD_0010_001_001";
		if(!DormManagerServlet.DormManager("","555","555","小王","女","123","save")){
			return true;
		}
		return false;
	}
	public static boolean IT_TD_0010_001_002(){
		CASE_NUM="IT_TD_0010_001_002";
		if(!DormManagerServlet.DormManager("manager10","","555","小王","女","123","preSave")){
					return true;
		}
		return false;
	}
	public static boolean IT_TD_0010_001_003(){
		CASE_NUM="IT_TD_0010_001_003";
		if(!DormManagerServlet.DormManager("manager10","555","","小王","女","123","preSave")){
					return true;
		}
		return false;
	}
	public static boolean IT_TD_0010_001_004(){
		CASE_NUM="IT_TD_0010_001_004";
		if(!DormManagerServlet.DormManager("manager10","555","555","","女","123","preSave")){
					return true;
		}
		return false;
	}
	public static boolean IT_TD_0010_001_005(){
		CASE_NUM="IT_TD_0010_001_005";
		if(!DormManagerServlet.DormManager("manager10","555","555","小王","女","","preSave")){
					return true;
		}
		return false;
	}
	
	public static boolean IT_TD_0010_002_001(){
		CASE_NUM="IT_TD_0010_002_001";
		if(!DormManagerServlet.DormManager("manager10","555","555","小王","女","123","")){
					return true;
		}
		return false;
	}
	
	public static boolean IT_TD_0010_003_001(){
		CASE_NUM="IT_TD_0010_003_001";
		if(!DormManagerServlet.DormManager("manager2","555","555","小王","女","123","preSave")){
					return true;
		}
		return false;
	}
	
	public static boolean IT_TD_0010_004_001(){
		CASE_NUM="IT_TD_0010_004_001";
		if(!DormManagerServlet.DormManager("manager10","222","555","小李","女","123","preSave")){
					return true;
		}
		return false;
	}
	
	public static boolean IT_TD_0010_005_001(){
		CASE_NUM="IT_TD_0010_005_001";
		if(!DormManagerServlet.DormManager("manager10","555","555","小王","女","","preSave")){
					return true;
		}
		return false;
	}
	
	public static boolean IT_TD_0010_006_001(){
		CASE_NUM="IT_TD_0010_006_001";
		if(DormManagerServlet.DormManager("manager12","555","555","小李","女","123","preSave")){
					return true;
		}
		return false;
	}
	
	public static void test(){
		
		
		assertEquals(IT_TD_009_001_001(),true);
		assertEquals(IT_TD_009_001_002(),true);
		assertEquals(IT_TD_009_001_003(),true);
		assertEquals(IT_TD_009_001_004(),true);
		assertEquals(IT_TD_009_001_005(),true);
	    assertEquals(IT_TD_009_002_001(),true);
		assertEquals(IT_TD_009_003_001(),true);
		assertEquals(IT_TD_009_004_001(),true);
		assertEquals(IT_TD_009_005_001(),true);
		assertEquals(IT_TD_009_006_001(),true);
		
		assertEquals(IT_TD_0010_001_001(),true);
		assertEquals(IT_TD_0010_001_002(),true);
		assertEquals(IT_TD_0010_001_003(),true);
		assertEquals(IT_TD_0010_001_004(),true);
		assertEquals(IT_TD_0010_001_005(),true);
	    assertEquals(IT_TD_0010_002_001(),true);
		assertEquals(IT_TD_0010_003_001(),true);
		assertEquals(IT_TD_0010_004_001(),true);
		assertEquals(IT_TD_0010_005_001(),true);
		assertEquals(IT_TD_0010_006_001(),true);
		}
	public static void main(String[] args){
		test();
	}
}
