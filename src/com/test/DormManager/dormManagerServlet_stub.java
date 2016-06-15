package com.test.DormManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.lero.model.DormManager;
import com.test.DormBuild.dormBuildServlet_UnitTest;

public class dormManagerServlet_stub {
	public static boolean STUB_SUC=false;
	
	public static int dormManagerAdd(Connection con, DormManager dormManager)throws Exception {
	    if(dormBuildServlet_UnitTest.CASE_NUM.equals("")){
	    	STUB_SUC=true;
		String sql = "insert into t_dormManager values(null,?,?,null,?,?,?)";
		PreparedStatement pstmt=con.prepareStatement(sql);
		pstmt.setString(1, dormManager.getUserName());
		pstmt.setString(2, dormManager.getPassword());
		pstmt.setString(3, dormManager.getName());
		pstmt.setString(4, dormManager.getSex());
		pstmt.setString(5, dormManager.getTel());
		return pstmt.executeUpdate();
	    }
	    return -1;
	}
	public static int dormManagerUpdate(Connection con, DormManager dormManager)throws Exception {
		if(dormBuildServlet_UnitTest.CASE_NUM.equals("UT_TC_001_004_002_001")||
				dormBuildServlet_UnitTest.CASE_NUM.equals("UT_TC_001_004_003_001")||
				dormBuildServlet_UnitTest.CASE_NUM.equals("UT_TC_001_004_004_001")||
				dormBuildServlet_UnitTest.CASE_NUM.equals("UT_TC_001_004_006_001")){
			STUB_SUC=true;
		String sql = "update t_dormManager set userName=?,password=?,name=?,sex=?,tel=? where dormManId=?";
		PreparedStatement pstmt=con.prepareStatement(sql);
		pstmt.setString(1, dormManager.getUserName());
		pstmt.setString(2, dormManager.getPassword());
		pstmt.setString(3, dormManager.getName());
		pstmt.setString(4, dormManager.getSex());
		pstmt.setString(5, dormManager.getTel());
		pstmt.setInt(6, dormManager.getDormManagerId());
		return pstmt.executeUpdate();
		}
		return -1;
	}
	public static boolean haveManagerByUser(Connection con, String userName) throws Exception {
		String sql = "select * from t_dormmanager t1 where t1.userName=?";
		PreparedStatement pstmt=con.prepareStatement(sql);
		pstmt.setString(1, userName);
		ResultSet rs=pstmt.executeQuery();
		if(rs.next()) {
			return true;
		}
		return false;
	}

}
