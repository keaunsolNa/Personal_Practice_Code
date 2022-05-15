package com.mvc.dbeloper.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc.dbeloper.model.dto.DBeloperMemberDTO;
import com.mvc.dbeloper.model.service.DBeloperService;

@WebServlet("/dbeloper/select/Account")
public class AuuountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("/WEB-INF/views/main/account.jsp").forward(request, response);

		String name = (String) request.getParameter("name");
		String userId = (String) request.getParameter("userId");
		String pwd = (String) request.getParameter("password");
		String phone = (String) request.getParameter("phone");
		String address = (String) request.getParameter("address");
		
		DBeloperMemberDTO accountMember = new DBeloperMemberDTO();
		
		accountMember.setMemName(name);
		accountMember.setMemId(userId);
		accountMember.setMemPwd(pwd);
		accountMember.setMemAddress(address);
		accountMember.setMemPhone(phone);
		
		DBeloperService accountService = new DBeloperService();
		int accountMemberName = accountService.accountMember(accountMember);
		System.out.println("가입 성공 여부 : " + accountMemberName);
	}

}
