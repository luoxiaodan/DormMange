package com.test.Login;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lero.dao.UserDao;
import com.lero.model.Admin;
import com.lero.model.DormManager;
import com.lero.model.Student;
import com.lero.util.DbUtil;

public class LoginServlet extends HttpServlet {

	/**
	 * 
	 */
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
				currentAdmin = loginServlet_stub.adminLogin(con, admin);
				if(currentAdmin == null) {
					//return Login;
					
				} else {
					
					Login=true;
						}
			} else if("dormManager".equals(userType)) {
				DormManager dormManager = new DormManager(userName, password);
				currentDormManager = userDao.Login(con, dormManager);
				if(currentDormManager == null) {
                     //  return false;
					
				} else {
					
					Login=true;
						}
			} else if("student".equals(userType)) {
				Student student = new Student(userName, password);
				currentStudent = userDao.Login(con, student);
				if(currentStudent == null) {
                   //  return false;
					
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
