package com.integrationtest.DormManager;

import java.sql.Connection;

import com.lero.dao.DormManagerDao;
import com.lero.model.DormManager;
import com.lero.util.DbUtil;
import com.lero.util.StringUtil;
import com.test.DormManager.dormManagerServlet_stub;

public class DormManagerServlet {
	private static final long serialVersionUID = 1L;

	static DbUtil dbUtil = new DbUtil();
	static DormManagerDao dormManagerDao = new DormManagerDao();
	static boolean DormManager=false;

	
	public static boolean DormManager(String userName,String password,String repassword,String name,String sex,String tel,String action){
		
		DormManager=false;
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
			 if(dormManagerDao.haveManagerByUser(con, dormManager.getUserName())){
				
				System.out.println("该用户名已存在");
					try {
					dbUtil.closeCon(con);
				} catch (Exception e) {
					e.printStackTrace();
				}
				return;
			} else {
				saveNum = DormManagerAdd_stub.dormManagerAdd(con, dormManager);
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
				 if(dormManagerDao.haveManagerByUser(con, dormManager.getUserName())){
						
						System.out.println("该用户名已存在");
							try {
							dbUtil.closeCon(con);
						} catch (Exception e) {
							e.printStackTrace();
						}
						return;
					} else {
				int saveNum = DormManagerUpdate_stub.dormManagerUpdate(con, dormManager);
				if(saveNum > 0) {
					DormManager=true;
				} else {
					System.out.println("修改失败");
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
