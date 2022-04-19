package com.school.member.model.service;

import java.sql.Connection;
import java.util.Map;

import com.school.member.model.dao.School_DAO;

import static com.school.common.JDBCTemplate.getConnection;
import static com.school.common.JDBCTemplate.close;

public class School_Service {

	private School_DAO sd = new School_DAO();

	public int login(Map<String, String> login) {

		Connection con = getConnection();
		
		int result = sd.login(con, login);
		
		close(con);
		
		return result;
	}
}
