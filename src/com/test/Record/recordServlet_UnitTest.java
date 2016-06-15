package com.test.Record;



public class recordServlet_UnitTest {
	private static final long serialVersionUID = 1L;
	static boolean CASE_SUB=false;
	public static String CASE_NUM="";
 
	public static boolean UT_TC_001_006_001_001(){
		CASE_NUM="UT_TC_001_006_001_001";
		
		if(!RecordServlet.Record("2","30","","123","save")&&recordServlet_stub.STUB_SUC==false){
			return CASE_SUB=true;
		}
		return CASE_SUB;
	}
	public static boolean UT_TC_001_006_001_002(){
		CASE_NUM="UT_TC_001_006_001_002";
		
		if(!RecordServlet.Record("","30","002","123","save")&&recordServlet_stub.STUB_SUC==false){
			return CASE_SUB=true;
		}
		return CASE_SUB;
	}
	public static boolean UT_TC_001_006_001_003(){
		CASE_NUM="UT_TC_001_006_001_003";
		
		if(!RecordServlet.Record("2","30","008","","save")&&recordServlet_stub.STUB_SUC==false){
			return CASE_SUB=true;
		}
		return CASE_SUB;
	}
	public static boolean UT_TC_001_006_002_001(){
		CASE_NUM="UT_TC_001_006_002_001";
		
		if(!RecordServlet.Record("2","30","999","123","save")&&recordServlet_stub.STUB_SUC==true){
			return CASE_SUB=true;
		}
		return CASE_SUB;
	}
	public static boolean UT_TC_001_006_003_001(){
		CASE_NUM="UT_TC_001_006_003_001";
		
		if(!RecordServlet.Record("2","30","002","123","")&&recordServlet_stub.STUB_SUC==true){
			return CASE_SUB=true;
		}
		return CASE_SUB;
	}
	public static boolean UT_TC_001_006_004_001(){
		CASE_NUM="UT_TC_001_006_004_001";
		
		if(!RecordServlet.Record("2","30","003","123","save")&&recordServlet_stub.STUB_SUC==false){
			return CASE_SUB=true;
		}
		return CASE_SUB;
	}
	public static boolean UT_TC_001_006_005_001(){
		CASE_NUM="UT_TC_001_006_005_001";
		
		if(RecordServlet.Record("2","30","002","123","save")&&recordServlet_stub.STUB_SUC==true){
			return CASE_SUB=true;
		}
		return CASE_SUB;
	}
	public static boolean UT_TC_001_007_001_001(){
		CASE_NUM="UT_TC_001_007_001_001";
		
		if(!RecordServlet.Record("2","1","","123","preSave")&&recordServlet_stub.STUB_SUC==false){
			return CASE_SUB=true;
		}
		return CASE_SUB;
	}
	public static boolean UT_TC_001_007_001_002(){
		CASE_NUM="UT_TC_001_007_001_002";
		
		if(!RecordServlet.Record("","1","002","123","preSave")&&recordServlet_stub.STUB_SUC==false){
			return CASE_SUB=true;
		}
		return CASE_SUB;
	}
	public static boolean UT_TC_001_007_001_003(){
		CASE_NUM="UT_TC_001_007_001_003";
		
		if(!RecordServlet.Record("","1","002","","preSave")&&recordServlet_stub.STUB_SUC==false){
			return CASE_SUB=true;
		}
		return CASE_SUB;
	}
	public static boolean UT_TC_001_007_002_001(){
		CASE_NUM="UT_TC_001_007_002_001";
		
		if(!RecordServlet.Record("2","1","999","123","preSave")&&recordServlet_stub.STUB_SUC==true){
			return CASE_SUB=true;
		}
		return CASE_SUB;
	}
	public static boolean UT_TC_001_007_003_001(){
		CASE_NUM="UT_TC_001_007_003_001";
		
		if(!RecordServlet.Record("2","1","002","1234","")&&recordServlet_stub.STUB_SUC==true){
			return CASE_SUB=true;
		}
		return CASE_SUB;
	}
	public static boolean UT_TC_001_007_004_001(){
		CASE_NUM="UT_TC_001_007_004_001";
		
		if(!RecordServlet.Record("2","1","003","123","preSave")&&recordServlet_stub.STUB_SUC==false){
			return CASE_SUB=true;
		}
		return CASE_SUB;
	}
	public static boolean UT_TC_001_007_005_001(){
		CASE_NUM="UT_TC_001_007_005_001";
		
		if(RecordServlet.Record("2","1","002","1234","preSave")&&recordServlet_stub.STUB_SUC==true){
			return CASE_SUB=true;
		}
		return CASE_SUB;
	}
}
