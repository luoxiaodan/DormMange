package com.intergrationtest.Password;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class PasswordStudent_stub {
	public static int studentUpdate(Connection con, int studentId, String password)throws Exception {
		if(PasswordTest.CASE_NUM.equals("IT_TD_002_004_003")){
		String sql = "update t_student set password='222' where studentId=2";
		PreparedStatement pstmt = con.prepareStatement(sql);
    	return pstmt.executeUpdate();
		}
		return -1;
	}
}
