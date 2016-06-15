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
import com.lero.dao.DormManagerDao;
import com.lero.dao.RecordDao;
import com.lero.dao.StudentDao;
import com.lero.model.DormManager;
import com.lero.model.Record;
import com.lero.model.Student;
import com.lero.util.DbUtil;
import com.lero.util.StringUtil;

public class RecordServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	static DbUtil dbUtil = new DbUtil();
	static RecordDao recordDao = new RecordDao();
	static boolean Record=false;

	public static boolean Record(String dormManagerId,String recordId,String studentNumber,String detail,String action) {
	
	
		Calendar rightNow = Calendar.getInstance();       
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");   
		String date = fmt.format(rightNow.getTime());
		Record record = new Record();
		if(StringUtil.isNotEmpty(action)){
		if("preSave".equals(action)) {
			recordPreSave(dormManagerId,recordId,studentNumber,date,detail);
		
		} else if("save".equals(action)){
			recordSave(dormManagerId,recordId,studentNumber,date,detail);
			
		} }
		return Record;
	}

	

	private static void recordSave(String dormManagerId,String recordId,String studentNumber,String date,String detail) {
		
		if(StringUtil.isNotEmpty(dormManagerId)&&StringUtil.isNotEmpty(recordId)&&StringUtil.isNotEmpty(studentNumber)
				&&StringUtil.isNotEmpty(detail)){
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
			DormManagerDao dormManagerDao=new DormManagerDao();
			DormManager manager = dormManagerDao.dormManagerShow(con,dormManagerId);
			int buildId = manager.getDormBuildId();
			Student student = StudentDao.getNameById(con, studentNumber, buildId);
			if(student.getName() == null) {
				System.out.println("ѧ�Ų��������������¥��");
			} else {
				record.setDormBuildId(student.getDormBuildId());
				record.setStudentName(student.getName());
				record.setDormName(student.getDormName());
				
					saveNum = recordServlet_stub.recordAdd(con, record);
				
				if(saveNum > 0) {
			Record=true;
			} else {
					
					System.out.println("����ʧ��");
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

	private static void recordPreSave(String dormManagerId,String recordId,String studentNumber,String date,String detail) {
		
		if(StringUtil.isNotEmpty(dormManagerId)&&StringUtil.isNotEmpty(recordId)&&StringUtil.isNotEmpty(studentNumber)
				&&StringUtil.isNotEmpty(detail)){
		Connection con = null;
			Record record = new Record(studentNumber, date, detail); 
			if(StringUtil.isNotEmpty(recordId)) {
				if(Integer.parseInt(recordId)!=0) {
					record.setRecordId(Integer.parseInt(recordId));
				}
			}
		try {
			con = dbUtil.getCon();
			int saveNum = 0;
			DormManagerDao dormManagerDao=new DormManagerDao();
			DormManager manager = dormManagerDao.dormManagerShow(con,dormManagerId);
			int buildId = manager.getDormBuildId();
			Student student = StudentDao.getNameById(con, studentNumber, buildId);
			if(student.getName() == null) {
				System.out.println("ѧ�Ų��������������¥��");
			} else {
				record.setDormBuildId(student.getDormBuildId());
				record.setStudentName(student.getName());
				record.setDormName(student.getDormName());
						saveNum = recordServlet_stub.recordUpdate(con, record);
				
				if(saveNum > 0) {
			Record=true;
			} else {
					
					System.out.println("�޸�ʧ��");
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
