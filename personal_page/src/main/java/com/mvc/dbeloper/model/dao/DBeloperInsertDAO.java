package com.mvc.dbeloper.model.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import com.mvc.dbeloper.model.dto.DBeloperMemberDTO;

import static com.mvc.common.jdbc.JDBCTemplate.close;

public class DBeloperInsertDAO {

	private Properties prop;

	public DBeloperInsertDAO() {
		prop = new Properties();
		
		try {
			prop.loadFromXML(new FileInputStream("C:\\Study\\personal_Project\\personal_page\\web\\WEB-INF\\mapper\\Select.xml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/* 회원 가입 */
	public int accountMember(Connection con, DBeloperMemberDTO accountMember) {
		
		PreparedStatement pstmt = null;
		int result = 0;

		String query = prop.getProperty("InsertMember");
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, accountMember.getMemName());
			pstmt.setString(2, accountMember.getMemPhone());
			pstmt.setString(3, accountMember.getMemAddress());
			pstmt.setString(4, accountMember.getMemId());
			pstmt.setString(5, accountMember.getMemPwd());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		
		return result;
	}

}
