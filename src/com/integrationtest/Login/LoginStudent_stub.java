package com.integrationtest.Login;

import java.sql.Connection;

import com.lero.model.Student;

public class LoginStudent_stub {
	
	public static Student studentLogin(Connection con, Student student) throws Exception{
		Student resultStudent = null;
		if(LoginTest.CASE_NUM.equals("IT_TD_001_001_006_003")){
			resultStudent=new Student("002","123");
		}
	    return 	resultStudent;
	}

}
