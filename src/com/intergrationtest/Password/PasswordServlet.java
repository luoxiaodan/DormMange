package com.intergrationtest.Password;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lero.dao.UserDao;
import com.lero.model.Admin;
import com.lero.model.DormManager;
import com.lero.model.Student;
import com.lero.util.DbUtil;
import com.lero.util.StringUtil;

public class PasswordServlet {
	private static final long serialVersionUID = 1L;

	static DbUtil dbUtil = new DbUtil();
	static UserDao userDao = new  UserDao();
	
	
	
	public static boolean passwordChange(String currentUserType,String oldPassword,String newPassword,String rnewPassword){
	boolean Password=false;
	if(!StringUtil.isNotEmpty(rnewPassword)){
		System.out.println("重复密码不能为空");
	}else{
	if(!StringUtil.isNotEmpty(newPassword)){
		System.out.println("新密码不能为空");
	}else{
	if(!StringUtil.isNotEmpty(oldPassword)){
		System.out.println("原密码不能为空");
	}else{
		if(!rnewPassword.equals(newPassword)){
			System.out.println("两次密码不同");
		
	}else{
		Connection con = null;
		try {
			con = dbUtil.getCon();
			
			if("admin".equals((String)currentUserType)) {
				Admin admin = userDao.Login(con,new Admin("admin","111"));
				if(oldPassword.equals(admin.getPassword())) {
					PasswordAdmin_stub.adminUpdate(con, admin.getAdminId(), newPassword);
					//userDao.adminUpdate(con, admin.getAdminId(), newPassword);
					
					admin.setPassword(newPassword);
					Password=true;
				} else {
				System.out.println("原密码错误");
				}
			} else if("dormManager".equals((String)currentUserType)) {
				DormManager manager = userDao.Login(con,new DormManager("manager2","555"));
				if(oldPassword.equals(manager.getPassword())) {
					PasswordManager_stub.managerUpdate(con, manager.getDormManagerId(), newPassword);
					//userDao.managerUpdate(con, manager.getDormManagerId(), newPassword);
					
					manager.setPassword(newPassword);
					Password=true;
				} else {
				System.out.println("原密码错误");
				}
			} else if("student".equals((String)currentUserType)) {
				Student student = userDao.Login(con,new Student("002","123"));
				if(oldPassword.equals(student.getPassword())) {
					PasswordStudent_stub.studentUpdate(con, student.getStudentId(), newPassword);
				//	userDao.studentUpdate(con, student.getStudentId(), newPassword);
					
					student.setPassword(newPassword);
					Password=true;
				} else {
				System.out.println("原密码错误");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				dbUtil.closeCon(con);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	}
	}
	}
		return Password;
	}
	
	

}
