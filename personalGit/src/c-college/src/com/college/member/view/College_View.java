package com.college.member.view;

import java.io.FileOutputStream;
import java.util.Scanner;

import com.college.member.controller.College_Controller;
import com.college.member.model.service.College_Service;

public class College_View {

	private Scanner sc = new Scanner(System.in);
	private College_Service collegeService = new College_Service();
	private College_Result_View collegeResultView = new College_Result_View();
	
	public void display_menu() {
		
		College_Controller collegeController = new College_Controller();
		
		System.out.println("통합관리 시스템에 오신 것을 환영합니다.");
		System.out.print("로그인을 위해 학번을 입력해 주세요.");
		String studentNo = sc.nextLine().toUpperCase();
		
		String studentCheckNo = collegeController.checkStudentNo(studentNo);
		String studentName = collegeController.selectStudentNameByNo(studentCheckNo);
		
		if(studentCheckNo.isEmpty()) {
			System.out.println("일차하는 학번이 없습니다.");
			return;
		} else
			System.out.println("로그인에 성공하셨습니다.");
		do {
			System.out.println("◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆");
			System.out.println("◆	환영합니다, "+studentName+"님	 ◆");
			System.out.println("◆	통합 관리 시스템	 ◆");
			System.out.println("◆			 ◆");
			System.out.println("◆	1.수강 과목 조회     ◆");
			System.out.println("◆			 ◆");
			System.out.println("◆ 	2.지도 교수 조회	 ◆");
			System.out.println("◆			 ◆");
			System.out.println("◆ 	3.동기 이름 조회	 ◆");
			System.out.println("◆			 ◆");
			System.out.println("◆	4.지도 교수 변경     ◆");
			System.out.println("◆			 ◆");
			System.out.println("◆	5.휴학     신청     ◆");
			System.out.println("◆			 ◆");
			System.out.println("◆			 ◆");
			System.out.println("◆			 ◆");
			System.out.println("◆			 ◆");
			System.out.println("◆			 ◆");
			System.out.println("◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆");
			
			System.out.println();
			System.out.print("조회하시고 싶은 메뉴를 정수로 입력하세요.");
			int no = sc.nextInt();
			
			switch(no) {
				case 1 : collegeController.selectClassByNo(studentCheckNo); break; 
				case 2 : collegeController.selectProfessorByNo(studentCheckNo);break;
				case 3 : collegeController.selectPeriodByNo(inputClassName(), studentCheckNo); break;
				case 4 : collegeController.updateCoachProfessor(inputProfessorName(), studentCheckNo); break;
				case 5 : collegeController.updateAbsence(inputabsence(), studentCheckNo); break;
			}
		} while(true);
		
	}
	
	public String inputClassName() {
		
		System.out.print("수강과목의 이름을 입력하세요. ");
		sc.nextLine();
		
		return sc.nextLine();
	}
	
	public String inputProfessorName() {
		
		System.out.println("변경하려는 지도교수의 이름을 입력하세요.");
		sc.nextLine();
		String professorName = sc.nextLine();
		
		return professorName;
	}

	public String inputProfessorNo() {
		System.out.println("지도교수의 교수 번호를 입력하세요");
		sc.nextLine();
		String professorNo = sc.nextLine();
		return professorNo;
	}
	
	public String inputabsence() {
		System.out.println("정말로 휴학하시겠습니까?");
		System.out.println("\"휴학하겠습니다\"" + "를 정자로 입력하세요");
		sc.nextLine();
		String userinput = sc.nextLine();
		return userinput;
	}
}
