package com.integrationtest.DormBuild;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.lero.model.DormBuild;
import com.test.DormBuild.dormBuildServlet_UnitTest;

public class DormBuildAdd_stub {
	public static int dormBuildAdd(Connection con, DormBuild dormBuild)throws Exception {
		if(
		   
		   DormBuildTest.CASE_NUM.equals("IT_TD_003_004_001")){
			
		String sql = "insert into t_dormBuild values(null,'6¶°','six')";
		PreparedStatement pstmt=con.prepareStatement(sql);
		
		return pstmt.executeUpdate();
		}
		return -1;
	}
}
