package com.school.member.view;

import java.util.Scanner;

public class School_Main_View {

	private School_Teacher_View stv = new School_Teacher_View();  
	private School_Student_View ssv = new School_Student_View();
	private School_Parent_View spv = new School_Parent_View();
	private School_Nonmember_View snv = new School_Nonmember_View();
	private Scanner sc = new Scanner(System.in);
	
	public void mainView() {
		System.out.println("DB고등학교에 오신 것을 환영합니다.");
		System.out.println("성적 조회, 담임선생님 정보, ");
	}

		

}
