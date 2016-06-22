package com.integrationtest.Login;

import java.sql.Connection;

import com.lero.model.Admin;

public class LoginAdmin_stub {
	
	public static Admin adminLogin(Connection conn,Admin admin){
		Admin resultAdmin = null;
		if(LoginTest.CASE_NUM.equals("IT_TD_001_001_006_001")){
			resultAdmin=new Admin("admin","111");
		}
		
		
		return resultAdmin;
	}

}
