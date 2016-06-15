package com.test.DormBuild;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.lero.model.DormBuild;

public class dormBuildServlet_stub {
	public static boolean STUB_SUC=false;
	
	public static boolean existManOrDormWithId(Connection con, String dormBuildId)throws Exception {
		boolean isExist = false;
//		String sql="select * from t_dormBuild,t_dormManager,t_connection where dormManId=managerId and dormBuildId=buildId and dormBuildId=?";
		String sql = "select *from t_dormManager where dormBuildId=?";
		PreparedStatement pstmt=con.prepareStatement(sql);
		pstmt.setString(1, dormBuildId);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			isExist = true;
		} else {
			isExist = false;
		}
		String sql1="select * from t_dormBuild t1,t_dorm t2 where t1.dormBuildId=t2.dormBuildId and t1.dormBuildId=?";
		PreparedStatement p=con.prepareStatement(sql1);
		p.setString(1, dormBuildId);
		ResultSet r = pstmt.executeQuery();
		if(r.next()) {
			return isExist;
		} else {
			return false;
		}
	}
	
	public static int dormBuildAdd(Connection con, DormBuild dormBuild)throws Exception {
		if(
		   
		   dormBuildServlet_UnitTest.CASE_NUM.equals("UT_TC_001_002_003_001")||
		   dormBuildServlet_UnitTest.CASE_NUM.equals("UT_TC_001_002_004_001")){
			STUB_SUC=true;
		String sql = "insert into t_dormBuild values(null,?,?)";
		PreparedStatement pstmt=con.prepareStatement(sql);
		pstmt.setString(1, dormBuild.getDormBuildName());
		pstmt.setString(2, dormBuild.getDetail());
		return pstmt.executeUpdate();
		}
		return -1;
	}
	public static int dormBuildUpdate(Connection con, DormBuild dormBuild)throws Exception {
		if(
		   dormBuildServlet_UnitTest.CASE_NUM.equals("UT_TC_001_003_002_001")||
		   dormBuildServlet_UnitTest.CASE_NUM.equals("UT_TC_001_003_004_001")||
		   dormBuildServlet_UnitTest.CASE_NUM.equals("UT_TC_001_003_005_001")||
		   dormBuildServlet_UnitTest.CASE_NUM.equals("UT_TC_001_003_006_001")){
			STUB_SUC=true;
			String sql = "update t_dormBuild set dormBuildName=?,dormBuildDetail=? where dormBuildId=?";
		PreparedStatement pstmt=con.prepareStatement(sql);
		pstmt.setString(1, dormBuild.getDormBuildName());
		pstmt.setString(2, dormBuild.getDetail());
		pstmt.setInt(3, dormBuild.getDormBuildId());
		return pstmt.executeUpdate();
		}
		return -1;
	}
	public static int dormBuildDelete(Connection con, String dormBuildId)throws Exception {
		String sql = "delete from t_dormBuild where dormBuildId=?";
		PreparedStatement pstmt=con.prepareStatement(sql);
		pstmt.setString(1, dormBuildId);
		return pstmt.executeUpdate();
	}
	public static boolean checkName(Connection con,String name) throws SQLException{
		String sql = "select * from t_dormBuild where dormBuildName=?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, name);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			return false;
		}
		return true;
	}
	
}
