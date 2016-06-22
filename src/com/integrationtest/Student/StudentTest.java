package com.integrationtest.Student;


import junit.framework.TestCase;

public class StudentTest extends TestCase{
	private static final long serialVersionUID = 1L;
	static boolean CASE_SUB=false;
	public static String CASE_NUM="";
 
	public static boolean IT_TD_007_001_001(){
		CASE_NUM="IT_TD_007_001_001";
		if(!StudentServlet.student("save","018","","123","123","1","1¶°","Ð¡ÕÅ","ÄÐ","12345")){
			return true;
		}
		return false;
	}
	public static boolean IT_TD_007_001_002(){
		CASE_NUM="IT_TD_007_001_002";
		if(!StudentServlet.student("save","018","018","","123","1","1¶°","Ð¡ÕÅ","ÄÐ","12345")){
					return true;
		}
		return false;
	}
	public static boolean IT_TD_007_001_003(){
		CASE_NUM="IT_TD_007_001_003";
		if(!StudentServlet.student("save","018","018","123","","1","1¶°","Ð¡ÕÅ","ÄÐ","12345")){
					return true;
		}
		return false;
	}
	public static boolean IT_TD_007_001_004(){
		CASE_NUM="IT_TD_007_001_004";
		if(!StudentServlet.student("save","018","018","123","123","1","1¶°","","ÄÐ","12345")){
					return true;
		}
		return false;
	}
	public static boolean IT_TD_007_001_005(){
		CASE_NUM="IT_TD_007_001_005";
		if(!StudentServlet.student("save","018","018","123","123","1","1¶°","Ð¡ÕÅ","","12345")){
					return true;
		}
		return false;
	}
	
	public static boolean IT_TD_007_001_006(){
		CASE_NUM="IT_TD_007_001_006";
		if(!StudentServlet.student("save","018","018","123","123","","1¶°","Ð¡ÕÅ","ÄÐ","12345")){
					return true;
		}
		return false;
	}
	public static boolean IT_TD_007_001_007(){
		CASE_NUM="IT_TD_007_001_007";
		if(!StudentServlet.student("save","018","018","123","123","1","","Ð¡ÕÅ","ÄÐ","12345")){
					return true;
		}
		return false;
	}
	public static boolean IT_TD_007_001_008(){
		CASE_NUM="IT_TD_007_001_008";
		if(!StudentServlet.student("save","018","018","123","123","1","1¶°","Ð¡ÕÅ","ÄÐ","")){
					return true;
		}
		return false;
	}
	public static boolean IT_TD_007_002_001(){
		CASE_NUM="IT_TD_007_002_001";
		if(!StudentServlet.student("save","001","018","123","123","1","1¶°","Ð¡ÕÅ","ÄÐ","12345")){
					return true;
		}
		return false;
	}
	
	public static boolean IT_TD_007_003_001(){
		CASE_NUM="IT_TD_007_003_001";
		if(!StudentServlet.student("save","018","018","123","111","1","1¶°","Ð¡ÕÅ","ÄÐ","12345")){
					return true;
		}
		return false;
	}
	
	
	public static boolean IT_TD_007_004_001(){
		CASE_NUM="IT_TD_007_004_001";
		if(StudentServlet.student("save","018","018","123","123","1","1¶°","Ð¡ÕÅ","ÄÐ","12345")){
					return true;
		}
		return false;
	}
	
	
	
