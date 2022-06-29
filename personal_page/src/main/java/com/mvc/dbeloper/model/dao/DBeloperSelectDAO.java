package com.mvc.dbeloper.model.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import com.mvc.dbeloper.model.dto.DBeloperMemberDTO;

import static com.mvc.common.jdbc.JDBCTemplate.close;



public class DBeloperSelectDAO {

	private Properties prop;

	public DBeloperSelectDAO() {
		prop = new Properties();
		
		try {
			prop.loadFromXML(new FileInputStream("C:\\Study\\personal_Project\\personal_page\\web\\WEB-INF\\mapper\\Select.xml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String selectLoginByIdAndPwd(Connection con, String id, String password) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = prop.getProperty("loginMember");
		String userName = "";
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, id);
			
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				userName = rset.getString("MEM_PWD");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rset);
			
		}
		
		return userName;
	}

}
