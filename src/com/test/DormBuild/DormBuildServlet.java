package com.test.DormBuild;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lero.dao.DormBuildDao;
import com.lero.model.DormBuild;
import com.lero.model.DormManager;
import com.lero.model.PageBean;
import com.lero.util.DbUtil;
import com.lero.util.PropertiesUtil;
import com.lero.util.StringUtil;

public class DormBuildServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	static DbUtil dbUtil = new DbUtil();
	
	static boolean DormBuild=false;

	public static boolean DormBuild(String dormBuildId,String dormBuildName,String detail,String action)  {
		
		
		if(StringUtil.isEmpty(dormBuildName)||StringUtil.isEmpty(action)) {
			return DormBuild;
			
		}else{
		DormBuild dormBuild = new DormBuild();
		if("preSave".equals(action)) {
			dormBuildPreSave(dormBuildId,dormBuildName,detail);
			
		} else if("save".equals(action)){
			dormBuildSave(dormBuildId,dormBuildName,detail);
			
		} else if("delete".equals(action)){
			dormBuildDelete(dormBuildId,dormBuildName);
			
		}
			return DormBuild;
		}
		
		
	}
	


	

	private static void dormBuildDelete(String dormBuildId,String dormBuildName) {
	
		Connection con = null;
		try {
			con = dbUtil.getCon();
			if(dormBuildServlet_stub.existManOrDormWithId(con, dormBuildId)) {
			System.out.println("ËÞÉáÂ¥ÏÂÓÐËÞÉá»òËÞ¹Ü£¬²»ÄÜÉ¾³ý¸ÃËÞÉáÂ¥");
			} else {
				dormBuildServlet_stub.dormBuildDelete(con, dormBuildId);
				DormBuild=true;
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

	private static void dormBuildSave(String dormBuildId,String dormBuildName,String detail) {
		
		
		DormBuild dormBuild = new DormBuild(dormBuildName, detail);
		if(StringUtil.isNotEmpty(dormBuildId)) {
			dormBuild.setDormBuildId(Integer.parseInt(dormBuildId));
		}
		
		Connection con = null;
		try {
			con = dbUtil.getCon();
			if(dormBuildServlet_stub.checkName(con,dormBuildName)){
				
			
			int saveNum = 0;
			
				saveNum = dormBuildServlet_stub.dormBuildAdd(con, dormBuild);
			
			if(saveNum > 0) {
		    DormBuild=true;
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

	private static void dormBuildPreSave(String dormBuildId,String dormBuildName,String detail){
		
		if(StringUtil.isNotEmpty(dormBuildId)) {
			Connection con = null;
			try {
				con = dbUtil.getCon();
				DormBuild dormBuild = new DormBuild(dormBuildName, detail);
				dormBuild.setDormBuildId(Integer.parseInt(dormBuildId));
				int presave=dormBuildServlet_stub.dormBuildUpdate(con, dormBuild);
				if(presave>0){
					DormBuild=true;
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