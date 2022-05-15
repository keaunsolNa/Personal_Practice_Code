package com.mvc.dbeloper.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.mvc.dbeloper.model.dto.DBeloperMemberDTO;
import com.mvc.dbeloper.model.service.DBeloperService;

@WebServlet("/dbeloper/select/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String Id = request.getParameter("id");
		String password = request.getParameter("password");
		
		System.out.println("ID : " + Id);
		System.out.println("pass: " + password );
	
		DBeloperService dbeloperService = new DBeloperService();
		String selectLoginMember = dbeloperService.selectLoginByIdAndPassword(Id, password);
		
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		System.out.println("암호화된 비밀번호 일치 여부 확인" + passwordEncoder.matches(password, selectLoginMember));
	}

}
