package com.school.member.view;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.school.member.controller.School_Controller;

public class School_Main_View {

	private School_Result_View srv = new School_Result_View();
	private School_Controller sct = new School_Controller();
	
	private Scanner sc = new Scanner(System.in);
	
	public void mainView() {
		
		do {
			System.out.println("DB고등학교에 오신 것을 환영합니다.");
			System.out.println("원하시는 메뉴를 고르세요.");
			System.out.println("성적조회 등의 메뉴는 로그인이 필요합니다.");
			System.out.println("1. 학교 소개");
			System.out.println("2. 오시는 길");
			System.out.println("3. 교직원 조회");
			System.out.println("4. 로그인");
			System.out.print("9. 프로그램 종료");
			int userinput = sc.nextInt();

			switch(userinput) {
				case 1: srv.schoolinfo(); break;
				case 2: srv.schoolDirections(); break;
				case 3: srv.teacherInfo(); break;
				case 4: login(); break;
				case 9: return;
			}
		} while (true);
	}
	
	/* 입력받은 정보로 student, teacher에 로그인. 각각 1,2,3 반환 */
	public void login(){
		sc.nextLine();
		System.out.print("ID를 입력하세요 : ");
		String id = sc.nextLine();
		System.out.print("PWD를 입력하세요 : ");
		String pwd = sc.nextLine();
		Map<String, String> login = new HashMap<>();
		login.put("ID", id);
		login.put("PWD", pwd);
		
		sct.login(login);
		
	}
}
