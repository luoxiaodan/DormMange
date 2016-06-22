package com.integrationtest.Student;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lero.dao.DormBuildDao;
import com.lero.dao.StudentDao;
import com.lero.model.DormManager;
import com.lero.model.Student;
import com.lero.util.DbUtil;
import com.lero.util.StringUtil;


public class StudentServlet {
	private static final long serialVersionUID = 1L;

	static DbUtil dbUtil = new DbUtil();
	static StudentDao studentDao = new StudentDao();
	static boolean Student=false;
	
	public static  boolean student(String action,String studentId,String userName,String password,String rpassword,String dormBuildId,String dormName,String name,String sex,String tel) {
		
		 Student=false;
		Student student = new Student();
		if("preSave".equals(action)) {
			studentPreSave(studentId,userName,password,rpassword,dormBuildId,dormName,name,sex,tel);
			
		} else if("save".equals(action)){
			studentSave(studentId,userName,password,rpassword,dormBuildId,dormName,name,sex,tel);
			
		} 
		return Student;
	}
	
	private static void studentSave(String studentId,String userName,String password,String rpassword,String dormBuildId,String dormName,String name,String sex,String tel){
		
			if(!StringUtil.isNotEmpty(userName)){
				System.out.println( "ѧ�Ų���Ϊ��");
			}else{
				if(!StringUtil.isNotEmpty(password)){
					System.out.println( "���벻��Ϊ��");
				}else{
					if(!StringUtil.isNotEmpty(rpassword)){
						System.out.println( "�ظ����벻��Ϊ��");
					}else{
						if(!password.equals(rpassword)){
					
						System.out.println( "�������벻��ͬ");
					}else{
						
						if(!StringUtil.isNotEmpty(dormBuildId)){
							System.out.println( "����¥�Ų���Ϊ��");
						}else{
							if(!StringUtil.isNotEmpty(name)){
								System.out.println( "��������Ϊ��");
							}else{	
								if(!StringUtil.isNotEmpty(sex)){
									System.out.println( "�Ա���Ϊ��");
								}else{	
									if(!StringUtil.isNotEmpty(tel)){
										System.out.println( "�绰�Ų���Ϊ��");
									}else{	
								
		Student student = new Student(userName, password, Integer.parseInt(dormBuildId), dormName, name, sex, tel);
		if(StringUtil.isNotEmpty(studentId)) {
			student.setStudentId(Integer.parseInt(studentId));
		}
		Connection con = null;
		try {
			con = dbUtil.getCon();
			int saveNum = 0;
			if(studentDao.haveNameByNumber(con, student.getStuNumber())){
			System.out.println( "��ѧ���Ѵ���");
				try {
					dbUtil.closeCon(con);
				} catch (Exception e) {
					e.printStackTrace();
				}
				return;
			} else {
				saveNum = StudentAdd_stub.studentAdd(con, student);
				//saveNum = studentDao.studentAdd(con, student);
			}
			if(saveNum > 0) {
				Student=true;
				} else {
					System.out.println( "����ʧ��");
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
					}
					}
				}
			}
			
	}
	

	private static void studentPreSave(String studentId,String userName,String password,String rpassword,String dormBuildId,String dormName,String name,String sex,String tel){
		
			if(!StringUtil.isNotEmpty(userName)){
				System.out.println( "ѧ�Ų���Ϊ��");
			}else{
				if(!StringUtil.isNotEmpty(password)){
					System.out.println( "���벻��Ϊ��");
				}else{
					if(!StringUtil.isNotEmpty(rpassword)){
						System.out.println( "�ظ����벻��Ϊ��");
					}else{
						if(!password.equals(rpassword)){
					
						System.out.println( "�������벻��ͬ");
					}else{
						
						if(!StringUtil.isNotEmpty(dormBuildId)){
							System.out.println( "����¥�Ų���Ϊ��");
						}else{
							if(!StringUtil.isNotEmpty(name)){
								System.out.println( "��������Ϊ��");
							}else{	
								if(!StringUtil.isNotEmpty(sex)){
									System.out.println( "�Ա���Ϊ��");
								}else{	
									if(!StringUtil.isNotEmpty(tel)){
										System.out.println( "�绰�Ų���Ϊ��");
									}else{	
		Student student = new Student(userName, password, Integer.parseInt(dormBuildId), dormName, name, sex, tel);
		if(StringUtil.isNotEmpty(studentId)) {
			student.setStudentId(Integer.parseInt(studentId));
		}
		Connection con = null;
		try {
			con = dbUtil.getCon();
			int saveNum = 0;
			con = dbUtil.getCon();
			
					saveNum = StudentUpdate_stub.studentUpdate(con, student);
				//saveNum = studentDao.studentUpdate(con, student);
					
				if(saveNum > 0) {
					Student=true;
					} else {
						System.out.println( "�޸�ʧ��");
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
					}
					}
				}
			}
		}
	
}

	