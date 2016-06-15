package com.test.DormManager;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lero.dao.DormManagerDao;
import com.lero.model.DormManager;
import com.lero.model.PageBean;
import com.lero.util.DbUtil;
import com.lero.util.PropertiesUtil;
import com.lero.util.StringUtil;

public class DormManagerServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	static DbUtil dbUtil = new DbUtil();
	static DormManagerDao dormManagerDao = new DormManagerDao();
	static boolean DormManager=false;

	
	public static boolean DormManager(String userName,String password,String repassword,String name,String sex,String tel,String action){
		
		
		DormManager dormManager = new DormManager();
		if(StringUtil.isNotEmpty(action)){
		if("preSave".equals(action)) {
			dormManagerPreSave(userName,password,repassword,name,sex,tel);
			
		} else if("save".equals(action)){
			dormManagerSave(userName,password,repassword,name,sex,tel);
	
		} 
		}
		return DormManager;
	}

	

	private static void dormManagerSave(String userName,String password,String repassword,String name,String sex,String tel) {
	
		if(StringUtil.isNotEmpty(tel)&&StringUtil.isNotEmpty(name)&&StringUtil.isNotEmpty(userName)&&StringUtil.isNotEmpty(password)&&StringUtil.isNotEmpty(repassword)){
		if(password.equals(repassword)){
			DormManager dormManager = new DormManager(userName, password, name, sex, tel);
		
		Connection con = null;
		try {
			con = dbUtil.getCon();
			int saveNum = 0;
			 if(dormManagerServlet_stub.haveManagerByUser(con, dormManager.getUserName())){
				
				System.out.println("该用户名已存在");
					try {
					dbUtil.closeCon(con);
				} catch (Exception e) {
					e.printStackTrace();
				}
				return;
			} else {
				saveNum = dormManagerServlet_stub.dormManagerAdd(con, dormManager);
			}
			if(saveNum > 0) {
				DormManager=true;
			} else {
				System.out.println("保存失败");
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

	private static void dormManagerPreSave(String userName,String password,String repassword,String name,String sex,String tel){
		
		if(StringUtil.isNotEmpty(tel)&&StringUtil.isNotEmpty(name)&&StringUtil.isNotEmpty(userName)&&StringUtil.isNotEmpty(password)&&StringUtil.isNotEmpty(repassword)){
			if(password.equals(repassword)){
			
			Connection con = null;
			try {
				con = dbUtil.getCon();
				DormManager dormManager = new DormManager(userName, password, name, sex, tel);
				 if(dormManagerServlet_stub.haveManagerByUser(con, dormManager.getUserName())){
						
						System.out.println("该用户名已存在");
							try {
							dbUtil.closeCon(con);
						} catch (Exception e) {
							e.printStackTrace();
						}
						return;
					} else {
				int saveNum = dormManagerServlet_stub.dormManagerUpdate(con, dormManager);
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
