package com.integrationtest.DormManager;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.lero.model.DormManager;
import com.test.DormBuild.dormBuildServlet_UnitTest;

public class DormManagerUpdate_stub {
	public static int dormManagerUpdate(Connection con, DormManager dormManager)throws Exception {
		  if(DormManagerTest.CASE_NUM.equals("IT_TD_0010_006_001")){
			  	
		String sql = "update t_dormManager set userName='manager12',password='555',name='–°¿Ó',sex='≈Æ',tel='12345' where dormManId=8";
		PreparedStatement pstmt=con.prepareStatement(sql);
	
		return pstmt.executeUpdate();
		}
		return -1;
	}
}
