package com.test.Login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.lero.dao.DormBuildDao;
import com.lero.model.Admin;
import com.lero.model.DormManager;
import com.lero.model.Student;

public class loginServlet_stub {
	public static boolean STUB_SUC=false;
	
	public static Admin adminLogin(Connection con,Admin admin) throws SQLException{
		Admin resultAdmin = null;
		if(loginServlet_UnitTest.CASE_NUM.equals("UT_TC_001_001_002_001")||
		   loginServlet_UnitTest.CASE_NUM.equals("UT_TC_001_001_003_001")||
		   loginServlet_UnitTest.CASE_NUM.equals("UT_TC_001_001_003_002")||
		   loginServlet_UnitTest.CASE_NUM.equals("UT_TC_001_001_004_001")||
		   loginServlet_UnitTest.CASE_NUM.equals("UT_TC_001_001_006_001")){
			
			STUB_SUC=true;
		String sql = "select * from t_admin where userName=? and password=?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, admin.getUserName());
		pstmt.setString(2, admin.getPassword());
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			resultAdmin = new Admin();
			resultAdmin.setAdminId(rs.getInt("adminId"));
			resultAdmin.setUserName(rs.getString("userName"));
			resultAdmin.setPassword(rs.getString("password"));
			resultAdmin.setName(rs.getString("name"));
			resultAdmin.setSex(rs.getString("sex"));
			resultAdmin.setTel(rs.getString("tel"));
		}
		}
		return resultAdmin;
		
	}
	
	public static DormManager managerLogin(Connection con, DormManager dormManager) throws SQLException{
		DormManager resultDormManager = null;
		if(loginServlet_UnitTest.CASE_NUM.equals("UT_TC_001_001_002_002")||
			loginServlet_UnitTest.CASE_NUM.equals("UT_TC_001_001_003_003")||
			loginServlet_UnitTest.CASE_NUM.equals("UT_TC_001_001_003_004")||
			loginServlet_UnitTest.CASE_NUM.equals("UT_TC_001_001_004_002")||
			loginServlet_UnitTest.CASE_NUM.equals("UT_TC_001_001_006_002")){
					
			STUB_SUC=true;
		String sql = "select * from t_dormmanager where userName=? and password=?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, dormManager.getUserName());
		pstmt.setString(2, dormManager.getPassword());
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			resultDormManager = new DormManager();
			resultDormManager.setDormManagerId(rs.getInt("dormManId"));
			resultDormManager.setUserName(rs.getString("userName"));
			resultDormManager.setPassword(rs.getString("password"));
			resultDormManager.setDormBuildId(rs.getInt("dormBuildId"));
			resultDormManager.setName(rs.getString("name"));
			resultDormManager.setSex(rs.getString("sex"));
			resultDormManager.setTel(rs.getString("tel"));
		}
		}
		return resultDormManager;
	
	}
	
	public static Student stutentLogin(Connection con, Student student) throws Exception{
		Student resultStudent = null;
		if(loginServlet_UnitTest.CASE_NUM.equals("UT_TC_001_001_002_003")||
		   loginServlet_UnitTest.CASE_NUM.equals("UT_TC_001_001_003_005")||
		   loginServlet_UnitTest.CASE_NUM.equals("UT_TC_001_001_003_006")||
		   loginServlet_UnitTest.CASE_NUM.equals("UT_TC_001_001_004_003")||
		   loginServlet_UnitTest.CASE_NUM.equals("UT_TC_001_001_006_003")){
					
			STUB_SUC=true;
		String sql = "select * from t_student where stuNum=? and password=?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, student.getStuNumber());
		pstmt.setString(2, student.getPassword());
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			resultStudent = new Student();
			resultStudent.setStudentId(rs.getInt("studentId"));
			resultStudent.setStuNumber(rs.getString("stuNum"));
			resultStudent.setPassword(rs.getString("password"));
			int dormBuildId = rs.getInt("dormBuildId");
			resultStudent.setDormBuildId(dormBuildId);
			resultStudent.setDormBuildName(DormBuildDao.dormBuildName(con, dormBuildId));
			resultStudent.setDormName(rs.getString("dormName"));
			resultStudent.setName(rs.getString("name"));
			resultStudent.setSex(rs.getString("sex"));
			resultStudent.setTel(rs.getString("tel"));
		}
		}
		return resultStudent;
	}

}
