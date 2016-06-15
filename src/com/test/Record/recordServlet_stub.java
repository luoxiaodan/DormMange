package com.test.Record;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.lero.model.DormManager;
import com.lero.model.Record;

public class recordServlet_stub {
	public static boolean STUB_SUC=false;

	public static int recordUpdate(Connection con, Record record)throws Exception {
	if(recordServlet_UnitTest.CASE_NUM.equals("UT_TC_001_006_002_001")||
			recordServlet_UnitTest.CASE_NUM.equals("UT_TC_001_006_003_001")||
			recordServlet_UnitTest.CASE_NUM.equals("UT_TC_001_006_005_001")){
		STUB_SUC=true;
		String sql = "update t_record set studentNumber=?,studentName=?,dormBuildId=?,dormName=?,detail=? where recordId=?";
		PreparedStatement pstmt=con.prepareStatement(sql);
		pstmt.setString(1, record.getStudentNumber());
		pstmt.setString(2, record.getStudentName());
		pstmt.setInt(3, record.getDormBuildId());
		pstmt.setString(4, record.getDormName());
		pstmt.setString(5, record.getDetail());
		pstmt.setInt(6, record.getRecordId());
		return pstmt.executeUpdate();
	}
	return -1;
	}
	
	public static int recordAdd(Connection con, Record record)throws Exception {
		if(recordServlet_UnitTest.CASE_NUM.equals("UT_TC_001_007_002_001")||
				recordServlet_UnitTest.CASE_NUM.equals("UT_TC_001_007_003_001")||
				recordServlet_UnitTest.CASE_NUM.equals("UT_TC_001_007_005_001")){
			STUB_SUC=true;
		String sql = "insert into t_record values(null,?,?,?,?,?,?)";
		PreparedStatement pstmt=con.prepareStatement(sql);
		pstmt.setString(1, record.getStudentNumber());
		pstmt.setString(2, record.getStudentName());
		pstmt.setInt(3, record.getDormBuildId());
		pstmt.setString(4, record.getDormName());
		pstmt.setString(5, record.getDate());
		pstmt.setString(6, record.getDetail());
		return pstmt.executeUpdate();
		}
		return -1;
	}
	
}
