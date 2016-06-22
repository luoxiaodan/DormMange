package com.intergrationtest.Password;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class PasswordAdmin_stub {

	public static int adminUpdate(Connection con, int adminId, String password)throws Exception {
		if(PasswordTest.CASE_NUM.equals("IT_TD_002_004_001")){
		String sql = "update t_admin set password='222' where adminId=1";
		PreparedStatement pstmt = con.prepareStatement(sql);
		return pstmt.executeUpdate();
		}
		return -1;
	}
}
