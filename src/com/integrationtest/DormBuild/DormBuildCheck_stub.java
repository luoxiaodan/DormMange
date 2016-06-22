package com.integrationtest.DormBuild;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DormBuildCheck_stub {
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
