package com.college.member.view;

import java.util.List;

import com.college.member.model.dto.TB_ClassDTO;
import com.college.member.model.dto.TB_StudentDTO;

public class College_Result_View {

	/* 오류용 Result View */
	public void displayResult(String code) {
		
		switch(code) {
			case "selectClassByIdFailed" : System.out.println("수강하고 있는 과목이 없습니다."); break;
			case "selectFailedById" : System.out.println("학번이 잘못된 것 같습니다."); return;
			case "selectFailedByClass" : System.out.println("수강 중인 과목이 아닙니다."); break;
			case "selectCoachProfessorByIdFailed" : System.out.println("담당 교수가 없습니다."); break;
			case "selectFailedProfessorName" : System.out.println("해당하는 교수이름이 없습니다."); return;
			case "duplicateProfessorName" : System.out.println("동명이인인 교수님이 존재합니다. 교수 번호를 입력하세요"); break;
			case "UpdateSucess" : System.out.println("지도교수 변경 성공"); break;
			case "UpdateFailed" : System.out.println("지도교수 변경 실패"); break;
			case "AbsenceSucess" :System.out.println("휴학처리가 완료되었습니다."); break;
			case "AbsenceFiled" : System.out.println("휴학처리가 진행되지 않았습니다."); break;
			case "retryAbsence" : System.out.println("정자로 다시 입력해주세요."); break;
		}
	}
	
	/* 학번으로 수강 과목 조회 Result View */
	public void display(List<TB_ClassDTO> list) {
		System.out.println("신청과목은 아래와 같습니다.");
		System.out.println();
		for(TB_ClassDTO m : list) {
			System.out.println(m.getName());
		}
		System.out.println();
	}
	
	/* 학번으로 담당 교수 조회 Result View */
	public void displaycp(String name) {
		System.out.println("현재 지도교수의 이름은 "+ name + "교수님입니다.");
	}
	
	/* 수강과목으로 동기 이름 조회 Result View */
	public void displayPeriodName(List<TB_StudentDTO> list) {
		System.out.println("동기들의 이름은 아래와 같습니다.");
		System.out.println();
		for(TB_StudentDTO m : list) {
			System.out.println(m.getName());
		}
		System.out.println();
	}
}
