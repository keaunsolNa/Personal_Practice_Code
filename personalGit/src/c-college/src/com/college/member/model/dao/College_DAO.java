package com.college.member.model.dao;

import static com.college.common.JDBCTemplate.close;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.college.member.model.dto.TB_ClassDTO;
import com.college.member.model.dto.TB_ProfessorDTO;
import com.college.member.model.dto.TB_StudentDTO;

public class College_DAO {

	private Properties prop = new Properties();
	private String coachProfessorName;
	private String studentName;
	
	public College_DAO() {
		
		try {
			prop.loadFromXML(new FileInputStream("mapper/college-query.xml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/*  학생 학번 체크용 DAO */
	public String checkStudentNo(Connection con, String inputStudent_no) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = prop.getProperty("checkStudentNo");
		String checkStudentNo = "";
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, inputStudent_no);
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				checkStudentNo = rset.getString("STUDENT_NO");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		return checkStudentNo;
	}
	
	/* 모든 교수 이름 조회용 DAO */
	public List<TB_ProfessorDTO> selectAllProfessorName(Connection con) {
		Statement stmt = null;
		ResultSet rset = null;
		
		List<TB_ProfessorDTO> professorDTO = new ArrayList<>();
		
		String query = prop.getProperty("selectAllProfessorName");
		
		try {
			stmt = con.createStatement();
			rset = stmt.executeQuery(query);
			
			while(rset.next()) {
				TB_ProfessorDTO professorName = new TB_ProfessorDTO();
				professorName.setName(rset.getString("PROFESSOR_NAME"));
				professorDTO.add(professorName);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(stmt);
		}
		return professorDTO;
	}
	
	/* 학번으로 학생 이름 조회용 DAO */
	public String selectStudentNameByNo(Connection con, String no) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = prop.getProperty("selectStudentNAmeByNo");
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, no);
			
			rset = pstmt.executeQuery();

			if(rset.next()) {
				studentName = rset.getString("STUDENT_NAME");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		return studentName;
	}
	
	
	/* 학번으로 수강 과목 조회용 DAO */
	public List<TB_ClassDTO> selectClassByNo(Connection con, String no) {
		PreparedStatement pstmt =null;
		ResultSet rset = null;
		
		List<TB_ClassDTO> classList = new ArrayList<>();
		
		String query = prop.getProperty("selectClassByNo");
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, no);
			
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				TB_ClassDTO classby = new TB_ClassDTO();
				classby.setName(rset.getString("CLASS_NAME"));
				classList.add(classby);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		return classList;
	}

	/* 학번으로 담당교수 조회용 DAO */
	public String selectCoachProfessorByNo(Connection con, String no) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = prop.getProperty("selectCoachProfessorNameByStudentNo");
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, no);
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				coachProfessorName = rset.getString("PROFESSOR_NAME");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return coachProfessorName;
	}

	/* 수강과목으로 동기 이름 조회용 DAO */
	public List<TB_StudentDTO> selectStudentNameByClassname(Connection con, String className) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = prop.getProperty("selectPeriodStudentNameByClassName");
		
		List<TB_StudentDTO> periodStudentName = new ArrayList();
		
		try {
			pstmt = con.prepareCall(query);
			pstmt.setString(1, className);
			
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				TB_StudentDTO studentName = new TB_StudentDTO();
				studentName.setName(rset.getString("STUDENT_NAME"));
				periodStudentName.add(studentName);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		return periodStudentName;
	}

	/* 지도교수 변경용 DAO. */
	public int updateCoachProfessor(Connection con, String professorName, String checkNo) {
		PreparedStatement pstmt = null;
		int result = 0;
		String query = prop.getProperty("updateCoachProfessorByName");
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, professorName);
			pstmt.setString(2, checkNo);
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}

	/*지도교수 변경용(지도교수번호로) DAO */
	public int updateCoachProfessorByNo(Connection con, String inputProfessorNo, String studentCheckNo) {
		PreparedStatement pstmt = null;
		int result = 0;
		String query = prop.getProperty("updateCoachProfessorByNo");
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, inputProfessorNo);
			pstmt.setString(2, studentCheckNo);
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return result;
	}

	/* 휴학용 DAO */
	public int updateAbsence(Connection con, String userinput, String studentCheckNo) {
		PreparedStatement pstmt = null;
		int result = 0;
		String query = prop.getProperty("updateAbsenceByNo");
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, userinput);
			pstmt.setString(2, studentCheckNo);
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return result;
	}
}