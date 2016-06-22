package com.intergrationtest.Password;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class PasswordManager_stub {
	public static int managerUpdate(Connection con, int managerId, String password)throws Exception {
		if(PasswordTest.CASE_NUM.equals("IT_TD_002_004_002")){
		String sql = "update t_dormmanager set password='222' where dormManId=2";
		PreparedStatement pstmt = con.prepareStatement(sql);
		return pstmt.executeUpdate();
		}
		return -1;
	}
}
