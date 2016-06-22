package com.integrationtest.DormManager;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.lero.model.DormManager;

public class DormManagerAdd_stub {
	public static int dormManagerAdd(Connection con, DormManager dormManager)throws Exception {
	    if(DormManagerTest.CASE_NUM.equals("IT_TD_009_006_001")){
	    	
		String sql = "insert into t_dormManager values(null,'manager10','555',null,'Ð¡Íõ','Å®','123')";
		PreparedStatement pstmt=con.prepareStatement(sql);
		
		return pstmt.executeUpdate();
	    }
	    return -1;
	}
}
