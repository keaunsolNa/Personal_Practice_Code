package com.school.member.controller;

import java.util.Map;

import com.school.member.model.service.School_Service;
import com.school.member.view.School_Parent_View;
import com.school.member.view.School_Result_View;
import com.school.member.view.School_Student_View;
import com.school.member.view.School_Teacher_View;
public class School_Controller {

	private School_Teacher_View stv = new School_Teacher_View();  
	private School_Student_View ssv = new School_Student_View();
	private School_Parent_View spv = new School_Parent_View();
	private School_Result_View srv = new School_Result_View();
	private School_Service sc = new School_Service();

	public void login(Map<String, String> login) {
		
		int result = sc.login(login);
		
		if(result == 1) {
			ssv.mainView();
		} else if (result == 2) {
			stv.mainView();
		} else if (result == 3) {
			spv.mainView();
		} else {
			srv.loginfailed();
		}
		
	}
}
