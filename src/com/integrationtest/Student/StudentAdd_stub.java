package com.integrationtest.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.lero.model.Student;

public class StudentAdd_stub {
	public static int studentAdd(Connection con, Student student)throws Exception {
		if(StudentTest.CASE_NUM.equals("IT_TD_007_004_001")){
			
		String sql = "insert into t_student values(null,018,'123','Ð¡ÕÅ','1','1¶°','ÄÐ','1234')";
		PreparedStatement pstmt=con.prepareStatement(sql);
	
		return pstmt.executeUpdate();
		}
		return -1;
	}
}
