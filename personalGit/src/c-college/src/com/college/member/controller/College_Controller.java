package com.college.member.controller;

import com.college.member.model.dto.TB_ClassDTO;
import com.college.member.model.dto.TB_ProfessorDTO;
import com.college.member.model.service.College_Service;
import com.college.member.view.College_Result_View;
import com.college.member.view.College_View;

public class College_Controller {

	private College_Service collegeService = new College_Service();
	private College_Result_View collegeResultView = new College_Result_View();
	private College_View collegeView = new College_View();
	
	/* 학번을 이용한 로그인 기능용 Controller */
	public String checkStudentNo(String inputStudent_no) {

		/* 목록에 있는지 체크 */
		String Student_no  = collegeService.checkStudentNo(inputStudent_no);
		if(Student_no.isEmpty()) {
			collegeResultView.displayResult("selectFailedById");
		}
		return Student_no;
	}
	
	/* 학생 이름 조회용 Controller */
	public String selectStudentNameByNo(String studentCheckNo) {
		String studentName = collegeService.selectStudentNameByNo(studentCheckNo);
		
		return studentName;
	}
	
	/* 학번으로 수강과목 조회용 Controller */
	public void selectClassByNo(String no) {
	
		if(collegeService.selectClassByNo(no).isEmpty()) {
			collegeResultView.displayResult("selectClassByIdFailed");
		} else {
			collegeResultView.display(collegeService.selectClassByNo(no));
		}
	}

	/* 학번으로 담당교수 조회용 Controller */
	public void selectProfessorByNo(String Student_no) {
		
		if(collegeService.selectCoachProfessorByNo(Student_no) == null) {
			collegeResultView.displayResult("selectCoachProfessorByIdFailed");
		} else {
			collegeResultView.displaycp(collegeService.selectCoachProfessorByNo(Student_no));
		}
	}

	/* 학번으로 수강과목 동기 조회용 Controller */
	public void selectPeriodByNo(String inputClassName, String studentCheckNo) {
		
		/* 목록에 있는지 체크 */
		String className = "";
		for(int i = 0; i < collegeService.selectClassByNo(studentCheckNo).size(); i++) {
			TB_ClassDTO class_name = collegeService.selectClassByNo(studentCheckNo).get(i);
			if(class_name.getName().equals(inputClassName)) {
				className = class_name.getName();
				break;
			} 
		}
		
		if(className.isEmpty()) {
			collegeResultView.displayResult("selectFailedByClass");
		} else {
			collegeResultView.displayPeriodName(collegeService.selectStudentNameOfClassName(className));
		}	
	}

	/* 지도교수 변경용 Controller */
	public void updateCoachProfessor(String inputProfessorName, String studentCheckNo) {
		
		/* 결과받을 변수 */
		int result = 0;
		
		/* 목록에 있는지 체크 / 동명이인 방지 */
		String professorName = "";
		int j = 0;
		for(int i = 0; i < collegeService.selectAllProfessorName().size(); i++) {
			TB_ProfessorDTO professor_name = collegeService.selectAllProfessorName().get(i);
			if(professor_name.getName().equals(inputProfessorName)) {
				professorName = professor_name.getName();
				j++;
			}
		}
		if(professorName.isEmpty()) {
			collegeResultView.displayResult("selectFailedProfessorName");
		} else if(j>1) {
			collegeResultView.displayResult("duplicateProfessorName");
				String inputProfessorNo = collegeView.inputProfessorNo();
					result = collegeService.updateCoachProfessorByNo(inputProfessorNo, studentCheckNo);
					if(result > 0) {
						collegeResultView.displayResult("UpdateSucess");
					} else {
						collegeResultView.displayResult("UpdateFailed");
					}
		} else {
			result = collegeService.updateCoachProfessor(professorName, studentCheckNo);
			System.out.println(result);
			if(result > 0) {
				collegeResultView.displayResult("UpdateSucess");
				
			} else {
				collegeResultView.displayResult("UpdateFailed");
			}
		}  
	}

	/* 휴학 신청용 Controller */
	public void updateAbsence(String inputabsence, String studentCheckNo) {
		
		int result = 0;
		if (inputabsence.equals("휴학하겠습니다")) {
			String userinput = "Y";
			result = collegeService.updateabsence(userinput, studentCheckNo);
			if(result > 0) {
				collegeResultView.displayResult("AbsenceSucess");
			} else {
				collegeResultView.displayResult("AbsenceFiled");
			}
		} else {
			System.out.println("확인실패");
			collegeResultView.displayResult("retryAbsence");
			return;
		}
	}
}
