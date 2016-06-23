package com.integrationtest.Login;

import java.io.IOException;

import junit.framework.TestCase;

import org.junit.Test;
import org.xml.sax.SAXException;


import com.meterware.httpunit.GetMethodWebRequest;
import com.meterware.httpunit.WebRequest;
import com.meterware.httpunit.WebResponse;
import com.meterware.servletunit.ServletRunner;
import com.meterware.servletunit.ServletUnitClient;


public class LoginHttpTest extends TestCase{


		private static final long serialVersionUID = 1L;
		static boolean CASE_SUB=false;
		public static String CASE_NUM="";
	 
		
		public static String webtest(String username,String password,String userType) throws IOException, SAXException{
			    ServletRunner sr=new ServletRunner();
			 
	            sr.registerServlet("LoginHttp",LoginHttp.class.getName());
	            ServletUnitClient sc =sr.newClient();
	            WebRequest request= new GetMethodWebRequest("http://localhost:8080/LoginHttp");
	          
	            request.setParameter("action","save");
	            request.setParameter("userType",userType);
	            request.setParameter("userName",username);
	            request.setParameter("password",password);
	          
	            WebResponse response =sc.getResponse(request);
	            System.out.println(response.getText());

	            return response.getText();
		}
		
		public static String IT_TD_001_001_001() throws IOException, SAXException{
			CASE_NUM="IT_TD_001_001_001";
			String ans=LoginHttpTest.webtest("","111","admin");
				
			
			return ans;
		}
		public static String IT_TD_001_001_002() throws IOException, SAXException{
			CASE_NUM="IT_TD_001_001_002";
			String ans=LoginHttpTest.webtest("admin","","admin");
				
			
			return ans;
		}
		public static String IT_TD_001_001_003() throws IOException, SAXException{
			CASE_NUM="IT_TD_001_001_003";
			String ans=LoginHttpTest.webtest("admin","111","student");
				
			
			return ans;
		}
		public static String IT_TD_001_001_004() throws IOException, SAXException{
			CASE_NUM="IT_TD_001_001_004";
			String ans=LoginHttpTest.webtest("","555","dormManager");
				
			
			return ans;
		}
		public static String IT_TD_001_001_005() throws IOException, SAXException{
			CASE_NUM="IT_TD_001_001_005";
			String ans=LoginHttpTest.webtest("manager2","","dormManager");
				
			
			return ans;
		}
		public static String IT_TD_001_001_006() throws IOException, SAXException{
			CASE_NUM="IT_TD_001_001_006";
			String ans=LoginHttpTest.webtest("manager2","555","admin");
				
			
			return ans;
		}
		public static String IT_TD_001_001_007() throws IOException, SAXException{
			CASE_NUM="IT_TD_001_001_007";
			String ans=LoginHttpTest.webtest("","123","student");
				
			
			return ans;
		}
		public static String IT_TD_001_001_008() throws IOException, SAXException{
			CASE_NUM="IT_TD_001_001_008";
			String ans=LoginHttpTest.webtest("002","","student");
				
			
			return ans;
		}
		public static String IT_TD_001_001_009() throws IOException, SAXException{
			CASE_NUM="IT_TD_001_001_009";
			String ans=LoginHttpTest.webtest("002","123","admin");
				
			
			return ans;
		}
		public static String IT_TD_001_002_001() throws IOException, SAXException{
			CASE_NUM="IT_TD_001_002_001";
			String ans=LoginHttpTest.webtest("admin","222","admin");
				
			
			return ans;
		}
		public static String IT_TD_001_002_002() throws IOException, SAXException{
			CASE_NUM="IT_TD_001_002_002";
			String ans=LoginHttpTest.webtest("manager2","333","dormManager");
				
			
			return ans;
		}
		public static String IT_TD_001_002_003() throws IOException, SAXException{
			CASE_NUM="IT_TD_001_002_003";
			String ans=LoginHttpTest.webtest("002","444","student");
				
			
			return ans;
		}
		public static String IT_TD_001_003_001() throws IOException, SAXException{
			CASE_NUM="IT_TD_001_003_001";
			String ans=LoginHttpTest.webtest("admin","555","admin");
				
			
			return ans;
		}
		public static String IT_TD_001_003_002() throws IOException, SAXException{
			CASE_NUM="IT_TD_001_003_002";
			String ans=LoginHttpTest.webtest("admin","123","admin");
				
			
			return ans;
		}
		public static String IT_TD_001_003_003() throws IOException, SAXException{
			CASE_NUM="IT_TD_001_003_003";
			String ans=LoginHttpTest.webtest("manager2","111","dormManager");
				
			
			return ans;
		}
		public static String IT_TD_001_003_004() throws IOException, SAXException{
			CASE_NUM="IT_TD_001_003_004";
			String ans=LoginHttpTest.webtest("manager2","123","dormManager");
				
			
			return ans;
		}
		public static String IT_TD_001_003_005() throws IOException, SAXException{
			CASE_NUM="IT_TD_001_003_005";
			String ans=LoginHttpTest.webtest("002","111","student");
				
			
			return ans;
		}
		public static String IT_TD_001_003_006() throws IOException, SAXException{
			CASE_NUM="IT_TD_001_003_006";
			String ans=LoginHttpTest.webtest("002","555","student");
				
			
			return ans;
		}
		public static String IT_TD_001_004_001() throws IOException, SAXException{
			CASE_NUM="IT_TD_001_004_001";
			String ans=LoginHttpTest.webtest("admin1111","111","admin");
				
			
			return ans;
		}
		public static String IT_TD_001_004_002() throws IOException, SAXException{
			CASE_NUM="IT_TD_001_004_002";
			String ans=LoginHttpTest.webtest("manager2222","555","dormManager");
				
			
			return ans;
		}
		public static String IT_TD_001_004_003() throws IOException, SAXException{
			CASE_NUM="IT_TD_001_004_003";
			String ans=LoginHttpTest.webtest("888","123","student");
				
			
			return ans;
		}
		public static String IT_TD_001_005_001() throws IOException, SAXException{
			CASE_NUM="IT_TD_001_005_001";
				String ans=LoginHttpTest.webtest("admin","111","student");
				
			
			return ans;
		}
		public static String IT_TD_001_005_002() throws IOException, SAXException{
			CASE_NUM="IT_TD_001_005_002";
			String ans=LoginHttpTest.webtest("admin","111","student");
				
			
			return ans;
		}
		public static String IT_TD_001_005_003() throws IOException, SAXException{
			CASE_NUM="IT_TD_001_005_003";
			String ans=LoginHttpTest.webtest("manager2","555","admin");
				
			
			return ans;
		}
		public static String IT_TD_001_005_004() throws IOException, SAXException{
			CASE_NUM="IT_TD_001_005_004";
			String ans=LoginHttpTest.webtest("manager2","555","student");
				
			
			return ans;
		}
		public static String IT_TD_001_005_005() throws IOException, SAXException{
			CASE_NUM="IT_TD_001_005_005";
			String ans=LoginHttpTest.webtest("002","123","admin");
				
			
			return ans;
		}
		public static String IT_TD_001_005_006() throws IOException, SAXException{
			CASE_NUM="IT_TD_001_005_006";
			String ans=LoginHttpTest.webtest("002","123","dormManager");
				
			
			return ans;
		}
		public static String IT_TD_001_006_001() throws IOException, SAXException{
			CASE_NUM="IT_TD_001_006_001";
			String ans=LoginHttpTest.webtest("admin","111","admin");
				
			
			return ans;
		}
		public static String IT_TD_001_006_002() throws IOException, SAXException{
			CASE_NUM="IT_TD_001_006_002";
			String ans=LoginHttpTest.webtest("manager2","555","dormManager");
				
			
			return ans;
		}
		public static String IT_TD_001_006_003() throws IOException, SAXException{
			CASE_NUM="IT_TD_001_006_003";
			String ans=LoginHttpTest.webtest("002","123","student");
				
			
			return ans;
		}
		
