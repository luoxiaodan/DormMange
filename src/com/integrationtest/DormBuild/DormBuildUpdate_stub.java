package com.integrationtest.DormBuild;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.lero.model.DormBuild;
import com.test.DormBuild.dormBuildServlet_UnitTest;

public class DormBuildUpdate_stub {
	public static int dormBuildUpdate(Connection con, DormBuild dormBuild)throws Exception {
		if( DormBuildTest.CASE_NUM.equals("IT_TD_004_004_001")){
			String sql = "update t_dormBuild set dormBuildName='2¶°',dormBuildDetail='' where dormBuildId=4";
		PreparedStatement pstmt=con.prepareStatement(sql);
		
		return pstmt.executeUpdate();
		}
		if( DormBuildTest.CASE_NUM.equals("IT_TD_004_005_001")){
			String sql = "update t_dormBuild set dormBuildName='1¶°',dormBuildDetail='first' where dormBuildId=1";
		PreparedStatement pstmt=con.prepareStatement(sql);
		
		return pstmt.executeUpdate();
		}
		if( DormBuildTest.CASE_NUM.equals("IT_TD_004_006_001")){
			String sql = "update t_dormBuild set dormBuildName='11¶°',dormBuildDetail='first' where dormBuildId=1";
		PreparedStatement pstmt=con.prepareStatement(sql);
		
		return pstmt.executeUpdate();
		}
		
		return -1;
	}
}
