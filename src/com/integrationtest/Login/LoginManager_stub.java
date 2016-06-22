package com.integrationtest.Login;

import java.sql.Connection;
import java.sql.SQLException;

import com.lero.model.Admin;
import com.lero.model.DormManager;

public class LoginManager_stub {
	public static DormManager managerLogin(Connection con, DormManager dormManager) throws SQLException{
		DormManager resultDormManager = null;
		if(LoginTest.CASE_NUM.equals("IT_TD_001_001_006_002")){
			resultDormManager=new DormManager("manager2","555");
		}
		return resultDormManager;
	}
}