	public static boolean IT_TD_008_001_001(){
		CASE_NUM="IT_TD_008_001_001";
		if(!StudentServlet.student("preSave","28","","123","123","1","1¶°","²âÊÔ1","ÄÐ","12345")){
			return true;
		}
		return false;
	}
	public static boolean IT_TD_008_001_002(){
		CASE_NUM="IT_TD_008_001_002";
		if(!StudentServlet.student("preSave","28","001","","123","1","1¶°","²âÊÔ1","ÄÐ","12345")){
					return true;
		}
		return false;
	}
	public static boolean IT_TD_008_001_003(){
		CASE_NUM="IT_TD_008_001_003";
		if(!StudentServlet.student("preSave","28","001","123","","1","1¶°","²âÊÔ1","ÄÐ","12345")){
					return true;
		}
		return false;
	}
	public static boolean IT_TD_008_001_004(){
		CASE_NUM="IT_TD_008_001_004";
		if(!StudentServlet.student("preSave","28","001","123","123","1","1¶°","","ÄÐ","12345")){
					return true;
		}
		return false;
	}
	public static boolean IT_TD_008_001_005(){
		CASE_NUM="IT_TD_008_001_005";
		if(!StudentServlet.student("preSave","28","001","123","123","1","1¶°","²âÊÔ1","","12345")){
					return true;
		}
		return false;
	}
	
	public static boolean IT_TD_008_001_006(){
		CASE_NUM="IT_TD_008_001_006";
		if(!StudentServlet.student("preSave","28","001","123","123","","1¶°","²âÊÔ1","ÄÐ","12345")){
					return true;
		}
		return false;
	}
	public static boolean IT_TD_008_001_007(){
		CASE_NUM="IT_TD_008_001_007";
		if(!StudentServlet.student("preSave","28","001","123","123","1","","²âÊÔ1","ÄÐ","12345")){
					return true;
		}
		return false;
	}
	public static boolean IT_TD_008_001_008(){
		CASE_NUM="IT_TD_008_001_008";
		if(!StudentServlet.student("preSave","28","001","123","123","1","1¶°","²âÊÔ1","ÄÐ","")){
					return true;
		}
		return false;
	}
	public static boolean IT_TD_008_002_001(){
		CASE_NUM="IT_TD_008_002_001";
		if(!StudentServlet.student("preSave","28","001","123","123","1","1¶°","Ð¡ÕÅ","ÄÐ","12345")){
					return true;
		}
		return false;
	}
	
	public static boolean IT_TD_008_003_001(){
		CASE_NUM="IT_TD_008_003_001";
		if(!StudentServlet.student("preSave","28","001","123","111","1","1¶°","Ð¡ÕÅ","ÄÐ","12345")){
					return true;
		}
		return false;
	}
	
	
	public static boolean IT_TD_008_004_001(){
		CASE_NUM="IT_TD_008_004_001";
		if(StudentServlet.student("preSave","28","001","123","123","1","1¶°","Ð¡ÕÅ","ÄÐ","12345")){
					return true;
		}
		return false;
	}
	
	
	public static void test(){
		
		
		assertEquals(IT_TD_007_001_001(),true);
		assertEquals(IT_TD_007_001_002(),true);
		assertEquals(IT_TD_007_001_003(),true);
		assertEquals(IT_TD_007_001_004(),true);
		assertEquals(IT_TD_007_001_005(),true);
		assertEquals(IT_TD_007_001_006(),true);
		assertEquals(IT_TD_007_001_007(),true);
		assertEquals(IT_TD_007_001_008(),true);
		assertEquals(IT_TD_007_002_001(),true);
		assertEquals(IT_TD_007_003_001(),true);
		assertEquals(IT_TD_007_004_001(),true);
		
		assertEquals(IT_TD_008_001_001(),true);
		assertEquals(IT_TD_008_001_002(),true);
		assertEquals(IT_TD_008_001_003(),true);
		assertEquals(IT_TD_008_001_004(),true);
		assertEquals(IT_TD_008_001_005(),true);
		assertEquals(IT_TD_008_001_006(),true);
		assertEquals(IT_TD_008_001_007(),true);
		assertEquals(IT_TD_008_001_008(),true);
		assertEquals(IT_TD_008_002_001(),true);
		assertEquals(IT_TD_008_003_001(),true);
		assertEquals(IT_TD_008_004_001(),true);
	}
	public static void main(String[] args){
		test();
	}
}