		@Test
		public static void test() throws IOException, SAXException{
			
			String ans=IT_TD_001_001_001();
			assertEquals(ans,"error");
			assertEquals(IT_TD_001_001_002(),"error");
			assertEquals(IT_TD_001_001_003(),"error");
			assertEquals(IT_TD_001_001_004(),"error");
			assertEquals(IT_TD_001_001_005(),"error");
			assertEquals(IT_TD_001_001_006(),"error");
			assertEquals(IT_TD_001_001_007(),"error");
			assertEquals(IT_TD_001_001_008(),"error");
			assertEquals(IT_TD_001_001_009(),"error");
			assertEquals(IT_TD_001_002_001(),"error");
			assertEquals(IT_TD_001_002_002(),"error");
			assertEquals(IT_TD_001_002_003(),"error");
			assertEquals(IT_TD_001_003_001(),"error");
			assertEquals(IT_TD_001_003_002(),"error");
			assertEquals(IT_TD_001_003_003(),"error");
			assertEquals(IT_TD_001_003_004(),"error");
			assertEquals(IT_TD_001_003_005(),"error");
			assertEquals(IT_TD_001_003_006(),"error");
			assertEquals(IT_TD_001_004_001(),"error");
			assertEquals(IT_TD_001_004_002(),"error");
			assertEquals(IT_TD_001_004_003(),"error");
			assertEquals(IT_TD_001_005_001(),"error");
			assertEquals(IT_TD_001_005_002(),"error");
			assertEquals(IT_TD_001_005_003(),"error");
			assertEquals(IT_TD_001_005_004(),"error");
			assertEquals(IT_TD_001_005_005(),"error");
			assertEquals(IT_TD_001_005_006(),"error");
			assertEquals(IT_TD_001_006_001(),"successfully");
			assertEquals(IT_TD_001_006_002(),"successfully");
			assertEquals(IT_TD_001_006_003(),"successfully");
		}
		public static void main(String[] args) throws IOException, SAXException {
			test();
		}
}
