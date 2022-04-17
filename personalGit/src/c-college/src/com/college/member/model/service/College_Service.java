package com.college.member.model.service;

import static com.college.common.JDBCTemplate.close;
import static com.college.common.JDBCTemplate.commit;
import static com.college.common.JDBCTemplate.getConnection;
import static com.college.common.JDBCTemplate.rollback;

import java.sql.Connection;
import java.util.List;

import com.college.member.model.dao.College_DAO;
import com.college.member.model.dto.TB_ClassDTO;
import com.college.member.model.dto.TB_ProfessorDTO;
import com.college.member.model.dto.TB_StudentDTO;

public class College_Service {
	
	private College_DAO collegeDAO = new College_DAO();

	/* 전체 학번 조회용 Service */
	public String checkStudentNo(String inputStudent_no) {
		
		Connection con = getConnection();
		
		String studentNo = collegeDAO.checkStudentNo(con, inputStudent_no); 
		
		close(con);
			
		return studentNo;
	}
	
	/* 전체 교수 이름 조회용 Service */
	public List<TB_ProfessorDTO> selectAllProfessorName() {
		
		Connection con = getConnection();
		
		List<TB_ProfessorDTO> professorList = collegeDAO.selectAllProfessorName(con);
		
		close(con);
		
		return professorList;
	}
	
	/* 학번으로 학생 이름 조회용 Service */
	public String selectStudentNameByNo(String no) {
		
		Connection con = getConnection();
		
		String studentName = collegeDAO.selectStudentNameByNo(con, no);
		
		close(con);
		
		return studentName;
		
	}
	
	/* 학번으로 수강 과목 조회용 Service */
	public List<TB_ClassDTO> selectClassByNo(String no) {
		
		Connection con = getConnection();
		
		List<TB_ClassDTO> classList = collegeDAO.selectClassByNo(con, no);
		
		close(con);
		
		return classList;
	}

	/* 학번으로 담당 교수 조회용 Service */
	public String selectCoachProfessorByNo(String no) {

		Connection con = getConnection();
		
		String coachProfessorName = collegeDAO.selectCoachProfessorByNo(con, no);
		
		close(con);
		
		return coachProfessorName;
	}

	/* 수강과목 동기 이름 조회용 Service */
	public List<TB_StudentDTO> selectStudentNameOfClassName(String className) {

		Connection con = getConnection();
		
		List<TB_StudentDTO> periodStudentName = collegeDAO.selectStudentNameByClassname(con, className);
		
		close(con);
		
		return periodStudentName;
	}


	/* 지도 교수 이름으로 변경용 Service */
	public int updateCoachProfessor(String professorName, String checkNo) {

		Connection con = getConnection();
		int result = 0;
		
		int updateCoachProfessor = collegeDAO.updateCoachProfessor(con, professorName, checkNo);
		
		if (updateCoachProfessor > 0) {
			commit(con);
			result = 1;
		} else {
			rollback(con);
		}
		close(con);
		
		return result;
	}

	/* 지도 교수 교수번호로 변경용 Service */
	public int updateCoachProfessorByNo(String inputProfessorNo, String studentCheckNo) {
		
		Connection con = getConnection();
		int result = 0;
		
		int updateCoachprofessor = collegeDAO.updateCoachProfessorByNo(con, inputProfessorNo, studentCheckNo);
		
		if(updateCoachprofessor > 0) {
			commit(con);
			result = 1;
		} else {
			rollback(con);
		}
		close(con);
		
		return result;
	}

	/* 휴학 처리용 Service */
	public int updateabsence(String userinput, String studentCheckNo) {
		
		Connection con = getConnection();
		int result = 0;
		
		int updateAbsence = collegeDAO.updateAbsence(con, userinput, studentCheckNo);
		
		if(updateAbsence > 0) {
			commit(con);
			result = 1;
		} else {
			rollback(con);
		} 
		close(con);
		
		return result;
		
	}
}
