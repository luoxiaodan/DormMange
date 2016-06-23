package com.integrationtest.web;

import java.io.IOException;

import org.xml.sax.SAXException;

import com.lero.web.DormManagerServlet;
import com.lero.web.StudentServlet;
import com.meterware.httpunit.Button;
import com.meterware.httpunit.GetMethodWebRequest;
import com.meterware.httpunit.HttpUnitOptions;
import com.meterware.httpunit.PostMethodWebRequest;
import com.meterware.httpunit.SubmitButton;
import com.meterware.httpunit.WebClient;
import com.meterware.httpunit.WebConversation;
import com.meterware.httpunit.WebForm;
import com.meterware.httpunit.WebLink;
import com.meterware.httpunit.WebRequest;
import com.meterware.httpunit.WebResponse;
import com.meterware.servletunit.InvocationContext;
import com.meterware.servletunit.ServletRunner;
import com.meterware.servletunit.ServletUnitClient;

public class LoginWeb {
	
	public static void managerTest() throws IOException, SAXException{  
        
    	HttpUnitOptions.setScriptingEnabled(false);  
        WebConversation wc = new WebConversation();  
        WebRequest request = new PostMethodWebRequest("http://localhost:8080/DormManage/login.jsp");  
   //     WebRequest request = new PostMethodWebRequest(" http://localhost:8080/DormManage/student?action=list");  
        request.setParameter("userName", "manager2");    
        request.setParameter("password", "555");   
       // System.out.println(wr.getText());    
        WebResponse response = null;  

        try {  
            response = wc.getResponse(request);  
            WebForm form = response.getFormWithName("myForm");  
            form.setParameter("userName", "manager2");  
            form.setParameter("password", "555"); 
            form.setParameter("userType", "dormManager"); 
           response = form.submit();
            
          addrecordTest(response,wc);
         //  addstudentTest(response,wc);
         //  addbuildTest(response,wc);
         //  changepwTest(response,wc);
       } catch (IOException e) {  
          //  e.printStackTrace();  
        } catch (SAXException e) {  
            //e.printStackTrace();  
        }  
    
    }   
    public static void adminTest() throws IOException, SAXException{  
         
    	HttpUnitOptions.setScriptingEnabled(false);  
        WebConversation wc = new WebConversation();  
        WebRequest request = new PostMethodWebRequest("http://localhost:8080/DormManage/login.jsp");  
   //     WebRequest request = new PostMethodWebRequest(" http://localhost:8080/DormManage/student?action=list");  
        request.setParameter("userName", "admin");    
        request.setParameter("password", "111"); 
       
       // System.out.println(wr.getText());    
        WebResponse response = null;  

        try {  
            response = wc.getResponse(request);  
            WebForm form = response.getFormWithName("myForm");  
            form.setParameter("userName", "admin");  
            form.setParameter("password", "111"); 
            form.setParameter("userTpye", "admin"); 
           response = form.submit();
            
         //  addmanagerTest(response,wc);
         //  addstudentTest(response,wc);
         //  addbuildTest(response,wc);
         //  changepwTest(response,wc);
       } catch (IOException e) {  
          //  e.printStackTrace();  
        } catch (SAXException e) {  
            //e.printStackTrace();  
        }  
    
    }  
    public static void changepwTest(WebResponse response,WebConversation wc) throws SAXException, IOException{
        WebLink[] link=response.getLinks();
        
        // for(int i=1;i<7;i++){
            String linkText=link[5].getText();
            System.out.print("linkText:"+linkText+"\n");
           
         //   link[5].click();
            WebResponse nextLink = wc.getCurrentPage();   //dormBuild.jsp
            WebRequest request =  new PostMethodWebRequest("http://localhost:8080/DormManage/password?action=preChange");     //dormBuild.jsp
            response = wc.getResponse(request);
            System.out.println(response.getText());
           WebForm  form = response.getForms()[0];
           form.setParameter("oldPassword", "111");  
           form.setParameter("newPassword", "222"); 
           form.setParameter("rPassword", "222"); 
           response = form.submit();
           nextLink = wc.getCurrentPage(); 
       //   System.out.println(wc.getCurrentPage());
   }
    public static void addbuildTest(WebResponse response,WebConversation wc) throws SAXException, IOException{
        WebLink[] link=response.getLinks();
        
        // for(int i=1;i<7;i++){
            String linkText=link[3].getText();
            System.out.print("linkText:"+linkText+"\n");
           
            link[3].click();
            WebResponse nextLink = wc.getCurrentPage();   //dormBuild.jsp
            WebForm form = nextLink.getFormWithName("myForm");  
           Button button = form.getButtonWithID("add");
           button.click();
        
           WebRequest request =  new PostMethodWebRequest("http://localhost:8080/DormManage/dormBuild?action=preSave");     //dormBuild.jsp
           response = wc.getResponse(request);  
           System.out.println(response.getText());
           form = response.getForms()[0];
           form.setParameter("dormBuildName", "12栋");  
           form.setParameter("detail", "12"); 
           
           response = form.submit();
           nextLink = wc.getCurrentPage(); 
       //   System.out.println(wc.getCurrentPage());
   }
    
