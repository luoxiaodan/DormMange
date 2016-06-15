package com.test.Record;

import java.io.IOException;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lero.dao.DormBuildDao;
import com.lero.dao.RecordDao;
import com.lero.dao.StudentDao;
import com.lero.model.DormManager;
import com.lero.model.Record;
import com.lero.model.Student;
import com.lero.util.DbUtil;
import com.lero.util.StringUtil;

public class RecordServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	DbUtil dbUtil = new DbUtil();
	RecordDao recordDao = new RecordDao();
	boolean Record=false;

	public static boolean Record(String recordId,String studentNumber,String date,String detail,String action) {
	
	
		
		Record record = new Record();
		if("preSave".equals(action)) {
			recordPreSave(String recordId,String studentNumber,String date,String detail;
		
		} else if("save".equals(action)){
			recordSave(String recordId,String studentNumber,String date,String detail);
			
		} 
	}

	

	private void recordSave(String recordId,String studentNumber,String date,String detail) {
		
		Record record = new Record(studentNumber, date, detail); 
		if(StringUtil.isNotEmpty(recordId)) {
			if(Integer.parseInt(recordId)!=0) {
				record.setRecordId(Integer.parseInt(recordId));
			}
		}
		Connection con = null;
		try {
			con = dbUtil.getCon();
			int saveNum = 0;
			
			DormManager manager = (DormManager)(session.getAttribute("currentUser"));
			int buildId = manager.getDormBuildId();
			Student student = StudentDao.getNameById(con, studentNumber, buildId);
			if(student.getName() == null) {
				System.out.println("学号不在您管理的宿舍楼内");
			} else {
				record.setDormBuildId(student.getDormBuildId());
				record.setStudentName(student.getName());
				record.setDormName(student.getDormName());
				if(StringUtil.isNotEmpty(recordId) && Integer.parseInt(recordId)!=0) {
					saveNum = recordDao.recordUpdate(con, record);
				} else {
					saveNum = recordDao.recordAdd(con, record);
				}
				if(saveNum > 0) {
			Record=true;
			} else {
					
					System.out.println("保存失败");
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

	private void recordPreSave(String recordId,String studentNumber,String date,String detail) {
			Connection con = null;
		try {
			con = dbUtil.getCon();
			if (StringUtil.isNotEmpty(recordId)) {
				Record record = recordDao.recordShow(con, recordId);
			} else {
				Calendar rightNow = Calendar.getInstance();       
				SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");   
				String sysDatetime = fmt.format(rightNow.getTime());
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
