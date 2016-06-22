package com.integrationtest.Record;

import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.Test;



public class RecordTest extends TestCase {
	private static final long serialVersionUID = 1L;
	static boolean CASE_SUB=false;
	public static String CASE_NUM="";
 
	public static boolean IT_TD_005_001_001(){
		CASE_NUM="IT_TD_005_001_001";
		
		if(!RecordServlet.Record("2","30","","123","save")){
			return true;
		}
		return false;
	}
	public static boolean IT_TD_005_001_002(){
		CASE_NUM="IT_TD_005_001_002";
		
		if(!RecordServlet.Record("","30","002","123","save")){
			return true;
		}
		return false;
	}
	public static boolean IT_TD_005_001_003(){
		CASE_NUM="IT_TD_005_001_003";
		
		if(!RecordServlet.Record("2","30","008","","save")){
			return true;
		}
		return false;
	}
	public static boolean IT_TD_005_002_001(){
		CASE_NUM="IT_TD_005_002_001";
		
		if(!RecordServlet.Record("2","30","999","123","save")){
			return true;
		}
		return false;
	}
	public static boolean IT_TD_005_003_001(){
		CASE_NUM="IT_TD_005_003_001";
		
		if(!RecordServlet.Record("2","30","002","123","")){
			return true;
		}
		return false;
	}
	public static boolean IT_TD_005_004_001(){
		CASE_NUM="IT_TD_005_004_001";
		
		if(!RecordServlet.Record("2","30","003","123","save")){
			return true;
		}
		return false;
	}
	public static boolean IT_TD_005_005_001(){
		CASE_NUM="IT_TD_005_005_001";
		
		if(RecordServlet.Record("2","30","002","123","save")){
			return true;
		}
		return false;
	}
	public static boolean IT_TD_006_001_001(){
		CASE_NUM="IT_TD_006_001_001";
		
		if(!RecordServlet.Record("2","1","","123","preSave")){
			return true;
		}
		return false;
	}
	public static boolean IT_TD_006_001_002(){
		CASE_NUM="IT_TD_006_001_002";
		
		if(!RecordServlet.Record("","1","002","123","preSave")){
			return true;
		}
		return false;
	}
	public static boolean IT_TD_006_001_003(){
		CASE_NUM="IT_TD_006_001_003";
		
		if(!RecordServlet.Record("","1","002","","preSave")){
			return true;
		}
		return false;
	}
	public static boolean IT_TD_006_002_001(){
		CASE_NUM="IT_TD_006_002_001";
		
		if(!RecordServlet.Record("2","1","999","123","preSave")){
			return true;
		}
		return false;
	}
	public static boolean IT_TD_006_003_001(){
		CASE_NUM="IT_TD_006_003_001";
		
		if(!RecordServlet.Record("2","1","002","1234","")){
			return true;
		}
		return false;
	}
	public static boolean IT_TD_006_004_001(){
		CASE_NUM="IT_TD_006_004_001";
		
		if(!RecordServlet.Record("2","1","003","123","preSave")){
			return true;
		}
		return false;
	}
	public static boolean IT_TD_006_005_001(){
		CASE_NUM="IT_TD_006_005_001";
		
		if(RecordServlet.Record("2","1","002","1234","preSave")){
			return true;
		}
		return false;
	}
	  
       public static void test(){
		
		
		assertEquals(IT_TD_005_001_001(),true);
		assertEquals(IT_TD_005_001_002(),true);
		assertEquals(IT_TD_005_001_003(),true);
		assertEquals(IT_TD_005_002_001(),true);
		assertEquals(IT_TD_005_003_001(),true);
		assertEquals(IT_TD_005_004_001(),true);
		assertEquals(IT_TD_005_005_001(),true);
		assertEquals(IT_TD_006_001_001(),true);
		assertEquals(IT_TD_006_001_002(),true);
		assertEquals(IT_TD_006_001_003(),true);
		assertEquals(IT_TD_006_002_001(),true);
		assertEquals(IT_TD_006_003_001(),true);
		assertEquals(IT_TD_006_004_001(),true);
		assertEquals(IT_TD_006_005_001(),true);
	}
	public static void main(String[] args){
		test();
	}
}