    public static void addrecordTest(WebResponse response,WebConversation wc) throws SAXException, IOException{
        WebLink[] link=response.getLinks();
        
        // for(int i=1;i<7;i++){
            String linkText=link[2].getText();
            System.out.print("linkText:"+linkText+"\n");
           
            link[2].click();
            WebResponse nextLink = wc.getCurrentPage();   //dormBuild.jsp
            WebForm form = nextLink.getFormWithName("myForm");  
          
        
           WebRequest request =  new PostMethodWebRequest("http://localhost:8080/DormManage/record?action=preSave");     //dormBuild.jsp
           response = wc.getResponse(request);  
           System.out.println(response.getText());
           form = response.getForms()[0];
           form.setParameter("studentNumber", "002");  
           form.setParameter("detail", "123"); 
           
           response = form.submit();
           nextLink = wc.getCurrentPage(); 
       //   System.out.println(wc.getCurrentPage());
   }
    public static void addstudentTest(WebResponse response,WebConversation wc) throws SAXException, IOException{
     WebLink[] link=response.getLinks();
         
         // for(int i=1;i<7;i++){
             String linkText=link[2].getText();
             System.out.print("linkText:"+linkText+"\n");
            
             link[2].click();
             WebResponse nextLink = wc.getCurrentPage();   //dormBuild.jsp
             WebForm form = nextLink.getFormWithName("myForm");  
         //   Button button = form.getButtonWithID("add");
          //  button.click();
         
            WebRequest request =  new PostMethodWebRequest("http://localhost:8080/DormManage/student?action=preSave");     //dormBuild.jsp
            response = wc.getResponse(request);  
            System.out.println(response.getText());
            form = response.getForms()[0];
            form.setParameter("userName", "020");  
            form.setParameter("password", "123"); 
            form.setParameter("rPassword", "123");
            form.setParameter("name", "李李"); 
            form.setParameter("sex", "女"); 
            form.setParameter("tel", "1223"); 
            form.setParameter("dormBuildId", "1");
            form.setParameter("dormName", "1栋");
            response = form.submit();
            nextLink = wc.getCurrentPage(); 
        //   System.out.println(wc.getCurrentPage());
    }
    public static void addmanagerTest(WebResponse response,WebConversation wc) throws IOException, SAXException{
    	 WebLink[] link=response.getLinks();
         
         // for(int i=1;i<7;i++){
             String linkText=link[1].getText();
             System.out.print("linkText:"+linkText+"\n");
            
             link[1].click();
             WebResponse nextLink = wc.getCurrentPage();   //dormBuild.jsp
             WebForm form = nextLink.getFormWithName("myForm");  
            Button button = form.getButtonWithID("add");
            button.click();
         
            WebRequest request =  new PostMethodWebRequest("http://localhost:8080/DormManage/dormManager?action=preSave");     //dormBuild.jsp
            response = wc.getResponse(request);  
            form = response.getForms()[0];
            form.setParameter("userName", "manager15");  
            form.setParameter("password", "555"); 
            form.setParameter("rPassword", "555");
            form.setParameter("name", "李李"); 
            form.setParameter("sex", "女"); 
            form.setParameter("tel", "1223"); 
            response = form.submit();
            nextLink = wc.getCurrentPage(); 
           System.out.println(wc.getCurrentPage());
    }
    public static void main(String[] args) {  
        try {  
        	LoginWeb.adminTest();  
        	LoginWeb.managerTest();  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
    }  
      
}
