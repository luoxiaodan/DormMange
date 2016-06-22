package com.integrationtest.Login;

import java.sql.Connection;

import com.lero.dao.UserDao;
import com.lero.model.Admin;
import com.lero.model.DormManager;
import com.lero.model.Student;
import com.lero.util.DbUtil;


public class LoginServlet {
	private static final long serialVersionUID = 1L;

	static DbUtil dbUtil = new DbUtil();
	static UserDao userDao = new UserDao();
	
	

	public static boolean Login(String userName,String password,String userType){
		String remember ="";
		boolean Login=false;
		Connection con = null;
		try {
			con=dbUtil.getCon();
			Admin currentAdmin = null;
			DormManager currentDormManager = null;
			Student currentStudent = null;
			if("admin".equals(userType)) {
				Admin admin = new Admin(userName, password);
			//	currentAdmin = LoginAdmin_stub.adminLogin(con, admin);
				currentAdmin = userDao.Login(con, admin);
				
				if(currentAdmin == null) {
					System.out.println("登录名或密码不对或账户类型不匹配！");
					
				} else {
					
					Login=true;
						}
			} else if("dormManager".equals(userType)) {
				DormManager dormManager = new DormManager(userName, password);
			//	currentDormManager = LoginManager_stub.managerLogin(con, dormManager);
				currentDormManager = userDao.Login(con, dormManager);
				
				if(currentDormManager == null) {
					System.out.println("登录名或密码不对或账户类型不匹配！");
					
				} else {
					
					Login=true;
						}
			} else if("student".equals(userType)) {
				Student student = new Student(userName, password);
			//	currentStudent = LoginStudent_stub.studentLogin(con, student);
				currentStudent = userDao.Login(con, student);
				
				if(currentStudent == null) {
					System.out.println("登录名或密码不对或账户类型不匹配！");
						
				} else {
					
					Login=true;
						}
			} 
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				dbUtil.closeCon(con);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return Login;
	}

}
