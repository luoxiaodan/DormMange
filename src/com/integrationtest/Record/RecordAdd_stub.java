package com.integrationtest.Record;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.lero.model.Record;
import com.test.Record.recordServlet_UnitTest;

public class RecordAdd_stub {
	public static int recordAdd(Connection con, Record record)throws Exception {
		if(RecordTest.CASE_NUM.equals("IT_TD_005_005_001")){
			
		String sql = "insert into t_record values(null,002,'ÀîËÄ',4,'4¶°','2016-06-22','1234')";
		PreparedStatement pstmt=con.prepareStatement(sql);
		
		return pstmt.executeUpdate();
		}
		return -1;
	}
}
