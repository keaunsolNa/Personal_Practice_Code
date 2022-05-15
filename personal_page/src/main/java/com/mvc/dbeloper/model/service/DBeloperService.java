package com.mvc.dbeloper.model.service;

import static com.mvc.common.jdbc.JDBCTemplate.close;

import java.sql.Connection;

import com.mvc.common.jdbc.JDBCTemplate;
import com.mvc.dbeloper.model.dao.DBeloperInsertDAO;
import com.mvc.dbeloper.model.dao.DBeloperSelectDAO;
import com.mvc.dbeloper.model.dto.DBeloperMemberDTO;;

public class DBeloperService {

	private DBeloperSelectDAO loginDAO;
	
	public DBeloperService() {
		loginDAO = new DBeloperSelectDAO();
	}

	public String selectLoginByIdAndPassword(String id, String password) {
		
		Connection con = JDBCTemplate.getConnection();
		DBeloperSelectDAO loginDAO = new DBeloperSelectDAO();
		String selectLoginMember = loginDAO.selectLoginByIdAndPwd(con, id, password);
		
		close(con);
		
		
		return selectLoginMember;
	}

	public int accountMember(DBeloperMemberDTO accountMember) {

		Connection con = JDBCTemplate.getConnection();
		DBeloperInsertDAO accountDAO = new DBeloperInsertDAO();
		int accountMemberName = accountDAO.accountMember(con, accountMember);
		
		close(con);
		return accountMemberName;
	}

}
