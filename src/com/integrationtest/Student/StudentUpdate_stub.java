package com.integrationtest.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.lero.model.Student;

public class StudentUpdate_stub {
	public static int studentUpdate(Connection con, Student student)throws Exception {
	if(StudentTest.CASE_NUM.equals("IT_TD_008_004_001")){
		String sql = "update t_student set stuNum='001',password='123',name='Ð¡ÕÅ',dormBuildId=1,dormName='1¶°',sex='ÄÐ',tel='123' where studentId=28";
		PreparedStatement pstmt=con.prepareStatement(sql);
		
		return pstmt.executeUpdate();}
	return -1;
	}
}
