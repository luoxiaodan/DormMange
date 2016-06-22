package com.integrationtest.Record;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.lero.model.Record;
import com.test.Record.recordServlet_UnitTest;

public class RecordUpdate_stub {
	public static int recordUpdate(Connection con, Record record)throws Exception {
		if(RecordTest.CASE_NUM.equals("IT_TD_006_005_001")){
				
			String sql = "update t_record set studentNumber=002,studentName='ÀîËÄ',dormBuildId=4,dormName='4¶°',detail='1234' where recordId=1";
			PreparedStatement pstmt=con.prepareStatement(sql);
			
			return pstmt.executeUpdate();
		}
		return -1;
		}
}
