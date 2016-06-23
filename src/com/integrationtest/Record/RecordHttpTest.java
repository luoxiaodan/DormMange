package com.integrationtest.Record;

import java.io.IOException;

import org.xml.sax.SAXException;

import com.integrationtest.Login.LoginHttp;
import com.meterware.httpunit.GetMethodWebRequest;
import com.meterware.httpunit.WebRequest;
import com.meterware.httpunit.WebResponse;
import com.meterware.servletunit.ServletRunner;
import com.meterware.servletunit.ServletUnitClient;

public class RecordHttpTest {
	public static String webLogin(String username,String password,String userType) throws IOException, SAXException{
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
}
