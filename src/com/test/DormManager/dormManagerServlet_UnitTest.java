package com.test.DormManager;



public class dormManagerServlet_UnitTest {
	private static final long serialVersionUID = 1L;
	static boolean CASE_SUB=false;
	public static String CASE_NUM="";
 
	public static boolean UT_TC_001_004_001_001(){
		CASE_NUM="UT_TC_001_004_001_001";
		
		if(!DormManagerServlet.DormManager("","555","555","小王","女","123","save")&&dormManagerServlet_stub.STUB_SUC==false){
			return CASE_SUB=true;
		}
		return CASE_SUB;
	}
	public static boolean UT_TC_001_004_001_002(){
		CASE_NUM="UT_TC_001_004_001_002";
		
		if(!DormManagerServlet.DormManager("manager10","","555","小王","女","123","save")&&dormManagerServlet_stub.STUB_SUC==false){
			return CASE_SUB=true;
		}
		return CASE_SUB;
	}
	public static boolean UT_TC_001_004_001_003(){
		CASE_NUM="UT_TC_001_004_001_003";
		
		if(!DormManagerServlet.DormManager("manager10","555","","小王","女","123","save")&&dormManagerServlet_stub.STUB_SUC==false){
			return CASE_SUB=true;
		}
		return CASE_SUB;
	}
	public static boolean UT_TC_001_004_001_004(){
		CASE_NUM="UT_TC_001_004_001_004";
		
		if(!DormManagerServlet.DormManager("manager10","555","555","","女","123","save")&&dormManagerServlet_stub.STUB_SUC==false){
			return CASE_SUB=true;
		}
		return CASE_SUB;
	}
	public static boolean UT_TC_001_004_001_005(){
		CASE_NUM="UT_TC_001_004_001_005";
		
		if(!DormManagerServlet.DormManager("manager10","555","555","小王","女","","save")&&dormManagerServlet_stub.STUB_SUC==false){
			return CASE_SUB=true;
		}
		return CASE_SUB;
	}
	public static boolean UT_TC_001_004_002_001(){
		CASE_NUM="UT_TC_001_004_002_001";
		
		if(!DormManagerServlet.DormManager("manager10","555","555","小王","女","123","")&&dormManagerServlet_stub.STUB_SUC==true){
			return CASE_SUB=true;
		}
		return CASE_SUB;
	}
	public static boolean UT_TC_001_004_003_001(){
		CASE_NUM="UT_TC_001_004_003_001";
		
		if(!DormManagerServlet.DormManager("manager1","555","555","小王","女","123","preSave")&&dormManagerServlet_stub.STUB_SUC==true){
			return CASE_SUB=true;
		}
		return CASE_SUB;
	}
	public static boolean UT_TC_001_004_004_001(){
		CASE_NUM="UT_TC_001_004_004_001";
		
		if(!DormManagerServlet.DormManager("manager10","444","555","小王","女","123","preSave")&&dormManagerServlet_stub.STUB_SUC==true){
			return CASE_SUB=true;
		}
		return CASE_SUB;
	}
	public static boolean UT_TC_001_004_005_001(){
		CASE_NUM="UT_TC_001_004_005_001";
		
		if(!DormManagerServlet.DormManager("","555","555","小王","女","abc","preSave")&&dormManagerServlet_stub.STUB_SUC==false){
			return CASE_SUB=true;
		}
		return CASE_SUB;
	}
	public static boolean UT_TC_001_004_006_001(){
		CASE_NUM="UT_TC_001_004_006_001";
		
		if(DormManagerServlet.DormManager("manager10","888","888","小王","女","123","preSave")&&dormManagerServlet_stub.STUB_SUC==true){
			return CASE_SUB=true;
		}
		return CASE_SUB;
	}
}
